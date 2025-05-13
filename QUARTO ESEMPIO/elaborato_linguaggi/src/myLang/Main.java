package myLang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Punto di ingresso dell’interprete.
 * Si aspetta come argomento una sola stringa: il path al file di input.
 */
public class Main {
    public static void main(String[] args) {
        // 1) Verifica che sia stato passato esattamente un argomento
        if (args.length != 1) {
            System.err.println("Usage: java myLang.Main <input-file>");
            System.exit(1);
        }

        String inputFile = args[0];
        System.out.println("Lettura del file di input: " + inputFile);

        try {
            // 2) Carica il file di input in un CharStream ANTLR
            CharStream input = CharStreams.fromFileName(inputFile);

            // 3) Costruisci il Lexer a partire dal CharStream
            GrammaticaLexer lexer = new GrammaticaLexer(input);

            // 4) Raggruppa i token generati dal Lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 5) Costruisci il Parser sui token
            GrammaticaParser parser = new GrammaticaParser(tokens);

            // 6) Esegui il parsing partendo dalla rule 'program'
            ParseTree tree = parser.program();

            // 7) Visita l’albero sintattico per interpretare il programma
            EvalVisitor visitor = new EvalVisitor();
            visitor.visit(tree);

        } catch (IOException e) {
            // Gestione errore di I/O (es. file non trovato)
            System.err.println("Errore nella lettura del file: " + e.getMessage());
            System.exit(2);
        }
    }
}
