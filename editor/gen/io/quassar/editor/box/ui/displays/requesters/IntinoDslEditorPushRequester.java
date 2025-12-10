package io.quassar.editor.box.ui.displays.requesters;

import io.quassar.editor.box.ui.displays.IntinoDslEditor;
import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

import io.intino.alexandria.exceptions.AlexandriaException;
import io.intino.alexandria.ui.services.push.UIClient;
import io.intino.alexandria.ui.services.push.UIMessage;
import io.intino.alexandria.ui.server.AlexandriaUiManager;

public class IntinoDslEditorPushRequester extends io.intino.alexandria.ui.displays.requesters.DisplayPushRequester {

	public void execute(UIClient client, UIMessage message) {
		IntinoDslEditor display = display(client, message);
		if (display == null) return;
		String operation = operation(message);
		String data = data(message);

		if (operation.equals("fileModified")) {
			display.fileModified();
			return;
		}
		else if (operation.equals("fileContent")) {
			display.fileContent(io.intino.alexandria.Json.fromString(data, io.quassar.editor.box.schemas.IntinoDslEditorFileContent.class));
			return;
		}
		else if (operation.equals("executeCommand")) {
			display.executeCommand(data);
			return;
		}
		else if (operation.equals("fileSelected")) {
			display.fileSelected(data);
			return;
		}

		super.execute(client, message);
	}

}