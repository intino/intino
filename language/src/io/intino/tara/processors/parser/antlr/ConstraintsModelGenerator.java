package io.intino.tara.processors.parser.antlr;

import io.intino.tara.Source;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.grammar.TaraGrammar;
import io.intino.tara.language.grammar.TaraGrammar.*;
import io.intino.tara.model.Element.TextRange;
import io.intino.tara.model.constraints.Constraint;
import io.intino.tara.model.constraints.expressions.*;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression.InvalidFunctionException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static io.intino.tara.model.constraints.expressions.ComparisonExpression.*;
import static io.intino.tara.model.constraints.expressions.LogicExpression.createAND;
import static io.intino.tara.model.constraints.expressions.LogicExpression.createOR;
import static io.intino.tara.model.constraints.expressions.UnaryExpression.createNOT;


public class ConstraintsModelGenerator {
	private final Source source;
	private final TaraGrammar.RootContext root;
	private final List<SyntaxException> errors = new ArrayList<>();
	private Constraint current = null;

	public ConstraintsModelGenerator(Source source, TaraGrammar.RootContext root) {
		this.source = source;
		this.root = root;
	}

	public List<SyntaxException> errors() {
		return errors;
	}

	public List<Constraint> walk() {
		return root.mogramOrConstraint().stream()
				.map(c -> c.constraintDef())
				.filter(Objects::nonNull)
				.map(this::constraintOf).toList();
	}

	private Constraint constraintOf(ConstraintDefContext ctx) {
		String message = ctx.description() == null || ctx.description().STRING() == null ? "" : withoutQuotes(ctx.description().STRING().getText());
		this.current = new Constraint(source.uri(), ctx.IDENTIFIER().getText(), message, textRange(ctx));
		expression(ctx);
		return current;
	}

	private void expression(ConstraintDefContext ctx) {
		try {
			Expression expression = build(ctx.constraint());
			current.expression(expression);
		} catch (InvalidExpression | InvalidFunctionException e) {
			TextRange textRange = textRange(ctx);
			this.errors.add(new SyntaxException(e.getMessage(), e, source.uri(), textRange.startLine(), textRange.startColumn()));
		} catch (SyntaxException e) {
			this.errors.add(e);
		}
	}

	private Expression build(ConstraintContext expression) throws SyntaxException, InvalidFunctionException, InvalidExpression {
		TextRange textRange = textRange(expression);
		return switch (expression) {
			case TaraGrammar.BooleanExprContext and -> buildLogical(and, textRange);
			case ComparisonExprContext comparison -> buildComparison(comparison, textRange);
			case PrimaryExprContext cons -> buildPrimary(cons.primary(), textRange);
			case UnaryExprContext unary -> buildUnary(unary, textRange);
			default -> null;
		};
	}

	private Expression buildUnary(UnaryExprContext unary, TextRange textRange) throws SyntaxException, InvalidFunctionException, InvalidExpression {
		ConstraintContext expression = unary.constraint();
		if (!(expression instanceof BooleanExprContext) &&
				!(expression instanceof ComparisonExprContext) &&
				!((expression instanceof PrimaryExprContext pr) && pr.primary() instanceof GroupedExprContext))
			throw error("Only can be negated boolean expressions", textRange);
		if ((expression instanceof PrimaryExprContext pr) && pr.primary() instanceof GroupedExprContext)
			expression = ((GroupedExprContext) pr.primary()).constraint();
		return unary.unaryOp() != null ? createNOT((BooleanExpression) build(expression)) : build(expression);
	}

	private Expression buildProperty(PropertyNameContext prop, TextRange textRange) {
		return new PropertyExpression(prop.IDENTIFIER().stream().map(ParseTree::getText).collect(Collectors.joining(".")));
	}

	private Expression buildPrimary(PrimaryContext primary, TextRange textRange) throws SyntaxException, InvalidFunctionException, InvalidExpression {
		return switch (primary) {
			case VariableExprContext variable -> buildProperty(variable.propertyName(), textRange);
			case GroupedExprContext expr -> build(expr.constraint());
			case LiteralExprContext expr -> build(expr.literal());
			case FunctionExprContext expr -> build(expr.functionCall());
			case LambdaExprExprContext expr -> build(expr.lambdaExpr());
			default -> null;
		};
	}

	private Expression build(FunctionCallContext ctx) throws SyntaxException, InvalidFunctionException, InvalidExpression {
		List<Expression> arguments = new ArrayList<>();
		if (ctx.argumentList() != null)
			for (ConstraintContext e : ctx.argumentList().constraint()) arguments.add(build(e));
		return new FunctionCallExpression(ctx.IDENTIFIER().getText(), arguments);
	}

	private Expression build(LambdaExprContext ctx) throws InvalidFunctionException, SyntaxException, InvalidExpression {
		return new LambdaExpression(ctx.IDENTIFIER().getText(), build(ctx.constraint()));
	}

	private Expression build(LiteralContext ctx) {
		if (ctx.EMPTY() != null) return ConstantExpression.EMTPY;
		if (ctx.BOOLEAN_VALUE() != null)
			return new ConstantExpression(Boolean.parseBoolean(ctx.BOOLEAN_VALUE().getText()));
		if (ctx.doubleValue() != null)
			return new ConstantExpression(Double.parseDouble(ctx.doubleValue().getText()));
		if (ctx.integerValue() != null)
			return new ConstantExpression(Integer.parseInt(ctx.integerValue().getText()));
		else {
			String text = ctx.STRING().getText();
			return new ConstantExpression(text.substring(1, text.length() - 1));
		}
	}

	private Expression buildComparison(ComparisonExprContext comparison, TextRange textRange) throws SyntaxException, InvalidFunctionException, InvalidExpression {
		Expression left = build(comparison.constraint(0));
		Expression right = build(comparison.constraint(1));
		BinaryCompContext operator = comparison.binaryComp();
		boolean negated = operator.NOT() != null;
		if (operator.IN() != null) return createInFilter(left, right, negated);
		else if (operator.COMPARER_EQUALS() != null) return createEqual(left, right, negated);
		else if (operator.NOT_EQUALS() != null) return createNOT(createEqual(left, right, negated));
		else if (operator.LESS() != null) return createLessThan(left, right);
		else if (operator.LESS_EQUALS() != null) return createLessThanEqual(left, right);
		else if (operator.GREATER() != null) return createGreaterThan(left, right);
		else if (operator.GREATER_EQUALS() != null) return createGreaterThanEqual(left, right);
		else if (operator.IS() != null) {
			if (!(right instanceof ConstantExpression || right instanceof PropertyExpression))
				throw error("After 'is' must be a type of mogram or empty", textRange);
			return createIs(left, right, negated);
		} else if (operator.MATCHES() != null)
			return createMatch(left, ((ConstantExpression) right), "\"", negated);
		else if (operator.LIKE() != null)
			return createLike(left, ((ConstantExpression) right).getValue().toString(), "\"", negated);
		else if (operator.STARTS_WITH() != null)
			return createStartsWith(left, ((ConstantExpression) right).getValue().toString(), "\"", negated);
		throw error("Error building comparison expression. Operator not found: " + operator.getText(), textRange);
	}

	private BooleanExpression buildLogical(BooleanExprContext expr, TextRange textRange) throws SyntaxException, InvalidFunctionException, InvalidExpression {
		Expression left = build(expr.constraint(0));
		Expression right = build(expr.constraint(1));
		if (!(left instanceof BooleanExpression) || !(right instanceof BooleanExpression))
			throw expectedOperandType(textRange);
		if (expr.OR() != null) return createOR((BooleanExpression) left, (BooleanExpression) right);
		else return createAND((BooleanExpression) left, (BooleanExpression) right);
	}

	private SyntaxException error(String message, TextRange textRange) {
		return new SyntaxException(message, source.uri(), textRange.startLine(), textRange.startColumn());
	}

	private SyntaxException expectedOperandType(TextRange textRange) {
		return new SyntaxException("Logical expressions require boolean operands", source.uri(), textRange.startLine(), textRange.startColumn());
	}

	private TextRange textRange(ParserRuleContext ctx) {
		int startIndex = ctx.getStart().getStartIndex();
		int endIndex = ctx.getParent().getStop().getStopIndex() + 1;
		int endLine = ctx.getParent().getStop().getLine();
		int endColumn = ctx.getParent().getStop().getCharPositionInLine();
		return new TextRange(startIndex, endIndex, ctx.getStart().getLine(), firstLineLength(ctx), ctx.getStart().getCharPositionInLine(), endLine, endColumn);
	}

	private static int firstLineLength(ParserRuleContext ctx) {
		return ctx.getStop().getCharPositionInLine() + ctx.getStop().getText().length();
	}

	private String withoutQuotes(String text) {
		return text.substring(1, text.length() - 1);
	}
}
