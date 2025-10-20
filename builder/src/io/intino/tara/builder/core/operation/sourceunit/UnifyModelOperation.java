package io.intino.tara.builder.core.operation.sourceunit;

import io.intino.builder.CompilerConfiguration;
import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.model.Mogram;
import io.intino.tara.processors.model.Model;

import java.io.File;
import java.net.URI;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static io.intino.builder.BuildConstants.PRESENTABLE_MESSAGE;

public class UnifyModelOperation extends SourceUnitCollectionOperation {
	private static final Logger LOG = Logger.getGlobal();
	private final CompilationUnit unit;
	private final CompilerConfiguration conf;

	public UnifyModelOperation(CompilationUnit unit) {
		this.unit = unit;
		this.conf = unit.configuration();
	}

	@Override
	public void call(Collection<SourceUnit> sources) {
		try {
			if (unit.configuration().isVerbose())
				unit.configuration().out().println(PRESENTABLE_MESSAGE + "Tarac: Merging to global models");
			unit.model(merge(sources));
		} catch (Throwable e) {
			LOG.log(Level.SEVERE, "Error merging sources representations: " + e.getMessage(), e);
		}
	}

	public Model merge(Collection<SourceUnit> sources) {
		Model model = new Model(uri(sources));
		model.languageName(conf.dsl().artifactId());
		model.setResourcesRoot(conf.resDirectory());
		sources.forEach(unit -> unit.model().mograms()
				.forEach(c -> model.add(c, unit.model().rulesOf(c))));
		model.constraints(sources.stream().flatMap(u -> u.model().constraints().stream()).collect(Collectors.toList()));
		for (Mogram mogram : model.mograms()) mogram.container(model);
		return model;
	}

	private URI uri(Collection<SourceUnit> sources) {
		return URI.create(conf.project() != null ? conf.project() + "." + conf.dsl().outDsl() :
				getPresentableName(sources));
	}

	private String getPresentableName(Collection<SourceUnit> sources) {
		final String name = new File(sources.iterator().next().uri()).getName();
		return name.substring(0, name.lastIndexOf("."));
	}
}