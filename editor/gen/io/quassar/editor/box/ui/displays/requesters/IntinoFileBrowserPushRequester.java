package io.quassar.editor.box.ui.displays.requesters;

import io.quassar.editor.box.ui.displays.IntinoFileBrowser;
import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

import io.intino.alexandria.exceptions.AlexandriaException;
import io.intino.alexandria.ui.services.push.UIClient;
import io.intino.alexandria.ui.services.push.UIMessage;
import io.intino.alexandria.ui.server.AlexandriaUiManager;

public class IntinoFileBrowserPushRequester extends io.intino.alexandria.ui.displays.requesters.DisplayPushRequester {

	public void execute(UIClient client, UIMessage message) {
		IntinoFileBrowser display = display(client, message);
		if (display == null) return;
		String operation = operation(message);
		String data = data(message);

		if (operation.equals("open")) {
			display.open(data);
			return;
		}
		else if (operation.equals("rename")) {
			display.rename(io.intino.alexandria.Json.fromString(data, io.quassar.editor.box.schemas.IntinoFileBrowserRenameInfo.class));
			return;
		}
		else if (operation.equals("move")) {
			display.move(io.intino.alexandria.Json.fromString(data, io.quassar.editor.box.schemas.IntinoFileBrowserMoveInfo.class));
			return;
		}
		else if (operation.equals("executeOperation")) {
			display.executeOperation(io.intino.alexandria.Json.fromString(data, io.quassar.editor.box.schemas.IntinoFileBrowserOperationInfo.class));
			return;
		}

		super.execute(client, message);
	}

}