package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;
import io.intino.tara.model.constraints.expressions.InvalidExpression;
import io.intino.tara.model.constraints.expressions.LambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MapFunction implements FilterFunction {
	private static final long serialVersionUID = 1L;

	public boolean isValid(FunctionCallExpression expr) {
		return expr.getNumArguments() == 2;
	}

	public boolean returnsBoolean(FunctionCallExpression expr) {
		return false;
	}

	public Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception {
		Object collection = expr.getArgument(0).evaluate(context);
		if (collection == null) throw new InvalidExpression("Cannot resolve '" + expr.getArgument(0).toString() + "'");
		if (!(collection instanceof Collection<?>))
			collection = List.of(collection);
		if (!(expr.getArgument(1) instanceof LambdaExpression lambda))
			throw new FunctionCallExpression.InvalidFunctionException(expr.getArgument(1) + " is not a lambda expression");
		List<Exception> exceptions = new ArrayList<>();
		List list = ((Collection) collection).stream().map(i -> {
			try {
				return apply(context, i, lambda);
			} catch (InvalidExpression e) {
				exceptions.add(e);
				return null;
			}
		}).toList();
		if (!exceptions.isEmpty()) throw exceptions.getFirst();
		return list;
	}

	private static Object apply(EvaluationContext context, Object element, LambdaExpression lambda) throws InvalidExpression {
		try {
			return lambda.evaluate(new LambdaEvaluationContext(lambda.literal(), element, context));
		} catch (Exception e) {
			throw new InvalidExpression(e.getMessage());
		}
	}
}
