// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Compiler_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, AND=2, ASSIGN=3, LBRACKET=4, RBRACKET=5, COLON=6, COMMA=7, DIV=8, 
		DOT=9, EXCLMARK=10, GREATER=11, LBRACE=12, LESS=13, MINUS=14, MOD=15, 
		MUL=16, OR=17, PLUS=18, RBRACE=19, SEMICOLON=20, TILDE=21, XOR=22, ANDEQUAL=23, 
		DIVIDEEQUAL=24, EQUAL=25, GREATEREQUAL=26, LESSEQUAL=27, LOGICALOR=28, 
		MINUSEQUAL=29, MODULOEQUAL=30, NOTEQUAL=31, OREQUAL=32, PLUSEQUAL=33, 
		SHIFTLEFTEQUAL=34, SIGNEDSHIFTRIGHTEQUAL=35, TIMESEQUAL=36, UNSIGNEDSHIFTRIGHTEQUAL=37, 
		XOREQUAL=38, BOOLEAN=39, BOOLLITERAL=40, CHAR=41, CLASS=42, ELSE=43, IF=44, 
		INT=45, JNULL=46, NEW=47, PUBLIC=48, PRIVATE=49, PROTECTED=50, RETURN=51, 
		STATIC=52, STRING=53, THIS=54, VOID=55, WHILE=56, CLASSIDENTIFIER=57, 
		IDENTIFIER=58, INTLITERAL=59, CHARLITERAL=60, STRINGLITERAL=61;
	public static final int
		RULE_compilationunit = 0, RULE_classdeclarations = 1, RULE_classdeclaration = 2, 
		RULE_accessmodifier = 3, RULE_classbody = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationunit", "classdeclarations", "classdeclaration", "accessmodifier", 
			"classbody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'&'", "'='", "'{'", "'}'", "':'", "','", "'/'", "'.'", "'!'", 
			"'>'", "'('", "'<'", "'-'", "'%'", "'*'", "'|'", "'+'", "')'", "';'", 
			"'~'", "'^'", "'&='", "'/='", "'=='", "'>='", "'<='", "'||'", "'-='", 
			"'%='", "'!='", "'|='", "'+='", "'<<='", "'>>='", "'*='", "'>>>='", "'^='", 
			"'boolean'", null, "'char'", "'class'", "'else'", "'if'", "'int'", "'null'", 
			"'new'", "'public'", "'private'", "'protected'", "'return'", "'static'", 
			"'String'", "'this'", "'void'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "AND", "ASSIGN", "LBRACKET", "RBRACKET", "COLON", "COMMA", 
			"DIV", "DOT", "EXCLMARK", "GREATER", "LBRACE", "LESS", "MINUS", "MOD", 
			"MUL", "OR", "PLUS", "RBRACE", "SEMICOLON", "TILDE", "XOR", "ANDEQUAL", 
			"DIVIDEEQUAL", "EQUAL", "GREATEREQUAL", "LESSEQUAL", "LOGICALOR", "MINUSEQUAL", 
			"MODULOEQUAL", "NOTEQUAL", "OREQUAL", "PLUSEQUAL", "SHIFTLEFTEQUAL", 
			"SIGNEDSHIFTRIGHTEQUAL", "TIMESEQUAL", "UNSIGNEDSHIFTRIGHTEQUAL", "XOREQUAL", 
			"BOOLEAN", "BOOLLITERAL", "CHAR", "CLASS", "ELSE", "IF", "INT", "JNULL", 
			"NEW", "PUBLIC", "PRIVATE", "PROTECTED", "RETURN", "STATIC", "STRING", 
			"THIS", "VOID", "WHILE", "CLASSIDENTIFIER", "IDENTIFIER", "INTLITERAL", 
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Compiler_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationunitContext extends ParserRuleContext {
		public ClassdeclarationsContext classdeclarations() {
			return getRuleContext(ClassdeclarationsContext.class,0);
		}
		public CompilationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterCompilationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitCompilationunit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitCompilationunit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationunitContext compilationunit() throws RecognitionException {
		CompilationunitContext _localctx = new CompilationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationunit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			classdeclarations();
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
	public static class ClassdeclarationsContext extends ParserRuleContext {
		public List<ClassdeclarationContext> classdeclaration() {
			return getRuleContexts(ClassdeclarationContext.class);
		}
		public ClassdeclarationContext classdeclaration(int i) {
			return getRuleContext(ClassdeclarationContext.class,i);
		}
		public ClassdeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterClassdeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitClassdeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitClassdeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclarationsContext classdeclarations() throws RecognitionException {
		ClassdeclarationsContext _localctx = new ClassdeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdeclarations);
		int _la;
		try {
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				classdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1974722883485696L) != 0) {
					{
					{
					setState(13);
					classdeclaration();
					}
					}
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class ClassdeclarationContext extends ParserRuleContext {
		public AccessmodifierContext accessmodifier() {
			return getRuleContext(AccessmodifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Compiler_grammarParser.CLASS, 0); }
		public TerminalNode CLASSIDENTIFIER() { return getToken(Compiler_grammarParser.CLASSIDENTIFIER, 0); }
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public ClassdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterClassdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitClassdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitClassdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclarationContext classdeclaration() throws RecognitionException {
		ClassdeclarationContext _localctx = new ClassdeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classdeclaration);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				accessmodifier();
				setState(22);
				match(CLASS);
				setState(23);
				match(CLASSIDENTIFIER);
				setState(24);
				classbody();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(CLASS);
				setState(27);
				match(CLASSIDENTIFIER);
				setState(28);
				classbody();
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
	public static class AccessmodifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(Compiler_grammarParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(Compiler_grammarParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(Compiler_grammarParser.PROTECTED, 0); }
		public AccessmodifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessmodifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterAccessmodifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitAccessmodifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitAccessmodifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessmodifierContext accessmodifier() throws RecognitionException {
		AccessmodifierContext _localctx = new AccessmodifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_accessmodifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ClassbodyContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(Compiler_grammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Compiler_grammarParser.RBRACKET, 0); }
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterClassbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitClassbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitClassbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(LBRACKET);
			setState(34);
			match(RBRACKET);
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
		"\u0004\u0001=%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u000f\b\u0001\n\u0001"+
		"\f\u0001\u0012\t\u0001\u0003\u0001\u0014\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u001e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0001\u0001\u000002\"\u0000\n\u0001\u0000\u0000\u0000\u0002\u0013\u0001"+
		"\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000\u0006\u001f\u0001"+
		"\u0000\u0000\u0000\b!\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001"+
		"\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f\u0014\u0003\u0004\u0002\u0000"+
		"\r\u000f\u0003\u0004\u0002\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000\u0000\u0000\u0012"+
		"\u0010\u0001\u0000\u0000\u0000\u0013\f\u0001\u0000\u0000\u0000\u0013\u0010"+
		"\u0001\u0000\u0000\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0003\u0006\u0003\u0000\u0016\u0017\u0005*\u0000\u0000\u0017\u0018\u0005"+
		"9\u0000\u0000\u0018\u0019\u0003\b\u0004\u0000\u0019\u001e\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0005*\u0000\u0000\u001b\u001c\u00059\u0000\u0000"+
		"\u001c\u001e\u0003\b\u0004\u0000\u001d\u0015\u0001\u0000\u0000\u0000\u001d"+
		"\u001a\u0001\u0000\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f"+
		" \u0007\u0000\u0000\u0000 \u0007\u0001\u0000\u0000\u0000!\"\u0005\u0004"+
		"\u0000\u0000\"#\u0005\u0005\u0000\u0000#\t\u0001\u0000\u0000\u0000\u0003"+
		"\u0010\u0013\u001d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}