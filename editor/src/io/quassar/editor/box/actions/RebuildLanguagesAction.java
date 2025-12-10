package io.quassar.editor.box.actions;

import io.intino.alexandria.Resource;
import io.intino.alexandria.exceptions.InternalServerError;
import io.intino.alexandria.exceptions.NotFound;
import io.intino.alexandria.logger.Logger;
import io.intino.builderservice.schemas.Message;
import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.builder.BuildResult;
import io.quassar.editor.box.builder.ModelBuilder;
import io.quassar.editor.box.util.LanguageHelper;
import io.quassar.editor.box.util.TarHelper;
import io.quassar.editor.model.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RebuildLanguagesAction {
	public EditorBox box;
	public io.intino.alexandria.Context context = new io.intino.alexandria.Context();

	public String execute() {
		try {
			return String.join("\n ", rebuildAll());
		} catch (Throwable e) {
			Logger.error(e);
			return "ERROR rebuilding languages: " + e.getMessage();
		}
	}

	private List<String> rebuildAll() {
		List<String> messages = new ArrayList<>();
		box.languageManager().languages().stream().filter(l -> l.metamodel() != null && !l.metamodel().isEmpty()).forEach(l -> messages.addAll(rebuild(l)));
		return messages;
	}

	private List<String> rebuild(Language language) {
		List<String> messages = new ArrayList<>();
		language.releases().forEach(r -> messages.add(rebuild(language, r)));
		return messages;
	}

	private String rebuild(Language language, LanguageRelease release) {
		File destination = null;
		try {
			Logger.info("Building " + language.name() + ":" + release.version());
			Model model = box.modelManager().get(language.metamodel());
			BuildResult result = new ModelBuilder(model, release.version(), new GavCoordinates(language.collection(), language.name(), release.version()), box).build(User.Quassar);
			if (!result.success()) return messageOf(language, release, result);
			Resource resource = result.zipArtifacts();
			destination = box.archetype().tmp().builds(UUID.randomUUID().toString());
			TarHelper.extract(resource.inputStream(), destination);
			box.languageManager().saveDsl(language, release.version(), LanguageHelper.dslOf(destination));
			box.languageManager().saveDslManifest(language, release.version(), LanguageHelper.dslManifestOf(destination));
			box.languageManager().saveLsp(language, release.version(), LanguageHelper.lspOf(destination));
			box.languageManager().saveLspManifest(language, release.version(), LanguageHelper.lspManifestOf(destination));
			box.languageManager().saveGraph(language, release.version(), LanguageHelper.graphOf(destination));
			box.languageManager().saveParsers(language, release.version(), LanguageHelper.parsersOf(destination));
			return messageOf(language, release, result);
		}
		catch (Exception | InternalServerError | NotFound e) {
			Logger.error(e);
			return messageOf(language, release, BuildResult.failure(List.of(new Message().content(e.getMessage()).kind(Message.Kind.ERROR))));
		} finally {
			if (destination != null) destination.delete();
		}
	}

	private static final String MessageTemplate = "%s:%s: %s";
	private String messageOf(Language language, LanguageRelease release, BuildResult result) {
		String message = result.success() ? "SUCCESS" : "ERROR -> " + String.join("; ", result.messages().stream().map(Message::content).toList());
		return String.format(MessageTemplate, language.name(), release.version(), message);
	}

}