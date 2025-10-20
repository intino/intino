package io.intino.tara.processors.dependencyresolution;

import io.intino.tara.Language;
import io.intino.tara.model.*;
import io.intino.tara.model.constraints.Constraint;
import io.intino.tara.model.rules.CustomRule;
import io.intino.tara.model.rules.composition.ConstraintRule;
import io.intino.tara.model.rules.property.PropertyCustomRule;
import io.intino.tara.model.rules.property.ReferenceRule;
import io.intino.tara.model.rules.property.WordRule;
import io.intino.tara.processors.model.HasMogram;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.model.MogramImpl;
import io.intino.tara.processors.model.ReferenceProperty;

import java.io.File;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

import static io.intino.tara.model.Annotation.Generalization;
import static io.intino.tara.model.Primitive.REFERENCE;

public class DependencyResolver {
	private final File rulesDirectory;
	private final File semanticLib;
	private final File tempDirectory;
	private final Model model;
	private final ReferenceManager manager;
	private final Map<String, Class<?>> loadedRules = new HashMap<>();
	private final Language language;
	private final String workingPackage;
	private final List<DependencyException> rulesNotLoaded = new ArrayList<>();

	public DependencyResolver(Model model, Language language, String workingPackage, File rulesDirectory, File semanticLib, File tempDirectory) {
		this.model = model;
		this.language = language;
		this.workingPackage = workingPackage;
		this.rulesDirectory = rulesDirectory;
		this.semanticLib = semanticLib;
		this.tempDirectory = tempDirectory;
		this.manager = new ReferenceManager(this.model);
	}

	public void resolve() throws DependencyException {
		for (Mogram m : model.mograms()) resolveMogramElements(m);
	}

	public List<DependencyException> rulesNotLoaded() {
		return rulesNotLoaded;
	}

	private void resolveMogramElements(Mogram mogram) throws DependencyException {
		resolve(mogram);
		for (Mogram m : mogram.mograms()) resolveMogramElements(m);
	}

	private void resolve(Mogram mogram) throws DependencyException {
		if (!(mogram instanceof MogramImpl)) return;
		resolveParent(mogram);
		resolveFacetPrescriptions(mogram);
		resolveMogramReferences(mogram);
		resolveRules(mogram.container(), mogram);
		resolveProperties(mogram);
		resolveParametersReference(mogram);
	}

	private void resolveFacetPrescriptions(Mogram mogram) throws DependencyException {
		NamedReference<Mogram> facetPrescription = mogram.facetPrescription();
		if (facetPrescription != null && !facetPrescription.resolved()) {
			Mogram resolved = manager.resolve(facetPrescription, mogram);
			if (resolved != null) {
				mogram.facetPrescription(resolved);
				NamedReference<Mogram> applied = resolved.applicableFacets().stream().filter(m -> m.reference().equalsIgnoreCase(mogram.qualifiedName())).findFirst().orElse(null);
				if (applied != null) applied.referent(mogram);
				else resolved.addApplicableFacet(mogram);
			} else throw new DependencyException("reject.dependency.reference.mogram.not.found", mogram);
		}
		if (mogram.facetConstraints() == null) return;
		for (Mogram.FacetConstraint c : mogram.facetConstraints()) {
			if (!c.target().resolved()) {
				Mogram resolvedConstraint = manager.resolve(c.target(), mogram);
				if (resolvedConstraint != null) c.target().referent(resolvedConstraint);
				else throw new DependencyException("reject.dependency.reference.mogram.not.found", mogram);
			}
		}
	}

	private void resolveRules(ElementContainer container, Element element) throws DependencyException {
		if (container == null) return;
		for (Rule<?> rule : container.rulesOf(element)) {
			if (rule instanceof CustomRule) loadCustomRule(element, (CustomRule) rule);
			if (rule instanceof ConstraintRule cr) {
				Constraint c = manager.resolve(((ConstraintRule) rule).reference());
				if (c == null)
					throw new DependencyException("reject.constraint.reference.not.found", element, ((ConstraintRule) rule).reference().reference());
				else cr.reference().referent(c);
			}
		}
	}

	private void resolveParametersReference(Parametrized parametrized) {
		for (PropertyDescription parameter : parametrized.parameters())
			resolveParameterValue((Mogram) parametrized, parameter);
	}

	private void resolveParameterValue(Mogram mogram, PropertyDescription parameter) {
		if (parameter.values().isEmpty() || !areReferenceValues(parameter)) return;
		for (Object value : parameter.values()) {
			if (((Primitive.Reference) value).isEmpty()) continue;
			Mogram reference = resolveReferenceParameter(mogram, (Primitive.Reference) value);
			if (reference == null) reference = searchInMetaModel((Primitive.Reference) value);
			if (reference != null) {
				((Primitive.Reference) value).get().referent(reference);
				parameter.type(REFERENCE);
			}
		}
	}

	private Mogram searchInMetaModel(Primitive.Reference value) {
		if (language == null || language.metaLanguage().isEmpty()) return null;
		MogramRoot lModel = language.model();
		if (lModel == null) return null;
		return new ReferenceManager(lModel).resolvePropReference(value, lModel.components().get(0));
	}

	private Mogram resolveReferenceParameter(Mogram mogram, Primitive.Reference value) {
		return manager.resolvePropReference(value, mogram);
	}

	private boolean areReferenceValues(PropertyDescription parameter) {
		return parameter.values().get(0) instanceof Primitive.Reference;
	}

	private void resolveParent(Mogram mogram) throws DependencyException {
		if (mogram.parent() != null && !mogram.parent().resolved()) {
			Mogram parent = manager.resolveParent(mogram.parent().reference(), getMogramContainer(mogram.container()));
			if (parent == null) throw new DependencyException("reject.dependency.parent.mogram.not.found", mogram);
			else {
				((MogramImpl) mogram).parent(parent);
				parent.addChild(mogram);
			}
		}
	}

	private void resolveMogramReferences(Mogram mogram) throws DependencyException {
		for (MogramReference ref : mogram.referenceComponents()) {
			if (ref instanceof HasMogram h) {
				resolveMogramReference(h);
				resolveRules(h.container(), ref);
			}
		}
	}

	private void resolveMogramReference(HasMogram ref) throws DependencyException {
		if (ref.target().resolved()) return;
		Mogram target = manager.resolve(ref);
		if (target == null) throw new DependencyException("reject.dependency.reference.mogram.not.found", ref);
		else ref.target(target);
	}

	private void resolveProperties(Mogram mogram) throws DependencyException {
		for (Property p : mogram.properties()) {
			if (p instanceof ReferenceProperty) resolveProperty((ReferenceProperty) p, mogram);
			if (p.rule(PropertyCustomRule.class) != null) loadCustomRule(p);
		}
	}

	private void loadCustomRule(Property prop) {
		final PropertyCustomRule rule = prop.rule(PropertyCustomRule.class);
		final String source = rule.externalClass();
		File classFile = null;
		Class<?> aClass = null;
		if (workingPackage == null || rulesDirectory == null) {
			rulesNotLoaded.add(new DependencyException("impossible.load.rule.class", prop, rule.externalClass(), "Rules directory not found"));
			return;
		}
		try {
			if (loadedRules.containsKey(source)) aClass = loadedRules.get(source);
			else {
				classFile = CustomRuleLoader.compile(rule, workingPackage, rulesDirectory, semanticLib, tempDirectory);
				aClass = classFile != null ? CustomRuleLoader.load(rule, workingPackage, semanticLib, tempDirectory) : CustomRuleLoader.tryAsProvided(rule);
			}
		} catch (Exception e) {
			rulesNotLoaded.add(new DependencyException("impossible.load.rule.class", prop, rule.externalClass(), e.getMessage()));
			rule.qualifiedName(CustomRuleLoader.composeQualifiedName(workingPackage, rule.externalClass()));
		}
		if (aClass == null) {
			rulesNotLoaded.add(new DependencyException("impossible.load.rule.class", prop, rule.externalClass()));
			return;
		} else {
			loadedRules.put(source, aClass);
			if (classFile != null) model.addRule(source, tempDirectory);
		}
		if (prop.type().equals(Primitive.WORD)) {
			updateRule(prop, rule, aClass);
		} else {
			rule.setLoadedClass(aClass);
			rule.classFile(classFile);
		}
	}

	private void loadCustomRule(Element element, CustomRule rule) throws DependencyException {
		final String source = rule.externalClass();
		File classFile = null;
		Class<?> aClass;
		try {
			if (loadedRules.containsKey(source)) aClass = loadedRules.get(source);
			else {
				classFile = CustomRuleLoader.compile(rule, workingPackage, rulesDirectory, semanticLib, tempDirectory);
				aClass = classFile != null ? CustomRuleLoader.load(rule, workingPackage, semanticLib, tempDirectory) : CustomRuleLoader.tryAsProvided(rule);
			}
		} catch (Exception e) {
			rulesNotLoaded.add(new DependencyException("impossible.load.rule.class", element, rule.externalClass(), e.getMessage()));
			throw new DependencyException("impossible.load.rule.class", element, rule.externalClass(), e.getMessage().split("\n")[0]);
		}
		if (aClass != null) {
			loadedRules.put(source, aClass);
			if (classFile != null) model.addRule(source, tempDirectory);
			rule.setLoadedClass(aClass);
			rule.classFile(classFile);
		} else
			rulesNotLoaded.add(new DependencyException("impossible.load.rule.class", element, rule.externalClass(), "Class not found"));
	}

	private void updateRule(Property prop, PropertyCustomRule rule, Class<?> aClass) {
		if (aClass != null) {
			prop.rules().remove(rule);
			prop.add(new WordRule(collectEnums(Arrays.asList(aClass.getDeclaredFields())), aClass.getSimpleName()));
		}
	}

	private List<String> collectEnums(List<Field> fields) {
		return fields.stream().filter(Field::isEnumConstant).map(Field::getName).collect(Collectors.toList());
	}

	private void resolveProperty(ReferenceProperty prop, Mogram container) throws DependencyException {
		Mogram target = manager.resolve(prop, container);
		if (target != null) prop.target().referent(target);
		else throw new DependencyException("reject.reference.property.not.found", container, prop.target().reference());
		prop.add(createReferenceRule(prop));
		resolvePropDefaultValue(prop, container);
	}

	private void resolvePropDefaultValue(ReferenceProperty prop, Mogram container) throws DependencyException {
		if (prop.values().isEmpty() || !(prop.values().get(0) instanceof Primitive.Reference)) return;
		final List<Primitive.Reference> references = prop.values().stream().map(v -> ((Primitive.Reference) v)).toList();
		for (Primitive.Reference r : references) {
			if (r.isEmpty() || r.get().reference() == null) continue;
			Mogram target = manager.resolve(r.get(), container);
			if (target == null)
				throw new DependencyException("reject.reference.property.not.found", container, prop.target().reference());
			r.get().referent(target);
		}
	}

	private ReferenceRule createReferenceRule(ReferenceProperty prop) {
		return new ReferenceRule(collectTypes(prop.target().get()));
	}

	private Set<String> collectTypes(Mogram mogram) {
		Set<String> set = new HashSet<>();
		if (!mogram.is(Generalization)) set.add(mogram.qualifiedName());
		for (Mogram child : mogram.children())
			set.addAll(collectTypes(child));
		return set;
	}

	private ElementContainer getMogramContainer(ElementContainer reference) {
		ElementContainer container = reference;
		while (!(container instanceof MogramImpl)) {
			if (container.container() == null) break;
			container = container.container();
		}
		return container;
	}
}