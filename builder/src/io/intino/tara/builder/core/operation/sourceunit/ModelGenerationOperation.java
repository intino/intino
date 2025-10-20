package io.intino.tara.builder.core.operation.sourceunit;

import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.errorcollection.ErrorCollector;
import io.intino.tara.builder.core.errorcollection.message.Message;
import io.intino.tara.language.grammar.SyntaxException;

import java.util.logging.Level;
import java.util.logging.Logger;

import static io.intino.builder.BuildConstants.PRESENTABLE_MESSAGE;

public class ModelGenerationOperation extends SourceUnitOperation {
	private static final Logger LOG = Logger.getGlobal();
	private final ErrorCollector errorCollector;
	private final CompilationUnit unit;

	public ModelGenerationOperation(CompilationUnit unit) {
		this.unit = unit;
		this.errorCollector = unit.getErrorCollector();
	}

	@Override
	public void call(SourceUnit source) {
		try {
			if (unit.configuration().isVerbose())
				unit.configuration().out().println(PRESENTABLE_MESSAGE + "Converting " + source.uri());
			source.importData();
			errorCollector.failIfErrors();
		} catch (SyntaxException e) {
			LOG.log(Level.SEVERE, "Error during conversion: " + e.getMessage());
			errorCollector.addError(Message.create(e.getMessage(), source));
		}
	}
}
