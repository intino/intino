// Generated from /Users/oroncal/workspace/infrastructure/tara/language/src/io/intino/tara/language/grammar/TaraGrammar.g4 by ANTLR 4.13.2
package io.intino.tara.language.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TaraGrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUB=1, USE=2, DSL=3, DEF=4, FACET=5, HAS=6, AS=7, ON=8, IS=9, WITH=10, 
		EXTENDS=11, CONSTRAINT=12, GENERALIZATION=13, COMPONENT=14, FEATURE=15, 
		REQUIRED=16, FINAL=17, PRIVATE=18, REACTIVE=19, DECORABLE=20, LEFT_PARENTHESIS=21, 
		RIGHT_PARENTHESIS=22, LEFT_SQUARE=23, RIGHT_SQUARE=24, LEFT_CURLY=25, 
		RIGHT_CURLY=26, INLINE=27, CLOSE_INLINE=28, AT=29, HASHTAG=30, CONSTRAINT_START=31, 
		COLON=32, COMMA=33, DOT=34, EQUALS=35, STAR=36, LIST=37, SEMICOLON=38, 
		PLUS=39, WORD=40, RESOURCE=41, INT_TYPE=42, FUNCTION_TYPE=43, OBJECT_TYPE=44, 
		DOUBLE_TYPE=45, LONG_TYPE=46, STRING_TYPE=47, BOOLEAN_TYPE=48, DATE_TYPE=49, 
		INSTANT_TYPE=50, TIME_TYPE=51, EMPTY=52, BLOCK_COMMENT=53, LINE_COMMENT=54, 
		SCIENCE_NOT=55, BOOLEAN_VALUE=56, NATURAL_VALUE=57, NEGATIVE_VALUE=58, 
		DOUBLE_VALUE=59, STRING=60, STRING_MULTILINE=61, SINGLE_QUOTE=62, EXPRESSION_MULTILINE=63, 
		IDENTIFIER=64, MEASURE_VALUE=65, NEWLINE=66, SPACES=67, DOC=68, SP=69, 
		NL=70, NEW_LINE_INDENT=71, DEDENT=72, UNKNOWN_TOKEN=73, ME_STRING_MULTILINE=74, 
		ME_CHARACTER=75, COMPARER_EQUALS=76, NOT_EQUALS=77, GREATER_EQUALS=78, 
		LESS_EQUALS=79, GREATER=80, LESS=81, IN=82, C_IS=83, LIKE=84, MATCHES=85, 
		STARTS_WITH=86, C_EMPTY=87, AND=88, OR=89, NOT=90, LAMBDA=91, L_PARENTHESIS=92, 
		R_PARENTHESIS=93, STRING_VALUE=94, C_COMMA=95, C_DOT=96, TRUE_BOOLEAN_VALUE=97, 
		FALSE_BOOLEAN_VALUE=98, C_NATURAL_VALUE=99, C_NEGATIVE_VALUE=100, C_DOUBLE_VALUE=101, 
		ID=102, C_SPACES=103, C_NEWLINE=104, E_QUOTE=105, E_SLASH_Q=106, E_SLASH=107, 
		E_CHARACTER=108, QUOTE_BEGIN=109, QUOTE_END=110, EXPRESSION_BEGIN=111, 
		EXPRESSION_END=112, CHARACTER=113;
	public static final int
		RULE_root = 0, RULE_dslDeclaration = 1, RULE_mogramOrConstraint = 2, RULE_imports = 3, 
		RULE_anImport = 4, RULE_doc = 5, RULE_mogram = 6, RULE_signature = 7, 
		RULE_body = 8, RULE_facetTarget = 9, RULE_parent = 10, RULE_signatureProperties = 11, 
		RULE_signatureProperty = 12, RULE_facets = 13, RULE_facet = 14, RULE_value = 15, 
		RULE_mogramReference = 16, RULE_with = 17, RULE_property = 18, RULE_bodyValue = 19, 
		RULE_propertyType = 20, RULE_mogramConstraint = 21, RULE_ruleValue = 22, 
		RULE_range = 23, RULE_size = 24, RULE_sizeRange = 25, RULE_listRange = 26, 
		RULE_methodReference = 27, RULE_stringValue = 28, RULE_booleanValue = 29, 
		RULE_tupleValue = 30, RULE_integerValue = 31, RULE_doubleValue = 32, RULE_measureUnit = 33, 
		RULE_expression = 34, RULE_annotations = 35, RULE_annotation = 36, RULE_propertyDescriptive = 37, 
		RULE_headerReference = 38, RULE_identifierReference = 39, RULE_identifierKey = 40, 
		RULE_hierarchy = 41, RULE_metaidentifier = 42, RULE_constraintDef = 43, 
		RULE_description = 44, RULE_constraint = 45, RULE_primary = 46, RULE_propertyName = 47, 
		RULE_functionCall = 48, RULE_argumentList = 49, RULE_lambdaExpr = 50, 
		RULE_binaryComp = 51, RULE_unaryOp = 52, RULE_literal = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "dslDeclaration", "mogramOrConstraint", "imports", "anImport", 
			"doc", "mogram", "signature", "body", "facetTarget", "parent", "signatureProperties", 
			"signatureProperty", "facets", "facet", "value", "mogramReference", "with", 
			"property", "bodyValue", "propertyType", "mogramConstraint", "ruleValue", 
			"range", "size", "sizeRange", "listRange", "methodReference", "stringValue", 
			"booleanValue", "tupleValue", "integerValue", "doubleValue", "measureUnit", 
			"expression", "annotations", "annotation", "propertyDescriptive", "headerReference", 
			"identifierReference", "identifierKey", "hierarchy", "metaidentifier", 
			"constraintDef", "description", "constraint", "primary", "propertyName", 
			"functionCall", "argumentList", "lambdaExpr", "binaryComp", "unaryOp", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sub'", "'use'", "'dsl'", "'def'", "'facet'", "'has'", "'as'", 
			"'on'", null, "'with'", "'extends'", "'constraint'", "'generalization'", 
			"'component'", "'feature'", "'required'", "'final'", "'private'", "'reactive'", 
			"'decorable'", null, null, "'['", "']'", "'{'", "'}'", null, null, "'@'", 
			"'#'", "'::'", "':'", null, null, "'='", "'*'", "'...'", null, "'+'", 
			"'word'", "'resource'", "'integer'", "'function'", "'object'", "'double'", 
			"'long'", "'string'", "'boolean'", "'date'", "'instant'", "'time'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'indent'", "'dedent'", null, null, 
			null, "'=='", "'!='", "'>='", "'<='", null, null, "'in'", null, "'like'", 
			"'matches'", "'starts with'", null, "'and'", "'or'", "'not'", "'->'", 
			null, null, null, null, null, "'true'", "'false'", null, null, null, 
			null, null, null, null, "'\\''", "'\\'", null, "'%QUOTE_BEGIN%'", "'%QUOTE_END%'", 
			"'%EXPRESSION_BEGIN%'", "'%EXPRESSION_END%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUB", "USE", "DSL", "DEF", "FACET", "HAS", "AS", "ON", "IS", "WITH", 
			"EXTENDS", "CONSTRAINT", "GENERALIZATION", "COMPONENT", "FEATURE", "REQUIRED", 
			"FINAL", "PRIVATE", "REACTIVE", "DECORABLE", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_CURLY", "RIGHT_CURLY", "INLINE", 
			"CLOSE_INLINE", "AT", "HASHTAG", "CONSTRAINT_START", "COLON", "COMMA", 
			"DOT", "EQUALS", "STAR", "LIST", "SEMICOLON", "PLUS", "WORD", "RESOURCE", 
			"INT_TYPE", "FUNCTION_TYPE", "OBJECT_TYPE", "DOUBLE_TYPE", "LONG_TYPE", 
			"STRING_TYPE", "BOOLEAN_TYPE", "DATE_TYPE", "INSTANT_TYPE", "TIME_TYPE", 
			"EMPTY", "BLOCK_COMMENT", "LINE_COMMENT", "SCIENCE_NOT", "BOOLEAN_VALUE", 
			"NATURAL_VALUE", "NEGATIVE_VALUE", "DOUBLE_VALUE", "STRING", "STRING_MULTILINE", 
			"SINGLE_QUOTE", "EXPRESSION_MULTILINE", "IDENTIFIER", "MEASURE_VALUE", 
			"NEWLINE", "SPACES", "DOC", "SP", "NL", "NEW_LINE_INDENT", "DEDENT", 
			"UNKNOWN_TOKEN", "ME_STRING_MULTILINE", "ME_CHARACTER", "COMPARER_EQUALS", 
			"NOT_EQUALS", "GREATER_EQUALS", "LESS_EQUALS", "GREATER", "LESS", "IN", 
			"C_IS", "LIKE", "MATCHES", "STARTS_WITH", "C_EMPTY", "AND", "OR", "NOT", 
			"LAMBDA", "L_PARENTHESIS", "R_PARENTHESIS", "STRING_VALUE", "C_COMMA", 
			"C_DOT", "TRUE_BOOLEAN_VALUE", "FALSE_BOOLEAN_VALUE", "C_NATURAL_VALUE", 
			"C_NEGATIVE_VALUE", "C_DOUBLE_VALUE", "ID", "C_SPACES", "C_NEWLINE", 
			"E_QUOTE", "E_SLASH_Q", "E_SLASH", "E_CHARACTER", "QUOTE_BEGIN", "QUOTE_END", 
			"EXPRESSION_BEGIN", "EXPRESSION_END", "CHARACTER"
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
	public String getGrammarFileName() { return "TaraGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaraGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TaraGrammar.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(TaraGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TaraGrammar.NEWLINE, i);
		}
		public DslDeclarationContext dslDeclaration() {
			return getRuleContext(DslDeclarationContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public List<MogramOrConstraintContext> mogramOrConstraint() {
			return getRuleContexts(MogramOrConstraintContext.class);
		}
		public MogramOrConstraintContext mogramOrConstraint(int i) {
			return getRuleContext(MogramOrConstraintContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					match(NEWLINE);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DSL) {
				{
				setState(114);
				dslDeclaration();
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USE) {
				{
				setState(117);
				imports();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4130L) != 0) || _la==IDENTIFIER || _la==DOC) {
				{
				setState(120);
				mogramOrConstraint();
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(121);
							match(NEWLINE);
							}
							}
							setState(124); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						setState(126);
						mogramOrConstraint();
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
			}

			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(134);
				match(NEWLINE);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(EOF);
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
	public static class DslDeclarationContext extends ParserRuleContext {
		public TerminalNode DSL() { return getToken(TaraGrammar.DSL, 0); }
		public HeaderReferenceContext headerReference() {
			return getRuleContext(HeaderReferenceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TaraGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TaraGrammar.NEWLINE, i);
		}
		public DslDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dslDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterDslDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitDslDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitDslDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DslDeclarationContext dslDeclaration() throws RecognitionException {
		DslDeclarationContext _localctx = new DslDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dslDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(DSL);
			setState(143);
			headerReference();
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					match(NEWLINE);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class MogramOrConstraintContext extends ParserRuleContext {
		public ConstraintDefContext constraintDef() {
			return getRuleContext(ConstraintDefContext.class,0);
		}
		public MogramContext mogram() {
			return getRuleContext(MogramContext.class,0);
		}
		public MogramOrConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mogramOrConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterMogramOrConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitMogramOrConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitMogramOrConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MogramOrConstraintContext mogramOrConstraint() throws RecognitionException {
		MogramOrConstraintContext _localctx = new MogramOrConstraintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mogramOrConstraint);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				constraintDef();
				}
				break;
			case SUB:
			case FACET:
			case IDENTIFIER:
			case DOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				mogram();
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
	public static class ImportsContext extends ParserRuleContext {
		public List<AnImportContext> anImport() {
			return getRuleContexts(AnImportContext.class);
		}
		public AnImportContext anImport(int i) {
			return getRuleContext(AnImportContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				anImport();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USE );
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
	public static class AnImportContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(TaraGrammar.USE, 0); }
		public HeaderReferenceContext headerReference() {
			return getRuleContext(HeaderReferenceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TaraGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TaraGrammar.NEWLINE, i);
		}
		public AnImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterAnImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitAnImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitAnImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnImportContext anImport() throws RecognitionException {
		AnImportContext _localctx = new AnImportContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anImport);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(USE);
			setState(160);
			headerReference();
			setState(162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(161);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class DocContext extends ParserRuleContext {
		public List<TerminalNode> DOC() { return getTokens(TaraGrammar.DOC); }
		public TerminalNode DOC(int i) {
			return getToken(TaraGrammar.DOC, i);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				match(DOC);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOC );
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
	public static class MogramContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterMogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitMogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitMogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MogramContext mogram() throws RecognitionException {
		MogramContext _localctx = new MogramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mogram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC) {
				{
				setState(171);
				doc();
				}
			}

			setState(174);
			signature();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE_INDENT) {
				{
				setState(175);
				body();
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
	public static class SignatureContext extends ParserRuleContext {
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public MetaidentifierContext metaidentifier() {
			return getRuleContext(MetaidentifierContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TaraGrammar.SUB, 0); }
		public TerminalNode FACET() { return getToken(TaraGrammar.FACET, 0); }
		public FacetTargetContext facetTarget() {
			return getRuleContext(FacetTargetContext.class,0);
		}
		public List<MogramConstraintContext> mogramConstraint() {
			return getRuleContexts(MogramConstraintContext.class);
		}
		public MogramConstraintContext mogramConstraint(int i) {
			return getRuleContext(MogramConstraintContext.class,i);
		}
		public SignaturePropertiesContext signatureProperties() {
			return getRuleContext(SignaturePropertiesContext.class,0);
		}
		public ParentContext parent() {
			return getRuleContext(ParentContext.class,0);
		}
		public FacetsContext facets() {
			return getRuleContext(FacetsContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case FACET:
				{
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==FACET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(179);
					mogramConstraint();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PARENTHESIS) {
					{
					setState(185);
					signatureProperties();
					}
				}

				setState(188);
				match(IDENTIFIER);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(189);
					parent();
					}
				}

				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(192);
					facets();
					}
				}

				}
				}
				break;
			case IDENTIFIER:
				{
				{
				setState(195);
				metaidentifier();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(196);
					mogramConstraint();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PARENTHESIS) {
					{
					setState(202);
					signatureProperties();
					}
				}

				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(205);
					match(IDENTIFIER);
					}
				}

				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOF:
				case AS:
				case IS:
				case WITH:
				case EXTENDS:
				case NEWLINE:
				case NEW_LINE_INDENT:
					{
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(208);
						facets();
						}
					}

					}
					break;
				case ON:
					{
					setState(211);
					facetTarget();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(214);
					parent();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(219);
				with();
				}
			}

			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(222);
				annotations();
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode NEW_LINE_INDENT() { return getToken(TaraGrammar.NEW_LINE_INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(TaraGrammar.DEDENT, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<MogramContext> mogram() {
			return getRuleContexts(MogramContext.class);
		}
		public MogramContext mogram(int i) {
			return getRuleContext(MogramContext.class,i);
		}
		public List<PropertyDescriptiveContext> propertyDescriptive() {
			return getRuleContexts(PropertyDescriptiveContext.class);
		}
		public PropertyDescriptiveContext propertyDescriptive(int i) {
			return getRuleContext(PropertyDescriptiveContext.class,i);
		}
		public List<MogramReferenceContext> mogramReference() {
			return getRuleContexts(MogramReferenceContext.class);
		}
		public MogramReferenceContext mogramReference(int i) {
			return getRuleContext(MogramReferenceContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TaraGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TaraGrammar.NEWLINE, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(NEW_LINE_INDENT);
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(226);
					property();
					}
					break;
				case 2:
					{
					setState(227);
					mogram();
					}
					break;
				case 3:
					{
					setState(228);
					propertyDescriptive();
					}
					break;
				case 4:
					{
					setState(229);
					mogramReference();
					}
					break;
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					match(NEWLINE);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 114L) != 0) || _la==IDENTIFIER || _la==DOC );
			setState(241);
			match(DEDENT);
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
	public static class FacetTargetContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(TaraGrammar.ON, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public FacetTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facetTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterFacetTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitFacetTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitFacetTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacetTargetContext facetTarget() throws RecognitionException {
		FacetTargetContext _localctx = new FacetTargetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_facetTarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ON);
			setState(244);
			identifierReference();
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
	public static class ParentContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(TaraGrammar.EXTENDS, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public ParentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentContext parent() throws RecognitionException {
		ParentContext _localctx = new ParentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(EXTENDS);
			setState(247);
			identifierReference();
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
	public static class SignaturePropertiesContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(TaraGrammar.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(TaraGrammar.RIGHT_PARENTHESIS, 0); }
		public List<SignaturePropertyContext> signatureProperty() {
			return getRuleContexts(SignaturePropertyContext.class);
		}
		public SignaturePropertyContext signatureProperty(int i) {
			return getRuleContext(SignaturePropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TaraGrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TaraGrammar.COMMA, i);
		}
		public SignaturePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatureProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterSignatureProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitSignatureProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitSignatureProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignaturePropertiesContext signatureProperties() throws RecognitionException {
		SignaturePropertiesContext _localctx = new SignaturePropertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signatureProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LEFT_PARENTHESIS);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2238289015340007424L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140737488355333L) != 0)) {
				{
				setState(250);
				signatureProperty();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(251);
					match(COMMA);
					setState(252);
					signatureProperty();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(260);
			match(RIGHT_PARENTHESIS);
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
	public static class SignaturePropertyContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(TaraGrammar.EQUALS, 0); }
		public SignaturePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatureProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterSignatureProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitSignatureProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitSignatureProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignaturePropertyContext signatureProperty() throws RecognitionException {
		SignaturePropertyContext _localctx = new SignaturePropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_signatureProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(262);
				match(IDENTIFIER);
				setState(263);
				match(EQUALS);
				}
				break;
			}
			setState(266);
			value();
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
	public static class FacetsContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(TaraGrammar.IS, 0); }
		public List<FacetContext> facet() {
			return getRuleContexts(FacetContext.class);
		}
		public FacetContext facet(int i) {
			return getRuleContext(FacetContext.class,i);
		}
		public FacetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterFacets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitFacets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitFacets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacetsContext facets() throws RecognitionException {
		FacetsContext _localctx = new FacetsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_facets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IS);
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				facet();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
	public static class FacetContext extends ParserRuleContext {
		public MetaidentifierContext metaidentifier() {
			return getRuleContext(MetaidentifierContext.class,0);
		}
		public SignaturePropertiesContext signatureProperties() {
			return getRuleContext(SignaturePropertiesContext.class,0);
		}
		public FacetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterFacet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitFacet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitFacet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacetContext facet() throws RecognitionException {
		FacetContext _localctx = new FacetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_facet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			metaidentifier();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PARENTHESIS) {
				{
				setState(275);
				signatureProperties();
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
	public static class ValueContext extends ParserRuleContext {
		public List<IdentifierReferenceContext> identifierReference() {
			return getRuleContexts(IdentifierReferenceContext.class);
		}
		public IdentifierReferenceContext identifierReference(int i) {
			return getRuleContext(IdentifierReferenceContext.class,i);
		}
		public List<StringValueContext> stringValue() {
			return getRuleContexts(StringValueContext.class);
		}
		public StringValueContext stringValue(int i) {
			return getRuleContext(StringValueContext.class,i);
		}
		public List<TupleValueContext> tupleValue() {
			return getRuleContexts(TupleValueContext.class);
		}
		public TupleValueContext tupleValue(int i) {
			return getRuleContext(TupleValueContext.class,i);
		}
		public List<BooleanValueContext> booleanValue() {
			return getRuleContexts(BooleanValueContext.class);
		}
		public BooleanValueContext booleanValue(int i) {
			return getRuleContext(BooleanValueContext.class,i);
		}
		public List<IntegerValueContext> integerValue() {
			return getRuleContexts(IntegerValueContext.class);
		}
		public IntegerValueContext integerValue(int i) {
			return getRuleContext(IntegerValueContext.class,i);
		}
		public MeasureUnitContext measureUnit() {
			return getRuleContext(MeasureUnitContext.class,0);
		}
		public List<DoubleValueContext> doubleValue() {
			return getRuleContexts(DoubleValueContext.class);
		}
		public DoubleValueContext doubleValue(int i) {
			return getRuleContext(DoubleValueContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MethodReferenceContext> methodReference() {
			return getRuleContexts(MethodReferenceContext.class);
		}
		public MethodReferenceContext methodReference(int i) {
			return getRuleContext(MethodReferenceContext.class,i);
		}
		public TerminalNode EMPTY() { return getToken(TaraGrammar.EMPTY, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			int _alt;
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(278);
						identifierReference();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(281); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(283);
						stringValue();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(286); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(288);
						tupleValue();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(291); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(293);
					booleanValue();
					}
					}
					setState(296); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOLEAN_VALUE );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(298);
						identifierReference();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(301); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(303);
					integerValue();
					}
					}
					setState(306); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NATURAL_VALUE || _la==NEGATIVE_VALUE );
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(308);
					measureUnit();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(311);
					doubleValue();
					}
					}
					setState(314); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316530991104L) != 0) );
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(316);
					measureUnit();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(320); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(319);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(322); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(324);
					methodReference();
					}
					}
					setState(327); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AT );
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(329);
				match(EMPTY);
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
	public static class MogramReferenceContext extends ParserRuleContext {
		public TerminalNode HAS() { return getToken(TaraGrammar.HAS, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public List<MogramConstraintContext> mogramConstraint() {
			return getRuleContexts(MogramConstraintContext.class);
		}
		public MogramConstraintContext mogramConstraint(int i) {
			return getRuleContext(MogramConstraintContext.class,i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public MogramReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mogramReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterMogramReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitMogramReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitMogramReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MogramReferenceContext mogramReference() throws RecognitionException {
		MogramReferenceContext _localctx = new MogramReferenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mogramReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(HAS);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(333);
				mogramConstraint();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			identifierReference();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(340);
				annotations();
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
	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(TaraGrammar.WITH, 0); }
		public List<IdentifierReferenceContext> identifierReference() {
			return getRuleContexts(IdentifierReferenceContext.class);
		}
		public IdentifierReferenceContext identifierReference(int i) {
			return getRuleContext(IdentifierReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TaraGrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TaraGrammar.COMMA, i);
		}
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(WITH);
			setState(344);
			identifierReference();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				identifierReference();
				}
				}
				setState(351);
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
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(TaraGrammar.DEF, 0); }
		public PropertyTypeContext propertyType() {
			return getRuleContext(PropertyTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public MogramConstraintContext mogramConstraint() {
			return getRuleContext(MogramConstraintContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(TaraGrammar.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public BodyValueContext bodyValue() {
			return getRuleContext(BodyValueContext.class,0);
		}
		public MeasureUnitContext measureUnit() {
			return getRuleContext(MeasureUnitContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC) {
				{
				setState(352);
				doc();
				}
			}

			setState(355);
			match(DEF);
			setState(356);
			propertyType();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SQUARE) {
				{
				setState(357);
				size();
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(360);
				mogramConstraint();
				}
			}

			setState(363);
			match(IDENTIFIER);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(364);
				match(EQUALS);
				setState(365);
				value();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER || _la==MEASURE_VALUE) {
					{
					setState(366);
					measureUnit();
					}
				}

				}
			}

			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(371);
				annotations();
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE_INDENT) {
				{
				setState(374);
				bodyValue();
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
	public static class BodyValueContext extends ParserRuleContext {
		public TerminalNode NEW_LINE_INDENT() { return getToken(TaraGrammar.NEW_LINE_INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(TaraGrammar.DEDENT, 0); }
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TaraGrammar.NEWLINE, 0); }
		public BodyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterBodyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitBodyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitBodyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyValueContext bodyValue() throws RecognitionException {
		BodyValueContext _localctx = new BodyValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bodyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(NEW_LINE_INDENT);
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(378);
				stringValue();
				}
				break;
			case 2:
				{
				setState(379);
				expression();
				}
				break;
			}
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(382);
				match(NEWLINE);
				}
			}

			setState(385);
			match(DEDENT);
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
	public static class PropertyTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(TaraGrammar.INT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(TaraGrammar.LONG_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(TaraGrammar.DOUBLE_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(TaraGrammar.BOOLEAN_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(TaraGrammar.STRING_TYPE, 0); }
		public TerminalNode FUNCTION_TYPE() { return getToken(TaraGrammar.FUNCTION_TYPE, 0); }
		public TerminalNode OBJECT_TYPE() { return getToken(TaraGrammar.OBJECT_TYPE, 0); }
		public TerminalNode WORD() { return getToken(TaraGrammar.WORD, 0); }
		public TerminalNode DATE_TYPE() { return getToken(TaraGrammar.DATE_TYPE, 0); }
		public TerminalNode INSTANT_TYPE() { return getToken(TaraGrammar.INSTANT_TYPE, 0); }
		public TerminalNode TIME_TYPE() { return getToken(TaraGrammar.TIME_TYPE, 0); }
		public TerminalNode RESOURCE() { return getToken(TaraGrammar.RESOURCE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public PropertyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterPropertyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitPropertyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitPropertyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyTypeContext propertyType() throws RecognitionException {
		PropertyTypeContext _localctx = new PropertyTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_propertyType);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(INT_TYPE);
				}
				break;
			case LONG_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(LONG_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(DOUBLE_TYPE);
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(BOOLEAN_TYPE);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				match(STRING_TYPE);
				}
				break;
			case FUNCTION_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				match(FUNCTION_TYPE);
				}
				break;
			case OBJECT_TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(393);
				match(OBJECT_TYPE);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 8);
				{
				setState(394);
				match(WORD);
				}
				break;
			case DATE_TYPE:
				enterOuterAlt(_localctx, 9);
				{
				setState(395);
				match(DATE_TYPE);
				}
				break;
			case INSTANT_TYPE:
				enterOuterAlt(_localctx, 10);
				{
				setState(396);
				match(INSTANT_TYPE);
				}
				break;
			case TIME_TYPE:
				enterOuterAlt(_localctx, 11);
				{
				setState(397);
				match(TIME_TYPE);
				}
				break;
			case RESOURCE:
				enterOuterAlt(_localctx, 12);
				{
				setState(398);
				match(RESOURCE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 13);
				{
				setState(399);
				identifierReference();
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
	public static class MogramConstraintContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TaraGrammar.COLON, 0); }
		public RuleValueContext ruleValue() {
			return getRuleContext(RuleValueContext.class,0);
		}
		public MogramConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mogramConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterMogramConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitMogramConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitMogramConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MogramConstraintContext mogramConstraint() throws RecognitionException {
		MogramConstraintContext _localctx = new MogramConstraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mogramConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(COLON);
			setState(403);
			ruleValue();
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
	public static class RuleValueContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(TaraGrammar.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(TaraGrammar.RIGHT_CURLY, 0); }
		public MeasureUnitContext measureUnit() {
			return getRuleContext(MeasureUnitContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TaraGrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TaraGrammar.IDENTIFIER, i);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public RuleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterRuleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitRuleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitRuleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleValueContext ruleValue() throws RecognitionException {
		RuleValueContext _localctx = new RuleValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ruleValue);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(405);
				match(LEFT_CURLY);
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(406);
						match(IDENTIFIER);
						}
						}
						setState(409); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==IDENTIFIER );
					}
					break;
				case 2:
					{
					{
					setState(413);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
					case NATURAL_VALUE:
					case NEGATIVE_VALUE:
					case DOUBLE_VALUE:
						{
						setState(411);
						range();
						}
						break;
					case STRING:
					case NEWLINE:
						{
						setState(412);
						stringValue();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER || _la==MEASURE_VALUE) {
						{
						setState(415);
						measureUnit();
						}
					}

					}
					}
					break;
				case 3:
					{
					setState(418);
					measureUnit();
					}
					break;
				}
				setState(421);
				match(RIGHT_CURLY);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(422);
				identifierReference();
				}
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
	public static class RangeContext extends ParserRuleContext {
		public List<DoubleValueContext> doubleValue() {
			return getRuleContexts(DoubleValueContext.class);
		}
		public DoubleValueContext doubleValue(int i) {
			return getRuleContext(DoubleValueContext.class,i);
		}
		public List<IntegerValueContext> integerValue() {
			return getRuleContexts(IntegerValueContext.class);
		}
		public IntegerValueContext integerValue(int i) {
			return getRuleContext(IntegerValueContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(TaraGrammar.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(TaraGrammar.STAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TaraGrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TaraGrammar.DOT, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(425);
				doubleValue();
				}
				break;
			case 2:
				{
				setState(426);
				integerValue();
				}
				break;
			case 3:
				{
				setState(427);
				match(STAR);
				}
				break;
			}
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(430);
				match(DOT);
				setState(431);
				match(DOT);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(432);
					doubleValue();
					}
					break;
				case 2:
					{
					setState(433);
					integerValue();
					}
					break;
				case 3:
					{
					setState(434);
					match(STAR);
					}
					break;
				}
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
	public static class SizeContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE() { return getToken(TaraGrammar.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(TaraGrammar.RIGHT_SQUARE, 0); }
		public SizeRangeContext sizeRange() {
			return getRuleContext(SizeRangeContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(LEFT_SQUARE);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==NATURAL_VALUE) {
				{
				setState(440);
				sizeRange();
				}
			}

			setState(443);
			match(RIGHT_SQUARE);
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
	public static class SizeRangeContext extends ParserRuleContext {
		public TerminalNode NATURAL_VALUE() { return getToken(TaraGrammar.NATURAL_VALUE, 0); }
		public ListRangeContext listRange() {
			return getRuleContext(ListRangeContext.class,0);
		}
		public SizeRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterSizeRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitSizeRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitSizeRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeRangeContext sizeRange() throws RecognitionException {
		SizeRangeContext _localctx = new SizeRangeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sizeRange);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(NATURAL_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				listRange();
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
	public static class ListRangeContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(TaraGrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TaraGrammar.DOT, i);
		}
		public List<TerminalNode> NATURAL_VALUE() { return getTokens(TaraGrammar.NATURAL_VALUE); }
		public TerminalNode NATURAL_VALUE(int i) {
			return getToken(TaraGrammar.NATURAL_VALUE, i);
		}
		public List<TerminalNode> STAR() { return getTokens(TaraGrammar.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(TaraGrammar.STAR, i);
		}
		public ListRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterListRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitListRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitListRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListRangeContext listRange() throws RecognitionException {
		ListRangeContext _localctx = new ListRangeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==NATURAL_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(450);
			match(DOT);
			setState(451);
			match(DOT);
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==NATURAL_VALUE) ) {
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
	public static class MethodReferenceContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(TaraGrammar.AT, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(AT);
			setState(455);
			identifierReference();
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
	public static class StringValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TaraGrammar.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(TaraGrammar.NEWLINE, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stringValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(457);
				match(NEWLINE);
				}
			}

			{
			setState(460);
			match(STRING);
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
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_VALUE() { return getToken(TaraGrammar.BOOLEAN_VALUE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_booleanValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(BOOLEAN_VALUE);
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
	public static class TupleValueContext extends ParserRuleContext {
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TaraGrammar.COLON, 0); }
		public DoubleValueContext doubleValue() {
			return getRuleContext(DoubleValueContext.class,0);
		}
		public TupleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterTupleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitTupleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitTupleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleValueContext tupleValue() throws RecognitionException {
		TupleValueContext _localctx = new TupleValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tupleValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			stringValue();
			setState(465);
			match(COLON);
			setState(466);
			doubleValue();
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
	public static class IntegerValueContext extends ParserRuleContext {
		public TerminalNode NATURAL_VALUE() { return getToken(TaraGrammar.NATURAL_VALUE, 0); }
		public TerminalNode NEGATIVE_VALUE() { return getToken(TaraGrammar.NEGATIVE_VALUE, 0); }
		public IntegerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterIntegerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitIntegerValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitIntegerValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerValueContext integerValue() throws RecognitionException {
		IntegerValueContext _localctx = new IntegerValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_integerValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==NATURAL_VALUE || _la==NEGATIVE_VALUE) ) {
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
	public static class DoubleValueContext extends ParserRuleContext {
		public TerminalNode NATURAL_VALUE() { return getToken(TaraGrammar.NATURAL_VALUE, 0); }
		public TerminalNode NEGATIVE_VALUE() { return getToken(TaraGrammar.NEGATIVE_VALUE, 0); }
		public TerminalNode DOUBLE_VALUE() { return getToken(TaraGrammar.DOUBLE_VALUE, 0); }
		public TerminalNode SCIENCE_NOT() { return getToken(TaraGrammar.SCIENCE_NOT, 0); }
		public DoubleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterDoubleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitDoubleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitDoubleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleValueContext doubleValue() throws RecognitionException {
		DoubleValueContext _localctx = new DoubleValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_doubleValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316530991104L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(471);
				match(SCIENCE_NOT);
				}
				break;
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
	public static class MeasureUnitContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public TerminalNode MEASURE_VALUE() { return getToken(TaraGrammar.MEASURE_VALUE, 0); }
		public MeasureUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterMeasureUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitMeasureUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitMeasureUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureUnitContext measureUnit() throws RecognitionException {
		MeasureUnitContext _localctx = new MeasureUnitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_measureUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==MEASURE_VALUE) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EXPRESSION_BEGIN() { return getToken(TaraGrammar.EXPRESSION_BEGIN, 0); }
		public TerminalNode EXPRESSION_END() { return getToken(TaraGrammar.EXPRESSION_END, 0); }
		public TerminalNode NEWLINE() { return getToken(TaraGrammar.NEWLINE, 0); }
		public List<TerminalNode> CHARACTER() { return getTokens(TaraGrammar.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(TaraGrammar.CHARACTER, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(476);
				match(NEWLINE);
				}
			}

			{
			setState(479);
			match(EXPRESSION_BEGIN);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER) {
				{
				{
				setState(480);
				match(CHARACTER);
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486);
			match(EXPRESSION_END);
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
	public static class AnnotationsContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(TaraGrammar.AS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(AS);
			setState(490); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(489);
				annotation();
				}
				}
				setState(492); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2088960L) != 0) );
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
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode GENERALIZATION() { return getToken(TaraGrammar.GENERALIZATION, 0); }
		public TerminalNode COMPONENT() { return getToken(TaraGrammar.COMPONENT, 0); }
		public TerminalNode PRIVATE() { return getToken(TaraGrammar.PRIVATE, 0); }
		public TerminalNode FEATURE() { return getToken(TaraGrammar.FEATURE, 0); }
		public TerminalNode FINAL() { return getToken(TaraGrammar.FINAL, 0); }
		public TerminalNode REACTIVE() { return getToken(TaraGrammar.REACTIVE, 0); }
		public TerminalNode DECORABLE() { return getToken(TaraGrammar.DECORABLE, 0); }
		public TerminalNode REQUIRED() { return getToken(TaraGrammar.REQUIRED, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2088960L) != 0)) ) {
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
	public static class PropertyDescriptiveContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public BodyValueContext bodyValue() {
			return getRuleContext(BodyValueContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(TaraGrammar.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropertyDescriptiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDescriptive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterPropertyDescriptive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitPropertyDescriptive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitPropertyDescriptive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDescriptiveContext propertyDescriptive() throws RecognitionException {
		PropertyDescriptiveContext _localctx = new PropertyDescriptiveContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propertyDescriptive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(IDENTIFIER);
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS:
				{
				{
				setState(497);
				match(EQUALS);
				setState(498);
				value();
				}
				}
				break;
			case NEW_LINE_INDENT:
				{
				setState(499);
				bodyValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class HeaderReferenceContext extends ParserRuleContext {
		public IdentifierKeyContext identifierKey() {
			return getRuleContext(IdentifierKeyContext.class,0);
		}
		public List<HierarchyContext> hierarchy() {
			return getRuleContexts(HierarchyContext.class);
		}
		public HierarchyContext hierarchy(int i) {
			return getRuleContext(HierarchyContext.class,i);
		}
		public HeaderReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterHeaderReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitHeaderReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitHeaderReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderReferenceContext headerReference() throws RecognitionException {
		HeaderReferenceContext _localctx = new HeaderReferenceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_headerReference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502);
					hierarchy();
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(508);
			identifierKey();
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
	public static class IdentifierReferenceContext extends ParserRuleContext {
		public IdentifierKeyContext identifierKey() {
			return getRuleContext(IdentifierKeyContext.class,0);
		}
		public List<HierarchyContext> hierarchy() {
			return getRuleContexts(HierarchyContext.class);
		}
		public HierarchyContext hierarchy(int i) {
			return getRuleContext(HierarchyContext.class,i);
		}
		public IdentifierReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterIdentifierReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitIdentifierReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitIdentifierReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierReferenceContext identifierReference() throws RecognitionException {
		IdentifierReferenceContext _localctx = new IdentifierReferenceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_identifierReference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					hierarchy();
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(516);
			identifierKey();
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
	public static class IdentifierKeyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public IdentifierKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterIdentifierKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitIdentifierKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitIdentifierKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierKeyContext identifierKey() throws RecognitionException {
		IdentifierKeyContext _localctx = new IdentifierKeyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifierKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
	public static class HierarchyContext extends ParserRuleContext {
		public IdentifierKeyContext identifierKey() {
			return getRuleContext(IdentifierKeyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TaraGrammar.DOT, 0); }
		public TerminalNode PLUS() { return getToken(TaraGrammar.PLUS, 0); }
		public HierarchyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterHierarchy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitHierarchy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitHierarchy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HierarchyContext hierarchy() throws RecognitionException {
		HierarchyContext _localctx = new HierarchyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hierarchy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			identifierKey();
			setState(521);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==PLUS) ) {
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
	public static class MetaidentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public MetaidentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaidentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterMetaidentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitMetaidentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitMetaidentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaidentifierContext metaidentifier() throws RecognitionException {
		MetaidentifierContext _localctx = new MetaidentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_metaidentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
	public static class ConstraintDefContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(TaraGrammar.CONSTRAINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public TerminalNode CONSTRAINT_START() { return getToken(TaraGrammar.CONSTRAINT_START, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(TaraGrammar.DEDENT, 0); }
		public TerminalNode NEW_LINE_INDENT() { return getToken(TaraGrammar.NEW_LINE_INDENT, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TaraGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TaraGrammar.NEWLINE, i);
		}
		public ConstraintDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterConstraintDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitConstraintDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitConstraintDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintDefContext constraintDef() throws RecognitionException {
		ConstraintDefContext _localctx = new ConstraintDefContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constraintDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(CONSTRAINT);
			setState(526);
			match(IDENTIFIER);
			setState(527);
			match(CONSTRAINT_START);
			setState(528);
			constraint(0);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE_INDENT) {
				{
				{
				setState(529);
				match(NEW_LINE_INDENT);
				setState(530);
				description();
				setState(532); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(531);
					match(NEWLINE);
					}
					}
					setState(534); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				setState(536);
				match(DEDENT);
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
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TaraGrammar.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(TaraGrammar.EQUALS, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(540);
				match(IDENTIFIER);
				setState(541);
				match(EQUALS);
				}
			}

			setState(544);
			match(STRING);
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
	public static class ConstraintContext extends ParserRuleContext {
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	 
		public ConstraintContext() { }
		public void copyFrom(ConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ConstraintContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public UnaryExprContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ConstraintContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExprContext extends ConstraintContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public TerminalNode OR() { return getToken(TaraGrammar.OR, 0); }
		public TerminalNode AND() { return getToken(TaraGrammar.AND, 0); }
		public BooleanExprContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ConstraintContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public BinaryCompContext binaryComp() {
			return getRuleContext(BinaryCompContext.class,0);
		}
		public ComparisonExprContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		return constraint(0);
	}

	private ConstraintContext constraint(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstraintContext _localctx = new ConstraintContext(_ctx, _parentState);
		ConstraintContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_constraint, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(547);
				unaryOp();
				setState(548);
				constraint(4);
				}
				break;
			case LEFT_PARENTHESIS:
			case EMPTY:
			case BOOLEAN_VALUE:
			case NATURAL_VALUE:
			case NEGATIVE_VALUE:
			case DOUBLE_VALUE:
			case STRING:
			case IDENTIFIER:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(550);
				primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(560);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExprContext(new ConstraintContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constraint);
						setState(553);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(554);
						binaryComp();
						setState(555);
						constraint(4);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExprContext(new ConstraintContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_constraint);
						setState(557);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(558);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(559);
						constraint(3);
						}
						break;
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExprContext extends PrimaryContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(TaraGrammar.LEFT_PARENTHESIS, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(TaraGrammar.RIGHT_PARENTHESIS, 0); }
		public GroupedExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterGroupedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitGroupedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitGroupedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExprContext extends PrimaryContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public VariableExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExprExprContext extends PrimaryContext {
		public LambdaExprContext lambdaExpr() {
			return getRuleContext(LambdaExprContext.class,0);
		}
		public LambdaExprExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterLambdaExprExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitLambdaExprExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitLambdaExprExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExprContext extends PrimaryContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_primary);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				literal();
				}
				break;
			case 2:
				_localctx = new FunctionExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				functionCall();
				}
				break;
			case 3:
				_localctx = new LambdaExprExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				lambdaExpr();
				}
				break;
			case 4:
				_localctx = new GroupedExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				match(LEFT_PARENTHESIS);
				setState(569);
				constraint(0);
				setState(570);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 5:
				_localctx = new VariableExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(572);
				propertyName();
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
	public static class PropertyNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TaraGrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TaraGrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TaraGrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TaraGrammar.DOT, i);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_propertyName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(IDENTIFIER);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(576);
					match(DOT);
					setState(577);
					match(IDENTIFIER);
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(TaraGrammar.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(TaraGrammar.RIGHT_PARENTHESIS, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(IDENTIFIER);
			setState(584);
			match(LEFT_PARENTHESIS);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2238289014805233664L) != 0) || _la==IDENTIFIER || _la==NOT) {
				{
				setState(585);
				argumentList();
				}
			}

			setState(588);
			match(RIGHT_PARENTHESIS);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TaraGrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TaraGrammar.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			constraint(0);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(591);
				match(COMMA);
				setState(592);
				constraint(0);
				}
				}
				setState(597);
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
	public static class LambdaExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TaraGrammar.IDENTIFIER, 0); }
		public TerminalNode LAMBDA() { return getToken(TaraGrammar.LAMBDA, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public LambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExprContext lambdaExpr() throws RecognitionException {
		LambdaExprContext _localctx = new LambdaExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lambdaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(IDENTIFIER);
			setState(599);
			match(LAMBDA);
			setState(600);
			constraint(0);
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
	public static class BinaryCompContext extends ParserRuleContext {
		public TerminalNode COMPARER_EQUALS() { return getToken(TaraGrammar.COMPARER_EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(TaraGrammar.NOT_EQUALS, 0); }
		public TerminalNode GREATER_EQUALS() { return getToken(TaraGrammar.GREATER_EQUALS, 0); }
		public TerminalNode LESS_EQUALS() { return getToken(TaraGrammar.LESS_EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(TaraGrammar.GREATER, 0); }
		public TerminalNode LESS() { return getToken(TaraGrammar.LESS, 0); }
		public TerminalNode NOT() { return getToken(TaraGrammar.NOT, 0); }
		public TerminalNode IN() { return getToken(TaraGrammar.IN, 0); }
		public TerminalNode IS() { return getToken(TaraGrammar.IS, 0); }
		public TerminalNode LIKE() { return getToken(TaraGrammar.LIKE, 0); }
		public TerminalNode MATCHES() { return getToken(TaraGrammar.MATCHES, 0); }
		public TerminalNode STARTS_WITH() { return getToken(TaraGrammar.STARTS_WITH, 0); }
		public BinaryCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterBinaryComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitBinaryComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitBinaryComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryCompContext binaryComp() throws RecognitionException {
		BinaryCompContext _localctx = new BinaryCompContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_binaryComp);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(COMPARER_EQUALS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(NOT_EQUALS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				match(GREATER_EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				match(LESS_EQUALS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(606);
				match(GREATER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(607);
				match(LESS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(608);
				match(NOT);
				setState(609);
				match(IN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(610);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(611);
				match(IS);
				setState(612);
				match(NOT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(613);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(614);
				match(LIKE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(615);
				match(MATCHES);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(616);
				match(STARTS_WITH);
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
	public static class UnaryOpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(TaraGrammar.NOT, 0); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unaryOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(NOT);
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
		public TerminalNode STRING() { return getToken(TaraGrammar.STRING, 0); }
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public DoubleValueContext doubleValue() {
			return getRuleContext(DoubleValueContext.class,0);
		}
		public TerminalNode BOOLEAN_VALUE() { return getToken(TaraGrammar.BOOLEAN_VALUE, 0); }
		public TerminalNode EMPTY() { return getToken(TaraGrammar.EMPTY, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaraGrammarListener ) ((TaraGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaraGrammarVisitor ) return ((TaraGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				integerValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				doubleValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				match(BOOLEAN_VALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(625);
				match(EMPTY);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
			return constraint_sempred((ConstraintContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constraint_sempred(ConstraintContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001q\u0275\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0005\u0000"+
		"n\b\u0000\n\u0000\f\u0000q\t\u0000\u0001\u0000\u0003\u0000t\b\u0000\u0001"+
		"\u0000\u0003\u0000w\b\u0000\u0001\u0000\u0001\u0000\u0004\u0000{\b\u0000"+
		"\u000b\u0000\f\u0000|\u0001\u0000\u0005\u0000\u0080\b\u0000\n\u0000\f"+
		"\u0000\u0083\t\u0000\u0003\u0000\u0085\b\u0000\u0001\u0000\u0005\u0000"+
		"\u0088\b\u0000\n\u0000\f\u0000\u008b\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0092\b\u0001\n\u0001\f\u0001"+
		"\u0095\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u0099\b\u0002\u0001"+
		"\u0003\u0004\u0003\u009c\b\u0003\u000b\u0003\f\u0003\u009d\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u00a3\b\u0004\u000b\u0004\f\u0004"+
		"\u00a4\u0001\u0005\u0004\u0005\u00a8\b\u0005\u000b\u0005\f\u0005\u00a9"+
		"\u0001\u0006\u0003\u0006\u00ad\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00b1\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u00b5\b\u0007\n\u0007"+
		"\f\u0007\u00b8\t\u0007\u0001\u0007\u0003\u0007\u00bb\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00bf\b\u0007\u0001\u0007\u0003\u0007\u00c2\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c6\b\u0007\n\u0007\f\u0007"+
		"\u00c9\t\u0007\u0001\u0007\u0003\u0007\u00cc\b\u0007\u0001\u0007\u0003"+
		"\u0007\u00cf\b\u0007\u0001\u0007\u0003\u0007\u00d2\b\u0007\u0001\u0007"+
		"\u0003\u0007\u00d5\b\u0007\u0001\u0007\u0003\u0007\u00d8\b\u0007\u0003"+
		"\u0007\u00da\b\u0007\u0001\u0007\u0003\u0007\u00dd\b\u0007\u0001\u0007"+
		"\u0003\u0007\u00e0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00e7\b\b\u0001\b\u0004\b\u00ea\b\b\u000b\b\f\b\u00eb\u0004\b\u00ee"+
		"\b\b\u000b\b\f\b\u00ef\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00fe\b\u000b\n\u000b\f\u000b\u0101\t\u000b\u0003\u000b\u0103\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u0109\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0004\r\u010f\b\r\u000b\r\f\r\u0110\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0115\b\u000e\u0001\u000f\u0004\u000f\u0118\b"+
		"\u000f\u000b\u000f\f\u000f\u0119\u0001\u000f\u0004\u000f\u011d\b\u000f"+
		"\u000b\u000f\f\u000f\u011e\u0001\u000f\u0004\u000f\u0122\b\u000f\u000b"+
		"\u000f\f\u000f\u0123\u0001\u000f\u0004\u000f\u0127\b\u000f\u000b\u000f"+
		"\f\u000f\u0128\u0001\u000f\u0004\u000f\u012c\b\u000f\u000b\u000f\f\u000f"+
		"\u012d\u0001\u000f\u0004\u000f\u0131\b\u000f\u000b\u000f\f\u000f\u0132"+
		"\u0001\u000f\u0003\u000f\u0136\b\u000f\u0001\u000f\u0004\u000f\u0139\b"+
		"\u000f\u000b\u000f\f\u000f\u013a\u0001\u000f\u0003\u000f\u013e\b\u000f"+
		"\u0001\u000f\u0004\u000f\u0141\b\u000f\u000b\u000f\f\u000f\u0142\u0001"+
		"\u000f\u0004\u000f\u0146\b\u000f\u000b\u000f\f\u000f\u0147\u0001\u000f"+
		"\u0003\u000f\u014b\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u014f\b"+
		"\u0010\n\u0010\f\u0010\u0152\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0156\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u015c\b\u0011\n\u0011\f\u0011\u015f\t\u0011\u0001\u0012\u0003\u0012\u0162"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0167\b\u0012"+
		"\u0001\u0012\u0003\u0012\u016a\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0170\b\u0012\u0003\u0012\u0172\b\u0012\u0001"+
		"\u0012\u0003\u0012\u0175\b\u0012\u0001\u0012\u0003\u0012\u0178\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u017d\b\u0013\u0001\u0013"+
		"\u0003\u0013\u0180\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0191\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0004\u0016\u0198\b\u0016\u000b\u0016\f\u0016\u0199\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u019e\b\u0016\u0001\u0016\u0003\u0016\u01a1\b\u0016"+
		"\u0001\u0016\u0003\u0016\u01a4\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01a8\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01ad\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01b4\b\u0017\u0003\u0017\u01b6\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01ba\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01c0\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003\u001c"+
		"\u01cb\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0003 \u01d9\b \u0001!\u0001!\u0001\"\u0003\"\u01de\b\"\u0001\"\u0001"+
		"\"\u0005\"\u01e2\b\"\n\"\f\"\u01e5\t\"\u0001\"\u0001\"\u0001#\u0001#\u0004"+
		"#\u01eb\b#\u000b#\f#\u01ec\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u01f5\b%\u0001&\u0005&\u01f8\b&\n&\f&\u01fb\t&\u0001&\u0001&\u0001\'"+
		"\u0005\'\u0200\b\'\n\'\f\'\u0203\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0004+\u0215\b+\u000b+\f+\u0216\u0001+\u0001+\u0003+\u021b\b"+
		"+\u0001,\u0001,\u0003,\u021f\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0228\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0005-\u0231\b-\n-\f-\u0234\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u023e\b.\u0001/\u0001/\u0001/\u0005/\u0243\b/\n"+
		"/\f/\u0246\t/\u00010\u00010\u00010\u00030\u024b\b0\u00010\u00010\u0001"+
		"1\u00011\u00011\u00051\u0252\b1\n1\f1\u0255\t1\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u026a\b3\u00014\u00014\u0001"+
		"5\u00015\u00015\u00015\u00015\u00035\u0273\b5\u00015\u0000\u0001Z6\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\b\u0002\u0000\u0001"+
		"\u0001\u0005\u0005\u0002\u0000$$99\u0001\u00009:\u0001\u00009;\u0001\u0000"+
		"@A\u0001\u0000\r\u0014\u0002\u0000\"\"\'\'\u0001\u0000XY\u02c1\u0000o"+
		"\u0001\u0000\u0000\u0000\u0002\u008e\u0001\u0000\u0000\u0000\u0004\u0098"+
		"\u0001\u0000\u0000\u0000\u0006\u009b\u0001\u0000\u0000\u0000\b\u009f\u0001"+
		"\u0000\u0000\u0000\n\u00a7\u0001\u0000\u0000\u0000\f\u00ac\u0001\u0000"+
		"\u0000\u0000\u000e\u00d9\u0001\u0000\u0000\u0000\u0010\u00e1\u0001\u0000"+
		"\u0000\u0000\u0012\u00f3\u0001\u0000\u0000\u0000\u0014\u00f6\u0001\u0000"+
		"\u0000\u0000\u0016\u00f9\u0001\u0000\u0000\u0000\u0018\u0108\u0001\u0000"+
		"\u0000\u0000\u001a\u010c\u0001\u0000\u0000\u0000\u001c\u0112\u0001\u0000"+
		"\u0000\u0000\u001e\u014a\u0001\u0000\u0000\u0000 \u014c\u0001\u0000\u0000"+
		"\u0000\"\u0157\u0001\u0000\u0000\u0000$\u0161\u0001\u0000\u0000\u0000"+
		"&\u0179\u0001\u0000\u0000\u0000(\u0190\u0001\u0000\u0000\u0000*\u0192"+
		"\u0001\u0000\u0000\u0000,\u01a7\u0001\u0000\u0000\u0000.\u01ac\u0001\u0000"+
		"\u0000\u00000\u01b7\u0001\u0000\u0000\u00002\u01bf\u0001\u0000\u0000\u0000"+
		"4\u01c1\u0001\u0000\u0000\u00006\u01c6\u0001\u0000\u0000\u00008\u01ca"+
		"\u0001\u0000\u0000\u0000:\u01ce\u0001\u0000\u0000\u0000<\u01d0\u0001\u0000"+
		"\u0000\u0000>\u01d4\u0001\u0000\u0000\u0000@\u01d6\u0001\u0000\u0000\u0000"+
		"B\u01da\u0001\u0000\u0000\u0000D\u01dd\u0001\u0000\u0000\u0000F\u01e8"+
		"\u0001\u0000\u0000\u0000H\u01ee\u0001\u0000\u0000\u0000J\u01f0\u0001\u0000"+
		"\u0000\u0000L\u01f9\u0001\u0000\u0000\u0000N\u0201\u0001\u0000\u0000\u0000"+
		"P\u0206\u0001\u0000\u0000\u0000R\u0208\u0001\u0000\u0000\u0000T\u020b"+
		"\u0001\u0000\u0000\u0000V\u020d\u0001\u0000\u0000\u0000X\u021e\u0001\u0000"+
		"\u0000\u0000Z\u0227\u0001\u0000\u0000\u0000\\\u023d\u0001\u0000\u0000"+
		"\u0000^\u023f\u0001\u0000\u0000\u0000`\u0247\u0001\u0000\u0000\u0000b"+
		"\u024e\u0001\u0000\u0000\u0000d\u0256\u0001\u0000\u0000\u0000f\u0269\u0001"+
		"\u0000\u0000\u0000h\u026b\u0001\u0000\u0000\u0000j\u0272\u0001\u0000\u0000"+
		"\u0000ln\u0005B\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0003\u0002\u0001\u0000sr\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"uw\u0003\u0006\u0003\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w\u0084\u0001\u0000\u0000\u0000x\u0081\u0003\u0004\u0002\u0000y"+
		"{\u0005B\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0080\u0003\u0004\u0002\u0000\u007fz\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0084x\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0089\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0005B\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\u0000\u0000\u0001\u008d\u0001\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0093\u0003"+
		"L&\u0000\u0090\u0092\u0005B\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0003\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0003V+\u0000\u0097"+
		"\u0099\u0003\f\u0006\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u0005\u0001\u0000\u0000\u0000\u009a\u009c"+
		"\u0003\b\u0004\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u0007\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\u0002\u0000\u0000\u00a0\u00a2\u0003L&\u0000\u00a1\u00a3\u0005B\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005D\u0000\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u000b\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\n\u0005\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u000e\u0007\u0000\u00af"+
		"\u00b1\u0003\u0010\b\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\r\u0001\u0000\u0000\u0000\u00b2\u00b6\u0007"+
		"\u0000\u0000\u0000\u00b3\u00b5\u0003*\u0015\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003\u0016"+
		"\u000b\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0005@\u0000"+
		"\u0000\u00bd\u00bf\u0003\u0014\n\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c2\u0003\u001a\r\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00da\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c7\u0003T*\u0000\u00c4\u00c6\u0003*\u0015\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003"+
		"\u0016\u000b\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005"+
		"@\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d4\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u001a"+
		"\r\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003\u0012\t\u0000"+
		"\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003\u0014\n\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00da\u0001\u0000\u0000\u0000\u00d9\u00b2\u0001\u0000\u0000\u0000\u00d9"+
		"\u00c3\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db"+
		"\u00dd\u0003\"\u0011\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0003F#\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u000f\u0001\u0000\u0000\u0000\u00e1\u00ed\u0005G\u0000"+
		"\u0000\u00e2\u00e7\u0003$\u0012\u0000\u00e3\u00e7\u0003\f\u0006\u0000"+
		"\u00e4\u00e7\u0003J%\u0000\u00e5\u00e7\u0003 \u0010\u0000\u00e6\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ea\u0005B\u0000\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ed\u00e6\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"H\u0000\u0000\u00f2\u0011\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\b"+
		"\u0000\u0000\u00f4\u00f5\u0003N\'\u0000\u00f5\u0013\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005\u000b\u0000\u0000\u00f7\u00f8\u0003N\'\u0000"+
		"\u00f8\u0015\u0001\u0000\u0000\u0000\u00f9\u0102\u0005\u0015\u0000\u0000"+
		"\u00fa\u00ff\u0003\u0018\f\u0000\u00fb\u00fc\u0005!\u0000\u0000\u00fc"+
		"\u00fe\u0003\u0018\f\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0101"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u00fa\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0005\u0016\u0000\u0000\u0105\u0017\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0005@\u0000\u0000\u0107\u0109\u0005#\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0003\u001e\u000f\u0000\u010b\u0019\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0005\t\u0000\u0000\u010d\u010f\u0003\u001c\u000e"+
		"\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u001b\u0001\u0000\u0000\u0000\u0112\u0114\u0003T*\u0000\u0113"+
		"\u0115\u0003\u0016\u000b\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u001d\u0001\u0000\u0000\u0000\u0116"+
		"\u0118\u0003N\'\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u014b\u0001\u0000\u0000\u0000\u011b\u011d"+
		"\u00038\u001c\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u014b\u0001\u0000\u0000\u0000\u0120\u0122\u0003"+
		"<\u001e\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u014b\u0001\u0000\u0000\u0000\u0125\u0127\u0003:\u001d"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u014b\u0001\u0000\u0000\u0000\u012a\u012c\u0003N\'\u0000"+
		"\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u014b\u0001\u0000\u0000\u0000\u012f\u0131\u0003>\u001f\u0000\u0130"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0135\u0001\u0000\u0000\u0000\u0134\u0136\u0003B!\u0000\u0135\u0134\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u014b\u0001"+
		"\u0000\u0000\u0000\u0137\u0139\u0003@ \u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000"+
		"\u0000\u013c\u013e\u0003B!\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u014b\u0001\u0000\u0000\u0000\u013f"+
		"\u0141\u0003D\"\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u014b\u0001\u0000\u0000\u0000\u0144\u0146"+
		"\u00036\u001b\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u014b\u0005"+
		"4\u0000\u0000\u014a\u0117\u0001\u0000\u0000\u0000\u014a\u011c\u0001\u0000"+
		"\u0000\u0000\u014a\u0121\u0001\u0000\u0000\u0000\u014a\u0126\u0001\u0000"+
		"\u0000\u0000\u014a\u012b\u0001\u0000\u0000\u0000\u014a\u0130\u0001\u0000"+
		"\u0000\u0000\u014a\u0138\u0001\u0000\u0000\u0000\u014a\u0140\u0001\u0000"+
		"\u0000\u0000\u014a\u0145\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u001f\u0001\u0000\u0000\u0000\u014c\u0150\u0005\u0006"+
		"\u0000\u0000\u014d\u014f\u0003*\u0015\u0000\u014e\u014d\u0001\u0000\u0000"+
		"\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0155\u0003N\'\u0000"+
		"\u0154\u0156\u0003F#\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0001\u0000\u0000\u0000\u0156!\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"\n\u0000\u0000\u0158\u015d\u0003N\'\u0000\u0159\u015a\u0005!\u0000\u0000"+
		"\u015a\u015c\u0003N\'\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c"+
		"\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e#\u0001\u0000\u0000\u0000\u015f\u015d"+
		"\u0001\u0000\u0000\u0000\u0160\u0162\u0003\n\u0005\u0000\u0161\u0160\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005\u0004\u0000\u0000\u0164\u0166\u0003"+
		"(\u0014\u0000\u0165\u0167\u00030\u0018\u0000\u0166\u0165\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0003*\u0015\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u0171\u0005@\u0000\u0000\u016c\u016d\u0005#\u0000\u0000\u016d\u016f"+
		"\u0003\u001e\u000f\u0000\u016e\u0170\u0003B!\u0000\u016f\u016e\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000"+
		"\u0000\u0000\u0171\u016c\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0175\u0003F#\u0000"+
		"\u0174\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0178\u0003&\u0013\u0000\u0177"+
		"\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178"+
		"%\u0001\u0000\u0000\u0000\u0179\u017c\u0005G\u0000\u0000\u017a\u017d\u0003"+
		"8\u001c\u0000\u017b\u017d\u0003D\"\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000"+
		"\u0000\u017e\u0180\u0005B\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0005H\u0000\u0000\u0182\'\u0001\u0000\u0000\u0000\u0183"+
		"\u0191\u0005*\u0000\u0000\u0184\u0191\u0005.\u0000\u0000\u0185\u0191\u0005"+
		"-\u0000\u0000\u0186\u0191\u00050\u0000\u0000\u0187\u0191\u0005/\u0000"+
		"\u0000\u0188\u0191\u0005+\u0000\u0000\u0189\u0191\u0005,\u0000\u0000\u018a"+
		"\u0191\u0005(\u0000\u0000\u018b\u0191\u00051\u0000\u0000\u018c\u0191\u0005"+
		"2\u0000\u0000\u018d\u0191\u00053\u0000\u0000\u018e\u0191\u0005)\u0000"+
		"\u0000\u018f\u0191\u0003N\'\u0000\u0190\u0183\u0001\u0000\u0000\u0000"+
		"\u0190\u0184\u0001\u0000\u0000\u0000\u0190\u0185\u0001\u0000\u0000\u0000"+
		"\u0190\u0186\u0001\u0000\u0000\u0000\u0190\u0187\u0001\u0000\u0000\u0000"+
		"\u0190\u0188\u0001\u0000\u0000\u0000\u0190\u0189\u0001\u0000\u0000\u0000"+
		"\u0190\u018a\u0001\u0000\u0000\u0000\u0190\u018b\u0001\u0000\u0000\u0000"+
		"\u0190\u018c\u0001\u0000\u0000\u0000\u0190\u018d\u0001\u0000\u0000\u0000"+
		"\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000"+
		"\u0191)\u0001\u0000\u0000\u0000\u0192\u0193\u0005 \u0000\u0000\u0193\u0194"+
		"\u0003,\u0016\u0000\u0194+\u0001\u0000\u0000\u0000\u0195\u01a3\u0005\u0019"+
		"\u0000\u0000\u0196\u0198\u0005@\u0000\u0000\u0197\u0196\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u01a4\u0001\u0000\u0000"+
		"\u0000\u019b\u019e\u0003.\u0017\u0000\u019c\u019e\u00038\u001c\u0000\u019d"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u01a0\u0001\u0000\u0000\u0000\u019f\u01a1\u0003B!\u0000\u01a0\u019f\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a4\u0003B!\u0000\u01a3\u0197\u0001\u0000\u0000"+
		"\u0000\u01a3\u019d\u0001\u0000\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a8\u0005\u001a\u0000"+
		"\u0000\u01a6\u01a8\u0003N\'\u0000\u01a7\u0195\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8-\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ad\u0003@ \u0000\u01aa\u01ad\u0003>\u001f\u0000\u01ab\u01ad\u0005"+
		"$\u0000\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b5\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0005\"\u0000\u0000\u01af\u01b3\u0005\"\u0000"+
		"\u0000\u01b0\u01b4\u0003@ \u0000\u01b1\u01b4\u0003>\u001f\u0000\u01b2"+
		"\u01b4\u0005$\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b5\u01ae\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6/\u0001\u0000\u0000\u0000\u01b7\u01b9\u0005"+
		"\u0017\u0000\u0000\u01b8\u01ba\u00032\u0019\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0005\u0018\u0000\u0000\u01bc1\u0001\u0000\u0000"+
		"\u0000\u01bd\u01c0\u00059\u0000\u0000\u01be\u01c0\u00034\u001a\u0000\u01bf"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0"+
		"3\u0001\u0000\u0000\u0000\u01c1\u01c2\u0007\u0001\u0000\u0000\u01c2\u01c3"+
		"\u0005\"\u0000\u0000\u01c3\u01c4\u0005\"\u0000\u0000\u01c4\u01c5\u0007"+
		"\u0001\u0000\u0000\u01c55\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005\u001d"+
		"\u0000\u0000\u01c7\u01c8\u0003N\'\u0000\u01c87\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cb\u0005B\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0005<\u0000\u0000\u01cd9\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005"+
		"8\u0000\u0000\u01cf;\u0001\u0000\u0000\u0000\u01d0\u01d1\u00038\u001c"+
		"\u0000\u01d1\u01d2\u0005 \u0000\u0000\u01d2\u01d3\u0003@ \u0000\u01d3"+
		"=\u0001\u0000\u0000\u0000\u01d4\u01d5\u0007\u0002\u0000\u0000\u01d5?\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d8\u0007\u0003\u0000\u0000\u01d7\u01d9\u0005"+
		"7\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9A\u0001\u0000\u0000\u0000\u01da\u01db\u0007\u0004\u0000"+
		"\u0000\u01dbC\u0001\u0000\u0000\u0000\u01dc\u01de\u0005B\u0000\u0000\u01dd"+
		"\u01dc\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0001\u0000\u0000\u0000\u01df\u01e3\u0005o\u0000\u0000\u01e0\u01e2"+
		"\u0005q\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e7\u0005p\u0000\u0000\u01e7E\u0001\u0000\u0000"+
		"\u0000\u01e8\u01ea\u0005\u0007\u0000\u0000\u01e9\u01eb\u0003H$\u0000\u01ea"+
		"\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed"+
		"G\u0001\u0000\u0000\u0000\u01ee\u01ef\u0007\u0005\u0000\u0000\u01efI\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f4\u0005@\u0000\u0000\u01f1\u01f2\u0005#\u0000"+
		"\u0000\u01f2\u01f5\u0003\u001e\u000f\u0000\u01f3\u01f5\u0003&\u0013\u0000"+
		"\u01f4\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f5K\u0001\u0000\u0000\u0000\u01f6\u01f8\u0003R)\u0000\u01f7\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0003P(\u0000\u01fdM\u0001\u0000\u0000\u0000\u01fe\u0200\u0003R)\u0000"+
		"\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0003P(\u0000\u0205O\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0005@\u0000\u0000\u0207Q\u0001\u0000\u0000\u0000\u0208\u0209\u0003P"+
		"(\u0000\u0209\u020a\u0007\u0006\u0000\u0000\u020aS\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0005@\u0000\u0000\u020cU\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0005\f\u0000\u0000\u020e\u020f\u0005@\u0000\u0000\u020f\u0210\u0005"+
		"\u001f\u0000\u0000\u0210\u021a\u0003Z-\u0000\u0211\u0212\u0005G\u0000"+
		"\u0000\u0212\u0214\u0003X,\u0000\u0213\u0215\u0005B\u0000\u0000\u0214"+
		"\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0005H\u0000\u0000\u0219\u021b"+
		"\u0001\u0000\u0000\u0000\u021a\u0211\u0001\u0000\u0000\u0000\u021a\u021b"+
		"\u0001\u0000\u0000\u0000\u021bW\u0001\u0000\u0000\u0000\u021c\u021d\u0005"+
		"@\u0000\u0000\u021d\u021f\u0005#\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0005<\u0000\u0000\u0221Y\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0006-\uffff\uffff\u0000\u0223\u0224\u0003h4\u0000\u0224\u0225"+
		"\u0003Z-\u0004\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0228\u0003\\"+
		".\u0000\u0227\u0222\u0001\u0000\u0000\u0000\u0227\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u0232\u0001\u0000\u0000\u0000\u0229\u022a\n\u0003\u0000\u0000"+
		"\u022a\u022b\u0003f3\u0000\u022b\u022c\u0003Z-\u0004\u022c\u0231\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\n\u0002\u0000\u0000\u022e\u022f\u0007\u0007"+
		"\u0000\u0000\u022f\u0231\u0003Z-\u0003\u0230\u0229\u0001\u0000\u0000\u0000"+
		"\u0230\u022d\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000"+
		"\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000"+
		"\u0233[\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235"+
		"\u023e\u0003j5\u0000\u0236\u023e\u0003`0\u0000\u0237\u023e\u0003d2\u0000"+
		"\u0238\u0239\u0005\u0015\u0000\u0000\u0239\u023a\u0003Z-\u0000\u023a\u023b"+
		"\u0005\u0016\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023e"+
		"\u0003^/\u0000\u023d\u0235\u0001\u0000\u0000\u0000\u023d\u0236\u0001\u0000"+
		"\u0000\u0000\u023d\u0237\u0001\u0000\u0000\u0000\u023d\u0238\u0001\u0000"+
		"\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e]\u0001\u0000\u0000"+
		"\u0000\u023f\u0244\u0005@\u0000\u0000\u0240\u0241\u0005\"\u0000\u0000"+
		"\u0241\u0243\u0005@\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0243"+
		"\u0246\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0001\u0000\u0000\u0000\u0245_\u0001\u0000\u0000\u0000\u0246\u0244"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0005@\u0000\u0000\u0248\u024a\u0005"+
		"\u0015\u0000\u0000\u0249\u024b\u0003b1\u0000\u024a\u0249\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000"+
		"\u0000\u024c\u024d\u0005\u0016\u0000\u0000\u024da\u0001\u0000\u0000\u0000"+
		"\u024e\u0253\u0003Z-\u0000\u024f\u0250\u0005!\u0000\u0000\u0250\u0252"+
		"\u0003Z-\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000"+
		"\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000"+
		"\u0000\u0000\u0254c\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0005@\u0000\u0000\u0257\u0258\u0005[\u0000\u0000\u0258"+
		"\u0259\u0003Z-\u0000\u0259e\u0001\u0000\u0000\u0000\u025a\u026a\u0005"+
		"L\u0000\u0000\u025b\u026a\u0005M\u0000\u0000\u025c\u026a\u0005N\u0000"+
		"\u0000\u025d\u026a\u0005O\u0000\u0000\u025e\u026a\u0005P\u0000\u0000\u025f"+
		"\u026a\u0005Q\u0000\u0000\u0260\u0261\u0005Z\u0000\u0000\u0261\u026a\u0005"+
		"R\u0000\u0000\u0262\u026a\u0005R\u0000\u0000\u0263\u0264\u0005\t\u0000"+
		"\u0000\u0264\u026a\u0005Z\u0000\u0000\u0265\u026a\u0005\t\u0000\u0000"+
		"\u0266\u026a\u0005T\u0000\u0000\u0267\u026a\u0005U\u0000\u0000\u0268\u026a"+
		"\u0005V\u0000\u0000\u0269\u025a\u0001\u0000\u0000\u0000\u0269\u025b\u0001"+
		"\u0000\u0000\u0000\u0269\u025c\u0001\u0000\u0000\u0000\u0269\u025d\u0001"+
		"\u0000\u0000\u0000\u0269\u025e\u0001\u0000\u0000\u0000\u0269\u025f\u0001"+
		"\u0000\u0000\u0000\u0269\u0260\u0001\u0000\u0000\u0000\u0269\u0262\u0001"+
		"\u0000\u0000\u0000\u0269\u0263\u0001\u0000\u0000\u0000\u0269\u0265\u0001"+
		"\u0000\u0000\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u0269\u0267\u0001"+
		"\u0000\u0000\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u026ag\u0001\u0000"+
		"\u0000\u0000\u026b\u026c\u0005Z\u0000\u0000\u026ci\u0001\u0000\u0000\u0000"+
		"\u026d\u0273\u0005<\u0000\u0000\u026e\u0273\u0003>\u001f\u0000\u026f\u0273"+
		"\u0003@ \u0000\u0270\u0273\u00058\u0000\u0000\u0271\u0273\u00054\u0000"+
		"\u0000\u0272\u026d\u0001\u0000\u0000\u0000\u0272\u026e\u0001\u0000\u0000"+
		"\u0000\u0272\u026f\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000"+
		"\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273k\u0001\u0000\u0000\u0000"+
		"Zosv|\u0081\u0084\u0089\u0093\u0098\u009d\u00a4\u00a9\u00ac\u00b0\u00b6"+
		"\u00ba\u00be\u00c1\u00c7\u00cb\u00ce\u00d1\u00d4\u00d7\u00d9\u00dc\u00df"+
		"\u00e6\u00eb\u00ef\u00ff\u0102\u0108\u0110\u0114\u0119\u011e\u0123\u0128"+
		"\u012d\u0132\u0135\u013a\u013d\u0142\u0147\u014a\u0150\u0155\u015d\u0161"+
		"\u0166\u0169\u016f\u0171\u0174\u0177\u017c\u017f\u0190\u0199\u019d\u01a0"+
		"\u01a3\u01a7\u01ac\u01b3\u01b5\u01b9\u01bf\u01ca\u01d8\u01dd\u01e3\u01ec"+
		"\u01f4\u01f9\u0201\u0216\u021a\u021e\u0227\u0230\u0232\u023d\u0244\u024a"+
		"\u0253\u0269\u0272";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}