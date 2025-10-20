package io.intino.test.constraints;

import io.intino.tara.Source;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.grammar.TaraGrammar;
import io.intino.tara.processors.parser.Parser;
import org.junit.Test;

public class ParserTest {
	@Test
	public void r1Test() throws SyntaxException {
		var root = parse(Constraints.e1());
	}

	@Test
	public void r2Test() throws SyntaxException {
		var root = parse(Constraints.e2_1());
		root = parse(Constraints.e2_2());
	}

	@Test
	public void r3Test() throws SyntaxException {
		var root = parse(Constraints.e3());
	}

	@Test
	public void r4Test() throws SyntaxException {
		var root = parse(Constraints.e4());
	}

	@Test
	public void r5Test() throws SyntaxException {
		var root = parse(Constraints.e5());
	}


	@Test
	public void r6Test() throws SyntaxException {
		var root = parse(Constraints.r6());
	}


	@Test
	public void r7Test() throws SyntaxException {
		var root = parse(Constraints.r7());
	}


	@Test
	public void r8Test() throws SyntaxException {
		var root = parse(Constraints.r8());
	}


	@Test
	public void r9Test() throws SyntaxException {
		var root = parse(Constraints.r9());
	}


	@Test
	public void r10Test() throws SyntaxException {
		var root = parse(Constraints.e10());
	}

	@Test
	public void r11Test() throws SyntaxException {
		var root = parse(Constraints.e11());
	}

	@Test
	public void r12Test() throws SyntaxException {
		var root = parse(Constraints.e12_1());
		root = parse(Constraints.e12_2());
	}

	@Test
	public void r13Test() throws SyntaxException {
		var root = parse(Constraints.e13());
	}

	@Test
	public void r14Test() throws SyntaxException {
		var root = parse(Constraints.e14());
	}

	@Test
	public void r15Test() throws SyntaxException {
		var root = parse(Constraints.e15());
	}

	@Test
	public void r16Test() throws SyntaxException {
		var root = parse(Constraints.e16());
	}

	@Test
	public void r17Test() throws SyntaxException {
		var root = parse(Constraints.e17());
	}

	@Test
	public void r18Test() throws SyntaxException {
		var root = parse(Constraints.e18());
	}

	@Test
	public void r19Test() throws SyntaxException {
		var root = parse(Constraints.e19());
	}

	@Test
	public void r20Test() throws SyntaxException {
		var root = parse(Constraints.e20());
	}

	@Test
	public void r21Test() throws SyntaxException {
		var root = parse(Constraints.e21());
	}

	@Test
	public void r22Test() throws SyntaxException {
//		var root = parse(io.intino.test.Examples.r22());
	}

	private static TaraGrammar.RootContext parse(String example) throws SyntaxException {
		return new Parser(new Source.StringSource("file:///Metamodel.tara", example)).parse(true);
	}
}