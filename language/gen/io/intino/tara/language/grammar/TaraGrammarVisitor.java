// Generated from /Users/oroncal/workspace/infrastructure/tara/language/src/io/intino/tara/language/grammar/TaraGrammar.g4 by ANTLR 4.13.2
package io.intino.tara.language.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TaraGrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TaraGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(TaraGrammar.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#dslDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDslDeclaration(TaraGrammar.DslDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#mogramOrConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMogramOrConstraint(TaraGrammar.MogramOrConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(TaraGrammar.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#anImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnImport(TaraGrammar.AnImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(TaraGrammar.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#mogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMogram(TaraGrammar.MogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(TaraGrammar.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(TaraGrammar.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#facetTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacetTarget(TaraGrammar.FacetTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(TaraGrammar.ParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#signatureProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureProperties(TaraGrammar.SignaturePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#signatureProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureProperty(TaraGrammar.SignaturePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#facets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacets(TaraGrammar.FacetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#facet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacet(TaraGrammar.FacetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TaraGrammar.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#mogramReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMogramReference(TaraGrammar.MogramReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith(TaraGrammar.WithContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(TaraGrammar.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#bodyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyValue(TaraGrammar.BodyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#propertyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyType(TaraGrammar.PropertyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#mogramConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMogramConstraint(TaraGrammar.MogramConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#ruleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleValue(TaraGrammar.RuleValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(TaraGrammar.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(TaraGrammar.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#sizeRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeRange(TaraGrammar.SizeRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#listRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRange(TaraGrammar.ListRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(TaraGrammar.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#stringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(TaraGrammar.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(TaraGrammar.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#tupleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleValue(TaraGrammar.TupleValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#integerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerValue(TaraGrammar.IntegerValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#doubleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleValue(TaraGrammar.DoubleValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#measureUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasureUnit(TaraGrammar.MeasureUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TaraGrammar.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(TaraGrammar.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(TaraGrammar.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#propertyDescriptive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDescriptive(TaraGrammar.PropertyDescriptiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#headerReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderReference(TaraGrammar.HeaderReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#identifierReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierReference(TaraGrammar.IdentifierReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#identifierKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKey(TaraGrammar.IdentifierKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#hierarchy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchy(TaraGrammar.HierarchyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#metaidentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaidentifier(TaraGrammar.MetaidentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#constraintDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintDef(TaraGrammar.ConstraintDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(TaraGrammar.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(TaraGrammar.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(TaraGrammar.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(TaraGrammar.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link TaraGrammar#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(TaraGrammar.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(TaraGrammar.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(TaraGrammar.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaExprExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExprExpr(TaraGrammar.LambdaExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupedExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedExpr(TaraGrammar.GroupedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link TaraGrammar#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(TaraGrammar.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(TaraGrammar.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TaraGrammar.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(TaraGrammar.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#lambdaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(TaraGrammar.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#binaryComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComp(TaraGrammar.BinaryCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(TaraGrammar.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaraGrammar#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TaraGrammar.LiteralContext ctx);
}