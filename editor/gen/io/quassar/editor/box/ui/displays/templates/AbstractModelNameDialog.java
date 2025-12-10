package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelNameDialog<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public Dialog dialog;
	public ModelNameDialog.Dialog. _52_8_01587639853 _52_8_01587639853;
	public ModelNameDialog.Dialog._52_8_01587639853. TypeSelector typeSelector;
	public ModelNameDialog.Dialog._52_8_01587639853.TypeSelector. SimpleOption simpleOption;
	public ModelNameDialog.Dialog._52_8_01587639853.TypeSelector. QualifiedOption qualifiedOption;
	public ModelNameDialog.Dialog._52_8_01587639853. _57_3_1461645464 _57_3_1461645464;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464. SimpleNameBlock simpleNameBlock;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.SimpleNameBlock. NameField nameField;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464. QualifiedNameBlock qualifiedNameBlock;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock. QualifiedNameField qualifiedNameField;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock. _63_5_0235036658 _63_5_0235036658;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658. _64_6_02040323288 _64_6_02040323288;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._64_6_02040323288. _65_7_0567382917 _65_7_0567382917;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._64_6_02040323288. ProjectSelector projectSelector;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._64_6_02040323288. AddProjectLink addProjectLink;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658. _68_6_11917402186 _68_6_11917402186;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._68_6_11917402186. _69_7_11111279442 _69_7_11111279442;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._68_6_11917402186. ModuleSelector moduleSelector;
	public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._68_6_11917402186. AddModuleLink addModuleLink;
	public ModelNameDialog.Dialog. _72_2_1955995399 _72_2_1955995399;
	public ModelNameDialog.Dialog. _73_8_12107675048 _73_8_12107675048;
	public ModelNameDialog.Dialog._73_8_12107675048. _74_12_0857831584 _74_12_0857831584;
	public ModelNameDialog.Dialog._73_8_12107675048. Save save;
	public AddDialog addDialog;
	public ModelNameDialog.AddDialog. _78_8_0800705980 _78_8_0800705980;
	public ModelNameDialog.AddDialog._78_8_0800705980. AddField addField;
	public ModelNameDialog.AddDialog. _80_2_1955995399 _80_2_1955995399;
	public ModelNameDialog.AddDialog. _81_8_1948612749 _81_8_1948612749;
	public ModelNameDialog.AddDialog._81_8_1948612749. _82_12_01260030689 _82_12_01260030689;
	public ModelNameDialog.AddDialog._81_8_1948612749. Add add;

	public AbstractModelNameDialog(B box) {
		super(box);
		id("modelNameDialog");
	}

	@Override
	public void init() {
		super.init();
		if (dialog == null) dialog = register(new Dialog(box()).<Dialog>id("a_1590221238").owner(AbstractModelNameDialog.this));
		if (dialog != null) _52_8_01587639853 = dialog._52_8_01587639853;
		if (_52_8_01587639853 != null) typeSelector = dialog._52_8_01587639853.typeSelector;
		if (typeSelector != null) simpleOption = dialog._52_8_01587639853.typeSelector.simpleOption;
		if (typeSelector != null) qualifiedOption = dialog._52_8_01587639853.typeSelector.qualifiedOption;
		if (_52_8_01587639853 != null) _57_3_1461645464 = dialog._52_8_01587639853._57_3_1461645464;
		if (_57_3_1461645464 != null) simpleNameBlock = dialog._52_8_01587639853._57_3_1461645464.simpleNameBlock;
		if (simpleNameBlock != null) nameField = dialog._52_8_01587639853._57_3_1461645464.simpleNameBlock.nameField;
		if (_57_3_1461645464 != null) qualifiedNameBlock = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock;
		if (qualifiedNameBlock != null) qualifiedNameField = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock.qualifiedNameField;
		if (qualifiedNameBlock != null) _63_5_0235036658 = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658;
		if (_63_5_0235036658 != null) _64_6_02040323288 = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._64_6_02040323288;
		if (_64_6_02040323288 != null) _65_7_0567382917 = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._64_6_02040323288._65_7_0567382917;
		if (_64_6_02040323288 != null) projectSelector = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._64_6_02040323288.projectSelector;
		if (_64_6_02040323288 != null) addProjectLink = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._64_6_02040323288.addProjectLink;
		if (_63_5_0235036658 != null) _68_6_11917402186 = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._68_6_11917402186;
		if (_68_6_11917402186 != null) _69_7_11111279442 = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._68_6_11917402186._69_7_11111279442;
		if (_68_6_11917402186 != null) moduleSelector = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._68_6_11917402186.moduleSelector;
		if (_68_6_11917402186 != null) addModuleLink = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._68_6_11917402186.addModuleLink;
		if (dialog != null) _72_2_1955995399 = dialog._72_2_1955995399;
		if (dialog != null) _73_8_12107675048 = dialog._73_8_12107675048;
		if (_73_8_12107675048 != null) _74_12_0857831584 = dialog._73_8_12107675048._74_12_0857831584;
		if (_73_8_12107675048 != null) save = dialog._73_8_12107675048.save;
		if (addDialog == null) addDialog = register(new AddDialog(box()).<AddDialog>id("a1723385095").owner(AbstractModelNameDialog.this));
		if (addDialog != null) _78_8_0800705980 = addDialog._78_8_0800705980;
		if (_78_8_0800705980 != null) addField = addDialog._78_8_0800705980.addField;
		if (addDialog != null) _80_2_1955995399 = addDialog._80_2_1955995399;
		if (addDialog != null) _81_8_1948612749 = addDialog._81_8_1948612749;
		if (_81_8_1948612749 != null) _82_12_01260030689 = addDialog._81_8_1948612749._82_12_01260030689;
		if (_81_8_1948612749 != null) add = addDialog._81_8_1948612749.add;



		if (simpleNameBlock != null) simpleNameBlock.bindTo(typeSelector, "simpleOption");
		if (qualifiedNameBlock != null) qualifiedNameBlock.bindTo(typeSelector, "qualifiedOption");

		if (_74_12_0857831584 != null) _74_12_0857831584.bindTo(dialog);


		if (_82_12_01260030689 != null) _82_12_01260030689.bindTo(addDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (dialog != null) dialog.unregister();
		if (addDialog != null) addDialog.unregister();
	}

	public class Dialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public ModelNameDialog.Dialog. _52_8_01587639853 _52_8_01587639853;
		public ModelNameDialog.Dialog. _72_2_1955995399 _72_2_1955995399;
		public ModelNameDialog.Dialog. _73_8_12107675048 _73_8_12107675048;

		public Dialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_52_8_01587639853 == null) _52_8_01587639853 = register(new _52_8_01587639853(box()).<_52_8_01587639853>id("a_298167218").owner(AbstractModelNameDialog.this));
			if (_72_2_1955995399 == null) _72_2_1955995399 = register(new _72_2_1955995399(box()).<_72_2_1955995399>id("a_2142686643").owner(AbstractModelNameDialog.this));
			if (_73_8_12107675048 == null) _73_8_12107675048 = register(new _73_8_12107675048(box()).<_73_8_12107675048>id("a75688343").owner(AbstractModelNameDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_52_8_01587639853 != null) _52_8_01587639853.unregister();
			if (_72_2_1955995399 != null) _72_2_1955995399.unregister();
			if (_73_8_12107675048 != null) _73_8_12107675048.unregister();
		}

		public class _52_8_01587639853 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelNameDialog.Dialog._52_8_01587639853. TypeSelector typeSelector;
			public ModelNameDialog.Dialog._52_8_01587639853. _57_3_1461645464 _57_3_1461645464;

			public _52_8_01587639853(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (typeSelector == null) typeSelector = register(new TypeSelector(box()).<TypeSelector>id("a_227343287").owner(AbstractModelNameDialog.this));
				if (_57_3_1461645464 == null) _57_3_1461645464 = register(new _57_3_1461645464(box()).<_57_3_1461645464>id("a_610295341").owner(AbstractModelNameDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (typeSelector != null) typeSelector.unregister();
				if (_57_3_1461645464 != null) _57_3_1461645464.unregister();
			}

			public class TypeSelector extends io.intino.alexandria.ui.displays.components.SelectorRadioBox<io.intino.alexandria.ui.displays.notifiers.SelectorRadioBoxNotifier, B>  {
				public ModelNameDialog.Dialog._52_8_01587639853.TypeSelector. SimpleOption simpleOption;
				public ModelNameDialog.Dialog._52_8_01587639853.TypeSelector. QualifiedOption qualifiedOption;

				public TypeSelector(B box) {
					super(box);
					_multipleSelection(false);
				}

				@Override
				public void init() {
					super.init();
					if (simpleOption == null) simpleOption = register(new SimpleOption(box()).<SimpleOption>id("a_381321987").owner(AbstractModelNameDialog.this));
					if (qualifiedOption == null) qualifiedOption = register(new QualifiedOption(box()).<QualifiedOption>id("a_161339333").owner(AbstractModelNameDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (simpleOption != null) simpleOption.unregister();
					if (qualifiedOption != null) qualifiedOption.unregister();
				}

				public class SimpleOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

					public SimpleOption(B box) {
						super(box);

						name("simpleOption");
						_value("Simple name");
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

				public class QualifiedOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

					public QualifiedOption(B box) {
						super(box);

						name("qualifiedOption");
						_value("Qualified name");
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

			public class _57_3_1461645464 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464. SimpleNameBlock simpleNameBlock;
				public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464. QualifiedNameBlock qualifiedNameBlock;

				public _57_3_1461645464(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (simpleNameBlock == null) simpleNameBlock = register(new SimpleNameBlock(box()).<SimpleNameBlock>id("a414806240").owner(AbstractModelNameDialog.this));
					if (qualifiedNameBlock == null) qualifiedNameBlock = register(new QualifiedNameBlock(box()).<QualifiedNameBlock>id("a_1303496746").owner(AbstractModelNameDialog.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (simpleNameBlock != null) simpleNameBlock.unregister();
					if (qualifiedNameBlock != null) qualifiedNameBlock.unregister();
				}

				public class SimpleNameBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
					public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.SimpleNameBlock. NameField nameField;

					public SimpleNameBlock(B box) {
						super(box);
					}

					@Override
					public void initConditional() {
						super.init();
						if (nameField == null) nameField = register(new NameField(box()).<NameField>id("a_1959729008").owner(AbstractModelNameDialog.this));
						if (AbstractModelNameDialog.this.nameField == null) AbstractModelNameDialog.this.nameField = dialog._52_8_01587639853._57_3_1461645464.simpleNameBlock.nameField;
					}

					@Override
					public void unregister() {
						super.unregister();
						if (nameField != null) nameField.unregister();
					}

					public class NameField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

						public NameField(B box) {
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

				public class QualifiedNameBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
					public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock. QualifiedNameField qualifiedNameField;
					public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock. _63_5_0235036658 _63_5_0235036658;

					public QualifiedNameBlock(B box) {
						super(box);
					}

					@Override
					public void initConditional() {
						super.init();
						if (qualifiedNameField == null) qualifiedNameField = register(new QualifiedNameField(box()).<QualifiedNameField>id("a_655550724").owner(AbstractModelNameDialog.this));
						if (_63_5_0235036658 == null) _63_5_0235036658 = register(new _63_5_0235036658(box()).<_63_5_0235036658>id("a_849692064").owner(AbstractModelNameDialog.this));
						if (AbstractModelNameDialog.this.qualifiedNameField == null) AbstractModelNameDialog.this.qualifiedNameField = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock.qualifiedNameField;
						if (AbstractModelNameDialog.this._65_7_0567382917 == null) AbstractModelNameDialog.this._65_7_0567382917 = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._64_6_02040323288._65_7_0567382917;
						if (AbstractModelNameDialog.this.projectSelector == null) AbstractModelNameDialog.this.projectSelector = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._64_6_02040323288.projectSelector;
						if (AbstractModelNameDialog.this.addProjectLink == null) AbstractModelNameDialog.this.addProjectLink = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._64_6_02040323288.addProjectLink;
						if (AbstractModelNameDialog.this._69_7_11111279442 == null) AbstractModelNameDialog.this._69_7_11111279442 = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._68_6_11917402186._69_7_11111279442;
						if (AbstractModelNameDialog.this.moduleSelector == null) AbstractModelNameDialog.this.moduleSelector = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._68_6_11917402186.moduleSelector;
						if (AbstractModelNameDialog.this.addModuleLink == null) AbstractModelNameDialog.this.addModuleLink = dialog._52_8_01587639853._57_3_1461645464.qualifiedNameBlock._63_5_0235036658._68_6_11917402186.addModuleLink;
					}

					@Override
					public void unregister() {
						super.unregister();
						if (qualifiedNameField != null) qualifiedNameField.unregister();
						if (_63_5_0235036658 != null) _63_5_0235036658.unregister();
					}

					public class QualifiedNameField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

						public QualifiedNameField(B box) {
							super(box);

							_readonly(true);
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

					public class _63_5_0235036658 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658. _64_6_02040323288 _64_6_02040323288;
						public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658. _68_6_11917402186 _68_6_11917402186;

						public _63_5_0235036658(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_64_6_02040323288 == null) _64_6_02040323288 = register(new _64_6_02040323288(box()).<_64_6_02040323288>id("a1665738826").owner(AbstractModelNameDialog.this));
							if (_68_6_11917402186 == null) _68_6_11917402186 = register(new _68_6_11917402186(box()).<_68_6_11917402186>id("a_570801250").owner(AbstractModelNameDialog.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_64_6_02040323288 != null) _64_6_02040323288.unregister();
							if (_68_6_11917402186 != null) _68_6_11917402186.unregister();
						}

						public class _64_6_02040323288 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._64_6_02040323288. _65_7_0567382917 _65_7_0567382917;
							public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._64_6_02040323288. ProjectSelector projectSelector;
							public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._64_6_02040323288. AddProjectLink addProjectLink;

							public _64_6_02040323288(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (_65_7_0567382917 == null) _65_7_0567382917 = register(new _65_7_0567382917(box()).<_65_7_0567382917>id("a_1145579790").owner(AbstractModelNameDialog.this));
								if (projectSelector == null) projectSelector = register(new ProjectSelector(box()).<ProjectSelector>id("a_618838297").owner(AbstractModelNameDialog.this));
								if (addProjectLink == null) addProjectLink = register(new AddProjectLink(box()).<AddProjectLink>id("a1574979747").owner(AbstractModelNameDialog.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (_65_7_0567382917 != null) _65_7_0567382917.unregister();
								if (projectSelector != null) projectSelector.unregister();
								if (addProjectLink != null) addProjectLink.unregister();
							}

							public class _65_7_0567382917 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

								public _65_7_0567382917(B box) {
									super(box);
									_value("Project");
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

							public class ProjectSelector extends io.intino.alexandria.ui.displays.components.SelectorComboBox<io.intino.alexandria.ui.displays.notifiers.SelectorComboBoxNotifier, B>  {

								public ProjectSelector(B box) {
									super(box);
									_multipleSelection(false);
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

							public class AddProjectLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

								public AddProjectLink(B box) {
									super(box);
									_title("Add project");
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

						public class _68_6_11917402186 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._68_6_11917402186. _69_7_11111279442 _69_7_11111279442;
							public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._68_6_11917402186. ModuleSelector moduleSelector;
							public ModelNameDialog.Dialog._52_8_01587639853._57_3_1461645464.QualifiedNameBlock._63_5_0235036658._68_6_11917402186. AddModuleLink addModuleLink;

							public _68_6_11917402186(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (_69_7_11111279442 == null) _69_7_11111279442 = register(new _69_7_11111279442(box()).<_69_7_11111279442>id("a1349726909").owner(AbstractModelNameDialog.this));
								if (moduleSelector == null) moduleSelector = register(new ModuleSelector(box()).<ModuleSelector>id("a3094584").owner(AbstractModelNameDialog.this));
								if (addModuleLink == null) addModuleLink = register(new AddModuleLink(box()).<AddModuleLink>id("a_779378534").owner(AbstractModelNameDialog.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (_69_7_11111279442 != null) _69_7_11111279442.unregister();
								if (moduleSelector != null) moduleSelector.unregister();
								if (addModuleLink != null) addModuleLink.unregister();
							}

							public class _69_7_11111279442 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

								public _69_7_11111279442(B box) {
									super(box);
									_value("Module");
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

							public class ModuleSelector extends io.intino.alexandria.ui.displays.components.SelectorComboBox<io.intino.alexandria.ui.displays.notifiers.SelectorComboBoxNotifier, B>  {

								public ModuleSelector(B box) {
									super(box);
									_multipleSelection(false);
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

							public class AddModuleLink extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

								public AddModuleLink(B box) {
									super(box);
									_title("Add module");
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
			}
		}

		public class _72_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _72_2_1955995399(B box) {
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

		public class _73_8_12107675048 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelNameDialog.Dialog._73_8_12107675048. _74_12_0857831584 _74_12_0857831584;
			public ModelNameDialog.Dialog._73_8_12107675048. Save save;

			public _73_8_12107675048(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_74_12_0857831584 == null) _74_12_0857831584 = register(new _74_12_0857831584(box()).<_74_12_0857831584>id("a602299343").owner(AbstractModelNameDialog.this));
				if (save == null) save = register(new Save(box()).<Save>id("a53072750").owner(AbstractModelNameDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_74_12_0857831584 != null) _74_12_0857831584.unregister();
				if (save != null) save.unregister();
			}

			public class _74_12_0857831584 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _74_12_0857831584(B box) {
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

			public class Save extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Save(B box) {
					super(box);
					_title("Save");
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

	public class AddDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public ModelNameDialog.AddDialog. _78_8_0800705980 _78_8_0800705980;
		public ModelNameDialog.AddDialog. _80_2_1955995399 _80_2_1955995399;
		public ModelNameDialog.AddDialog. _81_8_1948612749 _81_8_1948612749;

		public AddDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_78_8_0800705980 == null) _78_8_0800705980 = register(new _78_8_0800705980(box()).<_78_8_0800705980>id("a1395427323").owner(AbstractModelNameDialog.this));
			if (_80_2_1955995399 == null) _80_2_1955995399 = register(new _80_2_1955995399(box()).<_80_2_1955995399>id("a206249011").owner(AbstractModelNameDialog.this));
			if (_81_8_1948612749 == null) _81_8_1948612749 = register(new _81_8_1948612749(box()).<_81_8_1948612749>id("a1301526103").owner(AbstractModelNameDialog.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_78_8_0800705980 != null) _78_8_0800705980.unregister();
			if (_80_2_1955995399 != null) _80_2_1955995399.unregister();
			if (_81_8_1948612749 != null) _81_8_1948612749.unregister();
		}

		public class _78_8_0800705980 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelNameDialog.AddDialog._78_8_0800705980. AddField addField;

			public _78_8_0800705980(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (addField == null) addField = register(new AddField(box()).<AddField>id("a1093755173").owner(AbstractModelNameDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (addField != null) addField.unregister();
			}

			public class AddField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

				public AddField(B box) {
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

		public class _80_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _80_2_1955995399(B box) {
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

		public class _81_8_1948612749 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelNameDialog.AddDialog._81_8_1948612749. _82_12_01260030689 _82_12_01260030689;
			public ModelNameDialog.AddDialog._81_8_1948612749. Add add;

			public _81_8_1948612749(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_82_12_01260030689 == null) _82_12_01260030689 = register(new _82_12_01260030689(box()).<_82_12_01260030689>id("a_1532341999").owner(AbstractModelNameDialog.this));
				if (add == null) add = register(new Add(box()).<Add>id("a_2108712211").owner(AbstractModelNameDialog.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_82_12_01260030689 != null) _82_12_01260030689.unregister();
				if (add != null) add.unregister();
			}

			public class _82_12_01260030689 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _82_12_01260030689(B box) {
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

			public class Add extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public Add(B box) {
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
}