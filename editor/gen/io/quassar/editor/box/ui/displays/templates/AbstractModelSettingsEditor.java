package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelSettingsEditor<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public CloseTrigger closeTrigger;
	public SettingsTabSelector settingsTabSelector;
	public ModelSettingsEditor.SettingsTabSelector. GeneralOption generalOption;
	public ModelSettingsEditor.SettingsTabSelector. CollaboratorsOption collaboratorsOption;
	public _134_1_11683158081 _134_1_11683158081;
	public ModelSettingsEditor._134_1_11683158081. GeneralBlock generalBlock;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock. _136_3_0936979191 _136_3_0936979191;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._136_3_0936979191. _137_4_11811015619 _137_4_11811015619;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._136_3_0936979191. _138_4_11307115607 _138_4_11307115607;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._136_3_0936979191._138_4_11307115607. ModelNameField modelNameField;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._136_3_0936979191._138_4_11307115607. EditName editName;
	public ModelNameDialog nameDialog;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock. _142_3_01687044472 _142_3_01687044472;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._142_3_01687044472. _143_4_0623526552 _143_4_0623526552;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._142_3_01687044472. ModelDescriptionField modelDescriptionField;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock. _145_3_1928633540 _145_3_1928633540;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._145_3_1928633540. _146_4_11088809491 _146_4_11088809491;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._145_3_1928633540. LanguageName languageName;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._145_3_1928633540. LanguageSelector languageSelector;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock. AccessTypeBlock accessTypeBlock;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock.AccessTypeBlock. _150_4_1593504471 _150_4_1593504471;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock.AccessTypeBlock. AccessTypeField accessTypeField;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock. _152_3_01513742189 _152_3_01513742189;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._152_3_01513742189. _153_4_11929032495 _153_4_11929032495;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._152_3_01513742189. _154_4_02033272407 _154_4_02033272407;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._152_3_01513742189. _155_4_01064952083 _155_4_01064952083;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock._152_3_01513742189._155_4_01064952083. RemoveModel removeModel;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock. CloneModelBlock cloneModelBlock;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock.CloneModelBlock. _157_4_0157584084 _157_4_0157584084;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock.CloneModelBlock. _158_4_0612050351 _158_4_0612050351;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock.CloneModelBlock. _159_4_01643373222 _159_4_01643373222;
	public ModelSettingsEditor._134_1_11683158081.GeneralBlock.CloneModelBlock._159_4_01643373222. CloneModel cloneModel;
	public ModelSettingsEditor._134_1_11683158081. CollaboratorsBlock collaboratorsBlock;
	public CollaboratorsTemplate collaboratorsStamp;

	public AbstractModelSettingsEditor(B box) {
		super(box);
		id("modelSettingsEditor");
	}

	@Override
	public void init() {
		super.init();
		if (closeTrigger == null) closeTrigger = register(new CloseTrigger(box()).<CloseTrigger>id("a_1405844347").owner(AbstractModelSettingsEditor.this));
		if (settingsTabSelector == null) settingsTabSelector = register(new SettingsTabSelector(box()).<SettingsTabSelector>id("a_564796692").owner(AbstractModelSettingsEditor.this));
		if (settingsTabSelector != null) generalOption = settingsTabSelector.generalOption;
		if (settingsTabSelector != null) collaboratorsOption = settingsTabSelector.collaboratorsOption;
		if (_134_1_11683158081 == null) _134_1_11683158081 = register(new _134_1_11683158081(box()).<_134_1_11683158081>id("a1581016657").owner(AbstractModelSettingsEditor.this));
		if (_134_1_11683158081 != null) generalBlock = _134_1_11683158081.generalBlock;
		if (generalBlock != null) _136_3_0936979191 = _134_1_11683158081.generalBlock._136_3_0936979191;
		if (_136_3_0936979191 != null) _137_4_11811015619 = _134_1_11683158081.generalBlock._136_3_0936979191._137_4_11811015619;
		if (_136_3_0936979191 != null) _138_4_11307115607 = _134_1_11683158081.generalBlock._136_3_0936979191._138_4_11307115607;
		if (_138_4_11307115607 != null) modelNameField = _134_1_11683158081.generalBlock._136_3_0936979191._138_4_11307115607.modelNameField;
		if (_138_4_11307115607 != null) editName = _134_1_11683158081.generalBlock._136_3_0936979191._138_4_11307115607.editName;
		if (_138_4_11307115607 != null) nameDialog = _134_1_11683158081.generalBlock._136_3_0936979191._138_4_11307115607.nameDialog;
		if (generalBlock != null) _142_3_01687044472 = _134_1_11683158081.generalBlock._142_3_01687044472;
		if (_142_3_01687044472 != null) _143_4_0623526552 = _134_1_11683158081.generalBlock._142_3_01687044472._143_4_0623526552;
		if (_142_3_01687044472 != null) modelDescriptionField = _134_1_11683158081.generalBlock._142_3_01687044472.modelDescriptionField;
		if (generalBlock != null) _145_3_1928633540 = _134_1_11683158081.generalBlock._145_3_1928633540;
		if (_145_3_1928633540 != null) _146_4_11088809491 = _134_1_11683158081.generalBlock._145_3_1928633540._146_4_11088809491;
		if (_145_3_1928633540 != null) languageName = _134_1_11683158081.generalBlock._145_3_1928633540.languageName;
		if (_145_3_1928633540 != null) languageSelector = _134_1_11683158081.generalBlock._145_3_1928633540.languageSelector;
		if (generalBlock != null) accessTypeBlock = _134_1_11683158081.generalBlock.accessTypeBlock;
		if (accessTypeBlock != null) _150_4_1593504471 = _134_1_11683158081.generalBlock.accessTypeBlock._150_4_1593504471;
		if (accessTypeBlock != null) accessTypeField = _134_1_11683158081.generalBlock.accessTypeBlock.accessTypeField;
		if (generalBlock != null) _152_3_01513742189 = _134_1_11683158081.generalBlock._152_3_01513742189;
		if (_152_3_01513742189 != null) _153_4_11929032495 = _134_1_11683158081.generalBlock._152_3_01513742189._153_4_11929032495;
		if (_152_3_01513742189 != null) _154_4_02033272407 = _134_1_11683158081.generalBlock._152_3_01513742189._154_4_02033272407;
		if (_152_3_01513742189 != null) _155_4_01064952083 = _134_1_11683158081.generalBlock._152_3_01513742189._155_4_01064952083;
		if (_155_4_01064952083 != null) removeModel = _134_1_11683158081.generalBlock._152_3_01513742189._155_4_01064952083.removeModel;
		if (generalBlock != null) cloneModelBlock = _134_1_11683158081.generalBlock.cloneModelBlock;
		if (cloneModelBlock != null) _157_4_0157584084 = _134_1_11683158081.generalBlock.cloneModelBlock._157_4_0157584084;
		if (cloneModelBlock != null) _158_4_0612050351 = _134_1_11683158081.generalBlock.cloneModelBlock._158_4_0612050351;
		if (cloneModelBlock != null) _159_4_01643373222 = _134_1_11683158081.generalBlock.cloneModelBlock._159_4_01643373222;
		if (_159_4_01643373222 != null) cloneModel = _134_1_11683158081.generalBlock.cloneModelBlock._159_4_01643373222.cloneModel;
		if (_134_1_11683158081 != null) collaboratorsBlock = _134_1_11683158081.collaboratorsBlock;
		if (collaboratorsBlock != null) collaboratorsStamp = _134_1_11683158081.collaboratorsBlock.collaboratorsStamp;

		if (generalBlock != null) generalBlock.bindTo(settingsTabSelector, "generalOption");
		if (collaboratorsBlock != null) collaboratorsBlock.bindTo(settingsTabSelector, "collaboratorsOption");
	}

	@Override
	public void remove() {
		super.remove();
		if (closeTrigger != null) closeTrigger.unregister();
		if (settingsTabSelector != null) settingsTabSelector.unregister();
		if (_134_1_11683158081 != null) _134_1_11683158081.unregister();
	}

	public class CloseTrigger extends io.intino.alexandria.ui.displays.components.CloseApp<io.intino.alexandria.ui.displays.notifiers.CloseAppNotifier, B>  {

		public CloseTrigger(B box) {
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

	public class SettingsTabSelector extends io.intino.alexandria.ui.displays.components.SelectorTabs<io.intino.alexandria.ui.displays.notifiers.SelectorTabsNotifier, B>  {
		public ModelSettingsEditor.SettingsTabSelector. GeneralOption generalOption;
		public ModelSettingsEditor.SettingsTabSelector. CollaboratorsOption collaboratorsOption;

		public SettingsTabSelector(B box) {
			super(box);
			_multipleSelection(false);
		}

		@Override
		public void init() {
			super.init();
			if (generalOption == null) generalOption = register(new GeneralOption(box()).<GeneralOption>id("a_1658955926").owner(AbstractModelSettingsEditor.this));
			if (collaboratorsOption == null) collaboratorsOption = register(new CollaboratorsOption(box()).<CollaboratorsOption>id("a1164767791").owner(AbstractModelSettingsEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (generalOption != null) generalOption.unregister();
			if (collaboratorsOption != null) collaboratorsOption.unregister();
		}

		public class GeneralOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

			public GeneralOption(B box) {
				super(box);

				name("generalOption");
				_value("General");
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

		public class CollaboratorsOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

			public CollaboratorsOption(B box) {
				super(box);

				name("collaboratorsOption");
				_value("Share");
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

	public class _134_1_11683158081 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelSettingsEditor._134_1_11683158081. GeneralBlock generalBlock;
		public ModelSettingsEditor._134_1_11683158081. CollaboratorsBlock collaboratorsBlock;

		public _134_1_11683158081(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (generalBlock == null) generalBlock = register(new GeneralBlock(box()).<GeneralBlock>id("a1583249337").owner(AbstractModelSettingsEditor.this));
			if (collaboratorsBlock == null) collaboratorsBlock = register(new CollaboratorsBlock(box()).<CollaboratorsBlock>id("a366648212").owner(AbstractModelSettingsEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (generalBlock != null) generalBlock.unregister();
			if (collaboratorsBlock != null) collaboratorsBlock.unregister();
		}

		public class GeneralBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
			public ModelSettingsEditor._134_1_11683158081.GeneralBlock. _136_3_0936979191 _136_3_0936979191;
			public ModelSettingsEditor._134_1_11683158081.GeneralBlock. _142_3_01687044472 _142_3_01687044472;
			public ModelSettingsEditor._134_1_11683158081.GeneralBlock. _145_3_1928633540 _145_3_1928633540;
			public ModelSettingsEditor._134_1_11683158081.GeneralBlock. AccessTypeBlock accessTypeBlock;
			public ModelSettingsEditor._134_1_11683158081.GeneralBlock. _152_3_01513742189 _152_3_01513742189;
			public ModelSettingsEditor._134_1_11683158081.GeneralBlock. CloneModelBlock cloneModelBlock;

			public GeneralBlock(B box) {
				super(box);
			}

			@Override
			public void initConditional() {
				super.init();
				if (_136_3_0936979191 == null) _136_3_0936979191 = register(new _136_3_0936979191(box()).<_136_3_0936979191>id("a_1950625686").owner(AbstractModelSettingsEditor.this));
				if (_142_3_01687044472 == null) _142_3_01687044472 = register(new _142_3_01687044472(box()).<_142_3_01687044472>id("a_635239842").owner(AbstractModelSettingsEditor.this));
				if (_145_3_1928633540 == null) _145_3_1928633540 = register(new _145_3_1928633540(box()).<_145_3_1928633540>id("a_191588325").owner(AbstractModelSettingsEditor.this));
				if (accessTypeBlock == null) accessTypeBlock = register(new AccessTypeBlock(box()).<AccessTypeBlock>id("a_1214107671").owner(AbstractModelSettingsEditor.this));
				if (_152_3_01513742189 == null) _152_3_01513742189 = register(new _152_3_01513742189(box()).<_152_3_01513742189>id("a_2002763107").owner(AbstractModelSettingsEditor.this));
				if (cloneModelBlock == null) cloneModelBlock = register(new CloneModelBlock(box()).<CloneModelBlock>id("a1273761691").owner(AbstractModelSettingsEditor.this));
				if (AbstractModelSettingsEditor.this._137_4_11811015619 == null) AbstractModelSettingsEditor.this._137_4_11811015619 = _134_1_11683158081.generalBlock._136_3_0936979191._137_4_11811015619;
				if (AbstractModelSettingsEditor.this.modelNameField == null) AbstractModelSettingsEditor.this.modelNameField = _134_1_11683158081.generalBlock._136_3_0936979191._138_4_11307115607.modelNameField;
				if (AbstractModelSettingsEditor.this.editName == null) AbstractModelSettingsEditor.this.editName = _134_1_11683158081.generalBlock._136_3_0936979191._138_4_11307115607.editName;
				if (AbstractModelSettingsEditor.this.nameDialog == null) AbstractModelSettingsEditor.this.nameDialog = _134_1_11683158081.generalBlock._136_3_0936979191._138_4_11307115607.nameDialog;
				if (AbstractModelSettingsEditor.this._143_4_0623526552 == null) AbstractModelSettingsEditor.this._143_4_0623526552 = _134_1_11683158081.generalBlock._142_3_01687044472._143_4_0623526552;
				if (AbstractModelSettingsEditor.this.modelDescriptionField == null) AbstractModelSettingsEditor.this.modelDescriptionField = _134_1_11683158081.generalBlock._142_3_01687044472.modelDescriptionField;
				if (AbstractModelSettingsEditor.this._146_4_11088809491 == null) AbstractModelSettingsEditor.this._146_4_11088809491 = _134_1_11683158081.generalBlock._145_3_1928633540._146_4_11088809491;
				if (AbstractModelSettingsEditor.this.languageName == null) AbstractModelSettingsEditor.this.languageName = _134_1_11683158081.generalBlock._145_3_1928633540.languageName;
				if (AbstractModelSettingsEditor.this.languageSelector == null) AbstractModelSettingsEditor.this.languageSelector = _134_1_11683158081.generalBlock._145_3_1928633540.languageSelector;
				if (AbstractModelSettingsEditor.this._150_4_1593504471 == null) AbstractModelSettingsEditor.this._150_4_1593504471 = _134_1_11683158081.generalBlock.accessTypeBlock._150_4_1593504471;
				if (AbstractModelSettingsEditor.this.accessTypeField == null) AbstractModelSettingsEditor.this.accessTypeField = _134_1_11683158081.generalBlock.accessTypeBlock.accessTypeField;
				if (AbstractModelSettingsEditor.this._153_4_11929032495 == null) AbstractModelSettingsEditor.this._153_4_11929032495 = _134_1_11683158081.generalBlock._152_3_01513742189._153_4_11929032495;
				if (AbstractModelSettingsEditor.this._154_4_02033272407 == null) AbstractModelSettingsEditor.this._154_4_02033272407 = _134_1_11683158081.generalBlock._152_3_01513742189._154_4_02033272407;
				if (AbstractModelSettingsEditor.this.removeModel == null) AbstractModelSettingsEditor.this.removeModel = _134_1_11683158081.generalBlock._152_3_01513742189._155_4_01064952083.removeModel;
				if (AbstractModelSettingsEditor.this._157_4_0157584084 == null) AbstractModelSettingsEditor.this._157_4_0157584084 = _134_1_11683158081.generalBlock.cloneModelBlock._157_4_0157584084;
				if (AbstractModelSettingsEditor.this._158_4_0612050351 == null) AbstractModelSettingsEditor.this._158_4_0612050351 = _134_1_11683158081.generalBlock.cloneModelBlock._158_4_0612050351;
				if (AbstractModelSettingsEditor.this.cloneModel == null) AbstractModelSettingsEditor.this.cloneModel = _134_1_11683158081.generalBlock.cloneModelBlock._159_4_01643373222.cloneModel;
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_136_3_0936979191 != null) _136_3_0936979191.unregister();
				if (_142_3_01687044472 != null) _142_3_01687044472.unregister();
				if (_145_3_1928633540 != null) _145_3_1928633540.unregister();
				if (accessTypeBlock != null) accessTypeBlock.unregister();
				if (_152_3_01513742189 != null) _152_3_01513742189.unregister();
				if (cloneModelBlock != null) cloneModelBlock.unregister();
			}

			public class _136_3_0936979191 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._136_3_0936979191. _137_4_11811015619 _137_4_11811015619;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._136_3_0936979191. _138_4_11307115607 _138_4_11307115607;

				public _136_3_0936979191(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_137_4_11811015619 == null) _137_4_11811015619 = register(new _137_4_11811015619(box()).<_137_4_11811015619>id("a37310974").owner(AbstractModelSettingsEditor.this));
					if (_138_4_11307115607 == null) _138_4_11307115607 = register(new _138_4_11307115607(box()).<_138_4_11307115607>id("a1308074079").owner(AbstractModelSettingsEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_137_4_11811015619 != null) _137_4_11811015619.unregister();
					if (_138_4_11307115607 != null) _138_4_11307115607.unregister();
				}

				public class _137_4_11811015619 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _137_4_11811015619(B box) {
						super(box);
						_value("Name");
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

				public class _138_4_11307115607 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelSettingsEditor._134_1_11683158081.GeneralBlock._136_3_0936979191._138_4_11307115607. ModelNameField modelNameField;
					public ModelSettingsEditor._134_1_11683158081.GeneralBlock._136_3_0936979191._138_4_11307115607. EditName editName;
					public ModelNameDialog nameDialog;

					public _138_4_11307115607(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (modelNameField == null) modelNameField = register(new ModelNameField(box()).<ModelNameField>id("a_369215405").owner(AbstractModelSettingsEditor.this));
						if (editName == null) editName = register(new EditName(box()).<EditName>id("a_414431806").owner(AbstractModelSettingsEditor.this));
						if (nameDialog == null) nameDialog = AbstractModelSettingsEditor.this.nameDialog = register(new ModelNameDialog((EditorBox)box()).id("a_1803829632"));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (modelNameField != null) modelNameField.unregister();
						if (editName != null) editName.unregister();
						if (nameDialog != null) nameDialog.unregister();
					}

					public class ModelNameField extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public ModelNameField(B box) {
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

					public class EditName extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

						public EditName(B box) {
							super(box);
							_title("Edit");
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

			public class _142_3_01687044472 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._142_3_01687044472. _143_4_0623526552 _143_4_0623526552;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._142_3_01687044472. ModelDescriptionField modelDescriptionField;

				public _142_3_01687044472(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_143_4_0623526552 == null) _143_4_0623526552 = register(new _143_4_0623526552(box()).<_143_4_0623526552>id("a1529676900").owner(AbstractModelSettingsEditor.this));
					if (modelDescriptionField == null) modelDescriptionField = register(new ModelDescriptionField(box()).<ModelDescriptionField>id("a995099282").owner(AbstractModelSettingsEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_143_4_0623526552 != null) _143_4_0623526552.unregister();
					if (modelDescriptionField != null) modelDescriptionField.unregister();
				}

				public class _143_4_0623526552 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _143_4_0623526552(B box) {
						super(box);
						_value("Description");
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

				public class ModelDescriptionField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

					public ModelDescriptionField(B box) {
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

			public class _145_3_1928633540 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._145_3_1928633540. _146_4_11088809491 _146_4_11088809491;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._145_3_1928633540. LanguageName languageName;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._145_3_1928633540. LanguageSelector languageSelector;

				public _145_3_1928633540(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_146_4_11088809491 == null) _146_4_11088809491 = register(new _146_4_11088809491(box()).<_146_4_11088809491>id("a42368375").owner(AbstractModelSettingsEditor.this));
					if (languageName == null) languageName = register(new LanguageName(box()).<LanguageName>id("a_2134982571").owner(AbstractModelSettingsEditor.this));
					if (languageSelector == null) languageSelector = register(new LanguageSelector(box()).<LanguageSelector>id("a1636123817").owner(AbstractModelSettingsEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_146_4_11088809491 != null) _146_4_11088809491.unregister();
					if (languageName != null) languageName.unregister();
					if (languageSelector != null) languageSelector.unregister();
				}

				public class _146_4_11088809491 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _146_4_11088809491(B box) {
						super(box);
						_value("DSL version");
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

				public class LanguageName extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public LanguageName(B box) {
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

				public class LanguageSelector extends io.intino.alexandria.ui.displays.components.SelectorComboBox<io.intino.alexandria.ui.displays.notifiers.SelectorComboBoxNotifier, B>  {

					public LanguageSelector(B box) {
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
			}

			public class AccessTypeBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock.AccessTypeBlock. _150_4_1593504471 _150_4_1593504471;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock.AccessTypeBlock. AccessTypeField accessTypeField;

				public AccessTypeBlock(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_150_4_1593504471 == null) _150_4_1593504471 = register(new _150_4_1593504471(box()).<_150_4_1593504471>id("a490564474").owner(AbstractModelSettingsEditor.this));
					if (accessTypeField == null) accessTypeField = register(new AccessTypeField(box()).<AccessTypeField>id("a1652974726").owner(AbstractModelSettingsEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_150_4_1593504471 != null) _150_4_1593504471.unregister();
					if (accessTypeField != null) accessTypeField.unregister();
				}

				public class _150_4_1593504471 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _150_4_1593504471(B box) {
						super(box);
						_value("Model access");
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

				public class AccessTypeField extends io.intino.alexandria.ui.displays.components.ActionSwitch<io.intino.alexandria.ui.displays.notifiers.ActionSwitchNotifier, B>  {

					public AccessTypeField(B box) {
						super(box);
						_title("Model is private");
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

			public class _152_3_01513742189 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._152_3_01513742189. _153_4_11929032495 _153_4_11929032495;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._152_3_01513742189. _154_4_02033272407 _154_4_02033272407;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock._152_3_01513742189. _155_4_01064952083 _155_4_01064952083;

				public _152_3_01513742189(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_153_4_11929032495 == null) _153_4_11929032495 = register(new _153_4_11929032495(box()).<_153_4_11929032495>id("a2074996221").owner(AbstractModelSettingsEditor.this));
					if (_154_4_02033272407 == null) _154_4_02033272407 = register(new _154_4_02033272407(box()).<_154_4_02033272407>id("a748947225").owner(AbstractModelSettingsEditor.this));
					if (_155_4_01064952083 == null) _155_4_01064952083 = register(new _155_4_01064952083(box()).<_155_4_01064952083>id("a177566048").owner(AbstractModelSettingsEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_153_4_11929032495 != null) _153_4_11929032495.unregister();
					if (_154_4_02033272407 != null) _154_4_02033272407.unregister();
					if (_155_4_01064952083 != null) _155_4_01064952083.unregister();
				}

				public class _153_4_11929032495 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _153_4_11929032495(B box) {
						super(box);
						_value("Remove model");
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

				public class _154_4_02033272407 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _154_4_02033272407(B box) {
						super(box);
						_value("Removed models cannot be restored!");
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

				public class _155_4_01064952083 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelSettingsEditor._134_1_11683158081.GeneralBlock._152_3_01513742189._155_4_01064952083. RemoveModel removeModel;

					public _155_4_01064952083(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (removeModel == null) removeModel = register(new RemoveModel(box()).<RemoveModel>id("a824011987").owner(AbstractModelSettingsEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (removeModel != null) removeModel.unregister();
					}

					public class RemoveModel extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

						public RemoveModel(B box) {
							super(box);
							_title("Remove model...");
							_readonly(true);
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

			public class CloneModelBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock.CloneModelBlock. _157_4_0157584084 _157_4_0157584084;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock.CloneModelBlock. _158_4_0612050351 _158_4_0612050351;
				public ModelSettingsEditor._134_1_11683158081.GeneralBlock.CloneModelBlock. _159_4_01643373222 _159_4_01643373222;

				public CloneModelBlock(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_157_4_0157584084 == null) _157_4_0157584084 = register(new _157_4_0157584084(box()).<_157_4_0157584084>id("a421511056").owner(AbstractModelSettingsEditor.this));
					if (_158_4_0612050351 == null) _158_4_0612050351 = register(new _158_4_0612050351(box()).<_158_4_0612050351>id("a798724156").owner(AbstractModelSettingsEditor.this));
					if (_159_4_01643373222 == null) _159_4_01643373222 = register(new _159_4_01643373222(box()).<_159_4_01643373222>id("a_1459172665").owner(AbstractModelSettingsEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_157_4_0157584084 != null) _157_4_0157584084.unregister();
					if (_158_4_0612050351 != null) _158_4_0612050351.unregister();
					if (_159_4_01643373222 != null) _159_4_01643373222.unregister();
				}

				public class _157_4_0157584084 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _157_4_0157584084(B box) {
						super(box);
						_value("Clone model");
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

				public class _158_4_0612050351 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _158_4_0612050351(B box) {
						super(box);
						_value("Copy both model files and resource files to a new model");
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

				public class _159_4_01643373222 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelSettingsEditor._134_1_11683158081.GeneralBlock.CloneModelBlock._159_4_01643373222. CloneModel cloneModel;

					public _159_4_01643373222(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (cloneModel == null) cloneModel = register(new CloneModel(box()).<CloneModel>id("a_327201606").owner(AbstractModelSettingsEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (cloneModel != null) cloneModel.unregister();
					}

					public class CloneModel extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

						public CloneModel(B box) {
							super(box);
							_title("Clone model...");
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

		public class CollaboratorsBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
			public CollaboratorsTemplate collaboratorsStamp;

			public CollaboratorsBlock(B box) {
				super(box);
			}

			@Override
			public void initConditional() {
				super.init();
				if (collaboratorsStamp == null) collaboratorsStamp = AbstractModelSettingsEditor.this.collaboratorsStamp = register(new CollaboratorsTemplate((EditorBox)box()).id("a1220292897"));
				if (AbstractModelSettingsEditor.this.collaboratorsStamp == null) AbstractModelSettingsEditor.this.collaboratorsStamp = _134_1_11683158081.collaboratorsBlock.collaboratorsStamp;
			}

			@Override
			public void unregister() {
				super.unregister();
				if (collaboratorsStamp != null) collaboratorsStamp.unregister();
			}
		}
	}
}