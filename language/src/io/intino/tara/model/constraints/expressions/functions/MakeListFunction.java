package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.Expression;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter function that creates a list with each argument being one element in the list.
 * For example:
 * <p/>
 * <p style="margin-left: 4em">
 * MAKELIST( '1', '2', '3' )
 * </p>
 */

public class MakeListFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return true;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return false;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		int argsLength = expr.getNumArguments();
		List<Object> elements = new ArrayList<>(argsLength);
		for (Expression e : expr.arguments()) elements.add(e.evaluate(context));
		return elements;
	}
}
