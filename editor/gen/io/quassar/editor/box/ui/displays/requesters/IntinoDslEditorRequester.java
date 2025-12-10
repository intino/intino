package io.quassar.editor.box.ui.displays.requesters;

import io.quassar.editor.box.ui.displays.IntinoDslEditor;
import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

import io.intino.alexandria.exceptions.AlexandriaException;
import io.intino.alexandria.ui.displays.notifiers.DisplayNotifierProvider;
import io.intino.alexandria.ui.server.AlexandriaUiManager;

public class IntinoDslEditorRequester extends io.intino.alexandria.ui.displays.requesters.DisplayRequester {

	public IntinoDslEditorRequester(AlexandriaUiManager manager, DisplayNotifierProvider notifierProvider) {
		super(manager, notifierProvider);
	}

	@Override
	public void execute() throws AlexandriaException {
		IntinoDslEditor display = display();
		if (display == null) return;
		String operation = operation();

		if (operation.equals("fileModified")) {
			display.fileModified();
			return;
		}
		else if (operation.equals("fileContent")) {
			display.fileContent(io.intino.alexandria.Json.fromString(manager.fromQuery("v"), io.quassar.editor.box.schemas.IntinoDslEditorFileContent.class));
			return;
		}
		else if (operation.equals("executeCommand")) {
			display.executeCommand(manager.fromQuery("v"));
			return;
		}
		else if (operation.equals("fileSelected")) {
			display.fileSelected(manager.fromQuery("v"));
			return;
		}

		super.execute();
	}
}