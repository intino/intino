package io.quassar.editor.box.ui.displays.items;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.ItemNotifier;

public class ModelItem extends io.intino.alexandria.ui.displays.components.Item<ItemNotifier, io.quassar.editor.model.Model, EditorBox> {
	public _58_5_11348142575 _58_5_11348142575;
	public ModelItem._58_5_11348142575. Label label;
	public ModelItem._58_5_11348142575. SiteLabel siteLabel;
	public ModelItem._58_5_11348142575. EmbeddedLabel embeddedLabel;
	public ModelItem._58_5_11348142575. Description description;
	public ModelItem._58_5_11348142575. _63_6_1151170020 _63_6_1151170020;
	public ModelItem._58_5_11348142575._63_6_1151170020. Language language;
	public ModelItem._58_5_11348142575._63_6_1151170020. CreateDate createDate;
	public ModelItem._58_5_11348142575._63_6_1151170020. UpdateDate updateDate;
	public ModelItem._58_5_11348142575._63_6_1151170020. Owner owner;

	public ModelItem(EditorBox box) {
		super(box);
		id("a_1739246969");
	}

	@Override
	public void init() {
		super.init();
		if (_58_5_11348142575 == null) _58_5_11348142575 = register(new _58_5_11348142575(box()).<_58_5_11348142575>id("a_522054500").owner(ModelItem.this));
		if (_58_5_11348142575 != null) label = _58_5_11348142575.label;
		if (_58_5_11348142575 != null) siteLabel = _58_5_11348142575.siteLabel;
		if (_58_5_11348142575 != null) embeddedLabel = _58_5_11348142575.embeddedLabel;
		if (_58_5_11348142575 != null) description = _58_5_11348142575.description;
		if (_58_5_11348142575 != null) _63_6_1151170020 = _58_5_11348142575._63_6_1151170020;
		if (_63_6_1151170020 != null) language = _58_5_11348142575._63_6_1151170020.language;
		if (_63_6_1151170020 != null) createDate = _58_5_11348142575._63_6_1151170020.createDate;
		if (_63_6_1151170020 != null) updateDate = _58_5_11348142575._63_6_1151170020.updateDate;
		if (_63_6_1151170020 != null) owner = _58_5_11348142575._63_6_1151170020.owner;
	}

	@Override
	public void remove() {
		super.remove();
		if (_58_5_11348142575 != null) _58_5_11348142575.unregister();
	}

	public class _58_5_11348142575 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
		public ModelItem._58_5_11348142575. Label label;
		public ModelItem._58_5_11348142575. SiteLabel siteLabel;
		public ModelItem._58_5_11348142575. EmbeddedLabel embeddedLabel;
		public ModelItem._58_5_11348142575. Description description;
		public ModelItem._58_5_11348142575. _63_6_1151170020 _63_6_1151170020;

		public _58_5_11348142575(EditorBox box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (label == null) label = register(new Label(box()).<Label>id("a_954079837").owner(ModelItem.this));
			if (siteLabel == null) siteLabel = register(new SiteLabel(box()).<SiteLabel>id("a_165438692").owner(ModelItem.this));
			if (embeddedLabel == null) embeddedLabel = register(new EmbeddedLabel(box()).<EmbeddedLabel>id("a191283769").owner(ModelItem.this));
			if (description == null) description = register(new Description(box()).<Description>id("a_172627093").owner(ModelItem.this));
			if (_63_6_1151170020 == null) _63_6_1151170020 = register(new _63_6_1151170020(box()).<_63_6_1151170020>id("a456394941").owner(ModelItem.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (label != null) label.unregister();
			if (siteLabel != null) siteLabel.unregister();
			if (embeddedLabel != null) embeddedLabel.unregister();
			if (description != null) description.unregister();
			if (_63_6_1151170020 != null) _63_6_1151170020.unregister();
		}

		public class Label extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, EditorBox> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<Label> {

			public Label(EditorBox box) {
				super(box);
				_title("");
				_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
				_path("/models/:language/:model/:release");
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
			public Label address(java.util.function.Function<String, String> addressFromPathResolver) {
				address(addressFromPathResolver.apply(path()));
				return this;
			}
		}

		public class SiteLabel extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, EditorBox>  {

			public SiteLabel(EditorBox box) {
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

		public class EmbeddedLabel extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, EditorBox>  {

			public EmbeddedLabel(EditorBox box) {
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

		public class Description extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, EditorBox>  {

			public Description(EditorBox box) {
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

		public class _63_6_1151170020 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, EditorBox>  {
			public ModelItem._58_5_11348142575._63_6_1151170020. Language language;
			public ModelItem._58_5_11348142575._63_6_1151170020. CreateDate createDate;
			public ModelItem._58_5_11348142575._63_6_1151170020. UpdateDate updateDate;
			public ModelItem._58_5_11348142575._63_6_1151170020. Owner owner;

			public _63_6_1151170020(EditorBox box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (language == null) language = register(new Language(box()).<Language>id("a311572238").owner(ModelItem.this));
				if (createDate == null) createDate = register(new CreateDate(box()).<CreateDate>id("a318420224").owner(ModelItem.this));
				if (updateDate == null) updateDate = register(new UpdateDate(box()).<UpdateDate>id("a_1346724275").owner(ModelItem.this));
				if (owner == null) owner = register(new Owner(box()).<Owner>id("a187685565").owner(ModelItem.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (language != null) language.unregister();
				if (createDate != null) createDate.unregister();
				if (updateDate != null) updateDate.unregister();
				if (owner != null) owner.unregister();
			}

			public class Language extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, EditorBox>  {

				public Language(EditorBox box) {
					super(box);
					label("DSL");
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

			public class CreateDate extends io.intino.alexandria.ui.displays.components.Date<io.intino.alexandria.ui.displays.notifiers.DateNotifier, EditorBox>  {

				public CreateDate(EditorBox box) {
					super(box);
					label("Created");
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

			public class UpdateDate extends io.intino.alexandria.ui.displays.components.Date<io.intino.alexandria.ui.displays.notifiers.DateNotifier, EditorBox>  {

				public UpdateDate(EditorBox box) {
					super(box);
					label("Updated");
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

			public class Owner extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, EditorBox>  {

				public Owner(EditorBox box) {
					super(box);
					label("Created by");
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