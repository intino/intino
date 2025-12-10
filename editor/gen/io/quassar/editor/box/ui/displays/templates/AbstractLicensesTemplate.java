package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLicensesTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public CopyTrigger copyTrigger;
	public _52_1_01878945893 _52_1_01878945893;
	public LicensesTemplate._52_1_01878945893. _53_2_1203003158 _53_2_1203003158;
	public LicensesTemplate._52_1_01878945893._53_2_1203003158. AddLicensesTrigger addLicensesTrigger;
	public LicensesTemplate._52_1_01878945893._53_2_1203003158. RevokeLicenseTrigger revokeLicenseTrigger;
	public LicensesTemplate._52_1_01878945893. _56_2_169064756 _56_2_169064756;
	public LicensesTemplate._52_1_01878945893._56_2_169064756. SearchBox searchBox;
	public NoItemsMessage noItemsMessage;
	public BodyBlock bodyBlock;
	public LicensesTemplate.BodyBlock. ContentBlock contentBlock;
	public LicensesTemplate.BodyBlock.ContentBlock. LicensesGrid licensesGrid;
	public AddLicensesDialog addLicensesDialog;
	public LicensesTemplate.AddLicensesDialog. _75_8_01803829488 _75_8_01803829488;
	public LicensesTemplate.AddLicensesDialog._75_8_01803829488. _76_9_1454218281 _76_9_1454218281;
	public LicensesTemplate.AddLicensesDialog._75_8_01803829488._76_9_1454218281. Message message;
	public LicensesTemplate.AddLicensesDialog._75_8_01803829488._76_9_1454218281. BuyMore buyMore;
	public LicensesTemplate.AddLicensesDialog._75_8_01803829488._76_9_1454218281. Hint hint;
	public LicensesTemplate.AddLicensesDialog._75_8_01803829488. _80_6_11867934453 _80_6_11867934453;
	public LicensesTemplate.AddLicensesDialog._75_8_01803829488._80_6_11867934453. CountField countField;
	public LicensesTemplate.AddLicensesDialog._75_8_01803829488._80_6_11867934453. DurationField durationField;
	public LicensesTemplate.AddLicensesDialog. _83_2_1955995399 _83_2_1955995399;
	public LicensesTemplate.AddLicensesDialog. _84_8_11406594985 _84_8_11406594985;
	public LicensesTemplate.AddLicensesDialog._84_8_11406594985. _85_12_01236794927 _85_12_01236794927;
	public LicensesTemplate.AddLicensesDialog._84_8_11406594985. AddLicenses addLicenses;
	public RevokeLicenseDialog revokeLicenseDialog;
	public LicensesTemplate.RevokeLicenseDialog. _89_8_11694633435 _89_8_11694633435;
	public LicensesTemplate.RevokeLicenseDialog._89_8_11694633435. _90_9_01426012055 _90_9_01426012055;
	public LicensesTemplate.RevokeLicenseDialog._89_8_11694633435._90_9_01426012055. _91_4_1782436053 _91_4_1782436053;
	public LicensesTemplate.RevokeLicenseDialog._89_8_11694633435._90_9_01426012055. RevokeField revokeField;
	public LicensesTemplate.RevokeLicenseDialog._89_8_11694633435._90_9_01426012055. LicenseBlock licenseBlock;
	public LicenseItemTemplate licenseStamp;
	public LicensesTemplate.RevokeLicenseDialog. _95_2_1955995399 _95_2_1955995399;
	public LicensesTemplate.RevokeLicenseDialog. _96_8_01884547409 _96_8_01884547409;
	public LicensesTemplate.RevokeLicenseDialog._96_8_01884547409. _97_12_1658129369 _97_12_1658129369;
	public LicensesTemplate.RevokeLicenseDialog._96_8_01884547409. Revoke revoke;

	public AbstractLicensesTemplate(B box) {
		super(box);
		id("licensesTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (copyTrigger == null) copyTrigger = register(new CopyTrigger(box()).<CopyTrigger>id("a_438711409").owner(AbstractLicensesTemplate.this));
		if (_52_1_01878945893 == null) _52_1_01878945893 = register(new _52_1_01878945893(box()).<_52_1_01878945893>id("a333050699").owner(AbstractLicensesTemplate.this));
		if (_52_1_01878945893 != null) _53_2_1203003158 = _52_1_01878945893._53_2_1203003158;
		if (_53_2_1203003158 != null) addLicensesTrigger = _52_1_01878945893._53_2_1203003158.addLicensesTrigger;
		if (_53_2_1203003158 != null) revokeLicenseTrigger = _52_1_01878945893._53_2_1203003158.revokeLicenseTrigger;
		if (_52_1_01878945893 != null) _56_2_169064756 = _52_1_01878945893._56_2_169064756;
		if (_56_2_169064756 != null) searchBox = _52_1_01878945893._56_2_169064756.searchBox;
		if (noItemsMessage == null) noItemsMessage = register(new NoItemsMessage(box()).<NoItemsMessage>id("a_1671370244").owner(AbstractLicensesTemplate.this));
		if (bodyBlock == null) bodyBlock = register(new BodyBlock(box()).<BodyBlock>id("a_1114599913").owner(AbstractLicensesTemplate.this));
		if (bodyBlock != null) contentBlock = bodyBlock.contentBlock;
		if (contentBlock != null) licensesGrid = bodyBlock.contentBlock.licensesGrid;
		if (addLicensesDialog == null) addLicensesDialog = register(new AddLicensesDialog(box()).<AddLicensesDialog>id("a1504932167").owner(AbstractLicensesTemplate.this));
		if (addLicensesDialog != null) _75_8_01803829488 = addLicensesDialog._75_8_01803829488;
		if (_75_8_01803829488 != null) _76_9_1454218281 = addLicensesDialog._75_8_01803829488._76_9_1454218281;
		if (_76_9_1454218281 != null) message = addLicensesDialog._75_8_01803829488._76_9_1454218281.message;
		if (_76_9_1454218281 != null) buyMore = addLicensesDialog._75_8_01803829488._76_9_1454218281.buyMore;
		if (_76_9_1454218281 != null) hint = addLicensesDialog._75_8_01803829488._76_9_1454218281.hint;
		if (_75_8_01803829488 != null) _80_6_11867934453 = addLicensesDialog._75_8_01803829488._80_6_11867934453;
		if (_80_6_11867934453 != null) countField = addLicensesDialog._75_8_01803829488._80_6_11867934453.countField;
		if (_80_6_11867934453 != null) durationField = addLicensesDialog._75_8_01803829488._80_6_11867934453.durationField;
		if (addLicensesDialog != null) _83_2_1955995399 = addLicensesDialog._83_2_1955995399;
		if (addLicensesDialog != null) _84_8_11406594985 = addLicensesDialog._84_8_11406594985;
		if (_84_8_11406594985 != null) _85_12_01236794927 = addLicensesDialog._84_8_11406594985._85_12_01236794927;
		if (_84_8_11406594985 != null) addLicenses = addLicensesDialog._84_8_11406594985.addLicenses;
		if (revokeLicenseDialog == null) revokeLicenseDialog = register(new RevokeLicenseDialog(box()).<RevokeLicenseDialog>id("a_1979710705").owner(AbstractLicensesTemplate.this));
		if (revokeLicenseDialog != null) _89_8_11694633435 = revokeLicenseDialog._89_8_11694633435;
		if (_89_8_11694633435 != null) _90_9_01426012055 = revokeLicenseDialog._89_8_11694633435._90_9_01426012055;
		if (_90_9_01426012055 != null) _91_4_1782436053 = revokeLicenseDialog._89_8_11694633435._90_9_01426012055._91_4_1782436053;
		if (_90_9_01426012055 != null) revokeField = revokeLicenseDialog._89_8_11694633435._90_9_01426012055.revokeField;
		if (_90_9_01426012055 != null) licenseBlock = revokeLicenseDialog._89_8_11694633435._90_9_01426012055.licenseBlock;
		if (licenseBlock != null) licenseStamp = revokeLicenseDialog._89_8_11694633435._90_9_01426012055.licenseBlock.licenseStamp;
		if (revokeLicenseDialog != null) _95_2_1955995399 = revokeLicenseDialog._95_2_1955995399;
		if (revokeLicenseDialog != null) _96_8_01884547409 = revokeLicenseDialog._96_8_01884547409;
		if (_96_8_01884547409 != null) _97_12_1658129369 = revokeLicenseDialog._96_8_01884547409._97_12_1658129369;
		if (_96_8_01884547409 != null) revoke = revokeLicenseDialog._96_8_01884547409.revoke;


		if (addLicensesTrigger != null) addLicensesTrigger.bindTo(addLicensesDialog);
		if (revokeLicenseTrigger != null) revokeLicenseTrigger.bindTo(revokeLicenseDialog);


		if (_85_12_01236794927 != null) _85_12_01236794927.bindTo(addLicensesDialog);


		if (_97_12_1658129369 != null) _97_12_1658129369.bindTo(revokeLicenseDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (copyTrigger != null) copyTrigger.unregister();
		if (_52_1_01878945893 != null) _52_1_01878945893.unregister();
		if (noItemsMessage != null) noItemsMessage.unregister();
		if (bodyBlock != null) bodyBlock.unregister();
		if (addLicensesDialog != null) addLicensesDialog.unregister();
		if (revokeLicenseDialog != null) revokeLicenseDialog.unregister();
	}

	public class CopyTrigger extends io.intino.alexandria.ui.displays.components.CopyToClipboard<io.intino.alexandria.ui.displays.notifiers.CopyToClipboardNotifier, B>  {

		public CopyTrigger(B box) {
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

	public class _52_1_01878945893 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LicensesTemplate._52_1_01878945893. _53_2_1203003158 _53_2_1203003158;
		public LicensesTemplate._52_1_01878945893. _56_2_169064756 _56_2_169064756;

		public _52_1_01878945893(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_53_2_1203003158 == null) _53_2_1203003158 = register(new _53_2_1203003158(box()).<_53_2_1203003158>id("a1991837754").owner(AbstractLicensesTemplate.this));
			if (_56_2_169064756 == null) _56_2_169064756 = register(new _56_2_169064756(box()).<_56_2_169064756>id("a_2008895444").owner(AbstractLicensesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_53_2_1203003158 != null) _53_2_1203003158.unregister();
			if (_56_2_169064756 != null) _56_2_169064756.unregister();
		}

		public class _53_2_1203003158 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicensesTemplate._52_1_01878945893._53_2_1203003158. AddLicensesTrigger addLicensesTrigger;
			public LicensesTemplate._52_1_01878945893._53_2_1203003158. RevokeLicenseTrigger revokeLicenseTrigger;

			public _53_2_1203003158(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (addLicensesTrigger == null) addLicensesTrigger = register(new AddLicensesTrigger(box()).<AddLicensesTrigger>id("a_1632977527").owner(AbstractLicensesTemplate.this));
				if (revokeLicenseTrigger == null) revokeLicenseTrigger = register(new RevokeLicenseTrigger(box()).<RevokeLicenseTrigger>id("a_1865865023").owner(AbstractLicensesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (addLicensesTrigger != null) addLicensesTrigger.unregister();
				if (revokeLicenseTrigger != null) revokeLicenseTrigger.unregister();
			}

			public class AddLicensesTrigger extends io.intino.alexandria.ui.displays.components.OpenDialog<io.intino.alexandria.ui.displays.notifiers.OpenDialogNotifier, B>  {

				public AddLicensesTrigger(B box) {
					super(box);
					_title("Add...");
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

			public class RevokeLicenseTrigger extends io.intino.alexandria.ui.displays.components.OpenDialog<io.intino.alexandria.ui.displays.notifiers.OpenDialogNotifier, B>  {

				public RevokeLicenseTrigger(B box) {
					super(box);
					_title("Revoke...");
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

		public class _56_2_169064756 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicensesTemplate._52_1_01878945893._56_2_169064756. SearchBox searchBox;

			public _56_2_169064756(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (searchBox == null) searchBox = register(new SearchBox(box()).<SearchBox>id("a1360832162").owner(AbstractLicensesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (searchBox != null) searchBox.unregister();
			}

			public class SearchBox extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

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

	public class NoItemsMessage extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

		public NoItemsMessage(B box) {
			super(box);
			_value("There are no licenses in this collection");
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

	public class BodyBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LicensesTemplate.BodyBlock. ContentBlock contentBlock;

		public BodyBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a_808764228").owner(AbstractLicensesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (contentBlock != null) contentBlock.unregister();
		}

		public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicensesTemplate.BodyBlock.ContentBlock. LicensesGrid licensesGrid;

			public ContentBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (licensesGrid == null) licensesGrid = register(new LicensesGrid(box()).<LicensesGrid>id("a804866395").owner(AbstractLicensesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (licensesGrid != null) licensesGrid.unregister();
			}

			public class LicensesGrid extends io.intino.alexandria.ui.displays.components.Grid<io.intino.alexandria.ui.displays.notifiers.GridNotifier, B, io.quassar.editor.model.License>  {

				public LicensesGrid(B box) {
					super(box);

					_add(new io.intino.alexandria.ui.model.datasource.grid.GridColumn<io.quassar.editor.model.License>().name("code").label("Code").type(io.intino.alexandria.ui.model.datasource.grid.GridColumn.Type.Text).sortable(true));
					_add(new io.intino.alexandria.ui.model.datasource.grid.GridColumn<io.quassar.editor.model.License>().name("creationDate").label("Creation date").type(io.intino.alexandria.ui.model.datasource.grid.GridColumn.Type.Date).sortable(true).pattern("YYYY-MM-dd HH:mm:ss"));
					_add(new io.intino.alexandria.ui.model.datasource.grid.GridColumn<io.quassar.editor.model.License>().name("duration").label("Duration (months)").type(io.intino.alexandria.ui.model.datasource.grid.GridColumn.Type.Number).sortable(true));
					_add(new io.intino.alexandria.ui.model.datasource.grid.GridColumn<io.quassar.editor.model.License>().name("status").label("Status").type(io.intino.alexandria.ui.model.datasource.grid.GridColumn.Type.Text).sortable(true));
					_add(new io.intino.alexandria.ui.model.datasource.grid.GridColumn<io.quassar.editor.model.License>().name("user").label("Assigned user").type(io.intino.alexandria.ui.model.datasource.grid.GridColumn.Type.Text).sortable(true));
					_add(new io.intino.alexandria.ui.model.datasource.grid.GridColumn<io.quassar.editor.model.License>().name("assignmentDate").label("Assignment date").type(io.intino.alexandria.ui.model.datasource.grid.GridColumn.Type.Date).sortable(true).pattern("YYYY-MM-dd HH:mm:ss"));
					_add(new io.intino.alexandria.ui.model.datasource.grid.GridColumn<io.quassar.editor.model.License>().name("expirationDate").label("Expiration date").type(io.intino.alexandria.ui.model.datasource.grid.GridColumn.Type.Date).sortable(true).pattern("YYYY-MM-dd HH:mm:ss"));
					_pageSize(30);
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

	public class AddLicensesDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public LicensesTemplate.AddLicensesDialog. _75_8_01803829488 _75_8_01803829488;
		public LicensesTemplate.AddLicensesDialog. _83_2_1955995399 _83_2_1955995399;
		public LicensesTemplate.AddLicensesDialog. _84_8_11406594985 _84_8_11406594985;

		public AddLicensesDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_75_8_01803829488 == null) _75_8_01803829488 = register(new _75_8_01803829488(box()).<_75_8_01803829488>id("a_6866770").owner(AbstractLicensesTemplate.this));
			if (_83_2_1955995399 == null) _83_2_1955995399 = register(new _83_2_1955995399(box()).<_83_2_1955995399>id("a_91237168").owner(AbstractLicensesTemplate.this));
			if (_84_8_11406594985 == null) _84_8_11406594985 = register(new _84_8_11406594985(box()).<_84_8_11406594985>id("a1695890525").owner(AbstractLicensesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_75_8_01803829488 != null) _75_8_01803829488.unregister();
			if (_83_2_1955995399 != null) _83_2_1955995399.unregister();
			if (_84_8_11406594985 != null) _84_8_11406594985.unregister();
		}

		public class _75_8_01803829488 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicensesTemplate.AddLicensesDialog._75_8_01803829488. _76_9_1454218281 _76_9_1454218281;
			public LicensesTemplate.AddLicensesDialog._75_8_01803829488. _80_6_11867934453 _80_6_11867934453;

			public _75_8_01803829488(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_76_9_1454218281 == null) _76_9_1454218281 = register(new _76_9_1454218281(box()).<_76_9_1454218281>id("a_1639421831").owner(AbstractLicensesTemplate.this));
				if (_80_6_11867934453 == null) _80_6_11867934453 = register(new _80_6_11867934453(box()).<_80_6_11867934453>id("a_348350206").owner(AbstractLicensesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_76_9_1454218281 != null) _76_9_1454218281.unregister();
				if (_80_6_11867934453 != null) _80_6_11867934453.unregister();
			}

			public class _76_9_1454218281 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LicensesTemplate.AddLicensesDialog._75_8_01803829488._76_9_1454218281. Message message;
				public LicensesTemplate.AddLicensesDialog._75_8_01803829488._76_9_1454218281. BuyMore buyMore;
				public LicensesTemplate.AddLicensesDialog._75_8_01803829488._76_9_1454218281. Hint hint;

				public _76_9_1454218281(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (message == null) message = register(new Message(box()).<Message>id("a663254827").owner(AbstractLicensesTemplate.this));
					if (buyMore == null) buyMore = register(new BuyMore(box()).<BuyMore>id("a_46861793").owner(AbstractLicensesTemplate.this));
					if (hint == null) hint = register(new Hint(box()).<Hint>id("a_437823005").owner(AbstractLicensesTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (message != null) message.unregister();
					if (buyMore != null) buyMore.unregister();
					if (hint != null) hint.unregister();
				}

				public class Message extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public Message(B box) {
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

				public class BuyMore extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public BuyMore(B box) {
						super(box);
						_title("buy more");
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

				public class Hint extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public Hint(B box) {
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

			public class _80_6_11867934453 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LicensesTemplate.AddLicensesDialog._75_8_01803829488._80_6_11867934453. CountField countField;
				public LicensesTemplate.AddLicensesDialog._75_8_01803829488._80_6_11867934453. DurationField durationField;

				public _80_6_11867934453(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (countField == null) countField = register(new CountField(box()).<CountField>id("a_1629030415").owner(AbstractLicensesTemplate.this));
					if (durationField == null) durationField = register(new DurationField(box()).<DurationField>id("a348764992").owner(AbstractLicensesTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (countField != null) countField.unregister();
					if (durationField != null) durationField.unregister();
				}

				public class CountField extends io.intino.alexandria.ui.displays.components.NumberEditable<io.intino.alexandria.ui.displays.notifiers.NumberEditableNotifier, B>  {

					public CountField(B box) {
						super(box);
						label("Count licenses to add");
						_value(1.0);
						_min(1.0);
						_max(-1.0);
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

				public class DurationField extends io.intino.alexandria.ui.displays.components.NumberEditable<io.intino.alexandria.ui.displays.notifiers.NumberEditableNotifier, B>  {

					public DurationField(B box) {
						super(box);
						label("Duration for licenses");
						_value(1.0);
						_min(1.0);
						_max(-1.0);
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

		public class _83_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _83_2_1955995399(B box) {
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

		public class _84_8_11406594985 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicensesTemplate.AddLicensesDialog._84_8_11406594985. _85_12_01236794927 _85_12_01236794927;
			public LicensesTemplate.AddLicensesDialog._84_8_11406594985. AddLicenses addLicenses;

			public _84_8_11406594985(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_85_12_01236794927 == null) _85_12_01236794927 = register(new _85_12_01236794927(box()).<_85_12_01236794927>id("a_397125435").owner(AbstractLicensesTemplate.this));
				if (addLicenses == null) addLicenses = register(new AddLicenses(box()).<AddLicenses>id("a543881235").owner(AbstractLicensesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_85_12_01236794927 != null) _85_12_01236794927.unregister();
				if (addLicenses != null) addLicenses.unregister();
			}

			public class _85_12_01236794927 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _85_12_01236794927(B box) {
					super(box);
					_title("Cancel");
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

			public class AddLicenses extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public AddLicenses(B box) {
					super(box);
					_title("Add");
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

	public class RevokeLicenseDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public LicensesTemplate.RevokeLicenseDialog. _89_8_11694633435 _89_8_11694633435;
		public LicensesTemplate.RevokeLicenseDialog. _95_2_1955995399 _95_2_1955995399;
		public LicensesTemplate.RevokeLicenseDialog. _96_8_01884547409 _96_8_01884547409;

		public RevokeLicenseDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_89_8_11694633435 == null) _89_8_11694633435 = register(new _89_8_11694633435(box()).<_89_8_11694633435>id("a_248791397").owner(AbstractLicensesTemplate.this));
			if (_95_2_1955995399 == null) _95_2_1955995399 = register(new _95_2_1955995399(box()).<_95_2_1955995399>id("a1013385607").owner(AbstractLicensesTemplate.this));
			if (_96_8_01884547409 == null) _96_8_01884547409 = register(new _96_8_01884547409(box()).<_96_8_01884547409>id("a_280400866").owner(AbstractLicensesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_89_8_11694633435 != null) _89_8_11694633435.unregister();
			if (_95_2_1955995399 != null) _95_2_1955995399.unregister();
			if (_96_8_01884547409 != null) _96_8_01884547409.unregister();
		}

		public class _89_8_11694633435 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicensesTemplate.RevokeLicenseDialog._89_8_11694633435. _90_9_01426012055 _90_9_01426012055;

			public _89_8_11694633435(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_90_9_01426012055 == null) _90_9_01426012055 = register(new _90_9_01426012055(box()).<_90_9_01426012055>id("a_2023294676").owner(AbstractLicensesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_90_9_01426012055 != null) _90_9_01426012055.unregister();
			}

			public class _90_9_01426012055 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LicensesTemplate.RevokeLicenseDialog._89_8_11694633435._90_9_01426012055. _91_4_1782436053 _91_4_1782436053;
				public LicensesTemplate.RevokeLicenseDialog._89_8_11694633435._90_9_01426012055. RevokeField revokeField;
				public LicensesTemplate.RevokeLicenseDialog._89_8_11694633435._90_9_01426012055. LicenseBlock licenseBlock;

				public _90_9_01426012055(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_91_4_1782436053 == null) _91_4_1782436053 = register(new _91_4_1782436053(box()).<_91_4_1782436053>id("a_1477051378").owner(AbstractLicensesTemplate.this));
					if (revokeField == null) revokeField = register(new RevokeField(box()).<RevokeField>id("a1822640496").owner(AbstractLicensesTemplate.this));
					if (licenseBlock == null) licenseBlock = register(new LicenseBlock(box()).<LicenseBlock>id("a_1341277968").owner(AbstractLicensesTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_91_4_1782436053 != null) _91_4_1782436053.unregister();
					if (revokeField != null) revokeField.unregister();
					if (licenseBlock != null) licenseBlock.unregister();
				}

				public class _91_4_1782436053 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _91_4_1782436053(B box) {
						super(box);
						_value("To proceed with revocation, please provide the license code you wish to revoke");
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

				public class RevokeField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

					public RevokeField(B box) {
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

				public class LicenseBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LicenseItemTemplate licenseStamp;

					public LicenseBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (licenseStamp == null) licenseStamp = AbstractLicensesTemplate.this.licenseStamp = register(new LicenseItemTemplate((EditorBox)box()).id("a_1744926991"));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (licenseStamp != null) licenseStamp.unregister();
					}
				}
			}
		}

		public class _95_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _95_2_1955995399(B box) {
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

		public class _96_8_01884547409 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LicensesTemplate.RevokeLicenseDialog._96_8_01884547409. _97_12_1658129369 _97_12_1658129369;
			public LicensesTemplate.RevokeLicenseDialog._96_8_01884547409. Revoke revoke;

			public _96_8_01884547409(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_97_12_1658129369 == null) _97_12_1658129369 = register(new _97_12_1658129369(box()).<_97_12_1658129369>id("a_1333048317").owner(AbstractLicensesTemplate.this));
				if (revoke == null) revoke = register(new Revoke(box()).<Revoke>id("a_600024187").owner(AbstractLicensesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_97_12_1658129369 != null) _97_12_1658129369.unregister();
				if (revoke != null) revoke.unregister();
			}

			public class _97_12_1658129369 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _97_12_1658129369(B box) {
					super(box);
					_title("Cancel");
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

			public class Revoke extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Revoke(B box) {
					super(box);
					_title("Revoke");
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