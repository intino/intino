package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractCreateCollectionDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _257_1_1763352871 _257_1_1763352871;
	public Dialog dialog;
	public CreateCollectionDialog.Dialog. _260_8_02080184234 _260_8_02080184234;
	public CreateCollectionDialog.Dialog._260_8_02080184234. Hint hint;
	public CreateCollectionDialog.Dialog._260_8_02080184234. _262_9_1142717409 _262_9_1142717409;
	public CreateCollectionDialog.Dialog._260_8_02080184234._262_9_1142717409. NameField nameField;
	public CreateCollectionDialog.Dialog._260_8_02080184234._262_9_1142717409. ValidIcon validIcon;
	public CreateCollectionDialog.Dialog._260_8_02080184234._262_9_1142717409. InvalidIcon invalidIcon;
	public CreateCollectionDialog.Dialog. _266_2_1955995399 _266_2_1955995399;
	public CreateCollectionDialog.Dialog. _267_8_1772323692 _267_8_1772323692;
	public CreateCollectionDialog.Dialog._267_8_1772323692. _268_9_11021209232 _268_9_11021209232;
	public CreateCollectionDialog.Dialog._267_8_1772323692. Create create;

	public AbstractCreateCollectionDialog(B box) {
		super(box);
		id("createCollectionDialog");
	}

	@Override
	public void init() {
		super.init();
		if (_257_1_1763352871 == null) _257_1_1763352871 = register(new _257_1_1763352871(box()).<_257_1_1763352871>id("a1480597087").owner(AbstractCreateCollectionDialog.this));
		if (dialog == null) dialog = register(new Dialog(box()).<Dialog>id("a_2094777978").owner(AbstractCreateCollectionDialog.this));
		if (dialog != null) _260_8_02080184234 = dialog._260_8_02080184234;
		if (_260_8_02080184234 != null) hint = dialog._260_8_02080184234.hint;
		if (_260_8_02080184234 != null) _262_9_1142717409 = dialog._260_8_02080184234._262_9_1142717409;
		if (_262_9_1142717409 != null) nameField = dialog._260_8_02080184234._262_9_1142717409.nameField;
		if (_262_9_1142717409 != null) validIcon = dialog._260_8_02080184234._262_9_1142717409.validIcon;
		if (_262_9_1142717409 != null) invalidIcon = dialog._260_8_02080184234._262_9_1142717409.invalidIcon;
		if (dialog != null) _266_2_1955995399 = dialog._266_2_1955995399;
		if (dialog != null) _267_8_1772323692 = dialog._267_8_1772323692;
		if (_267_8_1772323692 != null) _268_9_11021209232 = dialog._267_8_1772323692._268_9_11021209232;
		if (_267_8_1772323692 != null) create = dialog._267_8_1772323692.create;
		if (_257_1_1763352871 != null) _257_1_1763352871.bindTo(dialog);


		if (_268_9_11021209232 != null) _268_9_11021209232.bindTo(dialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (_257_1_1763352871 != null) _257_1_1763352871.unregister();
		if (dialog != null) dialog.unregister();
	}

	public class _257_1_1763352871 extends io.intino.alexandria.ui.displays.components.OpenDialog<io.intino.alexandria.ui.displays.notifiers.OpenDialogNotifier, B>  {

		public _257_1_1763352871(B box) {
			super(box);
			_title("Create new");
			_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
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

	public class Dialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public CreateCollectionDialog.Dialog. _260_8_02080184234 _260_8_02080184234;
		public CreateCollectionDialog.Dialog. _266_2_1955995399 _266_2_1955995399;
		public CreateCollectionDialog.Dialog. _267_8_1772323692 _267_8_1772323692;

		public Dialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_260_8_02080184234 == null) _260_8_02080184234 = register(new _260_8_02080184234(box()).<_260_8_02080184234>id("a_1083533268").owner(AbstractCreateCollectionDialog.this));
			if (_266_2_1955995399 == null) _266_2_1955995399 = register(new _266_2_1955995399(box()).<_266_2_1955995399>id("a_2062154522").owner(AbstractCreateCollectionDialog.this));
			if (_267_8_1772323692 == null) _267_8_1772323692 = register(new _267_8_1772323692(box()).<_267_8_1772323692>id("a_1828461835").owner(AbstractCreateCollectionDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_260_8_02080184234 != null) _260_8_02080184234.unregister();
			if (_266_2_1955995399 != null) _266_2_1955995399.unregister();
			if (_267_8_1772323692 != null) _267_8_1772323692.unregister();
		}

		public class _260_8_02080184234 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CreateCollectionDialog.Dialog._260_8_02080184234. Hint hint;
			public CreateCollectionDialog.Dialog._260_8_02080184234. _262_9_1142717409 _262_9_1142717409;

			public _260_8_02080184234(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (hint == null) hint = register(new Hint(box()).<Hint>id("a310813882").owner(AbstractCreateCollectionDialog.this));
				if (_262_9_1142717409 == null) _262_9_1142717409 = register(new _262_9_1142717409(box()).<_262_9_1142717409>id("a614113953").owner(AbstractCreateCollectionDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (hint != null) hint.unregister();
				if (_262_9_1142717409 != null) _262_9_1142717409.unregister();
			}

			public class Hint extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public Hint(B box) {
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

			public class _262_9_1142717409 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public CreateCollectionDialog.Dialog._260_8_02080184234._262_9_1142717409. NameField nameField;
				public CreateCollectionDialog.Dialog._260_8_02080184234._262_9_1142717409. ValidIcon validIcon;
				public CreateCollectionDialog.Dialog._260_8_02080184234._262_9_1142717409. InvalidIcon invalidIcon;

				public _262_9_1142717409(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (nameField == null) nameField = register(new NameField(box()).<NameField>id("a191755935").owner(AbstractCreateCollectionDialog.this));
					if (validIcon == null) validIcon = register(new ValidIcon(box()).<ValidIcon>id("a_2129214459").owner(AbstractCreateCollectionDialog.this));
					if (invalidIcon == null) invalidIcon = register(new InvalidIcon(box()).<InvalidIcon>id("a_671083392").owner(AbstractCreateCollectionDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (nameField != null) nameField.unregister();
					if (validIcon != null) validIcon.unregister();
					if (invalidIcon != null) invalidIcon.unregister();
				}

				public class NameField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

					public NameField(B box) {
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

				public class ValidIcon extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

					public ValidIcon(B box) {
						super(box);

						_color("green");
						_icon("Check");
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

				public class InvalidIcon extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

					public InvalidIcon(B box) {
						super(box);

						_color("red");
						_icon("Clear");
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

		public class _266_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _266_2_1955995399(B box) {
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

		public class _267_8_1772323692 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CreateCollectionDialog.Dialog._267_8_1772323692. _268_9_11021209232 _268_9_11021209232;
			public CreateCollectionDialog.Dialog._267_8_1772323692. Create create;

			public _267_8_1772323692(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_268_9_11021209232 == null) _268_9_11021209232 = register(new _268_9_11021209232(box()).<_268_9_11021209232>id("a_1436308799").owner(AbstractCreateCollectionDialog.this));
				if (create == null) create = register(new Create(box()).<Create>id("a828685896").owner(AbstractCreateCollectionDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_268_9_11021209232 != null) _268_9_11021209232.unregister();
				if (create != null) create.unregister();
			}

			public class _268_9_11021209232 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _268_9_11021209232(B box) {
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

			public class Create extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Create(B box) {
					super(box);
					_title("Create");
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