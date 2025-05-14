package myLang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
/**
 * EvalVisitor: visita l’albero sintattico e ne valuta
 * i nodi, memorizzando le variabili in una mappa.
 */
public class EvalVisitor extends GrammaticaBaseVisitor<Object> {

    // Mappa per variabili: nome → valore
    private Map<String, Object> memory = new HashMap<>();

    // Generatore Random per ND ( non determinismo )
    private final Random rnd = new Random();

    // eccezione interna per gestire il return
    private static class ReturnValue extends RuntimeException {
        final Object value;
        ReturnValue(Object v) { super(null, null, false, false); value = v; }
    }
    @Override
    public Object visitWhileStmt(GrammaticaParser.WhileStmtContext ctx) {
        // Valuta la condizione
        Object condVal = visit(ctx.expr());
        // Continua a ciclare finché la condizione è "true" (non-zero)
        while (toNumber(condVal) != 0) {
            // Visita tutti gli statement all'interno del blocco
            for (GrammaticaParser.StatementContext st : ctx.block().statement()) {
                visit(st);
            }
            // Rivaluta la condizione ad ogni iterazione
            condVal = visit(ctx.expr());
        }
        return null;  // i cicli non restituiscono un valore
    }

    /**
     * forStmt: 'for' '(' forInit? ';' expr? ';' expr? ')' block
     */
    @Override
    public Object visitForStmt(GrammaticaParser.ForStmtContext ctx) {
        // 1) INIT (var x=... oppure x=...)
        if (ctx.forInit() != null) {
            visit(ctx.forInit());
        }

        // 2) Prepara il corpo del ciclo
        List<GrammaticaParser.StatementContext> body = ctx.block().statement();

        // 3) Loop principale
        while (true) {
            // 3a) condizione: ctx.expr() restituisce ExprContext o null
            boolean condTrue = true;
            GrammaticaParser.ExprContext condCtx = ctx.expr();
            if (condCtx != null) {
                double cond = toNumber(visit(condCtx));
                condTrue = (cond != 0);
            }
            if (!condTrue) break;

            // 3b) esegui il corpo
            for (var st : body) {
                visit(st);
            }

            // 3c) update: visita forUpdate se presente
            if (ctx.forUpdate() != null) {
                visit(ctx.forUpdate());
            }
        }

        return null;
    }

    /**
     * forInit: 'var' ID '=' expr | ID '=' expr
     */
    @Override
    public Object visitForInit(GrammaticaParser.ForInitContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        memory.put(id, value);
        return null;
    }

    /**
     * forUpdate: ID '=' expr
     */
    @Override
    public Object visitForUpdate(GrammaticaParser.ForUpdateContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        memory.put(id, value);
        return null;
    }

    /**
     * arrayAccess: ID '[' expr ']'    // x[ i ]
     */
    @Override
    public Object visitArrayAccess(GrammaticaParser.ArrayAccessContext ctx) {
        String id = ctx.ID().getText();
        Object arrObj = memory.get(id);
        if (!(arrObj instanceof List<?>)) {
            throw new RuntimeException("Variabile '" + id + "' non è un array");
        }
        @SuppressWarnings("unchecked")
        List<Object> array = (List<Object>) arrObj;
        int index = (int) toNumber(visit(ctx.expr()));
        if (index < 0 || index >= array.size()) {
            throw new RuntimeException("Indice " + index + " fuori intervallo per array '" + id + "'");
        }
        return array.get(index);
    }

    /**
     * assignStmt: ( ID | ID '[' expr ']' ) '=' expr ';'
     * Gestisce sia x = v che x[i] = v
     */
    @Override
    public Object visitAssignStmt(GrammaticaParser.AssignStmtContext ctx) {
        List<GrammaticaParser.ExprContext> exprs = ctx.expr();
        String id = ctx.ID().getText();

        if (exprs.size() == 2) {
            // array assignment: x[index] = value
            int index = (int) toNumber(visit(exprs.get(0)));
            Object value = visit(exprs.get(1));

            // Recupera l'oggetto in memoria
            Object stored = memory.get(id);
            List<Object> array;
            if (stored instanceof List<?>) {
                // è già un array
                @SuppressWarnings("unchecked")
                List<Object> tmp = (List<Object>) stored;
                array = tmp;
            } else {
                // non era una lista: ne creo una nuova
                array = new ArrayList<>();
            }

            // Allungo la lista se serve
            while (array.size() <= index) {
                array.add(0); // default 0
            }
            array.set(index, value);

            // Salvo la lista in memoria (sovrascrive eventuale vecchio scalar)
            memory.put(id, array);
        } else {
            // simple assignment: x = expr
            Object value = visit(exprs.get(0));
            memory.put(id, value);
        }
        return null;
    }


    /**
     * ifStmt: 'if' '(' expr ')' block ( 'else' block )?
     */
    @Override
    public Object visitIfStmt(GrammaticaParser.IfStmtContext ctx) {
        // 1) valuta la condizione
        double cond = toNumber(visit(ctx.expr()));
        if (cond != 0) {
            // vero: esegui il primo block
            for (GrammaticaParser.StatementContext st : ctx.block(0).statement()) {
                visit(st);
            }
        } else if (ctx.block().size() > 1) {
            // falso ed esiste un blocco "else": esegui il secondo
            for (GrammaticaParser.StatementContext st : ctx.block(1).statement()) {
                visit(st);
            }
        }
        return null;
    }


    /**
     * concatExpr: expr '++' expr
     * Esegue la concatenazione di due valori:
     * converte entrambi in stringa e li unisce.
     */
    @Override
    public Object visitConcatExpr(GrammaticaParser.ConcatExprContext ctx) {
        // Valuta i due operandi
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        // Converte in stringa e unisce
        return left.toString() + right.toString();
    }

    /**
     * VarDecl: 'var' ID '=' expr ';'
     */
    @Override
    public Object visitVarDecl(GrammaticaParser.VarDeclContext ctx) {
        String id = ctx.ID().getText();
        // ctx.expr() restituisce 1 solo per scalar, 2 per array
        List<GrammaticaParser.ExprContext> exprs = (List<GrammaticaParser.ExprContext>) ctx.expr();
        if (ctx.getChildCount() == 5) {
            // var x = expr ;
            // childCount: ['var', ID, '=', expr, ';']
            Object value = visit(exprs.get(0));
            memory.put(id, value);
        } else {
            // var x [ idx ] = expr ;
            // childCount: ['var', ID, '[', expr, ']', '=', expr, ';']
            int idx = (int) toNumber(visit(exprs.get(0)));
            Object v  = visit(exprs.get(1));
            // costruisci o estendi l'array
            List<Object> arr = new ArrayList<>();
            while (arr.size() <= idx) arr.add(0);
            arr.set(idx, v);
            memory.put(id, arr);
        }
        return null;
    }

    /**
     * PrintStmt: 'print' '(' expr ')' ';'
     */
    @Override
    public Object visitPrintStmt(GrammaticaParser.PrintStmtContext ctx) {
        Object value = visit(ctx.expr());       // valuta espressione
        System.out.println(value);              // stampa su console
        return null;
    }

    // ← Mancava completamente la gestione degli statement di tipo exprStmt.

    /**
     * ExprStmt: expr ';'
     */
    @Override
    public Object visitExprStmt(GrammaticaParser.ExprStmtContext ctx) {
        // Semplicemente valuta l’espressione,
        // ma non la stampa (non è un printStmt)
        return visit(ctx.expr());
    }

    /**
     * AddExpr: expr '+' expr
     */
    @Override
    public Object visitAddExpr(GrammaticaParser.AddExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        // se entrambi Integer, restituisci Integer
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l + (Integer) r;
        }
        // altrimenti fai operazione in double
        return toNumber(l) + toNumber(r);
    }

    /**
     * SubExpr: expr '-' expr
     */
    @Override
    public Object visitSubExpr(GrammaticaParser.SubExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l - (Integer) r;
        }
        return toNumber(l) - toNumber(r);
    }

    /**
     * MulExpr: expr '*' expr
     */
    @Override
    public Object visitMulExpr(GrammaticaParser.MulExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l * (Integer) r;
        }
        return toNumber(l) * toNumber(r);
    }

    /**
     * ModExpr: expr '%' expr
     */
    @Override
    public Object visitModExpr(GrammaticaParser.ModExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l % (Integer) r;
        }
        return toNumber(l) % toNumber(r);
    }

    /**
     * DivExpr: expr '/' expr
     */
    @Override
    public Object visitDivExpr(GrammaticaParser.DivExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l / (Integer) r;
        }
        return toNumber(l) / toNumber(r);
    }

    /**
     * PowExpr: expr '^' expr
     */
    @Override
    public Object visitPowExpr(GrammaticaParser.PowExprContext ctx) {
        return Math.pow(
                toNumber(visit(ctx.expr(0))),
                toNumber(visit(ctx.expr(1)))
        );
    }

    /**
     * UnaryMinus: '-' expr
     */
    @Override
    public Object visitUnaryMinus(GrammaticaParser.UnaryMinusContext ctx) {
        return -toNumber(visit(ctx.expr()));
    }

    /**
     * ParensExpr: '(' expr ')'
     */
    @Override
    public Object visitParensExpr(GrammaticaParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }

    /**
     * IntExpr: INT
     */
    @Override
    public Object visitIntExpr(GrammaticaParser.IntExprContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    /**
     * FloatExpr: FLOAT
     */
    @Override
    public Object visitFloatExpr(GrammaticaParser.FloatExprContext ctx) {
        return Double.parseDouble(ctx.FLOAT().getText());
    }

    /**
     * StringExpr: STRING
     */
    @Override
    public Object visitStringExpr(GrammaticaParser.StringExprContext ctx) {
        // togli le virgolette iniziali/finali
        String text = ctx.STRING().getText();
        return text.substring(1, text.length() - 1);
    }

    /**
     * IdExpr: ID
     */
    @Override
    public Object visitIdExpr(GrammaticaParser.IdExprContext ctx) {
        String id = ctx.ID().getText();
        // se non esiste, restituisci 0 per convenzione
        return memory.getOrDefault(id, 0);
    }

    /**
     * InputExpr: 'input' '(' ')'
     */
    @Override
    public Object visitInputExpr(GrammaticaParser.InputExprContext ctx) {
        // esempio: usa Scanner per leggere da console
        System.out.print("> ");
        return new java.util.Scanner(System.in).nextDouble();
    }

    /**
     * StrExpr: 'str' '(' expr ')'
     */
    @Override
    public Object visitStrExpr(GrammaticaParser.StrExprContext ctx) {
        Object val = visit(ctx.expr());
        return val.toString();
    }

    /**
     * Helper: assicura un risultato numerico
     */
    private double toNumber(Object obj) {
        if (obj instanceof Integer) return ((Integer) obj).doubleValue();
        if (obj instanceof Double) return (Double) obj;
        throw new RuntimeException("Non è un numero: " + obj);
    }

    @Override
    public Object visitLtExpr(GrammaticaParser.LtExprContext ctx) {
        double l = toNumber(visit(ctx.expr(0)));
        double r = toNumber(visit(ctx.expr(1)));
        return l < r ? 1 : 0;
    }

    @Override
    public Object visitGtExpr(GrammaticaParser.GtExprContext ctx) {
        double l = toNumber(visit(ctx.expr(0)));
        double r = toNumber(visit(ctx.expr(1)));
        return l > r ? 1 : 0;
    }

    @Override
    public Object visitLeExpr(GrammaticaParser.LeExprContext ctx) {
        double l = toNumber(visit(ctx.expr(0)));
        double r = toNumber(visit(ctx.expr(1)));
        return l <= r ? 1 : 0;
    }

    @Override
    public Object visitGeExpr(GrammaticaParser.GeExprContext ctx) {
        double l = toNumber(visit(ctx.expr(0)));
        double r = toNumber(visit(ctx.expr(1)));
        return l >= r ? 1 : 0;
    }

    @Override
    public Object visitEqExpr(GrammaticaParser.EqExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        // confronto stringhe o numeri
        if (l instanceof String || r instanceof String) {
            return l.toString().equals(r.toString()) ? 1 : 0;
        }
        return toNumber(l) == toNumber(r) ? 1 : 0;
    }

    @Override
    public Object visitNeExpr(GrammaticaParser.NeExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof String || r instanceof String) {
            return !l.toString().equals(r.toString()) ? 1 : 0;
        }
        return toNumber(l) != toNumber(r) ? 1 : 0;
    }

    /**
     * nonDetStmt: block 'ND' '[' statement ']'
     * Esegue una sola scelta casuale tra i due rami:
     *  - visit(ctx.block())     // primo ramo
     *  - visit(ctx.statement()) // secondo ramo (dentro [...])
     */
    @Override
    public Object visitNonDetStmt(GrammaticaParser.NonDetStmtContext ctx) {
        if (rnd.nextBoolean()) {
            // branch 1: esegue il blocco { ... }
            visit(ctx.block());
        } else {
            // branch 2: esegue lo statement dentro [ ... ]
            visit(ctx.statement());
        }
        // Terminata la scelta, non ripete più nulla
        return null;
    }

    @Override
    public Object visitFunDecl(GrammaticaParser.FunDeclContext ctx) {
        String name = ctx.ID().getText();
        FunctionRegistry.register(name, ctx);
        return null; // non esegue subito il corpo
    }

    @Override
    public Object visitRetStmt(GrammaticaParser.RetStmtContext ctx) {
        Object v = visit(ctx.expr());
        throw new ReturnValue(v);
    }

    @Override
    public Object visitCallExpr(GrammaticaParser.CallExprContext ctx) {
        String name = ctx.ID().getText();
        // Recupera la dichiarazione dalla registry
        GrammaticaParser.FunDeclContext fctx = FunctionRegistry.lookup(name);
        if (fctx == null) {
            throw new RuntimeException("Funzione non definita: " + name);
        }

        // Salva l'ambiente corrente e creane uno nuovo (scope locale)
        Map<String,Object> oldMemory = memory;
        memory = new HashMap<>();

        Object result = null;
        try {
            // Esegui il body della funzione (visit del suo block)
            visit(fctx.block());
        } catch (ReturnValue rv) {
            // Cattura il valore di return
            result = rv.value;
        }

        // Ripristina l'ambiente chiamante
        memory = oldMemory;
        return result;
    }

    @Override
    public Object visitSlyStmt(GrammaticaParser.SlyStmtContext ctx) {
        // Prendo l'intero testo del token SLYSTMT
        String text = ctx.SLYSTMT().getText();
        // Estraggo il codice tra '{' e '}'
        int start = text.indexOf('{') + 1;
        int end   = text.lastIndexOf('}');
        String bfCode = text.substring(start, end);
        try {
            BrainfuckInterpreter.run(bfCode, System.in, System.out);
        } catch (IOException e) {
            throw new RuntimeException("Errore durante esecuzione Brainfuck", e);
        }
        return null;
    }
}
