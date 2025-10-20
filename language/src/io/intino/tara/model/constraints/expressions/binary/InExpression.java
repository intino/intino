package io.intino.tara.model.constraints.expressions.binary;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.BinaryExpression;
import io.intino.tara.model.constraints.expressions.BooleanExpression;
import io.intino.tara.model.constraints.expressions.Expression;

import java.util.Collection;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class InExpression extends BinaryExpression implements BooleanExpression {
	private static final long serialVersionUID = 1L;

	public InExpression(Expression left, Expression right) {
		super(left, right);
	}

	public Object evaluate(EvaluationContext context) throws Exception {
		Object leftValue = left.evaluate(context);
		Object rightValue = right.evaluate(context);
		if (leftValue == null || rightValue == null) return FALSE;
		if (!(leftValue instanceof Collection)) leftValue = List.of(leftValue);
		if (!(rightValue instanceof Collection)) rightValue = List.of(rightValue);
		return ((Collection) rightValue).containsAll((Collection<?>) leftValue) ? TRUE : FALSE;
	}

	@Override
	public boolean matches(EvaluationContext context) throws Exception {
		return evaluate(context) == TRUE;
	}

	public String getExpressionSymbol() {
		return "in";
	}
}