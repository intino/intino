package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.ui.displays.UserMessage;
import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.commands.ModelCommands;
import io.quassar.editor.box.util.ModelHelper;
import io.quassar.editor.box.util.PathHelper;
import io.quassar.editor.model.GavCoordinates;
import io.quassar.editor.model.Model;
import org.apache.commons.collections4.sequence.DeleteCommand;

import java.util.Set;
import java.util.function.Consumer;

public class ProjectModuleEntryViewer extends AbstractProjectModuleEntryViewer<EditorBox> {
	private Model model;
	private String project;
	private String module;
	private GavCoordinates language;
	private boolean selected;
	private Consumer<Boolean> selectListener;

	public ProjectModuleEntryViewer(EditorBox box) {
		super(box);
	}

	public void model(Model model) {
		this.model = model;
	}

	public void language(GavCoordinates language) {
		this.language = language;
	}

	public void project(String project) {
		this.project = project;
	}

	public void module(String module) {
		this.module = module;
	}

	public void selected(boolean value) {
		this.selected = value;
	}

	public void onSelect(Consumer<Boolean> listener) {
		this.selectListener = listener;
	}

	@Override
	public void init() {
		super.init();
		titleLink.onExecute(e -> open());
	}

	@Override
	public void refresh() {
		super.refresh();
		bubble.formats(Set.of("bubble", model != null ? "bubbleFilled" : "bubbleNotFilled"));
		refreshLink();
		refreshText();
	}

	private void refreshLink() {
		titleLink.visible(!selected);
		if (!titleLink.isVisible()) return;
		titleLink.title(language.languageId());
	}

	private void refreshText() {
		titleText.visible(selected);
		if (!titleText.isVisible()) return;
		titleText.value(language.languageId());
	}

	private void open() {
		if (model == null) {
			model = box().commands(ModelCommands.class).create(ModelHelper.proposeName(), "", language, username(), username());
			box().commands(ModelCommands.class).saveQualifiedName(model, project, module, username());
		}
		notifier.redirect(PathHelper.modelUrl(model, session()));
		selectListener.accept(true);
	}

}