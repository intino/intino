package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;
import io.intino.tara.model.constraints.expressions.InvalidExpression;

import java.util.Collection;

public class SumFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() >= 1 && expr.getNumArguments() <= 2;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return false;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		Object adding = expr.getArgument(0).evaluate(context);
		if (adding instanceof Collection<?> c) return sum(c);
		else if (adding instanceof Double d) return d;
		throw new InvalidExpression("Cannot evaluate sum function");
	}

	public static double sum(Collection<?> numbers) {
		double sum = 0.0;
		for (Object num : numbers) {
			if (num instanceof Number) {
				sum += ((Number) num).doubleValue();
			} else {
				throw new IllegalArgumentException("Elemento no numérico: " + num);
			}
		}
		return sum;
	}
}
