package io.intino.tara.model;

import io.intino.tara.model.constraints.Constraint;

import java.io.File;
import java.util.List;

public interface MogramRoot extends ElementContainer, Element {
	List<String> uses();

	default File resourcesRoot() {
		return null;
	}

	@Override
	default ElementContainer container() {
		return null;
	}

	@Override
	default List<Mogram> siblings() {
		return List.of();
	}

	@Override
	default List<MogramReference> referenceComponents() {
		return List.of();
	}

	List<Constraint> constraints();

	Constraint constraint(String name);

	@Override
	default int line() {
		return 0;
	}

	@Override
	String toString();


}