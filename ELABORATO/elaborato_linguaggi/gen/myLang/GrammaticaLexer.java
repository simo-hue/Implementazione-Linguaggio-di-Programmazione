// Generated from /Users/simo/Downloads/Implementazione-Linguaggio-di-Programmazione-main/ELABORATO/elaborato_linguaggi/src/myLang/GrammaticaLexer.g4 by ANTLR 4.13.2
package myLang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammaticaLexer extends Lexer {
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
		BF=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "BF"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SLY_START", "ARNOLD", "PRINT", "WHILE", "IF", "ELSE", "FOR", "VAR", 
			"ND", "FUN", "RET", "INPUT", "STR_KW", "SEMICOLON", "COMMA", "DOT", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "GE", "LE", "EQ", "NE", 
			"AND", "OR", "NOT", "POW", "MUL", "DIV", "MOD", "ASSIGN", "LT", "GT", 
			"CONCAT", "PLUS", "MINUS", "ID", "FLOAT", "INT", "STRING", "WS", "COMMENT", 
			"BF_WS", "BF_LT", "BF_GT", "BF_PLUS", "BF_MINUS", "BF_DOT", "BF_COMMA", 
			"BF_LBRAK", "BF_RBRAK", "BF_RBRACE", "BF_OTHER"
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


	public GrammaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammaticaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00008\u014b\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002"+
		"\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002"+
		"\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002"+
		"\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002"+
		"\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002"+
		" \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002"+
		"%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002"+
		"*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002"+
		"/\u0007/\u00020\u00070\u00021\u00071\u00022\u00072\u00023\u00073\u0002"+
		"4\u00074\u00025\u00075\u00026\u00076\u00027\u00077\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0005\'\u00f0\b\'\n\'\f\'\u00f3\t\'\u0001"+
		"(\u0004(\u00f6\b(\u000b(\f(\u00f7\u0001(\u0001(\u0004(\u00fc\b(\u000b"+
		"(\f(\u00fd\u0001)\u0004)\u0101\b)\u000b)\f)\u0102\u0001*\u0001*\u0001"+
		"*\u0001*\u0005*\u0109\b*\n*\f*\u010c\t*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u0113\b*\n*\f*\u0116\t*\u0001*\u0003*\u0119\b*\u0001+\u0004+"+
		"\u011c\b+\u000b+\f+\u011d\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u0126\b,\n,\f,\u0129\t,\u0001,\u0001,\u0001-\u0004-\u012e\b-\u000b-"+
		"\f-\u012f\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u0001"+
		"1\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u0000\u00008\u0002"+
		"\u0001\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010"+
		"\b\u0012\t\u0014\n\u0016\u000b\u0018\f\u001a\r\u001c\u000e\u001e\u000f"+
		" \u0010\"\u0011$\u0012&\u0013(\u0014*\u0015,\u0016.\u00170\u00182\u0019"+
		"4\u001a6\u001b8\u001c:\u001d<\u001e>\u001f@ B!D\"F#H$J%L&N\'P(R)T*V+X"+
		",Z-\\.^/`0b1d2f3h4j5l6n7p8\u0002\u0000\u0001\u0007\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0001\u000009\u0004\u0000\n\n\r\r\"\"\\\\\u0004\u0000\n"+
		"\n\r\r\\\\\u201c\u201c\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0155"+
		"\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000"+
		"\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000\u0000\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0000\u0010\u0001\u0000\u0000\u0000\u0000\u0012"+
		"\u0001\u0000\u0000\u0000\u0000\u0014\u0001\u0000\u0000\u0000\u0000\u0016"+
		"\u0001\u0000\u0000\u0000\u0000\u0018\u0001\u0000\u0000\u0000\u0000\u001a"+
		"\u0001\u0000\u0000\u0000\u0000\u001c\u0001\u0000\u0000\u0000\u0000\u001e"+
		"\u0001\u0000\u0000\u0000\u0000 \u0001\u0000\u0000\u0000\u0000\"\u0001"+
		"\u0000\u0000\u0000\u0000$\u0001\u0000\u0000\u0000\u0000&\u0001\u0000\u0000"+
		"\u0000\u0000(\u0001\u0000\u0000\u0000\u0000*\u0001\u0000\u0000\u0000\u0000"+
		",\u0001\u0000\u0000\u0000\u0000.\u0001\u0000\u0000\u0000\u00000\u0001"+
		"\u0000\u0000\u0000\u00002\u0001\u0000\u0000\u0000\u00004\u0001\u0000\u0000"+
		"\u0000\u00006\u0001\u0000\u0000\u0000\u00008\u0001\u0000\u0000\u0000\u0000"+
		":\u0001\u0000\u0000\u0000\u0000<\u0001\u0000\u0000\u0000\u0000>\u0001"+
		"\u0000\u0000\u0000\u0000@\u0001\u0000\u0000\u0000\u0000B\u0001\u0000\u0000"+
		"\u0000\u0000D\u0001\u0000\u0000\u0000\u0000F\u0001\u0000\u0000\u0000\u0000"+
		"H\u0001\u0000\u0000\u0000\u0000J\u0001\u0000\u0000\u0000\u0000L\u0001"+
		"\u0000\u0000\u0000\u0000N\u0001\u0000\u0000\u0000\u0000P\u0001\u0000\u0000"+
		"\u0000\u0000R\u0001\u0000\u0000\u0000\u0000T\u0001\u0000\u0000\u0000\u0000"+
		"V\u0001\u0000\u0000\u0000\u0000X\u0001\u0000\u0000\u0000\u0000Z\u0001"+
		"\u0000\u0000\u0000\u0001\\\u0001\u0000\u0000\u0000\u0001^\u0001\u0000"+
		"\u0000\u0000\u0001`\u0001\u0000\u0000\u0000\u0001b\u0001\u0000\u0000\u0000"+
		"\u0001d\u0001\u0000\u0000\u0000\u0001f\u0001\u0000\u0000\u0000\u0001h"+
		"\u0001\u0000\u0000\u0000\u0001j\u0001\u0000\u0000\u0000\u0001l\u0001\u0000"+
		"\u0000\u0000\u0001n\u0001\u0000\u0000\u0000\u0001p\u0001\u0000\u0000\u0000"+
		"\u0002r\u0001\u0000\u0000\u0000\u0004z\u0001\u0000\u0000\u0000\u0006\u0081"+
		"\u0001\u0000\u0000\u0000\b\u0087\u0001\u0000\u0000\u0000\n\u008d\u0001"+
		"\u0000\u0000\u0000\f\u0090\u0001\u0000\u0000\u0000\u000e\u0095\u0001\u0000"+
		"\u0000\u0000\u0010\u0099\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000"+
		"\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a4\u0001\u0000"+
		"\u0000\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00ae\u0001\u0000"+
		"\u0000\u0000\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000"+
		"\u0000\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00b8\u0001\u0000\u0000"+
		"\u0000$\u00ba\u0001\u0000\u0000\u0000&\u00bc\u0001\u0000\u0000\u0000("+
		"\u00be\u0001\u0000\u0000\u0000*\u00c0\u0001\u0000\u0000\u0000,\u00c2\u0001"+
		"\u0000\u0000\u0000.\u00c4\u0001\u0000\u0000\u00000\u00c7\u0001\u0000\u0000"+
		"\u00002\u00ca\u0001\u0000\u0000\u00004\u00cd\u0001\u0000\u0000\u00006"+
		"\u00d0\u0001\u0000\u0000\u00008\u00d3\u0001\u0000\u0000\u0000:\u00d6\u0001"+
		"\u0000\u0000\u0000<\u00d8\u0001\u0000\u0000\u0000>\u00da\u0001\u0000\u0000"+
		"\u0000@\u00dc\u0001\u0000\u0000\u0000B\u00de\u0001\u0000\u0000\u0000D"+
		"\u00e0\u0001\u0000\u0000\u0000F\u00e2\u0001\u0000\u0000\u0000H\u00e4\u0001"+
		"\u0000\u0000\u0000J\u00e6\u0001\u0000\u0000\u0000L\u00e9\u0001\u0000\u0000"+
		"\u0000N\u00eb\u0001\u0000\u0000\u0000P\u00ed\u0001\u0000\u0000\u0000R"+
		"\u00f5\u0001\u0000\u0000\u0000T\u0100\u0001\u0000\u0000\u0000V\u0118\u0001"+
		"\u0000\u0000\u0000X\u011b\u0001\u0000\u0000\u0000Z\u0121\u0001\u0000\u0000"+
		"\u0000\\\u012d\u0001\u0000\u0000\u0000^\u0133\u0001\u0000\u0000\u0000"+
		"`\u0135\u0001\u0000\u0000\u0000b\u0137\u0001\u0000\u0000\u0000d\u0139"+
		"\u0001\u0000\u0000\u0000f\u013b\u0001\u0000\u0000\u0000h\u013d\u0001\u0000"+
		"\u0000\u0000j\u013f\u0001\u0000\u0000\u0000l\u0141\u0001\u0000\u0000\u0000"+
		"n\u0143\u0001\u0000\u0000\u0000p\u0147\u0001\u0000\u0000\u0000rs\u0005"+
		"s\u0000\u0000st\u0005l\u0000\u0000tu\u0005y\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0005{\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0006\u0000"+
		"\u0000\u0000y\u0003\u0001\u0000\u0000\u0000z{\u0005a\u0000\u0000{|\u0005"+
		"r\u0000\u0000|}\u0005n\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005l"+
		"\u0000\u0000\u007f\u0080\u0005d\u0000\u0000\u0080\u0005\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005p\u0000\u0000\u0082\u0083\u0005r\u0000\u0000\u0083"+
		"\u0084\u0005i\u0000\u0000\u0084\u0085\u0005n\u0000\u0000\u0085\u0086\u0005"+
		"t\u0000\u0000\u0086\u0007\u0001\u0000\u0000\u0000\u0087\u0088\u0005w\u0000"+
		"\u0000\u0088\u0089\u0005h\u0000\u0000\u0089\u008a\u0005i\u0000\u0000\u008a"+
		"\u008b\u0005l\u0000\u0000\u008b\u008c\u0005e\u0000\u0000\u008c\t\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005i\u0000\u0000\u008e\u008f\u0005f\u0000"+
		"\u0000\u008f\u000b\u0001\u0000\u0000\u0000\u0090\u0091\u0005e\u0000\u0000"+
		"\u0091\u0092\u0005l\u0000\u0000\u0092\u0093\u0005s\u0000\u0000\u0093\u0094"+
		"\u0005e\u0000\u0000\u0094\r\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"f\u0000\u0000\u0096\u0097\u0005o\u0000\u0000\u0097\u0098\u0005r\u0000"+
		"\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u009a\u0005v\u0000\u0000"+
		"\u009a\u009b\u0005a\u0000\u0000\u009b\u009c\u0005r\u0000\u0000\u009c\u0011"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005N\u0000\u0000\u009e\u009f\u0005"+
		"D\u0000\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005f\u0000"+
		"\u0000\u00a1\u00a2\u0005u\u0000\u0000\u00a2\u00a3\u0005n\u0000\u0000\u00a3"+
		"\u0015\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005r\u0000\u0000\u00a5\u00a6"+
		"\u0005e\u0000\u0000\u00a6\u00a7\u0005t\u0000\u0000\u00a7\u0017\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0005i\u0000\u0000\u00a9\u00aa\u0005n\u0000\u0000"+
		"\u00aa\u00ab\u0005p\u0000\u0000\u00ab\u00ac\u0005u\u0000\u0000\u00ac\u00ad"+
		"\u0005t\u0000\u0000\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"s\u0000\u0000\u00af\u00b0\u0005t\u0000\u0000\u00b0\u00b1\u0005r\u0000"+
		"\u0000\u00b1\u001b\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005;\u0000\u0000"+
		"\u00b3\u001d\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005,\u0000\u0000\u00b5"+
		"\u001f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005.\u0000\u0000\u00b7!\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005(\u0000\u0000\u00b9#\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005)\u0000\u0000\u00bb%\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005[\u0000\u0000\u00bd\'\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005]\u0000\u0000\u00bf)\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005{"+
		"\u0000\u0000\u00c1+\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005}\u0000\u0000"+
		"\u00c3-\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005>\u0000\u0000\u00c5\u00c6"+
		"\u0005=\u0000\u0000\u00c6/\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005<"+
		"\u0000\u0000\u00c8\u00c9\u0005=\u0000\u0000\u00c91\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005=\u0000\u0000\u00cb\u00cc\u0005=\u0000\u0000\u00cc3"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce\u00cf\u0005"+
		"=\u0000\u0000\u00cf5\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005&\u0000"+
		"\u0000\u00d1\u00d2\u0005&\u0000\u0000\u00d27\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005|\u0000\u0000\u00d4\u00d5\u0005|\u0000\u0000\u00d59\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005!\u0000\u0000\u00d7;\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005^\u0000\u0000\u00d9=\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005*\u0000\u0000\u00db?\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"/\u0000\u0000\u00ddA\u0001\u0000\u0000\u0000\u00de\u00df\u0005%\u0000"+
		"\u0000\u00dfC\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005=\u0000\u0000\u00e1"+
		"E\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005<\u0000\u0000\u00e3G\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005>\u0000\u0000\u00e5I\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005+\u0000\u0000\u00e7\u00e8\u0005+\u0000\u0000\u00e8"+
		"K\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005+\u0000\u0000\u00eaM\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005-\u0000\u0000\u00ecO\u0001\u0000\u0000"+
		"\u0000\u00ed\u00f1\u0007\u0000\u0000\u0000\u00ee\u00f0\u0007\u0001\u0000"+
		"\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2Q\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f6\u0007\u0002\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fb\u0005.\u0000\u0000\u00fa\u00fc\u0007\u0002\u0000\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"S\u0001\u0000\u0000\u0000\u00ff\u0101\u0007\u0002\u0000\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103U\u0001"+
		"\u0000\u0000\u0000\u0104\u010a\u0005\"\u0000\u0000\u0105\u0109\b\u0003"+
		"\u0000\u0000\u0106\u0107\u0005\\\u0000\u0000\u0107\u0109\t\u0000\u0000"+
		"\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0119\u0005\"\u0000\u0000"+
		"\u010e\u0114\u0005\u201c\u0000\u0000\u010f\u0113\b\u0004\u0000\u0000\u0110"+
		"\u0111\u0005\\\u0000\u0000\u0111\u0113\t\u0000\u0000\u0000\u0112\u010f"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0117\u0119\u0005\u201d\u0000\u0000\u0118\u0104"+
		"\u0001\u0000\u0000\u0000\u0118\u010e\u0001\u0000\u0000\u0000\u0119W\u0001"+
		"\u0000\u0000\u0000\u011a\u011c\u0007\u0005\u0000\u0000\u011b\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0006+\u0001\u0000\u0120Y\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0005/\u0000\u0000\u0122\u0123\u0005/\u0000\u0000\u0123"+
		"\u0127\u0001\u0000\u0000\u0000\u0124\u0126\b\u0006\u0000\u0000\u0125\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0006,\u0001\u0000\u012b[\u0001\u0000\u0000\u0000\u012c\u012e\u0007\u0005"+
		"\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0006-\u0001"+
		"\u0000\u0132]\u0001\u0000\u0000\u0000\u0133\u0134\u0005<\u0000\u0000\u0134"+
		"_\u0001\u0000\u0000\u0000\u0135\u0136\u0005>\u0000\u0000\u0136a\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005+\u0000\u0000\u0138c\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005-\u0000\u0000\u013ae\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005.\u0000\u0000\u013cg\u0001\u0000\u0000\u0000\u013d\u013e\u0005"+
		",\u0000\u0000\u013ei\u0001\u0000\u0000\u0000\u013f\u0140\u0005[\u0000"+
		"\u0000\u0140k\u0001\u0000\u0000\u0000\u0141\u0142\u0005]\u0000\u0000\u0142"+
		"m\u0001\u0000\u0000\u0000\u0143\u0144\u0005}\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u00066\u0002\u0000\u0146o\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\t\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u00067\u0001\u0000\u014aq\u0001\u0000\u0000\u0000\u000e\u0000"+
		"\u0001\u00f1\u00f7\u00fd\u0102\u0108\u010a\u0112\u0114\u0118\u011d\u0127"+
		"\u012f\u0003\u0005\u0001\u0000\u0006\u0000\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}