import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("File requested: " + args[0]);

        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        InputStream is = new FileInputStream(args[0]);
        if (is == null) {
            throw new IOException("File not found: " + args[0]);
        }

        CharStream cs = CharStreams.fromStream(is);


        intExpLexer lexer = new intExpLexer(cs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        intExpParser parser = new intExpParser(tokenStream);

        ParseTree tree = parser.main();
    }
}
