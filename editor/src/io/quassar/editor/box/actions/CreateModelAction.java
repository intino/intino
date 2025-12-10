package io.quassar.editor.box.actions;

import io.intino.alexandria.logger.Logger;
import io.quassar.editor.box.commands.ModelCommands;
import io.quassar.editor.model.GavCoordinates;
import io.quassar.editor.model.Model;
import io.quassar.editor.model.User;

public class CreateModelAction extends QuassarAction {
	public String language;
	public String name;
	public String owner;
	public String mainContent;

	public String execute() {
		Logger.info("Creating model %s with DSL %s".formatted(name, language));
		GavCoordinates languageCoords = GavCoordinates.from(language);
		Model result = box.commands(ModelCommands.class).create(name, "", languageCoords, mainContent, owner, User.Quassar);
		Logger.info("Model %s created".formatted(name));
		return result.id();
	}
}