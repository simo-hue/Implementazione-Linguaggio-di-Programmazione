package myLang;

import org.antlr.v4.runtime.Token;

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
        return null; // lascia che chi lo usa gestisca il caso "non definito"
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

    @SuppressWarnings("unchecked")
    private List<Object> ensureArray(String id) {
        Object v = getVariable(id);

        if (v instanceof List<?>) {
            return (List<Object>) v;
        }

        if (v == null || v.equals(0)) {
            // Non inizializzata o zero: crea nuova lista
            List<Object> arr = new ArrayList<>();
            setVariable(id, arr);
            return arr;
        }

        // Se è altro (es. numero), errore
        throw new RuntimeException("Variabile '" + id + "' non è un array.");
    }

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

        // Valuta la condizione ogni volta che il while la richiede
        while (toNumber( visit(ctx.expr()) ) != 0) {

            // esegui il corpo
            for (GrammaticaParser.StatementContext st : ctx.block().statement()) {
                visit(st);
            }
            // qui NON ricalcoliamo esplicitamente: il controllo del while
            // tornerà in cima ed eseguirà di nuovo visit(ctx.expr())
        }
        return null;
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

        String id    = ctx.ID().getText();
        int    index = (int) toNumber( visit(ctx.expr()) );

        Object v = getVariable(id);

        if (!(v instanceof List<?>)) {
            // Variabile non definita o scalare: array “vuoto”
            return 0;                         // puoi restituire null se preferisci
        }

        List<?> arr = (List<?>) v;
        return (index < arr.size()) ? arr.get(index) : 0;
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

        } else {
            Object idxRaw = visit(exprs.get(0));
            if (!(idxRaw instanceof Number)) {
                throw new RuntimeException("L'indice dell'array deve essere un numero: trovato → " + idxRaw);
            }
            int idx = ((Number) idxRaw).intValue();
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

        // lassi di grammatica:
        //   ID '=' expr                 → childCount == 3 (+ ';' nel parser)
        //   ID '[' expr ']' '=' expr    → childCount > 3

        if (ctx.getChildCount() > 4) {                 // assegnamento a x[expr]

            Object indexRaw = visit(ctx.expr(0));
            if (!(indexRaw instanceof Number)) {
                throw new RuntimeException("L'indice dell'array deve essere un numero: trovato → " + indexRaw);
            }
            int index = ((Number) indexRaw).intValue();
            Object value = visit(ctx.expr(1));

            List<Object> arr = ensureArray(id);        // crea o recupera l’array
            while (arr.size() <= index) arr.add(0);    // auto-espansione
            arr.set(index, value);

        } else {                                       // assegnamento scalare
            Object value = visit(ctx.expr(0));
            setVariable(id, value);
        }

        // non registrare come dichiarazione se è solo riassegnazione
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
        Object first = visit(ctx.exprStrPart(0));
        StringBuilder result = new StringBuilder(toString(first));

        for (int i = 1; i < ctx.exprStrPart().size(); i++) {
            Object part = visit(ctx.exprStrPart(i));
            result.append(toString(part));
        }

        return result.toString();
    }

    @Override
    public Object visitIdInStrExpr(GrammaticaParser.IdInStrExprContext ctx) {
        Object val = getVariable(ctx.ID().getText());
        return toString(val);  // converte il valore in stringa
    }

    @Override
    public Object visitInputInStrExpr(GrammaticaParser.InputInStrExprContext ctx) {
        System.out.print("> ");
        String raw = scanner.nextLine().trim();
        return raw;
    }

    @Override
    public Object visitParensStrExpr(GrammaticaParser.ParensStrExprContext ctx) {
        return visit(ctx.strExpr());
    }

    /**
     * PrintStmt: 'print' '(' expr ')' ';'
     */
    @Override
    public Object visitPrintStmt(GrammaticaParser.PrintStmtContext ctx) {
        Object val = visit(ctx.expr());
        System.out.println(toString(val));  // Usa conversione stringa sicura
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
    public Object visitAddExprOp(GrammaticaParser.AddExprOpContext ctx) {
        Object left = visit(ctx.multExpr(0));

        for (int i = 1; i < ctx.multExpr().size(); i++) {
            Object right = visit(ctx.multExpr(i));
            Token op = (Token) ctx.getChild(2 * i - 1).getPayload();

            if (op.getType() == GrammaticaParser.PLUS) {
                // Se uno dei due è stringa, fai concatenazione
                if (left instanceof String || right instanceof String) {
                    left = toString(left) + toString(right);
                } else {
                    float l = toNumber(left);
                    float r = toNumber(right);
                    left = l + r;
                }
            } else if (op.getType() == GrammaticaParser.MINUS) {
                // La sottrazione ha senso solo tra numeri
                float l = toNumber(left);
                float r = toNumber(right);
                left = l - r;
            }
        }

        return left;
    }
    /**
     * MulExpr: expr '*' expr
     */
    @Override
    public Object visitMulExprOp(GrammaticaParser.MulExprOpContext ctx) {
        Object left = visit(ctx.powExpr(0));

        for (int i = 1; i < ctx.powExpr().size(); i++) {
            Object right = visit(ctx.powExpr(i));
            Token op = (Token) ctx.getChild(2 * i - 1).getPayload();

            // Validazione: entrambi devono essere numerici
            if (!(left instanceof Number || left instanceof String) ||
                    !(right instanceof Number || right instanceof String)) {
                throw new RuntimeException("Moltiplicazione/divisione/modulo supportati solo tra numeri");
            }

            float l, r;
            try {
                l = toNumber(left);
                r = toNumber(right);
            } catch (RuntimeException e) {
                throw new RuntimeException("Errore: operazione aritmetica non valida su stringa → \"" + left + "\" o \"" + right + "\"");
            }

            switch (op.getType()) {
                case GrammaticaParser.MUL:
                    left = l * r;
                    break;
                case GrammaticaParser.DIV:
                    if (r == 0) throw new RuntimeException("Divisione per zero");
                    left = l / r;
                    break;
                case GrammaticaParser.MOD:
                    left = l % r;
                    break;
            }
        }

        return left;
    }
    /**
     * PowExpr: expr '^' expr
     */
    @Override
    public Object visitPowExprOp(GrammaticaParser.PowExprOpContext ctx) {
        Object left = visit(ctx.unaryExpr());

        // se non c’è '^', restituisci il valore così com’è
        if (ctx.powExpr() == null) {
            return left;        // può essere int, float, stringa, lista…
        }

        // altrimenti calcola la potenza (entrambi devono essere numeri)
        float base = toNumber(left);
        float exp  = toNumber(visit(ctx.powExpr()));
        return (float)Math.pow(base, exp);
    }

    /**
     * UnaryMinus: '-' expr
     */
    @Override
    public Object visitUnaryMinus(GrammaticaParser.UnaryMinusContext ctx) {
        return -toNumber(visit(ctx.unaryExpr()));
    }

    @Override
    public Object visitToAtom(GrammaticaParser.ToAtomContext ctx) {
        return visit(ctx.atomExpr());
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
    public Object visitStringInStrExpr(GrammaticaParser.StringInStrExprContext ctx) {
        String text = ctx.STRING().getText();
        if (text.length() >= 2 && text.startsWith("\"") && text.endsWith("\"")) {
            return text.substring(1, text.length() - 1);  // rimuove virgolette
        }
        return text;
    }


    /**
     * IdExpr: ID
     */
    @Override
    public Object visitIdExpr(GrammaticaParser.IdExprContext ctx) {
        return getVariable(ctx.ID().getText()); // lascia null se non esiste
    }


    /**
     * InputExpr: 'input' '(' ')'
     */
    @Override
    public Object visitInputExpr(GrammaticaParser.InputExprContext ctx) {
        System.out.print("> ");
        String raw = scanner.nextLine().trim();
        System.out.println("[DBG] input() -> " + raw);

        // Caso 1: stringa tra virgolette → "ciao"
        if (raw.startsWith("\"") && raw.endsWith("\"") && raw.length() >= 2) {
            return raw.substring(1, raw.length() - 1);
        }

        // Caso 2: numeri
        try {
            return raw.contains(".") ? Float.parseFloat(raw) : Integer.parseInt(raw);
        } catch (NumberFormatException e) {
            // Caso 3: fallback → trattalo come stringa normale
            return raw;
        }
    }

    /**
     * StrExpr: 'str' '(' expr ')'
     */
    @Override
    public Object visitToStrInStrExpr(GrammaticaParser.ToStrInStrExprContext ctx) {
        Object val = visit(ctx.arithExpr());
        return toString(val);  // Usa la versione sicura che gestisce anche liste/null
    }

    private float toNumber(Object obj) {
        if (obj == null)
            throw new RuntimeException("Errore: toNumber() ricevuto null (variabile non inizializzata)");

        if (obj instanceof Integer) return ((Integer) obj).floatValue();
        if (obj instanceof Float) return (Float) obj;
        if (obj instanceof Double) return ((Double) obj).floatValue();
        if (obj instanceof String) {
            String s = ((String) obj).trim();
            if (s.equals("undefined"))
                throw new RuntimeException("Errore: toNumber() ricevuto 'undefined' (variabile non definita)");
            try {
                return Float.parseFloat(s);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Stringa non numerica in toNumber(): \"" + obj + "\"");
            }
        }

        throw new RuntimeException("Tipo non numerico: " + obj);
    }
    private String toString(Object obj) {
        if (obj == null) return "null";
        if (obj instanceof List<?>) {
            List<?> list = (List<?>) obj;
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(toString(list.get(i)));
            }
            sb.append("]");
            return sb.toString();
        }
        return String.valueOf(obj);
    }

    @Override
    public Object visitLtExpr(GrammaticaParser.LtExprContext ctx) {
        float l = toNumber(visit(ctx.addExpr(0)));
        float r = toNumber(visit(ctx.addExpr(1)));
        System.out.println("[DBG] " + l + " < " + r);
        return l < r ? 1 : 0;
    }

    @Override
    public Object visitGtExpr(GrammaticaParser.GtExprContext ctx) {
        float l = toNumber(visit(ctx.addExpr(0)));
        float r = toNumber(visit(ctx.addExpr(1)));
        System.out.println("[DBG] " + l + " > " + r);
        return l > r ? 1 : 0;
    }

    @Override
    public Object visitLeExpr(GrammaticaParser.LeExprContext ctx) {
        float l = toNumber(visit(ctx.addExpr(0)));
        float r = toNumber(visit(ctx.addExpr(1)));
        return l <= r ? 1 : 0;
    }

    @Override
    public Object visitGeExpr(GrammaticaParser.GeExprContext ctx) {
        float l = toNumber(visit(ctx.addExpr(0)));
        float r = toNumber(visit(ctx.addExpr(1)));
        return l >= r ? 1 : 0;
    }

    @Override
    public Object visitEqExpr(GrammaticaParser.EqExprContext ctx) {
        Object l = visit(ctx.addExpr(0));
        Object r = visit(ctx.addExpr(1));
        // confronto stringhe o numeri
        if (l instanceof String || r instanceof String) {
            return l.toString().equals(r.toString()) ? 1 : 0;
        }
        return toNumber(l) == toNumber(r) ? 1 : 0;
    }

    @Override
    public Object visitNeExpr(GrammaticaParser.NeExprContext ctx) {
        Object l = visit(ctx.addExpr(0));
        Object r = visit(ctx.addExpr(1));
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
        return 0f;
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
