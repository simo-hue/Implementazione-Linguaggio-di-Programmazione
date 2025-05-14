package myLang;

import java.util.Scanner;
import myLang.GrammaticaParserBaseVisitor;
import myLang.GrammaticaParser;
/**
 * Visitor ANTLR che esegue la parte Brainfuck della grammatica principale.
 * Estende GrammaticaBaseVisitor<Conf> perché bfProgram è una rule di GrammaticaLexer.g4.
 */
public class BrainfuckInterpreter extends GrammaticaParserBaseVisitor<Conf> {

    private static final Scanner console = new Scanner(System.in);
    private final Conf conf;

    public BrainfuckInterpreter(Conf conf) {
        this.conf = conf;
    }

    /**
     * Regola bfProgram: una sequenza di bfCommand.
     * Visitiamo ciascun comando in ordine.
     */
    @Override
    public Conf visitBfProgram(GrammaticaParser.BfProgramContext ctx) {
        for (var cmdCtx : ctx.bfCommand()) {
            visit(cmdCtx);
        }
        return conf;
    }

    /** '<' */
    @Override
    public Conf visitBfLt(GrammaticaParser.BfLtContext ctx) {
        conf.left();
        return conf;
    }

    /** '>' */
    @Override
    public Conf visitBfGt(GrammaticaParser.BfGtContext ctx) {
        conf.right();
        return conf;
    }

    /** '+' */
    @Override
    public Conf visitBfPlus(GrammaticaParser.BfPlusContext ctx) {
        conf.inc();
        return conf;
    }

    /** '-' */
    @Override
    public Conf visitBfMinus(GrammaticaParser.BfMinusContext ctx) {
        conf.dec();
        return conf;
    }

    /** '.' */
    @Override
    public Conf visitBfDot(GrammaticaParser.BfDotContext ctx) {
        System.out.print((char) conf.get());
        return conf;
    }

    /** ',' */
    @Override
    public Conf visitBfComma(GrammaticaParser.BfCommaContext ctx) {
        System.out.print(":> ");
        int v = console.nextInt();
        conf.update(v);
        return conf;
    }

    /**
     * loop: '[' bfCommand* ']'
     * Esegue il corpo finché cella != 0.
     */
    @Override
    public Conf visitBfLoop(GrammaticaParser.BfLoopContext ctx) {
        // prendi il contesto bfProgram, poi da lì la lista di bfCommand
        var innerCommands = ctx.bfProgram().bfCommand();

        while (conf.get() != 0) {
            for (var inner : innerCommands) {
                visit(inner);
            }
        }
        return conf;
    }

}