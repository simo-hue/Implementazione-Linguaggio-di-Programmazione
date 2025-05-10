// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/intexp/src/intExp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link intExpParser}.
 */
public interface intExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link intExpParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(intExpParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link intExpParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(intExpParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nat}
	 * labeled alternative in {@link intExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNat(intExpParser.NatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link intExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNat(intExpParser.NatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link intExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPlus(intExpParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link intExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPlus(intExpParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link intExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMult(intExpParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link intExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMult(intExpParser.MultContext ctx);
}