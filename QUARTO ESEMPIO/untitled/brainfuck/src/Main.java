import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String args[]) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        BrainfuckLexer lexer = new BrainfuckLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrainfuckParser parser = new BrainfuckParser(tokens);

        ParseTree tree = parser.main();

        BrainfuckInterpreter interpreter = new BrainfuckInterpreter(new Conf());
        Conf conf = interpreter.visit(tree);

        System.out.println("---- FINAL STATE ------------------------------");
        System.out.println(conf);
    }
}
