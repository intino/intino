package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractAddLicenseEditor<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public LicenseField licenseField;
	public FailureDialog failureDialog;
	public AddLicenseEditor.FailureDialog. _287_8_1516982255 _287_8_1516982255;
	public AddLicenseEditor.FailureDialog._287_8_1516982255. FailureMessage failureMessage;
	public AddLicenseEditor.FailureDialog. _289_2_1955995399 _289_2_1955995399;
	public AddLicenseEditor.FailureDialog. _290_8_01929279552 _290_8_01929279552;
	public AddLicenseEditor.FailureDialog._290_8_01929279552. _291_9_01175288936 _291_9_01175288936;

	public AbstractAddLicenseEditor(B box) {
		super(box);
		id("addLicenseEditor");
	}

	@Override
	public void init() {
		super.init();
		if (licenseField == null) licenseField = register(new LicenseField(box()).<LicenseField>id("a_1541607860").owner(AbstractAddLicenseEditor.this));
		if (failureDialog == null) failureDialog = register(new FailureDialog(box()).<FailureDialog>id("a_657314625").owner(AbstractAddLicenseEditor.this));
		if (failureDialog != null) _287_8_1516982255 = failureDialog._287_8_1516982255;
		if (_287_8_1516982255 != null) failureMessage = failureDialog._287_8_1516982255.failureMessage;
		if (failureDialog != null) _289_2_1955995399 = failureDialog._289_2_1955995399;
		if (failureDialog != null) _290_8_01929279552 = failureDialog._290_8_01929279552;
		if (_290_8_01929279552 != null) _291_9_01175288936 = failureDialog._290_8_01929279552._291_9_01175288936;


		if (_291_9_01175288936 != null) _291_9_01175288936.bindTo(failureDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (licenseField != null) licenseField.unregister();
		if (failureDialog != null) failureDialog.unregister();
	}

	public class LicenseField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

		public LicenseField(B box) {
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

	public class FailureDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public AddLicenseEditor.FailureDialog. _287_8_1516982255 _287_8_1516982255;
		public AddLicenseEditor.FailureDialog. _289_2_1955995399 _289_2_1955995399;
		public AddLicenseEditor.FailureDialog. _290_8_01929279552 _290_8_01929279552;

		public FailureDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_287_8_1516982255 == null) _287_8_1516982255 = register(new _287_8_1516982255(box()).<_287_8_1516982255>id("a926666012").owner(AbstractAddLicenseEditor.this));
			if (_289_2_1955995399 == null) _289_2_1955995399 = register(new _289_2_1955995399(box()).<_289_2_1955995399>id("a_2004013762").owner(AbstractAddLicenseEditor.this));
			if (_290_8_01929279552 == null) _290_8_01929279552 = register(new _290_8_01929279552(box()).<_290_8_01929279552>id("a_1351570847").owner(AbstractAddLicenseEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_287_8_1516982255 != null) _287_8_1516982255.unregister();
			if (_289_2_1955995399 != null) _289_2_1955995399.unregister();
			if (_290_8_01929279552 != null) _290_8_01929279552.unregister();
		}

		public class _287_8_1516982255 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public AddLicenseEditor.FailureDialog._287_8_1516982255. FailureMessage failureMessage;

			public _287_8_1516982255(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (failureMessage == null) failureMessage = register(new FailureMessage(box()).<FailureMessage>id("a228084715").owner(AbstractAddLicenseEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (failureMessage != null) failureMessage.unregister();
			}

			public class FailureMessage extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public FailureMessage(B box) {
					super(box);
					_value("Failure! The license code is invalid or has already been used");
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

		public class _289_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _289_2_1955995399(B box) {
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

		public class _290_8_01929279552 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public AddLicenseEditor.FailureDialog._290_8_01929279552. _291_9_01175288936 _291_9_01175288936;

			public _290_8_01929279552(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_291_9_01175288936 == null) _291_9_01175288936 = register(new _291_9_01175288936(box()).<_291_9_01175288936>id("a_439027308").owner(AbstractAddLicenseEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_291_9_01175288936 != null) _291_9_01175288936.unregister();
			}

			public class _291_9_01175288936 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _291_9_01175288936(B box) {
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
		}
	}
}