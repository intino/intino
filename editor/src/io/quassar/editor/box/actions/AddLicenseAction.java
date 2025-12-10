package io.quassar.editor.box.actions;

import io.quassar.editor.box.commands.CollectionCommands;
import io.quassar.editor.model.Collection;
import io.quassar.editor.model.License;

public class AddLicenseAction extends QuassarAction {
	public String collection;
	public Integer duration;
	public String username;

	public Boolean execute() {
		Collection collection = box.collectionManager().get(this.collection);
		License license = box.commands(CollectionCommands.class).addLicense(collection, duration, username);
		box.commands(CollectionCommands.class).assignLicense(license.code(), username);
		return true;
	}
}