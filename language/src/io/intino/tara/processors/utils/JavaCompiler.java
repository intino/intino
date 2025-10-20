package io.intino.tara.processors.utils;

import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class JavaCompiler {

	public static void compile(File file, String classPath, File destination) throws Exception {
		compile(List.of(file), classPath, destination);
	}

	public static void compile(List<File> files, String classPath, File destination) throws Exception {
		javax.tools.JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
		Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromStrings(files.stream().map(File::getAbsolutePath).toList());
		final Collection<String> options = new ArrayList<>();
		options.add("--release");
		options.add("17");
		options.add("-d");
		options.add(destination.getAbsolutePath());
		options.add("-cp");
		options.add(classPath);
		CompilationTask task = compiler.getTask(null, fileManager, diagnostics, options, null, compilationUnits);
		if (!task.call()) {
			StringBuilder message = new StringBuilder();
			for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics())
				message.append(diagnostic.getMessage(Locale.ENGLISH)).append(" in ").append(diagnostic.getLineNumber()).append(":").append(diagnostic.getColumnNumber()).append("\n");
			throw new Exception(message.toString());
		}
		try {
			fileManager.close();
		} catch (IOException e) {
			throw new Exception("Error compiling language. " + e.getMessage());
		}
	}
}