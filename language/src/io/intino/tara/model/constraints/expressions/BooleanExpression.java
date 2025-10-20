package io.intino.tara.model.constraints.expressions;

import io.intino.tara.model.constraints.context.EvaluationContext;

public interface BooleanExpression extends Expression {
	boolean matches(EvaluationContext context) throws Exception;
}