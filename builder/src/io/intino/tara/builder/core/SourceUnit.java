package io.intino.tara.builder.core;

import io.intino.builder.CompilerConfiguration;
import io.intino.tara.Source;
import io.intino.tara.builder.core.errorcollection.ErrorCollector;
import io.intino.tara.builder.core.errorcollection.TaraException;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.language.grammar.TaraGrammar;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.parser.Parser;

import java.net.URI;

public class SourceUnit extends ProcessingUnit {
	private final Source source;
	private Model model;
	private Parser parser;
	private TaraGrammar.RootContext tree;

	public SourceUnit(Source source, CompilerConfiguration configuration, ErrorCollector er) {
		super(configuration, er);
		this.source = source;
		this.configuration = configuration;
		this.errorCollector = er;
	}

	public URI uri() {
		return source.uri();
	}

	public Model model() {
		return model;
	}

	public void parse() throws TaraException, SyntaxException {
		if (parser == null) {
			parser = new Parser(source);
			tree = parser.parse();
		}
	}

	public void importData() throws SyntaxException {
		model = parser.convert(tree);
	}

	public boolean isDirty() {
		return source.dirty();
	}
}