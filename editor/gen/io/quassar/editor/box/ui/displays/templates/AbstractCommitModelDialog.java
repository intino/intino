package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractCommitModelDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Dialog dialog;
	public CommitModelDialog.Dialog. _88_8_02052624543 _88_8_02052624543;
	public CommitModelDialog.Dialog._88_8_02052624543. VersionPropertiesBlock versionPropertiesBlock;
	public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock. _91_4_01823140318 _91_4_01823140318;
	public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock._91_4_01823140318. VersionTypeSelector versionTypeSelector;
	public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock. _94_4_11882912902 _94_4_11882912902;
	public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock._94_4_11882912902. _95_5_131085879 _95_5_131085879;
	public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock._94_4_11882912902. Version version;
	public CommitModelDialog.Dialog. _98_2_1955995399 _98_2_1955995399;
	public CommitModelDialog.Dialog. _99_8_11949376143 _99_8_11949376143;
	public CommitModelDialog.Dialog._99_8_11949376143. _100_12_0857831584 _100_12_0857831584;
	public CommitModelDialog.Dialog._99_8_11949376143. Create create;
	public DownloadModelDialog downloadModelDialog;
	public LanguageExecutionLauncher executionLauncher;

	public AbstractCommitModelDialog(B box) {
		super(box);
		id("commitModelDialog");
	}

	@Override
	public void init() {
		super.init();
		if (dialog == null) dialog = register(new Dialog(box()).<Dialog>id("a_604990356").owner(AbstractCommitModelDialog.this));
		if (dialog != null) _88_8_02052624543 = dialog._88_8_02052624543;
		if (_88_8_02052624543 != null) versionPropertiesBlock = dialog._88_8_02052624543.versionPropertiesBlock;
		if (versionPropertiesBlock != null) _91_4_01823140318 = dialog._88_8_02052624543.versionPropertiesBlock._91_4_01823140318;
		if (_91_4_01823140318 != null) versionTypeSelector = dialog._88_8_02052624543.versionPropertiesBlock._91_4_01823140318.versionTypeSelector;
		if (versionPropertiesBlock != null) _94_4_11882912902 = dialog._88_8_02052624543.versionPropertiesBlock._94_4_11882912902;
		if (_94_4_11882912902 != null) _95_5_131085879 = dialog._88_8_02052624543.versionPropertiesBlock._94_4_11882912902._95_5_131085879;
		if (_94_4_11882912902 != null) version = dialog._88_8_02052624543.versionPropertiesBlock._94_4_11882912902.version;
		if (dialog != null) _98_2_1955995399 = dialog._98_2_1955995399;
		if (dialog != null) _99_8_11949376143 = dialog._99_8_11949376143;
		if (_99_8_11949376143 != null) _100_12_0857831584 = dialog._99_8_11949376143._100_12_0857831584;
		if (_99_8_11949376143 != null) create = dialog._99_8_11949376143.create;
		if (downloadModelDialog == null) downloadModelDialog = register(new DownloadModelDialog((EditorBox)box()).id("a_1575813243"));
		if (executionLauncher == null) executionLauncher = register(new LanguageExecutionLauncher((EditorBox)box()).id("a_1651363532"));


		if (_100_12_0857831584 != null) _100_12_0857831584.bindTo(dialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (dialog != null) dialog.unregister();
		if (downloadModelDialog != null) downloadModelDialog.unregister();
		if (executionLauncher != null) executionLauncher.unregister();
	}

	public class Dialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public CommitModelDialog.Dialog. _88_8_02052624543 _88_8_02052624543;
		public CommitModelDialog.Dialog. _98_2_1955995399 _98_2_1955995399;
		public CommitModelDialog.Dialog. _99_8_11949376143 _99_8_11949376143;

		public Dialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_88_8_02052624543 == null) _88_8_02052624543 = register(new _88_8_02052624543(box()).<_88_8_02052624543>id("a1643086733").owner(AbstractCommitModelDialog.this));
			if (_98_2_1955995399 == null) _98_2_1955995399 = register(new _98_2_1955995399(box()).<_98_2_1955995399>id("a_1205658969").owner(AbstractCommitModelDialog.this));
			if (_99_8_11949376143 == null) _99_8_11949376143 = register(new _99_8_11949376143(box()).<_99_8_11949376143>id("a2045979554").owner(AbstractCommitModelDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_88_8_02052624543 != null) _88_8_02052624543.unregister();
			if (_98_2_1955995399 != null) _98_2_1955995399.unregister();
			if (_99_8_11949376143 != null) _99_8_11949376143.unregister();
		}

		public class _88_8_02052624543 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CommitModelDialog.Dialog._88_8_02052624543. VersionPropertiesBlock versionPropertiesBlock;

			public _88_8_02052624543(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (versionPropertiesBlock == null) versionPropertiesBlock = register(new VersionPropertiesBlock(box()).<VersionPropertiesBlock>id("a1379624751").owner(AbstractCommitModelDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (versionPropertiesBlock != null) versionPropertiesBlock.unregister();
			}

			public class VersionPropertiesBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock. _91_4_01823140318 _91_4_01823140318;
				public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock. _94_4_11882912902 _94_4_11882912902;

				public VersionPropertiesBlock(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_91_4_01823140318 == null) _91_4_01823140318 = register(new _91_4_01823140318(box()).<_91_4_01823140318>id("a1541864898").owner(AbstractCommitModelDialog.this));
					if (_94_4_11882912902 == null) _94_4_11882912902 = register(new _94_4_11882912902(box()).<_94_4_11882912902>id("a1178353363").owner(AbstractCommitModelDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_91_4_01823140318 != null) _91_4_01823140318.unregister();
					if (_94_4_11882912902 != null) _94_4_11882912902.unregister();
				}

				public class _91_4_01823140318 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock._91_4_01823140318. VersionTypeSelector versionTypeSelector;

					public _91_4_01823140318(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (versionTypeSelector == null) versionTypeSelector = register(new VersionTypeSelector(box()).<VersionTypeSelector>id("a_487408296").owner(AbstractCommitModelDialog.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (versionTypeSelector != null) versionTypeSelector.unregister();
					}

					public class VersionTypeSelector extends io.intino.alexandria.ui.displays.components.SelectorRadioBox<io.intino.alexandria.ui.displays.notifiers.SelectorRadioBoxNotifier, B>  {

						public VersionTypeSelector(B box) {
							super(box);
							_multipleSelection(false);
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

				public class _94_4_11882912902 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock._94_4_11882912902. _95_5_131085879 _95_5_131085879;
					public CommitModelDialog.Dialog._88_8_02052624543.VersionPropertiesBlock._94_4_11882912902. Version version;

					public _94_4_11882912902(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_95_5_131085879 == null) _95_5_131085879 = register(new _95_5_131085879(box()).<_95_5_131085879>id("a_1566780488").owner(AbstractCommitModelDialog.this));
						if (version == null) version = register(new Version(box()).<Version>id("a417282754").owner(AbstractCommitModelDialog.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_95_5_131085879 != null) _95_5_131085879.unregister();
						if (version != null) version.unregister();
					}

					public class _95_5_131085879 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _95_5_131085879(B box) {
							super(box);
							_value("New version number");
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

					public class Version extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public Version(B box) {
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

		public class _98_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _98_2_1955995399(B box) {
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

		public class _99_8_11949376143 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public CommitModelDialog.Dialog._99_8_11949376143. _100_12_0857831584 _100_12_0857831584;
			public CommitModelDialog.Dialog._99_8_11949376143. Create create;

			public _99_8_11949376143(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_100_12_0857831584 == null) _100_12_0857831584 = register(new _100_12_0857831584(box()).<_100_12_0857831584>id("a_327863357").owner(AbstractCommitModelDialog.this));
				if (create == null) create = register(new Create(box()).<Create>id("a_1457584407").owner(AbstractCommitModelDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_100_12_0857831584 != null) _100_12_0857831584.unregister();
				if (create != null) create.unregister();
			}

			public class _100_12_0857831584 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _100_12_0857831584(B box) {
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

			public class Create extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Create(B box) {
					super(box);
					_title("Commit");
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