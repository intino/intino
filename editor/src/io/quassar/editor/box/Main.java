package io.quassar.editor.box;

import io.quassar.editor.box.actions.*;

public class Main {
	public static void main(String[] args) {
		EditorBox box = new EditorBox(args);
		box.start();
//		rebuildAll(box);
//		createModelFromScratch(box);
		Runtime.getRuntime().addShutdownHook(new Thread(box::stop));
	}

	private static void createModelFromScratch(EditorBox box) {
		String username = "mydummy1";
		String template = "1VAy1NVD";
		String collection = "experiments";

		CreateCollectionForUserAction createCollectionAction = new CreateCollectionForUserAction();
		createCollectionAction.box = box;
		createCollectionAction.name = collection;
		createCollectionAction.owner = username + "@dummy.com";
		createCollectionAction.execute();

		CreateMetamodelFromTemplateAction action = new CreateMetamodelFromTemplateAction();
		action.box = box;
		action.owner = username + "@dummy.com";
		action.template = template;
		String metamodel = action.execute();

		CreateLanguageAction languageAction = new CreateLanguageAction();
		languageAction.box = box;
		languageAction.collection = collection;
		languageAction.metamodel = metamodel;
		languageAction.name = username + "-dsl";
		languageAction.owner = username + "@dummy.com";
		String language = languageAction.execute();

		CreateModelAction modelAction = new CreateModelAction();
		modelAction.box = box;
		modelAction.language = language;
		modelAction.name = username + "-example";
		modelAction.owner = username + "@dummy.com";
		modelAction.mainContent = "Esto es una prueba";
		modelAction.execute();

		AddLicenseAction addLicenseAction = new AddLicenseAction();
		addLicenseAction.box = box;
		addLicenseAction.collection = collection;
		addLicenseAction.duration = 12;
		addLicenseAction.username = username + "@dummy.com";
		addLicenseAction.execute();
	}

	private static void rebuildAll(EditorBox box) {
		RebuildLanguagesAction action = new RebuildLanguagesAction();
		action.box = box;
		System.out.println(action.execute());
	}
}