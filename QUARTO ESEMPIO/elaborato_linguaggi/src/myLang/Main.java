package myLang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Carica un file input.txt da leggere
        CharStream input = CharStreams.fromFileName("input.txt");

        // Lexer & Parser
        GrammaticaLexer lexer = new GrammaticaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammaticaParser parser = new GrammaticaParser(tokens);

        // Parse dal punto di ingresso 'program'
        ParseTree tree = parser.program();

        // Interprete
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
