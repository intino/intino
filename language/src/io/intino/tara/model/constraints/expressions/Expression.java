package io.intino.tara.model.constraints.expressions;

import io.intino.tara.model.constraints.context.EvaluationContext;

import java.io.Serializable;

public interface Expression extends Serializable {
	Object evaluate(EvaluationContext context) throws Exception;
}
