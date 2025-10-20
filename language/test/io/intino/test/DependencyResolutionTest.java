package io.intino.test;

import io.intino.tara.Language;
import io.intino.tara.Source;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticFatalException;
import io.intino.tara.processors.SemanticAnalyzer;
import io.intino.tara.processors.dependencyresolution.DependencyException;
import io.intino.tara.processors.dependencyresolution.DependencyResolver;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import tara.dsl.Metta;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DependencyResolutionTest {

	@Test
	public void meta1Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.minimumExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			dependencyResolver(model).resolve();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta2Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.propertiesExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			dependencyResolver(model).resolve();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta3Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.rulesExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			dependencyResolver(model).resolve();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta4Test() throws SyntaxException {
		Model model = parse(M2Examples.badReferencesExample());
		try {
			new SemanticAnalyzer(model, new Metta()).analyze();
			dependencyResolver(model).resolve();
			Assert.fail();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);
		}
	}

	@Test
	public void meta5Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.facetsExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			dependencyResolver(model).resolve();
			Assert.fail();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);

		}
	}

	@Test
	public void meta6Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.facetsOverridenExample());
			new SemanticAnalyzer(model, new Metta()).analyze();
			dependencyResolver(model).resolve();
			System.out.println(model);
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);
			Assert.fail();
		}
	}


	@Test
	public void meta7Test() throws SyntaxException {
		Model model = parse(M2Examples.referencesExample());
		try {
			new SemanticAnalyzer(model, new Metta()).analyze();
			DependencyResolver resolver = dependencyResolver(model);
			resolver.resolve();
			Assert.assertEquals(1, resolver.rulesNotLoaded().size());
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);
			Assert.fail();
		}
	}


	@Test
	public void meta8Test() throws SyntaxException {
		try {
			Model model = parse(M2Examples.references2Example());
			DependencyResolver resolver = dependencyResolver(model);
			new SemanticAnalyzer(model, new Metta()).analyze();
			resolver.resolve();
			Assert.assertEquals(1, resolver.rulesNotLoaded().size());
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	@Test
	public void meta9Test() throws IOException, SyntaxException {
		Model model = parse(Files.readString(new File("../test-playground/legio/src/io/intino/legio/model/Main.tara").toPath()));
		try {
			new SemanticAnalyzer(model, new Metta()).analyze();
			DependencyResolver resolver = dependencyResolver(model);
			resolver.resolve();
		} catch (SemanticFatalException e) {
			printErrors(e);
			Assert.fail();
		} catch (DependencyException e) {
			printErrors(e);
			Assert.fail();
		}
	}

	private static DependencyResolver dependencyResolver(Model model) {
		return new DependencyResolver(model, new Metta(), "io.intino.test", new File("temp/src/io/intino/test/model/rules"), new File(Language.class.getProtectionDomain().getCodeSource().getLocation().getFile()), new File("temp"));
	}

	private static Model parse(String example) throws SyntaxException {
		Parser parser = new Parser(new Source.StringSource("file:///Metamodel.tara", example));
		return parser.convert(parser.parse());
	}

	private static void printErrors(SemanticFatalException e) {
		for (SemanticException exception : e.exceptions()) {
			System.out.println(exception.origin()[0].toString() + ": " + exception.getMessage());
		}
	}

	private static void printErrors(DependencyException e) {
		System.out.println(e.getElement().toString() + ": " + e.getMessage());
	}
}
