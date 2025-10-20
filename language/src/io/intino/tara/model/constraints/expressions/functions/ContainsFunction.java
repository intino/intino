package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;

public class ContainsFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() == 2;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return true;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		if (!isValid(expr)) throw new FunctionCallExpression.InvalidFunctionException("Invalid function call");
		java.util.List<?> elements = (java.util.List<?>) expr.getArgument(0).evaluate(context);
		Object candidate = expr.getArgument(1).evaluate(context);
		return elements.stream().anyMatch(e -> e.equals(candidate));
	}
}
