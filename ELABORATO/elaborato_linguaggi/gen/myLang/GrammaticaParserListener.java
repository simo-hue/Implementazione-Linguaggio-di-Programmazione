// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/ELABORATO/elaborato_linguaggi/src/myLang/GrammaticaParser.g4 by ANTLR 4.13.2
package myLang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammaticaParser}.
 */
public interface GrammaticaParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link GrammaticaParser#otherStmt}.
	 * @param ctx the parse tree
	 */
	void enterOtherStmt(GrammaticaParser.OtherStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#otherStmt}.
	 * @param ctx the parse tree
	 */
	void exitOtherStmt(GrammaticaParser.OtherStmtContext ctx);
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
	 * Enter a parse tree produced by {@link GrammaticaParser#nonDetStmt}.
	 * @param ctx the parse tree
	 */
	void enterNonDetStmt(GrammaticaParser.NonDetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#nonDetStmt}.
	 * @param ctx the parse tree
	 */
	void exitNonDetStmt(GrammaticaParser.NonDetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunDecl(GrammaticaParser.FunDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunDecl(GrammaticaParser.FunDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(GrammaticaParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(GrammaticaParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#slyStmt}.
	 * @param ctx the parse tree
	 */
	void enterSlyStmt(GrammaticaParser.SlyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#slyStmt}.
	 * @param ctx the parse tree
	 */
	void exitSlyStmt(GrammaticaParser.SlyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammaticaParser#bfProgram}.
	 * @param ctx the parse tree
	 */
	void enterBfProgram(GrammaticaParser.BfProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammaticaParser#bfProgram}.
	 * @param ctx the parse tree
	 */
	void exitBfProgram(GrammaticaParser.BfProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BfLt}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void enterBfLt(GrammaticaParser.BfLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BfLt}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void exitBfLt(GrammaticaParser.BfLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BfGt}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void enterBfGt(GrammaticaParser.BfGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BfGt}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void exitBfGt(GrammaticaParser.BfGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BfPlus}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void enterBfPlus(GrammaticaParser.BfPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BfPlus}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void exitBfPlus(GrammaticaParser.BfPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BfMinus}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void enterBfMinus(GrammaticaParser.BfMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BfMinus}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void exitBfMinus(GrammaticaParser.BfMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BfDot}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void enterBfDot(GrammaticaParser.BfDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BfDot}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void exitBfDot(GrammaticaParser.BfDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BfComma}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void enterBfComma(GrammaticaParser.BfCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BfComma}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void exitBfComma(GrammaticaParser.BfCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BfLoop}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void enterBfLoop(GrammaticaParser.BfLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BfLoop}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 */
	void exitBfLoop(GrammaticaParser.BfLoopContext ctx);
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
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(GrammaticaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(GrammaticaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(GrammaticaParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(GrammaticaParser.CallExprContext ctx);
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