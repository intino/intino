package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguagePropertiesTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public _226_1_0763711379 _226_1_0763711379;
	public LanguagePropertiesTemplate._226_1_0763711379. _227_2_11169130060 _227_2_11169130060;
	public LanguagePropertiesTemplate._226_1_0763711379. TitleField titleField;
	public _229_1_1449280025 _229_1_1449280025;
	public LanguagePropertiesTemplate._229_1_1449280025. _230_2_1842631349 _230_2_1842631349;
	public LanguagePropertiesTemplate._229_1_1449280025. DescriptionField descriptionField;
	public _232_1_0810929824 _232_1_0810929824;
	public LanguagePropertiesTemplate._232_1_0810929824. _233_2_01642237694 _233_2_01642237694;
	public LanguagePropertiesTemplate._232_1_0810929824. CitationField citationField;
	public LanguagePropertiesTemplate._232_1_0810929824. _235_2_0145526038 _235_2_0145526038;
	public LanguagePropertiesTemplate._232_1_0810929824. CitationLinkField citationLinkField;
	public _237_1_11701853322 _237_1_11701853322;
	public LanguagePropertiesTemplate._237_1_11701853322. _238_2_0457015533 _238_2_0457015533;
	public LanguagePropertiesTemplate._237_1_11701853322. LicenseField licenseField;
	public _241_1_12032797107 _241_1_12032797107;
	public LanguagePropertiesTemplate._241_1_12032797107. _242_2_1454754229 _242_2_1454754229;
	public LanguagePropertiesTemplate._241_1_12032797107. Tags tags;
	public LanguagePropertiesTemplate._241_1_12032797107. _244_2_020310709 _244_2_020310709;
	public LanguagePropertiesTemplate._241_1_12032797107._244_2_020310709. _244_44_11150901301 _244_44_11150901301;
	public AddTagDialog addTagDialog;
	public LanguagePropertiesTemplate.AddTagDialog. _247_8_1451262173 _247_8_1451262173;
	public LanguagePropertiesTemplate.AddTagDialog._247_8_1451262173. TagField tagField;
	public LanguagePropertiesTemplate.AddTagDialog. _249_2_1955995399 _249_2_1955995399;
	public LanguagePropertiesTemplate.AddTagDialog. _250_8_11377880648 _250_8_11377880648;
	public LanguagePropertiesTemplate.AddTagDialog._250_8_11377880648. _251_12_11458084889 _251_12_11458084889;
	public LanguagePropertiesTemplate.AddTagDialog._250_8_11377880648. AddTag addTag;

	public AbstractLanguagePropertiesTemplate(B box) {
		super(box);
		id("languagePropertiesTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (_226_1_0763711379 == null) _226_1_0763711379 = register(new _226_1_0763711379(box()).<_226_1_0763711379>id("a_611170915").owner(AbstractLanguagePropertiesTemplate.this));
		if (_226_1_0763711379 != null) _227_2_11169130060 = _226_1_0763711379._227_2_11169130060;
		if (_226_1_0763711379 != null) titleField = _226_1_0763711379.titleField;
		if (_229_1_1449280025 == null) _229_1_1449280025 = register(new _229_1_1449280025(box()).<_229_1_1449280025>id("a505723273").owner(AbstractLanguagePropertiesTemplate.this));
		if (_229_1_1449280025 != null) _230_2_1842631349 = _229_1_1449280025._230_2_1842631349;
		if (_229_1_1449280025 != null) descriptionField = _229_1_1449280025.descriptionField;
		if (_232_1_0810929824 == null) _232_1_0810929824 = register(new _232_1_0810929824(box()).<_232_1_0810929824>id("a_1617042399").owner(AbstractLanguagePropertiesTemplate.this));
		if (_232_1_0810929824 != null) _233_2_01642237694 = _232_1_0810929824._233_2_01642237694;
		if (_232_1_0810929824 != null) citationField = _232_1_0810929824.citationField;
		if (_232_1_0810929824 != null) _235_2_0145526038 = _232_1_0810929824._235_2_0145526038;
		if (_232_1_0810929824 != null) citationLinkField = _232_1_0810929824.citationLinkField;
		if (_237_1_11701853322 == null) _237_1_11701853322 = register(new _237_1_11701853322(box()).<_237_1_11701853322>id("a_659193414").owner(AbstractLanguagePropertiesTemplate.this));
		if (_237_1_11701853322 != null) _238_2_0457015533 = _237_1_11701853322._238_2_0457015533;
		if (_237_1_11701853322 != null) licenseField = _237_1_11701853322.licenseField;
		if (_241_1_12032797107 == null) _241_1_12032797107 = register(new _241_1_12032797107(box()).<_241_1_12032797107>id("a_258188497").owner(AbstractLanguagePropertiesTemplate.this));
		if (_241_1_12032797107 != null) _242_2_1454754229 = _241_1_12032797107._242_2_1454754229;
		if (_241_1_12032797107 != null) tags = _241_1_12032797107.tags;
		if (_241_1_12032797107 != null) _244_2_020310709 = _241_1_12032797107._244_2_020310709;
		if (_244_2_020310709 != null) _244_44_11150901301 = _241_1_12032797107._244_2_020310709._244_44_11150901301;
		if (addTagDialog == null) addTagDialog = register(new AddTagDialog(box()).<AddTagDialog>id("a1922398812").owner(AbstractLanguagePropertiesTemplate.this));
		if (addTagDialog != null) _247_8_1451262173 = addTagDialog._247_8_1451262173;
		if (_247_8_1451262173 != null) tagField = addTagDialog._247_8_1451262173.tagField;
		if (addTagDialog != null) _249_2_1955995399 = addTagDialog._249_2_1955995399;
		if (addTagDialog != null) _250_8_11377880648 = addTagDialog._250_8_11377880648;
		if (_250_8_11377880648 != null) _251_12_11458084889 = addTagDialog._250_8_11377880648._251_12_11458084889;
		if (_250_8_11377880648 != null) addTag = addTagDialog._250_8_11377880648.addTag;


		if (_244_44_11150901301 != null) _244_44_11150901301.bindTo(addTagDialog);


		if (_251_12_11458084889 != null) _251_12_11458084889.bindTo(addTagDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (_226_1_0763711379 != null) _226_1_0763711379.unregister();
		if (_229_1_1449280025 != null) _229_1_1449280025.unregister();
		if (_232_1_0810929824 != null) _232_1_0810929824.unregister();
		if (_237_1_11701853322 != null) _237_1_11701853322.unregister();
		if (_241_1_12032797107 != null) _241_1_12032797107.unregister();
		if (addTagDialog != null) addTagDialog.unregister();
	}

	public class _226_1_0763711379 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagePropertiesTemplate._226_1_0763711379. _227_2_11169130060 _227_2_11169130060;
		public LanguagePropertiesTemplate._226_1_0763711379. TitleField titleField;

		public _226_1_0763711379(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_227_2_11169130060 == null) _227_2_11169130060 = register(new _227_2_11169130060(box()).<_227_2_11169130060>id("a_2088503977").owner(AbstractLanguagePropertiesTemplate.this));
			if (titleField == null) titleField = register(new TitleField(box()).<TitleField>id("a_1426896451").owner(AbstractLanguagePropertiesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_227_2_11169130060 != null) _227_2_11169130060.unregister();
			if (titleField != null) titleField.unregister();
		}

		public class _227_2_11169130060 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _227_2_11169130060(B box) {
				super(box);
				_value("Title");
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

		public class TitleField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

			public TitleField(B box) {
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

	public class _229_1_1449280025 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagePropertiesTemplate._229_1_1449280025. _230_2_1842631349 _230_2_1842631349;
		public LanguagePropertiesTemplate._229_1_1449280025. DescriptionField descriptionField;

		public _229_1_1449280025(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_230_2_1842631349 == null) _230_2_1842631349 = register(new _230_2_1842631349(box()).<_230_2_1842631349>id("a1621195821").owner(AbstractLanguagePropertiesTemplate.this));
			if (descriptionField == null) descriptionField = register(new DescriptionField(box()).<DescriptionField>id("a_87852682").owner(AbstractLanguagePropertiesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_230_2_1842631349 != null) _230_2_1842631349.unregister();
			if (descriptionField != null) descriptionField.unregister();
		}

		public class _230_2_1842631349 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _230_2_1842631349(B box) {
				super(box);
				_value("What is it");
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

		public class DescriptionField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

			public DescriptionField(B box) {
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

	public class _232_1_0810929824 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagePropertiesTemplate._232_1_0810929824. _233_2_01642237694 _233_2_01642237694;
		public LanguagePropertiesTemplate._232_1_0810929824. CitationField citationField;
		public LanguagePropertiesTemplate._232_1_0810929824. _235_2_0145526038 _235_2_0145526038;
		public LanguagePropertiesTemplate._232_1_0810929824. CitationLinkField citationLinkField;

		public _232_1_0810929824(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_233_2_01642237694 == null) _233_2_01642237694 = register(new _233_2_01642237694(box()).<_233_2_01642237694>id("a1037989589").owner(AbstractLanguagePropertiesTemplate.this));
			if (citationField == null) citationField = register(new CitationField(box()).<CitationField>id("a138024531").owner(AbstractLanguagePropertiesTemplate.this));
			if (_235_2_0145526038 == null) _235_2_0145526038 = register(new _235_2_0145526038(box()).<_235_2_0145526038>id("a_1827212715").owner(AbstractLanguagePropertiesTemplate.this));
			if (citationLinkField == null) citationLinkField = register(new CitationLinkField(box()).<CitationLinkField>id("a_396816903").owner(AbstractLanguagePropertiesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_233_2_01642237694 != null) _233_2_01642237694.unregister();
			if (citationField != null) citationField.unregister();
			if (_235_2_0145526038 != null) _235_2_0145526038.unregister();
			if (citationLinkField != null) citationLinkField.unregister();
		}

		public class _233_2_01642237694 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _233_2_01642237694(B box) {
				super(box);
				_value("How to cite");
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

		public class CitationField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

			public CitationField(B box) {
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

		public class _235_2_0145526038 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _235_2_0145526038(B box) {
				super(box);
				_value("Cite link");
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

		public class CitationLinkField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

			public CitationLinkField(B box) {
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

	public class _237_1_11701853322 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagePropertiesTemplate._237_1_11701853322. _238_2_0457015533 _238_2_0457015533;
		public LanguagePropertiesTemplate._237_1_11701853322. LicenseField licenseField;

		public _237_1_11701853322(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_238_2_0457015533 == null) _238_2_0457015533 = register(new _238_2_0457015533(box()).<_238_2_0457015533>id("a_40806688").owner(AbstractLanguagePropertiesTemplate.this));
			if (licenseField == null) licenseField = register(new LicenseField(box()).<LicenseField>id("a1410353812").owner(AbstractLanguagePropertiesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_238_2_0457015533 != null) _238_2_0457015533.unregister();
			if (licenseField != null) licenseField.unregister();
		}

		public class _238_2_0457015533 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _238_2_0457015533(B box) {
				super(box);
				_value("Copyright and license");
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

		public class LicenseField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

			public LicenseField(B box) {
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

	public class _241_1_12032797107 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguagePropertiesTemplate._241_1_12032797107. _242_2_1454754229 _242_2_1454754229;
		public LanguagePropertiesTemplate._241_1_12032797107. Tags tags;
		public LanguagePropertiesTemplate._241_1_12032797107. _244_2_020310709 _244_2_020310709;

		public _241_1_12032797107(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_242_2_1454754229 == null) _242_2_1454754229 = register(new _242_2_1454754229(box()).<_242_2_1454754229>id("a_1461024002").owner(AbstractLanguagePropertiesTemplate.this));
			if (tags == null) tags = AbstractLanguagePropertiesTemplate.this.tags = register(new Tags((EditorBox)box()).<Tags>id("a551534139").owner(AbstractLanguagePropertiesTemplate.this));
			if (_244_2_020310709 == null) _244_2_020310709 = register(new _244_2_020310709(box()).<_244_2_020310709>id("a1113261093").owner(AbstractLanguagePropertiesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_242_2_1454754229 != null) _242_2_1454754229.unregister();
			if (tags != null) tags.unregister();
			if (_244_2_020310709 != null) _244_2_020310709.unregister();
		}

		public class _242_2_1454754229 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _242_2_1454754229(B box) {
				super(box);
				_value("Tags");
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

		public class Tags extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,TagEditor, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,TagEditor, java.lang.Void> {

			public Tags(EditorBox box) {
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
			public TagEditor add(java.lang.Void value) {
				TagEditor child = new TagEditor(box());
				child.id(java.util.UUID.randomUUID().toString());
				add(child, "tags");
				notifyAdd(child);
				return child;
			}
			@Override
			public void remove(TagEditor child) {
				removeChild(child, "tags");
			}
			public void clear() {
				super.clear("tags");
			}
		}

		public class _244_2_020310709 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguagePropertiesTemplate._241_1_12032797107._244_2_020310709. _244_44_11150901301 _244_44_11150901301;

			public _244_2_020310709(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_244_44_11150901301 == null) _244_44_11150901301 = register(new _244_44_11150901301(box()).<_244_44_11150901301>id("a_1074573675").owner(AbstractLanguagePropertiesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_244_44_11150901301 != null) _244_44_11150901301.unregister();
			}

			public class _244_44_11150901301 extends io.intino.alexandria.ui.displays.components.OpenDialog<io.intino.alexandria.ui.displays.notifiers.OpenDialogNotifier, B>  {

				public _244_44_11150901301(B box) {
					super(box);
					_title("Add tag");
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

	public class AddTagDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public LanguagePropertiesTemplate.AddTagDialog. _247_8_1451262173 _247_8_1451262173;
		public LanguagePropertiesTemplate.AddTagDialog. _249_2_1955995399 _249_2_1955995399;
		public LanguagePropertiesTemplate.AddTagDialog. _250_8_11377880648 _250_8_11377880648;

		public AddTagDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_247_8_1451262173 == null) _247_8_1451262173 = register(new _247_8_1451262173(box()).<_247_8_1451262173>id("a_160882229").owner(AbstractLanguagePropertiesTemplate.this));
			if (_249_2_1955995399 == null) _249_2_1955995399 = register(new _249_2_1955995399(box()).<_249_2_1955995399>id("a1359447191").owner(AbstractLanguagePropertiesTemplate.this));
			if (_250_8_11377880648 == null) _250_8_11377880648 = register(new _250_8_11377880648(box()).<_250_8_11377880648>id("a_1184114616").owner(AbstractLanguagePropertiesTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_247_8_1451262173 != null) _247_8_1451262173.unregister();
			if (_249_2_1955995399 != null) _249_2_1955995399.unregister();
			if (_250_8_11377880648 != null) _250_8_11377880648.unregister();
		}

		public class _247_8_1451262173 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguagePropertiesTemplate.AddTagDialog._247_8_1451262173. TagField tagField;

			public _247_8_1451262173(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (tagField == null) tagField = register(new TagField(box()).<TagField>id("a_336379211").owner(AbstractLanguagePropertiesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (tagField != null) tagField.unregister();
			}

			public class TagField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

				public TagField(B box) {
					super(box);
					label("Tag");
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

		public class _249_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _249_2_1955995399(B box) {
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

		public class _250_8_11377880648 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguagePropertiesTemplate.AddTagDialog._250_8_11377880648. _251_12_11458084889 _251_12_11458084889;
			public LanguagePropertiesTemplate.AddTagDialog._250_8_11377880648. AddTag addTag;

			public _250_8_11377880648(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_251_12_11458084889 == null) _251_12_11458084889 = register(new _251_12_11458084889(box()).<_251_12_11458084889>id("a1563347545").owner(AbstractLanguagePropertiesTemplate.this));
				if (addTag == null) addTag = register(new AddTag(box()).<AddTag>id("a_1083636586").owner(AbstractLanguagePropertiesTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_251_12_11458084889 != null) _251_12_11458084889.unregister();
				if (addTag != null) addTag.unregister();
			}

			public class _251_12_11458084889 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _251_12_11458084889(B box) {
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

			public class AddTag extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public AddTag(B box) {
					super(box);
					_title("Accept");
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