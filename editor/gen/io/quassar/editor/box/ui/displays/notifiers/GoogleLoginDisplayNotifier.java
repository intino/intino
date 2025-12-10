package io.quassar.editor.box.ui.displays.notifiers;

import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

public class GoogleLoginDisplayNotifier extends io.intino.alexandria.ui.displays.notifiers.DisplayNotifier {

	public GoogleLoginDisplayNotifier(io.intino.alexandria.ui.displays.Display display, io.intino.alexandria.http.pushservice.MessageCarrier carrier) {
		super(display, carrier);
	}

	public void refresh(String value) {
		putToDisplay("refresh", "v", value);
	}

	public void logout() {
		putToDisplay("logout");
	}
}