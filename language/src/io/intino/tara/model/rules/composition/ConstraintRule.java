package io.intino.tara.model.rules.composition;

import io.intino.tara.model.Mogram;
import io.intino.tara.model.NamedReference;
import io.intino.tara.model.constraints.Constraint;
import io.intino.tara.model.rules.MogramRule;

public record ConstraintRule(NamedReference<Constraint> reference) implements MogramRule {
	private static final long serialVersionUID = 1L;
	@Override
	public boolean accept(Mogram value) {
		try {
			if (!reference.resolved()) return false;
			Constraint constraint = reference.get();
			return constraint.evaluate(value);
		} catch (Exception e) {
			System.err.println("Constraint evaluation failed: " + e.getMessage());
			return true;
		}
	}

	@Override
	public String errorMessage() {
		return reference.get().message();
	}
}