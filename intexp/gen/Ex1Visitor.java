// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/intexp/src/Ex1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Ex1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Ex1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Ex1Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(Ex1Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex1Parser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(Ex1Parser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex1Parser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(Ex1Parser.XContext ctx);
}