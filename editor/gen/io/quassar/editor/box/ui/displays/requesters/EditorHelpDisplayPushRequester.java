package io.quassar.editor.box.ui.displays.requesters;

import io.quassar.editor.box.ui.displays.EditorHelpDisplay;
import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

import io.intino.alexandria.exceptions.AlexandriaException;
import io.intino.alexandria.ui.services.push.UIClient;
import io.intino.alexandria.ui.services.push.UIMessage;
import io.intino.alexandria.ui.server.AlexandriaUiManager;

public class EditorHelpDisplayPushRequester extends io.intino.alexandria.ui.displays.requesters.DisplayPushRequester {

	public void execute(UIClient client, UIMessage message) {
		EditorHelpDisplay display = display(client, message);
		if (display == null) return;
		String operation = operation(message);
		String data = data(message);

		super.execute(client, message);
	}

}