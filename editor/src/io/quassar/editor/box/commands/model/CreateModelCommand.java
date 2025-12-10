package io.quassar.editor.box.commands.model;

import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.commands.Command;
import io.quassar.editor.box.util.ModelHelper;
import io.quassar.editor.box.util.ShortIdGenerator;
import io.quassar.editor.model.GavCoordinates;
import io.quassar.editor.model.Language;
import io.quassar.editor.model.LanguageRelease;
import io.quassar.editor.model.Model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class CreateModelCommand extends Command<Model> {
	public String name;
	public String description;
	public GavCoordinates language;
	public Model.Usage usage = Model.Usage.EndUser;
	public String mainContent = null;
	public String owner;

	public CreateModelCommand(EditorBox box) {
		super(box);
	}

	@Override
	public Model execute() {
		Model model = box.modelManager().create(ShortIdGenerator.generate(), name, description, language, usage, owner);
		Language language = box.languageManager().get(this.language);
		LanguageRelease release = language.release(this.language.version());
		if (usage == Model.Usage.Template) release.template(model.id());
		Model template = release.template() != null ? box.modelManager().get(release.template()) : null;
		if (template != null && box.modelManager().hasWorkspaceMograms(template, release.version())) box.modelManager().copyWorkSpace(template, model);
		else createDefaultWorkspace(model);
		return model;
	}

	private void createDefaultWorkspace(Model model) {
		InputStream content = mainContent != null ? new ByteArrayInputStream(mainContent.getBytes(StandardCharsets.UTF_8)) : null;
		box.modelManager().createFile(model, ModelHelper.validWorkspaceFileName("main.tara"), content, null);
	}

}
