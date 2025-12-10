package io.quassar.editor.box.commands.model;

import io.intino.alexandria.logger.Logger;
import io.intino.builderservice.schemas.Message;
import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.builder.BuildResult;
import io.quassar.editor.box.commands.Command;
import io.quassar.editor.box.commands.Command.CommandResult;
import io.quassar.editor.box.ui.displays.templates.ModelTemplate;
import io.quassar.editor.box.util.LanguageHelper;
import io.quassar.editor.box.util.WorkspaceHelper;
import io.quassar.editor.model.Language;
import io.quassar.editor.model.LanguageRelease;
import io.quassar.editor.model.Model;
import io.quassar.editor.model.OperationResult;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CreateModelReleaseCommand extends Command<CommandResult> {
	public Model model;
	public String version;

	public CreateModelReleaseCommand(EditorBox box) {
		super(box);
	}

	@Override
	public CommandResult execute() {
		CommandResult result = check();
		if (!result.success()) return result;
		if (box.modelManager().release(model, version).exists()) return resultOf(replaceRelease());
		else return resultOf(box.modelManager().createRelease(model, version));
	}

	private OperationResult replaceRelease() {
		cleanReleases();
		OperationResult result = box.modelManager().replaceRelease(model, version);
		Language language = box.languageManager().getWithMetamodel(model);
		if (language == null) return result;
		LanguageRelease release = language.release(version);
		if (release == null) return result;
		BuildResult rebuildResult = LanguageHelper.rebuild(model, language, release, author, box);
		return !rebuildResult.success() ? OperationResult.Error(rebuildResult.messages().stream().map(Message::content).collect(Collectors.joining("; "))) : result;
	}

	private void cleanReleases() {
		removeTemporalWorkspace();
		reloadServers();
	}

	private void reloadServers() {
		Language language = box.languageManager().getWithMetamodel(model);
		List<Model> models = box.modelManager().modelsWithRelease(language, version);
		models.forEach(this::reloadServer);
	}

	private void reloadServer(Model model) {
		box.modelManager().removeLanguageServer(model);
		box.souls().stream().map(s -> s.displays(ModelTemplate.class).stream().toList()).flatMap(Collection::stream).filter(Objects::nonNull).forEach(t -> t.languageChanged(model.language()));
	}

	private void removeTemporalWorkspace() {
		try {
			if (Model.DraftRelease.equals(version)) return;
			File file = WorkspaceHelper.releaseWorkSpace(model, version, box.archetype());
			if (file == null || !file.exists()) return;
			FileUtils.deleteDirectory(file);
		}
		catch (Exception e) {
			Logger.error(e);
		}
	}

	private CommandResult check() {
		CheckModelCommand command = new CheckModelCommand(box);
		command.author = author;
		command.model = model;
		command.release = Model.DraftRelease;
		return command.execute();
	}

}
