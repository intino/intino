package io.intino.test;

import io.intino.tara.language.grammar.TaraLexer;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class LexTest {

	@Test
	public void meta1Test() {
		TaraLexer lexer = new TaraLexer(fromString(M2Examples.minimumExample() + "\n", Charset.defaultCharset().name()));
		lexer.reset();
		showTokens(lexer);
	}

	@Test
	public void metta2Test() {
		TaraLexer lexer = new TaraLexer(fromString(M2Examples.multilineExample() + "\n", Charset.defaultCharset().name()));
		lexer.reset();
		showTokens(lexer);
	}

	private void showTokens(TaraLexer lexer) {
		Token token;
		while ((token = lexer.nextToken()).getType() != Token.EOF) {
			String tokenName = lexer.getVocabulary().getSymbolicName(token.getType());
			System.out.println("Mode: " + TaraLexer.modeNames[lexer._mode] + "; Token: " + token.getText() + " | Tipo: " + tokenName);
		}
	}
}
