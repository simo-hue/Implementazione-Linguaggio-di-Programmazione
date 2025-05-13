// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/ELABORATO/elaborato_linguaggi/src/myLang/Grammatica.g4 by ANTLR 4.13.2
package myLang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammaticaParser}.
 */
public interface GrammaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(GrammaticaParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(GrammaticaParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(GrammaticaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(GrammaticaParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(GrammaticaParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(GrammaticaParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(GrammaticaParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(GrammaticaParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(GrammaticaParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(GrammaticaParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(GrammaticaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(GrammaticaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(GrammaticaParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(GrammaticaParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GrammaticaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GrammaticaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(GrammaticaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(GrammaticaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammaticaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammaticaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStrExpr(GrammaticaParser.StrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStrExpr(GrammaticaParser.StrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code geExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeExpr(GrammaticaParser.GeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code geExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeExpr(GrammaticaParser.GeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(GrammaticaParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(GrammaticaParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(GrammaticaParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(GrammaticaParser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(GrammaticaParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(GrammaticaParser.GtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInputExpr(GrammaticaParser.InputExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInputExpr(GrammaticaParser.InputExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeExpr(GrammaticaParser.NeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeExpr(GrammaticaParser.NeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(GrammaticaParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(GrammaticaParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(GrammaticaParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(GrammaticaParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpr(GrammaticaParser.ConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpr(GrammaticaParser.ConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(GrammaticaParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(GrammaticaParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(GrammaticaParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(GrammaticaParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(GrammaticaParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(GrammaticaParser.LtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(GrammaticaParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(GrammaticaParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(GrammaticaParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(GrammaticaParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeExpr(GrammaticaParser.LeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeExpr(GrammaticaParser.LeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(GrammaticaParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(GrammaticaParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(GrammaticaParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(GrammaticaParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(GrammaticaParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(GrammaticaParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(GrammaticaParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(GrammaticaParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(GrammaticaParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(GrammaticaParser.IdExprContext ctx);
}