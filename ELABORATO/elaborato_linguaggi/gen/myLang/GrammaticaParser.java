// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/ELABORATO/elaborato_linguaggi/src/myLang/Grammatica.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, GE=22, LE=23, EQ=24, NE=25, GT=26, 
		LT=27, ID=28, FLOAT=29, INT=30, STRING=31, WS=32, COMMENT=33;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_ifStmt = 2, RULE_varDecl = 3, 
		RULE_assignStmt = 4, RULE_printStmt = 5, RULE_exprStmt = 6, RULE_whileStmt = 7, 
		RULE_forStmt = 8, RULE_forInit = 9, RULE_forUpdate = 10, RULE_block = 11, 
		RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "ifStmt", "varDecl", "assignStmt", "printStmt", 
			"exprStmt", "whileStmt", "forStmt", "forInit", "forUpdate", "block", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'('", "')'", "'else'", "'var'", "'='", "';'", "'print'", 
			"'while'", "'for'", "'{'", "'}'", "'++'", "'^'", "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'input'", "'str'", "'>='", "'<='", "'=='", "'!='", "'>'", 
			"'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "GE", "LE", 
			"EQ", "NE", "GT", "LT", "ID", "FLOAT", "INT", "STRING", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Grammatica.g4"; }

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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4030203686L) != 0)) {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				printStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				exprStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				ifStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				forStmt();
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
	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(T__1);
			setState(45);
			expr(0);
			setState(46);
			match(T__2);
			setState(47);
			block();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(48);
				match(T__3);
				setState(49);
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
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(53);
			match(ID);
			setState(54);
			match(T__5);
			setState(55);
			expr(0);
			setState(56);
			match(T__6);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(T__5);
			setState(60);
			expr(0);
			setState(61);
			match(T__6);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__7);
			setState(64);
			match(T__1);
			setState(65);
			expr(0);
			setState(66);
			match(T__2);
			setState(67);
			match(T__6);
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
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			expr(0);
			setState(70);
			match(T__6);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__8);
			setState(73);
			match(T__1);
			setState(74);
			expr(0);
			setState(75);
			match(T__2);
			setState(76);
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
	public static class ForStmtContext extends ParserRuleContext {
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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__9);
			setState(79);
			match(T__1);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==ID) {
				{
				setState(80);
				forInit();
				}
			}

			setState(83);
			match(T__6);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4030201860L) != 0)) {
				{
				setState(84);
				expr(0);
				}
			}

			setState(87);
			match(T__6);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(88);
				forUpdate();
				}
			}

			setState(91);
			match(T__2);
			setState(92);
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
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forInit);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__4);
				setState(95);
				match(ID);
				setState(96);
				match(T__5);
				setState(97);
				expr(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				setState(99);
				match(T__5);
				setState(100);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(T__5);
			setState(105);
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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__10);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4030203686L) != 0)) {
				{
				{
				setState(108);
				statement();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__11);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitStrExpr(this);
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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterGeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitGeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitGeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(GrammaticaParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitIntExpr(this);
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
		public ModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitModExpr(this);
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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputExprContext extends ExprContext {
		public InputExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterInputExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitInputExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitInputExpr(this);
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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterNeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitNeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitNeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitParensExpr(this);
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
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitSubExpr(this);
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
		public ConcatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitConcatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitConcatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(GrammaticaParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatExprContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(GrammaticaParser.FLOAT, 0); }
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitFloatExpr(this);
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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitLtExpr(this);
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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitEqExpr(this);
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
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitAddExpr(this);
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
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterLeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitLeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitLeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitUnaryMinus(this);
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
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitMulExpr(this);
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
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitDivExpr(this);
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
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticaParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticaListener ) ((GrammaticaListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticaVisitor ) return ((GrammaticaVisitor<? extends T>)visitor).visitIdExpr(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(117);
				match(T__18);
				setState(118);
				expr(8);
				}
				break;
			case T__1:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(T__1);
				setState(120);
				expr(0);
				setState(121);
				match(T__2);
				}
				break;
			case T__19:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__19);
				setState(124);
				match(T__1);
				setState(125);
				match(T__2);
				}
				break;
			case T__20:
				{
				_localctx = new StrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__20);
				setState(127);
				match(T__1);
				setState(128);
				expr(0);
				setState(129);
				match(T__2);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(ID);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(FLOAT);
				}
				break;
			case INT:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ConcatExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(138);
						match(T__12);
						setState(139);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(141);
						match(T__13);
						setState(142);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(144);
						match(T__14);
						setState(145);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(147);
						match(T__15);
						setState(148);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(150);
						match(T__16);
						setState(151);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(153);
						match(T__17);
						setState(154);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(156);
						match(T__18);
						setState(157);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new LtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(159);
						match(LT);
						setState(160);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new GtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(162);
						match(GT);
						setState(163);
						expr(14);
						}
						break;
					case 10:
						{
						_localctx = new LeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(165);
						match(LE);
						setState(166);
						expr(13);
						}
						break;
					case 11:
						{
						_localctx = new GeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(168);
						match(GE);
						setState(169);
						expr(12);
						}
						break;
					case 12:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(171);
						match(EQ);
						setState(172);
						expr(11);
						}
						break;
					case 13:
						{
						_localctx = new NeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(174);
						match(NE);
						setState(175);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00023\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0003\bR\b\b\u0001\b\u0001\b\u0003\bV\b\b\u0001\b\u0001\b\u0003"+
		"\bZ\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tf\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000bn\b\u000b\n\u000b\f\u000bq\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0088\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00b1\b\f\n\f\f\f\u00b4\t\f\u0001\f\u0000\u0001\u0018\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000\u00c9"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004"+
		"+\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b:\u0001\u0000"+
		"\u0000\u0000\n?\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000\u000e"+
		"H\u0001\u0000\u0000\u0000\u0010N\u0001\u0000\u0000\u0000\u0012e\u0001"+
		"\u0000\u0000\u0000\u0014g\u0001\u0000\u0000\u0000\u0016k\u0001\u0000\u0000"+
		"\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000\u0000\"*\u0003\u0006"+
		"\u0003\u0000#*\u0003\b\u0004\u0000$*\u0003\n\u0005\u0000%*\u0003\f\u0006"+
		"\u0000&*\u0003\u000e\u0007\u0000\'*\u0003\u0004\u0002\u0000(*\u0003\u0010"+
		"\b\u0000)\"\u0001\u0000\u0000\u0000)#\u0001\u0000\u0000\u0000)$\u0001"+
		"\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0003"+
		"\u0018\f\u0000./\u0005\u0003\u0000\u0000/2\u0003\u0016\u000b\u000001\u0005"+
		"\u0004\u0000\u000013\u0003\u0016\u000b\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0005"+
		"\u0000\u000056\u0005\u001c\u0000\u000067\u0005\u0006\u0000\u000078\u0003"+
		"\u0018\f\u000089\u0005\u0007\u0000\u00009\u0007\u0001\u0000\u0000\u0000"+
		":;\u0005\u001c\u0000\u0000;<\u0005\u0006\u0000\u0000<=\u0003\u0018\f\u0000"+
		"=>\u0005\u0007\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\b\u0000"+
		"\u0000@A\u0005\u0002\u0000\u0000AB\u0003\u0018\f\u0000BC\u0005\u0003\u0000"+
		"\u0000CD\u0005\u0007\u0000\u0000D\u000b\u0001\u0000\u0000\u0000EF\u0003"+
		"\u0018\f\u0000FG\u0005\u0007\u0000\u0000G\r\u0001\u0000\u0000\u0000HI"+
		"\u0005\t\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0003\u0018\f\u0000K"+
		"L\u0005\u0003\u0000\u0000LM\u0003\u0016\u000b\u0000M\u000f\u0001\u0000"+
		"\u0000\u0000NO\u0005\n\u0000\u0000OQ\u0005\u0002\u0000\u0000PR\u0003\u0012"+
		"\t\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000SU\u0005\u0007\u0000\u0000TV\u0003\u0018\f\u0000UT\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0005"+
		"\u0007\u0000\u0000XZ\u0003\u0014\n\u0000YX\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\u0003\u0000\u0000"+
		"\\]\u0003\u0016\u000b\u0000]\u0011\u0001\u0000\u0000\u0000^_\u0005\u0005"+
		"\u0000\u0000_`\u0005\u001c\u0000\u0000`a\u0005\u0006\u0000\u0000af\u0003"+
		"\u0018\f\u0000bc\u0005\u001c\u0000\u0000cd\u0005\u0006\u0000\u0000df\u0003"+
		"\u0018\f\u0000e^\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000f\u0013"+
		"\u0001\u0000\u0000\u0000gh\u0005\u001c\u0000\u0000hi\u0005\u0006\u0000"+
		"\u0000ij\u0003\u0018\f\u0000j\u0015\u0001\u0000\u0000\u0000ko\u0005\u000b"+
		"\u0000\u0000ln\u0003\u0002\u0001\u0000ml\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\f\u0000\u0000"+
		"s\u0017\u0001\u0000\u0000\u0000tu\u0006\f\uffff\uffff\u0000uv\u0005\u0013"+
		"\u0000\u0000v\u0088\u0003\u0018\f\bwx\u0005\u0002\u0000\u0000xy\u0003"+
		"\u0018\f\u0000yz\u0005\u0003\u0000\u0000z\u0088\u0001\u0000\u0000\u0000"+
		"{|\u0005\u0014\u0000\u0000|}\u0005\u0002\u0000\u0000}\u0088\u0005\u0003"+
		"\u0000\u0000~\u007f\u0005\u0015\u0000\u0000\u007f\u0080\u0005\u0002\u0000"+
		"\u0000\u0080\u0081\u0003\u0018\f\u0000\u0081\u0082\u0005\u0003\u0000\u0000"+
		"\u0082\u0088\u0001\u0000\u0000\u0000\u0083\u0088\u0005\u001c\u0000\u0000"+
		"\u0084\u0088\u0005\u001d\u0000\u0000\u0085\u0088\u0005\u001e\u0000\u0000"+
		"\u0086\u0088\u0005\u001f\u0000\u0000\u0087t\u0001\u0000\u0000\u0000\u0087"+
		"w\u0001\u0000\u0000\u0000\u0087{\u0001\u0000\u0000\u0000\u0087~\u0001"+
		"\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u00b2\u0001\u0000\u0000\u0000\u0089\u008a\n\u0015"+
		"\u0000\u0000\u008a\u008b\u0005\r\u0000\u0000\u008b\u00b1\u0003\u0018\f"+
		"\u0016\u008c\u008d\n\u0014\u0000\u0000\u008d\u008e\u0005\u000e\u0000\u0000"+
		"\u008e\u00b1\u0003\u0018\f\u0015\u008f\u0090\n\u0013\u0000\u0000\u0090"+
		"\u0091\u0005\u000f\u0000\u0000\u0091\u00b1\u0003\u0018\f\u0014\u0092\u0093"+
		"\n\u0012\u0000\u0000\u0093\u0094\u0005\u0010\u0000\u0000\u0094\u00b1\u0003"+
		"\u0018\f\u0013\u0095\u0096\n\u0011\u0000\u0000\u0096\u0097\u0005\u0011"+
		"\u0000\u0000\u0097\u00b1\u0003\u0018\f\u0012\u0098\u0099\n\u0010\u0000"+
		"\u0000\u0099\u009a\u0005\u0012\u0000\u0000\u009a\u00b1\u0003\u0018\f\u0011"+
		"\u009b\u009c\n\u000f\u0000\u0000\u009c\u009d\u0005\u0013\u0000\u0000\u009d"+
		"\u00b1\u0003\u0018\f\u0010\u009e\u009f\n\u000e\u0000\u0000\u009f\u00a0"+
		"\u0005\u001b\u0000\u0000\u00a0\u00b1\u0003\u0018\f\u000f\u00a1\u00a2\n"+
		"\r\u0000\u0000\u00a2\u00a3\u0005\u001a\u0000\u0000\u00a3\u00b1\u0003\u0018"+
		"\f\u000e\u00a4\u00a5\n\f\u0000\u0000\u00a5\u00a6\u0005\u0017\u0000\u0000"+
		"\u00a6\u00b1\u0003\u0018\f\r\u00a7\u00a8\n\u000b\u0000\u0000\u00a8\u00a9"+
		"\u0005\u0016\u0000\u0000\u00a9\u00b1\u0003\u0018\f\f\u00aa\u00ab\n\n\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac\u00b1\u0003\u0018\f\u000b"+
		"\u00ad\u00ae\n\t\u0000\u0000\u00ae\u00af\u0005\u0019\u0000\u0000\u00af"+
		"\u00b1\u0003\u0018\f\n\u00b0\u0089\u0001\u0000\u0000\u0000\u00b0\u008c"+
		"\u0001\u0000\u0000\u0000\u00b0\u008f\u0001\u0000\u0000\u0000\u00b0\u0092"+
		"\u0001\u0000\u0000\u0000\u00b0\u0095\u0001\u0000\u0000\u0000\u00b0\u0098"+
		"\u0001\u0000\u0000\u0000\u00b0\u009b\u0001\u0000\u0000\u0000\u00b0\u009e"+
		"\u0001\u0000\u0000\u0000\u00b0\u00a1\u0001\u0000\u0000\u0000\u00b0\u00a4"+
		"\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u0019\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u000b\u001d)2QUYeo\u0087\u00b0\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}