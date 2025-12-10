package io.quassar.editor.box.ui.displays.requesters;

import io.quassar.editor.box.ui.displays.GoogleLoginDisplay;
import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

import io.intino.alexandria.exceptions.AlexandriaException;
import io.intino.alexandria.ui.displays.notifiers.DisplayNotifierProvider;
import io.intino.alexandria.ui.server.AlexandriaUiManager;

public class GoogleLoginDisplayRequester extends io.intino.alexandria.ui.displays.requesters.DisplayRequester {

	public GoogleLoginDisplayRequester(AlexandriaUiManager manager, DisplayNotifierProvider notifierProvider) {
		super(manager, notifierProvider);
	}

	@Override
	public void execute() throws AlexandriaException {
		GoogleLoginDisplay display = display();
		if (display == null) return;
		String operation = operation();

		if (operation.equals("success")) {
			display.success(manager.fromQuery("v"));
			return;
		}
		else if (operation.equals("check")) {
			display.check(manager.fromQuery("v"));
			return;
		}
		else if (operation.equals("failure")) {
			display.failure();
			return;
		}

		super.execute();
	}
}