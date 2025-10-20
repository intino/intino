package io.intino.tara.builder.codegeneration.language;

import io.intino.itrules.Frame;
import io.intino.itrules.FrameBuilder;
import io.intino.tara.Language;
import io.intino.tara.builder.codegeneration.TemplateTags;
import io.intino.tara.model.*;
import io.intino.tara.model.rules.Size;
import io.intino.tara.model.rules.composition.ConstraintRule;
import io.intino.tara.processors.model.HasMogram;
import io.intino.tara.processors.model.Model;

import java.util.*;

import static io.intino.tara.model.Annotation.*;
import static io.intino.tara.model.Level.*;
import static java.util.stream.Collectors.toList;

class LanguageModelAdapter implements TemplateTags {
	public static final int BLOCK_SIZE = 5;
	private final String workingPackage;
	private final Set<Mogram> processed = new HashSet<>();
	private final String outDSL;
	private final Language language;
	private final FrameBuilder root;
	private int rootNumber = 0;

	LanguageModelAdapter(String grouId, String outDSL, String version, Locale locale, Language language, String workingPackage) {
		this.outDSL = outDSL;
		this.language = language;
		this.workingPackage = workingPackage;
		this.root = new FrameBuilder().add("language")
				.add("groupId", grouId)
				.add("groupIdPath", grouId.replace(".", "/"))
				.add(NAME, outDSL)
				.add("version", version)
				.add(META_LANGUAGE, language.languageName())
				.add(LOCALE, locale.getLanguage());
	}

	public Frame adapt(Model model) {
		createModelRuleFrame(model);
		buildRootMograms(model);
		return root.toFrame();
	}

	private void createModelRuleFrame(Model model) {
		FrameBuilder builder = new FrameBuilder().add("model").add(NAME, "");
		FrameBuilder cs = new FrameBuilder(CONSTRAINTS);
		componentsConstraints(model).forEach(frame -> cs.add(CONSTRAINT, frame));
		languageComponentConstraints(language.model()).forEach(frame -> builder.add(CONSTRAINT, frame));
		root.add("model", builder.add(CONSTRAINTS, cs).toFrame());
	}

	private void buildRootMograms(Model model) {
		List<Frame> frames = mogramFrames(model);
		for (int i = 0; i < frames.size(); i += BLOCK_SIZE) {
			final FrameBuilder rootFrame = new FrameBuilder("split")
					.add("number", ++rootNumber)
					.add("language", outDSL);
			frames.subList(i, Math.min(i + BLOCK_SIZE, frames.size())).forEach(f -> rootFrame.add(MOGRAM, f));
			root.add("split", rootFrame.toFrame());
		}
		List<Frame> langFrames = languageMogramFrames(language.model());
		int length = frames.size() + langFrames.size();
		for (int i = frames.size(); i < length; i += BLOCK_SIZE) {
			final FrameBuilder rootFrame = new FrameBuilder("split")
					.add("number", ++rootNumber)
					.add("language", outDSL);
			langFrames.subList(i - frames.size(), Math.min(i + BLOCK_SIZE - frames.size(), length - frames.size())).forEach(f -> rootFrame.add(MOGRAM, f));
			root.add("split", rootFrame.toFrame());
		}
	}

	private List<Frame> languageMogramFrames(MogramRoot model) {
		List<Frame> frames = new ArrayList<>();
		model.mograms().stream().filter(m -> m.level().equals(M2)).forEach(m -> map(m, frames));
		return frames;
	}

	private List<Frame> mogramFrames(Model model) {
		List<Frame> frames = new ArrayList<>();
		model.mograms().forEach(m -> map(m, frames));
		return frames;
	}

	private void map(Mogram n, List<Frame> frames) {
		var rootFrame = new FrameBuilder(ROOT).add("number", ++rootNumber).add("language", outDSL);
		buildMogram(n, rootFrame);
		rootFrame.toFrame().frames(MOGRAM).forEachRemaining(frames::add);
	}

	private void buildMogram(Mogram mogram, FrameBuilder root) {
		if (!processed.add(mogram)) return;
		if (mogram.level() != M1 && !mogram.is(Generalization) && !mogram.isAnonymous())
			root.add(MOGRAM, createMogramRuleFrame(mogram).toFrame());
		if (!mogram.isAnonymous()) mogram.mograms().forEach(m -> buildMogram(m, root));
	}

	private FrameBuilder createMogramRuleFrame(Mogram mogram) {
		FrameBuilder frame = new FrameBuilder(MOGRAM).add(NAME, name(mogram));
		frame.add("level", Level.values()[mogram.level().ordinal() - 1].name());
		addTypes(mogram, frame);
		addConstraints(mogram, frame);
		addAssumptions(mogram, frame);
		return frame;
	}

	private void addTypes(Mogram mogram, FrameBuilder builder) {
		if (mogram.types().isEmpty()) return;
		FrameBuilder typesFrameBuilder = new FrameBuilder(MOGRAM_TYPE);
		Set<String> typeSet = new LinkedHashSet<>(mogram.types());
		Collection<String> languageTypes = language.types(mogram.types().get(0));
		if (languageTypes != null) typeSet.addAll(languageTypes);
		for (String type : typeSet) typesFrameBuilder.add(TYPE, type);
		if (typesFrameBuilder.slots() > 0) builder.add(MOGRAM_TYPE, typesFrameBuilder.toFrame());
	}

	private void addConstraints(Mogram mogram, FrameBuilder builder) {
		FrameBuilder cs = new FrameBuilder(CONSTRAINTS);
		componentsConstraints(mogram).forEach(f -> cs.add(CONSTRAINT, f));
		addParameterConstraints(allProperties(mogram), mogram.facetPrescription() != null ? mogram.name() : "", cs);
		addAllowedFacetConstraints(mogram, cs);
		builder.add(CONSTRAINTS, cs.toFrame());
	}

	private List<Property> allProperties(Mogram mogram) {
		List<Property> properties = new ArrayList<>(mogram.properties());
		NamedReference<Mogram> parent = mogram.parent();
		while (parent != null) {
			properties.addAll(0, parent.get().properties().stream().filter(p -> properties.stream().noneMatch(pr -> pr.name().equals(p.name()))).toList());
			parent = parent.get().parent();
		}
		return properties;
	}

	private void addParameterConstraints(List<Property> props, String facet, FrameBuilder constrainsFrame) {
		int privateProps = 0;
		for (int index = 0; index < props.size(); index++) {
			Property prop = props.get(index);
			if (!prop.annotations().contains(Private) && !(prop.annotations().contains(Final) && !prop.values().isEmpty()))
				new LanguagePropAdapter(workingPackage).addPropConstraint(constrainsFrame, facet, index - privateProps, prop);
			else privateProps++;
		}
	}

	private void addAllowedFacetConstraints(Mogram mogram, FrameBuilder constraintsBuilder) {
		allApplicableFacets(mogram).forEach(facetMogram -> {
			if (facetMogram.is(Generalization)) return;
			FrameBuilder builder = new FrameBuilder(CONSTRAINT, FACET).add(VALUE, facetMogram.qualifiedName());
			if (facetMogram.facetConstraints() != null && !facetMogram.facetConstraints().isEmpty())
				for (Mogram.FacetConstraint constraint : facetMogram.facetConstraints())
					builder.add(WITH, constraint.target().get().qualifiedName());
			if (facetMogram.annotations().contains(Required)) builder.add("required", "true");
			addParameterConstraints(allProperties(facetMogram), facetMogram.name(), builder);
			componentsConstraints(facetMogram).forEach(f -> builder.add(CONSTRAINT, f));
			constraintsBuilder.add(CONSTRAINT, builder.toFrame());
			if (facetMogram.level() == M3)
				constraintsBuilder.add(CONSTRAINT, new FrameBuilder(FACET_INSTANTIATION).add("type", typesOf(facetMogram)));
		});
	}

	private String[] typesOf(Mogram mogram) {
		List<String> types = new ArrayList<>(List.of(mogram.qualifiedName()));
		mogram.children().forEach(c -> types.add(c.qualifiedName()));
		return types.toArray(new String[0]);
	}

	private static List<Mogram> allApplicableFacets(Mogram mogram) {
		List<Mogram> facets = new ArrayList<>(mogram.applicableFacets().stream().map(NamedReference::get).toList());
		NamedReference<Mogram> parent = mogram.parent();
		while (parent != null) {
			facets.addAll(0, parent.get().applicableFacets().stream().map(NamedReference::get).filter(p -> facets.stream().noneMatch(f -> f.name().equals(p.name()))).toList());
			parent = parent.get().parent();
		}
		return facets;
	}

	private void addAssumptions(Mogram mogram, FrameBuilder frame) {
		FrameBuilder assumptions = buildAssumptions(mogram);
		if (assumptions.slots() != 0) frame.add(ASSUMPTIONS, assumptions.toFrame());
	}

	private FrameBuilder buildAssumptions(Mogram mogram) {
		FrameBuilder assumptions = new FrameBuilder(ASSUMPTIONS);
		addAnnotationAssumptions(mogram, assumptions);
		return assumptions;
	}

	private void addAnnotationAssumptions(Mogram mogram, FrameBuilder assumptions) {
		mogram.annotations().stream()
				.filter(tag -> tag.equals(Feature) || tag.equals(Component))
				.forEach(tag -> assumptions.add(ASSUMPTION, tag));
	}

	private List<Frame> languageComponentConstraints(MogramRoot model) {
		List<Frame> frames = new ArrayList<>();
		model.mograms().stream()
				.filter(m -> m.level().equals(M2))
				.filter(c -> componentCompliant(model, c))
				.filter(c -> !c.isSub() || c.container() instanceof Model)
				.forEach(c -> createComponentConstraint(frames, c));
		return frames;
	}

	private List<Frame> componentsConstraints(ElementContainer container) {
		List<Frame> frames = new ArrayList<>();
		allComponents(container).stream()
				.filter(c -> componentCompliant(container, c))
				.filter(c -> !c.isSub() || c.container() instanceof Model)
				.forEach(c -> createComponentConstraint(frames, c));
		allReferences(container).forEach(c -> createComponentConstraint(frames, c));
		return frames;
	}

	private void createComponentConstraint(List<Frame> frames, Mogram mogram) {
		final List<Mogram> candidates = collectCandidates(mogram);
		final Size size = mogram.container().sizeOf(mogram);
		final List<Rule<?>> allRules = mogram.container().rulesOf(mogram).stream().distinct().collect(toList());
		if ((size.isSingle() || size.isRequired()) && candidates.size() > 1) {
			final FrameBuilder oneOfBuilder = createOneOf(candidates, allRules);
			if (!mogram.is(Generalization) && !candidates.contains(mogram))
				oneOfBuilder.add(CONSTRAINT, createComponentConstraint(mogram, allRules));
			if (!mogram.isSub()) frames.add(oneOfBuilder.toFrame());
		} else frames.addAll(candidates.stream().filter(c -> componentCompliant(c.container(), c)).
				map(c -> createComponentConstraint(c, allRules)).toList());
	}

	private void createComponentConstraint(List<Frame> frames, HasMogram mogram) {
		Mogram target = mogram.target().get();
		final List<Mogram> candidates = collectCandidates(target);
		final Size size = mogram.container().sizeOf(mogram);
		final List<Rule<?>> allRules = mogram.container().rulesOf(mogram).stream().distinct().collect(toList());
		if ((size.isSingle() || size.isRequired()) && candidates.size() > 1) {
			final FrameBuilder oneOfBuilder = createOneOf(candidates, allRules);
			if (!target.is(Generalization) && !candidates.contains(target))
				oneOfBuilder.add(CONSTRAINT, createComponentConstraint(target, allRules));
			if (!target.isSub()) frames.add(oneOfBuilder.toFrame());
		} else frames.addAll(candidates.stream().filter(c -> componentCompliant(mogram.container(), c)).
				map(c -> createComponentConstraint(c, allRules)).toList());
	}

	private Frame createComponentConstraint(Mogram component, List<Rule<?>> rules) {
		FrameBuilder builder = new FrameBuilder(CONSTRAINT, COMPONENT).add(TYPE, name(component));
		builder.add(RULE, createRulesFrames(rules));
		addAnnotations(component, builder);
		return builder.toFrame();
	}

	private FrameBuilder createOneOf(Collection<Mogram> candidates, List<Rule<?>> rules) {
		FrameBuilder builder = new FrameBuilder(ONE_OF, CONSTRAINT);
		builder.add(RULE, createRulesFrames(rules));
		for (Mogram candidate : candidates)
			builder.add(CONSTRAINT, createComponentConstraint(candidate, candidate.container().rulesOf(candidate)));
		return builder;
	}

	//TODO controlar que el hijo no tenga componentes con el mismo nombre que el alguno del padre

	private List<Mogram> allComponents(ElementContainer container) {
		List<Mogram> components = new ArrayList<>(container.components());
		NamedReference<Mogram> parent = container instanceof Mogram m ? m.parent() : null;
		while (parent != null) {
			components.addAll(0, parent.get().components().stream().filter(p -> components.stream().noneMatch(pr -> pr.name().equals(p.name()))).toList());
			parent = parent.get().parent();
		}
		return components;
	}

	private List<HasMogram> allReferences(ElementContainer container) {
		List<HasMogram> references = new ArrayList<>(container.referenceComponents().stream().map(m -> (HasMogram) m).toList());
		NamedReference<Mogram> parent = container instanceof Mogram m ? m.parent() : null;
		while (parent != null) {
			references.addAll(0, parent.get().referenceComponents().stream()
					.filter(has -> references.stream().noneMatch(c -> c.target().get().qualifiedName().equals(has.target().referent().qualifiedName())))
					.map(m -> (HasMogram) m)
					.toList());
			parent = parent.get().parent();
		}
		return references;
	}

	private boolean componentCompliant(ElementContainer container, Mogram mogram) {
		return mogram.facetPrescription() == null &&
				!isFacetInstantiation(mogram)
				&& (!(container instanceof MogramRoot) || rootCompliant(mogram));
	}

	private boolean isFacetInstantiation(Mogram mogram) {
		return mogram.metaMograms().stream().anyMatch(m -> m.facetPrescription() != null);
	}

	private boolean rootCompliant(Mogram c) {
		return !c.is(Component) && !c.is(Feature);
	}

	private String name(Mogram mogram) {
		return mogram.qualifiedName();
	}

	private Frame[] createRulesFrames(List<Rule<?>> rules) {
		return rules.stream()
				.map(rule -> rule instanceof ConstraintRule ?
						buildCustomRuleFrame((ConstraintRule) rule) :
						new FrameBuilder().append(rule).toFrame())
				.filter(Objects::nonNull)
				.toArray(Frame[]::new);
	}

	private Frame buildCustomRuleFrame(ConstraintRule rule) {
		return new FrameBuilder("rule", "customRule")
				.add("qn", rule.reference().reference())
				.toFrame();
	}

	private void addAnnotations(Mogram mogram, FrameBuilder frame) {
		String[] tags = mogram.annotations().stream()
				.filter(a -> !Component.equals(a) && !Decorable.equals(a) && !Required.equals(a))
				.map(Annotation::name)
				.distinct()
				.toArray(String[]::new);
		frame.add(TAGS, tags);
	}

	private List<Mogram> collectCandidates(Mogram mogram) {
		Set<Mogram> mograms = new LinkedHashSet<>();
		if (mogram.isAnonymous()) return new ArrayList<>();
		if (!mogram.is(Generalization)) mograms.add(mogram);
		getNonAbstractChildren(mogram, mograms);
		return new ArrayList<>(mograms);
	}

	private void getNonAbstractChildren(Mogram mogram, Set<Mogram> mograms) {
		for (Mogram child : mogram.children()) {
			if (!child.is(Generalization)) mograms.add(child);
			getNonAbstractChildren(child, mograms);
		}
	}
}