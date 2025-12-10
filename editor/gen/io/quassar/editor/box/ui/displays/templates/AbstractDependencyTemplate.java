package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractDependencyTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Title title;
	public _410_1_11294641038 _410_1_11294641038;
	public DependencyTemplate._410_1_11294641038. _411_2_11751991862 _411_2_11751991862;
	public DependencyTemplate._410_1_11294641038._411_2_11751991862. ContentField contentField;
	public DependencyTemplate._410_1_11294641038._411_2_11751991862. _413_3_1176200563 _413_3_1176200563;
	public DependencyTemplate._410_1_11294641038._411_2_11751991862._413_3_1176200563. ContentLink contentLink;
	public DependencyTemplate._410_1_11294641038._411_2_11751991862._413_3_1176200563. DownloadLink downloadLink;
	public DependencyTemplate._410_1_11294641038. _416_2_0340668757 _416_2_0340668757;
	public DependencyTemplate._410_1_11294641038._416_2_0340668757. RepositoryField repositoryField;
	public DependencyTemplate._410_1_11294641038._416_2_0340668757. RepositoryLink repositoryLink;

	public AbstractDependencyTemplate(B box) {
		super(box);
		id("dependencyTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (title == null) title = register(new Title(box()).<Title>id("a_682122787").owner(AbstractDependencyTemplate.this));
		if (_410_1_11294641038 == null) _410_1_11294641038 = register(new _410_1_11294641038(box()).<_410_1_11294641038>id("a1200717969").owner(AbstractDependencyTemplate.this));
		if (_410_1_11294641038 != null) _411_2_11751991862 = _410_1_11294641038._411_2_11751991862;
		if (_411_2_11751991862 != null) contentField = _410_1_11294641038._411_2_11751991862.contentField;
		if (_411_2_11751991862 != null) _413_3_1176200563 = _410_1_11294641038._411_2_11751991862._413_3_1176200563;
		if (_413_3_1176200563 != null) contentLink = _410_1_11294641038._411_2_11751991862._413_3_1176200563.contentLink;
		if (_413_3_1176200563 != null) downloadLink = _410_1_11294641038._411_2_11751991862._413_3_1176200563.downloadLink;
		if (_410_1_11294641038 != null) _416_2_0340668757 = _410_1_11294641038._416_2_0340668757;
		if (_416_2_0340668757 != null) repositoryField = _410_1_11294641038._416_2_0340668757.repositoryField;
		if (_416_2_0340668757 != null) repositoryLink = _410_1_11294641038._416_2_0340668757.repositoryLink;
	}

	@Override
	public void remove() {
		super.remove();
		if (title != null) title.unregister();
		if (_410_1_11294641038 != null) _410_1_11294641038.unregister();
	}

	public class Title extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public Title(B box) {
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

	public class _410_1_11294641038 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public DependencyTemplate._410_1_11294641038. _411_2_11751991862 _411_2_11751991862;
		public DependencyTemplate._410_1_11294641038. _416_2_0340668757 _416_2_0340668757;

		public _410_1_11294641038(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_411_2_11751991862 == null) _411_2_11751991862 = register(new _411_2_11751991862(box()).<_411_2_11751991862>id("a659812925").owner(AbstractDependencyTemplate.this));
			if (_416_2_0340668757 == null) _416_2_0340668757 = register(new _416_2_0340668757(box()).<_416_2_0340668757>id("a343893268").owner(AbstractDependencyTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_411_2_11751991862 != null) _411_2_11751991862.unregister();
			if (_416_2_0340668757 != null) _416_2_0340668757.unregister();
		}

		public class _411_2_11751991862 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public DependencyTemplate._410_1_11294641038._411_2_11751991862. ContentField contentField;
			public DependencyTemplate._410_1_11294641038._411_2_11751991862. _413_3_1176200563 _413_3_1176200563;

			public _411_2_11751991862(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (contentField == null) contentField = register(new ContentField(box()).<ContentField>id("a_1513513987").owner(AbstractDependencyTemplate.this));
				if (_413_3_1176200563 == null) _413_3_1176200563 = register(new _413_3_1176200563(box()).<_413_3_1176200563>id("a_1971787721").owner(AbstractDependencyTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (contentField != null) contentField.unregister();
				if (_413_3_1176200563 != null) _413_3_1176200563.unregister();
			}

			public class ContentField extends io.intino.alexandria.ui.displays.components.TextCode<io.intino.alexandria.ui.displays.notifiers.TextCodeNotifier, B>  {

				public ContentField(B box) {
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

			public class _413_3_1176200563 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public DependencyTemplate._410_1_11294641038._411_2_11751991862._413_3_1176200563. ContentLink contentLink;
				public DependencyTemplate._410_1_11294641038._411_2_11751991862._413_3_1176200563. DownloadLink downloadLink;

				public _413_3_1176200563(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (contentLink == null) contentLink = register(new ContentLink(box()).<ContentLink>id("a594846618").owner(AbstractDependencyTemplate.this));
					if (downloadLink == null) downloadLink = register(new DownloadLink(box()).<DownloadLink>id("a1555245563").owner(AbstractDependencyTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (contentLink != null) contentLink.unregister();
					if (downloadLink != null) downloadLink.unregister();
				}

				public class ContentLink extends io.intino.alexandria.ui.displays.components.CopyToClipboard<io.intino.alexandria.ui.displays.notifiers.CopyToClipboardNotifier, B>  {

					public ContentLink(B box) {
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

				public class DownloadLink extends io.intino.alexandria.ui.displays.components.Download<io.intino.alexandria.ui.displays.notifiers.DownloadNotifier, B>  {

					public DownloadLink(B box) {
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
		}

		public class _416_2_0340668757 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public DependencyTemplate._410_1_11294641038._416_2_0340668757. RepositoryField repositoryField;
			public DependencyTemplate._410_1_11294641038._416_2_0340668757. RepositoryLink repositoryLink;

			public _416_2_0340668757(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (repositoryField == null) repositoryField = register(new RepositoryField(box()).<RepositoryField>id("a182103833").owner(AbstractDependencyTemplate.this));
				if (repositoryLink == null) repositoryLink = register(new RepositoryLink(box()).<RepositoryLink>id("a1114431995").owner(AbstractDependencyTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (repositoryField != null) repositoryField.unregister();
				if (repositoryLink != null) repositoryLink.unregister();
			}

			public class RepositoryField extends io.intino.alexandria.ui.displays.components.TextCode<io.intino.alexandria.ui.displays.notifiers.TextCodeNotifier, B>  {

				public RepositoryField(B box) {
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

			public class RepositoryLink extends io.intino.alexandria.ui.displays.components.CopyToClipboard<io.intino.alexandria.ui.displays.notifiers.CopyToClipboardNotifier, B>  {

				public RepositoryLink(B box) {
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
	}
}