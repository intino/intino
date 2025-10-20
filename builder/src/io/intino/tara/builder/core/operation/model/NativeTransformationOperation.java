package io.intino.tara.builder.core.operation.model;

import io.intino.itrules.Formatter;
import io.intino.itrules.FrameBuilder;
import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.utils.FileSystemUtils;
import io.intino.tara.builder.utils.Format;
import io.intino.tara.model.*;
import io.intino.tara.model.Primitive.MethodReference;
import io.intino.tara.model.rules.property.FunctionRule;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.parser.NativeExtractor;

import java.io.File;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

import static io.intino.tara.model.Annotation.Reactive;
import static java.util.Collections.singletonList;

public class NativeTransformationOperation extends ModelOperation {
	private final File resources;
	private final File srcDirectory;

	public NativeTransformationOperation(CompilationUnit unit) {
		super(unit);
		this.resources = unit.configuration().resDirectory();
		this.srcDirectory = unit.configuration().srcDirectory();
	}

	@Override
	public void call(Model model) throws CompilationFailedException {
		for (Mogram mogram : model.mograms()) {
			findReactiveParameters(mogram).forEach(p -> p.substituteValues(new ArrayList<>(singletonList(transformValueToExpression(p)))));
			findReactiveProperties(mogram).forEach(v -> v.values(new ArrayList<>(singletonList(transformValueToExpression(v)))));
			findMethodReferences(mogram).forEach(v -> v.values(new ArrayList<>(singletonList(transformMethodReference(v, new File(v.source()).getName())))));
		}
	}

	private Primitive.Expression transformValueToExpression(Valued v) {
		return new Primitive.Expression(wrap(v));
	}

	private Primitive.Expression transformMethodReference(Valued v, String fileName) {
		return new Primitive.Expression(wrapMethodReference(v, fileName));
	}

	private String wrapMethodReference(Valued v, String fileName) {
		List<Object> value = v.values();
		return transformMethodReference(v.source(), functionRule(v), (MethodReference) value.get(0), fileName);
	}

	private String wrap(Valued v) {
		if (v.values().get(0) instanceof EmptyMogram) return "null";
		List<String> result = v.values().stream().map(value -> wrapValue(v, value)).collect(Collectors.toList());
		return v.isMultiple() ? "java.util.Arrays.asList(" + String.join(", ", result) + ")" : result.get(0);
	}

	private static FunctionRule functionRule(Valued v) {
		return (FunctionRule) v.rules().stream().filter(r -> r instanceof FunctionRule).findFirst().orElse(null);
	}

	private String wrapValue(Valued v, Object value) {
		String toAdd = value.toString();
		if (value instanceof File) toAdd = ((File) value).getAbsolutePath().replace("\\", "/");
		final FrameBuilder builder = new FrameBuilder(v.type().name(), "native").add("value", toAdd);
		Map<String, Formatter> formatters = Map.of("url", url -> url.toString().substring(resources.getAbsolutePath().length() + 1));
		return new ToNativeTransformerTemplate().render(builder.toFrame(), formatters);
	}

	private String transformMethodReference(URI source, FunctionRule rule, MethodReference value, String fileName) {
		String parameters = rule == null ? "" : namesOf(new NativeExtractor(rule.signature()).parameters());
		final String packageOf = packageOf(new File(source).getParent());
		return (!packageOf.isEmpty() ? packageOf + "." : "") +
			   Format.javaValidName().format(FileSystemUtils.getNameWithoutExtension(fileName)).toString() + "." + value.target() + "(self" + (parameters.isEmpty() ? "" : ", " + parameters) + ");";
	}

	private String packageOf(String path) {
		if (srcDirectory == null) return "";
		final String replace = path.replace(srcDirectory.getAbsolutePath(), "");
		return replace.isEmpty() ? "" : replace.substring(1).replace(File.separator, ".");
	}


	private String namesOf(String parameters) {
		return Format.nativeParameterWithoutType().format(parameters).toString();
	}

	private Set<PropertyDescription> findReactiveParameters(Parametrized parametrized) {
		Set<PropertyDescription> parameters = parametrized.parameters().stream().
				filter(p -> p.definition() != null && p.definition().annotations().contains(Reactive) &&
							!(p.values().get(0) instanceof Primitive.Expression) && !(p.values().get(0) instanceof MethodReference)).collect(Collectors.toSet());
		if (parametrized instanceof Mogram)
			((Mogram) parametrized).mograms().forEach(n -> parameters.addAll(findReactiveParameters(n)));
		return parameters;
	}

	private Set<Property> findReactiveProperties(ElementContainer container) {
		Set<Property> parameters = new HashSet<>();
		for (Mogram inner : container.mograms()) {
			parameters.addAll(reactiveProperties(inner));
			parameters.addAll(findReactiveProperties(inner));
		}
		return parameters;
	}

	private static List<Property> reactiveProperties(Mogram inner) {
		return inner.properties().stream().
				filter(v -> v.annotations().contains(Reactive) && !v.values().isEmpty() &&
							!(v.values().get(0) instanceof Primitive.Expression) && !(v.values().get(0) instanceof MethodReference)).toList();
	}

	private Set<Valued> findMethodReferences(Mogram mogram) {
		Set<Valued> valued = new HashSet<>();
		valued.addAll(mogram.properties().stream()
				.filter(v -> !v.values().isEmpty() && v.values().get(0) instanceof MethodReference)
				.toList());
		valued.addAll(mogram.parameters().stream()
				.filter(v -> !v.values().isEmpty() && v.values().get(0) instanceof MethodReference)
				.toList());
		for (Mogram inner : mogram.mograms()) valued.addAll(findMethodReferences(inner));
		return valued;
	}

}
