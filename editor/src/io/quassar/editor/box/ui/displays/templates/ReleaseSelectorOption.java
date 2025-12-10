package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.ui.displays.components.selector.SelectorOption;
import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.util.PathHelper;
import io.quassar.editor.model.Language;
import io.quassar.editor.model.Model;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;

public class ReleaseSelectorOption extends AbstractReleaseSelectorOption<EditorBox> implements SelectorOption {
	private Language language;
	private String release;
	private Model metamodel;
	private Consumer<String> selectListener;
	private Consumer<String> removeListener;
	private boolean selected = false;

	public ReleaseSelectorOption(EditorBox box) {
		super(box);
		id(UUID.randomUUID().toString());
	}

	public ReleaseSelectorOption language(Language language) {
		this.language = language;
		return this;
	}

	public String release() {
		return release;
	}

	public ReleaseSelectorOption release(String release) {
		name(release);
		this.release = release;
		return this;
	}

	public ReleaseSelectorOption metamodel(Model metamodel) {
		this.metamodel = metamodel;
		return this;
	}

	public void selected(boolean value) {
		this.selected = value;
	}

	public ReleaseSelectorOption onSelect(Consumer<String> listener) {
		this.selectListener = listener;
		return this;
	}

	public ReleaseSelectorOption onRemove(Consumer<String> listener) {
		this.removeListener = listener;
		return this;
	}

	@Override
	public void update() {
		super.update();
		refresh();
	}

	@Override
	public void init() {
		super.init();
		version.onExecute(e -> {
			selectListener.accept(release);
			refreshFormats();
		});
		remove.onExecute(e -> removeListener.accept(release));
		remove.signChecker((sign, reason) -> release.equals(sign));
	}

	@Override
	public void refresh() {
		super.refresh();
		refreshFormats();
		version.title(release);
		version.address(path -> PathHelper.forgePath(path, metamodel.id(), release));
		remove.visible(language.release(release) != null);
	}

	private void refreshFormats() {
		contentBlock.formats(Set.of("relative", "versionSelector", selected ? "versionSelected" : ""));
		version.formats(Set.of("versionSelectorLink", selected ? "versionSelectorLinkSelected" : ""));
	}
}