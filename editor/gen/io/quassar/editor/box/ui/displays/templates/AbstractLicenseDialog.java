package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLicenseDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Dialog dialog;
	public LicenseDialog.Dialog. _296_8_0911235168 _296_8_0911235168;
	public LicenseDialog.Dialog._296_8_0911235168. _297_9_11404111188 _297_9_11404111188;
	public LicenseDialog.Dialog._296_8_0911235168._297_9_11404111188. Message message;
	public LicenseDialog.Dialog. _298_2_1955995399 _298_2_1955995399;
	public LicenseDialog.Dialog. _299_8_01461291740 _299_8_01461291740;
	public LicenseDialog.Dialog._299_8_01461291740. _300_9_11021209232 _300_9_11021209232;
	public LicenseDialog.Dialog._299_8_01461291740. Renew renew;
	public RenewLicenseDialog renewDialog;

	public AbstractLicenseDialog(B box) {
		super(box);
		id("licenseDialog");
	}

	@Override
	public void init() {
		super.init();
		if (dialog == null) dialog = register(new Dialog(box()).<Dialog>id("a1639347261").owner(AbstractLicenseDialog.this));
		if (dialog != null) _296_8_0911235168 = dialog._296_8_0911235168;
		if (_296_8_0911235168 != null) _297_9_11404111188 = dialog._296_8_0911235168._297_9_11404111188;
		if (_297_9_11404111188 != null) message = dialog._296_8_0911235168._297_9_11404111188.message;
		if (dialog != null) _298_2_1955995399 = dialog._298_2_1955995399;
		if (dialog != null) _299_8_01461291740 = dialog._299_8_01461291740;
		if (_299_8_01461291740 != null) _300_9_11021209232 = dialog._299_8_01461291740._300_9_11021209232;
		if (_299_8_01461291740 != null) renew = dialog._299_8_01461291740.renew;
		if (renewDialog == null) renewDialog = register(new RenewLicenseDialog((EditorBox)box()).id("a258256992"));


		if (_300_9_11021209232 != null) _300_9_11021209232.bindTo(dialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (dialog != null) dialog.unregister();
		if (renewDialog != null) renewDialog.unregister();
	}

	public class Dialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public LicenseDialog.Dialog. _296_8_0911235168 _296_8_0911235168;
		public LicenseDialog.Dialog. _298_2_1955995399 _298_2_1955995399;
		public LicenseDialog.Dialog. _299_8_01461291740 _299_8_01461291740;

		public Dialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_296_8_0911235168 == null) _296_8_0911235168 = register(new _296_8_0911235168(box()).<_296_8_0911235168>id("a170404860").owner(AbstractLicenseDialog.this));
			if (_298_2_1955995399 == null) _298_2_1955995399 = register(new _298_2_1955995399(box()).<_298_2_1955995399>id("a325546462").owner(AbstractLicenseDialog.this));
			if (_299_8_01461291740 == null) _299_8_01461291740 = register(new _299_8_01461291740(box()).<_299_8_01461291740>id("a871662662").owner(AbstractLicenseDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_296_8_0911235168 != null) _296_8_0911235168.unregister();
			if (_298_2_1955995399 != null) _298_2_1955995399.unregister();
			if (_299_8_01461291740 != null) _299_8_01461291740.unregister();
		}

		public class _296_8_0911235168 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicenseDialog.Dialog._296_8_0911235168. _297_9_11404111188 _297_9_11404111188;

			public _296_8_0911235168(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_297_9_11404111188 == null) _297_9_11404111188 = register(new _297_9_11404111188(box()).<_297_9_11404111188>id("a1805948948").owner(AbstractLicenseDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_297_9_11404111188 != null) _297_9_11404111188.unregister();
			}

			public class _297_9_11404111188 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LicenseDialog.Dialog._296_8_0911235168._297_9_11404111188. Message message;

				public _297_9_11404111188(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (message == null) message = register(new Message(box()).<Message>id("a_1574376615").owner(AbstractLicenseDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (message != null) message.unregister();
				}

				public class Message extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public Message(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
					}

					@Override
					public void unregister() {
						super.unregister();
					}
				}
			}
		}

		public class _298_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _298_2_1955995399(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
			}

			@Override
			public void unregister() {
				super.unregister();
			}
		}

		public class _299_8_01461291740 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicenseDialog.Dialog._299_8_01461291740. _300_9_11021209232 _300_9_11021209232;
			public LicenseDialog.Dialog._299_8_01461291740. Renew renew;

			public _299_8_01461291740(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_300_9_11021209232 == null) _300_9_11021209232 = register(new _300_9_11021209232(box()).<_300_9_11021209232>id("a_832093055").owner(AbstractLicenseDialog.this));
				if (renew == null) renew = register(new Renew(box()).<Renew>id("a1377649952").owner(AbstractLicenseDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_300_9_11021209232 != null) _300_9_11021209232.unregister();
				if (renew != null) renew.unregister();
			}

			public class _300_9_11021209232 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _300_9_11021209232(B box) {
					super(box);
					_title("Close");
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Button"));
				}

				@Override
				public void init() {
					super.init();
				}

				@Override
				public void unregister() {
					super.unregister();
				}
			}

			public class Renew extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Renew(B box) {
					super(box);
					_title("Renew");
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Button"));
				}

				@Override
				public void init() {
					super.init();
				}

				@Override
				public void unregister() {
					super.unregister();
				}
			}
		}
	}
}