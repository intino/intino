package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageKitTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public OpenModel openModel;
	public SelectVersionBlock selectVersionBlock;
	public LanguageKitTemplate.SelectVersionBlock. _262_2_1367900368 _262_2_1367900368;
	public NoVersionsBlock noVersionsBlock;
	public LanguageKitTemplate.NoVersionsBlock. _265_2_12070105616 _265_2_12070105616;
	public LanguageKitTemplate.NoVersionsBlock._265_2_12070105616. _266_3_02095560648 _266_3_02095560648;
	public LanguageKitTemplate.NoVersionsBlock._265_2_12070105616. MetamodelLink metamodelLink;
	public VersionNotCreatedBlock versionNotCreatedBlock;
	public LanguageKitTemplate.VersionNotCreatedBlock. _270_2_11586367572 _270_2_11586367572;
	public LanguageKitTemplate.VersionNotCreatedBlock._270_2_11586367572. _271_3_01592365154 _271_3_01592365154;
	public LanguageKitTemplate.VersionNotCreatedBlock._270_2_11586367572. CreateVersion createVersion;
	public VersionBlock versionBlock;
	public LanguageKitTemplate.VersionBlock. _276_2_11813728133 _276_2_11813728133;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133. _277_3_11909129975 _277_3_11909129975;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133. _279_3_0739468938 _279_3_0739468938;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938. StartModeling startModeling;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938. _282_4_11216895897 _282_4_11216895897;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897. _283_5_0714828976 _283_5_0714828976;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897. _284_5_1639692527 _284_5_1639692527;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897._284_5_1639692527. _284_55_11658273174 _284_55_11658273174;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897. TemplateDefined templateDefined;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897.TemplateDefined. TemplateLink templateLink;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897. TemplateNotDefined templateNotDefined;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897.TemplateNotDefined. CreateTemplate createTemplate;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938. _290_4_0202944646 _290_4_0202944646;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646. _291_5_0961751497 _291_5_0961751497;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646. _292_5_12042007302 _292_5_12042007302;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._292_5_12042007302. _292_55_1766891643 _292_55_1766891643;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646. _293_5_11948498754 _293_5_11948498754;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._293_5_11948498754. EditHelpTrigger editHelpTrigger;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938. _296_4_082974685 _296_4_082974685;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685. _297_5_1941630457 _297_5_1941630457;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685. _298_5_12076728759 _298_5_12076728759;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._298_5_12076728759. _298_55_11241535596 _298_55_11241535596;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685. _299_5_11960333744 _299_5_11960333744;
	public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._299_5_11960333744. _299_32_0537548287 _299_32_0537548287;
	public LanguageKitTemplate.VersionBlock. _301_2_1476140994 _301_2_1476140994;
	public LanguageKitTemplate.VersionBlock._301_2_1476140994. _302_3_0914153307 _302_3_0914153307;
	public LanguageKitTemplate.VersionBlock._301_2_1476140994. _304_3_01721746047 _304_3_01721746047;
	public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047. _305_4_11636735210 _305_4_11636735210;
	public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210. _306_5_0509694340 _306_5_0509694340;
	public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210. _307_5_01061492182 _307_5_01061492182;
	public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210._307_5_01061492182. _307_55_11330206289 _307_55_11330206289;
	public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210. Dependencies dependencies;
	public HelpDialog helpDialog;
	public LanguageKitTemplate.HelpDialog. _311_8_11312085518 _311_8_11312085518;
	public LanguageKitTemplate.HelpDialog._311_8_11312085518. HelpEditor helpEditor;
	public ExamplesDialog examplesDialog;
	public LanguageKitTemplate.ExamplesDialog. _315_8_11389539198 _315_8_11389539198;
	public LanguageKitTemplate.ExamplesDialog._315_8_11389539198. _316_3_01839311981 _316_3_01839311981;
	public ModelsDialog modelsDialog;
	public ModelsTemplate modelsCatalog;
	public LanguageKitTemplate.ExamplesDialog. _318_2_1955995399 _318_2_1955995399;
	public LanguageKitTemplate.ExamplesDialog. _319_8_11207169892 _319_8_11207169892;
	public LanguageKitTemplate.ExamplesDialog._319_8_11207169892. _320_12_1648783589 _320_12_1648783589;

	public AbstractLanguageKitTemplate(B box) {
		super(box);
		id("languageKitTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (openModel == null) openModel = register(new OpenModel(box()).<OpenModel>id("a_1755234695").owner(AbstractLanguageKitTemplate.this));
		if (selectVersionBlock == null) selectVersionBlock = register(new SelectVersionBlock(box()).<SelectVersionBlock>id("a1211317111").owner(AbstractLanguageKitTemplate.this));
		if (selectVersionBlock != null) _262_2_1367900368 = selectVersionBlock._262_2_1367900368;
		if (noVersionsBlock == null) noVersionsBlock = register(new NoVersionsBlock(box()).<NoVersionsBlock>id("a_1889830293").owner(AbstractLanguageKitTemplate.this));
		if (noVersionsBlock != null) _265_2_12070105616 = noVersionsBlock._265_2_12070105616;
		if (_265_2_12070105616 != null) _266_3_02095560648 = noVersionsBlock._265_2_12070105616._266_3_02095560648;
		if (_265_2_12070105616 != null) metamodelLink = noVersionsBlock._265_2_12070105616.metamodelLink;
		if (versionNotCreatedBlock == null) versionNotCreatedBlock = register(new VersionNotCreatedBlock(box()).<VersionNotCreatedBlock>id("a117902278").owner(AbstractLanguageKitTemplate.this));
		if (versionNotCreatedBlock != null) _270_2_11586367572 = versionNotCreatedBlock._270_2_11586367572;
		if (_270_2_11586367572 != null) _271_3_01592365154 = versionNotCreatedBlock._270_2_11586367572._271_3_01592365154;
		if (_270_2_11586367572 != null) createVersion = versionNotCreatedBlock._270_2_11586367572.createVersion;
		if (versionBlock == null) versionBlock = register(new VersionBlock(box()).<VersionBlock>id("a_968648485").owner(AbstractLanguageKitTemplate.this));
		if (versionBlock != null) _276_2_11813728133 = versionBlock._276_2_11813728133;
		if (_276_2_11813728133 != null) _277_3_11909129975 = versionBlock._276_2_11813728133._277_3_11909129975;
		if (_276_2_11813728133 != null) _279_3_0739468938 = versionBlock._276_2_11813728133._279_3_0739468938;
		if (_279_3_0739468938 != null) startModeling = versionBlock._276_2_11813728133._279_3_0739468938.startModeling;
		if (_279_3_0739468938 != null) _282_4_11216895897 = versionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897;
		if (_282_4_11216895897 != null) _283_5_0714828976 = versionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897._283_5_0714828976;
		if (_282_4_11216895897 != null) _284_5_1639692527 = versionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897._284_5_1639692527;
		if (_284_5_1639692527 != null) _284_55_11658273174 = versionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897._284_5_1639692527._284_55_11658273174;
		if (_282_4_11216895897 != null) templateDefined = versionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897.templateDefined;
		if (templateDefined != null) templateLink = versionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897.templateDefined.templateLink;
		if (_282_4_11216895897 != null) templateNotDefined = versionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897.templateNotDefined;
		if (templateNotDefined != null) createTemplate = versionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897.templateNotDefined.createTemplate;
		if (_279_3_0739468938 != null) _290_4_0202944646 = versionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646;
		if (_290_4_0202944646 != null) _291_5_0961751497 = versionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._291_5_0961751497;
		if (_290_4_0202944646 != null) _292_5_12042007302 = versionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._292_5_12042007302;
		if (_292_5_12042007302 != null) _292_55_1766891643 = versionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._292_5_12042007302._292_55_1766891643;
		if (_290_4_0202944646 != null) _293_5_11948498754 = versionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._293_5_11948498754;
		if (_293_5_11948498754 != null) editHelpTrigger = versionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._293_5_11948498754.editHelpTrigger;
		if (_279_3_0739468938 != null) _296_4_082974685 = versionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685;
		if (_296_4_082974685 != null) _297_5_1941630457 = versionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._297_5_1941630457;
		if (_296_4_082974685 != null) _298_5_12076728759 = versionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._298_5_12076728759;
		if (_298_5_12076728759 != null) _298_55_11241535596 = versionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._298_5_12076728759._298_55_11241535596;
		if (_296_4_082974685 != null) _299_5_11960333744 = versionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._299_5_11960333744;
		if (_299_5_11960333744 != null) _299_32_0537548287 = versionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._299_5_11960333744._299_32_0537548287;
		if (versionBlock != null) _301_2_1476140994 = versionBlock._301_2_1476140994;
		if (_301_2_1476140994 != null) _302_3_0914153307 = versionBlock._301_2_1476140994._302_3_0914153307;
		if (_301_2_1476140994 != null) _304_3_01721746047 = versionBlock._301_2_1476140994._304_3_01721746047;
		if (_304_3_01721746047 != null) _305_4_11636735210 = versionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210;
		if (_305_4_11636735210 != null) _306_5_0509694340 = versionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210._306_5_0509694340;
		if (_305_4_11636735210 != null) _307_5_01061492182 = versionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210._307_5_01061492182;
		if (_307_5_01061492182 != null) _307_55_11330206289 = versionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210._307_5_01061492182._307_55_11330206289;
		if (_305_4_11636735210 != null) dependencies = versionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210.dependencies;
		if (helpDialog == null) helpDialog = register(new HelpDialog(box()).<HelpDialog>id("a2031548335").owner(AbstractLanguageKitTemplate.this));
		if (helpDialog != null) _311_8_11312085518 = helpDialog._311_8_11312085518;
		if (_311_8_11312085518 != null) helpEditor = helpDialog._311_8_11312085518.helpEditor;
		if (examplesDialog == null) examplesDialog = register(new ExamplesDialog(box()).<ExamplesDialog>id("a492571575").owner(AbstractLanguageKitTemplate.this));
		if (examplesDialog != null) _315_8_11389539198 = examplesDialog._315_8_11389539198;
		if (_315_8_11389539198 != null) _316_3_01839311981 = examplesDialog._315_8_11389539198._316_3_01839311981;
		if (_316_3_01839311981 != null) modelsDialog = examplesDialog._315_8_11389539198._316_3_01839311981.modelsDialog;
		if (_315_8_11389539198 != null) modelsCatalog = examplesDialog._315_8_11389539198.modelsCatalog;
		if (examplesDialog != null) _318_2_1955995399 = examplesDialog._318_2_1955995399;
		if (examplesDialog != null) _319_8_11207169892 = examplesDialog._319_8_11207169892;
		if (_319_8_11207169892 != null) _320_12_1648783589 = examplesDialog._319_8_11207169892._320_12_1648783589;





		if (editHelpTrigger != null) editHelpTrigger.bindTo(helpDialog);


		if (_299_32_0537548287 != null) _299_32_0537548287.bindTo(examplesDialog);


		if (_320_12_1648783589 != null) _320_12_1648783589.bindTo(examplesDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (openModel != null) openModel.unregister();
		if (selectVersionBlock != null) selectVersionBlock.unregister();
		if (noVersionsBlock != null) noVersionsBlock.unregister();
		if (versionNotCreatedBlock != null) versionNotCreatedBlock.unregister();
		if (versionBlock != null) versionBlock.unregister();
		if (helpDialog != null) helpDialog.unregister();
		if (examplesDialog != null) examplesDialog.unregister();
	}

	public class OpenModel extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

		public OpenModel(B box) {
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

	public class SelectVersionBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageKitTemplate.SelectVersionBlock. _262_2_1367900368 _262_2_1367900368;

		public SelectVersionBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_262_2_1367900368 == null) _262_2_1367900368 = register(new _262_2_1367900368(box()).<_262_2_1367900368>id("a_599288396").owner(AbstractLanguageKitTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_262_2_1367900368 != null) _262_2_1367900368.unregister();
		}

		public class _262_2_1367900368 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _262_2_1367900368(B box) {
				super(box);
				_value("Select version on right panel to open kit");
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

	public class NoVersionsBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageKitTemplate.NoVersionsBlock. _265_2_12070105616 _265_2_12070105616;

		public NoVersionsBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_265_2_12070105616 == null) _265_2_12070105616 = register(new _265_2_12070105616(box()).<_265_2_12070105616>id("a1106924647").owner(AbstractLanguageKitTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_265_2_12070105616 != null) _265_2_12070105616.unregister();
		}

		public class _265_2_12070105616 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageKitTemplate.NoVersionsBlock._265_2_12070105616. _266_3_02095560648 _266_3_02095560648;
			public LanguageKitTemplate.NoVersionsBlock._265_2_12070105616. MetamodelLink metamodelLink;

			public _265_2_12070105616(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_266_3_02095560648 == null) _266_3_02095560648 = register(new _266_3_02095560648(box()).<_266_3_02095560648>id("a1585328668").owner(AbstractLanguageKitTemplate.this));
				if (metamodelLink == null) metamodelLink = register(new MetamodelLink(box()).<MetamodelLink>id("a_497900289").owner(AbstractLanguageKitTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_266_3_02095560648 != null) _266_3_02095560648.unregister();
				if (metamodelLink != null) metamodelLink.unregister();
			}

			public class _266_3_02095560648 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _266_3_02095560648(B box) {
					super(box);
					_value("You haven’t committed the metamodel yet. A commit is required to create a DSL release. Please go to the metamodel and commit your changes.");
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

			public class MetamodelLink extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

				public MetamodelLink(B box) {
					super(box);
					_title("Goto metamodel");
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

	public class VersionNotCreatedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageKitTemplate.VersionNotCreatedBlock. _270_2_11586367572 _270_2_11586367572;

		public VersionNotCreatedBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_270_2_11586367572 == null) _270_2_11586367572 = register(new _270_2_11586367572(box()).<_270_2_11586367572>id("a1472040968").owner(AbstractLanguageKitTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_270_2_11586367572 != null) _270_2_11586367572.unregister();
		}

		public class _270_2_11586367572 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageKitTemplate.VersionNotCreatedBlock._270_2_11586367572. _271_3_01592365154 _271_3_01592365154;
			public LanguageKitTemplate.VersionNotCreatedBlock._270_2_11586367572. CreateVersion createVersion;

			public _270_2_11586367572(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_271_3_01592365154 == null) _271_3_01592365154 = register(new _271_3_01592365154(box()).<_271_3_01592365154>id("a2001631986").owner(AbstractLanguageKitTemplate.this));
				if (createVersion == null) createVersion = register(new CreateVersion(box()).<CreateVersion>id("a_2013909257").owner(AbstractLanguageKitTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_271_3_01592365154 != null) _271_3_01592365154.unregister();
				if (createVersion != null) createVersion.unregister();
			}

			public class _271_3_01592365154 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _271_3_01592365154(B box) {
					super(box);
					_value("This version of the DSL has not been defined yet. To define its kit, you must first create the version.");
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

			public class CreateVersion extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

				public CreateVersion(B box) {
					super(box);
					_title("Create version");
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

	public class VersionBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageKitTemplate.VersionBlock. _276_2_11813728133 _276_2_11813728133;
		public LanguageKitTemplate.VersionBlock. _301_2_1476140994 _301_2_1476140994;

		public VersionBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_276_2_11813728133 == null) _276_2_11813728133 = register(new _276_2_11813728133(box()).<_276_2_11813728133>id("a51167448").owner(AbstractLanguageKitTemplate.this));
			if (_301_2_1476140994 == null) _301_2_1476140994 = register(new _301_2_1476140994(box()).<_301_2_1476140994>id("a_792098468").owner(AbstractLanguageKitTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_276_2_11813728133 != null) _276_2_11813728133.unregister();
			if (_301_2_1476140994 != null) _301_2_1476140994.unregister();
		}

		public class _276_2_11813728133 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageKitTemplate.VersionBlock._276_2_11813728133. _277_3_11909129975 _277_3_11909129975;
			public LanguageKitTemplate.VersionBlock._276_2_11813728133. _279_3_0739468938 _279_3_0739468938;

			public _276_2_11813728133(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_277_3_11909129975 == null) _277_3_11909129975 = register(new _277_3_11909129975(box()).<_277_3_11909129975>id("a1733079656").owner(AbstractLanguageKitTemplate.this));
				if (_279_3_0739468938 == null) _279_3_0739468938 = register(new _279_3_0739468938(box()).<_279_3_0739468938>id("a_2018937972").owner(AbstractLanguageKitTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_277_3_11909129975 != null) _277_3_11909129975.unregister();
				if (_279_3_0739468938 != null) _279_3_0739468938.unregister();
			}

			public class _277_3_11909129975 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _277_3_11909129975(B box) {
					super(box);
					_value("In Quassar");
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

			public class _279_3_0739468938 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938. StartModeling startModeling;
				public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938. _282_4_11216895897 _282_4_11216895897;
				public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938. _290_4_0202944646 _290_4_0202944646;
				public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938. _296_4_082974685 _296_4_082974685;

				public _279_3_0739468938(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (startModeling == null) startModeling = register(new StartModeling(box()).<StartModeling>id("a_6541920").owner(AbstractLanguageKitTemplate.this));
					if (_282_4_11216895897 == null) _282_4_11216895897 = register(new _282_4_11216895897(box()).<_282_4_11216895897>id("a_1192380489").owner(AbstractLanguageKitTemplate.this));
					if (_290_4_0202944646 == null) _290_4_0202944646 = register(new _290_4_0202944646(box()).<_290_4_0202944646>id("a_1092618200").owner(AbstractLanguageKitTemplate.this));
					if (_296_4_082974685 == null) _296_4_082974685 = register(new _296_4_082974685(box()).<_296_4_082974685>id("a_2111589976").owner(AbstractLanguageKitTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (startModeling != null) startModeling.unregister();
					if (_282_4_11216895897 != null) _282_4_11216895897.unregister();
					if (_290_4_0202944646 != null) _290_4_0202944646.unregister();
					if (_296_4_082974685 != null) _296_4_082974685.unregister();
				}

				public class StartModeling extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<StartModeling> {

					public StartModeling(B box) {
						super(box);
						_title("Explore");
						_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("Link"));
						_path("/models/:language");
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
					public StartModeling address(java.util.function.Function<String, String> addressFromPathResolver) {
						address(addressFromPathResolver.apply(path()));
						return this;
					}
				}

				public class _282_4_11216895897 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897. _283_5_0714828976 _283_5_0714828976;
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897. _284_5_1639692527 _284_5_1639692527;
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897. TemplateDefined templateDefined;
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897. TemplateNotDefined templateNotDefined;

					public _282_4_11216895897(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_283_5_0714828976 == null) _283_5_0714828976 = register(new _283_5_0714828976(box()).<_283_5_0714828976>id("a_1014654499").owner(AbstractLanguageKitTemplate.this));
						if (_284_5_1639692527 == null) _284_5_1639692527 = register(new _284_5_1639692527(box()).<_284_5_1639692527>id("a_627044082").owner(AbstractLanguageKitTemplate.this));
						if (templateDefined == null) templateDefined = register(new TemplateDefined(box()).<TemplateDefined>id("a1015713293").owner(AbstractLanguageKitTemplate.this));
						if (templateNotDefined == null) templateNotDefined = register(new TemplateNotDefined(box()).<TemplateNotDefined>id("a_1894536910").owner(AbstractLanguageKitTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_283_5_0714828976 != null) _283_5_0714828976.unregister();
						if (_284_5_1639692527 != null) _284_5_1639692527.unregister();
						if (templateDefined != null) templateDefined.unregister();
						if (templateNotDefined != null) templateNotDefined.unregister();
					}

					public class _283_5_0714828976 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _283_5_0714828976(B box) {
							super(box);
							_value("Define the base template");
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

					public class _284_5_1639692527 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897._284_5_1639692527. _284_55_11658273174 _284_55_11658273174;

						public _284_5_1639692527(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_284_55_11658273174 == null) _284_55_11658273174 = register(new _284_55_11658273174(box()).<_284_55_11658273174>id("a1774604811").owner(AbstractLanguageKitTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_284_55_11658273174 != null) _284_55_11658273174.unregister();
						}

						public class _284_55_11658273174 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _284_55_11658273174(B box) {
								super(box);
								_value("You can define the base template that will be used to create models with this version of the DSL. Every new model will start from this template, giving you full control over its initial structure.");
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

					public class TemplateDefined extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897.TemplateDefined. TemplateLink templateLink;

						public TemplateDefined(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (templateLink == null) templateLink = register(new TemplateLink(box()).<TemplateLink>id("a_1170277242").owner(AbstractLanguageKitTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (templateLink != null) templateLink.unregister();
						}

						public class TemplateLink extends io.intino.alexandria.ui.displays.components.OpenSite<io.intino.alexandria.ui.displays.notifiers.OpenSiteNotifier, B>  {

							public TemplateLink(B box) {
								super(box);
								_title("Define");
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

					public class TemplateNotDefined extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._282_4_11216895897.TemplateNotDefined. CreateTemplate createTemplate;

						public TemplateNotDefined(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (createTemplate == null) createTemplate = register(new CreateTemplate(box()).<CreateTemplate>id("a_1557721021").owner(AbstractLanguageKitTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (createTemplate != null) createTemplate.unregister();
						}

						public class CreateTemplate extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

							public CreateTemplate(B box) {
								super(box);
								_title("Define");
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

				public class _290_4_0202944646 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646. _291_5_0961751497 _291_5_0961751497;
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646. _292_5_12042007302 _292_5_12042007302;
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646. _293_5_11948498754 _293_5_11948498754;

					public _290_4_0202944646(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_291_5_0961751497 == null) _291_5_0961751497 = register(new _291_5_0961751497(box()).<_291_5_0961751497>id("a1453816284").owner(AbstractLanguageKitTemplate.this));
						if (_292_5_12042007302 == null) _292_5_12042007302 = register(new _292_5_12042007302(box()).<_292_5_12042007302>id("a1811578483").owner(AbstractLanguageKitTemplate.this));
						if (_293_5_11948498754 == null) _293_5_11948498754 = register(new _293_5_11948498754(box()).<_293_5_11948498754>id("a1286372393").owner(AbstractLanguageKitTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_291_5_0961751497 != null) _291_5_0961751497.unregister();
						if (_292_5_12042007302 != null) _292_5_12042007302.unregister();
						if (_293_5_11948498754 != null) _293_5_11948498754.unregister();
					}

					public class _291_5_0961751497 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _291_5_0961751497(B box) {
							super(box);
							_value("Edit the help");
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

					public class _292_5_12042007302 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._292_5_12042007302. _292_55_1766891643 _292_55_1766891643;

						public _292_5_12042007302(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_292_55_1766891643 == null) _292_55_1766891643 = register(new _292_55_1766891643(box()).<_292_55_1766891643>id("a_1448177703").owner(AbstractLanguageKitTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_292_55_1766891643 != null) _292_55_1766891643.unregister();
						}

						public class _292_55_1766891643 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _292_55_1766891643(B box) {
								super(box);
								_value("You can edit the help content that will be shown for this version of the DSL. This way, your users will always see up-to-date and relevant guidance based on the current features.");
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

					public class _293_5_11948498754 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._290_4_0202944646._293_5_11948498754. EditHelpTrigger editHelpTrigger;

						public _293_5_11948498754(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (editHelpTrigger == null) editHelpTrigger = register(new EditHelpTrigger(box()).<EditHelpTrigger>id("a_1681642804").owner(AbstractLanguageKitTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (editHelpTrigger != null) editHelpTrigger.unregister();
						}

						public class EditHelpTrigger extends io.intino.alexandria.ui.displays.components.OpenDialog<io.intino.alexandria.ui.displays.notifiers.OpenDialogNotifier, B>  {

							public EditHelpTrigger(B box) {
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

				public class _296_4_082974685 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685. _297_5_1941630457 _297_5_1941630457;
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685. _298_5_12076728759 _298_5_12076728759;
					public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685. _299_5_11960333744 _299_5_11960333744;

					public _296_4_082974685(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_297_5_1941630457 == null) _297_5_1941630457 = register(new _297_5_1941630457(box()).<_297_5_1941630457>id("a270897025").owner(AbstractLanguageKitTemplate.this));
						if (_298_5_12076728759 == null) _298_5_12076728759 = register(new _298_5_12076728759(box()).<_298_5_12076728759>id("a_980652364").owner(AbstractLanguageKitTemplate.this));
						if (_299_5_11960333744 == null) _299_5_11960333744 = register(new _299_5_11960333744(box()).<_299_5_11960333744>id("a_1250415232").owner(AbstractLanguageKitTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_297_5_1941630457 != null) _297_5_1941630457.unregister();
						if (_298_5_12076728759 != null) _298_5_12076728759.unregister();
						if (_299_5_11960333744 != null) _299_5_11960333744.unregister();
					}

					public class _297_5_1941630457 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _297_5_1941630457(B box) {
							super(box);
							_value("Provide examples");
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

					public class _298_5_12076728759 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._298_5_12076728759. _298_55_11241535596 _298_55_11241535596;

						public _298_5_12076728759(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_298_55_11241535596 == null) _298_55_11241535596 = register(new _298_55_11241535596(box()).<_298_55_11241535596>id("a1059600284").owner(AbstractLanguageKitTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_298_55_11241535596 != null) _298_55_11241535596.unregister();
						}

						public class _298_55_11241535596 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _298_55_11241535596(B box) {
								super(box);
								_value("You can optionally provide example models created with this versión of the DSL. These examples serve as practical references to help users understand how to use the DSL effectively. They can include common use cases, full configurations, or edge cases to illustrate specific features.");
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

					public class _299_5_11960333744 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageKitTemplate.VersionBlock._276_2_11813728133._279_3_0739468938._296_4_082974685._299_5_11960333744. _299_32_0537548287 _299_32_0537548287;

						public _299_5_11960333744(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_299_32_0537548287 == null) _299_32_0537548287 = register(new _299_32_0537548287(box()).<_299_32_0537548287>id("a_1286989040").owner(AbstractLanguageKitTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_299_32_0537548287 != null) _299_32_0537548287.unregister();
						}

						public class _299_32_0537548287 extends io.intino.alexandria.ui.displays.components.OpenDialog<io.intino.alexandria.ui.displays.notifiers.OpenDialogNotifier, B>  {

							public _299_32_0537548287(B box) {
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
		}

		public class _301_2_1476140994 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageKitTemplate.VersionBlock._301_2_1476140994. _302_3_0914153307 _302_3_0914153307;
			public LanguageKitTemplate.VersionBlock._301_2_1476140994. _304_3_01721746047 _304_3_01721746047;

			public _301_2_1476140994(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_302_3_0914153307 == null) _302_3_0914153307 = register(new _302_3_0914153307(box()).<_302_3_0914153307>id("a1875900304").owner(AbstractLanguageKitTemplate.this));
				if (_304_3_01721746047 == null) _304_3_01721746047 = register(new _304_3_01721746047(box()).<_304_3_01721746047>id("a1223404536").owner(AbstractLanguageKitTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_302_3_0914153307 != null) _302_3_0914153307.unregister();
				if (_304_3_01721746047 != null) _304_3_01721746047.unregister();
			}

			public class _302_3_0914153307 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _302_3_0914153307(B box) {
					super(box);
					_value("In your own environment");
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

			public class _304_3_01721746047 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047. _305_4_11636735210 _305_4_11636735210;

				public _304_3_01721746047(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_305_4_11636735210 == null) _305_4_11636735210 = register(new _305_4_11636735210(box()).<_305_4_11636735210>id("a2104440600").owner(AbstractLanguageKitTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_305_4_11636735210 != null) _305_4_11636735210.unregister();
				}

				public class _305_4_11636735210 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210. _306_5_0509694340 _306_5_0509694340;
					public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210. _307_5_01061492182 _307_5_01061492182;
					public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210. Dependencies dependencies;

					public _305_4_11636735210(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_306_5_0509694340 == null) _306_5_0509694340 = register(new _306_5_0509694340(box()).<_306_5_0509694340>id("a749752229").owner(AbstractLanguageKitTemplate.this));
						if (_307_5_01061492182 == null) _307_5_01061492182 = register(new _307_5_01061492182(box()).<_307_5_01061492182>id("a_1448454192").owner(AbstractLanguageKitTemplate.this));
						if (dependencies == null) dependencies = AbstractLanguageKitTemplate.this.dependencies = register(new Dependencies((EditorBox)box()).<Dependencies>id("a_932674625").owner(AbstractLanguageKitTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_306_5_0509694340 != null) _306_5_0509694340.unregister();
						if (_307_5_01061492182 != null) _307_5_01061492182.unregister();
						if (dependencies != null) dependencies.unregister();
					}

					public class _306_5_0509694340 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _306_5_0509694340(B box) {
							super(box);
							_value("Run and Customize your own Language Server");
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

					public class _307_5_01061492182 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageKitTemplate.VersionBlock._301_2_1476140994._304_3_01721746047._305_4_11636735210._307_5_01061492182. _307_55_11330206289 _307_55_11330206289;

						public _307_5_01061492182(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_307_55_11330206289 == null) _307_55_11330206289 = register(new _307_55_11330206289(box()).<_307_55_11330206289>id("a_1672168643").owner(AbstractLanguageKitTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_307_55_11330206289 != null) _307_55_11330206289.unregister();
						}

						public class _307_55_11330206289 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _307_55_11330206289(B box) {
								super(box);
								_value("Use the provided Maven dependency to deploy your own language server. Run it as-is, or extend it with your own validations, rules, and behaviors.");
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

					public class Dependencies extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,DependencyTemplate, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,DependencyTemplate, java.lang.Void> {

						public Dependencies(EditorBox box) {
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
						public DependencyTemplate add(java.lang.Void value) {
							DependencyTemplate child = new DependencyTemplate(box());
							child.id(java.util.UUID.randomUUID().toString());
							add(child, "dependencies");
							notifyAdd(child);
							return child;
						}
						@Override
						public void remove(DependencyTemplate child) {
							removeChild(child, "dependencies");
						}
						public void clear() {
							super.clear("dependencies");
						}
					}
				}
			}
		}
	}

	public class HelpDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public LanguageKitTemplate.HelpDialog. _311_8_11312085518 _311_8_11312085518;

		public HelpDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_311_8_11312085518 == null) _311_8_11312085518 = register(new _311_8_11312085518(box()).<_311_8_11312085518>id("a_1220357087").owner(AbstractLanguageKitTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_311_8_11312085518 != null) _311_8_11312085518.unregister();
		}

		public class _311_8_11312085518 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageKitTemplate.HelpDialog._311_8_11312085518. HelpEditor helpEditor;

			public _311_8_11312085518(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (helpEditor == null) helpEditor = AbstractLanguageKitTemplate.this.helpEditor = register(new HelpEditor(box()).<HelpEditor>id("a_1706511003").owner(AbstractLanguageKitTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (helpEditor != null) helpEditor.unregister();
			}

			public class HelpEditor extends io.intino.alexandria.ui.displays.components.DisplayStamp<io.intino.alexandria.ui.displays.notifiers.DisplayStampNotifier, B>  {

				public HelpEditor(B box) {
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

	public class ExamplesDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public LanguageKitTemplate.ExamplesDialog. _315_8_11389539198 _315_8_11389539198;
		public LanguageKitTemplate.ExamplesDialog. _318_2_1955995399 _318_2_1955995399;
		public LanguageKitTemplate.ExamplesDialog. _319_8_11207169892 _319_8_11207169892;

		public ExamplesDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_315_8_11389539198 == null) _315_8_11389539198 = register(new _315_8_11389539198(box()).<_315_8_11389539198>id("a_170852861").owner(AbstractLanguageKitTemplate.this));
			if (_318_2_1955995399 == null) _318_2_1955995399 = register(new _318_2_1955995399(box()).<_318_2_1955995399>id("a_1520538961").owner(AbstractLanguageKitTemplate.this));
			if (_319_8_11207169892 == null) _319_8_11207169892 = register(new _319_8_11207169892(box()).<_319_8_11207169892>id("a427514068").owner(AbstractLanguageKitTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_315_8_11389539198 != null) _315_8_11389539198.unregister();
			if (_318_2_1955995399 != null) _318_2_1955995399.unregister();
			if (_319_8_11207169892 != null) _319_8_11207169892.unregister();
		}

		public class _315_8_11389539198 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageKitTemplate.ExamplesDialog._315_8_11389539198. _316_3_01839311981 _316_3_01839311981;
			public ModelsTemplate modelsCatalog;

			public _315_8_11389539198(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_316_3_01839311981 == null) _316_3_01839311981 = register(new _316_3_01839311981(box()).<_316_3_01839311981>id("a1285525917").owner(AbstractLanguageKitTemplate.this));
				if (modelsCatalog == null) modelsCatalog = AbstractLanguageKitTemplate.this.modelsCatalog = register(new ModelsTemplate((EditorBox)box()).id("a_145966692"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_316_3_01839311981 != null) _316_3_01839311981.unregister();
				if (modelsCatalog != null) modelsCatalog.unregister();
			}

			public class _316_3_01839311981 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelsDialog modelsDialog;

				public _316_3_01839311981(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (modelsDialog == null) modelsDialog = AbstractLanguageKitTemplate.this.modelsDialog = register(new ModelsDialog((EditorBox)box()).id("a_861481687"));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (modelsDialog != null) modelsDialog.unregister();
				}
			}
		}

		public class _318_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _318_2_1955995399(B box) {
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

		public class _319_8_11207169892 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageKitTemplate.ExamplesDialog._319_8_11207169892. _320_12_1648783589 _320_12_1648783589;

			public _319_8_11207169892(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_320_12_1648783589 == null) _320_12_1648783589 = register(new _320_12_1648783589(box()).<_320_12_1648783589>id("a1569293197").owner(AbstractLanguageKitTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_320_12_1648783589 != null) _320_12_1648783589.unregister();
			}

			public class _320_12_1648783589 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _320_12_1648783589(B box) {
					super(box);
					_title("Close");
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