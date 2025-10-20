package io.intino.tara.language.semantics;


import io.intino.tara.model.Mogram;

public interface Assumption {

	void assume(Mogram mogram);

	interface Facet extends Assumption {
	}

	interface Feature extends Assumption {
	}

	interface Component extends Assumption {
	}

	interface Required extends Assumption {
	}

	interface StashNodeName extends Assumption {
		public String stashNodeName();
	}

	@Deprecated
	interface Instance extends Assumption {
	}
}
