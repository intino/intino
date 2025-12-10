package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLicenseItemTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _77_1_01670556923 _77_1_01670556923;
	public LicenseItemTemplate._77_1_01670556923. _78_2_0718144480 _78_2_0718144480;
	public LicenseItemTemplate._77_1_01670556923._78_2_0718144480. _79_3_1517579453 _79_3_1517579453;
	public LicenseItemTemplate._77_1_01670556923._78_2_0718144480._79_3_1517579453. Bullet bullet;
	public LicenseItemTemplate._77_1_01670556923._78_2_0718144480._79_3_1517579453. Title title;
	public LicenseItemTemplate._77_1_01670556923._78_2_0718144480. ExpirationInfo expirationInfo;
	public LicenseItemTemplate._77_1_01670556923. _81_2_0984001110 _81_2_0984001110;
	public LicenseItemTemplate._77_1_01670556923._81_2_0984001110. Renew renew;

	public AbstractLicenseItemTemplate(B box) {
		super(box);
		id("licenseItemTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_77_1_01670556923 == null) _77_1_01670556923 = register(new _77_1_01670556923(box()).<_77_1_01670556923>id("a2019470612").owner(AbstractLicenseItemTemplate.this));
		if (_77_1_01670556923 != null) _78_2_0718144480 = _77_1_01670556923._78_2_0718144480;
		if (_78_2_0718144480 != null) _79_3_1517579453 = _77_1_01670556923._78_2_0718144480._79_3_1517579453;
		if (_79_3_1517579453 != null) bullet = _77_1_01670556923._78_2_0718144480._79_3_1517579453.bullet;
		if (_79_3_1517579453 != null) title = _77_1_01670556923._78_2_0718144480._79_3_1517579453.title;
		if (_78_2_0718144480 != null) expirationInfo = _77_1_01670556923._78_2_0718144480.expirationInfo;
		if (_77_1_01670556923 != null) _81_2_0984001110 = _77_1_01670556923._81_2_0984001110;
		if (_81_2_0984001110 != null) renew = _77_1_01670556923._81_2_0984001110.renew;
	}

	@Override
	public void remove() {
		super.remove();
		if (_77_1_01670556923 != null) _77_1_01670556923.unregister();
	}

	public class _77_1_01670556923 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LicenseItemTemplate._77_1_01670556923. _78_2_0718144480 _78_2_0718144480;
		public LicenseItemTemplate._77_1_01670556923. _81_2_0984001110 _81_2_0984001110;

		public _77_1_01670556923(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_78_2_0718144480 == null) _78_2_0718144480 = register(new _78_2_0718144480(box()).<_78_2_0718144480>id("a1033287991").owner(AbstractLicenseItemTemplate.this));
			if (_81_2_0984001110 == null) _81_2_0984001110 = register(new _81_2_0984001110(box()).<_81_2_0984001110>id("a_1802818726").owner(AbstractLicenseItemTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_78_2_0718144480 != null) _78_2_0718144480.unregister();
			if (_81_2_0984001110 != null) _81_2_0984001110.unregister();
		}

		public class _78_2_0718144480 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicenseItemTemplate._77_1_01670556923._78_2_0718144480. _79_3_1517579453 _79_3_1517579453;
			public LicenseItemTemplate._77_1_01670556923._78_2_0718144480. ExpirationInfo expirationInfo;

			public _78_2_0718144480(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_79_3_1517579453 == null) _79_3_1517579453 = register(new _79_3_1517579453(box()).<_79_3_1517579453>id("a1899243279").owner(AbstractLicenseItemTemplate.this));
				if (expirationInfo == null) expirationInfo = register(new ExpirationInfo(box()).<ExpirationInfo>id("a_1800382691").owner(AbstractLicenseItemTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_79_3_1517579453 != null) _79_3_1517579453.unregister();
				if (expirationInfo != null) expirationInfo.unregister();
			}

			public class _79_3_1517579453 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LicenseItemTemplate._77_1_01670556923._78_2_0718144480._79_3_1517579453. Bullet bullet;
				public LicenseItemTemplate._77_1_01670556923._78_2_0718144480._79_3_1517579453. Title title;

				public _79_3_1517579453(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (bullet == null) bullet = register(new Bullet(box()).<Bullet>id("a1157187104").owner(AbstractLicenseItemTemplate.this));
					if (title == null) title = register(new Title(box()).<Title>id("a_500587142").owner(AbstractLicenseItemTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (bullet != null) bullet.unregister();
					if (title != null) title.unregister();
				}

				public class Bullet extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public Bullet(B box) {
						super(box);
						_value(" ");
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
			}

			public class ExpirationInfo extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public ExpirationInfo(B box) {
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

		public class _81_2_0984001110 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicenseItemTemplate._77_1_01670556923._81_2_0984001110. Renew renew;

			public _81_2_0984001110(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (renew == null) renew = register(new Renew(box()).<Renew>id("a_11842683").owner(AbstractLicenseItemTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (renew != null) renew.unregister();
			}

			public class Renew extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Renew(B box) {
					super(box);
					_title("renew");
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