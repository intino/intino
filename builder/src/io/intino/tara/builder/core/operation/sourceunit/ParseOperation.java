package io.intino.tara.builder.core.operation.sourceunit;

import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.errorcollection.ErrorCollector;
import io.intino.tara.builder.core.errorcollection.TaraException;
import io.intino.tara.builder.core.errorcollection.message.Message;
import io.intino.tara.language.grammar.SyntaxException;

import java.util.logging.Level;
import java.util.logging.Logger;

import static io.intino.builder.BuildConstants.PRESENTABLE_MESSAGE;

public class ParseOperation extends SourceUnitOperation {
	private static final Logger LOG = Logger.getGlobal();
	private final CompilationUnit unit;
	private final ErrorCollector errorCollector;

	public ParseOperation(CompilationUnit unit) {
		this.unit = unit;
		this.errorCollector = unit.getErrorCollector();
	}

	@Override
	public void call(SourceUnit source) {
		try {
			if (unit.configuration().isVerbose())
				unit.configuration().out().println(PRESENTABLE_MESSAGE + "Parsing " + source.uri());
			source.parse();
			errorCollector.failIfErrors();
		} catch (TaraException e) {
			if (e.getCause() instanceof SyntaxException) {
				LOG.log(Level.SEVERE, "Syntax error during Parsing: " + e.getMessage());
				errorCollector.addError(Message.create((SyntaxException) e.getCause(), source));
			} else {
				LOG.log(Level.SEVERE, "Error during Parsing: " + e.getMessage());
				errorCollector.addError(Message.create(e.getMessage(), source));
			}
		} catch (io.intino.tara.language.grammar.SyntaxException e) {
			LOG.log(Level.SEVERE, "Syntax error during Parsing: " + e.getMessage());
			errorCollector.addError(Message.create(e, source));
		}
	}
}