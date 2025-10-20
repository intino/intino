package io.intino.tara.builder.core.operation.model;

import io.intino.tara.builder.codegeneration.language.LanguageSerializer;
import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.Phases;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.errorcollection.TaraException;
import io.intino.tara.model.Level;
import io.intino.tara.processors.model.Model;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static io.intino.builder.BuildConstants.PRESENTABLE_MESSAGE;
import static java.util.logging.Level.SEVERE;

public class GenerateLanguageOperation extends ModelOperation {
	private static final Logger LOG = Logger.getGlobal();

	public GenerateLanguageOperation(CompilationUnit unit) {
		super(unit);
	}

	@Override
	public void call(Model model) {
		try {
			if (model.mograms().stream().allMatch(m -> m.level().equals(Level.M1))) return;
			if (unit.configuration().isVerbose())
				unit.configuration().out().println(PRESENTABLE_MESSAGE + "[" + unit.configuration().module() + " - " + unit.configuration().dsl().outDsl() + "] Generating language...");
			if (unit.configuration().dsl().outDsl() == null) throw new TaraException("No Dsl found");
			File outputFile = new LanguageSerializer(unit.language(), unit.configuration(), model).serialize();
			unit.getErrorCollector().failIfErrors();
			unit.getSourceUnits().values().forEach(s -> unit.addOutputItems(Map.of(s.uri().getPath(), List.of(outputFile.getAbsolutePath()))));
		} catch (TaraException e) {
			LOG.log(SEVERE, "Error during language generation: " + e.getMessage() + "\n", e);
			throw new CompilationFailedException(Phases.LANGUAGE_GENERATION, unit, e);
		}
	}
}