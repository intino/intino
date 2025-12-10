package io.quassar.editor.box.ui.displays.templates;

import io.quassar.editor.box.EditorBox;
import io.quassar.editor.model.Model;

import java.util.Set;
import java.util.function.Consumer;

public class ProjectModuleLinkViewer extends AbstractProjectModuleLinkViewer<EditorBox> {
	private Model model;
	private String project;
	private String module;
	private Consumer<String> selectListener;
	private boolean selected = false;

	public ProjectModuleLinkViewer(EditorBox box) {
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

	public void onSelect(Consumer<String> listener) {
		this.selectListener = listener;
	}

	public void selected(boolean value) {
		this.selected = value;
	}

	@Override
	public void init() {
		super.init();
		moduleLink.onExecute(e -> selectListener.accept(module));
	}

	@Override
	public void refresh() {
		super.refresh();
		bubble.formats(Set.of("bubble", model != null ? "bubbleFilled" : "bubbleNotFilled"));
		refreshLink();
		refreshText();
	}

	private void refreshLink() {
		moduleLink.visible(!selected);
		if (!moduleLink.isVisible()) return;
		moduleLink.title(this.module);
	}

	private void refreshText() {
		moduleText.visible(selected);
		if (!moduleText.isVisible()) return;
		moduleText.value(this.module);
	}

}