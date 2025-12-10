package io.quassar.editor;

import io.quassar.editor.box.util.SubjectHelper;
import io.quassar.editor.model.Language;
import systems.intino.datamarts.subjectstore.SubjectQuery;
import systems.intino.datamarts.subjectstore.SubjectStore;
import systems.intino.datamarts.subjectstore.model.Subject;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class NamePatch {

	public static void main(String[] args) throws IOException {
		File root = new File("/Users/mcaballero/Proyectos/quassar/temp");
		prepareIndex(root);
		System.out.println("END!!!!!");
	}

	private static void prepareIndex(File root) throws IOException {
		File indexFile = new File(root, "index.triples");
		SubjectStore store = new SubjectStore(indexFile);
		store.seal();
		updateNames(store);
		updateMetamodels(store);
		store.seal();
	}

	private static void updateNames(SubjectStore store) {
		List<Subject> subjectList = store.query().isType("model").collect();
		subjectList.forEach(NamePatch::update);
	}

	private static void update(Subject subject) {
		String title = subject.get("title");
		String qualifiedTitle = subject.get("qualified-title");

		Subject.Updating updating = subject.update().del("title").del("qualified-title");

		if (qualifiedTitle != null && !qualifiedTitle.isEmpty()) updating.set("name", qualifiedTitle).set("is-qualified", "true");
		else updating.set("name", title);
	}

	private static void updateMetamodels(SubjectStore store) {
		SubjectQuery languages = store.query().isType(SubjectHelper.LanguageType);
		Map<Subject, String> metamodels = languages.stream().collect(toMap(l -> l, l -> l.get("metamodel")));
		metamodels.forEach((key, value) -> updateMetamodel(store.open(value, "model"), key));
	}

	private static void updateMetamodel(Subject metamodel, Subject language) {
		if (metamodel == null) return;
		metamodel.update().set("name", language.name().toUpperCase());
	}

}
