package io.intino.tara.language.semantics;

import io.intino.tara.model.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static io.intino.tara.language.semantics.constraints.ConstraintHelper.*;
import static io.intino.tara.language.semantics.constraints.RuleFactory.*;

public class Context {
	private final String[] types;
	private final Level level;
	private final List<Constraint> constraints = new ArrayList<>();
	private final List<Assumption> assumptions = new ArrayList<>();

	public Context(String[] types, Level level, Constraint[] globalConstrains) {
		this.types = types.clone();
		this.level = level;
		Collections.addAll(constraints, globalConstrains);
	}

	public String[] types() {
		return Arrays.copyOf(types, types.length);
	}

	public Level level() {
		return level;
	}

	public List<Constraint> constraints() {
		return constraints;
	}

	public List<Assumption> assumptions() {
		return assumptions;
	}

	public Context assume(Assumption... assumptions) {
		this.assumptions.addAll(Arrays.asList(assumptions));
		return this;
	}

	public Context has(Constraint... constraints) {
		this.constraints().addAll(Arrays.asList(constraints));
		return rejectOthers();
	}

	private Context rejectOthers() {
		this.constraints().add(rejectOtherComponents(componentConstrains(this.constraints())));
		this.constraints().add(rejectOtherParameters(parameterConstrains(this.constraints())));
		this.constraints().add(rejectOtherFacets(facetConstrains(this.constraints())));
		return this;
	}
}
