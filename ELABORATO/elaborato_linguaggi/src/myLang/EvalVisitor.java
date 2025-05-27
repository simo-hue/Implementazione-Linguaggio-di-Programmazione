package myLang;

import java.util.*;

/**
 * EvalVisitor: visita l’albero sintattico e ne valuta
 * i nodi, memorizzando le variabili in una mappa.
 */
public class EvalVisitor extends GrammaticaParserBaseVisitor<Object> {

    private final java.util.Scanner scanner = new java.util.Scanner(System.in);

    private final Deque<Set<String>> declaredStack = new ArrayDeque<>();

    private final Deque<Map<String,Object>> callStack = new ArrayDeque<>();
    {
        callStack.push(new HashMap<>()); // ambiente globale
    }

    private Map<String, Object> currentScope() {
        return callStack.peek();
    }

    private void declareVariable(String name, Object value) {
        currentScope().put(name, value);
        if (!declaredStack.isEmpty()) {
            declaredStack.peek().add(name);
        }
    }
    private Object getVariable(String name) {
        for (Map<String, Object> scope : callStack) {
            if (scope.containsKey(name)) return scope.get(name);
        }
        return 0; // valore default per variabili non inizializzate
    }

    private void setVariable(String name, Object value) {
        for (Map<String, Object> scope : callStack) {
            if (scope.containsKey(name)) {
                scope.put(name, value);
                return;
            }
        }
        currentScope().put(name, value); // nuova variabile nello scope corrente
    }

    private final Map<String, GrammaticaParser.FunDeclContext> functions = new HashMap<>();


    // Generatore Random per ND ( non determinismo )
    private final Random rnd = new Random();


    /**
     * ReturnValue è un’eccezione interna usata solo per
     * interrompere immediatamente l’esecuzione del corpo di una funzione
     * non appena incontriamo una retStmt, e trasportare il valore di ritorno.
     */
    private static class ReturnValue extends RuntimeException {
        final Object value; // valore passato al RETURN
        ReturnValue(Object v) { super(null, null, false, false); value = v; }
    }
    @Override
    public Object visitWhileStmt(GrammaticaParser.WhileStmtContext ctx) {
        // Valuta la condizione
        Object condVal = visit(ctx.expr());
        // Continua a ciclare finché la condizione è "true" (non-zero)
        while (toNumber(condVal) != 0) {
            // Visita tutti gli statement all'interno del blocco per eseguirli
            for (GrammaticaParser.StatementContext st : ctx.block().statement()) {
                visit(st);
            }
            // Rivaluta la condizione ad ogni iterazione prima del controllo
            condVal = visit(ctx.expr());
        }
        return null;  // i cicli non restituiscono un valore
    }

    private void syncWithGlobal(Map<String, Object> newScope) {
        Map<String, Object> globalScope = callStack.getLast();
        Set<String> declaredLocally = declaredStack.pop();

        for (Map.Entry<String, Object> entry : newScope.entrySet()) {
            String var = entry.getKey();
            if (globalScope.containsKey(var) && !declaredLocally.contains(var)) {
                globalScope.put(var, entry.getValue());
            }
        }
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
            // condizione: ctx.expr() restituisce ExprContext o null
            boolean condTrue = true;
            GrammaticaParser.ExprContext condCtx = ctx.expr();
            if (condCtx != null) {
                float cond = toNumber(visit(condCtx));
                condTrue = (cond != 0);
            }
            if (!condTrue) break;

            // esegui il corpo
            for (var st : body) {
                visit(st);
            }

            // update: visita forUpdate se presente
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
        setVariable(id, value);
        return null;
    }

    /**
     * forUpdate: ID '=' expr
     */
    @Override
    public Object visitForUpdate(GrammaticaParser.ForUpdateContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        setVariable(id, value);
        return null;
    }

    /**
     * arrayAccess: ID '[' expr ']'    // x[ i ]
     */
    @Override
    public Object visitArrayAccess(GrammaticaParser.ArrayAccessContext ctx) {
        String id = ctx.ID().getText();
        Object arrObj = getVariable(id);
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
    public Object visitVarDecl(GrammaticaParser.VarDeclContext ctx) {
        String id = ctx.ID().getText();
        List<GrammaticaParser.ExprContext> exprs = ctx.expr();

        if (ctx.getChildCount() == 5) {          // var x = expr ;
            Object value = visit(exprs.get(0));

            // ⬇️  DICHIARAZIONE LOCALE (NON usare setVariable)
            declareVariable(id, value);

        } else {                                 // var x [idx] = expr ;
            int idx = (int) toNumber(visit(exprs.get(0)));
            Object v  = visit(exprs.get(1));

            List<Object> arr = new ArrayList<>();
            while (arr.size() <= idx) arr.add(0);
            arr.set(idx, v);

            // ⬇️  DICHIARAZIONE LOCALE
            declareVariable(id, arr);
        }

        // Registra la dichiarazione nello stack delle locali
        if (!declaredStack.isEmpty()) {
            declaredStack.peek().add(id);
        }
        return null;
    }

    @Override
    public Object visitAssignStmt(GrammaticaParser.AssignStmtContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr().get(0));
        setVariable(id, value);
        return null;
    }

    /**
     * ifStmt: 'if' '(' expr ')' block ( 'else' block )?
     */
    @Override
    public Object visitIfStmt(GrammaticaParser.IfStmtContext ctx) {
        // 1) valuta la condizione
        float cond = toNumber(visit(ctx.expr()));
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
     * PrintStmt: 'print' '(' expr ')' ';'
     */
    @Override
    public Object visitPrintStmt(GrammaticaParser.PrintStmtContext ctx) {
        Object value = visit(ctx.expr());       // valuta espressione
        System.out.println(value);              // stampa su console
        return null;
    }

    /**
     * ExprStmt: expr ';'
     */
    @Override
    public Object visitExprStmt(GrammaticaParser.ExprStmtContext ctx) {
        // Semplicemente valuta l’espressione
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
        // altrimenti fai operazione in float
        return toNumber(l) + toNumber(r);
    }

    /**
     * SubExpr: expr '-' expr
     */
    @Override
    public Object visitSubExpr(GrammaticaParser.SubExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));

        // se entrambi Integer, restituisci Integer
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l - (Integer) r;
        }
        // altrimenti fai operazione in float
        return toNumber(l) - toNumber(r);
    }

    /**
     * MulExpr: expr '*' expr
     */
    @Override
    public Object visitMulExpr(GrammaticaParser.MulExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        // se entrambi Integer, restituisci Integer
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l * (Integer) r;
        }
        // altrimenti fai operazione in float
        return toNumber(l) * toNumber(r);
    }

    /**
     * ModExpr: expr '%' expr
     */
    @Override
    public Object visitModExpr(GrammaticaParser.ModExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));

        // se entrambi Integer, restituisci Integer
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l % (Integer) r;
        }
        // altrimenti fai operazione in float
        return toNumber(l) % toNumber(r);
    }

    /**
     * DivExpr: expr '/' expr
     */
    @Override
    public Object visitDivExpr(GrammaticaParser.DivExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));

        // se entrambi Integer, restituisci Integer
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l / (Integer) r;
        }
        // altrimenti fai operazione in float
        return toNumber(l) / toNumber(r);
    }

    /**
     * PowExpr: expr '^' expr
     */
    /**
     * PowExpr: expr '^' expr
     */
    @Override
    public Object visitPowExpr(GrammaticaParser.PowExprContext ctx) {
        // Valuta i due operandi
        Object lObj = visit(ctx.expr(0));
        Object rObj = visit(ctx.expr(1));
        float l = toNumber(lObj);
        float r = toNumber(rObj);
        float result = (float) Math.pow(l, r);

        // Se entrambi erano Integer, riconverti a Integer
        if (lObj instanceof Integer && rObj instanceof Integer) {
            return (int) result;
        }
        // Altrimenti mantieni il float
        return result;
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
        return Float.parseFloat(ctx.FLOAT().getText());
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
        Object val = getVariable(ctx.ID().getText());
        return val == null ? 0 : val;
    }


    /**
     * InputExpr: 'input' '(' ')'
     */
    @Override
    public Object visitInputExpr(GrammaticaParser.InputExprContext ctx) {
        System.out.print("> ");
        String raw = new java.util.Scanner(System.in).nextLine().trim();

        try {
            if (raw.contains(".")) {           // ha parte decimale → float
                return Float.parseFloat(raw);
            } else {                           // altrimenti int
                return Integer.parseInt(raw);
            }
        } catch (NumberFormatException ex) {
            return raw;                        // non numerico → stringa
        }
    }


    /**
     * StrExpr: 'str' '(' expr ')'
     */
    @Override
    public Object visitStrExpr(GrammaticaParser.StrExprContext ctx) {
        Object val = visit(ctx.expr());
        return val.toString();
    }

    private float toNumber(Object obj) {
        if (obj instanceof Integer) return ((Integer) obj).floatValue();
        if (obj instanceof Float)   return (Float) obj;
        throw new RuntimeException("Non è un numero: " + obj);
    }

    @Override
    public Object visitLtExpr(GrammaticaParser.LtExprContext ctx) {
        float l = toNumber(visit(ctx.expr(0)));
        float r = toNumber(visit(ctx.expr(1)));
        return l < r ? 1 : 0;
    }

    @Override
    public Object visitGtExpr(GrammaticaParser.GtExprContext ctx) {
        float l = toNumber(visit(ctx.expr(0)));
        float r = toNumber(visit(ctx.expr(1)));
        return l > r ? 1 : 0;
    }

    @Override
    public Object visitLeExpr(GrammaticaParser.LeExprContext ctx) {
        float l = toNumber(visit(ctx.expr(0)));
        float r = toNumber(visit(ctx.expr(1)));
        return l <= r ? 1 : 0;
    }

    @Override
    public Object visitGeExpr(GrammaticaParser.GeExprContext ctx) {
        float l = toNumber(visit(ctx.expr(0)));
        float r = toNumber(visit(ctx.expr(1)));
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
        return null;
    }

    @Override
    public Object visitFunDecl(GrammaticaParser.FunDeclContext ctx) {
        String name = ctx.ID().getText();
        functions.put(name, ctx); // salva il contesto della funzione
        return null;
    }


    @Override
    public Object visitRetStmt(GrammaticaParser.RetStmtContext ctx) {
        Object v = visit(ctx.expr());
        throw new ReturnValue(v);
    }

    @Override
    public Object visitCallExpr(GrammaticaParser.CallExprContext ctx) {
        String fname = ctx.ID().getText();
        GrammaticaParser.FunDeclContext fctx = functions.get(fname);
        if (fctx == null) throw new RuntimeException("Funzione non definita: " + fname);

        Map<String, Object> newScope = new HashMap<>();
        Set<String> declaredLocally = new HashSet<>();

        callStack.push(newScope);
        declaredStack.push(declaredLocally);

        try {
            for (var stmt : fctx.block().statement()) {
                visit(stmt);
            }
        } catch (ReturnValue rv) {
            callStack.pop();
            syncWithGlobal(newScope);
            return rv.value;
        }

        callStack.pop();
        syncWithGlobal(newScope);
        return null;
    }
    @Override
    public Object visitSlyStmt(GrammaticaParser.SlyStmtContext ctx) {
        // Recupera il nodo bfProgram generato dal parser
        GrammaticaParser.BfProgramContext bf = ctx.bfProgram();

        // Inizializza la configurazione BF (array di byte)
        Conf conf = new Conf();

        // Costruisci il visitor‐interprete per Brainfuck
        BrainfuckInterpreter bfInterp = new BrainfuckInterpreter(conf);

        // Esegui il programma BF visitando il parse tree
        bfInterp.visitBfProgram(bf);

        // slyStmt non restituisce un valore nel linguaggio principale
        return null;
    }
}
