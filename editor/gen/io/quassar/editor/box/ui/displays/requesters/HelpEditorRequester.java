package io.quassar.editor.box.ui.displays.requesters;

import io.quassar.editor.box.ui.displays.HelpEditor;
import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

import io.intino.alexandria.exceptions.AlexandriaException;
import io.intino.alexandria.ui.displays.notifiers.DisplayNotifierProvider;
import io.intino.alexandria.ui.server.AlexandriaUiManager;

public class HelpEditorRequester extends io.intino.alexandria.ui.displays.requesters.DisplayRequester {

	public HelpEditorRequester(AlexandriaUiManager manager, DisplayNotifierProvider notifierProvider) {
		super(manager, notifierProvider);
	}

	@Override
	public void execute() throws AlexandriaException {
		HelpEditor display = display();
		if (display == null) return;
		String operation = operation();

		if (operation.equals("update")) {
			display.update(manager.fromQuery("v"));
			return;
		}

		super.execute();
	}
}