// Generated from /Users/oroncal/workspace/infrastructure/tara/language/src/io/intino/tara/language/grammar/TaraGrammar.g4 by ANTLR 4.13.2
package io.intino.tara.language.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaraGrammar}.
 */
public interface TaraGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(TaraGrammar.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(TaraGrammar.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#dslDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDslDeclaration(TaraGrammar.DslDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#dslDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDslDeclaration(TaraGrammar.DslDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#mogramOrConstraint}.
	 * @param ctx the parse tree
	 */
	void enterMogramOrConstraint(TaraGrammar.MogramOrConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#mogramOrConstraint}.
	 * @param ctx the parse tree
	 */
	void exitMogramOrConstraint(TaraGrammar.MogramOrConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(TaraGrammar.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(TaraGrammar.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#anImport}.
	 * @param ctx the parse tree
	 */
	void enterAnImport(TaraGrammar.AnImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#anImport}.
	 * @param ctx the parse tree
	 */
	void exitAnImport(TaraGrammar.AnImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(TaraGrammar.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(TaraGrammar.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#mogram}.
	 * @param ctx the parse tree
	 */
	void enterMogram(TaraGrammar.MogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#mogram}.
	 * @param ctx the parse tree
	 */
	void exitMogram(TaraGrammar.MogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(TaraGrammar.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(TaraGrammar.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TaraGrammar.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TaraGrammar.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#facetTarget}.
	 * @param ctx the parse tree
	 */
	void enterFacetTarget(TaraGrammar.FacetTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#facetTarget}.
	 * @param ctx the parse tree
	 */
	void exitFacetTarget(TaraGrammar.FacetTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(TaraGrammar.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(TaraGrammar.ParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#signatureProperties}.
	 * @param ctx the parse tree
	 */
	void enterSignatureProperties(TaraGrammar.SignaturePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#signatureProperties}.
	 * @param ctx the parse tree
	 */
	void exitSignatureProperties(TaraGrammar.SignaturePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#signatureProperty}.
	 * @param ctx the parse tree
	 */
	void enterSignatureProperty(TaraGrammar.SignaturePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#signatureProperty}.
	 * @param ctx the parse tree
	 */
	void exitSignatureProperty(TaraGrammar.SignaturePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#facets}.
	 * @param ctx the parse tree
	 */
	void enterFacets(TaraGrammar.FacetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#facets}.
	 * @param ctx the parse tree
	 */
	void exitFacets(TaraGrammar.FacetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#facet}.
	 * @param ctx the parse tree
	 */
	void enterFacet(TaraGrammar.FacetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#facet}.
	 * @param ctx the parse tree
	 */
	void exitFacet(TaraGrammar.FacetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TaraGrammar.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TaraGrammar.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#mogramReference}.
	 * @param ctx the parse tree
	 */
	void enterMogramReference(TaraGrammar.MogramReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#mogramReference}.
	 * @param ctx the parse tree
	 */
	void exitMogramReference(TaraGrammar.MogramReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#with}.
	 * @param ctx the parse tree
	 */
	void enterWith(TaraGrammar.WithContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#with}.
	 * @param ctx the parse tree
	 */
	void exitWith(TaraGrammar.WithContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(TaraGrammar.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(TaraGrammar.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#bodyValue}.
	 * @param ctx the parse tree
	 */
	void enterBodyValue(TaraGrammar.BodyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#bodyValue}.
	 * @param ctx the parse tree
	 */
	void exitBodyValue(TaraGrammar.BodyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#propertyType}.
	 * @param ctx the parse tree
	 */
	void enterPropertyType(TaraGrammar.PropertyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#propertyType}.
	 * @param ctx the parse tree
	 */
	void exitPropertyType(TaraGrammar.PropertyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#mogramConstraint}.
	 * @param ctx the parse tree
	 */
	void enterMogramConstraint(TaraGrammar.MogramConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#mogramConstraint}.
	 * @param ctx the parse tree
	 */
	void exitMogramConstraint(TaraGrammar.MogramConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#ruleValue}.
	 * @param ctx the parse tree
	 */
	void enterRuleValue(TaraGrammar.RuleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#ruleValue}.
	 * @param ctx the parse tree
	 */
	void exitRuleValue(TaraGrammar.RuleValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(TaraGrammar.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(TaraGrammar.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(TaraGrammar.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(TaraGrammar.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#sizeRange}.
	 * @param ctx the parse tree
	 */
	void enterSizeRange(TaraGrammar.SizeRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#sizeRange}.
	 * @param ctx the parse tree
	 */
	void exitSizeRange(TaraGrammar.SizeRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#listRange}.
	 * @param ctx the parse tree
	 */
	void enterListRange(TaraGrammar.ListRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#listRange}.
	 * @param ctx the parse tree
	 */
	void exitListRange(TaraGrammar.ListRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(TaraGrammar.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(TaraGrammar.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(TaraGrammar.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(TaraGrammar.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(TaraGrammar.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(TaraGrammar.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#tupleValue}.
	 * @param ctx the parse tree
	 */
	void enterTupleValue(TaraGrammar.TupleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#tupleValue}.
	 * @param ctx the parse tree
	 */
	void exitTupleValue(TaraGrammar.TupleValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#integerValue}.
	 * @param ctx the parse tree
	 */
	void enterIntegerValue(TaraGrammar.IntegerValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#integerValue}.
	 * @param ctx the parse tree
	 */
	void exitIntegerValue(TaraGrammar.IntegerValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#doubleValue}.
	 * @param ctx the parse tree
	 */
	void enterDoubleValue(TaraGrammar.DoubleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#doubleValue}.
	 * @param ctx the parse tree
	 */
	void exitDoubleValue(TaraGrammar.DoubleValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#measureUnit}.
	 * @param ctx the parse tree
	 */
	void enterMeasureUnit(TaraGrammar.MeasureUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#measureUnit}.
	 * @param ctx the parse tree
	 */
	void exitMeasureUnit(TaraGrammar.MeasureUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TaraGrammar.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TaraGrammar.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(TaraGrammar.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(TaraGrammar.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(TaraGrammar.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(TaraGrammar.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#propertyDescriptive}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDescriptive(TaraGrammar.PropertyDescriptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#propertyDescriptive}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDescriptive(TaraGrammar.PropertyDescriptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#headerReference}.
	 * @param ctx the parse tree
	 */
	void enterHeaderReference(TaraGrammar.HeaderReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#headerReference}.
	 * @param ctx the parse tree
	 */
	void exitHeaderReference(TaraGrammar.HeaderReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#identifierReference}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierReference(TaraGrammar.IdentifierReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#identifierReference}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierReference(TaraGrammar.IdentifierReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#identifierKey}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKey(TaraGrammar.IdentifierKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#identifierKey}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKey(TaraGrammar.IdentifierKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#hierarchy}.
	 * @param ctx the parse tree
	 */
	void enterHierarchy(TaraGrammar.HierarchyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#hierarchy}.
	 * @param ctx the parse tree
	 */
	void exitHierarchy(TaraGrammar.HierarchyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#metaidentifier}.
	 * @param ctx the parse tree
	 */
	void enterMetaidentifier(TaraGrammar.MetaidentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#metaidentifier}.
	 * @param ctx the parse tree
	 */
	void exitMetaidentifier(TaraGrammar.MetaidentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#constraintDef}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDef(TaraGrammar.ConstraintDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#constraintDef}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDef(TaraGrammar.ConstraintDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(TaraGrammar.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(TaraGrammar.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(TaraGrammar.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(TaraGrammar.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(TaraGrammar.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(TaraGrammar.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(TaraGrammar.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(TaraGrammar.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(TaraGrammar.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(TaraGrammar.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(TaraGrammar.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(TaraGrammar.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(TaraGrammar.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(TaraGrammar.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaExprExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExprExpr(TaraGrammar.LambdaExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaExprExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExprExpr(TaraGrammar.LambdaExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupedExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void enterGroupedExpr(TaraGrammar.GroupedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupedExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void exitGroupedExpr(TaraGrammar.GroupedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(TaraGrammar.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(TaraGrammar.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(TaraGrammar.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(TaraGrammar.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TaraGrammar.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TaraGrammar.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(TaraGrammar.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(TaraGrammar.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#lambdaExpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(TaraGrammar.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#lambdaExpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(TaraGrammar.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#binaryComp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComp(TaraGrammar.BinaryCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#binaryComp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComp(TaraGrammar.BinaryCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(TaraGrammar.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(TaraGrammar.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaraGrammar#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TaraGrammar.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaraGrammar#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TaraGrammar.LiteralContext ctx);
}