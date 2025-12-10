package io.quassar.editor.box.ui.displays.notifiers;

import io.intino.alexandria.exceptions.*;
import io.quassar.editor.box.*;
import io.quassar.editor.box.schemas.*;

public class IntinoFileBrowserNotifier extends io.intino.alexandria.ui.displays.notifiers.DisplayNotifier {

	public IntinoFileBrowserNotifier(io.intino.alexandria.ui.displays.Display display, io.intino.alexandria.http.pushservice.MessageCarrier carrier) {
		super(display, carrier);
	}

	public void refresh(IntinoFileBrowserInfo value) {
		putToDisplay("refresh", "v", value);
	}

	public void select(IntinoFileBrowserItem value) {
		putToDisplay("select", "v", value);
	}

	public void openContextMenu(java.util.List<IntinoFileBrowserOperation> value) {
		putToDisplay("openContextMenu", "v", value);
	}
}