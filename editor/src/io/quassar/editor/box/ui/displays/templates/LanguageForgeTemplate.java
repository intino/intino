package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.ui.displays.Display;
import io.intino.alexandria.ui.displays.UserMessage;
import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.commands.Command.CommandResult;
import io.quassar.editor.box.commands.LanguageCommands;
import io.quassar.editor.box.ui.types.ForgeView;
import io.quassar.editor.box.util.LanguageHelper;
import io.quassar.editor.box.util.PathHelper;
import io.quassar.editor.box.util.PermissionsHelper;
import io.quassar.editor.model.Language;
import io.quassar.editor.model.LogoSize;
import io.quassar.editor.model.Model;

import java.util.List;

public class LanguageForgeTemplate extends AbstractLanguageForgeTemplate<EditorBox> {
	private Language language;
	private String release;
	private ForgeView view;
	private int releasesCount = -1;

	public LanguageForgeTemplate(EditorBox box) {
		super(box);
	}

	public void language(Language language) {
		this.language = language;
	}

	public void release(String release) {
		this.release = release;
	}

	public void view(ForgeView view) {
		this.view = view;
	}

	@Override
	public void init() {
		super.init();
		infoLink.onExecute(e -> showInfoBlock());
		infoDialog.onOpen(e -> refreshInfoDialog());
		infoDialog.onClose(e -> refreshProperties());
		kitBlock.onInit(e -> initKitBlock());
		kitBlock.onShow(e -> refreshKitBlock());
		executionBlock.onInit(e -> initExecutionBlock());
		executionBlock.onShow(e -> refreshExecutionBlock());
		viewSelector.select(0);
		removeLanguage.signChecker((sign, reason) -> language.key().equals(sign));
		removeLanguage.onExecute(e -> removeLanguage());
		//versionSelector.onSelect(e -> updateVersion());
		refreshVersions.onExecute(e -> updateVersions());
	}

	@Override
	public void refresh() {
		super.refresh();
		refreshProperties();
		refreshVersions(true);
		refreshFooter();
		refreshView();
	}

	private void showInfoBlock() {
		infoDialog.open();
	}

	private void refreshView() {
		Model model = box().modelManager().get(language.metamodel());
		viewSelector.address(path -> PathHelper.forgePathPattern(path, model.id(), release));
		if (view != null) viewSelector.selection(view.name());
		hideViews();
		if (view == ForgeView.Kit) kitBlock.show();
		else if (view == ForgeView.Execution) executionBlock.show();
		else kitBlock.show();
	}

	private void hideViews() {
		if (kitBlock.isVisible()) kitBlock.hide();
		else if (executionBlock.isVisible()) executionBlock.hide();
	}

	private void refreshInfoDialog() {
		infoStamp.onRename(this::reload);
		infoStamp.language(language);
		infoStamp.release(release);
		infoStamp.refresh();
	}

	private void initKitBlock() {
		kitStamp.onCreateVersion(this::versionCreated);
	}

	private void refreshKitBlock() {
		kitStamp.language(language);
		kitStamp.release(release);
		kitStamp.refresh();
	}

	private void initExecutionBlock() {
		executionStamp.onCreateVersion(this::versionCreated);
	}

	private void refreshExecutionBlock() {
		executionStamp.language(language);
		executionStamp.release(release);
		executionStamp.refresh();
	}

	private void refreshProperties() {
		Model metamodel = box().modelManager().get(language.metamodel());
		logo.value(LanguageHelper.logo(language, LogoSize.S100, box()));
		languageName.value(language.key().toLowerCase());
		metamodelLink.site(PathHelper.modelUrl(metamodel, release, session()));
		removeLanguage.visible(PermissionsHelper.canRemove(language, session(), box()));
	}

	private void updateVersions() {
		refreshVersions(true);
	}

	private void refreshVersions(boolean force) {
		Model metamodel = box().modelManager().get(language.metamodel());
		List<String> releases = box().modelManager().releases(metamodel).reversed();
		if (!force && releases.size() == releasesCount) return;
		releasesCount = releases.size();
		versionSelector.visible(false);
		versionSelector.clear();
		releases.forEach(r -> fill(r, versionSelector.add()));
		if (release != null) versionSelector.select(releaseOptionOf(release));
		versionSelector.visible(true);
		versionSelector.children().stream().filter(d -> d instanceof ReleaseSelectorOption).forEach(Display::refresh);
		versionSelector.refresh();
	}

	private void fill(String release, ReleaseSelectorOption display) {
		Model metamodel = box().modelManager().get(language.metamodel());
		display.language(language);
		display.release(release);
		display.metamodel(metamodel);
		display.selected(this.release != null && this.release.equalsIgnoreCase(release));
		display.onSelect(e -> updateVersion(release));
		display.onRemove(this::removeRelease);
	}

	private String releaseOptionOf(String release) {
		return versionSelector.children().stream().filter(d -> d instanceof ReleaseSelectorOption && d.name().equals(release)).map(Display::name).findFirst().orElse(null);
	}

	private void refreshFooter() {
		Language parentLanguage = box().languageManager().get(language.parent());
		parentLanguageBlock.visible(parentLanguage != null);
		if (parentLanguage == null) return;
		parentLanguageImage.value(LanguageHelper.logo(parentLanguage, LogoSize.S100, box()));
		parentLanguageTitle.value("%s forge".formatted(parentLanguage.name()));
		parentLanguageLink.address(path -> PathHelper.languagePath(language));
	}

	private void updateVersion(String release) {
		this.release = release;
		refreshView();
	}

	private void versionCreated(CommandResult result) {
		if (!result.success()) notifyUser(translate("Could not create version"), UserMessage.Type.Error);
		refresh();
	}

	private void removeRelease(String release) {
		box().commands(LanguageCommands.class).remove(language, release, username());
		refresh();
	}

	private void removeLanguage() {
		notifyUser(translate("Removing language..."), UserMessage.Type.Loading);
		box().commands(LanguageCommands.class).remove(language, username());
		notifyUser(translate("Language removed"), UserMessage.Type.Success);
		Model model = box().modelManager().get(language.metamodel());
		notifier.redirect(PathHelper.modelUrl(model, session()));
	}

	private void reload(Language newLanguage) {
		this.language = newLanguage;
	}

}