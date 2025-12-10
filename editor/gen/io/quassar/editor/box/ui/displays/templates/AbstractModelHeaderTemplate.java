package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelHeaderTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public ContentBlock contentBlock;
	public ModelHeaderTemplate.ContentBlock. _11_2_01137824745 _11_2_01137824745;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745. LanguageTrigger languageTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745. CloseTrigger closeTrigger;
	public ModelNameViewer nameViewer;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745. _16_3_01014278732 _16_3_01014278732;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._16_3_01014278732. SettingsTrigger settingsTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745. _19_3_02046926512 _19_3_02046926512;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. EditTrigger editTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. CheckTrigger checkTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. CommitTrigger commitTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. ReleaseSelector releaseSelector;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. ForgeTrigger forgeTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. ExecutionTrigger executionTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. DownloadTrigger downloadTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. CloneTrigger cloneTrigger;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. NoLanguageDefinedBlock noLanguageDefinedBlock;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512.NoLanguageDefinedBlock. _28_83_0747418307 _28_83_0747418307;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. LanguageDefinedBlock languageDefinedBlock;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512.LanguageDefinedBlock. _30_5_11911072444 _30_5_11911072444;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512.LanguageDefinedBlock._30_5_11911072444. _30_30_01300650706 _30_30_01300650706;
	public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512.LanguageDefinedBlock. GotoForgeTrigger gotoForgeTrigger;
	public ModelHeaderTemplate.ContentBlock. _33_2_0280219653 _33_2_0280219653;
	public ModelLanguageToolbar languageToolbar;
	public CommitModelDialog commitModelDialog;
	public LanguageExecutionLauncher executionLauncher;
	public ModelNameDialog modelNameDialog;
	public DownloadModelDialog downloadModelDialog;

	public AbstractModelHeaderTemplate(B box) {
		super(box);
		id("modelHeaderTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a_1826738654").owner(AbstractModelHeaderTemplate.this));
		if (contentBlock != null) _11_2_01137824745 = contentBlock._11_2_01137824745;
		if (_11_2_01137824745 != null) languageTrigger = contentBlock._11_2_01137824745.languageTrigger;
		if (_11_2_01137824745 != null) closeTrigger = contentBlock._11_2_01137824745.closeTrigger;
		if (_11_2_01137824745 != null) nameViewer = contentBlock._11_2_01137824745.nameViewer;
		if (_11_2_01137824745 != null) _16_3_01014278732 = contentBlock._11_2_01137824745._16_3_01014278732;
		if (_16_3_01014278732 != null) settingsTrigger = contentBlock._11_2_01137824745._16_3_01014278732.settingsTrigger;
		if (_11_2_01137824745 != null) _19_3_02046926512 = contentBlock._11_2_01137824745._19_3_02046926512;
		if (_19_3_02046926512 != null) editTrigger = contentBlock._11_2_01137824745._19_3_02046926512.editTrigger;
		if (_19_3_02046926512 != null) checkTrigger = contentBlock._11_2_01137824745._19_3_02046926512.checkTrigger;
		if (_19_3_02046926512 != null) commitTrigger = contentBlock._11_2_01137824745._19_3_02046926512.commitTrigger;
		if (_19_3_02046926512 != null) releaseSelector = contentBlock._11_2_01137824745._19_3_02046926512.releaseSelector;
		if (_19_3_02046926512 != null) forgeTrigger = contentBlock._11_2_01137824745._19_3_02046926512.forgeTrigger;
		if (_19_3_02046926512 != null) executionTrigger = contentBlock._11_2_01137824745._19_3_02046926512.executionTrigger;
		if (_19_3_02046926512 != null) downloadTrigger = contentBlock._11_2_01137824745._19_3_02046926512.downloadTrigger;
		if (_19_3_02046926512 != null) cloneTrigger = contentBlock._11_2_01137824745._19_3_02046926512.cloneTrigger;
		if (_19_3_02046926512 != null) noLanguageDefinedBlock = contentBlock._11_2_01137824745._19_3_02046926512.noLanguageDefinedBlock;
		if (noLanguageDefinedBlock != null) _28_83_0747418307 = contentBlock._11_2_01137824745._19_3_02046926512.noLanguageDefinedBlock._28_83_0747418307;
		if (_19_3_02046926512 != null) languageDefinedBlock = contentBlock._11_2_01137824745._19_3_02046926512.languageDefinedBlock;
		if (languageDefinedBlock != null) _30_5_11911072444 = contentBlock._11_2_01137824745._19_3_02046926512.languageDefinedBlock._30_5_11911072444;
		if (_30_5_11911072444 != null) _30_30_01300650706 = contentBlock._11_2_01137824745._19_3_02046926512.languageDefinedBlock._30_5_11911072444._30_30_01300650706;
		if (languageDefinedBlock != null) gotoForgeTrigger = contentBlock._11_2_01137824745._19_3_02046926512.languageDefinedBlock.gotoForgeTrigger;
		if (contentBlock != null) _33_2_0280219653 = contentBlock._33_2_0280219653;
		if (_33_2_0280219653 != null) languageToolbar = contentBlock._33_2_0280219653.languageToolbar;
		if (commitModelDialog == null) commitModelDialog = register(new CommitModelDialog((EditorBox)box()).id("a_92256692"));
		if (executionLauncher == null) executionLauncher = register(new LanguageExecutionLauncher((EditorBox)box()).id("a323396874"));
		if (modelNameDialog == null) modelNameDialog = register(new ModelNameDialog((EditorBox)box()).id("a1117547118"));
		if (downloadModelDialog == null) downloadModelDialog = register(new DownloadModelDialog((EditorBox)box()).id("a2088359387"));
	}

	@Override
	public void remove() {
		super.remove();
		if (contentBlock != null) contentBlock.unregister();
		if (commitModelDialog != null) commitModelDialog.unregister();
		if (executionLauncher != null) executionLauncher.unregister();
		if (modelNameDialog != null) modelNameDialog.unregister();
		if (downloadModelDialog != null) downloadModelDialog.unregister();
	}

	public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelHeaderTemplate.ContentBlock. _11_2_01137824745 _11_2_01137824745;
		public ModelHeaderTemplate.ContentBlock. _33_2_0280219653 _33_2_0280219653;

		public ContentBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_11_2_01137824745 == null) _11_2_01137824745 = register(new _11_2_01137824745(box()).<_11_2_01137824745>id("a947699976").owner(AbstractModelHeaderTemplate.this));
			if (_33_2_0280219653 == null) _33_2_0280219653 = register(new _33_2_0280219653(box()).<_33_2_0280219653>id("a747834910").owner(AbstractModelHeaderTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_11_2_01137824745 != null) _11_2_01137824745.unregister();
			if (_33_2_0280219653 != null) _33_2_0280219653.unregister();
		}

		public class _11_2_01137824745 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelHeaderTemplate.ContentBlock._11_2_01137824745. LanguageTrigger languageTrigger;
			public ModelHeaderTemplate.ContentBlock._11_2_01137824745. CloseTrigger closeTrigger;
			public ModelNameViewer nameViewer;
			public ModelHeaderTemplate.ContentBlock._11_2_01137824745. _16_3_01014278732 _16_3_01014278732;
			public ModelHeaderTemplate.ContentBlock._11_2_01137824745. _19_3_02046926512 _19_3_02046926512;

			public _11_2_01137824745(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (languageTrigger == null) languageTrigger = register(new LanguageTrigger(box()).<LanguageTrigger>id("a336125801").owner(AbstractModelHeaderTemplate.this));
				if (closeTrigger == null) closeTrigger = register(new CloseTrigger(box()).<CloseTrigger>id("a_1862956777").owner(AbstractModelHeaderTemplate.this));
				if (nameViewer == null) nameViewer = AbstractModelHeaderTemplate.this.nameViewer = register(new ModelNameViewer((EditorBox)box()).id("a_175860044"));
				if (_16_3_01014278732 == null) _16_3_01014278732 = register(new _16_3_01014278732(box()).<_16_3_01014278732>id("a1720586807").owner(AbstractModelHeaderTemplate.this));
				if (_19_3_02046926512 == null) _19_3_02046926512 = register(new _19_3_02046926512(box()).<_19_3_02046926512>id("a360990094").owner(AbstractModelHeaderTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (languageTrigger != null) languageTrigger.unregister();
				if (closeTrigger != null) closeTrigger.unregister();
				if (nameViewer != null) nameViewer.unregister();
				if (_16_3_01014278732 != null) _16_3_01014278732.unregister();
				if (_19_3_02046926512 != null) _19_3_02046926512.unregister();
			}

			public class LanguageTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<LanguageTrigger> {

				public LanguageTrigger(B box) {
					super(box);
					_title("Goto DSL");
					_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
					_icon("ArrowUpward");
					_path("/models/:language");
				}

				@Override
				public void init() {
					super.init();
				}

				@Override
				public void unregister() {
					super.unregister();
				}
				@Override
				public LanguageTrigger address(java.util.function.Function<String, String> addressFromPathResolver) {
					address(addressFromPathResolver.apply(path()));
					return this;
				}
			}

			public class CloseTrigger extends io.intino.alexandria.ui.displays.components.CloseApp<io.intino.alexandria.ui.displays.notifiers.CloseAppNotifier, B>  {

				public CloseTrigger(B box) {
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

			public class _16_3_01014278732 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._16_3_01014278732. SettingsTrigger settingsTrigger;

				public _16_3_01014278732(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (settingsTrigger == null) settingsTrigger = register(new SettingsTrigger(box()).<SettingsTrigger>id("a2078806788").owner(AbstractModelHeaderTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (settingsTrigger != null) settingsTrigger.unregister();
				}

				public class SettingsTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public SettingsTrigger(B box) {
						super(box);
						_title("settings");
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

			public class _19_3_02046926512 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. EditTrigger editTrigger;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. CheckTrigger checkTrigger;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. CommitTrigger commitTrigger;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. ReleaseSelector releaseSelector;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. ForgeTrigger forgeTrigger;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. ExecutionTrigger executionTrigger;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. DownloadTrigger downloadTrigger;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. CloneTrigger cloneTrigger;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. NoLanguageDefinedBlock noLanguageDefinedBlock;
				public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512. LanguageDefinedBlock languageDefinedBlock;

				public _19_3_02046926512(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (editTrigger == null) editTrigger = register(new EditTrigger(box()).<EditTrigger>id("a_2078356096").owner(AbstractModelHeaderTemplate.this));
					if (checkTrigger == null) checkTrigger = register(new CheckTrigger(box()).<CheckTrigger>id("a_873387874").owner(AbstractModelHeaderTemplate.this));
					if (commitTrigger == null) commitTrigger = register(new CommitTrigger(box()).<CommitTrigger>id("a_903016141").owner(AbstractModelHeaderTemplate.this));
					if (releaseSelector == null) releaseSelector = register(new ReleaseSelector(box()).<ReleaseSelector>id("a368635192").owner(AbstractModelHeaderTemplate.this));
					if (forgeTrigger == null) forgeTrigger = register(new ForgeTrigger(box()).<ForgeTrigger>id("a1053583711").owner(AbstractModelHeaderTemplate.this));
					if (executionTrigger == null) executionTrigger = register(new ExecutionTrigger(box()).<ExecutionTrigger>id("a_718743154").owner(AbstractModelHeaderTemplate.this));
					if (downloadTrigger == null) downloadTrigger = register(new DownloadTrigger(box()).<DownloadTrigger>id("a876634178").owner(AbstractModelHeaderTemplate.this));
					if (cloneTrigger == null) cloneTrigger = register(new CloneTrigger(box()).<CloneTrigger>id("a_1710483799").owner(AbstractModelHeaderTemplate.this));
					if (noLanguageDefinedBlock == null) noLanguageDefinedBlock = register(new NoLanguageDefinedBlock(box()).<NoLanguageDefinedBlock>id("a_459854229").owner(AbstractModelHeaderTemplate.this));
					if (languageDefinedBlock == null) languageDefinedBlock = register(new LanguageDefinedBlock(box()).<LanguageDefinedBlock>id("a_680009078").owner(AbstractModelHeaderTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (editTrigger != null) editTrigger.unregister();
					if (checkTrigger != null) checkTrigger.unregister();
					if (commitTrigger != null) commitTrigger.unregister();
					if (releaseSelector != null) releaseSelector.unregister();
					if (forgeTrigger != null) forgeTrigger.unregister();
					if (executionTrigger != null) executionTrigger.unregister();
					if (downloadTrigger != null) downloadTrigger.unregister();
					if (cloneTrigger != null) cloneTrigger.unregister();
					if (noLanguageDefinedBlock != null) noLanguageDefinedBlock.unregister();
					if (languageDefinedBlock != null) languageDefinedBlock.unregister();
				}

				public class EditTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public EditTrigger(B box) {
						super(box);
						_title("1. edit");
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

				public class CheckTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public CheckTrigger(B box) {
						super(box);
						_title("2. check");
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

				public class CommitTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public CommitTrigger(B box) {
						super(box);
						_title("3. commit");
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

				public class ReleaseSelector extends io.intino.alexandria.ui.displays.components.ActionSplit<io.intino.alexandria.ui.displays.notifiers.ActionSplitNotifier, B>  {

					public ReleaseSelector(B box) {
						super(box);
						_title("draft");
						_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("SplitButton"));
						_options(java.util.Arrays.asList("draft"));
						_option("draft");
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

				public class ForgeTrigger extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

					public ForgeTrigger(B box) {
						super(box);
						_title("4. Forge DSL");
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

				public class ExecutionTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public ExecutionTrigger(B box) {
						super(box);
						_title("4. Execute");
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

				public class DownloadTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public DownloadTrigger(B box) {
						super(box);
						_title("4. Inspect");
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

				public class CloneTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public CloneTrigger(B box) {
						super(box);
						_title("clone");
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

				public class NoLanguageDefinedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512.NoLanguageDefinedBlock. _28_83_0747418307 _28_83_0747418307;

					public NoLanguageDefinedBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_28_83_0747418307 == null) _28_83_0747418307 = register(new _28_83_0747418307(box()).<_28_83_0747418307>id("a_88698721").owner(AbstractModelHeaderTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_28_83_0747418307 != null) _28_83_0747418307.unregister();
					}

					public class _28_83_0747418307 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _28_83_0747418307(B box) {
							super(box);
							_value("A DSL has not been created for this metamodel yet");
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

				public class LanguageDefinedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512.LanguageDefinedBlock. _30_5_11911072444 _30_5_11911072444;
					public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512.LanguageDefinedBlock. GotoForgeTrigger gotoForgeTrigger;

					public LanguageDefinedBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_30_5_11911072444 == null) _30_5_11911072444 = register(new _30_5_11911072444(box()).<_30_5_11911072444>id("a601471616").owner(AbstractModelHeaderTemplate.this));
						if (gotoForgeTrigger == null) gotoForgeTrigger = register(new GotoForgeTrigger(box()).<GotoForgeTrigger>id("a_1984655767").owner(AbstractModelHeaderTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_30_5_11911072444 != null) _30_5_11911072444.unregister();
						if (gotoForgeTrigger != null) gotoForgeTrigger.unregister();
					}

					public class _30_5_11911072444 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public ModelHeaderTemplate.ContentBlock._11_2_01137824745._19_3_02046926512.LanguageDefinedBlock._30_5_11911072444. _30_30_01300650706 _30_30_01300650706;

						public _30_5_11911072444(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_30_30_01300650706 == null) _30_30_01300650706 = register(new _30_30_01300650706(box()).<_30_30_01300650706>id("a_1540811050").owner(AbstractModelHeaderTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_30_30_01300650706 != null) _30_30_01300650706.unregister();
						}

						public class _30_30_01300650706 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _30_30_01300650706(B box) {
								super(box);
								_value("This metamodel has been used to create");
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

					public class GotoForgeTrigger extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

						public GotoForgeTrigger(B box) {
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
				}
			}
		}

		public class _33_2_0280219653 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelLanguageToolbar languageToolbar;

			public _33_2_0280219653(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (languageToolbar == null) languageToolbar = AbstractModelHeaderTemplate.this.languageToolbar = register(new ModelLanguageToolbar((EditorBox)box()).id("a2044298604"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (languageToolbar != null) languageToolbar.unregister();
			}
		}
	}
}