package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public LicenseExpiredBanner licenseExpiredBanner;
	public LanguageChangedBlock languageChangedBlock;
	public ModelTemplate.LanguageChangedBlock. _85_2_11149554889 _85_2_11149554889;
	public ModelTemplate.LanguageChangedBlock. Reload reload;
	public NotFoundBlock notFoundBlock;
	public ModelTemplate.NotFoundBlock. _89_2_01542998017 _89_2_01542998017;
	public ModelTemplate.NotFoundBlock._89_2_01542998017. _90_3_11215610986 _90_3_11215610986;
	public ModelTemplate.NotFoundBlock._89_2_01542998017._90_3_11215610986. _91_4_01262367153 _91_4_01262367153;
	public ModelTemplate.NotFoundBlock._89_2_01542998017._90_3_11215610986. _92_4_11136077668 _92_4_11136077668;
	public ModelTemplate.NotFoundBlock._89_2_01542998017._90_3_11215610986. _93_4_01106772302 _93_4_01106772302;
	public ModelTemplate.NotFoundBlock._89_2_01542998017._90_3_11215610986._93_4_01106772302. _93_31_0285899485 _93_31_0285899485;
	public ContentBlock contentBlock;
	public ModelEditor modelEditor;

	public AbstractModelTemplate(B box) {
		super(box);
		id("modelTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (licenseExpiredBanner == null) licenseExpiredBanner = register(new LicenseExpiredBanner((EditorBox)box()).id("a_1849001845"));
		if (languageChangedBlock == null) languageChangedBlock = register(new LanguageChangedBlock(box()).<LanguageChangedBlock>id("a_1335271860").owner(AbstractModelTemplate.this));
		if (languageChangedBlock != null) _85_2_11149554889 = languageChangedBlock._85_2_11149554889;
		if (languageChangedBlock != null) reload = languageChangedBlock.reload;
		if (notFoundBlock == null) notFoundBlock = register(new NotFoundBlock(box()).<NotFoundBlock>id("a_515118813").owner(AbstractModelTemplate.this));
		if (notFoundBlock != null) _89_2_01542998017 = notFoundBlock._89_2_01542998017;
		if (_89_2_01542998017 != null) _90_3_11215610986 = notFoundBlock._89_2_01542998017._90_3_11215610986;
		if (_90_3_11215610986 != null) _91_4_01262367153 = notFoundBlock._89_2_01542998017._90_3_11215610986._91_4_01262367153;
		if (_90_3_11215610986 != null) _92_4_11136077668 = notFoundBlock._89_2_01542998017._90_3_11215610986._92_4_11136077668;
		if (_90_3_11215610986 != null) _93_4_01106772302 = notFoundBlock._89_2_01542998017._90_3_11215610986._93_4_01106772302;
		if (_93_4_01106772302 != null) _93_31_0285899485 = notFoundBlock._89_2_01542998017._90_3_11215610986._93_4_01106772302._93_31_0285899485;
		if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a_217905361").owner(AbstractModelTemplate.this));
		if (contentBlock != null) modelEditor = contentBlock.modelEditor;
	}

	@Override
	public void remove() {
		super.remove();
		if (licenseExpiredBanner != null) licenseExpiredBanner.unregister();
		if (languageChangedBlock != null) languageChangedBlock.unregister();
		if (notFoundBlock != null) notFoundBlock.unregister();
		if (contentBlock != null) contentBlock.unregister();
	}

	public class LanguageChangedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelTemplate.LanguageChangedBlock. _85_2_11149554889 _85_2_11149554889;
		public ModelTemplate.LanguageChangedBlock. Reload reload;

		public LanguageChangedBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_85_2_11149554889 == null) _85_2_11149554889 = register(new _85_2_11149554889(box()).<_85_2_11149554889>id("a1566100440").owner(AbstractModelTemplate.this));
			if (reload == null) reload = register(new Reload(box()).<Reload>id("a_1501252884").owner(AbstractModelTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_85_2_11149554889 != null) _85_2_11149554889.unregister();
			if (reload != null) reload.unregister();
		}

		public class _85_2_11149554889 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _85_2_11149554889(B box) {
				super(box);
				_value("The DSL associated with this model has changed. Please reload this model to check if it remains compatible.");
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

		public class Reload extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

			public Reload(B box) {
				super(box);
				_title("Reload");
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

	public class NotFoundBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelTemplate.NotFoundBlock. _89_2_01542998017 _89_2_01542998017;

		public NotFoundBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_89_2_01542998017 == null) _89_2_01542998017 = register(new _89_2_01542998017(box()).<_89_2_01542998017>id("a618755464").owner(AbstractModelTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_89_2_01542998017 != null) _89_2_01542998017.unregister();
		}

		public class _89_2_01542998017 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelTemplate.NotFoundBlock._89_2_01542998017. _90_3_11215610986 _90_3_11215610986;

			public _89_2_01542998017(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_90_3_11215610986 == null) _90_3_11215610986 = register(new _90_3_11215610986(box()).<_90_3_11215610986>id("a1664569517").owner(AbstractModelTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_90_3_11215610986 != null) _90_3_11215610986.unregister();
			}

			public class _90_3_11215610986 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelTemplate.NotFoundBlock._89_2_01542998017._90_3_11215610986. _91_4_01262367153 _91_4_01262367153;
				public ModelTemplate.NotFoundBlock._89_2_01542998017._90_3_11215610986. _92_4_11136077668 _92_4_11136077668;
				public ModelTemplate.NotFoundBlock._89_2_01542998017._90_3_11215610986. _93_4_01106772302 _93_4_01106772302;

				public _90_3_11215610986(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_91_4_01262367153 == null) _91_4_01262367153 = register(new _91_4_01262367153(box()).<_91_4_01262367153>id("a1566487542").owner(AbstractModelTemplate.this));
					if (_92_4_11136077668 == null) _92_4_11136077668 = register(new _92_4_11136077668(box()).<_92_4_11136077668>id("a1321167083").owner(AbstractModelTemplate.this));
					if (_93_4_01106772302 == null) _93_4_01106772302 = register(new _93_4_01106772302(box()).<_93_4_01106772302>id("a_402508727").owner(AbstractModelTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_91_4_01262367153 != null) _91_4_01262367153.unregister();
					if (_92_4_11136077668 != null) _92_4_11136077668.unregister();
					if (_93_4_01106772302 != null) _93_4_01106772302.unregister();
				}

				public class _91_4_01262367153 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _91_4_01262367153(B box) {
						super(box);
						_value("Not found");
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

				public class _92_4_11136077668 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _92_4_11136077668(B box) {
						super(box);
						_value("Sorry, we can't find the model you are visiting");
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

				public class _93_4_01106772302 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelTemplate.NotFoundBlock._89_2_01542998017._90_3_11215610986._93_4_01106772302. _93_31_0285899485 _93_31_0285899485;

					public _93_4_01106772302(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_93_31_0285899485 == null) _93_31_0285899485 = register(new _93_31_0285899485(box()).<_93_31_0285899485>id("a_1929908488").owner(AbstractModelTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_93_31_0285899485 != null) _93_31_0285899485.unregister();
					}

					public class _93_31_0285899485 extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<_93_31_0285899485> {

						public _93_31_0285899485(B box) {
							super(box);
							_title("home");
							_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Button"));
							_path("/");
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
						public _93_31_0285899485 address(java.util.function.Function<String, String> addressFromPathResolver) {
							address(addressFromPathResolver.apply(path()));
							return this;
						}
					}
				}
			}
		}
	}

	public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelEditor modelEditor;

		public ContentBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (modelEditor == null) modelEditor = AbstractModelTemplate.this.modelEditor = register(new ModelEditor((EditorBox)box()).id("a_989373210"));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (modelEditor != null) modelEditor.unregister();
		}
	}
}