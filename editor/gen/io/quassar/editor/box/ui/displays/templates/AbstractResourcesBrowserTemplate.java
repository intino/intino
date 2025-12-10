package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractResourcesBrowserTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public RemoveFileTrigger removeFileTrigger;
	public _231_1_1190568490 _231_1_1190568490;
	public ResourcesBrowserTemplate._231_1_1190568490. _232_2_01144302332 _232_2_01144302332;
	public ResourcesBrowserTemplate._231_1_1190568490._232_2_01144302332. _232_38_11483190784 _232_38_11483190784;
	public ResourcesBrowserTemplate._231_1_1190568490. _233_2_11462433098 _233_2_11462433098;
	public ResourcesBrowserTemplate._231_1_1190568490._233_2_11462433098. OperationsTrigger operationsTrigger;
	public _236_1_0265273602 _236_1_0265273602;
	public ResourcesBrowserTemplate._236_1_0265273602. _237_2_11993776899 _237_2_11993776899;
	public ResourcesBrowserTemplate._236_1_0265273602._237_2_11993776899. FileBrowser fileBrowser;
	public ResourcesBrowserTemplate._236_1_0265273602. _238_2_01320967637 _238_2_01320967637;
	public ResourcesBrowserTemplate._236_1_0265273602._238_2_01320967637. AddFileField addFileField;
	public FileDialog fileDialog;
	public ResourcesBrowserTemplate.FileDialog. _241_8_01130950349 _241_8_01130950349;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349. SelectorBlock selectorBlock;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349.SelectorBlock. FileDialogSelector fileDialogSelector;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349.SelectorBlock.FileDialogSelector. NewFileOption newFileOption;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349.SelectorBlock.FileDialogSelector. UploadFileOption uploadFileOption;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349. _246_3_01969863849 _246_3_01969863849;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349._246_3_01969863849. FileFieldBlock fileFieldBlock;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349._246_3_01969863849.FileFieldBlock. FileField fileField;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349._246_3_01969863849. FileUploadBlock fileUploadBlock;
	public ResourcesBrowserTemplate.FileDialog._241_8_01130950349._246_3_01969863849.FileUploadBlock. FileUploadField fileUploadField;
	public ResourcesBrowserTemplate.FileDialog. _251_2_1955995399 _251_2_1955995399;
	public ResourcesBrowserTemplate.FileDialog. _252_8_11831706515 _252_8_11831706515;
	public ResourcesBrowserTemplate.FileDialog._252_8_11831706515. _253_12_0873185284 _253_12_0873185284;
	public ResourcesBrowserTemplate.FileDialog._252_8_11831706515. AddFile addFile;

	public AbstractResourcesBrowserTemplate(B box) {
		super(box);
		id("resourcesBrowserTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (removeFileTrigger == null) removeFileTrigger = register(new RemoveFileTrigger(box()).<RemoveFileTrigger>id("a_1386418635").owner(AbstractResourcesBrowserTemplate.this));
		if (_231_1_1190568490 == null) _231_1_1190568490 = register(new _231_1_1190568490(box()).<_231_1_1190568490>id("a_338111772").owner(AbstractResourcesBrowserTemplate.this));
		if (_231_1_1190568490 != null) _232_2_01144302332 = _231_1_1190568490._232_2_01144302332;
		if (_232_2_01144302332 != null) _232_38_11483190784 = _231_1_1190568490._232_2_01144302332._232_38_11483190784;
		if (_231_1_1190568490 != null) _233_2_11462433098 = _231_1_1190568490._233_2_11462433098;
		if (_233_2_11462433098 != null) operationsTrigger = _231_1_1190568490._233_2_11462433098.operationsTrigger;
		if (_236_1_0265273602 == null) _236_1_0265273602 = register(new _236_1_0265273602(box()).<_236_1_0265273602>id("a_1057902401").owner(AbstractResourcesBrowserTemplate.this));
		if (_236_1_0265273602 != null) _237_2_11993776899 = _236_1_0265273602._237_2_11993776899;
		if (_237_2_11993776899 != null) fileBrowser = _236_1_0265273602._237_2_11993776899.fileBrowser;
		if (_236_1_0265273602 != null) _238_2_01320967637 = _236_1_0265273602._238_2_01320967637;
		if (_238_2_01320967637 != null) addFileField = _236_1_0265273602._238_2_01320967637.addFileField;
		if (fileDialog == null) fileDialog = register(new FileDialog(box()).<FileDialog>id("a484120519").owner(AbstractResourcesBrowserTemplate.this));
		if (fileDialog != null) _241_8_01130950349 = fileDialog._241_8_01130950349;
		if (_241_8_01130950349 != null) selectorBlock = fileDialog._241_8_01130950349.selectorBlock;
		if (selectorBlock != null) fileDialogSelector = fileDialog._241_8_01130950349.selectorBlock.fileDialogSelector;
		if (fileDialogSelector != null) newFileOption = fileDialog._241_8_01130950349.selectorBlock.fileDialogSelector.newFileOption;
		if (fileDialogSelector != null) uploadFileOption = fileDialog._241_8_01130950349.selectorBlock.fileDialogSelector.uploadFileOption;
		if (_241_8_01130950349 != null) _246_3_01969863849 = fileDialog._241_8_01130950349._246_3_01969863849;
		if (_246_3_01969863849 != null) fileFieldBlock = fileDialog._241_8_01130950349._246_3_01969863849.fileFieldBlock;
		if (fileFieldBlock != null) fileField = fileDialog._241_8_01130950349._246_3_01969863849.fileFieldBlock.fileField;
		if (_246_3_01969863849 != null) fileUploadBlock = fileDialog._241_8_01130950349._246_3_01969863849.fileUploadBlock;
		if (fileUploadBlock != null) fileUploadField = fileDialog._241_8_01130950349._246_3_01969863849.fileUploadBlock.fileUploadField;
		if (fileDialog != null) _251_2_1955995399 = fileDialog._251_2_1955995399;
		if (fileDialog != null) _252_8_11831706515 = fileDialog._252_8_11831706515;
		if (_252_8_11831706515 != null) _253_12_0873185284 = fileDialog._252_8_11831706515._253_12_0873185284;
		if (_252_8_11831706515 != null) addFile = fileDialog._252_8_11831706515.addFile;



		if (fileFieldBlock != null) fileFieldBlock.bindTo(fileDialogSelector, "newFileOption");
		if (fileUploadBlock != null) fileUploadBlock.bindTo(fileDialogSelector, "uploadFileOption");

		if (_253_12_0873185284 != null) _253_12_0873185284.bindTo(fileDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (removeFileTrigger != null) removeFileTrigger.unregister();
		if (_231_1_1190568490 != null) _231_1_1190568490.unregister();
		if (_236_1_0265273602 != null) _236_1_0265273602.unregister();
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

	public class _231_1_1190568490 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ResourcesBrowserTemplate._231_1_1190568490. _232_2_01144302332 _232_2_01144302332;
		public ResourcesBrowserTemplate._231_1_1190568490. _233_2_11462433098 _233_2_11462433098;

		public _231_1_1190568490(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_232_2_01144302332 == null) _232_2_01144302332 = register(new _232_2_01144302332(box()).<_232_2_01144302332>id("a_1838633467").owner(AbstractResourcesBrowserTemplate.this));
			if (_233_2_11462433098 == null) _233_2_11462433098 = register(new _233_2_11462433098(box()).<_233_2_11462433098>id("a_1513388988").owner(AbstractResourcesBrowserTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_232_2_01144302332 != null) _232_2_01144302332.unregister();
			if (_233_2_11462433098 != null) _233_2_11462433098.unregister();
		}

		public class _232_2_01144302332 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ResourcesBrowserTemplate._231_1_1190568490._232_2_01144302332. _232_38_11483190784 _232_38_11483190784;

			public _232_2_01144302332(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_232_38_11483190784 == null) _232_38_11483190784 = register(new _232_38_11483190784(box()).<_232_38_11483190784>id("a_1466454723").owner(AbstractResourcesBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_232_38_11483190784 != null) _232_38_11483190784.unregister();
			}

			public class _232_38_11483190784 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _232_38_11483190784(B box) {
					super(box);
					_value("Resources");
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

		public class _233_2_11462433098 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ResourcesBrowserTemplate._231_1_1190568490._233_2_11462433098. OperationsTrigger operationsTrigger;

			public _233_2_11462433098(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (operationsTrigger == null) operationsTrigger = register(new OperationsTrigger(box()).<OperationsTrigger>id("a1755514109").owner(AbstractResourcesBrowserTemplate.this));
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

	public class _236_1_0265273602 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ResourcesBrowserTemplate._236_1_0265273602. _237_2_11993776899 _237_2_11993776899;
		public ResourcesBrowserTemplate._236_1_0265273602. _238_2_01320967637 _238_2_01320967637;

		public _236_1_0265273602(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_237_2_11993776899 == null) _237_2_11993776899 = register(new _237_2_11993776899(box()).<_237_2_11993776899>id("a84812365").owner(AbstractResourcesBrowserTemplate.this));
			if (_238_2_01320967637 == null) _238_2_01320967637 = register(new _238_2_01320967637(box()).<_238_2_01320967637>id("a_571778615").owner(AbstractResourcesBrowserTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_237_2_11993776899 != null) _237_2_11993776899.unregister();
			if (_238_2_01320967637 != null) _238_2_01320967637.unregister();
		}

		public class _237_2_11993776899 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ResourcesBrowserTemplate._236_1_0265273602._237_2_11993776899. FileBrowser fileBrowser;

			public _237_2_11993776899(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (fileBrowser == null) fileBrowser = AbstractResourcesBrowserTemplate.this.fileBrowser = register(new FileBrowser(box()).<FileBrowser>id("a1172321441").owner(AbstractResourcesBrowserTemplate.this));
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

		public class _238_2_01320967637 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ResourcesBrowserTemplate._236_1_0265273602._238_2_01320967637. AddFileField addFileField;

			public _238_2_01320967637(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (addFileField == null) addFileField = register(new AddFileField(box()).<AddFileField>id("a877951783").owner(AbstractResourcesBrowserTemplate.this));
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
		public ResourcesBrowserTemplate.FileDialog. _241_8_01130950349 _241_8_01130950349;
		public ResourcesBrowserTemplate.FileDialog. _251_2_1955995399 _251_2_1955995399;
		public ResourcesBrowserTemplate.FileDialog. _252_8_11831706515 _252_8_11831706515;

		public FileDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_241_8_01130950349 == null) _241_8_01130950349 = register(new _241_8_01130950349(box()).<_241_8_01130950349>id("a1387914547").owner(AbstractResourcesBrowserTemplate.this));
			if (_251_2_1955995399 == null) _251_2_1955995399 = register(new _251_2_1955995399(box()).<_251_2_1955995399>id("a_1826366837").owner(AbstractResourcesBrowserTemplate.this));
			if (_252_8_11831706515 == null) _252_8_11831706515 = register(new _252_8_11831706515(box()).<_252_8_11831706515>id("a1646509812").owner(AbstractResourcesBrowserTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_241_8_01130950349 != null) _241_8_01130950349.unregister();
			if (_251_2_1955995399 != null) _251_2_1955995399.unregister();
			if (_252_8_11831706515 != null) _252_8_11831706515.unregister();
		}

		public class _241_8_01130950349 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ResourcesBrowserTemplate.FileDialog._241_8_01130950349. SelectorBlock selectorBlock;
			public ResourcesBrowserTemplate.FileDialog._241_8_01130950349. _246_3_01969863849 _246_3_01969863849;

			public _241_8_01130950349(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (selectorBlock == null) selectorBlock = register(new SelectorBlock(box()).<SelectorBlock>id("a698259682").owner(AbstractResourcesBrowserTemplate.this));
				if (_246_3_01969863849 == null) _246_3_01969863849 = register(new _246_3_01969863849(box()).<_246_3_01969863849>id("a_322176327").owner(AbstractResourcesBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (selectorBlock != null) selectorBlock.unregister();
				if (_246_3_01969863849 != null) _246_3_01969863849.unregister();
			}

			public class SelectorBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ResourcesBrowserTemplate.FileDialog._241_8_01130950349.SelectorBlock. FileDialogSelector fileDialogSelector;

				public SelectorBlock(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (fileDialogSelector == null) fileDialogSelector = register(new FileDialogSelector(box()).<FileDialogSelector>id("a_593628064").owner(AbstractResourcesBrowserTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (fileDialogSelector != null) fileDialogSelector.unregister();
				}

				public class FileDialogSelector extends io.intino.alexandria.ui.displays.components.SelectorListBox<io.intino.alexandria.ui.displays.notifiers.SelectorListBoxNotifier, B>  {
					public ResourcesBrowserTemplate.FileDialog._241_8_01130950349.SelectorBlock.FileDialogSelector. NewFileOption newFileOption;
					public ResourcesBrowserTemplate.FileDialog._241_8_01130950349.SelectorBlock.FileDialogSelector. UploadFileOption uploadFileOption;

					public FileDialogSelector(B box) {
						super(box);
						_multipleSelection(false);
					}

					@Override
					public void init() {
						super.init();
						if (newFileOption == null) newFileOption = register(new NewFileOption(box()).<NewFileOption>id("a1100282162").owner(AbstractResourcesBrowserTemplate.this));
						if (uploadFileOption == null) uploadFileOption = register(new UploadFileOption(box()).<UploadFileOption>id("a220214257").owner(AbstractResourcesBrowserTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (newFileOption != null) newFileOption.unregister();
						if (uploadFileOption != null) uploadFileOption.unregister();
					}

					public class NewFileOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

						public NewFileOption(B box) {
							super(box);

							name("newFileOption");
							_value("New file");
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

					public class UploadFileOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

						public UploadFileOption(B box) {
							super(box);

							name("uploadFileOption");
							_value("Upload file");
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

			public class _246_3_01969863849 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ResourcesBrowserTemplate.FileDialog._241_8_01130950349._246_3_01969863849. FileFieldBlock fileFieldBlock;
				public ResourcesBrowserTemplate.FileDialog._241_8_01130950349._246_3_01969863849. FileUploadBlock fileUploadBlock;

				public _246_3_01969863849(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (fileFieldBlock == null) fileFieldBlock = register(new FileFieldBlock(box()).<FileFieldBlock>id("a_1690471141").owner(AbstractResourcesBrowserTemplate.this));
					if (fileUploadBlock == null) fileUploadBlock = register(new FileUploadBlock(box()).<FileUploadBlock>id("a308106916").owner(AbstractResourcesBrowserTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (fileFieldBlock != null) fileFieldBlock.unregister();
					if (fileUploadBlock != null) fileUploadBlock.unregister();
				}

				public class FileFieldBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
					public ResourcesBrowserTemplate.FileDialog._241_8_01130950349._246_3_01969863849.FileFieldBlock. FileField fileField;

					public FileFieldBlock(B box) {
						super(box);
					}

					@Override
					public void initConditional() {
						super.init();
						if (fileField == null) fileField = register(new FileField(box()).<FileField>id("a70570682").owner(AbstractResourcesBrowserTemplate.this));
						if (AbstractResourcesBrowserTemplate.this.fileField == null) AbstractResourcesBrowserTemplate.this.fileField = fileDialog._241_8_01130950349._246_3_01969863849.fileFieldBlock.fileField;
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

				public class FileUploadBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
					public ResourcesBrowserTemplate.FileDialog._241_8_01130950349._246_3_01969863849.FileUploadBlock. FileUploadField fileUploadField;

					public FileUploadBlock(B box) {
						super(box);
					}

					@Override
					public void initConditional() {
						super.init();
						if (fileUploadField == null) fileUploadField = register(new FileUploadField(box()).<FileUploadField>id("a_433795902").owner(AbstractResourcesBrowserTemplate.this));
						if (AbstractResourcesBrowserTemplate.this.fileUploadField == null) AbstractResourcesBrowserTemplate.this.fileUploadField = fileDialog._241_8_01130950349._246_3_01969863849.fileUploadBlock.fileUploadField;
					}

					@Override
					public void unregister() {
						super.unregister();
						if (fileUploadField != null) fileUploadField.unregister();
					}

					public class FileUploadField extends io.intino.alexandria.ui.displays.components.FileEditable<io.intino.alexandria.ui.displays.notifiers.FileEditableNotifier, B>  {

						public FileUploadField(B box) {
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
		}

		public class _251_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _251_2_1955995399(B box) {
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

		public class _252_8_11831706515 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ResourcesBrowserTemplate.FileDialog._252_8_11831706515. _253_12_0873185284 _253_12_0873185284;
			public ResourcesBrowserTemplate.FileDialog._252_8_11831706515. AddFile addFile;

			public _252_8_11831706515(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_253_12_0873185284 == null) _253_12_0873185284 = register(new _253_12_0873185284(box()).<_253_12_0873185284>id("a1180212992").owner(AbstractResourcesBrowserTemplate.this));
				if (addFile == null) addFile = register(new AddFile(box()).<AddFile>id("a1833758161").owner(AbstractResourcesBrowserTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_253_12_0873185284 != null) _253_12_0873185284.unregister();
				if (addFile != null) addFile.unregister();
			}

			public class _253_12_0873185284 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _253_12_0873185284(B box) {
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