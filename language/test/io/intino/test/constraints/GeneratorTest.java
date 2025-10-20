package io.intino.test.constraints;

import io.intino.tara.Source;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.model.constraints.Constraint;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.parser.Parser;
import org.junit.Test;

import java.util.List;

public class GeneratorTest {
	@Test
	public void r1Test() throws SyntaxException {
		var root = generate(Constraints.e1());
	}

	@Test
	public void r2Test() throws SyntaxException {
		var root = generate(Constraints.e2_1());
		root = generate(Constraints.e2_2());
	}

	@Test
	public void r3Test() throws SyntaxException {
		var root = generate(Constraints.e3());
	}

	@Test
	public void r4Test() throws SyntaxException {
		var root = generate(Constraints.e4());
	}

	@Test
	public void r5Test() throws SyntaxException {
		var root = generate(Constraints.e5());
	}


	@Test
	public void r6Test() throws SyntaxException {
		var root = generate(Constraints.r6());
	}


	@Test
	public void r7Test() throws SyntaxException {
		var root = generate(Constraints.r7());
	}


	@Test
	public void r8Test() throws SyntaxException {
		var root = generate(Constraints.r8());
	}


	@Test
	public void r9Test() throws SyntaxException {
		var root = generate(Constraints.r9());
	}


	@Test
	public void r10Test() throws SyntaxException {
		var root = generate(Constraints.e10());
	}

	@Test
	public void r11Test() throws SyntaxException {
		var root = generate(Constraints.e11());
	}

	@Test
	public void r12Test() throws SyntaxException {
		var root = generate(Constraints.e12_1());
		root = generate(Constraints.e12_2());
	}

	@Test
	public void r13Test() throws SyntaxException {
		var root = generate(Constraints.e13());
	}

	@Test
	public void r14Test() throws SyntaxException {
		var root = generate(Constraints.e14());
	}

	@Test
	public void r15Test() throws SyntaxException {
		var root = generate(Constraints.e15());
	}

	@Test
	public void r16Test() throws SyntaxException {
		var root = generate(Constraints.e16());
	}

	@Test
	public void r17Test() throws SyntaxException {
		var root = generate(Constraints.e17());
	}

	@Test
	public void r18Test() throws SyntaxException {
		var root = generate(Constraints.e18());
	}

	@Test
	public void r19Test() throws SyntaxException {
		var root = generate(Constraints.e19());
	}

	@Test
	public void r20Test() throws SyntaxException {
		var root = generate(Constraints.e20());
	}

	@Test
	public void r21Test() throws SyntaxException {
		var root = generate(Constraints.e21());
	}

	@Test
	public void r22Test() throws SyntaxException {
	}

	private static List<Constraint> generate(String example) throws SyntaxException {
		Parser parser = new Parser(new Source.StringSource("file:///Metamodel.tara", example));
		Model model = parser.convert(parser.parse(true));
		return model.constraints();
	}
}