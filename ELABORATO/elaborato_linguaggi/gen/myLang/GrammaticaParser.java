// Generated from /Users/simo/Downloads/Implementazione-Linguaggio-di-Programmazione-main/ELABORATO/elaborato_linguaggi/src/myLang/GrammaticaParser.g4 by ANTLR 4.13.2
package myLang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SLY_START=1, ARNOLD=2, PRINT=3, WHILE=4, IF=5, ELSE=6, FOR=7, VAR=8, ND=9, 
		FUN=10, RET=11, INPUT=12, STR_KW=13, SEMICOLON=14, COMMA=15, DOT=16, LPAREN=17, 
		RPAREN=18, LBRACK=19, RBRACK=20, LBRACE=21, RBRACE=22, GE=23, LE=24, EQ=25, 
		NE=26, AND=27, OR=28, NOT=29, POW=30, MUL=31, DIV=32, MOD=33, ASSIGN=34, 
		LT=35, GT=36, CONCAT=37, PLUS=38, MINUS=39, ID=40, FLOAT=41, INT=42, STRING=43, 
		WS=44, COMMENT=45, BF_WS=46, BF_LT=47, BF_GT=48, BF_PLUS=49, BF_MINUS=50, 
		BF_DOT=51, BF_COMMA=52, BF_LBRAK=53, BF_RBRAK=54, BF_RBRACE=55, BF_OTHER=56;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_otherStmt = 2, RULE_varDecl = 3, 
		RULE_assignStmt = 4, RULE_printStmt = 5, RULE_exprStmt = 6, RULE_whileStmt = 7, 
		RULE_ifStmt = 8, RULE_forStmt = 9, RULE_forInit = 10, RULE_forUpdate = 11, 
		RULE_block = 12, RULE_nonDetStmt = 13, RULE_funDecl = 14, RULE_retStmt = 15, 
		RULE_slyStmt = 16, RULE_bfProgram = 17, RULE_bfCommand = 18, RULE_expr = 19, 
		RULE_strExpr = 20, RULE_exprStrPart = 21, RULE_arithExpr = 22, RULE_compExpr = 23, 
		RULE_addExpr = 24, RULE_multExpr = 25, RULE_powExpr = 26, RULE_unaryExpr = 27, 
		RULE_atomExpr = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "otherStmt", "varDecl", "assignStmt", "printStmt", 
			"exprStmt", "whileStmt", "ifStmt", "forStmt", "forInit", "forUpdate", 
			"block", "nonDetStmt", "funDecl", "retStmt", "slyStmt", "bfProgram", 
			"bfCommand", "expr", "strExpr", "exprStrPart", "arithExpr", "compExpr", 
			"addExpr", "multExpr", "powExpr", "unaryExpr", "atomExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'arnold'", "'print'", "'while'", "'if'", "'else'", "'for'", 
			"'var'", "'ND'", "'fun'", "'ret'", "'input'", "'str'", "';'", null, null, 
			"'('", "')'", null, null, "'{'", null, "'>='", "'<='", "'=='", "'!='", 
			"'&&'", "'||'", "'!'", "'^'", "'*'", "'/'", "'%'", "'='", null, null, 
			"'++'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SLY_START", "ARNOLD", "PRINT", "WHILE", "IF", "ELSE", "FOR", "VAR", 
			"ND", "FUN", "RET", "INPUT", "STR_KW", "SEMICOLON", "COMMA", "DOT", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "GE", "LE", "EQ", "NE", 
			"AND", "OR", "NOT", "POW", "MUL", "DIV", "MOD", "ASSIGN", "LT", "GT", 
			"CONCAT", "PLUS", "MINUS", "ID", "FLOAT", "INT", "STRING", "WS", "COMMENT", 
			"BF_WS", "BF_LT", "BF_GT", "BF_PLUS", "BF_MINUS", "BF_DOT", "BF_COMMA", 
			"BF_LBRAK", "BF_RBRAK", "BF_RBRACE", "BF_OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammaticaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammaticaParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042432474554L) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SlyStmtContext slyStmt() {
			return getRuleContext(SlyStmtContext.class,0);
		}
		public OtherStmtContext otherStmt() {
			return getRuleContext(OtherStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SLY_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				slyStmt();
				}
				break;
			case PRINT:
			case WHILE:
			case IF:
			case FOR:
			case VAR:
			case FUN:
			case RET:
			case INPUT:
			case STR_KW:
			case LPAREN:
			case LBRACE:
			case MINUS:
			case ID:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				otherStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OtherStmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public NonDetStmtContext nonDetStmt() {
			return getRuleContext(NonDetStmtContext.class,0);
		}
		public FunDeclContext funDecl() {
			return getRuleContext(FunDeclContext.class,0);
		}
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
		}
		public OtherStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterOtherStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitOtherStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitOtherStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherStmtContext otherStmt() throws RecognitionException {
		OtherStmtContext _localctx = new OtherStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_otherStmt);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				printStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				exprStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				ifStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				forStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				nonDetStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				funDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				retStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GrammaticaParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammaticaParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(GrammaticaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GrammaticaParser.RBRACK, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammaticaParser.SEMICOLON, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(VAR);
			setState(83);
			match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(84);
				match(LBRACK);
				setState(85);
				expr();
				setState(86);
				match(RBRACK);
				}
			}

			setState(90);
			match(ASSIGN);
			setState(91);
			expr();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(92);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammaticaParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammaticaParser.SEMICOLON, 0); }
		public TerminalNode LBRACK() { return getToken(GrammaticaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GrammaticaParser.RBRACK, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStmt);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ID);
				setState(96);
				match(ASSIGN);
				setState(97);
				expr();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(98);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(ID);
				setState(102);
				match(LBRACK);
				setState(103);
				expr();
				setState(104);
				match(RBRACK);
				setState(105);
				match(ASSIGN);
				setState(106);
				expr();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(107);
					match(SEMICOLON);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammaticaParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammaticaParser.SEMICOLON, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PRINT);
			setState(113);
			match(LPAREN);
			setState(114);
			expr();
			setState(115);
			match(RPAREN);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(116);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammaticaParser.SEMICOLON, 0); }
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			expr();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(120);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammaticaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(WHILE);
			setState(124);
			match(LPAREN);
			setState(125);
			expr();
			setState(126);
			match(RPAREN);
			setState(127);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammaticaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GrammaticaParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IF);
			setState(130);
			match(LPAREN);
			setState(131);
			expr();
			setState(132);
			match(RPAREN);
			setState(133);
			block();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(134);
				match(ELSE);
				setState(135);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammaticaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammaticaParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(FOR);
			setState(139);
			match(LPAREN);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==ID) {
				{
				setState(140);
				forInit();
				}
			}

			setState(143);
			match(SEMICOLON);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042430373888L) != 0)) {
				{
				setState(144);
				expr();
				}
			}

			setState(147);
			match(SEMICOLON);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(148);
				forUpdate();
				}
			}

			setState(151);
			match(RPAREN);
			setState(152);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GrammaticaParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammaticaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forInit);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(VAR);
				setState(155);
				match(ID);
				setState(156);
				match(ASSIGN);
				setState(157);
				expr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(ID);
				setState(159);
				match(ASSIGN);
				setState(160);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammaticaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
			setState(164);
			match(ASSIGN);
			setState(165);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GrammaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammaticaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(LBRACE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042432474554L) != 0)) {
				{
				{
				setState(168);
				statement();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonDetStmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ND() { return getToken(GrammaticaParser.ND, 0); }
		public TerminalNode LBRACK() { return getToken(GrammaticaParser.LBRACK, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(GrammaticaParser.RBRACK, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammaticaParser.SEMICOLON, 0); }
		public NonDetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonDetStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterNonDetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitNonDetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitNonDetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonDetStmtContext nonDetStmt() throws RecognitionException {
		NonDetStmtContext _localctx = new NonDetStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nonDetStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			block();
			setState(177);
			match(ND);
			setState(178);
			match(LBRACK);
			setState(179);
			statement();
			setState(180);
			match(RBRACK);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(181);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(GrammaticaParser.FUN, 0); }
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitFunDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitFunDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FUN);
			setState(185);
			match(ID);
			setState(186);
			match(LPAREN);
			setState(187);
			match(RPAREN);
			setState(188);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetStmtContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(GrammaticaParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammaticaParser.SEMICOLON, 0); }
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterRetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitRetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitRetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(RET);
			setState(191);
			expr();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(192);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlyStmtContext extends ParserRuleContext {
		public TerminalNode SLY_START() { return getToken(GrammaticaParser.SLY_START, 0); }
		public BfProgramContext bfProgram() {
			return getRuleContext(BfProgramContext.class,0);
		}
		public TerminalNode BF_RBRACE() { return getToken(GrammaticaParser.BF_RBRACE, 0); }
		public TerminalNode ARNOLD() { return getToken(GrammaticaParser.ARNOLD, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammaticaParser.SEMICOLON, 0); }
		public SlyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterSlyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitSlyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitSlyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlyStmtContext slyStmt() throws RecognitionException {
		SlyStmtContext _localctx = new SlyStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_slyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(SLY_START);
			setState(196);
			bfProgram();
			setState(197);
			match(BF_RBRACE);
			setState(198);
			match(ARNOLD);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(199);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BfProgramContext extends ParserRuleContext {
		public List<BfCommandContext> bfCommand() {
			return getRuleContexts(BfCommandContext.class);
		}
		public BfCommandContext bfCommand(int i) {
			return getRuleContext(BfCommandContext.class,i);
		}
		public BfProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBfProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBfProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBfProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfProgramContext bfProgram() throws RecognitionException {
		BfProgramContext _localctx = new BfProgramContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bfProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17873661021126656L) != 0)) {
				{
				{
				setState(202);
				bfCommand();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BfCommandContext extends ParserRuleContext {
		public BfCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfCommand; }
	 
		public BfCommandContext() { }
		public void copyFrom(BfCommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfLtContext extends BfCommandContext {
		public TerminalNode BF_LT() { return getToken(GrammaticaParser.BF_LT, 0); }
		public BfLtContext(BfCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBfLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBfLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBfLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfMinusContext extends BfCommandContext {
		public TerminalNode BF_MINUS() { return getToken(GrammaticaParser.BF_MINUS, 0); }
		public BfMinusContext(BfCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBfMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBfMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBfMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfDotContext extends BfCommandContext {
		public TerminalNode BF_DOT() { return getToken(GrammaticaParser.BF_DOT, 0); }
		public BfDotContext(BfCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBfDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBfDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBfDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfLoopContext extends BfCommandContext {
		public TerminalNode BF_LBRAK() { return getToken(GrammaticaParser.BF_LBRAK, 0); }
		public BfProgramContext bfProgram() {
			return getRuleContext(BfProgramContext.class,0);
		}
		public TerminalNode BF_RBRAK() { return getToken(GrammaticaParser.BF_RBRAK, 0); }
		public BfLoopContext(BfCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBfLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBfLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBfLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfCommaContext extends BfCommandContext {
		public TerminalNode BF_COMMA() { return getToken(GrammaticaParser.BF_COMMA, 0); }
		public BfCommaContext(BfCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBfComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBfComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBfComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfPlusContext extends BfCommandContext {
		public TerminalNode BF_PLUS() { return getToken(GrammaticaParser.BF_PLUS, 0); }
		public BfPlusContext(BfCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBfPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBfPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBfPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfGtContext extends BfCommandContext {
		public TerminalNode BF_GT() { return getToken(GrammaticaParser.BF_GT, 0); }
		public BfGtContext(BfCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterBfGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitBfGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitBfGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfCommandContext bfCommand() throws RecognitionException {
		BfCommandContext _localctx = new BfCommandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bfCommand);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BF_LT:
				_localctx = new BfLtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(BF_LT);
				}
				break;
			case BF_GT:
				_localctx = new BfGtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(BF_GT);
				}
				break;
			case BF_PLUS:
				_localctx = new BfPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(BF_PLUS);
				}
				break;
			case BF_MINUS:
				_localctx = new BfMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(BF_MINUS);
				}
				break;
			case BF_DOT:
				_localctx = new BfDotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(BF_DOT);
				}
				break;
			case BF_COMMA:
				_localctx = new BfCommaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				match(BF_COMMA);
				}
				break;
			case BF_LBRAK:
				_localctx = new BfLoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				match(BF_LBRAK);
				setState(215);
				bfProgram();
				setState(216);
				match(BF_RBRAK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStrContext extends ExprContext {
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public ExprStrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterExprStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitExprStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitExprStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArithContext extends ExprContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public ExprArithContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterExprArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitExprArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitExprArith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ExprArithContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				arithExpr();
				}
				break;
			case 2:
				_localctx = new ExprStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				strExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrExprContext extends ParserRuleContext {
		public StrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strExpr; }
	 
		public StrExprContext() { }
		public void copyFrom(StrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatExprContext extends StrExprContext {
		public List<ExprStrPartContext> exprStrPart() {
			return getRuleContexts(ExprStrPartContext.class);
		}
		public ExprStrPartContext exprStrPart(int i) {
			return getRuleContext(ExprStrPartContext.class,i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(GrammaticaParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(GrammaticaParser.CONCAT, i);
		}
		public ConcatExprContext(StrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitConcatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitConcatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrExprContext strExpr() throws RecognitionException {
		StrExprContext _localctx = new StrExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_strExpr);
		int _la;
		try {
			_localctx = new ConcatExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			exprStrPart();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCAT) {
				{
				{
				setState(225);
				match(CONCAT);
				setState(226);
				exprStrPart();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStrPartContext extends ParserRuleContext {
		public ExprStrPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStrPart; }
	 
		public ExprStrPartContext() { }
		public void copyFrom(ExprStrPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdInStrExprContext extends ExprStrPartContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public IdInStrExprContext(ExprStrPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterIdInStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitIdInStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitIdInStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToStrInStrExprContext extends ExprStrPartContext {
		public TerminalNode STR_KW() { return getToken(GrammaticaParser.STR_KW, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public ToStrInStrExprContext(ExprStrPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterToStrInStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitToStrInStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitToStrInStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputInStrExprContext extends ExprStrPartContext {
		public TerminalNode INPUT() { return getToken(GrammaticaParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public InputInStrExprContext(ExprStrPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterInputInStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitInputInStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitInputInStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringInStrExprContext extends ExprStrPartContext {
		public TerminalNode STRING() { return getToken(GrammaticaParser.STRING, 0); }
		public StringInStrExprContext(ExprStrPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterStringInStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitStringInStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitStringInStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensStrExprContext extends ExprStrPartContext {
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public ParensStrExprContext(ExprStrPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterParensStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitParensStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitParensStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStrPartContext exprStrPart() throws RecognitionException {
		ExprStrPartContext _localctx = new ExprStrPartContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprStrPart);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR_KW:
				_localctx = new ToStrInStrExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(STR_KW);
				setState(233);
				match(LPAREN);
				setState(234);
				arithExpr();
				setState(235);
				match(RPAREN);
				}
				break;
			case STRING:
				_localctx = new StringInStrExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(STRING);
				}
				break;
			case ID:
				_localctx = new IdInStrExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(ID);
				}
				break;
			case INPUT:
				_localctx = new InputInStrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(INPUT);
				setState(240);
				match(LPAREN);
				setState(241);
				match(RPAREN);
				}
				break;
			case LPAREN:
				_localctx = new ParensStrExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(LPAREN);
				setState(243);
				strExpr();
				setState(244);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithExprContext extends ParserRuleContext {
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitArithExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arithExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			compExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends ParserRuleContext {
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
	 
		public CompExprContext() { }
		public void copyFrom(CompExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeExprContext extends CompExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode GE() { return getToken(GrammaticaParser.GE, 0); }
		public GeExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterGeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitGeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitGeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToAddContext extends CompExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public ToAddContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterToAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitToAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitToAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtExprContext extends CompExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(GrammaticaParser.LT, 0); }
		public LtExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends CompExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(GrammaticaParser.EQ, 0); }
		public EqExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtExprContext extends CompExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(GrammaticaParser.GT, 0); }
		public GtExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeExprContext extends CompExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(GrammaticaParser.LE, 0); }
		public LeExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterLeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitLeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitLeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeExprContext extends CompExprContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode NE() { return getToken(GrammaticaParser.NE, 0); }
		public NeExprContext(CompExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterNeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitNeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitNeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compExpr);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new LtExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				addExpr();
				setState(251);
				match(LT);
				setState(252);
				addExpr();
				}
				break;
			case 2:
				_localctx = new GtExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				addExpr();
				setState(255);
				match(GT);
				setState(256);
				addExpr();
				}
				break;
			case 3:
				_localctx = new LeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				addExpr();
				setState(259);
				match(LE);
				setState(260);
				addExpr();
				}
				break;
			case 4:
				_localctx = new GeExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				addExpr();
				setState(263);
				match(GE);
				setState(264);
				addExpr();
				}
				break;
			case 5:
				_localctx = new EqExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				addExpr();
				setState(267);
				match(EQ);
				setState(268);
				addExpr();
				}
				break;
			case 6:
				_localctx = new NeExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				addExpr();
				setState(271);
				match(NE);
				setState(272);
				addExpr();
				}
				break;
			case 7:
				_localctx = new ToAddContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				addExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ParserRuleContext {
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	 
		public AddExprContext() { }
		public void copyFrom(AddExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprOpContext extends AddExprContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(GrammaticaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(GrammaticaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GrammaticaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GrammaticaParser.MINUS, i);
		}
		public AddExprOpContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterAddExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitAddExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitAddExprOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_addExpr);
		int _la;
		try {
			int _alt;
			_localctx = new AddExprOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			multExpr();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(279);
					multExpr();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultExprContext extends ParserRuleContext {
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	 
		public MultExprContext() { }
		public void copyFrom(MultExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprOpContext extends MultExprContext {
		public List<PowExprContext> powExpr() {
			return getRuleContexts(PowExprContext.class);
		}
		public PowExprContext powExpr(int i) {
			return getRuleContext(PowExprContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(GrammaticaParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(GrammaticaParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(GrammaticaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(GrammaticaParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(GrammaticaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(GrammaticaParser.MOD, i);
		}
		public MulExprOpContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterMulExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitMulExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitMulExprOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multExpr);
		int _la;
		try {
			_localctx = new MulExprOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			powExpr();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) {
				{
				{
				setState(286);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(287);
				powExpr();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ParserRuleContext {
		public PowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpr; }
	 
		public PowExprContext() { }
		public void copyFrom(PowExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprOpContext extends PowExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode POW() { return getToken(GrammaticaParser.POW, 0); }
		public PowExprContext powExpr() {
			return getRuleContext(PowExprContext.class,0);
		}
		public PowExprOpContext(PowExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterPowExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitPowExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitPowExprOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExprContext powExpr() throws RecognitionException {
		PowExprContext _localctx = new PowExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_powExpr);
		int _la;
		try {
			_localctx = new PowExprOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			unaryExpr();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(294);
				match(POW);
				setState(295);
				powExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToAtomContext extends UnaryExprContext {
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public ToAtomContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterToAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitToAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends UnaryExprContext {
		public TerminalNode MINUS() { return getToken(GrammaticaParser.MINUS, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryMinusContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryExpr);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new UnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(MINUS);
				setState(299);
				unaryExpr();
				}
				break;
			case INPUT:
			case STR_KW:
			case LPAREN:
			case ID:
			case FLOAT:
			case INT:
				_localctx = new ToAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				atomExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ParserRuleContext {
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
	 
		public AtomExprContext() { }
		public void copyFrom(AtomExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatExprContext extends AtomExprContext {
		public TerminalNode FLOAT() { return getToken(GrammaticaParser.FLOAT, 0); }
		public FloatExprContext(AtomExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends AtomExprContext {
		public TerminalNode INT() { return getToken(GrammaticaParser.INT, 0); }
		public IntExprContext(AtomExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputExprContext extends AtomExprContext {
		public TerminalNode INPUT() { return getToken(GrammaticaParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public InputExprContext(AtomExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterInputExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitInputExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitInputExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToStrExprContext extends AtomExprContext {
		public TerminalNode STR_KW() { return getToken(GrammaticaParser.STR_KW, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public ToStrExprContext(AtomExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterToStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitToStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitToStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends AtomExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(GrammaticaParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(GrammaticaParser.RBRACK, 0); }
		public ArrayAccessContext(AtomExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensExprContext extends AtomExprContext {
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public ParensExprContext(AtomExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends AtomExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public CallExprContext(AtomExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends AtomExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public IdExprContext(AtomExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atomExpr);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(ID);
				setState(304);
				match(LPAREN);
				setState(305);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(ID);
				setState(307);
				match(LBRACK);
				setState(308);
				expr();
				setState(309);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new InputExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(INPUT);
				setState(312);
				match(LPAREN);
				setState(313);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ToStrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(STR_KW);
				setState(315);
				match(LPAREN);
				setState(316);
				arithExpr();
				setState(317);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				match(ID);
				}
				break;
			case 6:
				_localctx = new FloatExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				match(FLOAT);
				}
				break;
			case 7:
				_localctx = new IntExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
				match(INT);
				}
				break;
			case 8:
				_localctx = new ParensExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(322);
				match(LPAREN);
				setState(323);
				expr();
				setState(324);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u0149\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"E\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003^\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0003\u0004"+
		"o\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005v\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006z\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0089\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u008e\b\t\u0001\t\u0001\t\u0003\t\u0092\b\t"+
		"\u0001\t\u0001\t\u0003\t\u0096\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a2\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\u00aa\b\f"+
		"\n\f\f\f\u00ad\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00b7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00c2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00c9\b\u0010\u0001\u0011\u0005\u0011\u00cc\b\u0011"+
		"\n\u0011\f\u0011\u00cf\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00db\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00df"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e4\b\u0014"+
		"\n\u0014\f\u0014\u00e7\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f7"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0114\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0119\b\u0018\n\u0018\f\u0018"+
		"\u011c\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0121\b"+
		"\u0019\n\u0019\f\u0019\u0124\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0129\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u012e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0147\b\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468\u0000\u0002\u0001\u0000&\'\u0001\u0000\u001f!\u0164\u0000"+
		"=\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004P\u0001"+
		"\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000"+
		"\u0000\np\u0001\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000e{\u0001"+
		"\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u008a\u0001"+
		"\u0000\u0000\u0000\u0014\u00a1\u0001\u0000\u0000\u0000\u0016\u00a3\u0001"+
		"\u0000\u0000\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00b0\u0001"+
		"\u0000\u0000\u0000\u001c\u00b8\u0001\u0000\u0000\u0000\u001e\u00be\u0001"+
		"\u0000\u0000\u0000 \u00c3\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000"+
		"\u0000\u0000$\u00da\u0001\u0000\u0000\u0000&\u00de\u0001\u0000\u0000\u0000"+
		"(\u00e0\u0001\u0000\u0000\u0000*\u00f6\u0001\u0000\u0000\u0000,\u00f8"+
		"\u0001\u0000\u0000\u0000.\u0113\u0001\u0000\u0000\u00000\u0115\u0001\u0000"+
		"\u0000\u00002\u011d\u0001\u0000\u0000\u00004\u0125\u0001\u0000\u0000\u0000"+
		"6\u012d\u0001\u0000\u0000\u00008\u0146\u0001\u0000\u0000\u0000:<\u0003"+
		"\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0000\u0000\u0001A\u0001\u0001"+
		"\u0000\u0000\u0000BE\u0003 \u0010\u0000CE\u0003\u0004\u0002\u0000DB\u0001"+
		"\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0003\u0001\u0000\u0000"+
		"\u0000FQ\u0003\u0006\u0003\u0000GQ\u0003\b\u0004\u0000HQ\u0003\n\u0005"+
		"\u0000IQ\u0003\f\u0006\u0000JQ\u0003\u000e\u0007\u0000KQ\u0003\u0010\b"+
		"\u0000LQ\u0003\u0012\t\u0000MQ\u0003\u001a\r\u0000NQ\u0003\u001c\u000e"+
		"\u0000OQ\u0003\u001e\u000f\u0000PF\u0001\u0000\u0000\u0000PG\u0001\u0000"+
		"\u0000\u0000PH\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PJ\u0001"+
		"\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000"+
		"PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000Q\u0005\u0001\u0000\u0000\u0000RS\u0005\b\u0000\u0000SX\u0005(\u0000"+
		"\u0000TU\u0005\u0013\u0000\u0000UV\u0003&\u0013\u0000VW\u0005\u0014\u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005\"\u0000\u0000[]\u0003&"+
		"\u0013\u0000\\^\u0005\u000e\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\u0007\u0001\u0000\u0000\u0000_`\u0005(\u0000\u0000"+
		"`a\u0005\"\u0000\u0000ac\u0003&\u0013\u0000bd\u0005\u000e\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000do\u0001\u0000\u0000"+
		"\u0000ef\u0005(\u0000\u0000fg\u0005\u0013\u0000\u0000gh\u0003&\u0013\u0000"+
		"hi\u0005\u0014\u0000\u0000ij\u0005\"\u0000\u0000jl\u0003&\u0013\u0000"+
		"km\u0005\u000e\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mo\u0001\u0000\u0000\u0000n_\u0001\u0000\u0000\u0000ne\u0001\u0000"+
		"\u0000\u0000o\t\u0001\u0000\u0000\u0000pq\u0005\u0003\u0000\u0000qr\u0005"+
		"\u0011\u0000\u0000rs\u0003&\u0013\u0000su\u0005\u0012\u0000\u0000tv\u0005"+
		"\u000e\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"v\u000b\u0001\u0000\u0000\u0000wy\u0003&\u0013\u0000xz\u0005\u000e\u0000"+
		"\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\r\u0001\u0000"+
		"\u0000\u0000{|\u0005\u0004\u0000\u0000|}\u0005\u0011\u0000\u0000}~\u0003"+
		"&\u0013\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0080\u0003\u0018\f"+
		"\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0005\u0000"+
		"\u0000\u0082\u0083\u0005\u0011\u0000\u0000\u0083\u0084\u0003&\u0013\u0000"+
		"\u0084\u0085\u0005\u0012\u0000\u0000\u0085\u0088\u0003\u0018\f\u0000\u0086"+
		"\u0087\u0005\u0006\u0000\u0000\u0087\u0089\u0003\u0018\f\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0011"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0007\u0000\u0000\u008b\u008d"+
		"\u0005\u0011\u0000\u0000\u008c\u008e\u0003\u0014\n\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0005\u000e\u0000\u0000\u0090\u0092\u0003"+
		"&\u0013\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u000e"+
		"\u0000\u0000\u0094\u0096\u0003\u0016\u000b\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0012\u0000\u0000\u0098\u0099\u0003\u0018"+
		"\f\u0000\u0099\u0013\u0001\u0000\u0000\u0000\u009a\u009b\u0005\b\u0000"+
		"\u0000\u009b\u009c\u0005(\u0000\u0000\u009c\u009d\u0005\"\u0000\u0000"+
		"\u009d\u00a2\u0003&\u0013\u0000\u009e\u009f\u0005(\u0000\u0000\u009f\u00a0"+
		"\u0005\"\u0000\u0000\u00a0\u00a2\u0003&\u0013\u0000\u00a1\u009a\u0001"+
		"\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a2\u0015\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005(\u0000\u0000\u00a4\u00a5\u0005\""+
		"\u0000\u0000\u00a5\u00a6\u0003&\u0013\u0000\u00a6\u0017\u0001\u0000\u0000"+
		"\u0000\u00a7\u00ab\u0005\u0015\u0000\u0000\u00a8\u00aa\u0003\u0002\u0001"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005\u0016\u0000\u0000\u00af\u0019\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0003\u0018\f\u0000\u00b1\u00b2\u0005\t\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0013\u0000\u0000\u00b3\u00b4\u0003\u0002\u0001\u0000"+
		"\u00b4\u00b6\u0005\u0014\u0000\u0000\u00b5\u00b7\u0005\u000e\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u001b\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9"+
		"\u00ba\u0005(\u0000\u0000\u00ba\u00bb\u0005\u0011\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0012\u0000\u0000\u00bc\u00bd\u0003\u0018\f\u0000\u00bd\u001d\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\u000b\u0000\u0000\u00bf\u00c1\u0003"+
		"&\u0013\u0000\u00c0\u00c2\u0005\u000e\u0000\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u001f\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0001\u0000\u0000\u00c4\u00c5\u0003\"\u0011"+
		"\u0000\u00c5\u00c6\u00057\u0000\u0000\u00c6\u00c8\u0005\u0002\u0000\u0000"+
		"\u00c7\u00c9\u0005\u000e\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cc\u0003$\u0012\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d0\u00db\u0005/\u0000\u0000\u00d1\u00db\u00050\u0000"+
		"\u0000\u00d2\u00db\u00051\u0000\u0000\u00d3\u00db\u00052\u0000\u0000\u00d4"+
		"\u00db\u00053\u0000\u0000\u00d5\u00db\u00054\u0000\u0000\u00d6\u00d7\u0005"+
		"5\u0000\u0000\u00d7\u00d8\u0003\"\u0011\u0000\u00d8\u00d9\u00056\u0000"+
		"\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d0\u0001\u0000\u0000"+
		"\u0000\u00da\u00d1\u0001\u0000\u0000\u0000\u00da\u00d2\u0001\u0000\u0000"+
		"\u0000\u00da\u00d3\u0001\u0000\u0000\u0000\u00da\u00d4\u0001\u0000\u0000"+
		"\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00da\u00d6\u0001\u0000\u0000"+
		"\u0000\u00db%\u0001\u0000\u0000\u0000\u00dc\u00df\u0003,\u0016\u0000\u00dd"+
		"\u00df\u0003(\u0014\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\'\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003"+
		"*\u0015\u0000\u00e1\u00e2\u0005%\u0000\u0000\u00e2\u00e4\u0003*\u0015"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6)\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005\r\u0000\u0000\u00e9\u00ea\u0005\u0011\u0000\u0000\u00ea"+
		"\u00eb\u0003,\u0016\u0000\u00eb\u00ec\u0005\u0012\u0000\u0000\u00ec\u00f7"+
		"\u0001\u0000\u0000\u0000\u00ed\u00f7\u0005+\u0000\u0000\u00ee\u00f7\u0005"+
		"(\u0000\u0000\u00ef\u00f0\u0005\f\u0000\u0000\u00f0\u00f1\u0005\u0011"+
		"\u0000\u0000\u00f1\u00f7\u0005\u0012\u0000\u0000\u00f2\u00f3\u0005\u0011"+
		"\u0000\u0000\u00f3\u00f4\u0003(\u0014\u0000\u00f4\u00f5\u0005\u0012\u0000"+
		"\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00e8\u0001\u0000\u0000"+
		"\u0000\u00f6\u00ed\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f6\u00ef\u0001\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f7+\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003.\u0017\u0000\u00f9"+
		"-\u0001\u0000\u0000\u0000\u00fa\u00fb\u00030\u0018\u0000\u00fb\u00fc\u0005"+
		"#\u0000\u0000\u00fc\u00fd\u00030\u0018\u0000\u00fd\u0114\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u00030\u0018\u0000\u00ff\u0100\u0005$\u0000\u0000\u0100"+
		"\u0101\u00030\u0018\u0000\u0101\u0114\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u00030\u0018\u0000\u0103\u0104\u0005\u0018\u0000\u0000\u0104\u0105\u0003"+
		"0\u0018\u0000\u0105\u0114\u0001\u0000\u0000\u0000\u0106\u0107\u00030\u0018"+
		"\u0000\u0107\u0108\u0005\u0017\u0000\u0000\u0108\u0109\u00030\u0018\u0000"+
		"\u0109\u0114\u0001\u0000\u0000\u0000\u010a\u010b\u00030\u0018\u0000\u010b"+
		"\u010c\u0005\u0019\u0000\u0000\u010c\u010d\u00030\u0018\u0000\u010d\u0114"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u00030\u0018\u0000\u010f\u0110\u0005"+
		"\u001a\u0000\u0000\u0110\u0111\u00030\u0018\u0000\u0111\u0114\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u00030\u0018\u0000\u0113\u00fa\u0001\u0000\u0000"+
		"\u0000\u0113\u00fe\u0001\u0000\u0000\u0000\u0113\u0102\u0001\u0000\u0000"+
		"\u0000\u0113\u0106\u0001\u0000\u0000\u0000\u0113\u010a\u0001\u0000\u0000"+
		"\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0114/\u0001\u0000\u0000\u0000\u0115\u011a\u00032\u0019\u0000\u0116"+
		"\u0117\u0007\u0000\u0000\u0000\u0117\u0119\u00032\u0019\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b1\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0122\u0003"+
		"4\u001a\u0000\u011e\u011f\u0007\u0001\u0000\u0000\u011f\u0121\u00034\u001a"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u01233\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0125\u0128\u00036\u001b\u0000\u0126\u0127\u0005\u001e\u0000\u0000\u0127"+
		"\u0129\u00034\u001a\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0001\u0000\u0000\u0000\u01295\u0001\u0000\u0000\u0000\u012a\u012b\u0005"+
		"\'\u0000\u0000\u012b\u012e\u00036\u001b\u0000\u012c\u012e\u00038\u001c"+
		"\u0000\u012d\u012a\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000\u0000"+
		"\u0000\u012e7\u0001\u0000\u0000\u0000\u012f\u0130\u0005(\u0000\u0000\u0130"+
		"\u0131\u0005\u0011\u0000\u0000\u0131\u0147\u0005\u0012\u0000\u0000\u0132"+
		"\u0133\u0005(\u0000\u0000\u0133\u0134\u0005\u0013\u0000\u0000\u0134\u0135"+
		"\u0003&\u0013\u0000\u0135\u0136\u0005\u0014\u0000\u0000\u0136\u0147\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005\f\u0000\u0000\u0138\u0139\u0005\u0011"+
		"\u0000\u0000\u0139\u0147\u0005\u0012\u0000\u0000\u013a\u013b\u0005\r\u0000"+
		"\u0000\u013b\u013c\u0005\u0011\u0000\u0000\u013c\u013d\u0003,\u0016\u0000"+
		"\u013d\u013e\u0005\u0012\u0000\u0000\u013e\u0147\u0001\u0000\u0000\u0000"+
		"\u013f\u0147\u0005(\u0000\u0000\u0140\u0147\u0005)\u0000\u0000\u0141\u0147"+
		"\u0005*\u0000\u0000\u0142\u0143\u0005\u0011\u0000\u0000\u0143\u0144\u0003"+
		"&\u0013\u0000\u0144\u0145\u0005\u0012\u0000\u0000\u0145\u0147\u0001\u0000"+
		"\u0000\u0000\u0146\u012f\u0001\u0000\u0000\u0000\u0146\u0132\u0001\u0000"+
		"\u0000\u0000\u0146\u0137\u0001\u0000\u0000\u0000\u0146\u013a\u0001\u0000"+
		"\u0000\u0000\u0146\u013f\u0001\u0000\u0000\u0000\u0146\u0140\u0001\u0000"+
		"\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146\u0142\u0001\u0000"+
		"\u0000\u0000\u01479\u0001\u0000\u0000\u0000\u001e=DPX]clnuy\u0088\u008d"+
		"\u0091\u0095\u00a1\u00ab\u00b6\u00c1\u00c8\u00cd\u00da\u00de\u00e5\u00f6"+
		"\u0113\u011a\u0122\u0128\u012d\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}