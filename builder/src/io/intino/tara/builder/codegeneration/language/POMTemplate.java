package io.intino.tara.builder.codegeneration.language;

import io.intino.itrules.template.Rule;
import io.intino.itrules.template.Template;

import java.util.ArrayList;
import java.util.List;

import static io.intino.itrules.template.condition.predicates.Predicates.allTypes;
import static io.intino.itrules.template.outputs.Outputs.literal;
import static io.intino.itrules.template.outputs.Outputs.placeholder;

public class POMTemplate extends Template {

	public List<Rule> ruleSet() {
		List<Rule> rules = new ArrayList<>();
		rules.add(rule().condition(allTypes("POM")).output(literal("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<project xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\" xmlns=\"http://maven.apache.org/POM/4.0.0\"\n    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n  <modelVersion>4.0.0</modelVersion>\n  <groupId>")).output(placeholder("groupId", "lowerCase")).output(literal("</groupId>\n  <artifactId>")).output(placeholder("name", "lowerCase")).output(literal("</artifactId>\n  <version>")).output(placeholder("version")).output(literal("</version>\n\n<repositories>\n\t<repository>\n\t\t<id>intino-maven</id>\n\t\t<name>intino-maven-releases</name>\n\t\t<url>https://artifactory.intino.io/artifactory/release-libraries</url>\n\t</repository>\n</repositories>\n\n<dependencies>\n\t<dependency>\n\t\t<groupId>io.intino.tara</groupId>\n\t\t<artifactId>language</artifactId>\n\t\t<version>2.0.0</version>\n\t\t<scope>compile</scope>\n\t</dependency>\n</dependencies>\n</project>")));
		return rules;
	}

	public String render(Object object) {
		return new io.intino.itrules.Engine(this).render(object);
	}

	public String render(Object object, java.util.Map<String, io.intino.itrules.Formatter> formatters) {
		return new io.intino.itrules.Engine(this).addAll(formatters).render(object);
	}
}