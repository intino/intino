package io.intino.tara.builder.codegeneration.language;

import io.intino.builder.CompilerConfiguration;
import io.intino.itrules.Formatter;
import io.intino.itrules.Frame;
import io.intino.tara.Language;
import io.intino.tara.processors.model.Model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static io.intino.tara.builder.utils.Format.*;

class LanguageCreator {
	private final CompilerConfiguration conf;
	private final Model model;
	private final Language language;

	LanguageCreator(CompilerConfiguration conf, Model model, Language language) {
		this.conf = conf;
		this.model = model;
		this.language = language;
	}

	public String create() {
		final LanguageTemplate template = new LanguageTemplate();
		Frame frame = createFrame(model);
		template.render(frame, formatters());
		return template.render(frame);
	}

	private Map<String, Formatter> formatters() {
		Map<String, Formatter> formatters = new HashMap<>();
		formatters.put("string", string());
		formatters.put("path", value -> value.toString().replace(".", "/"));
		formatters.put("reference", reference());
		formatters.put("toCamelCase", toCamelCase());
		formatters.put("withDollar", withDollar());
		return formatters;
	}

	private Frame createFrame(final Model model) {
		return new LanguageModelAdapter(conf.groupId(), conf.dsl().outDsl(), conf.version(), Locale.getDefault(), language, conf.generationPackage()).adapt(model);
	}
}
