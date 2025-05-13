// Generated from /Users/simo/Desktop/CODING/JAVA/UNI/Laboratorio-Linguaggi-/QUARTO ESEMPIO/elaborato_linguaggi/src/myLang/Grammatica.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, FLOAT=16, INT=17, 
		STRING=18, WS=19, COMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ID", "FLOAT", "INT", "STRING", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "';'", "'print'", "'('", "')'", "'^'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'input'", "'str'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "FLOAT", "INT", "STRING", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Grammatica.g4"; }

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
		"\u0004\u0000\u0014\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"T\b\u000e\n\u000e\f\u000eW\t\u000e\u0001\u000f\u0004\u000fZ\b\u000f\u000b"+
		"\u000f\f\u000f[\u0001\u000f\u0001\u000f\u0004\u000f`\b\u000f\u000b\u000f"+
		"\f\u000fa\u0001\u0010\u0004\u0010e\b\u0010\u000b\u0010\f\u0010f\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011m\b\u0011\n\u0011"+
		"\f\u0011p\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012u\b\u0012"+
		"\u000b\u0012\f\u0012v\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u007f\b\u0013\n\u0013\f\u0013\u0082"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014\u0001\u0000\u0006\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000\n\n\r\r\u008c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000"+
		"\u0000\u00071\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b"+
		"9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f=\u0001\u0000"+
		"\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000"+
		"\u0015C\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019G"+
		"\u0001\u0000\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001dQ\u0001\u0000"+
		"\u0000\u0000\u001fY\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000"+
		"#h\u0001\u0000\u0000\u0000%t\u0001\u0000\u0000\u0000\'z\u0001\u0000\u0000"+
		"\u0000)*\u0005v\u0000\u0000*+\u0005a\u0000\u0000+,\u0005r\u0000\u0000"+
		",\u0002\u0001\u0000\u0000\u0000-.\u0005=\u0000\u0000.\u0004\u0001\u0000"+
		"\u0000\u0000/0\u0005;\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005"+
		"p\u0000\u000023\u0005r\u0000\u000034\u0005i\u0000\u000045\u0005n\u0000"+
		"\u000056\u0005t\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005(\u0000"+
		"\u00008\n\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:\f\u0001\u0000"+
		"\u0000\u0000;<\u0005^\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005"+
		"*\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005/\u0000\u0000@\u0012"+
		"\u0001\u0000\u0000\u0000AB\u0005%\u0000\u0000B\u0014\u0001\u0000\u0000"+
		"\u0000CD\u0005+\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0005-\u0000"+
		"\u0000F\u0018\u0001\u0000\u0000\u0000GH\u0005i\u0000\u0000HI\u0005n\u0000"+
		"\u0000IJ\u0005p\u0000\u0000JK\u0005u\u0000\u0000KL\u0005t\u0000\u0000"+
		"L\u001a\u0001\u0000\u0000\u0000MN\u0005s\u0000\u0000NO\u0005t\u0000\u0000"+
		"OP\u0005r\u0000\u0000P\u001c\u0001\u0000\u0000\u0000QU\u0007\u0000\u0000"+
		"\u0000RT\u0007\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u001e"+
		"\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0007\u0002\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0005"+
		".\u0000\u0000^`\u0007\u0002\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b \u0001\u0000\u0000\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000g\"\u0001\u0000\u0000\u0000hn\u0005\"\u0000\u0000im\b\u0003"+
		"\u0000\u0000jk\u0005\\\u0000\u0000km\t\u0000\u0000\u0000li\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000qr\u0005\"\u0000\u0000r$\u0001\u0000\u0000\u0000"+
		"su\u0007\u0004\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0006\u0012\u0000\u0000y&\u0001\u0000\u0000\u0000z{\u0005"+
		"/\u0000\u0000{|\u0005/\u0000\u0000|\u0080\u0001\u0000\u0000\u0000}\u007f"+
		"\b\u0005\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0006\u0013\u0000\u0000\u0084(\u0001\u0000\u0000\u0000"+
		"\t\u0000U[aflnv\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}