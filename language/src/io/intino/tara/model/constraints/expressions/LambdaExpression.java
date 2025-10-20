package io.intino.tara.model.constraints.expressions;

import io.intino.tara.model.constraints.context.EvaluationContext;

public class LambdaExpression implements Expression {
	private static final long serialVersionUID = 1L;
	private final String literal;
	protected Expression expression;

	public LambdaExpression(String literal, Expression expression) {
		this.literal = literal;
		this.expression = expression;
	}

	public int getNumArguments() {
		return 1;
	}

	public String literal() {
		return literal;
	}

	public Expression argument() {
		return expression;
	}

	public Object evaluate(EvaluationContext context) throws Exception {
		return expression.evaluate(context);
	}

	@Override
	public String toString() {
		return literal + " -> " + expression.toString();
	}
}
