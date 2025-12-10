package io.quassar.editor.box.ui.displays.templates;

import io.quassar.editor.box.EditorBox;
import io.quassar.editor.model.GavCoordinates;
import io.quassar.editor.model.Language;
import io.quassar.editor.model.Model;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ProjectModuleViewer extends AbstractProjectModuleViewer<EditorBox> {
	private Model model;
	private String project;
	private String module;
	private boolean showTitle = true;
	private Consumer<String> backListener;
	private Consumer<Model> selectListener;

	public ProjectModuleViewer(EditorBox box) {
		super(box);
	}

	public void model(Model model) {
		this.model = model;
	}

	public void project(String project) {
		this.project = project;
	}

	public void module(String module) {
		this.module = module;
	}

	public void showTitle(boolean value) {
		this.showTitle = value;
	}

	public void onBack(Consumer<String> listener) {
		this.backListener = listener;
	}

	public void onSelect(Consumer<Model> listener) {
		this.selectListener = listener;
	}

	@Override
	public void init() {
		super.init();
		back.onExecute(e -> backListener.accept(module));
	}

	@Override
	public void refresh() {
		super.refresh();
		refreshTitle();
		refreshModels();
	}

	private void refreshTitle() {
		titleBlock.visible(showTitle);
		if (!titleBlock.isVisible()) return;
		moduleName.value(this.module);
		back.visible(backListener != null);
	}

	private void refreshModels() {
		entriesBlock.formats(showTitle ? Set.of("tripleAirLeft") : Set.of());
		List<GavCoordinates> languages = box().modelManager().languages(model.project(), username()).stream().sorted(Comparator.comparing(GavCoordinates::artifactId)).toList();
		List<Model> models = box().modelManager().models(model.project(), module, username());
		entries.clear();
		languages.forEach(l -> fill(l, modelWith(l, models), entries.add()));
	}

	private Model modelWith(GavCoordinates language, List<Model> models) {
		return models.stream().filter(m -> m.language().equals(language)).findFirst().orElse(null);
	}

	private void fill(GavCoordinates language, Model model, ProjectModuleEntryViewer display) {
		display.model(model);
		display.project(project);
		display.module(module);
		display.language(language);
		display.selected(model != null && model.id().equals(this.model.id()));
		display.onSelect(e -> selectListener.accept(model));
		display.refresh();
	}

}