package io.intino.tara.builder.codegeneration.language;

import io.intino.itrules.Frame;
import io.intino.itrules.FrameBuilder;
import io.intino.itrules.adapters.ExcludeAdapter;
import io.intino.tara.builder.codegeneration.TemplateTags;
import io.intino.tara.model.Annotation;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.Property;
import io.intino.tara.model.Rule;
import io.intino.tara.model.rules.property.FunctionRule;
import io.intino.tara.model.rules.property.PropertyCustomRule;

import static io.intino.tara.model.Annotation.Reactive;
import static java.util.Collections.emptyList;

class LanguagePropAdapter implements TemplateTags {
	private final String workingPackage;

	LanguagePropAdapter(String workingPackage) {
		this.workingPackage = workingPackage;
	}

	void addPropConstraint(FrameBuilder frame, String facet, int position, Property prop) {
		frame.add(CONSTRAINT, property(position, facet, prop));
	}

	protected FrameBuilder ruleToFrame(Rule<?> rule) {
		if (rule == null) return null;
		final FrameBuilder builder = new FrameBuilder();
		builder.put(Rule.class, new ExcludeAdapter<>("loadedClass"));
		builder.append(rule);
		if (rule instanceof PropertyCustomRule) {
			FrameBuilder frameBuilder = new FrameBuilder("customRule");
			frameBuilder.add(QN, cleanQn(((PropertyCustomRule) rule).qualifiedName()));
			frameBuilder.add("aClass", cleanQn(((PropertyCustomRule) rule).externalClass()));
			if (((PropertyCustomRule) rule).isMetric()) {
				frameBuilder.add(METRIC);
				frameBuilder.add(DEFAULT, ((PropertyCustomRule) rule).getDefaultUnit());
			}
			return frameBuilder;
		}
		return builder;
	}

	public static String cleanQn(String qualifiedName) {
		return qualifiedName.replace(Mogram.ANONYMOUS, "").replace("[", "").replace("]", "").replace(":", "").replace("$", ".");
	}

	private Frame property(int i, String facet, Property prop) {
		FrameBuilder builder = new FrameBuilder(CONSTRAINT, PROPERTY).
				add(NAME, prop.name()).
				add(FACET, facet).
				add(TYPE, prop.type())
				.add(POSITION, i)
				.add(TAGS, annotations(prop))
				.add(SCOPE, workingPackage)
				.add("level", prop.container().level().name());
		Frame[] rules = prop.rules().stream()
				.filter(r -> !(r instanceof PropertyCustomRule c) || c.loadedClass() != null)
				.map(r -> ruleToFrame(r).toFrame())
				.toArray(Frame[]::new);
		if (rules.length > 0) builder.add(RULE, rules);
		else if (prop.annotations().contains(Reactive)) {
			final FrameBuilder ruleFrame = ruleToFrame(new FunctionRule("", "", emptyList()));
			if (ruleFrame != null) builder.add(RULE, ruleFrame.toFrame());
		}
		return builder.toFrame();
	}

	private String[] annotations(Property variable) {
		return variable.annotations().stream().map(Annotation::name).toArray(String[]::new);
	}
}