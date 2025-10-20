package io.intino.tara.model.constraints.expressions.functions;


import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.expressions.FunctionCallExpression;

import java.io.Serializable;

public interface FilterFunction extends Serializable {
	boolean isValid(FunctionCallExpression expr);

	boolean returnsBoolean(FunctionCallExpression expr);

	Object evaluate(FunctionCallExpression expr, EvaluationContext context) throws Exception;
}

