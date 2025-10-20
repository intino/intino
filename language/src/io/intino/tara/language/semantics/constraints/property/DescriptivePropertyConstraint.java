package io.intino.tara.language.semantics.constraints.property;

import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.model.Element;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.NamedReference;
import io.intino.tara.model.PropertyDescription;

import java.util.List;

import static io.intino.tara.model.Annotation.Generalization;

abstract class DescriptivePropertyConstraint implements Constraint.Property {
	protected enum ParameterError {NOT_FOUND, RECOVERABLE_ERROR, RULE}

	protected ParameterError error = ParameterError.NOT_FOUND;

	static PropertyDescription findProperty(List<PropertyDescription> props, String facet, String name, int position) {
		for (PropertyDescription prop : props)
			if (!prop.name().isEmpty() && prop.name().equals(name)) return prop;
		return byPosition(props, facet, position);
	}

	private static PropertyDescription byPosition(List<PropertyDescription> props, String facet, int position) {
		return props.stream()
				.filter(prop -> prop.name().isEmpty() && prop.facet().equals(facet) && prop.position() == position)
				.findFirst().orElse(null);
	}

	boolean isNotGeneralization(Element element) {
		return element instanceof Mogram && !((Mogram) element).is(Generalization) && !isInherited((Mogram) element);
	}

	private boolean isInherited(Mogram mogram) {
		NamedReference<Mogram> parent = mogram.parent();
		while (parent != null && parent.resolved()) {
			final PropertyDescription parameter = findProperty(mogram.parent().get().parameters(), "", name(), position());
			if (parameter != null) return true;
			parent = mogram.parent();
		}
		return false;
	}
}