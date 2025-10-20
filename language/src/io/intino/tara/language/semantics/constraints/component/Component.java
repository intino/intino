package io.intino.tara.language.semantics.constraints.component;

import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.*;
import io.intino.tara.model.rules.Size;
import io.intino.tara.processors.Resolver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static io.intino.tara.processors.Resolver.shortType;

public record Component(String type, List<Rule<?>> rules,
						List<Annotation> annotations) implements Constraint.Component {

	@Override
	public void check(Element element) throws SemanticException {
		if (!(element instanceof ElementContainer container)) return;
		List<Mogram> components = filterByType(container);
		final List<Mogram> accepted = acceptedComponents(components);
		if (!accepted.isEmpty()) components.forEach(this::addFlags);
		final List<Mogram> notAccepted = notAccepted(components, accepted);
		if (!notAccepted.isEmpty()) error(notAccepted.get(0));
		else checkRequired(element, accepted);
	}

	private List<Mogram> acceptedComponents(List<Mogram> components) {
		return components.stream().filter(component -> rules.stream().allMatch(r -> accept(r, components, component))).collect(Collectors.toList());
	}

	private boolean accept(Rule r, List<Mogram> components, Mogram component) {
		return r instanceof Size ? r.accept((Sized) components::size) : r.accept(component);
	}

	private List<Mogram> notAccepted(List<Mogram> components, List<Mogram> accepted) {
		return components.stream().filter(c -> !accepted.contains(c)).collect(Collectors.toList());
	}

	private void error(Mogram notAccepted) throws SemanticException {
		for (Rule<?> rule : rules)
			if (!accept(rule, notAccepted.container().components(), notAccepted))
				throw new SemanticException(new SemanticIssue(SemanticIssue.Level.ERROR, rule.errorMessage(), notAccepted, rule.errorParameters()));
	}

	private void checkRequired(Element element, List<Mogram> accepted) throws SemanticException {
		if (rules.get(0) instanceof Size && ((Size) rules.get(0)).isRequired() && !isAccepted(accepted, type())) {
			List<?> parameters = Collections.singletonList(this.type.replace(":", " on "));
			throw new SemanticException(new SemanticIssue(SemanticIssue.Level.ERROR, "required.type.in.context", element, parameters));
		}
	}

	private boolean isAccepted(List<Mogram> accepted, String type) {
		return accepted.stream().anyMatch(mogram -> Resolver.mainType(mogram).equals(type));
	}

	private void addFlags(Mogram mogram) {
		List<Annotation> flags = new ArrayList<>(mogram.annotations());
		this.annotations.forEach(flag -> {
			if (!flags.contains(flag)) mogram.addAnnotations(flag);
			flags.add(flag);
		});
	}

	private List<Mogram> filterByType(ElementContainer mogram) {
		return mogram.components().stream().filter(this::isCompatible).collect(Collectors.toList());
	}

	private boolean isCompatible(Mogram mogram) {
		return mogram.types().stream().anyMatch(type -> this.type.equals(type) || shortType(this.type).equals(type)) || checkFacets(mogram);
	}

	private boolean checkFacets(Mogram mogram) {
		return mogram.appliedFacets().stream().anyMatch(facet -> facet.type().equals(shortType(type)));
	}

	@Override
	public String toString() {
		return "Component{" + type + '}';
	}
}
