// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/ELABORATO/elaborato_linguaggi/src/myLang/GrammaticaParser.g4 by ANTLR 4.13.2
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
		RULE_slyStmt = 16, RULE_bfProgram = 17, RULE_bfCommand = 18, RULE_expr = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "otherStmt", "varDecl", "assignStmt", "printStmt", 
			"exprStmt", "whileStmt", "ifStmt", "forStmt", "forInit", "forUpdate", 
			"block", "nonDetStmt", "funDecl", "retStmt", "slyStmt", "bfProgram", 
			"bfCommand", "expr"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042432474554L) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SLY_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
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
				setState(49);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				printStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				exprStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				ifStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				forStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				nonDetStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				funDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(61);
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
		public TerminalNode SEMICOLON() { return getToken(GrammaticaParser.SEMICOLON, 0); }
		public TerminalNode LBRACK() { return getToken(GrammaticaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GrammaticaParser.RBRACK, 0); }
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
			setState(64);
			match(VAR);
			setState(65);
			match(ID);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(66);
				match(LBRACK);
				setState(67);
				expr(0);
				setState(68);
				match(RBRACK);
				}
			}

			setState(72);
			match(ASSIGN);
			setState(73);
			expr(0);
			setState(74);
			match(SEMICOLON);
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
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(ID);
				setState(77);
				match(ASSIGN);
				setState(78);
				expr(0);
				setState(79);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(ID);
				setState(82);
				match(LBRACK);
				setState(83);
				expr(0);
				setState(84);
				match(RBRACK);
				setState(85);
				match(ASSIGN);
				setState(86);
				expr(0);
				setState(87);
				match(SEMICOLON);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PRINT);
			setState(92);
			match(LPAREN);
			setState(93);
			expr(0);
			setState(94);
			match(RPAREN);
			setState(95);
			match(SEMICOLON);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			expr(0);
			setState(98);
			match(SEMICOLON);
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
			setState(100);
			match(WHILE);
			setState(101);
			match(LPAREN);
			setState(102);
			expr(0);
			setState(103);
			match(RPAREN);
			setState(104);
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
			setState(106);
			match(IF);
			setState(107);
			match(LPAREN);
			setState(108);
			expr(0);
			setState(109);
			match(RPAREN);
			setState(110);
			block();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(111);
				match(ELSE);
				setState(112);
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
			setState(115);
			match(FOR);
			setState(116);
			match(LPAREN);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==ID) {
				{
				setState(117);
				forInit();
				}
			}

			setState(120);
			match(SEMICOLON);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042430373888L) != 0)) {
				{
				setState(121);
				expr(0);
				}
			}

			setState(124);
			match(SEMICOLON);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(125);
				forUpdate();
				}
			}

			setState(128);
			match(RPAREN);
			setState(129);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(VAR);
				setState(132);
				match(ID);
				setState(133);
				match(ASSIGN);
				setState(134);
				expr(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(ID);
				setState(136);
				match(ASSIGN);
				setState(137);
				expr(0);
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
			setState(140);
			match(ID);
			setState(141);
			match(ASSIGN);
			setState(142);
			expr(0);
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
			setState(144);
			match(LBRACE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042432474554L) != 0)) {
				{
				{
				setState(145);
				statement();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
			setState(153);
			block();
			setState(154);
			match(ND);
			setState(155);
			match(LBRACK);
			setState(156);
			statement();
			setState(157);
			match(RBRACK);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(158);
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
			setState(161);
			match(FUN);
			setState(162);
			match(ID);
			setState(163);
			match(LPAREN);
			setState(164);
			match(RPAREN);
			setState(165);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(RET);
			setState(168);
			expr(0);
			setState(169);
			match(SEMICOLON);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(SLY_START);
			setState(172);
			bfProgram();
			setState(173);
			match(BF_RBRACE);
			setState(174);
			match(ARNOLD);
			setState(175);
			match(SEMICOLON);
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
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17873661021126656L) != 0)) {
				{
				{
				setState(177);
				bfCommand();
				}
				}
				setState(182);
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
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BF_LT:
				_localctx = new BfLtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(BF_LT);
				}
				break;
			case BF_GT:
				_localctx = new BfGtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(BF_GT);
				}
				break;
			case BF_PLUS:
				_localctx = new BfPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(BF_PLUS);
				}
				break;
			case BF_MINUS:
				_localctx = new BfMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(BF_MINUS);
				}
				break;
			case BF_DOT:
				_localctx = new BfDotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(BF_DOT);
				}
				break;
			case BF_COMMA:
				_localctx = new BfCommaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(BF_COMMA);
				}
				break;
			case BF_LBRAK:
				_localctx = new BfLoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				match(BF_LBRAK);
				setState(190);
				bfProgram();
				setState(191);
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
	public static class StrExprContext extends ExprContext {
		public TerminalNode STR_KW() { return getToken(GrammaticaParser.STR_KW, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public StrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GE() { return getToken(GrammaticaParser.GE, 0); }
		public GeExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(GrammaticaParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class ModExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(GrammaticaParser.MOD, 0); }
		public ModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(GrammaticaParser.GT, 0); }
		public GtExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class InputExprContext extends ExprContext {
		public TerminalNode INPUT() { return getToken(GrammaticaParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public InputExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class NeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NE() { return getToken(GrammaticaParser.NE, 0); }
		public NeExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class ParensExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class SubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(GrammaticaParser.MINUS, 0); }
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(GrammaticaParser.CONCAT, 0); }
		public ConcatExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(GrammaticaParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatExprContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(GrammaticaParser.FLOAT, 0); }
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class LtExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(GrammaticaParser.LT, 0); }
		public LtExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(GrammaticaParser.EQ, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammaticaParser.PLUS, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(GrammaticaParser.LE, 0); }
		public LeExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class UnaryMinusContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(GrammaticaParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(GrammaticaParser.MUL, 0); }
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(GrammaticaParser.DIV, 0); }
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(GrammaticaParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(GrammaticaParser.RBRACK, 0); }
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class CallExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GrammaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammaticaParser.RPAREN, 0); }
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(GrammaticaParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaParserListener ) ((GrammaticaParserListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaParserVisitor ) return ((GrammaticaParserVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
				match(ID);
				setState(197);
				match(LPAREN);
				setState(198);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(MINUS);
				setState(200);
				expr(9);
				}
				break;
			case 3:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(LPAREN);
				setState(202);
				expr(0);
				setState(203);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(ID);
				setState(206);
				match(LBRACK);
				setState(207);
				expr(0);
				setState(208);
				match(RBRACK);
				}
				break;
			case 5:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(INPUT);
				setState(211);
				match(LPAREN);
				setState(212);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new StrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(STR_KW);
				setState(214);
				match(LPAREN);
				setState(215);
				expr(0);
				setState(216);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(FLOAT);
				}
				break;
			case 9:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(INT);
				}
				break;
			case 10:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ConcatExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(225);
						match(CONCAT);
						setState(226);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(228);
						match(POW);
						setState(229);
						expr(22);
						}
						break;
					case 3:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(231);
						match(MUL);
						setState(232);
						expr(21);
						}
						break;
					case 4:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(234);
						match(DIV);
						setState(235);
						expr(20);
						}
						break;
					case 5:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(237);
						match(MOD);
						setState(238);
						expr(19);
						}
						break;
					case 6:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(240);
						match(PLUS);
						setState(241);
						expr(18);
						}
						break;
					case 7:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(243);
						match(MINUS);
						setState(244);
						expr(17);
						}
						break;
					case 8:
						{
						_localctx = new LtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(246);
						match(LT);
						setState(247);
						expr(16);
						}
						break;
					case 9:
						{
						_localctx = new GtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(249);
						match(GT);
						setState(250);
						expr(15);
						}
						break;
					case 10:
						{
						_localctx = new LeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(252);
						match(LE);
						setState(253);
						expr(14);
						}
						break;
					case 11:
						{
						_localctx = new GeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(255);
						match(GE);
						setState(256);
						expr(13);
						}
						break;
					case 12:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(258);
						match(EQ);
						setState(259);
						expr(12);
						}
						break;
					case 13:
						{
						_localctx = new NeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(261);
						match(NE);
						setState(262);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u010d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"?\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\br\b\b\u0001\t\u0001\t\u0001\t\u0003\tw\b\t\u0001\t\u0001\t\u0003\t{"+
		"\b\t\u0001\t\u0001\t\u0003\t\u007f\b\t\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008b\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\u0093"+
		"\b\f\n\f\f\f\u0096\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00a0\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0005\u0011\u00b3\b\u0011\n\u0011\f\u0011\u00b6"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c2"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00df\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0108\b\u0013\n\u0013\f\u0013"+
		"\u010b\t\u0013\u0001\u0013\u0000\u0001&\u0014\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\u0000\u0129\u0000+\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000"+
		"\u0004>\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bY\u0001"+
		"\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000\u0000"+
		"\u000ed\u0001\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012s"+
		"\u0001\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u008c"+
		"\u0001\u0000\u0000\u0000\u0018\u0090\u0001\u0000\u0000\u0000\u001a\u0099"+
		"\u0001\u0000\u0000\u0000\u001c\u00a1\u0001\u0000\u0000\u0000\u001e\u00a7"+
		"\u0001\u0000\u0000\u0000 \u00ab\u0001\u0000\u0000\u0000\"\u00b4\u0001"+
		"\u0000\u0000\u0000$\u00c1\u0001\u0000\u0000\u0000&\u00de\u0001\u0000\u0000"+
		"\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000\u0001"+
		"/\u0001\u0001\u0000\u0000\u000003\u0003 \u0010\u000013\u0003\u0004\u0002"+
		"\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0003\u0001"+
		"\u0000\u0000\u00004?\u0003\u0006\u0003\u00005?\u0003\b\u0004\u00006?\u0003"+
		"\n\u0005\u00007?\u0003\f\u0006\u00008?\u0003\u000e\u0007\u00009?\u0003"+
		"\u0010\b\u0000:?\u0003\u0012\t\u0000;?\u0003\u001a\r\u0000<?\u0003\u001c"+
		"\u000e\u0000=?\u0003\u001e\u000f\u0000>4\u0001\u0000\u0000\u0000>5\u0001"+
		"\u0000\u0000\u0000>6\u0001\u0000\u0000\u0000>7\u0001\u0000\u0000\u0000"+
		">8\u0001\u0000\u0000\u0000>9\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000"+
		"\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005\b\u0000\u0000AF\u0005"+
		"(\u0000\u0000BC\u0005\u0013\u0000\u0000CD\u0003&\u0013\u0000DE\u0005\u0014"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\"\u0000\u0000IJ\u0003"+
		"&\u0013\u0000JK\u0005\u000e\u0000\u0000K\u0007\u0001\u0000\u0000\u0000"+
		"LM\u0005(\u0000\u0000MN\u0005\"\u0000\u0000NO\u0003&\u0013\u0000OP\u0005"+
		"\u000e\u0000\u0000PZ\u0001\u0000\u0000\u0000QR\u0005(\u0000\u0000RS\u0005"+
		"\u0013\u0000\u0000ST\u0003&\u0013\u0000TU\u0005\u0014\u0000\u0000UV\u0005"+
		"\"\u0000\u0000VW\u0003&\u0013\u0000WX\u0005\u000e\u0000\u0000XZ\u0001"+
		"\u0000\u0000\u0000YL\u0001\u0000\u0000\u0000YQ\u0001\u0000\u0000\u0000"+
		"Z\t\u0001\u0000\u0000\u0000[\\\u0005\u0003\u0000\u0000\\]\u0005\u0011"+
		"\u0000\u0000]^\u0003&\u0013\u0000^_\u0005\u0012\u0000\u0000_`\u0005\u000e"+
		"\u0000\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0003&\u0013\u0000bc\u0005"+
		"\u000e\u0000\u0000c\r\u0001\u0000\u0000\u0000de\u0005\u0004\u0000\u0000"+
		"ef\u0005\u0011\u0000\u0000fg\u0003&\u0013\u0000gh\u0005\u0012\u0000\u0000"+
		"hi\u0003\u0018\f\u0000i\u000f\u0001\u0000\u0000\u0000jk\u0005\u0005\u0000"+
		"\u0000kl\u0005\u0011\u0000\u0000lm\u0003&\u0013\u0000mn\u0005\u0012\u0000"+
		"\u0000nq\u0003\u0018\f\u0000op\u0005\u0006\u0000\u0000pr\u0003\u0018\f"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0011\u0001"+
		"\u0000\u0000\u0000st\u0005\u0007\u0000\u0000tv\u0005\u0011\u0000\u0000"+
		"uw\u0003\u0014\n\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xz\u0005\u000e\u0000\u0000y{\u0003&\u0013\u0000"+
		"zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|~\u0005\u000e\u0000\u0000}\u007f\u0003\u0016\u000b\u0000~}\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0012\u0000\u0000\u0081\u0082\u0003\u0018"+
		"\f\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0005\b\u0000"+
		"\u0000\u0084\u0085\u0005(\u0000\u0000\u0085\u0086\u0005\"\u0000\u0000"+
		"\u0086\u008b\u0003&\u0013\u0000\u0087\u0088\u0005(\u0000\u0000\u0088\u0089"+
		"\u0005\"\u0000\u0000\u0089\u008b\u0003&\u0013\u0000\u008a\u0083\u0001"+
		"\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b\u0015\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005(\u0000\u0000\u008d\u008e\u0005\""+
		"\u0000\u0000\u008e\u008f\u0003&\u0013\u0000\u008f\u0017\u0001\u0000\u0000"+
		"\u0000\u0090\u0094\u0005\u0015\u0000\u0000\u0091\u0093\u0003\u0002\u0001"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u0016\u0000\u0000\u0098\u0019\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0003\u0018\f\u0000\u009a\u009b\u0005\t\u0000\u0000"+
		"\u009b\u009c\u0005\u0013\u0000\u0000\u009c\u009d\u0003\u0002\u0001\u0000"+
		"\u009d\u009f\u0005\u0014\u0000\u0000\u009e\u00a0\u0005\u000e\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2"+
		"\u00a3\u0005(\u0000\u0000\u00a3\u00a4\u0005\u0011\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0012\u0000\u0000\u00a5\u00a6\u0003\u0018\f\u0000\u00a6\u001d\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u000b\u0000\u0000\u00a8\u00a9\u0003"+
		"&\u0013\u0000\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u001f\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0001\u0000\u0000\u00ac\u00ad\u0003\"\u0011"+
		"\u0000\u00ad\u00ae\u00057\u0000\u0000\u00ae\u00af\u0005\u0002\u0000\u0000"+
		"\u00af\u00b0\u0005\u000e\u0000\u0000\u00b0!\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b3\u0003$\u0012\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00c2\u0005/\u0000\u0000\u00b8\u00c2\u00050\u0000"+
		"\u0000\u00b9\u00c2\u00051\u0000\u0000\u00ba\u00c2\u00052\u0000\u0000\u00bb"+
		"\u00c2\u00053\u0000\u0000\u00bc\u00c2\u00054\u0000\u0000\u00bd\u00be\u0005"+
		"5\u0000\u0000\u00be\u00bf\u0003\"\u0011\u0000\u00bf\u00c0\u00056\u0000"+
		"\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00b7\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b8\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000"+
		"\u0000\u00c1\u00ba\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c2%\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006\u0013\uffff\uffff"+
		"\u0000\u00c4\u00c5\u0005(\u0000\u0000\u00c5\u00c6\u0005\u0011\u0000\u0000"+
		"\u00c6\u00df\u0005\u0012\u0000\u0000\u00c7\u00c8\u0005\'\u0000\u0000\u00c8"+
		"\u00df\u0003&\u0013\t\u00c9\u00ca\u0005\u0011\u0000\u0000\u00ca\u00cb"+
		"\u0003&\u0013\u0000\u00cb\u00cc\u0005\u0012\u0000\u0000\u00cc\u00df\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005(\u0000\u0000\u00ce\u00cf\u0005\u0013"+
		"\u0000\u0000\u00cf\u00d0\u0003&\u0013\u0000\u00d0\u00d1\u0005\u0014\u0000"+
		"\u0000\u00d1\u00df\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\f\u0000\u0000"+
		"\u00d3\u00d4\u0005\u0011\u0000\u0000\u00d4\u00df\u0005\u0012\u0000\u0000"+
		"\u00d5\u00d6\u0005\r\u0000\u0000\u00d6\u00d7\u0005\u0011\u0000\u0000\u00d7"+
		"\u00d8\u0003&\u0013\u0000\u00d8\u00d9\u0005\u0012\u0000\u0000\u00d9\u00df"+
		"\u0001\u0000\u0000\u0000\u00da\u00df\u0005(\u0000\u0000\u00db\u00df\u0005"+
		")\u0000\u0000\u00dc\u00df\u0005*\u0000\u0000\u00dd\u00df\u0005+\u0000"+
		"\u0000\u00de\u00c3\u0001\u0000\u0000\u0000\u00de\u00c7\u0001\u0000\u0000"+
		"\u0000\u00de\u00c9\u0001\u0000\u0000\u0000\u00de\u00cd\u0001\u0000\u0000"+
		"\u0000\u00de\u00d2\u0001\u0000\u0000\u0000\u00de\u00d5\u0001\u0000\u0000"+
		"\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u0109\u0001\u0000\u0000\u0000\u00e0\u00e1\n\u0016\u0000\u0000"+
		"\u00e1\u00e2\u0005%\u0000\u0000\u00e2\u0108\u0003&\u0013\u0017\u00e3\u00e4"+
		"\n\u0015\u0000\u0000\u00e4\u00e5\u0005\u001e\u0000\u0000\u00e5\u0108\u0003"+
		"&\u0013\u0016\u00e6\u00e7\n\u0014\u0000\u0000\u00e7\u00e8\u0005\u001f"+
		"\u0000\u0000\u00e8\u0108\u0003&\u0013\u0015\u00e9\u00ea\n\u0013\u0000"+
		"\u0000\u00ea\u00eb\u0005 \u0000\u0000\u00eb\u0108\u0003&\u0013\u0014\u00ec"+
		"\u00ed\n\u0012\u0000\u0000\u00ed\u00ee\u0005!\u0000\u0000\u00ee\u0108"+
		"\u0003&\u0013\u0013\u00ef\u00f0\n\u0011\u0000\u0000\u00f0\u00f1\u0005"+
		"&\u0000\u0000\u00f1\u0108\u0003&\u0013\u0012\u00f2\u00f3\n\u0010\u0000"+
		"\u0000\u00f3\u00f4\u0005\'\u0000\u0000\u00f4\u0108\u0003&\u0013\u0011"+
		"\u00f5\u00f6\n\u000f\u0000\u0000\u00f6\u00f7\u0005#\u0000\u0000\u00f7"+
		"\u0108\u0003&\u0013\u0010\u00f8\u00f9\n\u000e\u0000\u0000\u00f9\u00fa"+
		"\u0005$\u0000\u0000\u00fa\u0108\u0003&\u0013\u000f\u00fb\u00fc\n\r\u0000"+
		"\u0000\u00fc\u00fd\u0005\u0018\u0000\u0000\u00fd\u0108\u0003&\u0013\u000e"+
		"\u00fe\u00ff\n\f\u0000\u0000\u00ff\u0100\u0005\u0017\u0000\u0000\u0100"+
		"\u0108\u0003&\u0013\r\u0101\u0102\n\u000b\u0000\u0000\u0102\u0103\u0005"+
		"\u0019\u0000\u0000\u0103\u0108\u0003&\u0013\f\u0104\u0105\n\n\u0000\u0000"+
		"\u0105\u0106\u0005\u001a\u0000\u0000\u0106\u0108\u0003&\u0013\u000b\u0107"+
		"\u00e0\u0001\u0000\u0000\u0000\u0107\u00e3\u0001\u0000\u0000\u0000\u0107"+
		"\u00e6\u0001\u0000\u0000\u0000\u0107\u00e9\u0001\u0000\u0000\u0000\u0107"+
		"\u00ec\u0001\u0000\u0000\u0000\u0107\u00ef\u0001\u0000\u0000\u0000\u0107"+
		"\u00f2\u0001\u0000\u0000\u0000\u0107\u00f5\u0001\u0000\u0000\u0000\u0107"+
		"\u00f8\u0001\u0000\u0000\u0000\u0107\u00fb\u0001\u0000\u0000\u0000\u0107"+
		"\u00fe\u0001\u0000\u0000\u0000\u0107\u0101\u0001\u0000\u0000\u0000\u0107"+
		"\u0104\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\'\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u0011+"+
		"2>FYqvz~\u008a\u0094\u009f\u00b4\u00c1\u00de\u0107\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}