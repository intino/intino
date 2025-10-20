package io.intino.tara.model.constraints.expressions;

import io.intino.tara.model.constraints.context.EvaluationContext;

public record PropertyExpression(String name) implements Expression {
	private static final long serialVersionUID = 1L;

	@Override
	public Object evaluate(EvaluationContext context) throws Exception {
		return context.getProperty(name);
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		return o != null && this.getClass().equals(o.getClass()) && name.equals(((PropertyExpression) o).name);
	}
}