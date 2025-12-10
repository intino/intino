package io.quassar.editor.box.ui.displays.templates;

import io.quassar.editor.box.EditorBox;

import java.util.function.Consumer;

public class LinkTemplate extends AbstractLinkTemplate<EditorBox> {
	private String linkTitle;
	private Consumer<String> clickListener;

	public LinkTemplate(EditorBox box) {
		super(box);
	}

	public void linkTitle(String title) {
		this.linkTitle = title;
	}

	public void onClick(Consumer<String> listener) {
		this.clickListener = listener;
	}

	@Override
	public void init() {
		super.init();
		link.onExecute(e -> clickListener.accept(linkTitle));
	}

	@Override
	public void refresh() {
		super.refresh();
		link.title(linkTitle);
	}

}