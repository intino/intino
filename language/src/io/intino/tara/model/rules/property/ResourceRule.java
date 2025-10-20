package io.intino.tara.model.rules.property;

import io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level;
import io.intino.tara.model.Rule;
import io.intino.tara.model.Valued;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class ResourceRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	private String message;
	private final List<String> extensions;

	public ResourceRule(List<String> extensions) {
		this.extensions = extensions;
	}

	@Override
	public boolean accept(Valued valued) {
		List<File> values = valued.values().stream().map(v -> (File) v).toList();
		if (values.get(0) == null) return true;
		for (File file : values) {
			if (file == null) continue;
			if (!file.exists()) {
				message = "reject.file.parameter.not.exists";
				return false;
			}
			for (String extension : extensions)
				if (file.getName().endsWith("." + extension)) return true;
			message = "reject.file.parameter.with.unavailable.extension";
			return false;
		}
		return true;
	}

	public List<String> getAllowedExtensions() {
		return extensions;
	}

	@Override
	public String errorMessage() {
		return message;
	}

	@Override
	public List<Object> errorParameters() {
		return Collections.singletonList(String.join(", ", extensions));
	}

	@Override
	public Level level() {
		return message != null && message.equals("reject.file.parameter.not.exists") ? Level.WARNING : Level.ERROR;
	}
}
