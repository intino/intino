package io.quassar.editor.box.ui.displays.templates;

import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.ui.types.ForgeView;
import io.quassar.editor.box.util.PermissionsHelper;
import io.quassar.editor.box.util.SessionHelper;
import io.quassar.editor.model.Language;
import io.quassar.editor.model.Model;

public class ForgeTemplate extends AbstractForgeTemplate<EditorBox> {
	private Model model;
	private String release;
	private ForgeView view;

	public ForgeTemplate(EditorBox box) {
		super(box);
	}

	public void open(String model, String release, String view) {
		this.model = box().modelManager().get(model);
		this.release = release;
		this.view = view != null ? ForgeView.from(view) : SessionHelper.forgeView(session());
		refresh();
	}

	@Override
	public void init() {
		super.init();
		createLanguageBlock.onInit(e -> initCreateLanguageBlock());
		createLanguageBlock.onShow(e -> refreshCreateLanguageBlock());
		languageBlock.onShow(e -> refreshLanguageBlock());
	}

	@Override
	public void refresh() {
		super.refresh();
		refreshBlocks();
		if (model == null) return;
		refreshLanguageBlocks(box().languageManager().getWithMetamodel(model));
	}

	private void refreshBlocks() {
		boolean hasPermissions = PermissionsHelper.hasPermissions(model, session(), box());
		notFoundBlock.visible(!hasPermissions);
		if (!hasPermissions) {
			contentBlock.visible(false);
			return;
		}
		if (contentBlock.isVisible()) return;
		contentBlock.visible(true);
	}

	private void refreshLanguageBlocks(Language language) {
		if (language == null) {
			languageBlock.hide();
			createLanguageBlock.show();
		}
		else {
			createLanguageBlock.hide();
			if (!languageBlock.isVisible()) languageBlock.show();
			else refreshLanguageBlock();
		}
	}

	private void initCreateLanguageBlock() {
		createLanguageStamp.onCreate(language -> refresh());
	}

	private void refreshCreateLanguageBlock() {
		createLanguageStamp.model(model);
		createLanguageStamp.release(release);
		createLanguageStamp.refresh();
	}

	private void refreshLanguageBlock() {
		languageStamp.language(box().languageManager().getWithMetamodel(model));
		languageStamp.release(release);
		languageStamp.view(view);
		languageStamp.refresh();
	}

}