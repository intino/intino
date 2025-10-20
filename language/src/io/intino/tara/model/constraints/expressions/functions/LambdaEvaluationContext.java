package io.intino.tara.model.constraints.expressions.functions;

import io.intino.tara.model.Mogram;
import io.intino.tara.model.constraints.context.EvaluationContext;
import io.intino.tara.model.constraints.context.MogramContext;

record LambdaEvaluationContext(String literal, Object object,
							   EvaluationContext context) implements EvaluationContext {
	@Override
	public Object getProperty(String name) {
		if (name.equals(literal)) return object;
		if (object instanceof Mogram m) {
			if (name.startsWith(literal + "."))
				return new MogramContext(m).getProperty(name.substring(name.indexOf(".") + 1));
		}
		return context.getProperty(name);
	}
}
