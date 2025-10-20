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

	public Metta() {
		def("").with(context(M3, "").has(
				component(CONCEPT, singletonList(MULTIPLE)),
				component(META_CONCEPT, singletonList(MULTIPLE))));
		def(CONCEPT).with(context(M2, META_CONCEPT).has(name(),
				component(CONCEPT, singletonList(MULTIPLE))));
		def(META_CONCEPT).with(context(M3, META_CONCEPT).has(name(),
				component(META_CONCEPT, singletonList(MULTIPLE)),
				component(CONCEPT, singletonList(MULTIPLE))));
	}

	@Override
	public String languageName() {
		return "Meta";
	}

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

	@Override
	public MogramRoot model() {
		Model model = new Model(null);
		MogramImpl concept = conceptMogram();
		model.add(concept, of(MULTIPLE));
		MogramImpl metaConcept = metaConceptMogram(concept);
		concept.addMetaMogram(metaConcept);
		model.add(metaConcept, of(MULTIPLE));
		return model;
	}

	private static MogramImpl conceptMogram() {
		MogramImpl mogram = emptyMogram();
		mogram.name(CONCEPT);
		mogram.type(META_CONCEPT);
		mogram.add(new HasMogram(mogram, null, null), of(MULTIPLE));
		mogram.add(new HasMogram(mogram, null, null), of(MULTIPLE));
		return mogram;
	}

	private MogramImpl metaConceptMogram(MogramImpl concept) {
		MogramImpl mogram = emptyMogram();
		mogram.name(META_CONCEPT);
		mogram.add(new HasMogram(mogram, null, null), of(MULTIPLE));
		mogram.add(new HasMogram(concept, null, null), of(MULTIPLE));
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