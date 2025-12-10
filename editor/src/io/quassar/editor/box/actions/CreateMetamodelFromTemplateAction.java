package io.quassar.editor.box.actions;

import io.intino.alexandria.logger.Logger;
import io.quassar.editor.box.commands.ModelCommands;
import io.quassar.editor.box.commands.UserCommands;
import io.quassar.editor.box.util.ModelHelper;
import io.quassar.editor.model.*;

public class CreateMetamodelFromTemplateAction extends QuassarAction {
	public String template;
	public String owner;

	public String execute() {
		Logger.info("Creating metamodel for user %s".formatted(owner));
		createUserIfNotExists();
		Model metamodel = createMetamodel();
		copyTemplateWorkspaceTo(metamodel);
		Logger.info("Metamodel created for %s with id %s".formatted(owner, metamodel.id()));
		return metamodel.id();
	}

	private void createUserIfNotExists() {
		User user = box.userManager().get(owner);
		if (user != null) return;
		box.commands(UserCommands.class).create(owner, owner, User.Quassar);
	}

	private Model createMetamodel() {
		String name = ModelHelper.proposeName();
		Language language = box.languageManager().getMetta();
		LanguageRelease release = language.lastRelease();
		return box.commands(ModelCommands.class).create(name, "(no description)", GavCoordinates.from(language, release), owner, User.Quassar);
	}

	private void copyTemplateWorkspaceTo(Model metamodel) {
		if (metamodel == null) return;
		Model templateMetamodel = template != null && !template.isEmpty() ? box.modelManager().get(template) : null;
		if (templateMetamodel != null) box.modelManager().copyWorkSpace(templateMetamodel, metamodel);
		else createDefaultWorkspace(metamodel);
	}

	private void createDefaultWorkspace(Model model) {
		box.modelManager().createFile(model, ModelHelper.validWorkspaceFileName("main.tara"), null, null);
	}

}