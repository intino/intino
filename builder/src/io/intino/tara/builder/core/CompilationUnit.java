package io.intino.tara.builder.core;

import io.intino.builder.CompilerConfiguration;
import io.intino.tara.Language;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.operation.Operation;
import io.intino.tara.builder.core.operation.model.*;
import io.intino.tara.builder.core.operation.setup.SetupConfigurationOperation;
import io.intino.tara.builder.core.operation.setup.SetupOperation;
import io.intino.tara.builder.core.operation.sourceunit.*;
import io.intino.tara.processors.model.Model;

import java.io.File;
import java.io.PrintStream;
import java.net.URI;
import java.util.*;
import java.util.stream.IntStream;

public final class CompilationUnit extends ProcessingUnit {
	private final Map<URI, SourceUnit> sourceUnits;
	private final LinkedList[] phaseOperations;
	private final Map<String, List<String>> outputItems = new HashMap<>();
	private final PrintStream out;
	private Model model;

	private Language language;

	public CompilationUnit(CompilerConfiguration configuration) {
		super(configuration, null);
		this.sourceUnits = new HashMap<>();
		this.out = configuration.out();
		this.phaseOperations = new LinkedList[Phases.ALL];
		IntStream.range(0, phaseOperations.length).forEach(i -> phaseOperations[i] = new LinkedList<>());
		addBasePhaseOperations();
	}

	public static void cleanOut(CompilerConfiguration configuration) {
		final String generationPackage = (configuration.generationPackage() == null ? configuration.module() : configuration.generationPackage()).replace(".", File.separator);
		File out = new File(configuration.genDirectory(), generationPackage.toLowerCase());
//		if (out.exists()) FileSystemUtils.removeDir(out); TODO
	}

	private void addBasePhaseOperations() {
		addPhaseOperation(new SetupConfigurationOperation(this), Phases.INITIALIZATION);
		addPhaseOperation(new ParseOperation(this), Phases.PARSING);
		addPhaseOperation(new ModelGenerationOperation(this), Phases.CONVERSION);
		addPhaseOperation(new UnifyModelOperation(this), Phases.CONVERSION);
		addPhaseOperation(new ModelDependencyResolutionOperation(this), Phases.DEPENDENCY_RESOLUTION);
		addPhaseOperation(new SemanticAnalysisOperation(this), Phases.SEMANTIC_ANALYSIS);
		addPhaseOperation(new MetricResolutionOperation(this), Phases.POST_ANALYSIS_RESOLUTION);
		addPhaseOperation(new NativeTransformationOperation(this), Phases.POST_ANALYSIS_RESOLUTION);
		addPhaseOperation(new GenerateLanguageOperation(this), Phases.LANGUAGE_GENERATION);
	}


	public void addPhaseOperation(Operation operation, int phase) {
		if (phase < Phases.FIRST || phase > Phases.LAST)
			throw new IllegalArgumentException("phase " + phase + " is unknown");
		if (!isExcludedPhase(phase)) this.phaseOperations[phase].add(operation);
	}

	private boolean isExcludedPhase(int phase) {
		return configuration.excludedInternalSteps().contains(phase);
	}

	public void addOutputItems(Map<String, List<String>> paths) {
		for (String source : paths.keySet()) {
			outputItems.putIfAbsent(source, new ArrayList<>());
			outputItems.get(source).addAll(paths.get(source));
		}
	}

	public void addSource(SourceUnit source) {
		URI uri = source.uri();
		for (SourceUnit su : sourceUnits.values())
			if (uri.equals(su.uri())) return;
		this.sourceUnits.put(uri, source);
	}

	public CompilationUnit setLanguage(Language language) {
		this.language = language;
		return this;
	}

	public Map<URI, SourceUnit> getSourceUnits() {
		return sourceUnits;
	}

	public void compile() throws CompilationFailedException {
		compile(Phases.ALL);
	}

	private void compile(int throughPhase) throws CompilationFailedException {
		gotoPhase(1);
		while ((Math.min(throughPhase, Phases.LAST) >= this.phase) && (this.phase <= Phases.LAST)) {
			processPhaseOperations(this.phase);
			completePhase();
			nextPhase();
			applyToSourceUnits(new MarkOperation(this));
		}
		this.errorCollector.failIfErrors();
	}

	private void applyToSourceUnits(SourceUnitOperation mark) throws CompilationFailedException {
		SourceUnit source;
		for (URI name : this.sourceUnits.keySet()) {
			source = this.sourceUnits.get(name);
			if ((source.phase < this.phase) || ((source.phase == this.phase) && (!source.phaseComplete)))
				mark.call(source);
		}
		getErrorCollector().failIfErrors();
	}

	private void processPhaseOperations(int ph) {
		List<Operation> ops = this.phaseOperations[ph];
		ops.forEach(this::doPhaseOperation);
	}

	private void doPhaseOperation(Operation operation) {
		if (operation instanceof SourceUnitOperation)
			applyToSourceUnits((SourceUnitOperation) operation);
		else if (operation instanceof SourceUnitCollectionOperation)
			((SourceUnitCollectionOperation) operation).call(sourceUnits.values());
		else if (operation instanceof ModelOperation)
			((ModelOperation) operation).call(model);
		else if (operation instanceof SetupOperation)
			((SetupOperation) operation).call();
	}

	public void model(Model model) {
		this.model = model;
	}

	public Map<String, List<String>> getOutputItems() {
		return outputItems;
	}

	public PrintStream out() {
		return out;
	}

	public Language language() {
		return this.language;
	}
}
