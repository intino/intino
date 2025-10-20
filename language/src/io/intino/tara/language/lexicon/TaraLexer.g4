lexer grammar TaraLexer;
@header{
import static io.intino.tara.language.grammar.TaraGrammar.CHARACTER;
import io.intino.tara.processors.parser.antlr.BlockManager;
}
@lexer::members {
BlockManager blockManager = new BlockManager();
private static java.util.Queue<Token> queue = new java.util.LinkedList<>();

@Override
public void reset() {
	super.reset();
	queue.clear();
	blockManager.reset();
}

@Override
public void emit(Token token) {
	if (token.getType() == EOF) eof();
	queue.offer(token);
	setToken(token);
}

@Override
public Token nextToken() {
	super.nextToken();
	return queue.isEmpty() ? emitEOF() : queue.poll();
}

private void emitToken(int ttype) {
	setType(ttype);
	emit();
}

private boolean isWhiteLineOrEOF() {
	int character = _input.LA(1);
	return (character == -1 || (char) character == '\n');
}

private void newlinesAndSpaces() {
	blockManager.newlineAndSpaces(getTextSpaces(getText()));
	sendTokens();
}

private String getTextSpaces(String text) {
	int index = (text.indexOf(' ') == -1)? text.indexOf('\t') : text.indexOf(' ');
	return (index == -1)? "" : text.substring(index);
}

private void inline() {
	blockManager.openBracket(getText().length());
	sendTokens();
}

private void semicolon() {
	blockManager.semicolon(getText().length());
	sendTokens();
}

private void eof() {
	blockManager.eof();
	sendTokens();
}

private void sendTokens() {
	for (BlockManager.Token token : blockManager.actions())
		emitToken(translate(token));
}

private int translate(BlockManager.Token token) {
	if (token.toString().equals("NEWLINE")) return NEWLINE;
	if (token.toString().equals("DEDENT")) return DEDENT;
	if (token.toString().equals("NEWLINE_INDENT")) return NEW_LINE_INDENT;
	return UNKNOWN_TOKEN;
}
}

SUB                 : 'sub';
USE                 : 'use';
DSL                 : 'dsl';
DEF                 : 'def';
FACET               : 'facet';
HAS                 : 'has';
AS                  : 'as';
ON                  : 'on';
IS                  : 'is';
WITH                : 'with';
EXTENDS             : 'extends';
CONSTRAINT			: 'constraint';
//mogram annotations
GENERALIZATION      : 'generalization';
COMPONENT           : 'component';
FEATURE             : 'feature';
REQUIRED            : 'required';
//property annotations
FINAL               : 'final';
PRIVATE             : 'private';
REACTIVE            : 'reactive';
DECORABLE           : 'decorable';

LEFT_PARENTHESIS    : '(';
RIGHT_PARENTHESIS   : ')';
LEFT_SQUARE         : '[';
RIGHT_SQUARE        : ']';
LEFT_CURLY          : '{';
RIGHT_CURLY         : '}';
INLINE              : '>'       { inline(); };
CLOSE_INLINE        : '<';
AT			        : '@';

HASHTAG             : '#';
CONSTRAINT_START    : '::' -> mode(CONSTRAINT_MODE);
COLON               : ':';
COMMA               : ',';
DOT                 : '.';
EQUALS              : '=';
STAR                : '*';
LIST                : '...';

SEMICOLON           : ';'+      { semicolon(); };
PLUS                : '+';
WORD                : 'word';
RESOURCE            : 'resource';
INT_TYPE            : 'integer';
FUNCTION_TYPE       : 'function';
OBJECT_TYPE         : 'object';
DOUBLE_TYPE         : 'double';
LONG_TYPE         	: 'long';
STRING_TYPE         : 'string';
BOOLEAN_TYPE        : 'boolean';
DATE_TYPE           : 'date';
INSTANT_TYPE        : 'instant';
TIME_TYPE           : 'time';
EMPTY               : 'empty';

BLOCK_COMMENT       : '/*' .*? '*/' -> skip;
LINE_COMMENT        : ('\r' | '\n')* ([ ] | [\t])* '//'  ~('\r' | '\n')* -> skip;
SCIENCE_NOT         : 'E' (PLUS | DASH)? DIGIT+;
BOOLEAN_VALUE       : 'true' | 'false';
NATURAL_VALUE       : PLUS? DIGIT+;
NEGATIVE_VALUE      : DASH DIGIT+;
DOUBLE_VALUE        : (PLUS | DASH)? DIGIT+ DOT DIGIT+;

STRING         		: '"' (~('"' | '\\') | '\\' ('"' | '\\'))* '"';
STRING_MULTILINE    : '"""' ( . | '\r' | '\n' )*? '"""'  {setType(STRING);};

SINGLE_QUOTE        : '\'' {setType(EXPRESSION_BEGIN);} -> mode(EXPRESSION_QUOTED);
EXPRESSION_MULTILINE: DASH DASH+  {setType(EXPRESSION_BEGIN);} -> mode(EXPRESSION_MULTILINE_MODE);
IDENTIFIER          : (LETTER | UNDERDASH) (DIGIT | LETTER | DASH LETTER | UNDERDASH)*;

MEASURE_VALUE       : (LETTER | PERCENTAGE | DOLLAR | EURO | GRADE) (UNDERDASH | BY | DIVIDED_BY | PERCENTAGE | DOLLAR | EURO | GRADE | LETTER | DIGIT)*;

NEWLINE: NL+ SP*    { newlinesAndSpaces(); };
SPACES: SP+ EOF? 	-> channel(HIDDEN);
DOC : '!!' .*? NEWLINE {emitToken(DOC);};

SP: (' ' | '\t');
NL: (('\r'? '\n') | '\r');

NEW_LINE_INDENT: 'indent';
DEDENT         : 'dedent';

UNKNOWN_TOKEN: . ;

mode EXPRESSION_MULTILINE_MODE;
	ME_STRING_MULTILINE: DASH DASH+     {   setType(EXPRESSION_END); } -> mode(DEFAULT_MODE);
	ME_CHARACTER:.                      {   setType(CHARACTER); };

mode CONSTRAINT_MODE;
	COMPARER_EQUALS: '==';
	NOT_EQUALS: '!=';
	GREATER_EQUALS: '>=';
	LESS_EQUALS: '<=';
	GREATER: '>';
	LESS: '<';
	IN : 'in';
	C_IS: 'is'{setType(IS);};
	LIKE: 'like';
	MATCHES: 'matches';
	STARTS_WITH: 'starts with';
	C_EMPTY: 'empty' {setType(EMPTY);};
	AND: 'and';
	OR: 'or';
	NOT: 'not';

	LAMBDA				: '->';
	L_PARENTHESIS   	: '(' {setType(LEFT_PARENTHESIS);};
	R_PARENTHESIS   	: ')' {setType(RIGHT_PARENTHESIS);};
	STRING_VALUE   		: '"' (~('"' | '\\') | '\\' ('"' | '\\'))* '"'{setType(STRING);};
	C_COMMA             : ','  {setType(COMMA);};
    C_DOT               : '.'{setType(DOT);};

	TRUE_BOOLEAN_VALUE     : 'true' {setType(BOOLEAN_VALUE);};
	FALSE_BOOLEAN_VALUE    : 'false' {setType(BOOLEAN_VALUE);};
    C_NATURAL_VALUE     : PLUS? DIGIT+ {setType(NATURAL_VALUE);};
    C_NEGATIVE_VALUE    : DASH DIGIT+ {setType(NEGATIVE_VALUE);};
    C_DOUBLE_VALUE      : (PLUS | DASH)? DIGIT+ DOT DIGIT+ {setType(DOUBLE_VALUE);};
	ID          		: (LETTER | UNDERDASH) (DIGIT | LETTER | DASH LETTER | UNDERDASH)* {setType(IDENTIFIER);};
	C_SPACES: SP+ EOF? 	 {setType(SPACES);}-> channel(HIDDEN);
	C_NEWLINE: NL+ SP*   { newlinesAndSpaces();} -> mode(DEFAULT_MODE);

mode EXPRESSION_QUOTED;
	E_QUOTE:'\''                        {   setType(EXPRESSION_END); } -> mode(DEFAULT_MODE);
    E_SLASH_Q:'\\\''                    {   setType(CHARACTER); };
    E_SLASH:'\\'                        {   setType(CHARACTER); };
    E_CHARACTER:.                       {   setType(CHARACTER); };

QUOTE_BEGIN        : '%QUOTE_BEGIN%';
QUOTE_END          : '%QUOTE_END%';
EXPRESSION_BEGIN   : '%EXPRESSION_BEGIN%';
EXPRESSION_END     : '%EXPRESSION_END%';

fragment DOLLAR              : '$';
fragment EURO                : '€';
fragment PERCENTAGE          : '%';
fragment GRADE               : 'º'| '°';
fragment BY                  : '·';
fragment DIVIDED_BY          : '/';
fragment DASH                : '-';

fragment UNDERDASH           : '_';
fragment DIGIT               : [0-9];
fragment LETTER              : 'a'..'z' | 'A'..'Z' | 'ñ' | 'Ñ' | 'á'| 'é'| 'í' | 'ó' | 'ú' | 'Á'| 'É' | 'Í' | 'Ó' | 'Ú';