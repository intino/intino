package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;

public class SubstringFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() == 3;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return false;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		String src = (String) expr.getArgument(0).evaluate(context);
		return src != null ? src.substring(begin(expr, context), end(expr, context)) : null;
	}

	private static Integer end(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		return (Integer) expr.getArgument(2).evaluate(context);
	}

	private static Integer begin(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		return (Integer) expr.getArgument(1).evaluate(context);
	}
}
