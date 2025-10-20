package io.intino.tara.language.semantics.constraints.component;

import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.*;
import io.intino.tara.model.rules.Size;
import io.intino.tara.processors.Resolver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.ERROR;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class OneOf implements Constraint.OneOf {
	private final List<Rule<?>> rules;
	private final List<Component> constraints;

	public OneOf(List<Component> constraints, List<Rule<?>> rules) {
		this.rules = rules;
		this.constraints = constraints;
	}

	@Override
	public void check(Element element) throws SemanticException {
		Mogram mogram = (Mogram) element;
		List<String> requireTypes = new ArrayList<>();
		Set<Mogram> accepted = new HashSet<>();
		Set<Mogram> notAccepted = new HashSet<>();
		for (Component constraint : constraints) {
			requireTypes.add(Resolver.shortType(constraint.type()));
			try {
				constraint.check(mogram);
			} catch (SemanticException e) {
				if (!e.getIssue().key().equals("required.type.in.context") && !e.getIssue().key().equals("required.any.type.in.context"))
					throw e;
			}
			final List<Mogram> components = filterByType(mogram, constraint);
			final List<Mogram> acceptedMograms = acceptedComponents(components);
			accepted.addAll(acceptedMograms);
			notAccepted.addAll(notAccepted(components, acceptedMograms));
			if (!notAccepted.isEmpty()) error(notAccepted.iterator().next());
		}
		Size size = (Size) rules.stream().filter(r -> r instanceof Size).findFirst().orElse(null);
		if (size == null) return;
		if (accepted.isEmpty() && size.isRequired())
			throw new SemanticException(new SemanticIssue(ERROR, "required.any.type.in.context", element, singletonList(String.join(", ", requireTypes))));
		else if (size.max() < accepted.size())
			throw new SemanticException(new SemanticIssue(ERROR, "reject.much.types.in.context", element, asList(size.max(), String.join(", ", requireTypes))));
	}

	@Override
	public String type() {
		return "";
	}


	@Override
	public List<Rule<?>> rules() {
		return rules;
	}

	@Override
	public List<Annotation> annotations() {
		Set<Annotation> tags = new HashSet<>();
		constraints.forEach(c -> tags.addAll(c.annotations()));
		return new ArrayList<>(tags);
	}

	private List<Mogram> filterByType(ElementContainer node, Constraint.Component constraint) {
		return node.components().stream().filter(component -> areCompatibles(component, constraint.type())).collect(Collectors.toList());
	}

	private static boolean areCompatibles(Mogram mogram, String type) {
		for (String nodeType : mogram.types())
			if (nodeType != null && nodeType.equals(type)) return true;
		return checkFacets(mogram, type);
	}

	private static boolean checkFacets(Mogram mogram, String type) {
		for (io.intino.tara.model.Facet facet : mogram.appliedFacets())
			if (facet.type().equals(Resolver.shortType(type))) return true;
		return false;
	}

	private List<Mogram> acceptedComponents(List<Mogram> components) {
		return components.stream().filter(component -> rules.stream().allMatch(r -> accept(r, components, component))).collect(Collectors.toList());
	}

	private List<Mogram> notAccepted(List<Mogram> components, List<Mogram> accepted) {
		return components.stream().filter(c -> !accepted.contains(c)).collect(Collectors.toList());
	}

	private boolean accept(Rule r, List<Mogram> components, Mogram component) {
		return r instanceof Size ? r.accept((Sized) components::size) : r.accept(component);
	}

	private void error(Mogram notAccepted) throws SemanticException {
		for (Rule rule : rules)
			if (!accept(rule, notAccepted.container().components(), notAccepted))
				throw new SemanticException(new SemanticIssue(ERROR, rule.errorMessage(), notAccepted, rule.errorParameters()));
	}

	@Override
	public List<Component> components() {
		return constraints;
	}

	@Override
	public String toString() {
		List<String> types = constraints.stream().map(Component::type).collect(Collectors.toList());
		return "OneOf{" + String.join(", ", types) + '}';
	}
}
