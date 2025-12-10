package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelsDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public AddModelTrigger addModelTrigger;
	public CatalogOperations catalogOperations;
	public ModelsDialog.CatalogOperations. _274_2_11514354024 _274_2_11514354024;
	public ModelsDialog.CatalogOperations._274_2_11514354024. MostRecentLink mostRecentLink;
	public ModelsDialog.CatalogOperations._274_2_11514354024. MostRecentText mostRecentText;
	public ModelsDialog.CatalogOperations._274_2_11514354024. LastModifiedLink lastModifiedLink;
	public ModelsDialog.CatalogOperations._274_2_11514354024. LastModifiedText lastModifiedText;
	public ModelsDialog.CatalogOperations. _279_2_11395644215 _279_2_11395644215;
	public ModelsDialog.CatalogOperations._279_2_11395644215. SearchBox searchBox;
	public LicenseDialog licenseDialog;

	public AbstractModelsDialog(B box) {
		super(box);
		id("modelsDialog");
	}

	@Override
	public void init() {
		super.init();
		if (addModelTrigger == null) addModelTrigger = register(new AddModelTrigger(box()).<AddModelTrigger>id("a1143422850").owner(AbstractModelsDialog.this));
		if (catalogOperations == null) catalogOperations = register(new CatalogOperations(box()).<CatalogOperations>id("a_516985257").owner(AbstractModelsDialog.this));
		if (catalogOperations != null) _274_2_11514354024 = catalogOperations._274_2_11514354024;
		if (_274_2_11514354024 != null) mostRecentLink = catalogOperations._274_2_11514354024.mostRecentLink;
		if (_274_2_11514354024 != null) mostRecentText = catalogOperations._274_2_11514354024.mostRecentText;
		if (_274_2_11514354024 != null) lastModifiedLink = catalogOperations._274_2_11514354024.lastModifiedLink;
		if (_274_2_11514354024 != null) lastModifiedText = catalogOperations._274_2_11514354024.lastModifiedText;
		if (catalogOperations != null) _279_2_11395644215 = catalogOperations._279_2_11395644215;
		if (_279_2_11395644215 != null) searchBox = catalogOperations._279_2_11395644215.searchBox;
		if (licenseDialog == null) licenseDialog = register(new LicenseDialog((EditorBox)box()).id("a527624027"));
	}

	@Override
	public void remove() {
		super.remove();
		if (addModelTrigger != null) addModelTrigger.unregister();
		if (catalogOperations != null) catalogOperations.unregister();
		if (licenseDialog != null) licenseDialog.unregister();
	}

	public class AddModelTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

		public AddModelTrigger(B box) {
			super(box);
			_title("New");
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

	public class CatalogOperations extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelsDialog.CatalogOperations. _274_2_11514354024 _274_2_11514354024;
		public ModelsDialog.CatalogOperations. _279_2_11395644215 _279_2_11395644215;

		public CatalogOperations(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_274_2_11514354024 == null) _274_2_11514354024 = register(new _274_2_11514354024(box()).<_274_2_11514354024>id("a163170884").owner(AbstractModelsDialog.this));
			if (_279_2_11395644215 == null) _279_2_11395644215 = register(new _279_2_11395644215(box()).<_279_2_11395644215>id("a460987264").owner(AbstractModelsDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_274_2_11514354024 != null) _274_2_11514354024.unregister();
			if (_279_2_11395644215 != null) _279_2_11395644215.unregister();
		}

		public class _274_2_11514354024 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelsDialog.CatalogOperations._274_2_11514354024. MostRecentLink mostRecentLink;
			public ModelsDialog.CatalogOperations._274_2_11514354024. MostRecentText mostRecentText;
			public ModelsDialog.CatalogOperations._274_2_11514354024. LastModifiedLink lastModifiedLink;
			public ModelsDialog.CatalogOperations._274_2_11514354024. LastModifiedText lastModifiedText;

			public _274_2_11514354024(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (mostRecentLink == null) mostRecentLink = register(new MostRecentLink(box()).<MostRecentLink>id("a482684494").owner(AbstractModelsDialog.this));
				if (mostRecentText == null) mostRecentText = register(new MostRecentText(box()).<MostRecentText>id("a482919297").owner(AbstractModelsDialog.this));
				if (lastModifiedLink == null) lastModifiedLink = register(new LastModifiedLink(box()).<LastModifiedLink>id("a_908565489").owner(AbstractModelsDialog.this));
				if (lastModifiedText == null) lastModifiedText = register(new LastModifiedText(box()).<LastModifiedText>id("a_908330686").owner(AbstractModelsDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (mostRecentLink != null) mostRecentLink.unregister();
				if (mostRecentText != null) mostRecentText.unregister();
				if (lastModifiedLink != null) lastModifiedLink.unregister();
				if (lastModifiedText != null) lastModifiedText.unregister();
			}

			public class MostRecentLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public MostRecentLink(B box) {
					super(box);
					_title("most recent");
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

			public class MostRecentText extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public MostRecentText(B box) {
					super(box);
					_value("most recent");
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

			public class LastModifiedLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public LastModifiedLink(B box) {
					super(box);
					_title("last modified");
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

			public class LastModifiedText extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public LastModifiedText(B box) {
					super(box);
					_value("last modified");
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

		public class _279_2_11395644215 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelsDialog.CatalogOperations._279_2_11395644215. SearchBox searchBox;

			public _279_2_11395644215(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (searchBox == null) searchBox = register(new SearchBox(box()).<SearchBox>id("a_2106141614").owner(AbstractModelsDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (searchBox != null) searchBox.unregister();
			}

			public class SearchBox extends io.intino.alexandria.ui.displays.components.SearchBox<io.intino.alexandria.ui.displays.notifiers.SearchBoxNotifier, B>  {

				public SearchBox(B box) {
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