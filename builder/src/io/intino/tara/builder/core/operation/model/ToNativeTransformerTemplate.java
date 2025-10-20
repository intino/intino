package io.intino.tara.builder.core.operation.model;

import io.intino.itrules.template.Rule;
import io.intino.itrules.template.Template;

import java.util.ArrayList;
import java.util.List;

import static io.intino.itrules.template.condition.predicates.Predicates.*;
import static io.intino.itrules.template.outputs.Outputs.literal;
import static io.intino.itrules.template.outputs.Outputs.placeholder;

public class ToNativeTransformerTemplate extends Template {

	public List<Rule> ruleSet() {
		List<Rule> rules = new ArrayList<>();
		rules.add(rule().condition(all(allTypes("native"), allTypes("resouce"))).output(literal("try {\n\treturn new java.net.URL(")).output(placeholder("value", "url", "quoted")).output(literal(");\n} catch (java.net.MalformedURLException e) {\n\treturn null;\n};\n")));
		rules.add(rule().condition(all(allTypes("native"), allTypes("date"))).output(literal("DateLoader.load(java.util.Collections.singletonList(\"")).output(placeholder("value")).output(literal("\"), self).get(0)")));
		rules.add(rule().condition(all(allTypes("native"), allTypes("instant"))).output(literal("InstantLoader.load(java.util.Collections.singletonList(\"")).output(placeholder("value")).output(literal("\"), self).get(0)")));
		rules.add(rule().condition(all(all(allTypes("native"), allTypes("emptyNode")), allTypes("reference"))).output(literal("null")));
		rules.add(rule().condition(all(allTypes("native"), allTypes("reference"))).output(literal("self.graph().core$().loadInstance(\"")).output(placeholder("value")).output(literal("\");")));
		rules.add(rule().condition(all(allTypes("native"), allTypes("resource"))).output(literal("self.graph().core$().loadResource(\"")).output(placeholder("value", "url")).output(literal("\");")));
		rules.add(rule().condition(all(allTypes("native"), allTypes("string"))).output(literal("\"")).output(placeholder("value")).output(literal("\"")));
		rules.add(rule().condition(all(allTypes("native"), not(allTypes("string")))).output(placeholder("value")));
		return rules;
	}

	public String render(Object object) {
		return new io.intino.itrules.Engine(this).render(object);
	}

	public String render(Object object, java.util.Map<String, io.intino.itrules.Formatter> formatters) {
		return new io.intino.itrules.Engine(this).addAll(formatters).render(object);
	}
}