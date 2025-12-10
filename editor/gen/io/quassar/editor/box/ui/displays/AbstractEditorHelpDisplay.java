package io.quassar.editor.box.ui.displays;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.quassar.editor.box.ui.displays.notifiers.EditorHelpDisplayNotifier;

public abstract class AbstractEditorHelpDisplay<B extends Box> extends io.intino.alexandria.ui.displays.Display<EditorHelpDisplayNotifier, B> {

	public AbstractEditorHelpDisplay(B box) {
		super(box);
		id("editorHelpDisplay");
	}

	@Override
	public void init() {
		super.init();
	}

	@Override
	public void remove() {
		super.remove();
	}
}