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
		XOREQUAL=38, INC=39, DEC=40, BOOLEAN=41, BOOLLITERAL=42, CHAR=43, CLASS=44, 
		ELSE=45, IF=46, INT=47, JNULL=48, NEW=49, PUBLIC=50, PRIVATE=51, PROTECTED=52, 
		RETURN=53, STATIC=54, STRING=55, THIS=56, VOID=57, WHILE=58, CLASSIDENTIFIER=59, 
		IDENTIFIER=60, INTLITERAL=61, CHARLITERAL=62, STRINGLITERAL=63, RBREACE=64;
	public static final int
		RULE_compilationunit = 0, RULE_classdeclarations = 1, RULE_classdeclaration = 2, 
		RULE_accessmodifier = 3, RULE_classbody = 4, RULE_classbodydeclarations = 5, 
		RULE_classbodydeclaration = 6, RULE_fielddeclaration = 7, RULE_type = 8, 
		RULE_primitivetype = 9, RULE_abstracttype = 10, RULE_referencetype = 11, 
		RULE_classorinterfacetype = 12, RULE_name = 13, RULE_simplename = 14, 
		RULE_variabledeclarators = 15, RULE_variabledeclarator = 16, RULE_expression = 17, 
		RULE_methoddeclaration = 18, RULE_methodheader = 19, RULE_methoddeclarator = 20, 
		RULE_methodbody = 21, RULE_block = 22, RULE_blockstatements = 23, RULE_blockstatement = 24, 
		RULE_localvariabledeclaration = 25, RULE_statement = 26, RULE_ifstatement = 27, 
		RULE_ifelsestatement = 28, RULE_whilestatement = 29, RULE_compareexpression = 30, 
		RULE_compareoperator = 31, RULE_statementwithoutrailingsubstatement = 32, 
		RULE_emptystatement = 33, RULE_expressionstatement = 34, RULE_returnstatement = 35, 
		RULE_statementnoshortif = 36, RULE_ifelsestatementnoshortif = 37, RULE_whilestatementnoshortif = 38, 
		RULE_statementexpression = 39, RULE_lefthandside = 40, RULE_assignmentoperator = 41, 
		RULE_preincrementexpression = 42, RULE_predecrementexpression = 43, RULE_postincrementexpression = 44, 
		RULE_postdecrementexpression = 45, RULE_methodcallexpression = 46, RULE_argumentlist = 47, 
		RULE_primary = 48, RULE_fieldaccess = 49, RULE_newexpression = 50, RULE_literal = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationunit", "classdeclarations", "classdeclaration", "accessmodifier", 
			"classbody", "classbodydeclarations", "classbodydeclaration", "fielddeclaration", 
			"type", "primitivetype", "abstracttype", "referencetype", "classorinterfacetype", 
			"name", "simplename", "variabledeclarators", "variabledeclarator", "expression", 
			"methoddeclaration", "methodheader", "methoddeclarator", "methodbody", 
			"block", "blockstatements", "blockstatement", "localvariabledeclaration", 
			"statement", "ifstatement", "ifelsestatement", "whilestatement", "compareexpression", 
			"compareoperator", "statementwithoutrailingsubstatement", "emptystatement", 
			"expressionstatement", "returnstatement", "statementnoshortif", "ifelsestatementnoshortif", 
			"whilestatementnoshortif", "statementexpression", "lefthandside", "assignmentoperator", 
			"preincrementexpression", "predecrementexpression", "postincrementexpression", 
			"postdecrementexpression", "methodcallexpression", "argumentlist", "primary", 
			"fieldaccess", "newexpression", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'&'", "'='", "'{'", "'}'", "':'", "','", "'/'", "'.'", "'!'", 
			"'>'", "'('", "'<'", "'-'", "'%'", "'*'", "'|'", "'+'", "')'", "';'", 
			"'~'", "'^'", "'&='", "'/='", "'=='", "'>='", "'<='", "'||'", "'-='", 
			"'%='", "'!='", "'|='", "'+='", "'<<='", "'>>='", "'*='", "'>>>='", "'^='", 
			"'++'", "'--'", "'boolean'", null, "'char'", "'class'", "'else'", "'if'", 
			"'int'", "'null'", "'new'", "'public'", "'private'", "'protected'", "'return'", 
			"'static'", "'String'", "'this'", "'void'", "'while'"
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
			"INC", "DEC", "BOOLEAN", "BOOLLITERAL", "CHAR", "CLASS", "ELSE", "IF", 
			"INT", "JNULL", "NEW", "PUBLIC", "PRIVATE", "PROTECTED", "RETURN", "STATIC", 
			"STRING", "THIS", "VOID", "WHILE", "CLASSIDENTIFIER", "IDENTIFIER", "INTLITERAL", 
			"CHARLITERAL", "STRINGLITERAL", "RBREACE"
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
			setState(104);
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7898891533942784L) != 0) {
				{
				{
				setState(106);
				classdeclaration();
				}
				}
				setState(111);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				accessmodifier();
				setState(113);
				match(CLASS);
				setState(114);
				match(CLASSIDENTIFIER);
				setState(115);
				classbody();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(CLASS);
				setState(118);
				match(CLASSIDENTIFIER);
				setState(119);
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
			setState(122);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0) ) {
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(LBRACKET);
				setState(125);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(LBRACKET);
				setState(127);
				classbodydeclarations();
				setState(128);
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1341098521654198272L) != 0) {
				{
				{
				setState(132);
				classbodydeclaration();
				}
				}
				setState(137);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				fielddeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				type();
				setState(143);
				variabledeclarators();
				setState(144);
				match(SEMICOLON);
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				accessmodifier();
				setState(147);
				type();
				setState(148);
				variabledeclarators();
				setState(149);
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
		public AbstracttypeContext abstracttype() {
			return getRuleContext(AbstracttypeContext.class,0);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				primitivetype();
				}
				break;
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				abstracttype();
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
			setState(157);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 151732604633088L) != 0) ) {
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
	public static class AbstracttypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Compiler_grammarParser.STRING, 0); }
		public ReferencetypeContext referencetype() {
			return getRuleContext(ReferencetypeContext.class,0);
		}
		public AbstracttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstracttype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterAbstracttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitAbstracttype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitAbstracttype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstracttypeContext abstracttype() throws RecognitionException {
		AbstracttypeContext _localctx = new AbstracttypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_abstracttype);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(STRING);
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
		enterRule(_localctx, 22, RULE_referencetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 24, RULE_classorinterfacetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 26, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 28, RULE_simplename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		enterRule(_localctx, 30, RULE_variabledeclarators);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				variabledeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				variabledeclarator();
				setState(173);
				match(COMMA);
				setState(174);
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
		public TerminalNode ASSIGN() { return getToken(Compiler_grammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_variabledeclarator);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(IDENTIFIER);
				setState(180);
				match(ASSIGN);
				setState(181);
				expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Compiler_grammarParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(Compiler_grammarParser.PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Compiler_grammarParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(Compiler_grammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Compiler_grammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Compiler_grammarParser.MOD, 0); }
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
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				literal();
				setState(187);
				match(PLUS);
				setState(188);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				literal();
				setState(191);
				match(MINUS);
				setState(192);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				literal();
				setState(195);
				match(MUL);
				setState(196);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				literal();
				setState(199);
				match(DIV);
				setState(200);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				literal();
				setState(203);
				match(MOD);
				setState(204);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				match(IDENTIFIER);
				setState(207);
				match(PLUS);
				setState(208);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(209);
				match(IDENTIFIER);
				setState(210);
				match(MINUS);
				setState(211);
				expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(212);
				match(IDENTIFIER);
				setState(213);
				match(MUL);
				setState(214);
				expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(215);
				match(IDENTIFIER);
				setState(216);
				match(DIV);
				setState(217);
				expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(218);
				match(IDENTIFIER);
				setState(219);
				match(MOD);
				setState(220);
				expression();
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
		enterRule(_localctx, 36, RULE_methoddeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			methodheader();
			setState(224);
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
		enterRule(_localctx, 38, RULE_methodheader);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				type();
				setState(227);
				methoddeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				accessmodifier();
				setState(230);
				type();
				setState(231);
				methoddeclarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(VOID);
				setState(234);
				methoddeclarator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				accessmodifier();
				setState(236);
				match(VOID);
				setState(237);
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
		enterRule(_localctx, 40, RULE_methoddeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IDENTIFIER);
			setState(242);
			match(LBRACE);
			setState(243);
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
		enterRule(_localctx, 42, RULE_methodbody);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		enterRule(_localctx, 44, RULE_block);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(LBRACKET);
				setState(250);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(LBRACKET);
				setState(252);
				blockstatements();
				setState(253);
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
		public List<BlockstatementContext> blockstatement() {
			return getRuleContexts(BlockstatementContext.class);
		}
		public BlockstatementContext blockstatement(int i) {
			return getRuleContext(BlockstatementContext.class,i);
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
		enterRule(_localctx, 46, RULE_blockstatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -746524964549554160L) != 0) {
				{
				{
				setState(257);
				blockstatement();
				}
				}
				setState(262);
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
		enterRule(_localctx, 48, RULE_blockstatement);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				localvariabledeclaration();
				setState(264);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		enterRule(_localctx, 50, RULE_localvariabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			type();
			setState(270);
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
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				ifstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				ifelsestatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				whilestatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
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
		public CompareexpressionContext compareexpression() {
			return getRuleContext(CompareexpressionContext.class,0);
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
		enterRule(_localctx, 54, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(IF);
			setState(279);
			match(LBRACE);
			setState(280);
			compareexpression();
			setState(281);
			match(RBRACE);
			setState(282);
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
		public CompareexpressionContext compareexpression() {
			return getRuleContext(CompareexpressionContext.class,0);
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
		enterRule(_localctx, 56, RULE_ifelsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(IF);
			setState(285);
			match(LBRACE);
			setState(286);
			compareexpression();
			setState(287);
			match(RBRACE);
			setState(288);
			statementnoshortif();
			setState(289);
			match(ELSE);
			setState(290);
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
		public CompareexpressionContext compareexpression() {
			return getRuleContext(CompareexpressionContext.class,0);
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
		enterRule(_localctx, 58, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(WHILE);
			setState(293);
			match(LBRACE);
			setState(294);
			compareexpression();
			setState(295);
			match(RBRACE);
			setState(296);
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
	public static class CompareexpressionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareoperatorContext compareoperator() {
			return getRuleContext(CompareoperatorContext.class,0);
		}
		public CompareexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterCompareexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitCompareexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitCompareexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareexpressionContext compareexpression() throws RecognitionException {
		CompareexpressionContext _localctx = new CompareexpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compareexpression);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				expression();
				setState(300);
				compareoperator();
				setState(301);
				expression();
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
	public static class CompareoperatorContext extends ParserRuleContext {
		public TerminalNode ANDEQUAL() { return getToken(Compiler_grammarParser.ANDEQUAL, 0); }
		public TerminalNode DIVIDEEQUAL() { return getToken(Compiler_grammarParser.DIVIDEEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(Compiler_grammarParser.EQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(Compiler_grammarParser.GREATEREQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(Compiler_grammarParser.LESSEQUAL, 0); }
		public TerminalNode LOGICALOR() { return getToken(Compiler_grammarParser.LOGICALOR, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(Compiler_grammarParser.MINUSEQUAL, 0); }
		public TerminalNode MODULOEQUAL() { return getToken(Compiler_grammarParser.MODULOEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Compiler_grammarParser.NOTEQUAL, 0); }
		public TerminalNode OREQUAL() { return getToken(Compiler_grammarParser.OREQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(Compiler_grammarParser.PLUSEQUAL, 0); }
		public TerminalNode SHIFTLEFTEQUAL() { return getToken(Compiler_grammarParser.SHIFTLEFTEQUAL, 0); }
		public TerminalNode SIGNEDSHIFTRIGHTEQUAL() { return getToken(Compiler_grammarParser.SIGNEDSHIFTRIGHTEQUAL, 0); }
		public TerminalNode TIMESEQUAL() { return getToken(Compiler_grammarParser.TIMESEQUAL, 0); }
		public TerminalNode UNSIGNEDSHIFTRIGHTEQUAL() { return getToken(Compiler_grammarParser.UNSIGNEDSHIFTRIGHTEQUAL, 0); }
		public TerminalNode XOREQUAL() { return getToken(Compiler_grammarParser.XOREQUAL, 0); }
		public CompareoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).enterCompareoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Compiler_grammarListener ) ((Compiler_grammarListener)listener).exitCompareoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Compiler_grammarVisitor ) return ((Compiler_grammarVisitor<? extends T>)visitor).visitCompareoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareoperatorContext compareoperator() throws RecognitionException {
		CompareoperatorContext _localctx = new CompareoperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compareoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 549747425280L) != 0) ) {
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
		enterRule(_localctx, 64, RULE_statementwithoutrailingsubstatement);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				emptystatement();
				}
				break;
			case LBRACE:
			case INC:
			case DEC:
			case BOOLLITERAL:
			case JNULL:
			case NEW:
			case THIS:
			case IDENTIFIER:
			case INTLITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				expressionstatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
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
		enterRule(_localctx, 66, RULE_emptystatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 68, RULE_expressionstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			statementexpression();
			setState(316);
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
		enterRule(_localctx, 70, RULE_returnstatement);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(RETURN);
				setState(319);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(RETURN);
				setState(321);
				expression();
				setState(322);
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
		enterRule(_localctx, 72, RULE_statementnoshortif);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
			case LBRACE:
			case SEMICOLON:
			case INC:
			case DEC:
			case BOOLLITERAL:
			case JNULL:
			case NEW:
			case RETURN:
			case THIS:
			case IDENTIFIER:
			case INTLITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				statementwithoutrailingsubstatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				ifelsestatementnoshortif();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
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
		enterRule(_localctx, 74, RULE_ifelsestatementnoshortif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(IF);
			setState(332);
			match(LBRACE);
			setState(333);
			expression();
			setState(334);
			match(RBRACE);
			setState(335);
			statementnoshortif();
			setState(336);
			match(ELSE);
			setState(337);
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
		enterRule(_localctx, 76, RULE_whilestatementnoshortif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(WHILE);
			setState(340);
			match(LBRACE);
			setState(341);
			expression();
			setState(342);
			match(RBREACE);
			setState(343);
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
		enterRule(_localctx, 78, RULE_statementexpression);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				preincrementexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				predecrementexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				postincrementexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				postdecrementexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				methodcallexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
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
		enterRule(_localctx, 80, RULE_lefthandside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		enterRule(_localctx, 82, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		public TerminalNode INC() { return getToken(Compiler_grammarParser.INC, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
		enterRule(_localctx, 84, RULE_preincrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(INC);
			setState(358);
			primary();
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
		public TerminalNode DEC() { return getToken(Compiler_grammarParser.DEC, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
		enterRule(_localctx, 86, RULE_predecrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(DEC);
			setState(361);
			primary();
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INC() { return getToken(Compiler_grammarParser.INC, 0); }
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
		enterRule(_localctx, 88, RULE_postincrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			name();
			setState(364);
			match(INC);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DEC() { return getToken(Compiler_grammarParser.DEC, 0); }
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
		enterRule(_localctx, 90, RULE_postdecrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			name();
			setState(367);
			match(DEC);
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
		enterRule(_localctx, 92, RULE_methodcallexpression);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				name();
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
				name();
				setState(374);
				match(LBRACE);
				setState(375);
				argumentlist();
				setState(376);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				primary();
				setState(379);
				match(DOT);
				setState(380);
				match(IDENTIFIER);
				setState(381);
				match(LBRACE);
				setState(382);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				primary();
				setState(385);
				match(DOT);
				setState(386);
				match(IDENTIFIER);
				setState(387);
				match(LBRACE);
				setState(388);
				argumentlist();
				setState(389);
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
		enterRule(_localctx, 94, RULE_argumentlist);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				expression();
				setState(395);
				match(COMMA);
				setState(396);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_primary);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				name();
				}
				break;
			case BOOLLITERAL:
			case JNULL:
			case INTLITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				literal();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(THIS);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				match(LBRACE);
				setState(404);
				expression();
				setState(405);
				match(RBRACE);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
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
		enterRule(_localctx, 98, RULE_fieldaccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			primary();
			setState(411);
			match(DOT);
			setState(412);
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
		enterRule(_localctx, 100, RULE_newexpression);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(NEW);
				setState(415);
				classorinterfacetype();
				setState(416);
				match(LBRACE);
				setState(417);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(NEW);
				setState(420);
				classorinterfacetype();
				setState(421);
				match(LBRACE);
				setState(422);
				argumentlist();
				setState(423);
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
		enterRule(_localctx, 102, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -2305557136190472192L) != 0) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001@\u01ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"l\b\u0001\n\u0001\f\u0001o\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"y\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004\u0001\u0005"+
		"\u0005\u0005\u0086\b\u0005\n\u0005\f\u0005\u0089\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u008d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0098\b\u0007\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0003\n\u00a2\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b1\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b7\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00de\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00f8\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0100\b\u0016\u0001"+
		"\u0017\u0005\u0017\u0103\b\u0017\n\u0017\f\u0017\u0106\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u010c\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0115\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0130\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0138\b \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0145\b#\u0001$\u0001$\u0001$\u0003$\u014a\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0160\b\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0188\b.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u018f\b/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u0199\b0\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u01aa\b2\u00013\u00013\u00013\u0000\u00004\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0005\u0001\u000024\u0003"+
		"\u0000))++//\u0001\u0000\u0017&\u0004\u0000\u0003\u0003\u0017\u0018\u001d"+
		"\u001e &\u0003\u0000**00=?\u01ad\u0000h\u0001\u0000\u0000\u0000\u0002"+
		"m\u0001\u0000\u0000\u0000\u0004x\u0001\u0000\u0000\u0000\u0006z\u0001"+
		"\u0000\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000\n\u0087\u0001\u0000"+
		"\u0000\u0000\f\u008c\u0001\u0000\u0000\u0000\u000e\u0097\u0001\u0000\u0000"+
		"\u0000\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000"+
		"\u0000\u0014\u00a1\u0001\u0000\u0000\u0000\u0016\u00a3\u0001\u0000\u0000"+
		"\u0000\u0018\u00a5\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000\u0000"+
		"\u0000\u001c\u00a9\u0001\u0000\u0000\u0000\u001e\u00b0\u0001\u0000\u0000"+
		"\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000"+
		"$\u00df\u0001\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000(\u00f1"+
		"\u0001\u0000\u0000\u0000*\u00f7\u0001\u0000\u0000\u0000,\u00ff\u0001\u0000"+
		"\u0000\u0000.\u0104\u0001\u0000\u0000\u00000\u010b\u0001\u0000\u0000\u0000"+
		"2\u010d\u0001\u0000\u0000\u00004\u0114\u0001\u0000\u0000\u00006\u0116"+
		"\u0001\u0000\u0000\u00008\u011c\u0001\u0000\u0000\u0000:\u0124\u0001\u0000"+
		"\u0000\u0000<\u012f\u0001\u0000\u0000\u0000>\u0131\u0001\u0000\u0000\u0000"+
		"@\u0137\u0001\u0000\u0000\u0000B\u0139\u0001\u0000\u0000\u0000D\u013b"+
		"\u0001\u0000\u0000\u0000F\u0144\u0001\u0000\u0000\u0000H\u0149\u0001\u0000"+
		"\u0000\u0000J\u014b\u0001\u0000\u0000\u0000L\u0153\u0001\u0000\u0000\u0000"+
		"N\u015f\u0001\u0000\u0000\u0000P\u0161\u0001\u0000\u0000\u0000R\u0163"+
		"\u0001\u0000\u0000\u0000T\u0165\u0001\u0000\u0000\u0000V\u0168\u0001\u0000"+
		"\u0000\u0000X\u016b\u0001\u0000\u0000\u0000Z\u016e\u0001\u0000\u0000\u0000"+
		"\\\u0187\u0001\u0000\u0000\u0000^\u018e\u0001\u0000\u0000\u0000`\u0198"+
		"\u0001\u0000\u0000\u0000b\u019a\u0001\u0000\u0000\u0000d\u01a9\u0001\u0000"+
		"\u0000\u0000f\u01ab\u0001\u0000\u0000\u0000hi\u0003\u0002\u0001\u0000"+
		"i\u0001\u0001\u0000\u0000\u0000jl\u0003\u0004\u0002\u0000kj\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\u0003\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000pq\u0003\u0006\u0003\u0000qr\u0005,\u0000\u0000rs\u0005;\u0000\u0000"+
		"st\u0003\b\u0004\u0000ty\u0001\u0000\u0000\u0000uv\u0005,\u0000\u0000"+
		"vw\u0005;\u0000\u0000wy\u0003\b\u0004\u0000xp\u0001\u0000\u0000\u0000"+
		"xu\u0001\u0000\u0000\u0000y\u0005\u0001\u0000\u0000\u0000z{\u0007\u0000"+
		"\u0000\u0000{\u0007\u0001\u0000\u0000\u0000|}\u0005\u0004\u0000\u0000"+
		"}\u0083\u0005\u0005\u0000\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0080"+
		"\u0003\n\u0005\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081\u0083\u0001"+
		"\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000"+
		"\u0000\u0083\t\u0001\u0000\u0000\u0000\u0084\u0086\u0003\f\u0006\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u000b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008d\u0003\u000e\u0007\u0000\u008b\u008d\u0003$\u0012\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\r\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0010\b\u0000\u008f\u0090"+
		"\u0003\u001e\u000f\u0000\u0090\u0091\u0005\u0014\u0000\u0000\u0091\u0098"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0006\u0003\u0000\u0093\u0094"+
		"\u0003\u0010\b\u0000\u0094\u0095\u0003\u001e\u000f\u0000\u0095\u0096\u0005"+
		"\u0014\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u008e\u0001"+
		"\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0098\u000f\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0003\u0012\t\u0000\u009a\u009c\u0003\u0014"+
		"\n\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0001\u0000"+
		"\u0000\u009e\u0013\u0001\u0000\u0000\u0000\u009f\u00a2\u00057\u0000\u0000"+
		"\u00a0\u00a2\u0003\u0016\u000b\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u0015\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0003\u0018\f\u0000\u00a4\u0017\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0003\u001a\r\u0000\u00a6\u0019\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0003\u001c\u000e\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005<\u0000\u0000\u00aa\u001d\u0001\u0000\u0000\u0000\u00ab\u00b1\u0003"+
		" \u0010\u0000\u00ac\u00ad\u0003 \u0010\u0000\u00ad\u00ae\u0005\u0007\u0000"+
		"\u0000\u00ae\u00af\u0003\u001e\u000f\u0000\u00af\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b1\u001f\u0001\u0000\u0000\u0000\u00b2\u00b7\u0005<\u0000\u0000"+
		"\u00b3\u00b4\u0005<\u0000\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000\u00b5"+
		"\u00b7\u0003\"\u0011\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b7!\u0001\u0000\u0000\u0000\u00b8\u00de\u0005"+
		"<\u0000\u0000\u00b9\u00de\u0003f3\u0000\u00ba\u00bb\u0003f3\u0000\u00bb"+
		"\u00bc\u0005\u0012\u0000\u0000\u00bc\u00bd\u0003\"\u0011\u0000\u00bd\u00de"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0003f3\u0000\u00bf\u00c0\u0005\u000e"+
		"\u0000\u0000\u00c0\u00c1\u0003\"\u0011\u0000\u00c1\u00de\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0003f3\u0000\u00c3\u00c4\u0005\u0010\u0000\u0000\u00c4"+
		"\u00c5\u0003\"\u0011\u0000\u00c5\u00de\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0003f3\u0000\u00c7\u00c8\u0005\b\u0000\u0000\u00c8\u00c9\u0003\"\u0011"+
		"\u0000\u00c9\u00de\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003f3\u0000\u00cb"+
		"\u00cc\u0005\u000f\u0000\u0000\u00cc\u00cd\u0003\"\u0011\u0000\u00cd\u00de"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005<\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0012\u0000\u0000\u00d0\u00de\u0003\"\u0011\u0000\u00d1\u00d2\u0005<"+
		"\u0000\u0000\u00d2\u00d3\u0005\u000e\u0000\u0000\u00d3\u00de\u0003\"\u0011"+
		"\u0000\u00d4\u00d5\u0005<\u0000\u0000\u00d5\u00d6\u0005\u0010\u0000\u0000"+
		"\u00d6\u00de\u0003\"\u0011\u0000\u00d7\u00d8\u0005<\u0000\u0000\u00d8"+
		"\u00d9\u0005\b\u0000\u0000\u00d9\u00de\u0003\"\u0011\u0000\u00da\u00db"+
		"\u0005<\u0000\u0000\u00db\u00dc\u0005\u000f\u0000\u0000\u00dc\u00de\u0003"+
		"\"\u0011\u0000\u00dd\u00b8\u0001\u0000\u0000\u0000\u00dd\u00b9\u0001\u0000"+
		"\u0000\u0000\u00dd\u00ba\u0001\u0000\u0000\u0000\u00dd\u00be\u0001\u0000"+
		"\u0000\u0000\u00dd\u00c2\u0001\u0000\u0000\u0000\u00dd\u00c6\u0001\u0000"+
		"\u0000\u0000\u00dd\u00ca\u0001\u0000\u0000\u0000\u00dd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d1\u0001\u0000\u0000\u0000\u00dd\u00d4\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000"+
		"\u0000\u0000\u00de#\u0001\u0000\u0000\u0000\u00df\u00e0\u0003&\u0013\u0000"+
		"\u00e0\u00e1\u0003*\u0015\u0000\u00e1%\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0003\u0010\b\u0000\u00e3\u00e4\u0003(\u0014\u0000\u00e4\u00f0\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0003\u0006\u0003\u0000\u00e6\u00e7\u0003"+
		"\u0010\b\u0000\u00e7\u00e8\u0003(\u0014\u0000\u00e8\u00f0\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u00059\u0000\u0000\u00ea\u00f0\u0003(\u0014\u0000"+
		"\u00eb\u00ec\u0003\u0006\u0003\u0000\u00ec\u00ed\u00059\u0000\u0000\u00ed"+
		"\u00ee\u0003(\u0014\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00e2"+
		"\u0001\u0000\u0000\u0000\u00ef\u00e5\u0001\u0000\u0000\u0000\u00ef\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000\u00f0\'\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005<\u0000\u0000\u00f2\u00f3\u0005\f"+
		"\u0000\u0000\u00f3\u00f4\u0005\u0013\u0000\u0000\u00f4)\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0003,\u0016\u0000\u00f6\u00f8\u0005\u0014\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8+\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa"+
		"\u0100\u0005\u0005\u0000\u0000\u00fb\u00fc\u0005\u0004\u0000\u0000\u00fc"+
		"\u00fd\u0003.\u0017\u0000\u00fd\u00fe\u0005\u0005\u0000\u0000\u00fe\u0100"+
		"\u0001\u0000\u0000\u0000\u00ff\u00f9\u0001\u0000\u0000\u0000\u00ff\u00fb"+
		"\u0001\u0000\u0000\u0000\u0100-\u0001\u0000\u0000\u0000\u0101\u0103\u0003"+
		"0\u0018\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105/\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u00032\u0019\u0000\u0108\u0109\u0005\u0014\u0000\u0000"+
		"\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u010c\u00034\u001a\u0000\u010b"+
		"\u0107\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
		"1\u0001\u0000\u0000\u0000\u010d\u010e\u0003\u0010\b\u0000\u010e\u010f"+
		"\u0003\u001e\u000f\u0000\u010f3\u0001\u0000\u0000\u0000\u0110\u0115\u0003"+
		"6\u001b\u0000\u0111\u0115\u00038\u001c\u0000\u0112\u0115\u0003:\u001d"+
		"\u0000\u0113\u0115\u0003@ \u0000\u0114\u0110\u0001\u0000\u0000\u0000\u0114"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u01155\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005.\u0000\u0000\u0117\u0118\u0005\f\u0000\u0000\u0118\u0119\u0003"+
		"<\u001e\u0000\u0119\u011a\u0005\u0013\u0000\u0000\u011a\u011b\u00034\u001a"+
		"\u0000\u011b7\u0001\u0000\u0000\u0000\u011c\u011d\u0005.\u0000\u0000\u011d"+
		"\u011e\u0005\f\u0000\u0000\u011e\u011f\u0003<\u001e\u0000\u011f\u0120"+
		"\u0005\u0013\u0000\u0000\u0120\u0121\u0003H$\u0000\u0121\u0122\u0005-"+
		"\u0000\u0000\u0122\u0123\u00034\u001a\u0000\u01239\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005:\u0000\u0000\u0125\u0126\u0005\f\u0000\u0000\u0126"+
		"\u0127\u0003<\u001e\u0000\u0127\u0128\u0005\u0013\u0000\u0000\u0128\u0129"+
		"\u00034\u001a\u0000\u0129;\u0001\u0000\u0000\u0000\u012a\u0130\u0003\u001a"+
		"\r\u0000\u012b\u012c\u0003\"\u0011\u0000\u012c\u012d\u0003>\u001f\u0000"+
		"\u012d\u012e\u0003\"\u0011\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f"+
		"\u012a\u0001\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000\u0130"+
		"=\u0001\u0000\u0000\u0000\u0131\u0132\u0007\u0002\u0000\u0000\u0132?\u0001"+
		"\u0000\u0000\u0000\u0133\u0138\u0003,\u0016\u0000\u0134\u0138\u0003B!"+
		"\u0000\u0135\u0138\u0003D\"\u0000\u0136\u0138\u0003F#\u0000\u0137\u0133"+
		"\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138A\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0005\u0014\u0000\u0000\u013aC\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0003N\'\u0000\u013c\u013d\u0005\u0014\u0000"+
		"\u0000\u013dE\u0001\u0000\u0000\u0000\u013e\u013f\u00055\u0000\u0000\u013f"+
		"\u0145\u0005\u0014\u0000\u0000\u0140\u0141\u00055\u0000\u0000\u0141\u0142"+
		"\u0003\"\u0011\u0000\u0142\u0143\u0005\u0014\u0000\u0000\u0143\u0145\u0001"+
		"\u0000\u0000\u0000\u0144\u013e\u0001\u0000\u0000\u0000\u0144\u0140\u0001"+
		"\u0000\u0000\u0000\u0145G\u0001\u0000\u0000\u0000\u0146\u014a\u0003@ "+
		"\u0000\u0147\u014a\u0003J%\u0000\u0148\u014a\u0003L&\u0000\u0149\u0146"+
		"\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148"+
		"\u0001\u0000\u0000\u0000\u014aI\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		".\u0000\u0000\u014c\u014d\u0005\f\u0000\u0000\u014d\u014e\u0003\"\u0011"+
		"\u0000\u014e\u014f\u0005\u0013\u0000\u0000\u014f\u0150\u0003H$\u0000\u0150"+
		"\u0151\u0005-\u0000\u0000\u0151\u0152\u0003H$\u0000\u0152K\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0005:\u0000\u0000\u0154\u0155\u0005\f\u0000"+
		"\u0000\u0155\u0156\u0003\"\u0011\u0000\u0156\u0157\u0005@\u0000\u0000"+
		"\u0157\u0158\u0003H$\u0000\u0158M\u0001\u0000\u0000\u0000\u0159\u0160"+
		"\u0003T*\u0000\u015a\u0160\u0003V+\u0000\u015b\u0160\u0003X,\u0000\u015c"+
		"\u0160\u0003Z-\u0000\u015d\u0160\u0003\\.\u0000\u015e\u0160\u0003d2\u0000"+
		"\u015f\u0159\u0001\u0000\u0000\u0000\u015f\u015a\u0001\u0000\u0000\u0000"+
		"\u015f\u015b\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000"+
		"\u0160O\u0001\u0000\u0000\u0000\u0161\u0162\u0003\u001a\r\u0000\u0162"+
		"Q\u0001\u0000\u0000\u0000\u0163\u0164\u0007\u0003\u0000\u0000\u0164S\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005\'\u0000\u0000\u0166\u0167\u0003`"+
		"0\u0000\u0167U\u0001\u0000\u0000\u0000\u0168\u0169\u0005(\u0000\u0000"+
		"\u0169\u016a\u0003`0\u0000\u016aW\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0003\u001a\r\u0000\u016c\u016d\u0005\'\u0000\u0000\u016dY\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0003\u001a\r\u0000\u016f\u0170\u0005(\u0000"+
		"\u0000\u0170[\u0001\u0000\u0000\u0000\u0171\u0172\u0003\u001a\r\u0000"+
		"\u0172\u0173\u0005\f\u0000\u0000\u0173\u0174\u0005\u0013\u0000\u0000\u0174"+
		"\u0188\u0001\u0000\u0000\u0000\u0175\u0176\u0003\u001a\r\u0000\u0176\u0177"+
		"\u0005\f\u0000\u0000\u0177\u0178\u0003^/\u0000\u0178\u0179\u0005\u0013"+
		"\u0000\u0000\u0179\u0188\u0001\u0000\u0000\u0000\u017a\u017b\u0003`0\u0000"+
		"\u017b\u017c\u0005\t\u0000\u0000\u017c\u017d\u0005<\u0000\u0000\u017d"+
		"\u017e\u0005\f\u0000\u0000\u017e\u017f\u0005\u0013\u0000\u0000\u017f\u0188"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0003`0\u0000\u0181\u0182\u0005\t"+
		"\u0000\u0000\u0182\u0183\u0005<\u0000\u0000\u0183\u0184\u0005\f\u0000"+
		"\u0000\u0184\u0185\u0003^/\u0000\u0185\u0186\u0005\u0013\u0000\u0000\u0186"+
		"\u0188\u0001\u0000\u0000\u0000\u0187\u0171\u0001\u0000\u0000\u0000\u0187"+
		"\u0175\u0001\u0000\u0000\u0000\u0187\u017a\u0001\u0000\u0000\u0000\u0187"+
		"\u0180\u0001\u0000\u0000\u0000\u0188]\u0001\u0000\u0000\u0000\u0189\u018f"+
		"\u0003\"\u0011\u0000\u018a\u018b\u0003\"\u0011\u0000\u018b\u018c\u0005"+
		"\u0007\u0000\u0000\u018c\u018d\u0003^/\u0000\u018d\u018f\u0001\u0000\u0000"+
		"\u0000\u018e\u0189\u0001\u0000\u0000\u0000\u018e\u018a\u0001\u0000\u0000"+
		"\u0000\u018f_\u0001\u0000\u0000\u0000\u0190\u0199\u0003\u001a\r\u0000"+
		"\u0191\u0199\u0003f3\u0000\u0192\u0199\u00058\u0000\u0000\u0193\u0194"+
		"\u0005\f\u0000\u0000\u0194\u0195\u0003\"\u0011\u0000\u0195\u0196\u0005"+
		"\u0013\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0199\u0003"+
		"d2\u0000\u0198\u0190\u0001\u0000\u0000\u0000\u0198\u0191\u0001\u0000\u0000"+
		"\u0000\u0198\u0192\u0001\u0000\u0000\u0000\u0198\u0193\u0001\u0000\u0000"+
		"\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199a\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0003`0\u0000\u019b\u019c\u0005\t\u0000\u0000\u019c\u019d"+
		"\u0005<\u0000\u0000\u019dc\u0001\u0000\u0000\u0000\u019e\u019f\u00051"+
		"\u0000\u0000\u019f\u01a0\u0003\u0018\f\u0000\u01a0\u01a1\u0005\f\u0000"+
		"\u0000\u01a1\u01a2\u0005\u0013\u0000\u0000\u01a2\u01aa\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u00051\u0000\u0000\u01a4\u01a5\u0003\u0018\f\u0000"+
		"\u01a5\u01a6\u0005\f\u0000\u0000\u01a6\u01a7\u0003^/\u0000\u01a7\u01a8"+
		"\u0005\u0013\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u019e"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a3\u0001\u0000\u0000\u0000\u01aae\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0007\u0004\u0000\u0000\u01acg\u0001\u0000"+
		"\u0000\u0000\u001amx\u0082\u0087\u008c\u0097\u009b\u00a1\u00b0\u00b6\u00dd"+
		"\u00ef\u00f7\u00ff\u0104\u010b\u0114\u012f\u0137\u0144\u0149\u015f\u0187"+
		"\u018e\u0198\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}