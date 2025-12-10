package io.quassar.editor.box.ui.displays;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.quassar.editor.box.ui.displays.notifiers.HelpEditorNotifier;

public abstract class AbstractHelpEditor<B extends Box> extends io.intino.alexandria.ui.displays.Display<HelpEditorNotifier, B> {

	public AbstractHelpEditor(B box) {
		super(box);
		id("helpEditor");
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