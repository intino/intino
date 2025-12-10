package io.quassar.editor.box.actions;

import io.intino.alexandria.logger.Logger;
import io.quassar.editor.box.commands.LanguageCommands;
import io.quassar.editor.box.commands.ModelCommands;
import io.quassar.editor.model.Collection;
import io.quassar.editor.model.GavCoordinates;
import io.quassar.editor.model.Language;
import io.quassar.editor.model.Model;

public class CreateLanguageAction extends QuassarAction {
	public String collection;
	public String metamodel;
	public String name;
	public String owner;

	public String execute() {
		Logger.info("Creating language %s".formatted(name));
		Collection collection = box.collectionManager().get(this.collection);
		Model metamodel = box.modelManager().get(this.metamodel);
		box.modelManager().removeLanguageServer(metamodel);
		box.commands(ModelCommands.class).createRelease(metamodel, "1.0.0", owner);
		Language result = box.commands(LanguageCommands.class).create(collection, name, metamodel, Language.Level.L1, true, null, owner);
		box.commands(LanguageCommands.class).createRelease(result, "1.0.0", owner);
		Logger.info("Language %s created".formatted(name));
		return GavCoordinates.from(result, result.lastRelease()).toString();
	}
}