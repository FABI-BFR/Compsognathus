// Generated from C:/Users/Tobias Hahn/IdeaProjects/Compsognathus/src/main/java/antlr\Compiler_grammar.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Compiler_grammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, AND=2, ASSIGN=3, LBRACKET=4, RBRACKET=5, COLON=6, COMMA=7, DIV=8, 
		DOT=9, EXCLMARK=10, GREATER=11, LBRACE=12, LESS=13, MINUS=14, MOD=15, 
		MUL=16, OR=17, PLUS=18, RBRACE=19, SEMICOLON=20, TILDE=21, XOR=22, ANDEQUAL=23, 
		DIVIDEEQUAL=24, EQUAL=25, GREATEREQUAL=26, LESSEQUAL=27, LOGICALOR=28, 
		LOGICALAND=29, MINUSEQUAL=30, MODULOEQUAL=31, NOTEQUAL=32, OREQUAL=33, 
		PLUSEQUAL=34, SHIFTLEFTEQUAL=35, SIGNEDSHIFTRIGHTEQUAL=36, TIMESEQUAL=37, 
		UNSIGNEDSHIFTRIGHTEQUAL=38, XOREQUAL=39, INC=40, DEC=41, BOOLEAN=42, BOOLLITERAL=43, 
		CHAR=44, CLASS=45, ELSE=46, IF=47, INT=48, JNULL=49, NEW=50, PUBLIC=51, 
		PRIVATE=52, PROTECTED=53, RETURN=54, STATIC=55, STRING=56, THIS=57, VOID=58, 
		WHILE=59, CLASSIDENTIFIER=60, IDENTIFIER=61, INTLITERAL=62, CHARLITERAL=63, 
		STRINGLITERAL=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "AND", "ASSIGN", "LBRACKET", "RBRACKET", "COLON", "COMMA", "DIV", 
			"DOT", "EXCLMARK", "GREATER", "LBRACE", "LESS", "MINUS", "MOD", "MUL", 
			"OR", "PLUS", "RBRACE", "SEMICOLON", "TILDE", "XOR", "ANDEQUAL", "DIVIDEEQUAL", 
			"EQUAL", "GREATEREQUAL", "LESSEQUAL", "LOGICALOR", "LOGICALAND", "MINUSEQUAL", 
			"MODULOEQUAL", "NOTEQUAL", "OREQUAL", "PLUSEQUAL", "SHIFTLEFTEQUAL", 
			"SIGNEDSHIFTRIGHTEQUAL", "TIMESEQUAL", "UNSIGNEDSHIFTRIGHTEQUAL", "XOREQUAL", 
			"INC", "DEC", "BOOLEAN", "BOOLLITERAL", "CHAR", "CLASS", "ELSE", "IF", 
			"INT", "JNULL", "NEW", "PUBLIC", "PRIVATE", "PROTECTED", "RETURN", "STATIC", 
			"STRING", "THIS", "VOID", "WHILE", "CLASSIDENTIFIER", "IDENTIFIER", "INTLITERAL", 
			"CHARLITERAL", "STRINGLITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'&'", "'='", "'{'", "'}'", "':'", "','", "'/'", "'.'", "'!'", 
			"'>'", "'('", "'<'", "'-'", "'%'", "'*'", "'|'", "'+'", "')'", "';'", 
			"'~'", "'^'", "'&='", "'/='", "'=='", "'>='", "'<='", "'||'", "'&&'", 
			"'-='", "'%='", "'!='", "'|='", "'+='", "'<<='", "'>>='", "'*='", "'>>>='", 
			"'^='", "'++'", "'--'", "'boolean'", null, "'char'", "'class'", "'else'", 
			"'if'", "'int'", "'null'", "'new'", "'public'", "'private'", "'protected'", 
			"'return'", "'static'", "'String'", "'this'", "'void'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "AND", "ASSIGN", "LBRACKET", "RBRACKET", "COLON", "COMMA", 
			"DIV", "DOT", "EXCLMARK", "GREATER", "LBRACE", "LESS", "MINUS", "MOD", 
			"MUL", "OR", "PLUS", "RBRACE", "SEMICOLON", "TILDE", "XOR", "ANDEQUAL", 
			"DIVIDEEQUAL", "EQUAL", "GREATEREQUAL", "LESSEQUAL", "LOGICALOR", "LOGICALAND", 
			"MINUSEQUAL", "MODULOEQUAL", "NOTEQUAL", "OREQUAL", "PLUSEQUAL", "SHIFTLEFTEQUAL", 
			"SIGNEDSHIFTRIGHTEQUAL", "TIMESEQUAL", "UNSIGNEDSHIFTRIGHTEQUAL", "XOREQUAL", 
			"INC", "DEC", "BOOLEAN", "BOOLLITERAL", "CHAR", "CLASS", "ELSE", "IF", 
			"INT", "JNULL", "NEW", "PUBLIC", "PRIVATE", "PROTECTED", "RETURN", "STATIC", 
			"STRING", "THIS", "VOID", "WHILE", "CLASSIDENTIFIER", "IDENTIFIER", "INTLITERAL", 
			"CHARLITERAL", "STRINGLITERAL"
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


	public Compiler_grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compiler_grammar.g4"; }

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
		"\u0004\u0000@\u0180\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0001\u0000\u0004\u0000\u0083\b\u0000\u000b\u0000\f\u0000\u0084\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0101\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0005;\u0163\b;\n;\f;\u0166\t;\u0001<\u0001<\u0005"+
		"<\u016a\b<\n<\f<\u016d\t<\u0001=\u0004=\u0170\b=\u000b=\f=\u0171\u0001"+
		">\u0001>\u0001>\u0001>\u0001?\u0001?\u0005?\u017a\b?\n?\f?\u017d\t?\u0001"+
		"?\u0001?\u0001\u017b\u0000@\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s"+
		":u;w<y={>}?\u007f@\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0001\u0000"+
		"AZ\u0004\u000009AZ__az\u0002\u0000AZaz\u0001\u000009\u0185\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001"+
		"\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000"+
		"_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001"+
		"\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000"+
		"\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000"+
		"m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001"+
		"\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000"+
		"\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000"+
		"{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001"+
		"\u0000\u0000\u0000\u0001\u0082\u0001\u0000\u0000\u0000\u0003\u0088\u0001"+
		"\u0000\u0000\u0000\u0005\u008a\u0001\u0000\u0000\u0000\u0007\u008c\u0001"+
		"\u0000\u0000\u0000\t\u008e\u0001\u0000\u0000\u0000\u000b\u0090\u0001\u0000"+
		"\u0000\u0000\r\u0092\u0001\u0000\u0000\u0000\u000f\u0094\u0001\u0000\u0000"+
		"\u0000\u0011\u0096\u0001\u0000\u0000\u0000\u0013\u0098\u0001\u0000\u0000"+
		"\u0000\u0015\u009a\u0001\u0000\u0000\u0000\u0017\u009c\u0001\u0000\u0000"+
		"\u0000\u0019\u009e\u0001\u0000\u0000\u0000\u001b\u00a0\u0001\u0000\u0000"+
		"\u0000\u001d\u00a2\u0001\u0000\u0000\u0000\u001f\u00a4\u0001\u0000\u0000"+
		"\u0000!\u00a6\u0001\u0000\u0000\u0000#\u00a8\u0001\u0000\u0000\u0000%"+
		"\u00aa\u0001\u0000\u0000\u0000\'\u00ac\u0001\u0000\u0000\u0000)\u00ae"+
		"\u0001\u0000\u0000\u0000+\u00b0\u0001\u0000\u0000\u0000-\u00b2\u0001\u0000"+
		"\u0000\u0000/\u00b5\u0001\u0000\u0000\u00001\u00b8\u0001\u0000\u0000\u0000"+
		"3\u00bb\u0001\u0000\u0000\u00005\u00be\u0001\u0000\u0000\u00007\u00c1"+
		"\u0001\u0000\u0000\u00009\u00c4\u0001\u0000\u0000\u0000;\u00c7\u0001\u0000"+
		"\u0000\u0000=\u00ca\u0001\u0000\u0000\u0000?\u00cd\u0001\u0000\u0000\u0000"+
		"A\u00d0\u0001\u0000\u0000\u0000C\u00d3\u0001\u0000\u0000\u0000E\u00d6"+
		"\u0001\u0000\u0000\u0000G\u00da\u0001\u0000\u0000\u0000I\u00de\u0001\u0000"+
		"\u0000\u0000K\u00e1\u0001\u0000\u0000\u0000M\u00e6\u0001\u0000\u0000\u0000"+
		"O\u00e9\u0001\u0000\u0000\u0000Q\u00ec\u0001\u0000\u0000\u0000S\u00ef"+
		"\u0001\u0000\u0000\u0000U\u0100\u0001\u0000\u0000\u0000W\u0102\u0001\u0000"+
		"\u0000\u0000Y\u0107\u0001\u0000\u0000\u0000[\u010d\u0001\u0000\u0000\u0000"+
		"]\u0112\u0001\u0000\u0000\u0000_\u0115\u0001\u0000\u0000\u0000a\u0119"+
		"\u0001\u0000\u0000\u0000c\u011e\u0001\u0000\u0000\u0000e\u0122\u0001\u0000"+
		"\u0000\u0000g\u0129\u0001\u0000\u0000\u0000i\u0131\u0001\u0000\u0000\u0000"+
		"k\u013b\u0001\u0000\u0000\u0000m\u0142\u0001\u0000\u0000\u0000o\u0149"+
		"\u0001\u0000\u0000\u0000q\u0150\u0001\u0000\u0000\u0000s\u0155\u0001\u0000"+
		"\u0000\u0000u\u015a\u0001\u0000\u0000\u0000w\u0160\u0001\u0000\u0000\u0000"+
		"y\u0167\u0001\u0000\u0000\u0000{\u016f\u0001\u0000\u0000\u0000}\u0173"+
		"\u0001\u0000\u0000\u0000\u007f\u0177\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0007\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0006\u0000\u0000\u0000\u0087\u0002\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005&\u0000\u0000\u0089\u0004\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"=\u0000\u0000\u008b\u0006\u0001\u0000\u0000\u0000\u008c\u008d\u0005{\u0000"+
		"\u0000\u008d\b\u0001\u0000\u0000\u0000\u008e\u008f\u0005}\u0000\u0000"+
		"\u008f\n\u0001\u0000\u0000\u0000\u0090\u0091\u0005:\u0000\u0000\u0091"+
		"\f\u0001\u0000\u0000\u0000\u0092\u0093\u0005,\u0000\u0000\u0093\u000e"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005/\u0000\u0000\u0095\u0010\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005.\u0000\u0000\u0097\u0012\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005!\u0000\u0000\u0099\u0014\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005>\u0000\u0000\u009b\u0016\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005(\u0000\u0000\u009d\u0018\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005<\u0000\u0000\u009f\u001a\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005-\u0000\u0000\u00a1\u001c\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"%\u0000\u0000\u00a3\u001e\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005*\u0000"+
		"\u0000\u00a5 \u0001\u0000\u0000\u0000\u00a6\u00a7\u0005|\u0000\u0000\u00a7"+
		"\"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005+\u0000\u0000\u00a9$\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005)\u0000\u0000\u00ab&\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005;\u0000\u0000\u00ad(\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005~\u0000\u0000\u00af*\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"^\u0000\u0000\u00b1,\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005&\u0000"+
		"\u0000\u00b3\u00b4\u0005=\u0000\u0000\u00b4.\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005/\u0000\u0000\u00b6\u00b7\u0005=\u0000\u0000\u00b70\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005=\u0000\u0000\u00b9\u00ba\u0005=\u0000"+
		"\u0000\u00ba2\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005>\u0000\u0000\u00bc"+
		"\u00bd\u0005=\u0000\u0000\u00bd4\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"<\u0000\u0000\u00bf\u00c0\u0005=\u0000\u0000\u00c06\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005|\u0000\u0000\u00c2\u00c3\u0005|\u0000\u0000\u00c3"+
		"8\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005&\u0000\u0000\u00c5\u00c6\u0005"+
		"&\u0000\u0000\u00c6:\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005-\u0000"+
		"\u0000\u00c8\u00c9\u0005=\u0000\u0000\u00c9<\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005%\u0000\u0000\u00cb\u00cc\u0005=\u0000\u0000\u00cc>\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce\u00cf\u0005=\u0000"+
		"\u0000\u00cf@\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005|\u0000\u0000\u00d1"+
		"\u00d2\u0005=\u0000\u0000\u00d2B\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"+\u0000\u0000\u00d4\u00d5\u0005=\u0000\u0000\u00d5D\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005<\u0000\u0000\u00d7\u00d8\u0005<\u0000\u0000\u00d8"+
		"\u00d9\u0005=\u0000\u0000\u00d9F\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
		">\u0000\u0000\u00db\u00dc\u0005>\u0000\u0000\u00dc\u00dd\u0005=\u0000"+
		"\u0000\u00ddH\u0001\u0000\u0000\u0000\u00de\u00df\u0005*\u0000\u0000\u00df"+
		"\u00e0\u0005=\u0000\u0000\u00e0J\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		">\u0000\u0000\u00e2\u00e3\u0005>\u0000\u0000\u00e3\u00e4\u0005>\u0000"+
		"\u0000\u00e4\u00e5\u0005=\u0000\u0000\u00e5L\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005^\u0000\u0000\u00e7\u00e8\u0005=\u0000\u0000\u00e8N\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005+\u0000\u0000\u00ea\u00eb\u0005+\u0000"+
		"\u0000\u00ebP\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005-\u0000\u0000\u00ed"+
		"\u00ee\u0005-\u0000\u0000\u00eeR\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		"b\u0000\u0000\u00f0\u00f1\u0005o\u0000\u0000\u00f1\u00f2\u0005o\u0000"+
		"\u0000\u00f2\u00f3\u0005l\u0000\u0000\u00f3\u00f4\u0005e\u0000\u0000\u00f4"+
		"\u00f5\u0005a\u0000\u0000\u00f5\u00f6\u0005n\u0000\u0000\u00f6T\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005t\u0000\u0000\u00f8\u00f9\u0005r\u0000"+
		"\u0000\u00f9\u00fa\u0005u\u0000\u0000\u00fa\u0101\u0005e\u0000\u0000\u00fb"+
		"\u00fc\u0005f\u0000\u0000\u00fc\u00fd\u0005a\u0000\u0000\u00fd\u00fe\u0005"+
		"l\u0000\u0000\u00fe\u00ff\u0005s\u0000\u0000\u00ff\u0101\u0005e\u0000"+
		"\u0000\u0100\u00f7\u0001\u0000\u0000\u0000\u0100\u00fb\u0001\u0000\u0000"+
		"\u0000\u0101V\u0001\u0000\u0000\u0000\u0102\u0103\u0005c\u0000\u0000\u0103"+
		"\u0104\u0005h\u0000\u0000\u0104\u0105\u0005a\u0000\u0000\u0105\u0106\u0005"+
		"r\u0000\u0000\u0106X\u0001\u0000\u0000\u0000\u0107\u0108\u0005c\u0000"+
		"\u0000\u0108\u0109\u0005l\u0000\u0000\u0109\u010a\u0005a\u0000\u0000\u010a"+
		"\u010b\u0005s\u0000\u0000\u010b\u010c\u0005s\u0000\u0000\u010cZ\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005e\u0000\u0000\u010e\u010f\u0005l\u0000"+
		"\u0000\u010f\u0110\u0005s\u0000\u0000\u0110\u0111\u0005e\u0000\u0000\u0111"+
		"\\\u0001\u0000\u0000\u0000\u0112\u0113\u0005i\u0000\u0000\u0113\u0114"+
		"\u0005f\u0000\u0000\u0114^\u0001\u0000\u0000\u0000\u0115\u0116\u0005i"+
		"\u0000\u0000\u0116\u0117\u0005n\u0000\u0000\u0117\u0118\u0005t\u0000\u0000"+
		"\u0118`\u0001\u0000\u0000\u0000\u0119\u011a\u0005n\u0000\u0000\u011a\u011b"+
		"\u0005u\u0000\u0000\u011b\u011c\u0005l\u0000\u0000\u011c\u011d\u0005l"+
		"\u0000\u0000\u011db\u0001\u0000\u0000\u0000\u011e\u011f\u0005n\u0000\u0000"+
		"\u011f\u0120\u0005e\u0000\u0000\u0120\u0121\u0005w\u0000\u0000\u0121d"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0005p\u0000\u0000\u0123\u0124\u0005"+
		"u\u0000\u0000\u0124\u0125\u0005b\u0000\u0000\u0125\u0126\u0005l\u0000"+
		"\u0000\u0126\u0127\u0005i\u0000\u0000\u0127\u0128\u0005c\u0000\u0000\u0128"+
		"f\u0001\u0000\u0000\u0000\u0129\u012a\u0005p\u0000\u0000\u012a\u012b\u0005"+
		"r\u0000\u0000\u012b\u012c\u0005i\u0000\u0000\u012c\u012d\u0005v\u0000"+
		"\u0000\u012d\u012e\u0005a\u0000\u0000\u012e\u012f\u0005t\u0000\u0000\u012f"+
		"\u0130\u0005e\u0000\u0000\u0130h\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"p\u0000\u0000\u0132\u0133\u0005r\u0000\u0000\u0133\u0134\u0005o\u0000"+
		"\u0000\u0134\u0135\u0005t\u0000\u0000\u0135\u0136\u0005e\u0000\u0000\u0136"+
		"\u0137\u0005c\u0000\u0000\u0137\u0138\u0005t\u0000\u0000\u0138\u0139\u0005"+
		"e\u0000\u0000\u0139\u013a\u0005d\u0000\u0000\u013aj\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005r\u0000\u0000\u013c\u013d\u0005e\u0000\u0000\u013d"+
		"\u013e\u0005t\u0000\u0000\u013e\u013f\u0005u\u0000\u0000\u013f\u0140\u0005"+
		"r\u0000\u0000\u0140\u0141\u0005n\u0000\u0000\u0141l\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005s\u0000\u0000\u0143\u0144\u0005t\u0000\u0000\u0144"+
		"\u0145\u0005a\u0000\u0000\u0145\u0146\u0005t\u0000\u0000\u0146\u0147\u0005"+
		"i\u0000\u0000\u0147\u0148\u0005c\u0000\u0000\u0148n\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0005S\u0000\u0000\u014a\u014b\u0005t\u0000\u0000\u014b"+
		"\u014c\u0005r\u0000\u0000\u014c\u014d\u0005i\u0000\u0000\u014d\u014e\u0005"+
		"n\u0000\u0000\u014e\u014f\u0005g\u0000\u0000\u014fp\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005t\u0000\u0000\u0151\u0152\u0005h\u0000\u0000\u0152"+
		"\u0153\u0005i\u0000\u0000\u0153\u0154\u0005s\u0000\u0000\u0154r\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0005v\u0000\u0000\u0156\u0157\u0005o\u0000"+
		"\u0000\u0157\u0158\u0005i\u0000\u0000\u0158\u0159\u0005d\u0000\u0000\u0159"+
		"t\u0001\u0000\u0000\u0000\u015a\u015b\u0005w\u0000\u0000\u015b\u015c\u0005"+
		"h\u0000\u0000\u015c\u015d\u0005i\u0000\u0000\u015d\u015e\u0005l\u0000"+
		"\u0000\u015e\u015f\u0005e\u0000\u0000\u015fv\u0001\u0000\u0000\u0000\u0160"+
		"\u0164\u0007\u0001\u0000\u0000\u0161\u0163\u0007\u0002\u0000\u0000\u0162"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"x\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016b"+
		"\u0007\u0003\u0000\u0000\u0168\u016a\u0007\u0002\u0000\u0000\u0169\u0168"+
		"\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016cz\u0001"+
		"\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0170\u0007"+
		"\u0004\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001"+
		"\u0000\u0000\u0000\u0172|\u0001\u0000\u0000\u0000\u0173\u0174\u0005\'"+
		"\u0000\u0000\u0174\u0175\t\u0000\u0000\u0000\u0175\u0176\u0005\'\u0000"+
		"\u0000\u0176~\u0001\u0000\u0000\u0000\u0177\u017b\u0005\"\u0000\u0000"+
		"\u0178\u017a\t\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u017d\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017e\u017f\u0005\"\u0000\u0000\u017f\u0080"+
		"\u0001\u0000\u0000\u0000\t\u0000\u0084\u0100\u0162\u0164\u0169\u016b\u0171"+
		"\u017b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}