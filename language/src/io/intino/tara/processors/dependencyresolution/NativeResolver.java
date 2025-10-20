package io.intino.tara.processors.dependencyresolution;

import io.intino.tara.model.*;
import io.intino.tara.model.Primitive.Expression;
import io.intino.tara.model.Primitive.MethodReference;
import io.intino.tara.model.rules.Size;
import io.intino.tara.model.rules.property.*;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.model.MogramImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class NativeResolver {
	private static final Logger LOG = Logger.getGlobal();
	private final Model model;
	private final File functionsDirectory;

	public NativeResolver(Model model, File functionsDirectory) {
		this.model = model;
		this.functionsDirectory = functionsDirectory;
	}

	public void resolve() throws DependencyException {
		for (Mogram mogram : model.mograms()) resolve(mogram);
	}

	private void resolve(Mogram mogram) throws DependencyException {
		if (!(mogram instanceof MogramImpl)) return;
		resolveNative(mogram.properties());
		resolveNative(mogram.parameters());
		for (Mogram include : mogram.mograms()) resolve(include);
	}

	private void resolveNative(List<? extends Valued> valuedList) throws DependencyException {
		for (Valued valued : valuedList) {
			for (Rule<?> rule : List.copyOf(valued.rules())) {
				if (rule instanceof Size) continue;
				if (rule instanceof FunctionRule ||
					(!valued.values().isEmpty() && (valued.values().get(0) instanceof Expression || valued.values().get(0) instanceof MethodReference)) ||
					(valued instanceof Property p && p.annotations().contains(Annotation.Reactive)))
					fillRule(valued, rule);
			}
		}
	}

	private void fillRule(Valued valued, Rule<?> rule) throws DependencyException {
		if (rule == null)
			valued.add(new FunctionRule("", "", new ArrayList<>()));
		else if (rule instanceof ReferenceRule) {
			valued.rules().remove(rule);
			valued.add(new NativeReferenceRule(((ReferenceRule) rule).allowedReferences()));
		} else if (rule instanceof WordRule) {
			valued.rules().remove(rule);
			if (((WordRule) rule).externalClass() == null) valued.add(new NativeWordRule(((WordRule) rule).words()));
			else valued.add(new NativeCustomWordRule(((WordRule) rule).words(), ((WordRule) rule).externalClass()));
		} else if (rule instanceof TypeRule) valued.rules().remove(rule);
		if (rule instanceof FunctionRule) fillInfo(valued, (FunctionRule) rule);
	}

	private void fillInfo(Valued valued, FunctionRule rule) throws DependencyException {
		if (valued instanceof Property && valued.type().equals(Primitive.FUNCTION))
			fillPropertyInfo((Property) valued, rule);
	}

	private void fillPropertyInfo(Property prop, FunctionRule rule) throws DependencyException {
		if (functionsDirectory == null || !functionsDirectory.exists())
			throw new DependencyException("reject.nonexistent.functions.directory", prop);
		File[] files = functionsDirectory.listFiles((dir, filename) -> filename.endsWith(".java") && filename.substring(0, filename.lastIndexOf(".")).equalsIgnoreCase(rule.interfaceClass()));
		if ((files != null ? files.length : 0) == 0)
			throw new DependencyException("reject.nonexistent.property.rule", prop);
		final String text = readFile(files[0]);
		final String signature = getSignature(text);
		if (signature.isEmpty()) throw new DependencyException("reject.native.signature.not.found", prop);
		else rule.signature(signature);
		rule.imports(getInterfaceImports(Arrays.asList(text.split("\n"))));
	}

	private String getSignature(String text) {
		text = text.substring(text.indexOf("{") + 1, text.indexOf(";", text.indexOf("{") + 1)).trim();
		text = text.replaceAll("//.*\n", "");
		if (!text.startsWith("public")) text = "public " + text;
		return text;
	}

	private List<String> getInterfaceImports(List<String> text) {
		return text.stream().map(String::trim).filter(trim -> trim.startsWith("import ")).distinct().collect(Collectors.toList());
	}

	private String readFile(File file) {
		try {
			return new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			LOG.severe("File cannot be read: " + file.getAbsolutePath());
			return "";
		}
	}
}