package io.intino.tara.builder;

import io.intino.Configuration.Artifact.Dsl;
import io.intino.builder.BuildConstants;
import io.intino.builder.CompilationInfoExtractor;
import io.intino.builder.CompilerConfiguration;
import io.intino.builder.CompilerMessage;
import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.Phases;
import io.intino.tara.builder.core.SourceUnit;
import io.intino.tara.builder.core.operation.Operation;
import io.intino.tara.builder.utils.FileSystemUtils;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.AbstractMap.SimpleEntry;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static io.intino.builder.BuildConstants.*;

public class TaraCompilerRunner {
	private final boolean verbose;
	private final List<Class<? extends Operation>> codeGenerationOperations;
	private PrintStream out = System.out;

	public TaraCompilerRunner(boolean verbose, List<Class<? extends Operation>> codeGenerationOperations) {
		this.verbose = verbose;
		this.codeGenerationOperations = codeGenerationOperations;
	}

	public TaraCompilerRunner(boolean verbose) {
		this(verbose, List.of());
	}

	public void run(File argsFile) {
		final CompilerConfiguration config = new CompilerConfiguration();
		final Map<URI, Boolean> sources = new LinkedHashMap<>();
		CompilationInfoExtractor.getInfoFromArgsFile(argsFile.toURI(), config, sources);
		config.setVerbose(verbose);
		config.out(System.out);
		this.out = config.out();
		if (sources.isEmpty()) return;
		if (verbose) out.println(PRESENTABLE_MESSAGE + "Tarac: loading sources...");
		runCompiler(config, new FileSourceProvider(sources));
	}

	public void run(CompilerConfiguration config, final Map<File, Boolean> sources) {
		config.setVerbose(verbose);
		this.out = config.out();
		if (sources.isEmpty()) return;
		if (verbose) out.println(PRESENTABLE_MESSAGE + "Tarac: loading sources...");
		runCompiler(config, new FileSourceProvider(sources.entrySet().stream().map(e -> new SimpleEntry<>(e.getKey().toURI(), e.getValue())).collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue))));
	}

	public void run(CompilerConfiguration config, final SourceProvider sources) {
		config.setVerbose(verbose);
		this.out = config.out();
		if (sources.all().toList().isEmpty()) return;
		if (verbose) out.println(PRESENTABLE_MESSAGE + "Tarac: loading sources...");
		runCompiler(config, sources);
	}

	private void runCompiler(CompilerConfiguration config, SourceProvider sources) {
		final List<CompilerMessage> messages = new ArrayList<>();
		List<TaraCompiler.OutputItem> compiled = compile(config, sources, messages);
		if (verbose) report(sources, compiled);
		processErrors(messages);
		FileSystemUtils.removeDir(config.getTempDirectory());
	}

	private List<TaraCompiler.OutputItem> compile(CompilerConfiguration config, SourceProvider sources, List<CompilerMessage> messages) {
		List<TaraCompiler.OutputItem> compiled = new ArrayList<>();
//		if (!sources.containsValue(false)) CompilationUnit.cleanOut(config);
		if (!config.test()) compiled.addAll(compileSources(config, sources, messages));
		else compiled.addAll(compileTests(config, sources, messages));
		return compiled;
	}

	private List<TaraCompiler.OutputItem> compileSources(CompilerConfiguration config, SourceProvider sources, List<CompilerMessage> messages) {
		if (verbose) out.println(PRESENTABLE_MESSAGE + "Tarac: Compiling model...");
		out.println();
		final CompilationUnit unit = new CompilationUnit(config);
		addCodeGenerationOperations(unit);
		addSources(sources, unit);
		return new TaraCompiler(messages).compile(unit);
	}

	private void addCodeGenerationOperations(CompilationUnit unit) {
		for (Class<? extends Operation> codeGenerationOperation : codeGenerationOperations)
			try {
				unit.addPhaseOperation((Operation) codeGenerationOperation.getDeclaredConstructors()[0].newInstance(unit), Phases.CODE_GENERATION);
			} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
				Logger.getGlobal().log(Level.SEVERE, e.getMessage() == null ? e.getStackTrace()[0].toString() : e.getMessage());
			}
	}

	private void report(SourceProvider sources, List<TaraCompiler.OutputItem> compiled) {
		if (compiled.isEmpty()) reportNotCompiledItems(sources.all().map(s -> new File(s.uri())).toList());
		else reportCompiledItems(compiled);
		out.println();
	}

	private List<TaraCompiler.OutputItem> compileTests(CompilerConfiguration config, SourceProvider testFiles, List<CompilerMessage> compilerMessages) {
		if (testFiles.all().findAny().isEmpty()) return Collections.emptyList();
		if (verbose) out.println(PRESENTABLE_MESSAGE + "Tarac: compiling tests...");
		out.println();
		CompilerConfiguration testConf = config.clone();
		testConf.test(true);
		testConf.generationPackage(testConf.generationPackage() + ".test");
		if (config.dsl().outDsl() != null) testConf.dsl().artifactId(config.dsl().outDsl()).version(config.version());
		if (config.dsl().level() != null)
			testConf.dsl().level(Dsl.Level.values()[config.dsl().level().ordinal() == 0 ? 0 : config.dsl().level().ordinal() - 1]);
		List<TaraCompiler.OutputItem> outputs = new ArrayList<>();
		testFiles.all().forEach(t -> {
			testConf.dsl().outDsl(new File(t.uri()).getName());
			final CompilationUnit unit = new CompilationUnit(testConf);
			addSources(testFiles, unit);
			outputs.addAll(new TaraCompiler(compilerMessages).compile(unit));
		});
		return outputs;
	}

	private void processErrors(List<CompilerMessage> compilerMessages) {
		int errorCount = 0;
		for (CompilerMessage message : compilerMessages) {
			if (message.category().equals(CompilerMessage.ERROR)) {
				if (errorCount > 100) continue;
				errorCount++;
			}
			printMessage(message);
		}
	}

	private void addSources(SourceProvider srcFiles, final CompilationUnit unit) {
		srcFiles.all().forEach(s -> unit.addSource(new SourceUnit(s, unit.configuration(), unit.getErrorCollector())));
	}

	private void printMessage(CompilerMessage message) {
		out.print(MESSAGES_START);
		out.print(message.category());
		out.print(SEPARATOR);
		out.print(message.message());
		out.print(SEPARATOR);
		out.print(message.url());
		out.print(SEPARATOR);
		out.print(message.lineNum());
		out.print(SEPARATOR);
		out.print(message.columnNum());
		out.print(SEPARATOR);
		out.print(BuildConstants.MESSAGES_END);
		out.println();
	}

	private void reportCompiledItems(List<TaraCompiler.OutputItem> compiledFiles) {
		for (TaraCompiler.OutputItem compiledFile : compiledFiles) {
			out.print(COMPILED_START);
			out.print(compiledFile.getOutputPath());
			out.print(SEPARATOR);
			out.print(compiledFile.getSourceFile());
			out.print(COMPILED_END);
			out.println();
		}
	}

	private void reportNotCompiledItems(List<File> toRecompile) {
		for (File file : toRecompile) {
			out.print(TO_RECOMPILE_START);
			out.print(file.getAbsolutePath());
			out.print(TO_RECOMPILE_END);
			out.println();
		}
	}
}
