package io.quassar.editor.box.actions;

import io.quassar.editor.box.commands.CollectionCommands;
import io.quassar.editor.model.Collection;

public class CreateCollectionForUserAction extends QuassarAction {
	public String name;
	public String owner;

	public Boolean execute() {
		box.commands(CollectionCommands.class).create(name, Collection.SubscriptionPlan.Enterprise, owner);
		return true;
	}
}