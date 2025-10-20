package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;

import java.lang.reflect.Array;
import java.util.Collection;

public class CountFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() == 1;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return false;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		Object object = expr.getArgument(0).evaluate(context);
		if (object == null) return 0;
		if (object instanceof Collection<?> c) return c.size();
		if (object.getClass().isArray()) return Array.getLength(object);
		return 1;
	}
}
