// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/ELABORATO/elaborato_linguaggi/src/myLang/Grammatica.g4 by ANTLR 4.13.2
package myLang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammaticaVisitor<T> extends ParseTreeVisitor<T> {
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
	 * Visit a parse tree produced by {@link GrammaticaParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GrammaticaParser.IfStmtContext ctx);
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
	 * Visit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(GrammaticaParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code geExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeExpr(GrammaticaParser.GeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(GrammaticaParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(GrammaticaParser.ModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(GrammaticaParser.GtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpr(GrammaticaParser.InputExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeExpr(GrammaticaParser.NeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(GrammaticaParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(GrammaticaParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatExpr(GrammaticaParser.ConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(GrammaticaParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(GrammaticaParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(GrammaticaParser.LtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(GrammaticaParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(GrammaticaParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeExpr(GrammaticaParser.LeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(GrammaticaParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(GrammaticaParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(GrammaticaParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(GrammaticaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(GrammaticaParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(GrammaticaParser.IdExprContext ctx);
}