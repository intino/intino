package io.intino.tara.builder.core.operation.model;

import io.intino.tara.builder.core.CompilationUnit;
import io.intino.tara.builder.core.errorcollection.CompilationFailedException;
import io.intino.tara.builder.core.errorcollection.message.Message;
import io.intino.tara.model.Metric;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.Property;
import io.intino.tara.model.PropertyDescription;
import io.intino.tara.model.rules.property.PropertyCustomRule;
import io.intino.tara.processors.dependencyresolution.DependencyException;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.model.MogramImpl;

import java.lang.reflect.Field;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MetricResolutionOperation extends ModelOperation {
	private static final Logger LOG = Logger.getGlobal();

	public MetricResolutionOperation(CompilationUnit unit) {
		super(unit);
	}

	@Override
	public void call(Model model) throws CompilationFailedException {
		try {
			resolve(model);
		} catch (DependencyException e) {
			LOG.severe("Error during dependency resolution: " + e.getMessage());
			unit.getErrorCollector().addError(Message.create(e, unit.getSourceUnits().get(e.getElement().source())), true);
		}
	}

	public void resolve(Model model) throws DependencyException {
		for (Mogram mogram : model.components()) resolve(mogram);
	}

	private void resolve(Mogram mogram) throws DependencyException {
		if (!(mogram instanceof MogramImpl)) return;
		resolveMeasures(mogram.parameters());
		resolveVariableMetrics(mogram.properties());
		for (Mogram component : mogram.components()) resolve(component);
	}

	private void resolveVariableMetrics(List<Property> variables) throws DependencyException {
		for (Property variable : variables)
			if ((variable.rules() instanceof PropertyCustomRule) && ((PropertyCustomRule) variable.rules()).isMetric() && variable.metric() != null) {
				final PropertyCustomRule rule = (PropertyCustomRule) variable.rules();
				final Metric metric = findMetric(rule.loadedClass(), variable.metric());
				if (metric == null) throw new DependencyException("Metric not found", variable);
				variable.values(variable.values().stream().map((Function<Object, Object>) metric::value).collect(Collectors.toList()));
			}
	}

	private void resolveMeasures(List<PropertyDescription> parameters) throws DependencyException {
		for (PropertyDescription parameter : parameters) {
			if ((parameter.rules() instanceof Metric) && parameter.metric() != null) {
				final Metric metric = findMetric(parameter.rules().getClass(), parameter.metric());
				if (metric == null) throw new DependencyException("Metric not found", parameter);
				parameter.values(parameter.values().stream().map((Function<Object, Object>) metric::value).collect(Collectors.toList()));
			}
		}
	}

	private Metric findMetric(Class<?> aClass, String metric) {
		for (Field field : aClass.getDeclaredFields())
			if (field.isEnumConstant() && field.getName().equals(metric))
				try {
					return (Metric) field.get(null);
				} catch (IllegalAccessException e) {
					LOG.severe(e.getMessage());
				}
		return null;
	}
}
