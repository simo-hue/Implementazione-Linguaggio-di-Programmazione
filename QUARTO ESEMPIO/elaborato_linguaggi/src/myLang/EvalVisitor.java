package myLang;

// Import delle classi AST generate da ANTLR

import java.util.HashMap;
import java.util.Map;

/**
 * EvalVisitor: visita l’albero sintattico e ne valuta
 * i nodi, memorizzando le variabili in una mappa.
 */
public class EvalVisitor extends GrammaticaBaseVisitor<Object> {

    // Mappa per variabili: nome → valore
    private final Map<String, Object> memory = new HashMap<>();

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

    /** AddExpr: expr '+' expr */
    @Override
    public Object visitAddExpr(GrammaticaParser.AddExprContext ctx) {
        // converte i due operandi in double e somma
        return toNumber(visit(ctx.expr(0)))
                + toNumber(visit(ctx.expr(1)));
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

    /** ParensExpr: '(' expr ')' */
    @Override
    public Object visitParensExpr(GrammaticaParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }

    // ... implementare gli altri visit* per sub, mul, div, ecc.

    /** Helper: assicura un risultato numerico */
    private double toNumber(Object obj) {
        if (obj instanceof Integer) return ((Integer)obj).doubleValue();
        if (obj instanceof Double)  return (Double)obj;
        throw new RuntimeException("Non è un numero: " + obj);
    }
}
// ... implementare gli altri visit* per sub, mul, div, ecc.