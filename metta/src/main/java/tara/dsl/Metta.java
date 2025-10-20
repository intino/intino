package tara.dsl;

import io.intino.tara.Tara;
import io.intino.tara.model.MogramRoot;
import io.intino.tara.model.rules.Size;
import io.intino.tara.processors.model.HasMogram;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.model.MogramImpl;

import java.util.Locale;

import static io.intino.tara.FoundationalTypes.CONCEPT;
import static io.intino.tara.FoundationalTypes.META_CONCEPT;
import static io.intino.tara.language.semantics.constraints.RuleFactory.component;
import static io.intino.tara.language.semantics.constraints.RuleFactory.name;
import static io.intino.tara.model.Level.M2;
import static io.intino.tara.model.Level.M3;
import static java.util.Collections.singletonList;
import static java.util.List.of;

public class Metta extends Tara {
	private static final Size MULTIPLE = new Size(0, Integer.MAX_VALUE);
	private final String name;

	public Metta() {
		def("").with(context(M3, "").has(
				component(CONCEPT, singletonList(MULTIPLE)),
				component(META_CONCEPT, singletonList(MULTIPLE))));
		def(CONCEPT).with(context(M2, META_CONCEPT).has(name(),
				component(CONCEPT, singletonList(MULTIPLE))));
		def(META_CONCEPT).with(context(M3, META_CONCEPT).has(name(),
				component(META_CONCEPT, singletonList(MULTIPLE)),
				component(CONCEPT, singletonList(MULTIPLE))));
		var name = this.getClass().getSimpleName();
		this.name = name.substring(0, 1).toLowerCase() + name.substring(1);
	}

	@Override
	public String languageName() {
		return name;
	}

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

	@Override
	public MogramRoot model() {
		Model model = new Model(null);
		MogramImpl concept = conceptMogram();
		concept.container(model);
		model.add(concept, of(MULTIPLE));
		MogramImpl metaConcept = metaConceptMogram(concept);
		metaConcept.container(model);
		concept.addMetaMogram(metaConcept);
		model.add(metaConcept, of(MULTIPLE));
		return model;
	}

	private static MogramImpl conceptMogram() {
		MogramImpl concept = emptyMogram();
		concept.name(CONCEPT);
		concept.level(M2);
		concept.type(META_CONCEPT);
		HasMogram element = new HasMogram(concept, null, null);
		element.container(concept);
		element.container(concept);
		concept.add(element, of(MULTIPLE));
		return concept;
	}

	private MogramImpl metaConceptMogram(MogramImpl concept) {
		MogramImpl mogram = emptyMogram();
		mogram.name(META_CONCEPT);
		mogram.level(M3);
		HasMogram element = new HasMogram(mogram, null, null);
		element.container(mogram);
		mogram.add(element, of(MULTIPLE));
		HasMogram element1 = new HasMogram(concept, null, null);
		element1.container(mogram);
		mogram.add(element1, of(MULTIPLE));
		return mogram;
	}

	private static MogramImpl emptyMogram() {
		return new MogramImpl(null, null, 0, null);
	}

	@Override
	public String metaLanguage() {
		return "";
	}
}