package io.quassar.editor.box.ui.displays.requesters;

import io.quassar.editor.box.ui.displays.IntinoFileBrowser;
import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

import io.intino.alexandria.exceptions.AlexandriaException;
import io.intino.alexandria.ui.displays.notifiers.DisplayNotifierProvider;
import io.intino.alexandria.ui.server.AlexandriaUiManager;

public class IntinoFileBrowserRequester extends io.intino.alexandria.ui.displays.requesters.DisplayRequester {

	public IntinoFileBrowserRequester(AlexandriaUiManager manager, DisplayNotifierProvider notifierProvider) {
		super(manager, notifierProvider);
	}

	@Override
	public void execute() throws AlexandriaException {
		IntinoFileBrowser display = display();
		if (display == null) return;
		String operation = operation();

		if (operation.equals("open")) {
			display.open(manager.fromQuery("v"));
			return;
		}
		else if (operation.equals("rename")) {
			display.rename(io.intino.alexandria.Json.fromString(manager.fromQuery("v"), io.quassar.editor.box.schemas.IntinoFileBrowserRenameInfo.class));
			return;
		}
		else if (operation.equals("move")) {
			display.move(io.intino.alexandria.Json.fromString(manager.fromQuery("v"), io.quassar.editor.box.schemas.IntinoFileBrowserMoveInfo.class));
			return;
		}
		else if (operation.equals("executeOperation")) {
			display.executeOperation(io.intino.alexandria.Json.fromString(manager.fromQuery("v"), io.quassar.editor.box.schemas.IntinoFileBrowserOperationInfo.class));
			return;
		}

		super.execute();
	}
}