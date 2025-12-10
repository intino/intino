package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractUserHomeTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _65_1_01572067141 _65_1_01572067141;
	public UserHomeTemplate._65_1_01572067141. _66_2_11485799244 _66_2_11485799244;
	public UserHomeTemplate._65_1_01572067141. Licenses licenses;
	public UserHomeTemplate._65_1_01572067141. _68_2_01521766326 _68_2_01521766326;
	public AddLicenseEditor addLicenseEditor;
	public MyCollectionsBlock myCollectionsBlock;
	public UserHomeTemplate.MyCollectionsBlock. _71_2_01861582925 _71_2_01861582925;
	public UserHomeTemplate.MyCollectionsBlock. Collections collections;
	public RenewLicenseDialog renewLicenseDialog;

	public AbstractUserHomeTemplate(B box) {
		super(box);
		id("userHomeTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_65_1_01572067141 == null) _65_1_01572067141 = register(new _65_1_01572067141(box()).<_65_1_01572067141>id("a_813503583").owner(AbstractUserHomeTemplate.this));
		if (_65_1_01572067141 != null) _66_2_11485799244 = _65_1_01572067141._66_2_11485799244;
		if (_65_1_01572067141 != null) licenses = _65_1_01572067141.licenses;
		if (_65_1_01572067141 != null) _68_2_01521766326 = _65_1_01572067141._68_2_01521766326;
		if (_68_2_01521766326 != null) addLicenseEditor = _65_1_01572067141._68_2_01521766326.addLicenseEditor;
		if (myCollectionsBlock == null) myCollectionsBlock = register(new MyCollectionsBlock(box()).<MyCollectionsBlock>id("a_723869888").owner(AbstractUserHomeTemplate.this));
		if (myCollectionsBlock != null) _71_2_01861582925 = myCollectionsBlock._71_2_01861582925;
		if (myCollectionsBlock != null) collections = myCollectionsBlock.collections;
		if (renewLicenseDialog == null) renewLicenseDialog = register(new RenewLicenseDialog((EditorBox)box()).id("a_861131560"));
	}

	@Override
	public void remove() {
		super.remove();
		if (_65_1_01572067141 != null) _65_1_01572067141.unregister();
		if (myCollectionsBlock != null) myCollectionsBlock.unregister();
		if (renewLicenseDialog != null) renewLicenseDialog.unregister();
	}

	public class _65_1_01572067141 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public UserHomeTemplate._65_1_01572067141. _66_2_11485799244 _66_2_11485799244;
		public UserHomeTemplate._65_1_01572067141. Licenses licenses;
		public UserHomeTemplate._65_1_01572067141. _68_2_01521766326 _68_2_01521766326;

		public _65_1_01572067141(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_66_2_11485799244 == null) _66_2_11485799244 = register(new _66_2_11485799244(box()).<_66_2_11485799244>id("a_1321628900").owner(AbstractUserHomeTemplate.this));
			if (licenses == null) licenses = AbstractUserHomeTemplate.this.licenses = register(new Licenses((EditorBox)box()).<Licenses>id("a2049611701").owner(AbstractUserHomeTemplate.this));
			if (_68_2_01521766326 == null) _68_2_01521766326 = register(new _68_2_01521766326(box()).<_68_2_01521766326>id("a558137733").owner(AbstractUserHomeTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_66_2_11485799244 != null) _66_2_11485799244.unregister();
			if (licenses != null) licenses.unregister();
			if (_68_2_01521766326 != null) _68_2_01521766326.unregister();
		}

		public class _66_2_11485799244 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _66_2_11485799244(B box) {
				super(box);
				_value("My licenses");
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

		public class Licenses extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,LicenseItemTemplate, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,LicenseItemTemplate, java.lang.Void> {

			public Licenses(EditorBox box) {
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

			@Override
			public LicenseItemTemplate add(java.lang.Void value) {
				LicenseItemTemplate child = new LicenseItemTemplate(box());
				child.id(java.util.UUID.randomUUID().toString());
				add(child, "licenses");
				notifyAdd(child);
				return child;
			}
			@Override
			public void remove(LicenseItemTemplate child) {
				removeChild(child, "licenses");
			}
			public void clear() {
				super.clear("licenses");
			}
		}

		public class _68_2_01521766326 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public AddLicenseEditor addLicenseEditor;

			public _68_2_01521766326(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (addLicenseEditor == null) addLicenseEditor = AbstractUserHomeTemplate.this.addLicenseEditor = register(new AddLicenseEditor((EditorBox)box()).id("a743835532"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (addLicenseEditor != null) addLicenseEditor.unregister();
			}
		}
	}

	public class MyCollectionsBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public UserHomeTemplate.MyCollectionsBlock. _71_2_01861582925 _71_2_01861582925;
		public UserHomeTemplate.MyCollectionsBlock. Collections collections;

		public MyCollectionsBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_71_2_01861582925 == null) _71_2_01861582925 = register(new _71_2_01861582925(box()).<_71_2_01861582925>id("a_1626085459").owner(AbstractUserHomeTemplate.this));
			if (collections == null) collections = AbstractUserHomeTemplate.this.collections = register(new Collections((EditorBox)box()).<Collections>id("a_1458420970").owner(AbstractUserHomeTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_71_2_01861582925 != null) _71_2_01861582925.unregister();
			if (collections != null) collections.unregister();
		}

		public class _71_2_01861582925 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _71_2_01861582925(B box) {
				super(box);
				_value("My collections");
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

		public class Collections extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,CollectionItemTemplate, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,CollectionItemTemplate, java.lang.Void> {

			public Collections(EditorBox box) {
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

			@Override
			public CollectionItemTemplate add(java.lang.Void value) {
				CollectionItemTemplate child = new CollectionItemTemplate(box());
				child.id(java.util.UUID.randomUUID().toString());
				add(child, "collections");
				notifyAdd(child);
				return child;
			}
			@Override
			public void remove(CollectionItemTemplate child) {
				removeChild(child, "collections");
			}
			public void clear() {
				super.clear("collections");
			}
		}
	}
}