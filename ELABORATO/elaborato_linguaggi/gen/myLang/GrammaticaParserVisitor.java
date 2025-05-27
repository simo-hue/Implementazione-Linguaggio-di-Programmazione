// Generated from /Users/simo/Downloads/Implementazione-Linguaggio-di-Programmazione-main/ELABORATO/elaborato_linguaggi/src/myLang/GrammaticaParser.g4 by ANTLR 4.13.2
package myLang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammaticaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#otherStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherStmt(GrammaticaParser.OtherStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(GrammaticaParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(GrammaticaParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(GrammaticaParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(GrammaticaParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(GrammaticaParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GrammaticaParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(GrammaticaParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GrammaticaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(GrammaticaParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammaticaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#nonDetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDetStmt(GrammaticaParser.NonDetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#funDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDecl(GrammaticaParser.FunDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#retStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(GrammaticaParser.RetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#slyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlyStmt(GrammaticaParser.SlyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#bfProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfProgram(GrammaticaParser.BfProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BfLt}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfLt(GrammaticaParser.BfLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BfGt}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfGt(GrammaticaParser.BfGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BfPlus}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfPlus(GrammaticaParser.BfPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BfMinus}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfMinus(GrammaticaParser.BfMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BfDot}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfDot(GrammaticaParser.BfDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BfComma}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfComma(GrammaticaParser.BfCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BfLoop}
	 * labeled alternative in {@link GrammaticaParser#bfCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfLoop(GrammaticaParser.BfLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprArith}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArith(GrammaticaParser.ExprArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(GrammaticaParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link GrammaticaParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatExpr(GrammaticaParser.ConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toStrInStrExpr}
	 * labeled alternative in {@link GrammaticaParser#exprStrPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToStrInStrExpr(GrammaticaParser.ToStrInStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringInStrExpr}
	 * labeled alternative in {@link GrammaticaParser#exprStrPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInStrExpr(GrammaticaParser.StringInStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idInStrExpr}
	 * labeled alternative in {@link GrammaticaParser#exprStrPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdInStrExpr(GrammaticaParser.IdInStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputInStrExpr}
	 * labeled alternative in {@link GrammaticaParser#exprStrPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputInStrExpr(GrammaticaParser.InputInStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensStrExpr}
	 * labeled alternative in {@link GrammaticaParser#exprStrPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensStrExpr(GrammaticaParser.ParensStrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammaticaParser#arithExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpr(GrammaticaParser.ArithExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link GrammaticaParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(GrammaticaParser.LtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link GrammaticaParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(GrammaticaParser.GtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leExpr}
	 * labeled alternative in {@link GrammaticaParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeExpr(GrammaticaParser.LeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code geExpr}
	 * labeled alternative in {@link GrammaticaParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeExpr(GrammaticaParser.GeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link GrammaticaParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(GrammaticaParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neExpr}
	 * labeled alternative in {@link GrammaticaParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeExpr(GrammaticaParser.NeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toAdd}
	 * labeled alternative in {@link GrammaticaParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAdd(GrammaticaParser.ToAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExprOp}
	 * labeled alternative in {@link GrammaticaParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprOp(GrammaticaParser.AddExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExprOp}
	 * labeled alternative in {@link GrammaticaParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExprOp(GrammaticaParser.MulExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExprOp}
	 * labeled alternative in {@link GrammaticaParser#powExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExprOp(GrammaticaParser.PowExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link GrammaticaParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(GrammaticaParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toAtom}
	 * labeled alternative in {@link GrammaticaParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(GrammaticaParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GrammaticaParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(GrammaticaParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link GrammaticaParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(GrammaticaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link GrammaticaParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpr(GrammaticaParser.InputExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toStrExpr}
	 * labeled alternative in {@link GrammaticaParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToStrExpr(GrammaticaParser.ToStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammaticaParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(GrammaticaParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link GrammaticaParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(GrammaticaParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link GrammaticaParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(GrammaticaParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link GrammaticaParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(GrammaticaParser.ParensExprContext ctx);
}