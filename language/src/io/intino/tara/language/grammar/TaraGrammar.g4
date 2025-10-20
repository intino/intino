parser grammar TaraGrammar;
options { tokenVocab=TaraLexer; }

root: NEWLINE* dslDeclaration? imports? (mogramOrConstraint (NEWLINE+ mogramOrConstraint)*)? (NEWLINE* EOF);

dslDeclaration : DSL headerReference NEWLINE*;

mogramOrConstraint: constraintDef | mogram;
imports : anImport+;
anImport: USE headerReference NEWLINE+;

doc: DOC+;

mogram: doc? signature body?;

signature: (((SUB | FACET) mogramConstraint* signatureProperties? IDENTIFIER parent? facets?) |
			(metaidentifier mogramConstraint* signatureProperties? IDENTIFIER? (facets?| facetTarget) parent?)) with? annotations?;

body: NEW_LINE_INDENT ((property | mogram | propertyDescriptive | mogramReference) NEWLINE+)+ DEDENT;

facetTarget : ON identifierReference;
parent : EXTENDS identifierReference;

signatureProperties : LEFT_PARENTHESIS (signatureProperty (COMMA signatureProperty)*)? RIGHT_PARENTHESIS;
signatureProperty: (IDENTIFIER EQUALS)? value;

facets : IS facet+;
facet: metaidentifier signatureProperties?;

value : identifierReference+
		| stringValue+
		| tupleValue+
		| booleanValue+
		| identifierReference+
		| integerValue+ measureUnit?
		| doubleValue+ measureUnit?
		| expression+
		| methodReference+
		| EMPTY;
mogramReference : HAS mogramConstraint* identifierReference annotations?;
with: WITH identifierReference (COMMA identifierReference)*;
property : doc? DEF propertyType size? mogramConstraint? IDENTIFIER (EQUALS value measureUnit?)? annotations? bodyValue?;

bodyValue : NEW_LINE_INDENT (stringValue | expression) NEWLINE? DEDENT;

propertyType: INT_TYPE
			| LONG_TYPE
            | DOUBLE_TYPE
            | BOOLEAN_TYPE
            | STRING_TYPE
            | FUNCTION_TYPE
            | OBJECT_TYPE
            | WORD
            | DATE_TYPE
            | INSTANT_TYPE
            | TIME_TYPE
            | RESOURCE
            | identifierReference;

mogramConstraint : COLON ruleValue;

ruleValue    : (LEFT_CURLY (IDENTIFIER+ | ((range | stringValue) measureUnit?) | measureUnit) RIGHT_CURLY) | (identifierReference);

range        : (doubleValue | integerValue | STAR) (DOT DOT (doubleValue | integerValue | STAR))?;

size		 : LEFT_SQUARE sizeRange? RIGHT_SQUARE;
sizeRange 	 : NATURAL_VALUE | listRange;
listRange    : (NATURAL_VALUE | STAR) DOT DOT (NATURAL_VALUE | STAR);


methodReference : AT identifierReference;

stringValue  : NEWLINE? (STRING);
booleanValue : BOOLEAN_VALUE;
tupleValue   : stringValue COLON doubleValue;
integerValue : NATURAL_VALUE | NEGATIVE_VALUE;
doubleValue  : (NATURAL_VALUE | NEGATIVE_VALUE | DOUBLE_VALUE) SCIENCE_NOT?;

measureUnit  : IDENTIFIER | MEASURE_VALUE;

expression   : NEWLINE? (EXPRESSION_BEGIN CHARACTER* EXPRESSION_END);

annotations: AS annotation+;
annotation: GENERALIZATION | COMPONENT | PRIVATE | FEATURE | FINAL | REACTIVE | DECORABLE | REQUIRED;

propertyDescriptive : IDENTIFIER ((EQUALS value) | bodyValue);

headerReference: hierarchy* identifierKey;

identifierReference: hierarchy* identifierKey;
identifierKey : IDENTIFIER;
hierarchy: identifierKey (DOT | PLUS);
metaidentifier: IDENTIFIER;

constraintDef: CONSTRAINT IDENTIFIER CONSTRAINT_START constraint ((NEW_LINE_INDENT description NEWLINE+) DEDENT)?;

description : (IDENTIFIER EQUALS)? STRING;

constraint
    : unaryOp constraint                           	#unaryExpr
    | constraint binaryComp constraint             	#comparisonExpr
    | constraint (OR|AND) constraint				#booleanExpr
    | primary                                   	#primaryExpr
    ;

primary
    : literal                                       #literalExpr
    | functionCall                                  #functionExpr
    | lambdaExpr                                    #lambdaExprExpr
    | LEFT_PARENTHESIS constraint RIGHT_PARENTHESIS #groupedExpr
    | propertyName                             		#variableExpr
    ;

propertyName: IDENTIFIER (DOT IDENTIFIER)*;

functionCall
    : IDENTIFIER LEFT_PARENTHESIS argumentList? RIGHT_PARENTHESIS
    ;

argumentList: constraint (COMMA constraint)*;

lambdaExpr: IDENTIFIER LAMBDA constraint;

binaryComp
    : COMPARER_EQUALS
    | NOT_EQUALS
    | GREATER_EQUALS
    | LESS_EQUALS
    | GREATER
    | LESS
    | NOT IN
    | IN
    | IS NOT
    | IS
    | LIKE
    | MATCHES
    | STARTS_WITH
    ;

unaryOp: NOT;

literal
    : STRING
    | integerValue
    | doubleValue
    | BOOLEAN_VALUE
    | EMPTY
    ;