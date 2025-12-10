package io.quassar.editor.box.ui.displays.templates;

import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.util.ModelHelper;
import io.quassar.editor.model.Model;

public class ModelNameViewer extends AbstractModelNameViewer<EditorBox> {
	private Model model;

	public ModelNameViewer(EditorBox box) {
		super(box);
	}

	public void model(Model model) {
		this.model = model;
	}

	@Override
	public void init() {
		super.init();
		simpleNameBlock.onInit(e -> initSimpleNameBlock());
		simpleNameBlock.onShow(e -> refreshSimpleNameBlock());
		qualifiedNameBlock.onInit(e -> initQualifiedNameBlock());
		qualifiedNameBlock.onShow(e -> refreshQualifiedNameBlock());
		projectBlock.onOpen(e -> refreshProjectBlock());
		moduleBlock.onOpen(e -> refreshModuleBlock());
	}

	@Override
	public void refresh() {
		super.refresh();
		qualifiedNameBlock.hide();
		simpleNameBlock.hide();
		if (model.isQualifiedName()) qualifiedNameBlock.show();
		else simpleNameBlock.show();
	}

	private void initSimpleNameBlock() {
	}

	private void refreshSimpleNameBlock() {
		nameField.value(ModelHelper.label(model, language(), box()));
	}

	private void initQualifiedNameBlock() {
	}

	private void refreshQualifiedNameBlock() {
		project.title(model.project());
		module.title(model.module());
	}

	private void refreshProjectBlock() {
		projectBlock.projectBlockHeader.projectBlockTitle.value(translate("Modules in %s").formatted(model.project()));
		projectBlock.projectBlockContent.projectViewer.model(model);
		projectBlock.projectBlockContent.projectViewer.onSelect(e -> { projectBlock.close(); module.launch(); } );
		projectBlock.projectBlockContent.projectViewer.project(model.project());
		projectBlock.projectBlockContent.projectViewer.refresh();
	}

	private void refreshModuleBlock() {
		moduleBlock.moduleBlockHeader.moduleBlockTitle.value(translate("Models in %s: %s").formatted(model.project(), model.module()));
		moduleBlock.moduleBlockContent.moduleViewer.onSelect(e -> moduleBlock.close());
		moduleBlock.moduleBlockContent.moduleViewer.model(model);
		moduleBlock.moduleBlockContent.moduleViewer.project(model.project());
		moduleBlock.moduleBlockContent.moduleViewer.module(model.module());
		moduleBlock.moduleBlockContent.moduleViewer.showTitle(false);
		moduleBlock.moduleBlockContent.moduleViewer.refresh();
	}

}