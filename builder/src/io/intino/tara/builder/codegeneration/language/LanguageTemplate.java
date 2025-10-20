package io.intino.tara.builder.codegeneration.language;

import io.intino.itrules.template.Rule;
import io.intino.itrules.template.Template;

import java.util.ArrayList;
import java.util.List;

import static io.intino.itrules.template.condition.predicates.Predicates.*;
import static io.intino.itrules.template.outputs.Outputs.*;

public class LanguageTemplate extends Template {

	public List<Rule> ruleSet() {
		List<Rule> rules = new ArrayList<>();
		rules.add(rule().condition(allTypes("language")).output(literal("package ")).output(placeholder("groupId", "camelCase", "lowercase")).output(literal(";\n\nimport io.intino.tara.model.MogramRoot;\nimport io.intino.tara.model.Annotation;\nimport io.intino.tara.model.NamedReference;\nimport io.intino.tara.model.Level;\nimport io.intino.tara.model.Primitive;\nimport io.intino.tara.model.rules.Size;\nimport io.intino.tara.model.rules.property.*;\nimport io.intino.tara.model.rules.composition.ConstraintRule;\n\nimport java.io.IOException;\nimport java.io.InputStream;\nimport java.io.ObjectInputStream;\n\nimport java.util.List;\nimport java.util.Locale;\n\nimport static io.intino.tara.language.semantics.constraints.RuleFactory.*;\n\npublic class ")).output(placeholder("name", "camelCase", "reference", "FirstUpperCase")).output(literal(" extends io.intino.tara.Tara {\n\tprivate static io.intino.tara.processors.model.Model model = null;\n\n\tpublic ")).output(placeholder("name", "toCamelCase", "reference", "FirstUpperCase")).output(literal("() {\n\t\tmodel();\n\t\t")).output(placeholder("model", "def").multiple("\n")).output(literal("\n\t\t")).output(placeholder("split", "call").multiple("\n")).output(literal("\n\t}\n\n\t")).output(placeholder("split", "class").multiple("\n")).output(literal("\n\n\t@Override\n\tpublic String languageName() {\n\t\treturn \"")).output(placeholder("name", "lowerCase")).output(literal("\";\n\t}\n\n\t@Override\n    public Locale locale() {\n        return ")).output(placeholder("locale")).output(literal(";\n    }\n\n    @Override\n\tpublic MogramRoot model() {\n\t\ttry {\n\t\t\tif (model != null) return model;\n\t\t\treturn model = (io.intino.tara.processors.model.Model) new ObjectInputStream(this.getClass().getResourceAsStream(\"/")).output(placeholder("groupIdPath")).output(literal("/")).output(placeholder("name")).output(literal("-")).output(placeholder("version")).output(literal(".obj\")).readObject();\n\t\t} catch (IOException | ClassNotFoundException e) {\n\t\t\tSystem.err.println(e.getMessage());\n\t\t\treturn null;\n\t\t}\n\t}\n\n\t@Override\n\tpublic String metaLanguage() {\n\t\treturn ")).output(placeholder("metaLanguage", "quoted")).output(literal(";\n\t}\n}")));
		rules.add(rule().condition(all(allTypes("model"), trigger("def"))).output(literal("def(\"")).output(placeholder("name")).output(literal("\").with(context(null")).output(expression().output(literal(", ")).output(placeholder("mogramType"))).output(literal(")")).output(expression().output(placeholder("constraints"))).output(expression().output(literal(".")).output(placeholder("assumptions"))).output(literal(");")));
		rules.add(rule().condition(trigger("call")).output(literal("Split")).output(placeholder("number")).output(literal(".load(this);")));
		rules.add(rule().condition(trigger("class")).output(literal("private static class Split")).output(placeholder("number")).output(literal(" {\n\tprivate static void load(")).output(placeholder("language", "reference", "firstUpperCase")).output(literal(" self) {\n\t\t")).output(placeholder("mogram").multiple("\n")).output(literal("\n\t}\n}")));
		rules.add(rule().condition(all(allTypes("mogram"), trigger("mogram"))).output(literal("self.def(\"")).output(placeholder("name")).output(literal("\").with(self.context(Level.")).output(placeholder("level")).output(literal(", ")).output(expression().output(placeholder("mogramType"))).output(literal(")")).output(expression().output(placeholder("constraints"))).output(expression().output(literal(".")).output(placeholder("assumptions"))).output(literal(");")));
		rules.add(rule().condition(all(allTypes("mogramType"), trigger("mogramtype"))).output(placeholder("type", "quoted").multiple(", ")));
		rules.add(rule().condition(all(allTypes("facetInstantiation"), trigger("constraint"))).output(literal("facetInstantiation(")).output(placeholder("type", "quoted").multiple(", ")).output(literal(")")));
		rules.add(rule().condition(trigger("constraints")).output(expression().output(literal(".has(")).output(placeholder("constraint").multiple(", ")).output(literal(")"))));
		rules.add(rule().condition(all(all(allTypes("constraint"), allTypes("component")), trigger("constraint"))).output(literal("component(")).output(placeholder("type", "quoted")).output(literal(", List.of(")).output(placeholder("rule").multiple(", ")).output(literal(")")).output(expression().output(literal(", ")).output(placeholder("tags").multiple(", "))).output(literal(")")));
		rules.add(rule().condition(all(all(allTypes("constraint"), allTypes("property")), trigger("constraint"))).output(literal("property(\"")).output(placeholder("name")).output(literal("\", ")).output(placeholder("type", "primitive")).output(literal(", ")).output(expression().output(literal("\"")).output(placeholder("facet")).output(literal("\"")).next(expression().output(literal("\"\"")))).output(literal(", ")).output(placeholder("position")).output(literal(", Level.")).output(placeholder("level")).output(literal(", List.of(")).output(placeholder("rule").multiple(", ")).output(literal(")")).output(expression().output(literal(", ")).output(placeholder("tags").multiple(", "))).output(literal(")")));
		rules.add(rule().condition(all(all(allTypes("constraint"), allTypes("facet")), trigger("constraint"))).output(literal("facet(\"")).output(placeholder("value")).output(literal("\"")).output(expression().output(literal(", ")).output(placeholder("terminal")).next(expression().output(literal(", false")))).output(expression().output(literal(", ")).output(placeholder("required")).next(expression().output(literal(", false")))).output(literal(", new String[]{")).output(placeholder("with", "quoted").multiple(", ")).output(literal("}, new String[]{")).output(placeholder("without", "quoted").multiple(", ")).output(literal("})")).output(expression().output(literal(".has(")).output(placeholder("constraint").multiple(", ")).output(literal(")"))));
		rules.add(rule().condition(all(all(allTypes("constraint"), allTypes("oneOf")), trigger("constraint"))).output(literal("oneOf(List.of(")).output(placeholder("rule").multiple(", ")).output(literal("), ")).output(expression().output(placeholder("constraint").multiple(", "))).output(literal(")")));
		rules.add(rule().condition(all(all(allTypes("constraint"), allTypes("redefine")), trigger("constraint"))).output(literal("redefine(")).output(placeholder("name", "quoted")).output(literal(", ")).output(placeholder("supertype", "quoted")).output(literal(")")));
		rules.add(rule().condition(trigger("constraint")).output(placeholder("")).output(literal("()")));
		rules.add(rule().condition(trigger("tags")).output(literal("Annotation.")).output(placeholder("")));
		rules.add(rule().condition(all(allTypes("customRule", "metric"), trigger("rule"))).output(placeholder("qn")).output(literal(".")).output(placeholder("default")));
		rules.add(rule().condition(all(allTypes("nativecustomwordrule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.WordRule(List.of(")).output(placeholder("words", "quoted").multiple(", ")).output(literal(")")).output(expression().output(literal(", ")).output(placeholder("externalWordClass", "quoted"))).output(literal(")")));
		rules.add(rule().condition(all(allTypes("customrule"), trigger("rule"))).output(literal("new ConstraintRule(new NamedReference(model.constraint(\"")).output(placeholder("qn")).output(literal("\"), \"")).output(placeholder("qn")).output(literal("\"))")));
		rules.add(rule().condition(all(allTypes("rule", "customRule"), trigger("size"))).output(literal("new ConstraintRule(new NamedReference<>(model.constraint(\"")).output(placeholder("qn")).output(literal("\"), \"")).output(placeholder("qn")).output(literal("\"))")));
		rules.add(rule().condition(all(allTypes("rule", "size"), trigger("rule"))).output(literal("new Size(")).output(placeholder("min")).output(literal(", ")).output(placeholder("max")).output(literal(")")));
		rules.add(rule().condition(all(allTypes("nativeObjectRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.NativeObjectRule(\"")).output(placeholder("type")).output(literal("\")")));
		rules.add(rule().condition(all(allTypes("nativeReferenceRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.NativeReferenceRule(List.of(")).output(placeholder("allowedReferences", "quoted").multiple(", ")).output(literal("))")));
		rules.add(rule().condition(all(allTypes("nativerule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.FunctionRule(\"")).output(placeholder("interfaceClass")).output(literal("\", \"")).output(placeholder("signature")).output(literal("\", List.of(")).output(placeholder("imports", "quoted").multiple(", ")).output(literal("))")));
		rules.add(rule().condition(all(allTypes("wordrule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.WordRule(List.of(")).output(placeholder("words", "quoted").multiple(", ")).output(literal(")")).output(expression().output(literal(", ")).output(placeholder("externalWordClass", "quoted"))).output(literal(")")));
		rules.add(rule().condition(all(allTypes("referenceRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.ReferenceRule(List.of(")).output(placeholder("allowedTypes", "quoted").multiple(", ")).output(literal("))")));
		rules.add(rule().condition(all(allTypes("doubleRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.DoubleRule(")).output(placeholder("min", "cast")).output(literal(", ")).output(placeholder("max", "cast")).output(literal(", \"")).output(placeholder("metric")).output(literal("\")")));
		rules.add(rule().condition(all(allTypes("integerRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.IntegerRule(")).output(placeholder("min")).output(literal(", ")).output(placeholder("max")).output(literal(", \"")).output(placeholder("metric")).output(literal("\")")));
		rules.add(rule().condition(all(allTypes("dateRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.DateRule(")).output(expression().output(placeholder("parameters", "quoted")).output(literal(","))).output(literal(")")));
		rules.add(rule().condition(all(allTypes("instantRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.InstantRule(")).output(expression().output(placeholder("parameters", "quoted")).output(literal(","))).output(literal(")")));
		rules.add(rule().condition(all(allTypes("resourceRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.ResourceRule(List.of(")).output(placeholder("extensions", "quoted").multiple(", ")).output(literal("))")));
		rules.add(rule().condition(all(allTypes("stringRule"), trigger("rule"))).output(literal("new io.intino.tara.model.rules.property.StringRule(")).output(placeholder("regex", "quoted")).output(literal(")")));
		rules.add(rule().condition(all(attribute("", "Infinity"), trigger("cast"))).output(literal("Double.POSITIVE_INFINITY")));
		rules.add(rule().condition(all(attribute("", "-Infinity"), trigger("cast"))).output(literal("Double.NEGATIVE_INFINITY")));
		rules.add(rule().condition(all(all(not(attribute("", "-Infinity")), not(attribute("", "Infinity"))), trigger("cast"))).output(placeholder("")));
		rules.add(rule().condition(all(allTypes("assumptions"), trigger("assumptions"))).output(literal("assume(")).output(placeholder("assumption").multiple(", ")).output(literal(")")));
		rules.add(rule().condition(trigger("assumption")).output(literal("is")).output(placeholder("", "camelCase", "firstUpperCase")).output(literal("()")));
		rules.add(rule().condition(trigger("quoted")).output(literal("\"")).output(placeholder("")).output(literal("\"")));
		rules.add(rule().condition(trigger("primitive")).output(literal("Primitive.")).output(placeholder("", "UpperCase")));
		rules.add(rule().condition(all(trigger("locale"), attribute("", "es"))).output(literal("new Locale(\"es\", \"Spain\", \"es_ES\")")));
		rules.add(rule().condition(all(trigger("locale"), attribute("", "en"))).output(literal("Locale.ENGLISH")));
		return rules;
	}

	public String render(Object object) {
		return new io.intino.itrules.Engine(this).render(object);
	}

	public String render(Object object, java.util.Map<String, io.intino.itrules.Formatter> formatters) {
		return new io.intino.itrules.Engine(this).addAll(formatters).render(object);
	}
}