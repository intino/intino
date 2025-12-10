package io.quassar.editor.box.ui.displays.notifiers;

import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

public class IntinoDslEditorNotifier extends io.intino.alexandria.ui.displays.notifiers.DisplayNotifier {

	public IntinoDslEditorNotifier(io.intino.alexandria.ui.displays.Display display, io.intino.alexandria.http.pushservice.MessageCarrier carrier) {
		super(display, carrier);
	}

	public void setup(IntinoDslEditorSetup value) {
		putToDisplay("setup", "v", value);
	}

	public void refreshReadonly(Boolean value) {
		putToDisplay("refreshReadonly", "v", value);
	}

	public void refreshFile(IntinoDslEditorFile value) {
		putToDisplay("refreshFile", "v", value);
	}

	public void receiveContent() {
		putToDisplay("receiveContent");
	}
}