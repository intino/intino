package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractDownloadModelDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public DownloadSilently downloadSilently;
	public Dialog dialog;
	public DownloadModelDialog.Dialog. _110_8_0994721186 _110_8_0994721186;
	public DownloadModelDialog.Dialog._110_8_0994721186. _112_3_11791154390 _112_3_11791154390;
	public DownloadModelDialog.Dialog._110_8_0994721186._112_3_11791154390. _113_4_0633863718 _113_4_0633863718;
	public DownloadModelDialog.Dialog._110_8_0994721186._112_3_11791154390. Download download;
	public DownloadModelDialog.Dialog._110_8_0994721186. _116_3_1138945139 _116_3_1138945139;
	public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139. _117_4_0923616280 _117_4_0923616280;
	public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139. ModelUrl modelUrl;
	public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139. _119_4_01953270638 _119_4_01953270638;
	public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139._119_4_01953270638. CopyReleaseUrl copyReleaseUrl;
	public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139._119_4_01953270638. CopyReleaseCommit copyReleaseCommit;
	public DownloadModelDialog.Dialog. _123_2_1955995399 _123_2_1955995399;
	public DownloadModelDialog.Dialog. _124_8_01181959057 _124_8_01181959057;
	public DownloadModelDialog.Dialog._124_8_01181959057. _125_12_11311137904 _125_12_11311137904;

	public AbstractDownloadModelDialog(B box) {
		super(box);
		id("downloadModelDialog");
	}

	@Override
	public void init() {
		super.init();
		if (downloadSilently == null) downloadSilently = register(new DownloadSilently(box()).<DownloadSilently>id("a_1283342465").owner(AbstractDownloadModelDialog.this));
		if (dialog == null) dialog = register(new Dialog(box()).<Dialog>id("a_36436547").owner(AbstractDownloadModelDialog.this));
		if (dialog != null) _110_8_0994721186 = dialog._110_8_0994721186;
		if (_110_8_0994721186 != null) _112_3_11791154390 = dialog._110_8_0994721186._112_3_11791154390;
		if (_112_3_11791154390 != null) _113_4_0633863718 = dialog._110_8_0994721186._112_3_11791154390._113_4_0633863718;
		if (_112_3_11791154390 != null) download = dialog._110_8_0994721186._112_3_11791154390.download;
		if (_110_8_0994721186 != null) _116_3_1138945139 = dialog._110_8_0994721186._116_3_1138945139;
		if (_116_3_1138945139 != null) _117_4_0923616280 = dialog._110_8_0994721186._116_3_1138945139._117_4_0923616280;
		if (_116_3_1138945139 != null) modelUrl = dialog._110_8_0994721186._116_3_1138945139.modelUrl;
		if (_116_3_1138945139 != null) _119_4_01953270638 = dialog._110_8_0994721186._116_3_1138945139._119_4_01953270638;
		if (_119_4_01953270638 != null) copyReleaseUrl = dialog._110_8_0994721186._116_3_1138945139._119_4_01953270638.copyReleaseUrl;
		if (_119_4_01953270638 != null) copyReleaseCommit = dialog._110_8_0994721186._116_3_1138945139._119_4_01953270638.copyReleaseCommit;
		if (dialog != null) _123_2_1955995399 = dialog._123_2_1955995399;
		if (dialog != null) _124_8_01181959057 = dialog._124_8_01181959057;
		if (_124_8_01181959057 != null) _125_12_11311137904 = dialog._124_8_01181959057._125_12_11311137904;


		if (_125_12_11311137904 != null) _125_12_11311137904.bindTo(dialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (downloadSilently != null) downloadSilently.unregister();
		if (dialog != null) dialog.unregister();
	}

	public class DownloadSilently extends io.intino.alexandria.ui.displays.components.Download<io.intino.alexandria.ui.displays.notifiers.DownloadNotifier, B>  {

		public DownloadSilently(B box) {
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

	public class Dialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public DownloadModelDialog.Dialog. _110_8_0994721186 _110_8_0994721186;
		public DownloadModelDialog.Dialog. _123_2_1955995399 _123_2_1955995399;
		public DownloadModelDialog.Dialog. _124_8_01181959057 _124_8_01181959057;

		public Dialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_110_8_0994721186 == null) _110_8_0994721186 = register(new _110_8_0994721186(box()).<_110_8_0994721186>id("a_97984784").owner(AbstractDownloadModelDialog.this));
			if (_123_2_1955995399 == null) _123_2_1955995399 = register(new _123_2_1955995399(box()).<_123_2_1955995399>id("a1491922333").owner(AbstractDownloadModelDialog.this));
			if (_124_8_01181959057 == null) _124_8_01181959057 = register(new _124_8_01181959057(box()).<_124_8_01181959057>id("a_1110399922").owner(AbstractDownloadModelDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_110_8_0994721186 != null) _110_8_0994721186.unregister();
			if (_123_2_1955995399 != null) _123_2_1955995399.unregister();
			if (_124_8_01181959057 != null) _124_8_01181959057.unregister();
		}

		public class _110_8_0994721186 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public DownloadModelDialog.Dialog._110_8_0994721186. _112_3_11791154390 _112_3_11791154390;
			public DownloadModelDialog.Dialog._110_8_0994721186. _116_3_1138945139 _116_3_1138945139;

			public _110_8_0994721186(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_112_3_11791154390 == null) _112_3_11791154390 = register(new _112_3_11791154390(box()).<_112_3_11791154390>id("a111069696").owner(AbstractDownloadModelDialog.this));
				if (_116_3_1138945139 == null) _116_3_1138945139 = register(new _116_3_1138945139(box()).<_116_3_1138945139>id("a_917113817").owner(AbstractDownloadModelDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_112_3_11791154390 != null) _112_3_11791154390.unregister();
				if (_116_3_1138945139 != null) _116_3_1138945139.unregister();
			}

			public class _112_3_11791154390 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public DownloadModelDialog.Dialog._110_8_0994721186._112_3_11791154390. _113_4_0633863718 _113_4_0633863718;
				public DownloadModelDialog.Dialog._110_8_0994721186._112_3_11791154390. Download download;

				public _112_3_11791154390(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_113_4_0633863718 == null) _113_4_0633863718 = register(new _113_4_0633863718(box()).<_113_4_0633863718>id("a658527347").owner(AbstractDownloadModelDialog.this));
					if (download == null) download = register(new Download(box()).<Download>id("a_579639238").owner(AbstractDownloadModelDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_113_4_0633863718 != null) _113_4_0633863718.unregister();
					if (download != null) download.unregister();
				}

				public class _113_4_0633863718 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _113_4_0633863718(B box) {
						super(box);
						_value("Model file (zip format)");
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

				public class Download extends io.intino.alexandria.ui.displays.components.Download<io.intino.alexandria.ui.displays.notifiers.DownloadNotifier, B>  {

					public Download(B box) {
						super(box);
						_title("Download");
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

			public class _116_3_1138945139 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139. _117_4_0923616280 _117_4_0923616280;
				public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139. ModelUrl modelUrl;
				public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139. _119_4_01953270638 _119_4_01953270638;

				public _116_3_1138945139(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_117_4_0923616280 == null) _117_4_0923616280 = register(new _117_4_0923616280(box()).<_117_4_0923616280>id("a844666237").owner(AbstractDownloadModelDialog.this));
					if (modelUrl == null) modelUrl = register(new ModelUrl(box()).<ModelUrl>id("a_2110174540").owner(AbstractDownloadModelDialog.this));
					if (_119_4_01953270638 == null) _119_4_01953270638 = register(new _119_4_01953270638(box()).<_119_4_01953270638>id("a1792415524").owner(AbstractDownloadModelDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_117_4_0923616280 != null) _117_4_0923616280.unregister();
					if (modelUrl != null) modelUrl.unregister();
					if (_119_4_01953270638 != null) _119_4_01953270638.unregister();
				}

				public class _117_4_0923616280 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _117_4_0923616280(B box) {
						super(box);
						_value("Model url");
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

				public class ModelUrl extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public ModelUrl(B box) {
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

				public class _119_4_01953270638 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139._119_4_01953270638. CopyReleaseUrl copyReleaseUrl;
					public DownloadModelDialog.Dialog._110_8_0994721186._116_3_1138945139._119_4_01953270638. CopyReleaseCommit copyReleaseCommit;

					public _119_4_01953270638(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (copyReleaseUrl == null) copyReleaseUrl = register(new CopyReleaseUrl(box()).<CopyReleaseUrl>id("a_1936494553").owner(AbstractDownloadModelDialog.this));
						if (copyReleaseCommit == null) copyReleaseCommit = register(new CopyReleaseCommit(box()).<CopyReleaseCommit>id("a_626465921").owner(AbstractDownloadModelDialog.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (copyReleaseUrl != null) copyReleaseUrl.unregister();
						if (copyReleaseCommit != null) copyReleaseCommit.unregister();
					}

					public class CopyReleaseUrl extends io.intino.alexandria.ui.displays.components.CopyToClipboard<io.intino.alexandria.ui.displays.notifiers.CopyToClipboardNotifier, B>  {

						public CopyReleaseUrl(B box) {
							super(box);
							_title("Copy URL");
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

					public class CopyReleaseCommit extends io.intino.alexandria.ui.displays.components.CopyToClipboard<io.intino.alexandria.ui.displays.notifiers.CopyToClipboardNotifier, B>  {

						public CopyReleaseCommit(B box) {
							super(box);
							_title("Copy commit");
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

		public class _123_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _123_2_1955995399(B box) {
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

		public class _124_8_01181959057 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public DownloadModelDialog.Dialog._124_8_01181959057. _125_12_11311137904 _125_12_11311137904;

			public _124_8_01181959057(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_125_12_11311137904 == null) _125_12_11311137904 = register(new _125_12_11311137904(box()).<_125_12_11311137904>id("a1582757787").owner(AbstractDownloadModelDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_125_12_11311137904 != null) _125_12_11311137904.unregister();
			}

			public class _125_12_11311137904 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _125_12_11311137904(B box) {
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