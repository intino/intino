package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.ui.displays.events.KeyPressEvent;
import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.commands.ModelCommands;
import io.quassar.editor.box.util.DisplayHelper;
import io.quassar.editor.box.util.ModelHelper;
import io.quassar.editor.box.util.PathHelper;
import io.quassar.editor.model.Model;

import java.util.List;
import java.util.function.Consumer;

public class ProjectViewer extends AbstractProjectViewer<EditorBox> {
	private Model model;
	private String project;
	private Consumer<Model> selectListener;

	public ProjectViewer(EditorBox box) {
		super(box);
	}

	public void model(Model model) {
		this.model = model;
	}

	public void project(String project) {
		this.project = project;
		newModuleField.value(null);
	}

	public void onSelect(Consumer<Model> listener) {
		this.selectListener = listener;
	}

	@Override
	public void init() {
		super.init();
		newModuleField.onEnterPress(this::addModule);
	}

	@Override
	public void refresh() {
		super.refresh();
		List<String> moduleList = box().modelManager().modules(project, username());
		modules.clear();
		moduleList.forEach(p -> fill(p, modules.add()));
	}

	private void fill(String module, ProjectModuleLinkViewer display) {
		display.model(box().modelManager().model(project, module, this.model.language(), username()));
		display.onSelect(e -> open(module));
		display.module(module);
		display.selected(module != null && model.module().equals(module));
		display.refresh();
	}

	private void open(String module) {
		Model model = box().modelManager().model(project, module, this.model.language(), username());
		if (model == null) {
			model = box().commands(ModelCommands.class).create(ModelHelper.proposeName(), "", this.model.language(), username(), username());
			box().commands(ModelCommands.class).saveQualifiedName(model, project, module, username());
		}
		notifier.redirect(PathHelper.modelUrl(model, session()));
/*
		currentModule.model(model);
		currentModule.onBack(e -> openModules());
		currentModule.project(project);
		currentModule.module(module);
		currentModule.refresh();
		modules.hide();
		currentModuleBlock.show();
 */
	}

	private void openModules() {
		modules.show();
		currentModuleBlock.hide();
		refresh();
	}

	private void addModule(KeyPressEvent e) {
		if (e.value() == null) return;
		if (!DisplayHelper.check(newModuleField, this::translate)) return;
		String name = e.value();
		box().commands(ModelCommands.class).createModule(name, project, model.language(), username());
		newModuleField.value(null);
		open(name);
	}

}