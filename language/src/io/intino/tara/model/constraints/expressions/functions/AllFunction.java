package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.BooleanExpression;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression.InvalidFunctionException;
import io.intino.tara.model.constraints.expressions.InvalidExpression;
import io.intino.tara.model.constraints.expressions.LambdaExpression;

import java.util.Collection;
import java.util.List;

public class AllFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() == 2;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return true;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		if (!isValid(expr)) throw new InvalidFunctionException("Invalid function call");
		Object collection = expr.getArgument(0).evaluate(context);
		if (collection == null) throw new InvalidExpression("Cannot resolve '" + expr.getArgument(0).toString() + "'");
		if (!(collection instanceof Collection<?>))
			collection = List.of(collection);
		if (!(expr.getArgument(1) instanceof LambdaExpression lambda))
			throw new InvalidFunctionException(expr.getArgument(1) + " is not a lambda expression");
		if (!(lambda.argument() instanceof BooleanExpression))// || lambda.argument() instanceof FilterFunction f && f.returnsBoolean((FunctionCallExpression) f))
			throw new InvalidFunctionException(lambda + " is not boolean expression");
		return ((Collection) collection).stream().filter(i -> apply(context, i, lambda)).toList();
	}

	private static boolean apply(EvaluationContext context, Object element, LambdaExpression lambda) {
		try {
			return (boolean) lambda.evaluate(new LambdaEvaluationContext(lambda.literal(), element, context));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
