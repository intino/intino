package io.quassar.editor.box.commands.model;

import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.commands.Command;
import io.quassar.editor.box.util.ModelHelper;
import io.quassar.editor.box.util.NameHelper;
import io.quassar.editor.model.GavCoordinates;
import io.quassar.editor.model.Model;

public class CreateModuleCommand extends Command<Model> {
	public String name;
	public String project;
	public GavCoordinates language;

	public CreateModuleCommand(EditorBox box) {
		super(box);
	}

	@Override
	public Model execute() {
		Model model = createModel();
		model.name(project, name);
		return model;
	}

	private Model createModel() {
		CreateModelCommand command = new CreateModelCommand(box);
		command.author = author;
		command.language = language;
		command.name = ModelHelper.proposeName();
		command.description = "";
		command.usage = Model.Usage.EndUser;
		command.owner = author;
		return command.execute();
	}

}
