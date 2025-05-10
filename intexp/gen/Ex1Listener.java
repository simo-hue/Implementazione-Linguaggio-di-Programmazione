// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/intexp/src/Ex1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex1Parser}.
 */
public interface Ex1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex1Parser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(Ex1Parser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex1Parser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(Ex1Parser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex1Parser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(Ex1Parser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex1Parser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(Ex1Parser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex1Parser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(Ex1Parser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex1Parser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(Ex1Parser.XContext ctx);
}