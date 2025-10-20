package io.intino.test.constraints;

import io.intino.tara.language.grammar.TaraLexer;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

import java.nio.charset.Charset;

import static io.intino.tara.language.grammar.TaraLexer.SPACES;
import static org.antlr.v4.runtime.CharStreams.fromString;

public class ConstraintLexerTest {

	@Test
	public void r1Test() {
		test(Constraints.e1());
	}

	@Test
	public void r2Test() {
		test(Constraints.e2_1());
		test(Constraints.e2_2());
	}

	@Test
	public void r5Test() {
		test(Constraints.e5());
	}


	@Test
	public void r10Test() {
		test(Constraints.e10());
	}

	private void test(String r1) {
		TaraLexer lexer = new TaraLexer(fromString(r1 + "\n", Charset.defaultCharset().name()));
		lexer.reset();
		showTokens(lexer);
	}

	private void showTokens(TaraLexer lexer) {
		Token token;
		while ((token = lexer.nextToken()).getType() != Token.EOF) {
			if (token.getType() == SPACES) continue;
			String tokenName = lexer.getVocabulary().getSymbolicName(token.getType());
			System.out.println("Mode: " + TaraLexer.modeNames[lexer._mode] + "; Token: " + token.getText() + " | Tipo: " + tokenName);
		}
	}
}
