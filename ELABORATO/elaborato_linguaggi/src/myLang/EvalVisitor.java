package myLang;

// (mancava l’import del parser generato)
import myLang.GrammaticaParser;
// (mancava l’import della base visitor)
import myLang.GrammaticaBaseVisitor;

import java.util.HashMap;
import java.util.Map;

/**
 * EvalVisitor: visita l’albero sintattico e ne valuta
 * i nodi, memorizzando le variabili in una mappa.
 */
public class EvalVisitor extends GrammaticaBaseVisitor<Object> {

    // Mappa per variabili: nome → valore
    private final Map<String, Object> memory = new HashMap<>();

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

    /** VarDecl: 'var' ID '=' expr ';' */
    @Override
    public Object visitVarDecl(GrammaticaParser.VarDeclContext ctx) {
        String id = ctx.ID().getText();         // nome variabile
        Object value = visit(ctx.expr());       // valutazione espressione
        memory.put(id, value);                  // memorizza
        return null;
    }

    /** PrintStmt: 'print' '(' expr ')' ';' */
    @Override
    public Object visitPrintStmt(GrammaticaParser.PrintStmtContext ctx) {
        Object value = visit(ctx.expr());       // valuta espressione
        System.out.println(value);              // stampa su console
        return null;
    }

    // ← Mancava completamente la gestione degli statement di tipo exprStmt.
    /** ExprStmt: expr ';' */
    @Override
    public Object visitExprStmt(GrammaticaParser.ExprStmtContext ctx) {
        // Semplicemente valuta l’espressione,
        // ma non la stampa (non è un printStmt)
        return visit(ctx.expr());
    }

    /** AddExpr: expr '+' expr */
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

    /** SubExpr: expr '-' expr */
    @Override
    public Object visitSubExpr(GrammaticaParser.SubExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l - (Integer) r;
        }
        return toNumber(l) - toNumber(r);
    }

    /** MulExpr: expr '*' expr */
    @Override
    public Object visitMulExpr(GrammaticaParser.MulExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l * (Integer) r;
        }
        return toNumber(l) * toNumber(r);
    }

    /** ModExpr: expr '%' expr */
    @Override
    public Object visitModExpr(GrammaticaParser.ModExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l % (Integer) r;
        }
        return toNumber(l) % toNumber(r);
    }

    /** DivExpr: expr '/' expr */
    @Override
    public Object visitDivExpr(GrammaticaParser.DivExprContext ctx) {
        Object l = visit(ctx.expr(0));
        Object r = visit(ctx.expr(1));
        if (l instanceof Integer && r instanceof Integer) {
            return (Integer) l / (Integer) r;
        }
        return toNumber(l) / toNumber(r);
    }
    /** PowExpr: expr '^' expr */
    @Override
    public Object visitPowExpr(GrammaticaParser.PowExprContext ctx) {
        return Math.pow(
                toNumber(visit(ctx.expr(0))),
                toNumber(visit(ctx.expr(1)))
        );
    }

    /** UnaryMinus: '-' expr */
    @Override
    public Object visitUnaryMinus(GrammaticaParser.UnaryMinusContext ctx) {
        return - toNumber(visit(ctx.expr()));
    }

    /** ParensExpr: '(' expr ')' */
    @Override
    public Object visitParensExpr(GrammaticaParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }

    /** IntExpr: INT */
    @Override
    public Object visitIntExpr(GrammaticaParser.IntExprContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    /** FloatExpr: FLOAT */
    @Override
    public Object visitFloatExpr(GrammaticaParser.FloatExprContext ctx) {
        return Double.parseDouble(ctx.FLOAT().getText());
    }

    /** StringExpr: STRING */
    @Override
    public Object visitStringExpr(GrammaticaParser.StringExprContext ctx) {
        // togli le virgolette iniziali/finali
        String text = ctx.STRING().getText();
        return text.substring(1, text.length() - 1);
    }

    /** IdExpr: ID */
    @Override
    public Object visitIdExpr(GrammaticaParser.IdExprContext ctx) {
        String id = ctx.ID().getText();
        // se non esiste, restituisci 0 per convenzione
        return memory.getOrDefault(id, 0);
    }

    /** InputExpr: 'input' '(' ')' */
    @Override
    public Object visitInputExpr(GrammaticaParser.InputExprContext ctx) {
        // esempio: usa Scanner per leggere da console
        System.out.print("> ");
        return new java.util.Scanner(System.in).nextDouble();
    }

    /** StrExpr: 'str' '(' expr ')' */
    @Override
    public Object visitStrExpr(GrammaticaParser.StrExprContext ctx) {
        Object val = visit(ctx.expr());
        return val.toString();
    }

    // ... qui potresti aggiungere visit per ND-block, while, for, if, fun, sly{...}arnold, ecc.

    /** Helper: assicura un risultato numerico */
    private double toNumber(Object obj) {
        if (obj instanceof Integer) return ((Integer)obj).doubleValue();
        if (obj instanceof Double)  return (Double)obj;
        throw new RuntimeException("Non è un numero: " + obj);
    }
}
