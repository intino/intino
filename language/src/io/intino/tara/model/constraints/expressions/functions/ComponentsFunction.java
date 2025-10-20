package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.Mogram;
import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression.InvalidFunctionException;

public class ComponentsFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() <= 1;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return false;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		if (!isValid(expr)) throw new InvalidFunctionException("Invalid function call");
		Object mogram = expr.getNumArguments() == 0 ? context.getProperty("self") : expr.getArgument(0).evaluate(context);
		return ((Mogram) mogram).components();
	}
}
