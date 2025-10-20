package io.intino.tara.model.rules.property;

import io.intino.tara.model.Metric;
import io.intino.tara.model.Rule;
import io.intino.tara.model.Valued;
import io.intino.tara.model.rules.CustomRule;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class PropertyCustomRule implements CustomRule, Rule<Valued> {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getGlobal();
	private final String aClass;
	private Class<?> loadedClass;
	private Rule<?> object;
	private String qualifiedName;
	private transient File classFile;

	public PropertyCustomRule(String aClass) {
		this.aClass = aClass;
	}

	@Override
	public boolean accept(Valued valued) {
		return loadedClass == null || (!isMetric()) && invokeWith(valued.values());
	}

	@Override
	public String errorMessage() {
		return "";//TODO
	}

	@Override
	public List<Object> errorParameters() {
		return Collections.emptyList(); //TODO
	}


	public String getDefaultUnit() {
		for (Field field : loadedClass.getDeclaredFields()) if (field.isEnumConstant()) return field.getName();
		return null;
	}

	public boolean isMetric() {
		if (loadedClass == null || !loadedClass.isEnum()) return false;
		for (Class<?> aClass : loadedClass.getInterfaces())
			if (aClass.getName().equals(Metric.class.getName())) return true;
		return false;
	}

	public Class<?> loadedClass() {
		return loadedClass;
	}

	public String qualifiedName() {
		return loadedClass == null ? qualifiedName : loadedClass.getName();
	}

	public void setLoadedClass(Class<?> loadedClass) {
		this.loadedClass = loadedClass;
		try {
			this.object = (Rule<?>) this.loadedClass.newInstance();
		} catch (InstantiationException | IllegalAccessException ignored) {
		}
	}

	public void classFile(File file) {
		this.classFile = file;
	}

	public File classFile() {
		return this.classFile;
	}

	public String externalClass() {
		return aClass;
	}

	private boolean invokeWith(List<Object> values) {
		try {
			final Rule rule = (Rule<?>) loadedClass.newInstance();
			if (acceptAsList(rule)) return rule.accept(values);
			else for (Object value : values) if (!rule.accept(value)) return false;
			return true;
		} catch (IllegalAccessException | InstantiationException e) {
			LOG.severe(e.getMessage());
		}
		return false;
	}

	private boolean acceptAsList(Rule<?> rule) {
		try {
			return rule.getClass().getMethod("accept", List.class) != null;
		} catch (NoSuchMethodException e) {
			return false;
		}
	}

	public void qualifiedName(String qualifiedName) {
		this.qualifiedName = qualifiedName;
	}
}
