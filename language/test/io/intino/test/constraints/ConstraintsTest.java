package io.intino.test.constraints;

import io.intino.tara.Language;
import io.intino.tara.Source;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.grammar.TaraGrammar;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.constraints.Constraint;
import io.intino.tara.processors.dependencyresolution.DependencyException;
import io.intino.tara.processors.dependencyresolution.DependencyResolver;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.parser.Parser;
import org.junit.Test;
import tara.dsl.Metta;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConstraintsTest {
	@Test
	public void c1() throws Exception {
		Model model = model(Models.m1());
		for (Constraint c : generate(Constraints.e1()))
			assertTrue(c.expression().toString() + ": ", c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c2_1() throws Exception {
		Model model = model(Models.m2_1());
		for (Constraint c : generate(Constraints.e2_1()))
			assertTrue(c.expression().toString() + ": ", c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c2_2() throws Exception {
		Model model = model(Models.m2_2());
		for (Constraint c : generate(Constraints.e2_2()))
			assertTrue(c.expression().toString() + ": ", c.evaluate(model.mograms().getFirst()));
		model = model(Models.m2_3());
		for (Constraint c : generate(Constraints.e2_2()))
			assertFalse(c.message(), c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c3() throws Exception {
		Model model = model(Models.m3());
		for (Constraint c : generate(Constraints.e3()))
			assertTrue(c.expression().toString() + ": ", c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c4() throws Exception {
		Model model = model(Models.m4());
		for (Constraint c : generate(Constraints.e4()))
			assertTrue(c.expression().toString() + ": ", c.evaluate(model.mograms().getFirst()));
	}


	@Test
	public void c5() throws Exception {
		Model model = model(Models.m5());
		for (Constraint c : generate(Constraints.e5()))
			assertTrue(c.expression().toString() + ": ", c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c6() throws Exception {
		Model model = model(Models.m6());
		for (Constraint c : generate(Constraints.r6()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c7() throws Exception {
		Model model = model(Models.m7());
		for (Constraint c : generate(Constraints.r7()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c8() throws Exception {
		Model model = model(Models.m8());
		for (Constraint c : generate(Constraints.r8()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c9() throws Exception {
		Model model = model(Models.m9());
		for (Constraint c : generate(Constraints.r9()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c10() throws Exception {
		Model model = model(Models.m10());
		for (Constraint c : generate(Constraints.e10()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c11() throws Exception {
		Model model = model(Models.m11());
		for (Constraint c : generate(Constraints.e11()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c12() throws Exception {
		Model model = model(Models.m12());
		for (Constraint c : generate(Constraints.e12_1()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst().component("Province").getFirst()));
		for (Constraint c : generate(Constraints.e12_2()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst().component("Province").getFirst()));
		for (Constraint c : generate(Constraints.e12_3()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst().component("Province").getFirst()));
	}

	@Test
	public void c13() throws Exception {
		Model model = model(Models.m13());
		for (Constraint c : generate(Constraints.e13()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst().component("Reaction").getFirst()));
	}

	@Test
	public void c14() throws Exception {
		Model model = model(Models.m13());
		for (Constraint c : generate(Constraints.e14()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst().component("Reaction").getFirst()));
	}

	@Test
	public void c15() throws Exception {
		Model model = model(Models.m15());
		for (Constraint c : generate(Constraints.e15()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst()));
	}

	@Test
	public void c16() throws Exception {
		Model model = model(Models.m16());
		for (Constraint c : generate(Constraints.e16()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(model.mograms().getFirst().component("Task").getFirst()));
	}


	@Test
	public void c17() throws Exception {
		Model model = model(Models.m16());
		Mogram mogram = model.mograms().getFirst().component("Task").getFirst();
		for (Constraint c : generate(Constraints.e17())) {
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(mogram));
		}
	}

	@Test
	public void c18() throws Exception {
		Model model = model(Models.m17());
		Mogram mogram = model.mograms().getFirst().component("Question").getFirst();
		for (Constraint c : generate(Constraints.e18()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(mogram));
	}

	@Test
	public void c19() throws Exception {
		Model model = model(Models.m17());
		Mogram mogram = model.mograms().getFirst();
		for (Constraint c : generate(Constraints.e19()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(mogram));
	}


	@Test
	public void c20() throws Exception {
		Model model = model(Models.m17());
		Mogram mogram = model.mograms().getFirst();
		for (Constraint c : generate(Constraints.e20()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(mogram));
	}

	@Test
	public void c21() throws Exception {
		Model model = model(Models.m21());
		Mogram mogram = model.mograms().getFirst();
		for (Constraint c : generate(Constraints.e21()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(mogram));
	}

	@Test
	public void c22() throws Exception {
		Model model = model(Models.m1());
		Mogram mogram = model.mograms().getFirst();
		for (Constraint c : generate(Constraints.e22()))
			assertFalse(c.expression().toString() + ": " + c.message(), c.evaluate(mogram));
	}

	@Test
	public void c23() throws Exception {
		Model model = model(Models.m22());
		Mogram mogram = model.mograms().getFirst();
		for (Constraint c : generate(Constraints.e23()))
			assertTrue(c.expression().toString() + ": " + c.message(), c.evaluate(mogram));
	}

	private static List<Constraint> generate(String example) throws SyntaxException {
		Source.StringSource source = new Source.StringSource("file:///Metamodel.tara", example);
		Parser parser = new Parser(source);
		TaraGrammar.RootContext root = parser.parse(false);
		return parser.convert(root).constraints();
	}

	private static Model model(String example) {
		Parser parser = new Parser(new Source.StringSource("file:///model.tara", example));
		Model model = null;
		try {
			model = parser.convert(parser.parse());
			dependencyResolver(model).resolve();
//			new SemanticAnalyzer(model, new Semantic()).analyze();
		} catch (SyntaxException | DependencyException e) {
			System.err.println(e.getMessage());
		}
		return model;
	}

	private static DependencyResolver dependencyResolver(Model model) {
		return new DependencyResolver(model, new Metta(), "io.intino.test", new File("temp/src/io/intino/test/model/rules"), new File(Language.class.getProtectionDomain().getCodeSource().getLocation().getFile()), new File("temp"));
	}
}