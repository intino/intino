package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;

public class SortFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() == 1;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return true;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		java.util.List<?> elements = (java.util.List<?>) expr.getArgument(0).evaluate(context);
		return elements == null ? null : elements.stream().sorted().toList();
	}
}
