package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageExecutionLauncher<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public SiteLauncher siteLauncher;
	public LocalDialog localDialog;
	public LanguageExecutionLauncher.LocalDialog. _246_8_01458899296 _246_8_01458899296;
	public LanguageExecutionLauncher.LocalDialog._246_8_01458899296. _247_3_1902669657 _247_3_1902669657;
	public LanguageExecutionLauncher.LocalDialog._246_8_01458899296. Execution execution;
	public LanguageExecutionLauncher.LocalDialog._246_8_01458899296. _249_3_12137231457 _249_3_12137231457;
	public LanguageExecutionLauncher.LocalDialog._246_8_01458899296._249_3_12137231457. Copy copy;
	public LanguageExecutionLauncher.LocalDialog._246_8_01458899296. _250_3_0495040948 _250_3_0495040948;
	public LanguageExecutionLauncher.LocalDialog._246_8_01458899296._250_3_0495040948. OpenInstallationNotes openInstallationNotes;
	public LanguageExecutionLauncher.LocalDialog. _252_2_1955995399 _252_2_1955995399;
	public LanguageExecutionLauncher.LocalDialog. _253_8_1245483429 _253_8_1245483429;
	public LanguageExecutionLauncher.LocalDialog._253_8_1245483429. _254_9_1785117261 _254_9_1785117261;

	public AbstractLanguageExecutionLauncher(B box) {
		super(box);
		id("languageExecutionLauncher");
	}

	@Override
	public void init() {
		super.init();
		if (siteLauncher == null) siteLauncher = register(new SiteLauncher(box()).<SiteLauncher>id("a_1587874651").owner(AbstractLanguageExecutionLauncher.this));
		if (localDialog == null) localDialog = register(new LocalDialog(box()).<LocalDialog>id("a2117068853").owner(AbstractLanguageExecutionLauncher.this));
		if (localDialog != null) _246_8_01458899296 = localDialog._246_8_01458899296;
		if (_246_8_01458899296 != null) _247_3_1902669657 = localDialog._246_8_01458899296._247_3_1902669657;
		if (_246_8_01458899296 != null) execution = localDialog._246_8_01458899296.execution;
		if (_246_8_01458899296 != null) _249_3_12137231457 = localDialog._246_8_01458899296._249_3_12137231457;
		if (_249_3_12137231457 != null) copy = localDialog._246_8_01458899296._249_3_12137231457.copy;
		if (_246_8_01458899296 != null) _250_3_0495040948 = localDialog._246_8_01458899296._250_3_0495040948;
		if (_250_3_0495040948 != null) openInstallationNotes = localDialog._246_8_01458899296._250_3_0495040948.openInstallationNotes;
		if (localDialog != null) _252_2_1955995399 = localDialog._252_2_1955995399;
		if (localDialog != null) _253_8_1245483429 = localDialog._253_8_1245483429;
		if (_253_8_1245483429 != null) _254_9_1785117261 = localDialog._253_8_1245483429._254_9_1785117261;


		if (_254_9_1785117261 != null) _254_9_1785117261.bindTo(localDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (siteLauncher != null) siteLauncher.unregister();
		if (localDialog != null) localDialog.unregister();
	}

	public class SiteLauncher extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

		public SiteLauncher(B box) {
			super(box);
			_title(" ");
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

	public class LocalDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public LanguageExecutionLauncher.LocalDialog. _246_8_01458899296 _246_8_01458899296;
		public LanguageExecutionLauncher.LocalDialog. _252_2_1955995399 _252_2_1955995399;
		public LanguageExecutionLauncher.LocalDialog. _253_8_1245483429 _253_8_1245483429;

		public LocalDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_246_8_01458899296 == null) _246_8_01458899296 = register(new _246_8_01458899296(box()).<_246_8_01458899296>id("a_1573953626").owner(AbstractLanguageExecutionLauncher.this));
			if (_252_2_1955995399 == null) _252_2_1955995399 = register(new _252_2_1955995399(box()).<_252_2_1955995399>id("a2012771608").owner(AbstractLanguageExecutionLauncher.this));
			if (_253_8_1245483429 == null) _253_8_1245483429 = register(new _253_8_1245483429(box()).<_253_8_1245483429>id("a162050201").owner(AbstractLanguageExecutionLauncher.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_246_8_01458899296 != null) _246_8_01458899296.unregister();
			if (_252_2_1955995399 != null) _252_2_1955995399.unregister();
			if (_253_8_1245483429 != null) _253_8_1245483429.unregister();
		}

		public class _246_8_01458899296 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExecutionLauncher.LocalDialog._246_8_01458899296. _247_3_1902669657 _247_3_1902669657;
			public LanguageExecutionLauncher.LocalDialog._246_8_01458899296. Execution execution;
			public LanguageExecutionLauncher.LocalDialog._246_8_01458899296. _249_3_12137231457 _249_3_12137231457;
			public LanguageExecutionLauncher.LocalDialog._246_8_01458899296. _250_3_0495040948 _250_3_0495040948;

			public _246_8_01458899296(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_247_3_1902669657 == null) _247_3_1902669657 = register(new _247_3_1902669657(box()).<_247_3_1902669657>id("a_339051501").owner(AbstractLanguageExecutionLauncher.this));
				if (execution == null) execution = register(new Execution(box()).<Execution>id("a_475217779").owner(AbstractLanguageExecutionLauncher.this));
				if (_249_3_12137231457 == null) _249_3_12137231457 = register(new _249_3_12137231457(box()).<_249_3_12137231457>id("a_1122279182").owner(AbstractLanguageExecutionLauncher.this));
				if (_250_3_0495040948 == null) _250_3_0495040948 = register(new _250_3_0495040948(box()).<_250_3_0495040948>id("a2050342275").owner(AbstractLanguageExecutionLauncher.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_247_3_1902669657 != null) _247_3_1902669657.unregister();
				if (execution != null) execution.unregister();
				if (_249_3_12137231457 != null) _249_3_12137231457.unregister();
				if (_250_3_0495040948 != null) _250_3_0495040948.unregister();
			}

			public class _247_3_1902669657 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _247_3_1902669657(B box) {
					super(box);
					_value("To run this model locally, make sure your environment is set up correctly. Below you’ll find installation notes. Once everything is ready, you can copy and run the command shown to execute the model.");
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

			public class Execution extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

				public Execution(B box) {
					super(box);

					_readonly(true);
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

			public class _249_3_12137231457 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExecutionLauncher.LocalDialog._246_8_01458899296._249_3_12137231457. Copy copy;

				public _249_3_12137231457(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (copy == null) copy = register(new Copy(box()).<Copy>id("a_2007109534").owner(AbstractLanguageExecutionLauncher.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (copy != null) copy.unregister();
				}

				public class Copy extends io.intino.alexandria.ui.displays.components.CopyToClipboard<io.intino.alexandria.ui.displays.notifiers.CopyToClipboardNotifier, B>  {

					public Copy(B box) {
						super(box);
						_title("Copy");
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

			public class _250_3_0495040948 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExecutionLauncher.LocalDialog._246_8_01458899296._250_3_0495040948. OpenInstallationNotes openInstallationNotes;

				public _250_3_0495040948(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (openInstallationNotes == null) openInstallationNotes = register(new OpenInstallationNotes(box()).<OpenInstallationNotes>id("a1341112390").owner(AbstractLanguageExecutionLauncher.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (openInstallationNotes != null) openInstallationNotes.unregister();
				}

				public class OpenInstallationNotes extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

					public OpenInstallationNotes(B box) {
						super(box);
						_title("Installation notes");
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

		public class _252_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _252_2_1955995399(B box) {
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

		public class _253_8_1245483429 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExecutionLauncher.LocalDialog._253_8_1245483429. _254_9_1785117261 _254_9_1785117261;

			public _253_8_1245483429(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_254_9_1785117261 == null) _254_9_1785117261 = register(new _254_9_1785117261(box()).<_254_9_1785117261>id("a_615197123").owner(AbstractLanguageExecutionLauncher.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_254_9_1785117261 != null) _254_9_1785117261.unregister();
			}

			public class _254_9_1785117261 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _254_9_1785117261(B box) {
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