package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractRenewLicenseDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Dialog dialog;
	public RenewLicenseDialog.Dialog. _308_8_0911235168 _308_8_0911235168;
	public RenewLicenseDialog.Dialog._308_8_0911235168. _309_9_11404111188 _309_9_11404111188;
	public RenewLicenseDialog.Dialog._308_8_0911235168._309_9_11404111188. Message message;
	public RenewLicenseDialog.Dialog. _310_2_1955995399 _310_2_1955995399;
	public RenewLicenseDialog.Dialog. _311_8_0163473411 _311_8_0163473411;
	public RenewLicenseDialog.Dialog._311_8_0163473411. _312_9_0857831584 _312_9_0857831584;
	public RenewLicenseDialog.Dialog._311_8_0163473411. Renew renew;

	public AbstractRenewLicenseDialog(B box) {
		super(box);
		id("renewLicenseDialog");
	}

	@Override
	public void init() {
		super.init();
		if (dialog == null) dialog = register(new Dialog(box()).<Dialog>id("a_1985304564").owner(AbstractRenewLicenseDialog.this));
		if (dialog != null) _308_8_0911235168 = dialog._308_8_0911235168;
		if (_308_8_0911235168 != null) _309_9_11404111188 = dialog._308_8_0911235168._309_9_11404111188;
		if (_309_9_11404111188 != null) message = dialog._308_8_0911235168._309_9_11404111188.message;
		if (dialog != null) _310_2_1955995399 = dialog._310_2_1955995399;
		if (dialog != null) _311_8_0163473411 = dialog._311_8_0163473411;
		if (_311_8_0163473411 != null) _312_9_0857831584 = dialog._311_8_0163473411._312_9_0857831584;
		if (_311_8_0163473411 != null) renew = dialog._311_8_0163473411.renew;


		if (_312_9_0857831584 != null) _312_9_0857831584.bindTo(dialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (dialog != null) dialog.unregister();
	}

	public class Dialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public RenewLicenseDialog.Dialog. _308_8_0911235168 _308_8_0911235168;
		public RenewLicenseDialog.Dialog. _310_2_1955995399 _310_2_1955995399;
		public RenewLicenseDialog.Dialog. _311_8_0163473411 _311_8_0163473411;

		public Dialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_308_8_0911235168 == null) _308_8_0911235168 = register(new _308_8_0911235168(box()).<_308_8_0911235168>id("a1475436255").owner(AbstractRenewLicenseDialog.this));
			if (_310_2_1955995399 == null) _310_2_1955995399 = register(new _310_2_1955995399(box()).<_310_2_1955995399>id("a_396218676").owner(AbstractRenewLicenseDialog.this));
			if (_311_8_0163473411 == null) _311_8_0163473411 = register(new _311_8_0163473411(box()).<_311_8_0163473411>id("a1466717633").owner(AbstractRenewLicenseDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_308_8_0911235168 != null) _308_8_0911235168.unregister();
			if (_310_2_1955995399 != null) _310_2_1955995399.unregister();
			if (_311_8_0163473411 != null) _311_8_0163473411.unregister();
		}

		public class _308_8_0911235168 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public RenewLicenseDialog.Dialog._308_8_0911235168. _309_9_11404111188 _309_9_11404111188;

			public _308_8_0911235168(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_309_9_11404111188 == null) _309_9_11404111188 = register(new _309_9_11404111188(box()).<_309_9_11404111188>id("a_281862508").owner(AbstractRenewLicenseDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_309_9_11404111188 != null) _309_9_11404111188.unregister();
			}

			public class _309_9_11404111188 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public RenewLicenseDialog.Dialog._308_8_0911235168._309_9_11404111188. Message message;

				public _309_9_11404111188(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (message == null) message = register(new Message(box()).<Message>id("a1966507781").owner(AbstractRenewLicenseDialog.this));
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

		public class _310_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _310_2_1955995399(B box) {
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

		public class _311_8_0163473411 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public RenewLicenseDialog.Dialog._311_8_0163473411. _312_9_0857831584 _312_9_0857831584;
			public RenewLicenseDialog.Dialog._311_8_0163473411. Renew renew;

			public _311_8_0163473411(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_312_9_0857831584 == null) _312_9_0857831584 = register(new _312_9_0857831584(box()).<_312_9_0857831584>id("a_2032822775").owner(AbstractRenewLicenseDialog.this));
				if (renew == null) renew = register(new Renew(box()).<Renew>id("a_1567426847").owner(AbstractRenewLicenseDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_312_9_0857831584 != null) _312_9_0857831584.unregister();
				if (renew != null) renew.unregister();
			}

			public class _312_9_0857831584 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _312_9_0857831584(B box) {
					super(box);
					_title("Cancel");
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
					_title("Rewew");
					_readonly(true);
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