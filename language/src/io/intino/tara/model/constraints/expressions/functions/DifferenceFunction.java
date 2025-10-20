package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DifferenceFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() == 2;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return false;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		Object left = expr.getArgument(0).evaluate(context);
		Object right = expr.getArgument(1).evaluate(context);
		if (!(left instanceof Collection<?>)) left = List.of(left);
		List<?> minuend = (List<?>) left;
		List<?> result = new ArrayList<>(minuend);
		if (right instanceof Collection<?> c) result.removeAll(c);
		else result.remove(minuend);
		return result;
	}
}
