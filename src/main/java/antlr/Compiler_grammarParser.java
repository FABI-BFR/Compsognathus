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
		IDENTIFIER=58, INTLITERAL=59, CHARLITERAL=60, STRINGLITERAL=61, RBREACE=62, 
		INCREMENT=63, DECREMENT=64;
	public static final int
		RULE_compilationunit = 0, RULE_classdeclarations = 1, RULE_classdeclaration = 2, 
		RULE_accessmodifier = 3, RULE_classbody = 4, RULE_classbodydeclarations = 5, 
		RULE_classbodydeclaration = 6, RULE_fielddeclaration = 7, RULE_type = 8, 
		RULE_primitivetype = 9, RULE_referencetype = 10, RULE_classorinterfacetype = 11, 
		RULE_name = 12, RULE_simplename = 13, RULE_variabledeclarators = 14, RULE_variabledeclarator = 15, 
		RULE_methoddeclaration = 16, RULE_methodheader = 17, RULE_methoddeclarator = 18, 
		RULE_methodbody = 19, RULE_block = 20, RULE_blockstatements = 21, RULE_blockstatement = 22, 
		RULE_localvariabledeclaration = 23, RULE_statement = 24, RULE_ifstatement = 25, 
		RULE_ifelsestatement = 26, RULE_whilestatement = 27, RULE_statementwithoutrailingsubstatement = 28, 
		RULE_emptystatement = 29, RULE_expressionstatement = 30, RULE_returnstatement = 31, 
		RULE_statementnoshortif = 32, RULE_ifelsestatementnoshortif = 33, RULE_whilestatementnoshortif = 34, 
		RULE_statementexpression = 35, RULE_assignment = 36, RULE_lefthandside = 37, 
		RULE_assignmentoperator = 38, RULE_preincrementexpression = 39, RULE_predecrementexpression = 40, 
		RULE_postincrementexpression = 41, RULE_postdecrementexpression = 42, 
		RULE_methodcallexpression = 43, RULE_argumentlist = 44, RULE_primary = 45, 
		RULE_fieldaccess = 46, RULE_newexpression = 47, RULE_literal = 48, RULE_postfixexpression = 49, 
		RULE_unaryexpression = 50, RULE_unaryexpressionnotplusminus = 51, RULE_castexpression = 52, 
		RULE_assignmentexpression = 53, RULE_expression = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationunit", "classdeclarations", "classdeclaration", "accessmodifier", 
			"classbody", "classbodydeclarations", "classbodydeclaration", "fielddeclaration", 
			"type", "primitivetype", "referencetype", "classorinterfacetype", "name", 
			"simplename", "variabledeclarators", "variabledeclarator", "methoddeclaration", 
			"methodheader", "methoddeclarator", "methodbody", "block", "blockstatements", 
			"blockstatement", "localvariabledeclaration", "statement", "ifstatement", 
			"ifelsestatement", "whilestatement", "statementwithoutrailingsubstatement", 
			"emptystatement", "expressionstatement", "returnstatement", "statementnoshortif", 
			"ifelsestatementnoshortif", "whilestatementnoshortif", "statementexpression", 
			"assignment", "lefthandside", "assignmentoperator", "preincrementexpression", 
			"predecrementexpression", "postincrementexpression", "postdecrementexpression", 
			"methodcallexpression", "argumentlist", "primary", "fieldaccess", "newexpression", 
			"literal", "postfixexpression", "unaryexpression", "unaryexpressionnotplusminus", 
			"castexpression", "assignmentexpression", "expression"
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
			"CHARLITERAL", "STRINGLITERAL", "RBREACE", "INCREMENT", "DECREMENT"
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
			setState(110);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1974722883485696L) != 0) {
				{
				{
				setState(112);
				classdeclaration();
				}
				}
				setState(117);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				accessmodifier();
				setState(119);
				match(CLASS);
				setState(120);
				match(CLASSIDENTIFIER);
				setState(121);
				classbody();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(CLASS);
				setState(124);
				match(CLASSIDENTIFIER);
				setState(125);
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
			setState(128);
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
		public ClassbodydeclarationsContext classbodydeclarations() {
			return getRuleContext(ClassbodydeclarationsContext.class,0);
		}
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(LBRACKET);
				setState(131);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(LBRACKET);
				setState(133);
				classbodydeclarations();
				setState(134);
				match(RBRACKET);
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
	public static class ClassbodydeclarationsContext extends ParserRuleContext {
		public List<ClassbodydeclarationContext> classbodydeclaration() {
			return getRuleContexts(ClassbodydeclarationContext.class);
		}
		public ClassbodydeclarationContext classbodydeclaration(int i) {
			return getRuleContext(ClassbodydeclarationContext.class,i);
		}
		public ClassbodydeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbodydeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterClassbodydeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitClassbodydeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitClassbodydeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassbodydeclarationsContext classbodydeclarations() throws RecognitionException {
		ClassbodydeclarationsContext _localctx = new ClassbodydeclarationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classbodydeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 326267431158808576L) != 0) {
				{
				{
				setState(138);
				classbodydeclaration();
				}
				}
				setState(143);
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
	public static class ClassbodydeclarationContext extends ParserRuleContext {
		public FielddeclarationContext fielddeclaration() {
			return getRuleContext(FielddeclarationContext.class,0);
		}
		public MethoddeclarationContext methoddeclaration() {
			return getRuleContext(MethoddeclarationContext.class,0);
		}
		public ClassbodydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbodydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterClassbodydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitClassbodydeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitClassbodydeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassbodydeclarationContext classbodydeclaration() throws RecognitionException {
		ClassbodydeclarationContext _localctx = new ClassbodydeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classbodydeclaration);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				fielddeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				methoddeclaration();
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
	public static class FielddeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariabledeclaratorsContext variabledeclarators() {
			return getRuleContext(VariabledeclaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Compiler_grammarParser.SEMICOLON, 0); }
		public AccessmodifierContext accessmodifier() {
			return getRuleContext(AccessmodifierContext.class,0);
		}
		public FielddeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterFielddeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitFielddeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitFielddeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FielddeclarationContext fielddeclaration() throws RecognitionException {
		FielddeclarationContext _localctx = new FielddeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fielddeclaration);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				type();
				setState(149);
				variabledeclarators();
				setState(150);
				match(SEMICOLON);
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				accessmodifier();
				setState(153);
				type();
				setState(154);
				variabledeclarators();
				setState(155);
				match(SEMICOLON);
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
	public static class TypeContext extends ParserRuleContext {
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public ReferencetypeContext referencetype() {
			return getRuleContext(ReferencetypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				primitivetype();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				referencetype();
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
	public static class PrimitivetypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Compiler_grammarParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(Compiler_grammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(Compiler_grammarParser.CHAR, 0); }
		public PrimitivetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterPrimitivetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitPrimitivetype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitPrimitivetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivetypeContext primitivetype() throws RecognitionException {
		PrimitivetypeContext _localctx = new PrimitivetypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primitivetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 37933151158272L) != 0) ) {
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
	public static class ReferencetypeContext extends ParserRuleContext {
		public ClassorinterfacetypeContext classorinterfacetype() {
			return getRuleContext(ClassorinterfacetypeContext.class,0);
		}
		public ReferencetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterReferencetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitReferencetype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitReferencetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencetypeContext referencetype() throws RecognitionException {
		ReferencetypeContext _localctx = new ReferencetypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_referencetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			classorinterfacetype();
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
	public static class ClassorinterfacetypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ClassorinterfacetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classorinterfacetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterClassorinterfacetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitClassorinterfacetype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitClassorinterfacetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassorinterfacetypeContext classorinterfacetype() throws RecognitionException {
		ClassorinterfacetypeContext _localctx = new ClassorinterfacetypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classorinterfacetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			name();
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
	public static class NameContext extends ParserRuleContext {
		public SimplenameContext simplename() {
			return getRuleContext(SimplenameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			simplename();
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
	public static class SimplenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Compiler_grammarParser.IDENTIFIER, 0); }
		public SimplenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterSimplename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitSimplename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitSimplename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplenameContext simplename() throws RecognitionException {
		SimplenameContext _localctx = new SimplenameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simplename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IDENTIFIER);
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
	public static class VariabledeclaratorsContext extends ParserRuleContext {
		public VariabledeclaratorContext variabledeclarator() {
			return getRuleContext(VariabledeclaratorContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Compiler_grammarParser.COMMA, 0); }
		public VariabledeclaratorsContext variabledeclarators() {
			return getRuleContext(VariabledeclaratorsContext.class,0);
		}
		public VariabledeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterVariabledeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitVariabledeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitVariabledeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclaratorsContext variabledeclarators() throws RecognitionException {
		VariabledeclaratorsContext _localctx = new VariabledeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variabledeclarators);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				variabledeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				variabledeclarator();
				setState(175);
				match(COMMA);
				setState(176);
				variabledeclarators();
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
	public static class VariabledeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Compiler_grammarParser.IDENTIFIER, 0); }
		public VariabledeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterVariabledeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitVariabledeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitVariabledeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclaratorContext variabledeclarator() throws RecognitionException {
		VariabledeclaratorContext _localctx = new VariabledeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variabledeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IDENTIFIER);
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
	public static class MethoddeclarationContext extends ParserRuleContext {
		public MethodheaderContext methodheader() {
			return getRuleContext(MethodheaderContext.class,0);
		}
		public MethodbodyContext methodbody() {
			return getRuleContext(MethodbodyContext.class,0);
		}
		public MethoddeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterMethoddeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitMethoddeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitMethoddeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddeclarationContext methoddeclaration() throws RecognitionException {
		MethoddeclarationContext _localctx = new MethoddeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methoddeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			methodheader();
			setState(183);
			methodbody();
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
	public static class MethodheaderContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethoddeclaratorContext methoddeclarator() {
			return getRuleContext(MethoddeclaratorContext.class,0);
		}
		public AccessmodifierContext accessmodifier() {
			return getRuleContext(AccessmodifierContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Compiler_grammarParser.VOID, 0); }
		public MethodheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterMethodheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitMethodheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitMethodheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodheaderContext methodheader() throws RecognitionException {
		MethodheaderContext _localctx = new MethodheaderContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodheader);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				type();
				setState(186);
				methoddeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				accessmodifier();
				setState(189);
				type();
				setState(190);
				methoddeclarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(VOID);
				setState(193);
				methoddeclarator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				accessmodifier();
				setState(195);
				match(VOID);
				setState(196);
				methoddeclarator();
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
	public static class MethoddeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Compiler_grammarParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public MethoddeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterMethoddeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitMethoddeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitMethoddeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddeclaratorContext methoddeclarator() throws RecognitionException {
		MethoddeclaratorContext _localctx = new MethoddeclaratorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methoddeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IDENTIFIER);
			setState(201);
			match(LBRACE);
			setState(202);
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
	public static class MethodbodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Compiler_grammarParser.SEMICOLON, 0); }
		public MethodbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterMethodbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitMethodbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitMethodbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodbodyContext methodbody() throws RecognitionException {
		MethodbodyContext _localctx = new MethodbodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodbody);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(SEMICOLON);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(Compiler_grammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Compiler_grammarParser.RBRACKET, 0); }
		public BlockstatementsContext blockstatements() {
			return getRuleContext(BlockstatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(LBRACKET);
				setState(209);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(LBRACKET);
				setState(211);
				blockstatements();
				setState(212);
				match(RBRACKET);
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
	public static class BlockstatementsContext extends ParserRuleContext {
		public BlockstatementContext blockstatement() {
			return getRuleContext(BlockstatementContext.class,0);
		}
		public BlockstatementsContext blockstatements() {
			return getRuleContext(BlockstatementsContext.class,0);
		}
		public BlockstatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterBlockstatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitBlockstatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitBlockstatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockstatementsContext blockstatements() throws RecognitionException {
		BlockstatementsContext _localctx = new BlockstatementsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blockstatements);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				blockstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				blockstatement();
				setState(218);
				blockstatements();
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
	public static class BlockstatementContext extends ParserRuleContext {
		public LocalvariabledeclarationContext localvariabledeclaration() {
			return getRuleContext(LocalvariabledeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Compiler_grammarParser.SEMICOLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterBlockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitBlockstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitBlockstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockstatementContext blockstatement() throws RecognitionException {
		BlockstatementContext _localctx = new BlockstatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockstatement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				localvariabledeclaration();
				setState(223);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				statement();
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
	public static class LocalvariabledeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariabledeclaratorsContext variabledeclarators() {
			return getRuleContext(VariabledeclaratorsContext.class,0);
		}
		public LocalvariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localvariabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterLocalvariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitLocalvariabledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitLocalvariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalvariabledeclarationContext localvariabledeclaration() throws RecognitionException {
		LocalvariabledeclarationContext _localctx = new LocalvariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_localvariabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			type();
			setState(229);
			variabledeclarators();
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
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IfelsestatementContext ifelsestatement() {
			return getRuleContext(IfelsestatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public StatementwithoutrailingsubstatementContext statementwithoutrailingsubstatement() {
			return getRuleContext(StatementwithoutrailingsubstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				ifstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				ifelsestatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				whilestatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				statementwithoutrailingsubstatement();
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
	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Compiler_grammarParser.IF, 0); }
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IF);
			setState(238);
			match(LBRACE);
			setState(239);
			expression();
			setState(240);
			match(RBRACE);
			setState(241);
			statement();
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
	public static class IfelsestatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Compiler_grammarParser.IF, 0); }
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public StatementnoshortifContext statementnoshortif() {
			return getRuleContext(StatementnoshortifContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Compiler_grammarParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfelsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterIfelsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitIfelsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitIfelsestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelsestatementContext ifelsestatement() throws RecognitionException {
		IfelsestatementContext _localctx = new IfelsestatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifelsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IF);
			setState(244);
			match(LBRACE);
			setState(245);
			expression();
			setState(246);
			match(RBRACE);
			setState(247);
			statementnoshortif();
			setState(248);
			match(ELSE);
			setState(249);
			statement();
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
	public static class WhilestatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Compiler_grammarParser.WHILE, 0); }
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(WHILE);
			setState(252);
			match(LBRACE);
			setState(253);
			expression();
			setState(254);
			match(RBRACE);
			setState(255);
			statement();
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
	public static class StatementwithoutrailingsubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptystatementContext emptystatement() {
			return getRuleContext(EmptystatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public StatementwithoutrailingsubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementwithoutrailingsubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterStatementwithoutrailingsubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitStatementwithoutrailingsubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitStatementwithoutrailingsubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementwithoutrailingsubstatementContext statementwithoutrailingsubstatement() throws RecognitionException {
		StatementwithoutrailingsubstatementContext _localctx = new StatementwithoutrailingsubstatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementwithoutrailingsubstatement);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				emptystatement();
				}
				break;
			case LBRACE:
			case BOOLLITERAL:
			case JNULL:
			case NEW:
			case THIS:
			case IDENTIFIER:
			case INTLITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				expressionstatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				returnstatement();
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
	public static class EmptystatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(Compiler_grammarParser.SEMICOLON, 0); }
		public EmptystatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptystatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterEmptystatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitEmptystatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitEmptystatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptystatementContext emptystatement() throws RecognitionException {
		EmptystatementContext _localctx = new EmptystatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_emptystatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
	public static class ExpressionstatementContext extends ParserRuleContext {
		public StatementexpressionContext statementexpression() {
			return getRuleContext(StatementexpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Compiler_grammarParser.SEMICOLON, 0); }
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitExpressionstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitExpressionstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			statementexpression();
			setState(266);
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
	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Compiler_grammarParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Compiler_grammarParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnstatement);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(RETURN);
				setState(269);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(RETURN);
				setState(271);
				expression();
				setState(272);
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
	public static class StatementnoshortifContext extends ParserRuleContext {
		public StatementwithoutrailingsubstatementContext statementwithoutrailingsubstatement() {
			return getRuleContext(StatementwithoutrailingsubstatementContext.class,0);
		}
		public IfelsestatementnoshortifContext ifelsestatementnoshortif() {
			return getRuleContext(IfelsestatementnoshortifContext.class,0);
		}
		public WhilestatementnoshortifContext whilestatementnoshortif() {
			return getRuleContext(WhilestatementnoshortifContext.class,0);
		}
		public StatementnoshortifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementnoshortif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterStatementnoshortif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitStatementnoshortif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitStatementnoshortif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementnoshortifContext statementnoshortif() throws RecognitionException {
		StatementnoshortifContext _localctx = new StatementnoshortifContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statementnoshortif);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
			case LBRACE:
			case SEMICOLON:
			case BOOLLITERAL:
			case JNULL:
			case NEW:
			case RETURN:
			case THIS:
			case IDENTIFIER:
			case INTLITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				statementwithoutrailingsubstatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				ifelsestatementnoshortif();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				whilestatementnoshortif();
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
	public static class IfelsestatementnoshortifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Compiler_grammarParser.IF, 0); }
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public List<StatementnoshortifContext> statementnoshortif() {
			return getRuleContexts(StatementnoshortifContext.class);
		}
		public StatementnoshortifContext statementnoshortif(int i) {
			return getRuleContext(StatementnoshortifContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Compiler_grammarParser.ELSE, 0); }
		public IfelsestatementnoshortifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelsestatementnoshortif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterIfelsestatementnoshortif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitIfelsestatementnoshortif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitIfelsestatementnoshortif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelsestatementnoshortifContext ifelsestatementnoshortif() throws RecognitionException {
		IfelsestatementnoshortifContext _localctx = new IfelsestatementnoshortifContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifelsestatementnoshortif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IF);
			setState(282);
			match(LBRACE);
			setState(283);
			expression();
			setState(284);
			match(RBRACE);
			setState(285);
			statementnoshortif();
			setState(286);
			match(ELSE);
			setState(287);
			statementnoshortif();
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
	public static class WhilestatementnoshortifContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Compiler_grammarParser.WHILE, 0); }
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBREACE() { return getToken(Compiler_grammarParser.RBREACE, 0); }
		public StatementnoshortifContext statementnoshortif() {
			return getRuleContext(StatementnoshortifContext.class,0);
		}
		public WhilestatementnoshortifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatementnoshortif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterWhilestatementnoshortif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitWhilestatementnoshortif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitWhilestatementnoshortif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementnoshortifContext whilestatementnoshortif() throws RecognitionException {
		WhilestatementnoshortifContext _localctx = new WhilestatementnoshortifContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whilestatementnoshortif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(WHILE);
			setState(290);
			match(LBRACE);
			setState(291);
			expression();
			setState(292);
			match(RBREACE);
			setState(293);
			statementnoshortif();
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
	public static class StatementexpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreincrementexpressionContext preincrementexpression() {
			return getRuleContext(PreincrementexpressionContext.class,0);
		}
		public PredecrementexpressionContext predecrementexpression() {
			return getRuleContext(PredecrementexpressionContext.class,0);
		}
		public PostincrementexpressionContext postincrementexpression() {
			return getRuleContext(PostincrementexpressionContext.class,0);
		}
		public PostdecrementexpressionContext postdecrementexpression() {
			return getRuleContext(PostdecrementexpressionContext.class,0);
		}
		public MethodcallexpressionContext methodcallexpression() {
			return getRuleContext(MethodcallexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public StatementexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterStatementexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitStatementexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitStatementexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementexpressionContext statementexpression() throws RecognitionException {
		StatementexpressionContext _localctx = new StatementexpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statementexpression);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				preincrementexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				predecrementexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				postincrementexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				postdecrementexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				methodcallexpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				newexpression();
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
	public static class AssignmentContext extends ParserRuleContext {
		public LefthandsideContext lefthandside() {
			return getRuleContext(LefthandsideContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			lefthandside();
			setState(305);
			assignmentoperator();
			setState(306);
			assignmentexpression();
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
	public static class LefthandsideContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LefthandsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lefthandside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterLefthandside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitLefthandside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitLefthandside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LefthandsideContext lefthandside() throws RecognitionException {
		LefthandsideContext _localctx = new LefthandsideContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lefthandside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			name();
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
	public static class AssignmentoperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Compiler_grammarParser.ASSIGN, 0); }
		public TerminalNode TIMESEQUAL() { return getToken(Compiler_grammarParser.TIMESEQUAL, 0); }
		public TerminalNode DIVIDEEQUAL() { return getToken(Compiler_grammarParser.DIVIDEEQUAL, 0); }
		public TerminalNode MODULOEQUAL() { return getToken(Compiler_grammarParser.MODULOEQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(Compiler_grammarParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(Compiler_grammarParser.MINUSEQUAL, 0); }
		public TerminalNode SHIFTLEFTEQUAL() { return getToken(Compiler_grammarParser.SHIFTLEFTEQUAL, 0); }
		public TerminalNode SIGNEDSHIFTRIGHTEQUAL() { return getToken(Compiler_grammarParser.SIGNEDSHIFTRIGHTEQUAL, 0); }
		public TerminalNode UNSIGNEDSHIFTRIGHTEQUAL() { return getToken(Compiler_grammarParser.UNSIGNEDSHIFTRIGHTEQUAL, 0); }
		public TerminalNode ANDEQUAL() { return getToken(Compiler_grammarParser.ANDEQUAL, 0); }
		public TerminalNode XOREQUAL() { return getToken(Compiler_grammarParser.XOREQUAL, 0); }
		public TerminalNode OREQUAL() { return getToken(Compiler_grammarParser.OREQUAL, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitAssignmentoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitAssignmentoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 547096625160L) != 0) ) {
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
	public static class PreincrementexpressionContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(Compiler_grammarParser.INCREMENT, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public PreincrementexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preincrementexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterPreincrementexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitPreincrementexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitPreincrementexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreincrementexpressionContext preincrementexpression() throws RecognitionException {
		PreincrementexpressionContext _localctx = new PreincrementexpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_preincrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(INCREMENT);
			setState(313);
			unaryexpression();
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
	public static class PredecrementexpressionContext extends ParserRuleContext {
		public TerminalNode DECREMENT() { return getToken(Compiler_grammarParser.DECREMENT, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public PredecrementexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predecrementexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterPredecrementexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitPredecrementexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitPredecrementexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredecrementexpressionContext predecrementexpression() throws RecognitionException {
		PredecrementexpressionContext _localctx = new PredecrementexpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_predecrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(DECREMENT);
			setState(316);
			unaryexpression();
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
	public static class PostincrementexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(Compiler_grammarParser.INCREMENT, 0); }
		public PostincrementexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postincrementexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterPostincrementexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitPostincrementexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitPostincrementexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostincrementexpressionContext postincrementexpression() throws RecognitionException {
		PostincrementexpressionContext _localctx = new PostincrementexpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_postincrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			postfixexpression();
			setState(319);
			match(INCREMENT);
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
	public static class PostdecrementexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(Compiler_grammarParser.DECREMENT, 0); }
		public PostdecrementexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postdecrementexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterPostdecrementexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitPostdecrementexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitPostdecrementexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostdecrementexpressionContext postdecrementexpression() throws RecognitionException {
		PostdecrementexpressionContext _localctx = new PostdecrementexpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_postdecrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			postfixexpression();
			setState(322);
			match(DECREMENT);
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
	public static class MethodcallexpressionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Compiler_grammarParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Compiler_grammarParser.IDENTIFIER, 0); }
		public MethodcallexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcallexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterMethodcallexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitMethodcallexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitMethodcallexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallexpressionContext methodcallexpression() throws RecognitionException {
		MethodcallexpressionContext _localctx = new MethodcallexpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_methodcallexpression);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				name();
				setState(325);
				match(LBRACE);
				setState(326);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				name();
				setState(329);
				match(LBRACE);
				setState(330);
				argumentlist();
				setState(331);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				primary();
				setState(334);
				match(DOT);
				setState(335);
				match(IDENTIFIER);
				setState(336);
				match(LBRACE);
				setState(337);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				primary();
				setState(340);
				match(DOT);
				setState(341);
				match(IDENTIFIER);
				setState(342);
				match(LBRACE);
				setState(343);
				argumentlist();
				setState(344);
				match(RBRACE);
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
	public static class ArgumentlistContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Compiler_grammarParser.COMMA, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitArgumentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argumentlist);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				expression();
				setState(350);
				match(COMMA);
				setState(351);
				argumentlist();
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
	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Compiler_grammarParser.THIS, 0); }
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primary);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLLITERAL:
			case JNULL:
			case INTLITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				literal();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(THIS);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(LBRACE);
				setState(358);
				expression();
				setState(359);
				match(RBRACE);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				newexpression();
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
	public static class FieldaccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Compiler_grammarParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Compiler_grammarParser.IDENTIFIER, 0); }
		public FieldaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldaccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterFieldaccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitFieldaccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitFieldaccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldaccessContext fieldaccess() throws RecognitionException {
		FieldaccessContext _localctx = new FieldaccessContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fieldaccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			primary();
			setState(365);
			match(DOT);
			setState(366);
			match(IDENTIFIER);
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
	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Compiler_grammarParser.NEW, 0); }
		public ClassorinterfacetypeContext classorinterfacetype() {
			return getRuleContext(ClassorinterfacetypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitNewexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitNewexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_newexpression);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(NEW);
				setState(369);
				classorinterfacetype();
				setState(370);
				match(LBRACE);
				setState(371);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(NEW);
				setState(374);
				classorinterfacetype();
				setState(375);
				match(LBRACE);
				setState(376);
				argumentlist();
				setState(377);
				match(RBRACE);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(Compiler_grammarParser.INTLITERAL, 0); }
		public TerminalNode BOOLLITERAL() { return getToken(Compiler_grammarParser.BOOLLITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(Compiler_grammarParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(Compiler_grammarParser.STRINGLITERAL, 0); }
		public TerminalNode JNULL() { return getToken(Compiler_grammarParser.JNULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4035296734379769856L) != 0) ) {
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
	public static class PostfixexpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitPostfixexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitPostfixexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_postfixexpression);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case BOOLLITERAL:
			case JNULL:
			case NEW:
			case THIS:
			case INTLITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				primary();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				name();
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
	public static class UnaryexpressionContext extends ParserRuleContext {
		public PreincrementexpressionContext preincrementexpression() {
			return getRuleContext(PreincrementexpressionContext.class,0);
		}
		public PredecrementexpressionContext predecrementexpression() {
			return getRuleContext(PredecrementexpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(Compiler_grammarParser.PLUS, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Compiler_grammarParser.MINUS, 0); }
		public UnaryexpressionnotplusminusContext unaryexpressionnotplusminus() {
			return getRuleContext(UnaryexpressionnotplusminusContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitUnaryexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitUnaryexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unaryexpression);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				preincrementexpression();
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				predecrementexpression();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(PLUS);
				setState(390);
				unaryexpression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(MINUS);
				setState(392);
				unaryexpression();
				}
				break;
			case EXCLMARK:
			case LBRACE:
			case TILDE:
			case BOOLLITERAL:
			case JNULL:
			case NEW:
			case THIS:
			case IDENTIFIER:
			case INTLITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				unaryexpressionnotplusminus();
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
	public static class UnaryexpressionnotplusminusContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(Compiler_grammarParser.TILDE, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode EXCLMARK() { return getToken(Compiler_grammarParser.EXCLMARK, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryexpressionnotplusminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpressionnotplusminus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterUnaryexpressionnotplusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitUnaryexpressionnotplusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitUnaryexpressionnotplusminus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryexpressionnotplusminusContext unaryexpressionnotplusminus() throws RecognitionException {
		UnaryexpressionnotplusminusContext _localctx = new UnaryexpressionnotplusminusContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unaryexpressionnotplusminus);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				postfixexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(TILDE);
				setState(398);
				unaryexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(EXCLMARK);
				setState(400);
				unaryexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				castexpression();
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
	public static class CastexpressionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Compiler_grammarParser.LBRACE, 0); }
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Compiler_grammarParser.RBRACE, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryexpressionnotplusminusContext unaryexpressionnotplusminus() {
			return getRuleContext(UnaryexpressionnotplusminusContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitCastexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitCastexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_castexpression);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(LBRACE);
				setState(405);
				primitivetype();
				setState(406);
				match(RBRACE);
				setState(407);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(LBRACE);
				setState(410);
				expression();
				setState(411);
				match(RBRACE);
				setState(412);
				unaryexpressionnotplusminus();
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
	public static class AssignmentexpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitAssignmentexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitAssignmentexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_assignmentexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			assignment();
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Compiler_grammarParser.IDENTIFIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(IDENTIFIER);
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
		"\u0004\u0001@\u01a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0005\u0001r\b\u0001\n\u0001\f\u0001u\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u007f\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0089\b\u0004\u0001\u0005\u0005\u0005\u008c\b\u0005"+
		"\n\u0005\f\u0005\u008f\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0093"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009e\b\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00a2\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b3\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c7"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00cf\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d7\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00dd\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00e3\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00ec\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0106\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0113\b\u001f\u0001 \u0001"+
		" \u0001 \u0003 \u0118\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u012f\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u015b\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0162\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u016b\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u017c\b/\u00010\u00010\u00011\u00011\u00031\u0182"+
		"\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u018b\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u0193\b3\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u019f\b4\u0001"+
		"5\u00015\u00016\u00016\u00016\u0000\u00007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\u0004\u0001\u000002\u0003\u0000\'\'"+
		"))--\u0004\u0000\u0003\u0003\u0017\u0018\u001d\u001e &\u0003\u0000((."+
		".;=\u019c\u0000n\u0001\u0000\u0000\u0000\u0002s\u0001\u0000\u0000\u0000"+
		"\u0004~\u0001\u0000\u0000\u0000\u0006\u0080\u0001\u0000\u0000\u0000\b"+
		"\u0088\u0001\u0000\u0000\u0000\n\u008d\u0001\u0000\u0000\u0000\f\u0092"+
		"\u0001\u0000\u0000\u0000\u000e\u009d\u0001\u0000\u0000\u0000\u0010\u00a1"+
		"\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00a5"+
		"\u0001\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018\u00a9"+
		"\u0001\u0000\u0000\u0000\u001a\u00ab\u0001\u0000\u0000\u0000\u001c\u00b2"+
		"\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000\u0000 \u00b6\u0001"+
		"\u0000\u0000\u0000\"\u00c6\u0001\u0000\u0000\u0000$\u00c8\u0001\u0000"+
		"\u0000\u0000&\u00ce\u0001\u0000\u0000\u0000(\u00d6\u0001\u0000\u0000\u0000"+
		"*\u00dc\u0001\u0000\u0000\u0000,\u00e2\u0001\u0000\u0000\u0000.\u00e4"+
		"\u0001\u0000\u0000\u00000\u00eb\u0001\u0000\u0000\u00002\u00ed\u0001\u0000"+
		"\u0000\u00004\u00f3\u0001\u0000\u0000\u00006\u00fb\u0001\u0000\u0000\u0000"+
		"8\u0105\u0001\u0000\u0000\u0000:\u0107\u0001\u0000\u0000\u0000<\u0109"+
		"\u0001\u0000\u0000\u0000>\u0112\u0001\u0000\u0000\u0000@\u0117\u0001\u0000"+
		"\u0000\u0000B\u0119\u0001\u0000\u0000\u0000D\u0121\u0001\u0000\u0000\u0000"+
		"F\u012e\u0001\u0000\u0000\u0000H\u0130\u0001\u0000\u0000\u0000J\u0134"+
		"\u0001\u0000\u0000\u0000L\u0136\u0001\u0000\u0000\u0000N\u0138\u0001\u0000"+
		"\u0000\u0000P\u013b\u0001\u0000\u0000\u0000R\u013e\u0001\u0000\u0000\u0000"+
		"T\u0141\u0001\u0000\u0000\u0000V\u015a\u0001\u0000\u0000\u0000X\u0161"+
		"\u0001\u0000\u0000\u0000Z\u016a\u0001\u0000\u0000\u0000\\\u016c\u0001"+
		"\u0000\u0000\u0000^\u017b\u0001\u0000\u0000\u0000`\u017d\u0001\u0000\u0000"+
		"\u0000b\u0181\u0001\u0000\u0000\u0000d\u018a\u0001\u0000\u0000\u0000f"+
		"\u0192\u0001\u0000\u0000\u0000h\u019e\u0001\u0000\u0000\u0000j\u01a0\u0001"+
		"\u0000\u0000\u0000l\u01a2\u0001\u0000\u0000\u0000no\u0003\u0002\u0001"+
		"\u0000o\u0001\u0001\u0000\u0000\u0000pr\u0003\u0004\u0002\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000t\u0003\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vw\u0003\u0006\u0003\u0000wx\u0005*\u0000\u0000xy\u00059\u0000"+
		"\u0000yz\u0003\b\u0004\u0000z\u007f\u0001\u0000\u0000\u0000{|\u0005*\u0000"+
		"\u0000|}\u00059\u0000\u0000}\u007f\u0003\b\u0004\u0000~v\u0001\u0000\u0000"+
		"\u0000~{\u0001\u0000\u0000\u0000\u007f\u0005\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0007\u0000\u0000\u0000\u0081\u0007\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u0004\u0000\u0000\u0083\u0089\u0005\u0005\u0000\u0000\u0084"+
		"\u0085\u0005\u0004\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087"+
		"\u0005\u0005\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0082"+
		"\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0089\t\u0001"+
		"\u0000\u0000\u0000\u008a\u008c\u0003\f\u0006\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u000b\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0003\u000e"+
		"\u0007\u0000\u0091\u0093\u0003 \u0010\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0003\u0010\b\u0000\u0095\u0096\u0003\u001c\u000e\u0000\u0096"+
		"\u0097\u0005\u0014\u0000\u0000\u0097\u009e\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0003\u0006\u0003\u0000\u0099\u009a\u0003\u0010\b\u0000\u009a\u009b"+
		"\u0003\u001c\u000e\u0000\u009b\u009c\u0005\u0014\u0000\u0000\u009c\u009e"+
		"\u0001\u0000\u0000\u0000\u009d\u0094\u0001\u0000\u0000\u0000\u009d\u0098"+
		"\u0001\u0000\u0000\u0000\u009e\u000f\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0003\u0012\t\u0000\u00a0\u00a2\u0003\u0014\n\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u0011\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000\u00a4\u0013\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0003\u0016\u000b\u0000\u00a6\u0015\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u0017\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0003\u001a\r\u0000\u00aa\u0019\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005:\u0000\u0000\u00ac\u001b\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b3\u0003\u001e\u000f\u0000\u00ae\u00af\u0003\u001e\u000f\u0000"+
		"\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0\u00b1\u0003\u001c\u000e\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b3\u001d\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005:\u0000\u0000\u00b5\u001f\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0003\"\u0011\u0000\u00b7\u00b8\u0003&\u0013\u0000\u00b8!\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0003\u0010\b\u0000\u00ba\u00bb\u0003$"+
		"\u0012\u0000\u00bb\u00c7\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0006"+
		"\u0003\u0000\u00bd\u00be\u0003\u0010\b\u0000\u00be\u00bf\u0003$\u0012"+
		"\u0000\u00bf\u00c7\u0001\u0000\u0000\u0000\u00c0\u00c1\u00057\u0000\u0000"+
		"\u00c1\u00c7\u0003$\u0012\u0000\u00c2\u00c3\u0003\u0006\u0003\u0000\u00c3"+
		"\u00c4\u00057\u0000\u0000\u00c4\u00c5\u0003$\u0012\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00b9\u0001\u0000\u0000\u0000\u00c6\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c7#\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005:\u0000"+
		"\u0000\u00c9\u00ca\u0005\f\u0000\u0000\u00ca\u00cb\u0005\u0013\u0000\u0000"+
		"\u00cb%\u0001\u0000\u0000\u0000\u00cc\u00cf\u0003(\u0014\u0000\u00cd\u00cf"+
		"\u0005\u0014\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\'\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0004\u0000\u0000\u00d1\u00d7\u0005\u0005\u0000\u0000\u00d2\u00d3\u0005"+
		"\u0004\u0000\u0000\u00d3\u00d4\u0003*\u0015\u0000\u00d4\u00d5\u0005\u0005"+
		"\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d7)\u0001\u0000\u0000"+
		"\u0000\u00d8\u00dd\u0003,\u0016\u0000\u00d9\u00da\u0003,\u0016\u0000\u00da"+
		"\u00db\u0003*\u0015\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00d8"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd+\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0003.\u0017\u0000\u00df\u00e0\u0005\u0014"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00e3\u00030\u0018"+
		"\u0000\u00e2\u00de\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3-\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u0010\b\u0000"+
		"\u00e5\u00e6\u0003\u001c\u000e\u0000\u00e6/\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ec\u00032\u0019\u0000\u00e8\u00ec\u00034\u001a\u0000\u00e9\u00ec\u0003"+
		"6\u001b\u0000\u00ea\u00ec\u00038\u001c\u0000\u00eb\u00e7\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec1\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0005,\u0000\u0000\u00ee\u00ef\u0005\f\u0000\u0000\u00ef"+
		"\u00f0\u0003l6\u0000\u00f0\u00f1\u0005\u0013\u0000\u0000\u00f1\u00f2\u0003"+
		"0\u0018\u0000\u00f23\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005,\u0000"+
		"\u0000\u00f4\u00f5\u0005\f\u0000\u0000\u00f5\u00f6\u0003l6\u0000\u00f6"+
		"\u00f7\u0005\u0013\u0000\u0000\u00f7\u00f8\u0003@ \u0000\u00f8\u00f9\u0005"+
		"+\u0000\u0000\u00f9\u00fa\u00030\u0018\u0000\u00fa5\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u00058\u0000\u0000\u00fc\u00fd\u0005\f\u0000\u0000"+
		"\u00fd\u00fe\u0003l6\u0000\u00fe\u00ff\u0005\u0013\u0000\u0000\u00ff\u0100"+
		"\u00030\u0018\u0000\u01007\u0001\u0000\u0000\u0000\u0101\u0106\u0003("+
		"\u0014\u0000\u0102\u0106\u0003:\u001d\u0000\u0103\u0106\u0003<\u001e\u0000"+
		"\u0104\u0106\u0003>\u001f\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0105"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u01069\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0005\u0014\u0000\u0000\u0108;\u0001\u0000\u0000\u0000\u0109\u010a\u0003"+
		"F#\u0000\u010a\u010b\u0005\u0014\u0000\u0000\u010b=\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u00053\u0000\u0000\u010d\u0113\u0005\u0014\u0000\u0000"+
		"\u010e\u010f\u00053\u0000\u0000\u010f\u0110\u0003l6\u0000\u0110\u0111"+
		"\u0005\u0014\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u010c"+
		"\u0001\u0000\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0113?\u0001"+
		"\u0000\u0000\u0000\u0114\u0118\u00038\u001c\u0000\u0115\u0118\u0003B!"+
		"\u0000\u0116\u0118\u0003D\"\u0000\u0117\u0114\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000"+
		"\u0118A\u0001\u0000\u0000\u0000\u0119\u011a\u0005,\u0000\u0000\u011a\u011b"+
		"\u0005\f\u0000\u0000\u011b\u011c\u0003l6\u0000\u011c\u011d\u0005\u0013"+
		"\u0000\u0000\u011d\u011e\u0003@ \u0000\u011e\u011f\u0005+\u0000\u0000"+
		"\u011f\u0120\u0003@ \u0000\u0120C\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u00058\u0000\u0000\u0122\u0123\u0005\f\u0000\u0000\u0123\u0124\u0003"+
		"l6\u0000\u0124\u0125\u0005>\u0000\u0000\u0125\u0126\u0003@ \u0000\u0126"+
		"E\u0001\u0000\u0000\u0000\u0127\u012f\u0003H$\u0000\u0128\u012f\u0003"+
		"N\'\u0000\u0129\u012f\u0003P(\u0000\u012a\u012f\u0003R)\u0000\u012b\u012f"+
		"\u0003T*\u0000\u012c\u012f\u0003V+\u0000\u012d\u012f\u0003^/\u0000\u012e"+
		"\u0127\u0001\u0000\u0000\u0000\u012e\u0128\u0001\u0000\u0000\u0000\u012e"+
		"\u0129\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012e"+
		"\u012b\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e"+
		"\u012d\u0001\u0000\u0000\u0000\u012fG\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0003J%\u0000\u0131\u0132\u0003L&\u0000\u0132\u0133\u0003j5\u0000\u0133"+
		"I\u0001\u0000\u0000\u0000\u0134\u0135\u0003\u0018\f\u0000\u0135K\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0007\u0002\u0000\u0000\u0137M\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005?\u0000\u0000\u0139\u013a\u0003d2\u0000"+
		"\u013aO\u0001\u0000\u0000\u0000\u013b\u013c\u0005@\u0000\u0000\u013c\u013d"+
		"\u0003d2\u0000\u013dQ\u0001\u0000\u0000\u0000\u013e\u013f\u0003b1\u0000"+
		"\u013f\u0140\u0005?\u0000\u0000\u0140S\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0003b1\u0000\u0142\u0143\u0005@\u0000\u0000\u0143U\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0003\u0018\f\u0000\u0145\u0146\u0005\f\u0000\u0000"+
		"\u0146\u0147\u0005\u0013\u0000\u0000\u0147\u015b\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0003\u0018\f\u0000\u0149\u014a\u0005\f\u0000\u0000\u014a"+
		"\u014b\u0003X,\u0000\u014b\u014c\u0005\u0013\u0000\u0000\u014c\u015b\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0003Z-\u0000\u014e\u014f\u0005\t\u0000"+
		"\u0000\u014f\u0150\u0005:\u0000\u0000\u0150\u0151\u0005\f\u0000\u0000"+
		"\u0151\u0152\u0005\u0013\u0000\u0000\u0152\u015b\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0003Z-\u0000\u0154\u0155\u0005\t\u0000\u0000\u0155\u0156"+
		"\u0005:\u0000\u0000\u0156\u0157\u0005\f\u0000\u0000\u0157\u0158\u0003"+
		"X,\u0000\u0158\u0159\u0005\u0013\u0000\u0000\u0159\u015b\u0001\u0000\u0000"+
		"\u0000\u015a\u0144\u0001\u0000\u0000\u0000\u015a\u0148\u0001\u0000\u0000"+
		"\u0000\u015a\u014d\u0001\u0000\u0000\u0000\u015a\u0153\u0001\u0000\u0000"+
		"\u0000\u015bW\u0001\u0000\u0000\u0000\u015c\u0162\u0003l6\u0000\u015d"+
		"\u015e\u0003l6\u0000\u015e\u015f\u0005\u0007\u0000\u0000\u015f\u0160\u0003"+
		"X,\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015c\u0001\u0000\u0000"+
		"\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0162Y\u0001\u0000\u0000\u0000"+
		"\u0163\u016b\u0003`0\u0000\u0164\u016b\u00056\u0000\u0000\u0165\u0166"+
		"\u0005\f\u0000\u0000\u0166\u0167\u0003l6\u0000\u0167\u0168\u0005\u0013"+
		"\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u016b\u0003^/\u0000"+
		"\u016a\u0163\u0001\u0000\u0000\u0000\u016a\u0164\u0001\u0000\u0000\u0000"+
		"\u016a\u0165\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000"+
		"\u016b[\u0001\u0000\u0000\u0000\u016c\u016d\u0003Z-\u0000\u016d\u016e"+
		"\u0005\t\u0000\u0000\u016e\u016f\u0005:\u0000\u0000\u016f]\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0005/\u0000\u0000\u0171\u0172\u0003\u0016\u000b"+
		"\u0000\u0172\u0173\u0005\f\u0000\u0000\u0173\u0174\u0005\u0013\u0000\u0000"+
		"\u0174\u017c\u0001\u0000\u0000\u0000\u0175\u0176\u0005/\u0000\u0000\u0176"+
		"\u0177\u0003\u0016\u000b\u0000\u0177\u0178\u0005\f\u0000\u0000\u0178\u0179"+
		"\u0003X,\u0000\u0179\u017a\u0005\u0013\u0000\u0000\u017a\u017c\u0001\u0000"+
		"\u0000\u0000\u017b\u0170\u0001\u0000\u0000\u0000\u017b\u0175\u0001\u0000"+
		"\u0000\u0000\u017c_\u0001\u0000\u0000\u0000\u017d\u017e\u0007\u0003\u0000"+
		"\u0000\u017ea\u0001\u0000\u0000\u0000\u017f\u0182\u0003Z-\u0000\u0180"+
		"\u0182\u0003\u0018\f\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0180"+
		"\u0001\u0000\u0000\u0000\u0182c\u0001\u0000\u0000\u0000\u0183\u018b\u0003"+
		"N\'\u0000\u0184\u018b\u0003P(\u0000\u0185\u0186\u0005\u0012\u0000\u0000"+
		"\u0186\u018b\u0003d2\u0000\u0187\u0188\u0005\u000e\u0000\u0000\u0188\u018b"+
		"\u0003d2\u0000\u0189\u018b\u0003f3\u0000\u018a\u0183\u0001\u0000\u0000"+
		"\u0000\u018a\u0184\u0001\u0000\u0000\u0000\u018a\u0185\u0001\u0000\u0000"+
		"\u0000\u018a\u0187\u0001\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018be\u0001\u0000\u0000\u0000\u018c\u0193\u0003b1\u0000\u018d"+
		"\u018e\u0005\u0015\u0000\u0000\u018e\u0193\u0003d2\u0000\u018f\u0190\u0005"+
		"\n\u0000\u0000\u0190\u0193\u0003d2\u0000\u0191\u0193\u0003h4\u0000\u0192"+
		"\u018c\u0001\u0000\u0000\u0000\u0192\u018d\u0001\u0000\u0000\u0000\u0192"+
		"\u018f\u0001\u0000\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193"+
		"g\u0001\u0000\u0000\u0000\u0194\u0195\u0005\f\u0000\u0000\u0195\u0196"+
		"\u0003\u0012\t\u0000\u0196\u0197\u0005\u0013\u0000\u0000\u0197\u0198\u0003"+
		"d2\u0000\u0198\u019f\u0001\u0000\u0000\u0000\u0199\u019a\u0005\f\u0000"+
		"\u0000\u019a\u019b\u0003l6\u0000\u019b\u019c\u0005\u0013\u0000\u0000\u019c"+
		"\u019d\u0003f3\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u0194\u0001"+
		"\u0000\u0000\u0000\u019e\u0199\u0001\u0000\u0000\u0000\u019fi\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0003H$\u0000\u01a1k\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0005:\u0000\u0000\u01a3m\u0001\u0000\u0000\u0000\u001as"+
		"~\u0088\u008d\u0092\u009d\u00a1\u00b2\u00c6\u00ce\u00d6\u00dc\u00e2\u00eb"+
		"\u0105\u0112\u0117\u012e\u015a\u0161\u016a\u017b\u0181\u018a\u0192\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}