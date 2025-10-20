package io.intino.test;

import io.intino.tara.Source.StringSource;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticFatalException;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.Rule;
import io.intino.tara.model.rules.Size;
import io.intino.tara.processors.SemanticAnalyzer;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import tara.dsl.Metta;
import tara.dsl.Triara;

import java.util.List;

public class SemanticTest {
	@Test
	public void meta1Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.minimumExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta2Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.propertiesExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta3Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.rulesExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			Mogram broker = model.components().get(0);
			List<Rule<?>> rules = broker.rulesOf(broker.components().get(0));
			Assert.assertTrue(rules.get(0) instanceof Size);
			Assert.assertEquals(0, ((Size) rules.get(0)).min());
			Assert.assertEquals(2, ((Size) rules.get(0)).max());
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta4Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.badReferencesExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta5Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.facetsExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta6Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.facetsOverridenExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			System.out.println(model);
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta7Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.badCompositionExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			Assert.fail();
		} catch (SemanticFatalException e) {
			printErrors(e);
		}
	}

	@Test
	public void meta8Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.badPropertiesExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			Assert.fail();
		} catch (SemanticFatalException e) {
			printErrors(e);
		}
	}

	@Test
	public void meta9Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.methodReferencesExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta10Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.complexExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta11Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.doubleNamedSize());
			new SemanticAnalyzer(model, new Metta()).analyze();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void triara1Test() throws SyntaxException {
		try {
			Model model = parse(M1Examples.m1TriaraCardinality());
			new SemanticAnalyzer(model, new Triara()).analyze();
			Assert.fail();
		} catch (SemanticFatalException e) {
			printErrors(e);
		}
	}

	private static Model parse(String example) throws SyntaxException {
		Parser parser = new Parser(new StringSource("file:///Metamodel.tara", example));
		return parser.convert(parser.parse());
	}

	private static void printErrors(SemanticFatalException e) {
		for (SemanticException exception : e.exceptions()) {
			System.out.println(exception.origin()[0].toString() + ": " + exception.getMessage() + "; line: " + exception.origin()[0].line());
		}
	}
}