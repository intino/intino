package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLicenseExpiredBanner<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Content content;
	public LicenseExpiredBanner.Content. _120_2_1459707061 _120_2_1459707061;
	public LicenseExpiredBanner.Content._120_2_1459707061. _121_3_1517579453 _121_3_1517579453;
	public LicenseExpiredBanner.Content._120_2_1459707061._121_3_1517579453. Bullet bullet;
	public LicenseExpiredBanner.Content._120_2_1459707061._121_3_1517579453. Title title;
	public LicenseExpiredBanner.Content._120_2_1459707061. ExpirationInfo expirationInfo;
	public LicenseExpiredBanner.Content._120_2_1459707061. ExpirationMessage expirationMessage;
	public LicenseExpiredBanner.Content. _124_2_01232873640 _124_2_01232873640;
	public LicenseExpiredBanner.Content._124_2_01232873640. RenewLicense renewLicense;
	public LicenseExpiredBanner.Content. AddLicenseBlock addLicenseBlock;
	public AddLicenseEditor addLicenseEditor;
	public RenewLicenseDialog renewLicenseDialog;

	public AbstractLicenseExpiredBanner(B box) {
		super(box);
		id("licenseExpiredBanner");
	}

	@Override
	public void init() {
		super.init();
		if (content == null) content = register(new Content(box()).<Content>id("a_1536592119").owner(AbstractLicenseExpiredBanner.this));
		if (content != null) _120_2_1459707061 = content._120_2_1459707061;
		if (_120_2_1459707061 != null) _121_3_1517579453 = content._120_2_1459707061._121_3_1517579453;
		if (_121_3_1517579453 != null) bullet = content._120_2_1459707061._121_3_1517579453.bullet;
		if (_121_3_1517579453 != null) title = content._120_2_1459707061._121_3_1517579453.title;
		if (_120_2_1459707061 != null) expirationInfo = content._120_2_1459707061.expirationInfo;
		if (_120_2_1459707061 != null) expirationMessage = content._120_2_1459707061.expirationMessage;
		if (content != null) _124_2_01232873640 = content._124_2_01232873640;
		if (_124_2_01232873640 != null) renewLicense = content._124_2_01232873640.renewLicense;
		if (content != null) addLicenseBlock = content.addLicenseBlock;
		if (addLicenseBlock != null) addLicenseEditor = content.addLicenseBlock.addLicenseEditor;
		if (renewLicenseDialog == null) renewLicenseDialog = register(new RenewLicenseDialog((EditorBox)box()).id("a813723340"));
	}

	@Override
	public void remove() {
		super.remove();
		if (content != null) content.unregister();
		if (renewLicenseDialog != null) renewLicenseDialog.unregister();
	}

	public class Content extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LicenseExpiredBanner.Content. _120_2_1459707061 _120_2_1459707061;
		public LicenseExpiredBanner.Content. _124_2_01232873640 _124_2_01232873640;
		public LicenseExpiredBanner.Content. AddLicenseBlock addLicenseBlock;

		public Content(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_120_2_1459707061 == null) _120_2_1459707061 = register(new _120_2_1459707061(box()).<_120_2_1459707061>id("a_323034790").owner(AbstractLicenseExpiredBanner.this));
			if (_124_2_01232873640 == null) _124_2_01232873640 = register(new _124_2_01232873640(box()).<_124_2_01232873640>id("a2044628204").owner(AbstractLicenseExpiredBanner.this));
			if (addLicenseBlock == null) addLicenseBlock = register(new AddLicenseBlock(box()).<AddLicenseBlock>id("a234311383").owner(AbstractLicenseExpiredBanner.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_120_2_1459707061 != null) _120_2_1459707061.unregister();
			if (_124_2_01232873640 != null) _124_2_01232873640.unregister();
			if (addLicenseBlock != null) addLicenseBlock.unregister();
		}

		public class _120_2_1459707061 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicenseExpiredBanner.Content._120_2_1459707061. _121_3_1517579453 _121_3_1517579453;
			public LicenseExpiredBanner.Content._120_2_1459707061. ExpirationInfo expirationInfo;
			public LicenseExpiredBanner.Content._120_2_1459707061. ExpirationMessage expirationMessage;

			public _120_2_1459707061(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_121_3_1517579453 == null) _121_3_1517579453 = register(new _121_3_1517579453(box()).<_121_3_1517579453>id("a_37264777").owner(AbstractLicenseExpiredBanner.this));
				if (expirationInfo == null) expirationInfo = register(new ExpirationInfo(box()).<ExpirationInfo>id("a907089029").owner(AbstractLicenseExpiredBanner.this));
				if (expirationMessage == null) expirationMessage = register(new ExpirationMessage(box()).<ExpirationMessage>id("a_1835356976").owner(AbstractLicenseExpiredBanner.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_121_3_1517579453 != null) _121_3_1517579453.unregister();
				if (expirationInfo != null) expirationInfo.unregister();
				if (expirationMessage != null) expirationMessage.unregister();
			}

			public class _121_3_1517579453 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LicenseExpiredBanner.Content._120_2_1459707061._121_3_1517579453. Bullet bullet;
				public LicenseExpiredBanner.Content._120_2_1459707061._121_3_1517579453. Title title;

				public _121_3_1517579453(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (bullet == null) bullet = register(new Bullet(box()).<Bullet>id("a386001800").owner(AbstractLicenseExpiredBanner.this));
					if (title == null) title = register(new Title(box()).<Title>id("a860009234").owner(AbstractLicenseExpiredBanner.this));
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

			public class ExpirationMessage extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public ExpirationMessage(B box) {
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

		public class _124_2_01232873640 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicenseExpiredBanner.Content._124_2_01232873640. RenewLicense renewLicense;

			public _124_2_01232873640(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (renewLicense == null) renewLicense = register(new RenewLicense(box()).<RenewLicense>id("a301687544").owner(AbstractLicenseExpiredBanner.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (renewLicense != null) renewLicense.unregister();
			}

			public class RenewLicense extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public RenewLicense(B box) {
					super(box);
					_title("Renew");
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

		public class AddLicenseBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public AddLicenseEditor addLicenseEditor;

			public AddLicenseBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (addLicenseEditor == null) addLicenseEditor = AbstractLicenseExpiredBanner.this.addLicenseEditor = register(new AddLicenseEditor((EditorBox)box()).id("a_1443045803"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (addLicenseEditor != null) addLicenseEditor.unregister();
			}
		}
	}
}