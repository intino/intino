package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelBrowserTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public RemoveFileTrigger removeFileTrigger;
	public _211_1_0301577938 _211_1_0301577938;
	public ModelBrowserTemplate._211_1_0301577938. _212_2_1894406152 _212_2_1894406152;
	public ModelBrowserTemplate._211_1_0301577938._212_2_1894406152. _212_38_0995722236 _212_38_0995722236;
	public ModelBrowserTemplate._211_1_0301577938. _213_2_11462433098 _213_2_11462433098;
	public ModelBrowserTemplate._211_1_0301577938._213_2_11462433098. OperationsTrigger operationsTrigger;
	public _216_1_0265273602 _216_1_0265273602;
	public ModelBrowserTemplate._216_1_0265273602. _217_2_11993776899 _217_2_11993776899;
	public ModelBrowserTemplate._216_1_0265273602._217_2_11993776899. FileBrowser fileBrowser;
	public ModelBrowserTemplate._216_1_0265273602. _218_2_01320967637 _218_2_01320967637;
	public ModelBrowserTemplate._216_1_0265273602._218_2_01320967637. AddFileField addFileField;
	public FileDialog fileDialog;
	public ModelBrowserTemplate.FileDialog. _221_8_11902755718 _221_8_11902755718;
	public ModelBrowserTemplate.FileDialog._221_8_11902755718. FileField fileField;
	public ModelBrowserTemplate.FileDialog. _223_2_1955995399 _223_2_1955995399;
	public ModelBrowserTemplate.FileDialog. _224_8_11831706515 _224_8_11831706515;
	public ModelBrowserTemplate.FileDialog._224_8_11831706515. _225_12_0873185284 _225_12_0873185284;
	public ModelBrowserTemplate.FileDialog._224_8_11831706515. AddFile addFile;

	public AbstractModelBrowserTemplate(B box) {
		super(box);
		id("modelBrowserTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (removeFileTrigger == null) removeFileTrigger = register(new RemoveFileTrigger(box()).<RemoveFileTrigger>id("a_1541142223").owner(AbstractModelBrowserTemplate.this));
		if (_211_1_0301577938 == null) _211_1_0301577938 = register(new _211_1_0301577938(box()).<_211_1_0301577938>id("a_248388896").owner(AbstractModelBrowserTemplate.this));
		if (_211_1_0301577938 != null) _212_2_1894406152 = _211_1_0301577938._212_2_1894406152;
		if (_212_2_1894406152 != null) _212_38_0995722236 = _211_1_0301577938._212_2_1894406152._212_38_0995722236;
		if (_211_1_0301577938 != null) _213_2_11462433098 = _211_1_0301577938._213_2_11462433098;
		if (_213_2_11462433098 != null) operationsTrigger = _211_1_0301577938._213_2_11462433098.operationsTrigger;
		if (_216_1_0265273602 == null) _216_1_0265273602 = register(new _216_1_0265273602(box()).<_216_1_0265273602>id("a67237689").owner(AbstractModelBrowserTemplate.this));
		if (_216_1_0265273602 != null) _217_2_11993776899 = _216_1_0265273602._217_2_11993776899;
		if (_217_2_11993776899 != null) fileBrowser = _216_1_0265273602._217_2_11993776899.fileBrowser;
		if (_216_1_0265273602 != null) _218_2_01320967637 = _216_1_0265273602._218_2_01320967637;
		if (_218_2_01320967637 != null) addFileField = _216_1_0265273602._218_2_01320967637.addFileField;
		if (fileDialog == null) fileDialog = register(new FileDialog(box()).<FileDialog>id("a_214556597").owner(AbstractModelBrowserTemplate.this));
		if (fileDialog != null) _221_8_11902755718 = fileDialog._221_8_11902755718;
		if (_221_8_11902755718 != null) fileField = fileDialog._221_8_11902755718.fileField;
		if (fileDialog != null) _223_2_1955995399 = fileDialog._223_2_1955995399;
		if (fileDialog != null) _224_8_11831706515 = fileDialog._224_8_11831706515;
		if (_224_8_11831706515 != null) _225_12_0873185284 = fileDialog._224_8_11831706515._225_12_0873185284;
		if (_224_8_11831706515 != null) addFile = fileDialog._224_8_11831706515.addFile;


		if (_225_12_0873185284 != null) _225_12_0873185284.bindTo(fileDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (removeFileTrigger != null) removeFileTrigger.unregister();
		if (_211_1_0301577938 != null) _211_1_0301577938.unregister();
		if (_216_1_0265273602 != null) _216_1_0265273602.unregister();
		if (fileDialog != null) fileDialog.unregister();
	}

	public class RemoveFileTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

		public RemoveFileTrigger(B box) {
			super(box);
			_title("");
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

	public class _211_1_0301577938 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelBrowserTemplate._211_1_0301577938. _212_2_1894406152 _212_2_1894406152;
		public ModelBrowserTemplate._211_1_0301577938. _213_2_11462433098 _213_2_11462433098;

		public _211_1_0301577938(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_212_2_1894406152 == null) _212_2_1894406152 = register(new _212_2_1894406152(box()).<_212_2_1894406152>id("a1677251422").owner(AbstractModelBrowserTemplate.this));
			if (_213_2_11462433098 == null) _213_2_11462433098 = register(new _213_2_11462433098(box()).<_213_2_11462433098>id("a1313117700").owner(AbstractModelBrowserTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_212_2_1894406152 != null) _212_2_1894406152.unregister();
			if (_213_2_11462433098 != null) _213_2_11462433098.unregister();
		}

		public class _212_2_1894406152 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelBrowserTemplate._211_1_0301577938._212_2_1894406152. _212_38_0995722236 _212_38_0995722236;

			public _212_2_1894406152(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_212_38_0995722236 == null) _212_38_0995722236 = register(new _212_38_0995722236(box()).<_212_38_0995722236>id("a_1299273856").owner(AbstractModelBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_212_38_0995722236 != null) _212_38_0995722236.unregister();
			}

			public class _212_38_0995722236 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _212_38_0995722236(B box) {
					super(box);
					_value("Model");
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

		public class _213_2_11462433098 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelBrowserTemplate._211_1_0301577938._213_2_11462433098. OperationsTrigger operationsTrigger;

			public _213_2_11462433098(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (operationsTrigger == null) operationsTrigger = register(new OperationsTrigger(box()).<OperationsTrigger>id("a1536659391").owner(AbstractModelBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (operationsTrigger != null) operationsTrigger.unregister();
			}

			public class OperationsTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public OperationsTrigger(B box) {
					super(box);
					_title("Operations...");
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
					_icon("MoreVert");
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

	public class _216_1_0265273602 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelBrowserTemplate._216_1_0265273602. _217_2_11993776899 _217_2_11993776899;
		public ModelBrowserTemplate._216_1_0265273602. _218_2_01320967637 _218_2_01320967637;

		public _216_1_0265273602(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_217_2_11993776899 == null) _217_2_11993776899 = register(new _217_2_11993776899(box()).<_217_2_11993776899>id("a_1383648243").owner(AbstractModelBrowserTemplate.this));
			if (_218_2_01320967637 == null) _218_2_01320967637 = register(new _218_2_01320967637(box()).<_218_2_01320967637>id("a_2040239223").owner(AbstractModelBrowserTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_217_2_11993776899 != null) _217_2_11993776899.unregister();
			if (_218_2_01320967637 != null) _218_2_01320967637.unregister();
		}

		public class _217_2_11993776899 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelBrowserTemplate._216_1_0265273602._217_2_11993776899. FileBrowser fileBrowser;

			public _217_2_11993776899(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (fileBrowser == null) fileBrowser = AbstractModelBrowserTemplate.this.fileBrowser = register(new FileBrowser(box()).<FileBrowser>id("a_2101577501").owner(AbstractModelBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (fileBrowser != null) fileBrowser.unregister();
			}

			public class FileBrowser extends io.intino.alexandria.ui.displays.components.DisplayStamp<io.intino.alexandria.ui.displays.notifiers.DisplayStampNotifier, B>  {

				public FileBrowser(B box) {
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

		public class _218_2_01320967637 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelBrowserTemplate._216_1_0265273602._218_2_01320967637. AddFileField addFileField;

			public _218_2_01320967637(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (addFileField == null) addFileField = register(new AddFileField(box()).<AddFileField>id("a_1828667611").owner(AbstractModelBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (addFileField != null) addFileField.unregister();
			}

			public class AddFileField extends io.intino.alexandria.ui.displays.components.FileEditable<io.intino.alexandria.ui.displays.notifiers.FileEditableNotifier, B>  {

				public AddFileField(B box) {
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

	public class FileDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public ModelBrowserTemplate.FileDialog. _221_8_11902755718 _221_8_11902755718;
		public ModelBrowserTemplate.FileDialog. _223_2_1955995399 _223_2_1955995399;
		public ModelBrowserTemplate.FileDialog. _224_8_11831706515 _224_8_11831706515;

		public FileDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_221_8_11902755718 == null) _221_8_11902755718 = register(new _221_8_11902755718(box()).<_221_8_11902755718>id("a290089058").owner(AbstractModelBrowserTemplate.this));
			if (_223_2_1955995399 == null) _223_2_1955995399 = register(new _223_2_1955995399(box()).<_223_2_1955995399>id("a_1110401398").owner(AbstractModelBrowserTemplate.this));
			if (_224_8_11831706515 == null) _224_8_11831706515 = register(new _224_8_11831706515(box()).<_224_8_11831706515>id("a_1928365355").owner(AbstractModelBrowserTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_221_8_11902755718 != null) _221_8_11902755718.unregister();
			if (_223_2_1955995399 != null) _223_2_1955995399.unregister();
			if (_224_8_11831706515 != null) _224_8_11831706515.unregister();
		}

		public class _221_8_11902755718 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelBrowserTemplate.FileDialog._221_8_11902755718. FileField fileField;

			public _221_8_11902755718(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (fileField == null) fileField = register(new FileField(box()).<FileField>id("a_2137918316").owner(AbstractModelBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (fileField != null) fileField.unregister();
			}

			public class FileField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

				public FileField(B box) {
					super(box);
					label("Name");
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

		public class _223_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _223_2_1955995399(B box) {
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

		public class _224_8_11831706515 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelBrowserTemplate.FileDialog._224_8_11831706515. _225_12_0873185284 _225_12_0873185284;
			public ModelBrowserTemplate.FileDialog._224_8_11831706515. AddFile addFile;

			public _224_8_11831706515(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_225_12_0873185284 == null) _225_12_0873185284 = register(new _225_12_0873185284(box()).<_225_12_0873185284>id("a_2083486880").owner(AbstractModelBrowserTemplate.this));
				if (addFile == null) addFile = register(new AddFile(box()).<AddFile>id("a_2147392714").owner(AbstractModelBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_225_12_0873185284 != null) _225_12_0873185284.unregister();
				if (addFile != null) addFile.unregister();
			}

			public class _225_12_0873185284 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _225_12_0873185284(B box) {
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

			public class AddFile extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public AddFile(B box) {
					super(box);
					_title("Accept");
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