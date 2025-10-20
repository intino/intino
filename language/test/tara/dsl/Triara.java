package tara.dsl;

import io.intino.tara.model.Level;
import io.intino.tara.model.MogramRoot;
import io.intino.tara.model.Primitive;
import io.intino.tara.model.rules.Size;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Locale;

import static io.intino.tara.language.semantics.constraints.RuleFactory.*;

public class Triara extends io.intino.tara.Tara {
	private static io.intino.tara.processors.model.Model model = null;

	public Triara() {
		def("").with(context(null).has(component("Stage", List.of(new Size(0, 1), new Size(1, 2147483647))), component("Triples", List.of(new Size(0, 2147483647)))));
		Split3.load(this);
		Split4.load(this);
		Split5.load(this);
		Split6.load(this);
	}

	private static class Split3 {
		private static void load(Triara self) {
			self.def("Stage").with(self.context(Level.M1, "Concept", "MetaConcept").has(facet("Stage.Definition", false, false, new String[]{}, new String[]{}).has(property("initial", Primitive.RESOURCE, "Definition", 0, Level.M2, List.of(new Size(1, 1)))), facet("Stage.Transformation", false, false, new String[]{}, new String[]{}).has(property("from", Primitive.STRING, "Transformation", 0, Level.M2, List.of(new Size(1, 1))))));
			self.def("Stage.Definition").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("initial", Primitive.RESOURCE, "Definition", 0, Level.M2, List.of(new Size(1, 1)))));
			self.def("Stage.Transformation").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("from", Primitive.STRING, "Transformation", 0, Level.M2, List.of(new Size(1, 1)))));
			self.def("Triples").with(self.context(Level.M1, "Concept", "MetaConcept").has(oneOf(List.of(new Size(1, 1)), component("Triples.Remove", List.of(new Size(1, 1))), component("Triples.Fix", List.of(new Size(1, 1)))), property("subject", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 1))), property("predicate", Primitive.STRING, "", 1, Level.M2, List.of(new Size(1, 1))), property("value", Primitive.STRING, "", 2, Level.M2, List.of(new Size(1, 1)))));
			self.def("Triples.Remove").with(self.context(Level.M1, "Concept", "MetaConcept"));
		}
	}

	private static class Split4 {
		private static void load(Triara self) {
			self.def("Triples.Fix").with(self.context(Level.M1, "Concept", "MetaConcept").has(component("Triples.Fix.ChangeCase", List.of(new Size(0, 2147483647))), component("Triples.Fix.Delete", List.of(new Size(0, 2147483647))), component("Triples.Fix.Trim", List.of(new Size(0, 2147483647))), component("Triples.Fix.NormalizeSpaces", List.of(new Size(0, 2147483647))), component("Triples.Fix.Set", List.of(new Size(0, 2147483647))), component("Triples.Fix.Replace", List.of(new Size(0, 2147483647))), component("Triples.Fix.Canonicalize", List.of(new Size(0, 2147483647))), facet("Triples.Fix.Subject", false, false, new String[]{}, new String[]{}), facet("Triples.Fix.Predicate", false, false, new String[]{}, new String[]{}), facet("Triples.Fix.Value", false, false, new String[]{}, new String[]{})));
			self.def("Triples.Fix.Subject").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Triples.Fix.Predicate").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Triples.Fix.Value").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Triples.Fix.ChangeCase").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("mode", Primitive.WORD, "", 0, Level.M2, List.of(new Size(1, 1), new io.intino.tara.model.rules.property.WordRule(List.of("Lower", "Upper", "Capitalize", "Camel", "Snake", "Kebab"))))));
		}
	}

	private static class Split5 {
		private static void load(Triara self) {
			self.def("Triples.Fix.Delete").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("symbols", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 1)))));
			self.def("Triples.Fix.Trim").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Triples.Fix.NormalizeSpaces").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Triples.Fix.Set").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("value", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 1)))));
			self.def("Triples.Fix.Replace").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("target", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 1))), property("replacement", Primitive.STRING, "", 1, Level.M2, List.of(new Size(1, 1)))));
		}
	}

	private static class Split6 {
		private static void load(Triara self) {
			self.def("Triples.Fix.Canonicalize").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("variants", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 2147483647))), property("canonical", Primitive.STRING, "", 1, Level.M2, List.of(new Size(1, 1)))));
		}
	}

	@Override
	public String languageName() {
		return "triara";
	}

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

	@Override
	public MogramRoot model() {
		try {
			if (model != null) return model;
			return model = (io.intino.tara.processors.model.Model) new ObjectInputStream(this.getClass().getResourceAsStream("/io/quassar/monet/triara-1.0.0.obj")).readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String metaLanguage() {
		return "metta";
	}
}