package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractAddCollaboratorDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Dialog dialog;
	public AddCollaboratorDialog.Dialog. _37_8_0322069185 _37_8_0322069185;
	public AddCollaboratorDialog.Dialog. _38_2_1955995399 _38_2_1955995399;
	public AddCollaboratorDialog.Dialog. _39_8_01308035038 _39_8_01308035038;
	public AddCollaboratorDialog.Dialog._39_8_01308035038. _40_12_0857831584 _40_12_0857831584;
	public AddCollaboratorDialog.Dialog._39_8_01308035038. Add add;

	public AbstractAddCollaboratorDialog(B box) {
		super(box);
		id("addCollaboratorDialog");
	}

	@Override
	public void init() {
		super.init();
		if (dialog == null) dialog = register(new Dialog(box()).<Dialog>id("a2009788407").owner(AbstractAddCollaboratorDialog.this));
		if (dialog != null) _37_8_0322069185 = dialog._37_8_0322069185;
		if (dialog != null) _38_2_1955995399 = dialog._38_2_1955995399;
		if (dialog != null) _39_8_01308035038 = dialog._39_8_01308035038;
		if (_39_8_01308035038 != null) _40_12_0857831584 = dialog._39_8_01308035038._40_12_0857831584;
		if (_39_8_01308035038 != null) add = dialog._39_8_01308035038.add;


		if (_40_12_0857831584 != null) _40_12_0857831584.bindTo(dialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (dialog != null) dialog.unregister();
	}

	public class Dialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public AddCollaboratorDialog.Dialog. _37_8_0322069185 _37_8_0322069185;
		public AddCollaboratorDialog.Dialog. _38_2_1955995399 _38_2_1955995399;
		public AddCollaboratorDialog.Dialog. _39_8_01308035038 _39_8_01308035038;

		public Dialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_37_8_0322069185 == null) _37_8_0322069185 = register(new _37_8_0322069185(box()).<_37_8_0322069185>id("a2139693513").owner(AbstractAddCollaboratorDialog.this));
			if (_38_2_1955995399 == null) _38_2_1955995399 = register(new _38_2_1955995399(box()).<_38_2_1955995399>id("a_2030343946").owner(AbstractAddCollaboratorDialog.this));
			if (_39_8_01308035038 == null) _39_8_01308035038 = register(new _39_8_01308035038(box()).<_39_8_01308035038>id("a_1646064748").owner(AbstractAddCollaboratorDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_37_8_0322069185 != null) _37_8_0322069185.unregister();
			if (_38_2_1955995399 != null) _38_2_1955995399.unregister();
			if (_39_8_01308035038 != null) _39_8_01308035038.unregister();
		}

		public class _37_8_0322069185 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {

			public _37_8_0322069185(B box) {
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

		public class _38_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _38_2_1955995399(B box) {
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

		public class _39_8_01308035038 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public AddCollaboratorDialog.Dialog._39_8_01308035038. _40_12_0857831584 _40_12_0857831584;
			public AddCollaboratorDialog.Dialog._39_8_01308035038. Add add;

			public _39_8_01308035038(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_40_12_0857831584 == null) _40_12_0857831584 = register(new _40_12_0857831584(box()).<_40_12_0857831584>id("a_614496234").owner(AbstractAddCollaboratorDialog.this));
				if (add == null) add = register(new Add(box()).<Add>id("a1531840888").owner(AbstractAddCollaboratorDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_40_12_0857831584 != null) _40_12_0857831584.unregister();
				if (add != null) add.unregister();
			}

			public class _40_12_0857831584 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _40_12_0857831584(B box) {
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

			public class Add extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Add(B box) {
					super(box);
					_title("Add");
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