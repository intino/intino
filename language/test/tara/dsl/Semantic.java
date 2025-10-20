package tara.dsl;

import io.intino.tara.model.Level;
import io.intino.tara.model.MogramRoot;
import io.intino.tara.model.NamedReference;
import io.intino.tara.model.Primitive;
import io.intino.tara.model.rules.Size;
import io.intino.tara.model.rules.composition.ConstraintRule;
import io.intino.tara.model.rules.property.ReferenceRule;
import io.intino.tara.model.rules.property.WordRule;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Locale;

import static io.intino.tara.language.semantics.constraints.RuleFactory.*;

public class Semantic extends io.intino.tara.Tara {
	private static io.intino.tara.processors.model.Model model = null;

	public Semantic() {
		def("").with(context(null).has(component("Interval", List.of(new Size(0, 2147483647), new ConstraintRule(new NamedReference(model().constraint("R1"), "R1")))), component("Service", List.of(new Size(0, 2147483647), new ConstraintRule(new NamedReference(model().constraint("R2"), "R2")))), component("Server", List.of(new Size(0, 2147483647), new ConstraintRule(new NamedReference(model().constraint("R3"), "R3")))), component("Cycle", List.of(new Size(0, 2147483647))), component("DataSource", List.of(new Size(0, 2147483647))), component("DataType", List.of(new Size(0, 2147483647))), component("Group", List.of(new Size(0, 2147483647))), component("Member", List.of(new Size(0, 2147483647))), component("Component", List.of(new Size(0, 2147483647))), component("Port", List.of(new Size(0, 2147483647))), component("StateMachine", List.of(new Size(0, 2147483647))), component("StateMachine2", List.of(new Size(0, 2147483647))), component("Region", List.of(new Size(0, 2147483647))), component("Country", List.of(new Size(0, 2147483647))), component("Pathway", List.of(new Size(0, 2147483647))), component("Variable", List.of(new Size(0, 2147483647))), component("Process", List.of(new Size(0, 2147483647))), component("Survey", List.of(new Size(0, 2147483647))), component("Person", List.of(new Size(0, 2147483647)))));
		Split20.load(this);
		Split21.load(this);
		Split22.load(this);
		Split23.load(this);
		Split24.load(this);
		Split25.load(this);
		Split26.load(this);
	}

	private static class Split20 {
		private static void load(Semantic self) {
			self.def("Interval").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("start", Primitive.INTEGER, "", 0, Level.M2, List.of(new Size(1, 1))), property("end", Primitive.INTEGER, "", 1, Level.M2, List.of(new Size(1, 1)))));
			self.def("Service").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("kind", Primitive.WORD, "", 0, Level.M2, List.of(new Size(1, 1), new WordRule(List.of("internal", "external")))), property("url", Primitive.STRING, "", 1, Level.M2, List.of(new Size(1, 1)))));
			self.def("Server").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("ip", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 1))), property("port", Primitive.INTEGER, "", 1, Level.M2, List.of(new Size(1, 1)))));
			self.def("Cycle").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("min", Primitive.INTEGER, "", 0, Level.M2, List.of(new Size(1, 1))), property("max", Primitive.INTEGER, "", 1, Level.M2, List.of(new Size(1, 1)))));
			self.def("DataSource").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("url", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 1)))));
		}
	}
	private static class Split21 {
		private static void load(Semantic self) {
			self.def("DataType").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("label", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 1)))));
			self.def("Group").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("members", Primitive.REFERENCE, "", 0, Level.M2, List.of(new Size(1, 2147483647), new ReferenceRule(List.of("Member")))), property("name", Primitive.STRING, "", 1, Level.M2, List.of(new Size(1, 1)))));
			self.def("Member").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Component").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("ports", Primitive.REFERENCE, "", 0, Level.M2, List.of(new Size(1, 2147483647), new ReferenceRule(List.of("Port"))))));
			self.def("Port").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("value", Primitive.INTEGER, "", 0, Level.M2, List.of(new Size(1, 1)))));
		}
	}
	private static class Split22 {
		private static void load(Semantic self) {
			self.def("StateMachine").with(self.context(Level.M1, "Concept", "MetaConcept").has(component("StateMachine.State", List.of(new Size(0, 2147483647))), property("initial", Primitive.REFERENCE, "", 0, Level.M2, List.of(new Size(1, 1), new ReferenceRule(List.of("StateMachine.State"))))));
			self.def("StateMachine.State").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("StateMachine2").with(self.context(Level.M1, "Concept", "MetaConcept").has(component("StateMachine2.State", List.of(new Size(0, 2147483647)))));
			self.def("StateMachine2.State").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("initial", Primitive.BOOLEAN, "", 0, Level.M2, List.of(new Size(1, 1)))));
			self.def("Region").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("population", Primitive.INTEGER, "", 0, Level.M2, List.of(new Size(1, 1))), property("adjacents", Primitive.REFERENCE, "", 1, Level.M2, List.of(new Size(0, 2147483647), new ReferenceRule(List.of("Region"))))));
		}
	}
	private static class Split23 {
		private static void load(Semantic self) {
			self.def("Country").with(self.context(Level.M1, "Concept", "MetaConcept").has(component("Country.Province", List.of(new Size(0, 2147483647)))));
			self.def("Country.Province").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("neighbors", Primitive.REFERENCE, "", 0, Level.M2, List.of(new Size(1, 2147483647), new ReferenceRule(List.of("Country.Province"))))));
			self.def("Pathway").with(self.context(Level.M1, "Concept", "MetaConcept").has(component("Pathway.Molecule", List.of(new Size(0, 2147483647))), component("Pathway.Reaction", List.of(new Size(0, 2147483647)))));
			self.def("Pathway.Molecule").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Pathway.Reaction").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("input", Primitive.REFERENCE, "", 0, Level.M2, List.of(new Size(1, 2147483647), new ReferenceRule(List.of("Pathway.Molecule")))), property("output", Primitive.REFERENCE, "", 1, Level.M2, List.of(new Size(1, 2147483647), new ReferenceRule(List.of("Pathway.Molecule"))))));
		}
	}
	private static class Split24 {
		private static void load(Semantic self) {
			self.def("Variable").with(self.context(Level.M1, "Concept", "MetaConcept").has(component("Variable.Length", List.of(new Size(0, 2147483647))), facet("Variable.Text", false, false, new String[]{}, new String[]{}), facet("Variable.Number", false, false, new String[]{}, new String[]{}), facet("Variable.Identifier", false, false, new String[]{}, new String[]{})));
			self.def("Variable.Text").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Variable.Number").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Variable.Identifier").with(self.context(Level.M1, "Concept", "MetaConcept"));
			self.def("Variable.Length").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("max", Primitive.INTEGER, "", 0, Level.M2, List.of(new Size(1, 1)))));
		}
	}
	private static class Split25 {
		private static void load(Semantic self) {
			self.def("Process").with(self.context(Level.M1, "Concept", "MetaConcept").has(component("Process.Task", List.of(new Size(0, 2147483647)))));
			self.def("Process.Task").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("depends", Primitive.REFERENCE, "", 0, Level.M2, List.of(new Size(1, 2147483647), new ReferenceRule(List.of("Process.Task"))))));
			self.def("Survey").with(self.context(Level.M1, "Concept", "MetaConcept").has(component("Survey.Question", List.of(new Size(0, 2147483647)))));
			self.def("Survey.Question").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("text", Primitive.STRING, "", 0, Level.M2, List.of(new Size(1, 1))), property("next", Primitive.REFERENCE, "", 1, Level.M2, List.of(new Size(0, 1), new ReferenceRule(List.of("Survey.Question")))), property("points", Primitive.INTEGER, "", 2, Level.M2, List.of(new Size(1, 1))), facet("Survey.Question.Required", false, false, new String[]{}, new String[]{})));
			self.def("Survey.Question.Required").with(self.context(Level.M1, "Concept", "MetaConcept"));
		}
	}
	private static class Split26 {
		private static void load(Semantic self) {
			self.def("Person").with(self.context(Level.M1, "Concept", "MetaConcept").has(property("heights", Primitive.INTEGER, "", 0, Level.M2, List.of(new Size(1, 2147483647)))));
		}
	}

	@Override
	public String languageName() {
		return "semantic";
	}

	@Override
	public Locale locale() {
		return new Locale("es", "Spain", "es_ES");
	}

	@Override
	public MogramRoot model() {
		try {
			if (model != null) return model;
			return model = (io.intino.tara.processors.model.Model) new ObjectInputStream(this.getClass().getResourceAsStream("/io/quassar/semantic-1.1.2.obj")).readObject();
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