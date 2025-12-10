package io.quassar.editor.box.ui.displays.notifiers;

import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

public class HelpEditorNotifier extends io.intino.alexandria.ui.displays.notifiers.DisplayNotifier {

	public HelpEditorNotifier(io.intino.alexandria.ui.displays.Display display, io.intino.alexandria.http.pushservice.MessageCarrier carrier) {
		super(display, carrier);
	}

	public void refresh(String value) {
		putToDisplay("refresh", "v", value);
	}
}