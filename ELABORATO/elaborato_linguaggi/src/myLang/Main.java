package myLang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Punto di ingresso dell’interprete.
 * Si aspetta come argomento una sola stringa: il path al file di input a livello elaborato_linguaggi.
 */
public class Main {
    public static void main(String[] args) {
        // stampa la working directory per debug
        System.out.println("Working dir: " + System.getProperty("user.dir"));

        // 1) controllo argomenti
        if (args.length != 1) {
            System.err.println("Usage: java myLang.Main <input-file>");
            System.exit(1);
        }

        String inputFile = args[0];
        System.out.println("Lettura del file di input: " + inputFile);

        try {
            // 2) carica il file
            CharStream input = CharStreams.fromFileName(inputFile);

            // 3) costruisci lexer e parser
            // lexer: legge il file
            GrammaticaLexer lexer   = new GrammaticaLexer(input);
            // per la sequenza di token
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // parser: costruisce l’albero sintattico
            GrammaticaParser parser = new GrammaticaParser(tokens);

            // 4) avvia il parsing
            ParseTree tree = parser.program();

            // 5) interpreta l’albero sintattico
            EvalVisitor visitor = new EvalVisitor();

            // Faccio partire la visita dell'albero
            visitor.visit(tree);

        } catch (IOException e) {
            // ora stampi lo stack per capire il vero errore
            System.err.println("Errore nella lettura del file: " + inputFile);
            e.printStackTrace();
            System.exit(2);
        }
    }
}
