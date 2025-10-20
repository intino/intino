package io.intino.tara.language.semantics.constraints.property;

import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.*;
import io.intino.tara.model.rules.Size;
import io.intino.tara.processors.model.HasMogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.RECOVERABLE_ERROR;

public final class DescriptiveProperty extends DescriptivePropertyConstraint {
	private final String name;
	private final Primitive type;
	private final String facet;
	private final int position;
	private final Level level;
	private final List<Rule> rules;
	private final Set<Annotation> annotations;

	public DescriptiveProperty(String name, Primitive type, String facet, int position, Level level, List<Rule> rules, List<Annotation> annotations) {
		this.name = name;
		this.type = type;
		this.facet = facet;
		this.position = position;
		this.level = level;
		this.rules = rules;
		this.annotations = new HashSet<>(annotations);
	}

	@Override
	public void check(Element element) throws SemanticException {
		if (element instanceof HasMogram) return;
		checkParameter(element, ((Parametrized) element).parameters());
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Primitive type() {
		return type;
	}

	@Override
	public String facet() {
		return facet;
	}

	@Override
	public int position() {
		return position;
	}

	@Override
	public Level level() {
		return level;
	}

	@Override
	public List<Rule> rules() {
		return rules;
	}

	@Override
	public List<Annotation> annotations() {
		return List.copyOf(annotations);
	}

	private void checkParameter(Element element, List<PropertyDescription> parameters) throws SemanticException {
		PropertyDescription prop = findProperty(parameters, facet, name, position);
		if (prop == null) {
			if (size().isRequired() && (!(element instanceof Mogram) || isNotGeneralization(element)))
				throw new SemanticException(new SemanticIssue(RECOVERABLE_ERROR, "required.parameter.in.context", element, Arrays.asList(reference(element), type.getName(), name())));
			return;
		}
		List<SemanticIssue> issues = notComplaintRules(prop).stream().map(r -> new SemanticIssue(r.level(), r.errorMessage() == null || r.errorMessage().isEmpty() ? "rule.not.complains" : r.errorMessage(), prop, r.errorParameters())).toList();
		if (!issues.isEmpty()) throw new SemanticException(issues.get(0));
	}

	private String reference(Element element) {
		if (element instanceof Mogram m && !m.name().isEmpty()) return m.types().get(0);
		return "";
	}

	private Size size() {
		return rules.stream().filter(r -> r instanceof Size).map(r -> (Size) r).findFirst().orElse(null);
	}

	private List<Rule> notComplaintRules(PropertyDescription prop) {
		return rules.stream().filter(r -> !r.accept(prop)).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "Parameter{" + type + "@" + name + "}";
	}
}
