package io.intino.tara;

import io.intino.tara.language.semantics.Assumption;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.Context;
import io.intino.tara.language.semantics.constraints.GlobalConstraints;
import io.intino.tara.model.Level;

import java.util.*;
import java.util.stream.Collectors;

import static io.intino.tara.processors.Resolver.shortType;
import static java.util.Collections.unmodifiableList;

public abstract class Tara implements Language {
	private final Map<String, Context> rulesCatalog = new HashMap<>();
	private final List<String> lexicon = new ArrayList<>();

	protected RuleTransaction def(final String qualifiedName) {
		return context -> {
			rulesCatalog.put(qualifiedName, context);
			return context;
		};
	}

	protected Context context(Level level, String... types) {
		return new Context(types, level, new GlobalConstraints().all());
	}

	@Override
	public Level level(String qualifiedName) {
		if (qualifiedName == null || !rulesCatalog.containsKey(qualifiedName)) return null;
		return rulesCatalog.get(qualifiedName).level();
	}

	@Override
	public Map<String, Context> catalog() {
		return rulesCatalog;
	}

	@Override
	public List<Constraint> constraints(String qualifiedName) {
		if (qualifiedName == null || !rulesCatalog.containsKey(qualifiedName)) return null;
		return unmodifiableList(rulesCatalog.get(qualifiedName).constraints());
	}

	@Override
	public List<Assumption> assumptions(String qualifiedName) {
		if (qualifiedName == null || !rulesCatalog.containsKey(qualifiedName)) return null;
		return unmodifiableList(rulesCatalog.get(qualifiedName).assumptions());
	}

	@Override
	public List<String> types(String qualifiedName) {
		if (qualifiedName == null || !rulesCatalog.containsKey(qualifiedName)) return null;
		return Arrays.asList(rulesCatalog.get(qualifiedName).types());
	}

	@Override
	public String[] lexicon() {
		if (!lexicon.isEmpty()) return lexicon.toArray(new String[0]);
		return calculateLexicon();
	}

	private String[] calculateLexicon() {
		lexicon.addAll(collectTokens());
		return lexicon.toArray(new String[0]);
	}

	private Collection<String> collectTokens() {
		final Set<String> collect = rulesCatalog.keySet().stream().
				filter(qn -> !shortType(qn).isEmpty()).map(t -> {
					final String shortType = shortType(t);
					return shortType.contains(":") ? shortType.substring(0, shortType.indexOf(":")) : shortType;
				}).collect(Collectors.toSet());
		for (Context context : rulesCatalog.values())
			collect.addAll(context.constraints().stream().filter(c -> c instanceof Constraint.Facet).map(c -> ((Constraint.Facet) c).type()).collect(Collectors.toSet()));
		return collect;
	}

	public interface RuleTransaction {
		Context with(Context context);
	}
}
