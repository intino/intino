package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractLanguageExecutionTemplate<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public SelectVersionBlock selectVersionBlock;
	public LanguageExecutionTemplate.SelectVersionBlock. _325_2_0612822607 _325_2_0612822607;
	public NoVersionsBlock noVersionsBlock;
	public LanguageExecutionTemplate.NoVersionsBlock. _328_2_12070105616 _328_2_12070105616;
	public LanguageExecutionTemplate.NoVersionsBlock._328_2_12070105616. _329_3_02095560648 _329_3_02095560648;
	public LanguageExecutionTemplate.NoVersionsBlock._328_2_12070105616. MetamodelLink metamodelLink;
	public VersionNotCreatedBlock versionNotCreatedBlock;
	public LanguageExecutionTemplate.VersionNotCreatedBlock. _333_2_1751456470 _333_2_1751456470;
	public LanguageExecutionTemplate.VersionNotCreatedBlock._333_2_1751456470. _334_3_1335183260 _334_3_1335183260;
	public LanguageExecutionTemplate.VersionNotCreatedBlock._333_2_1751456470. CreateVersion createVersion;
	public VersionBlock versionBlock;
	public LanguageExecutionTemplate.VersionBlock. DependencyBlock dependencyBlock;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock. _340_3_02117108167 _340_3_02117108167;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock. _341_3_01597879055 _341_3_01597879055;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock._341_3_01597879055. _341_53_1697219686 _341_53_1697219686;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock. Dependencies dependencies;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock. _344_3_0277848768 _344_3_0277848768;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768. _345_4_11026182688 _345_4_11026182688;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768. _346_4_1913867024 _346_4_1913867024;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768._346_4_1913867024. _347_5_1646958599 _347_5_1646958599;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768._346_4_1913867024. ExamplesCodeUsage examplesCodeUsage;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768. ExampleCodeField exampleCodeField;
	public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768. CopyExampleCodeUsage copyExampleCodeUsage;
	public LanguageExecutionTemplate.VersionBlock. DownloadsBlock downloadsBlock;
	public LanguageExecutionTemplate.VersionBlock.DownloadsBlock. _353_3_01947964710 _353_3_01947964710;
	public LanguageExecutionTemplate.VersionBlock.DownloadsBlock. _354_3_01301071905 _354_3_01301071905;
	public LanguageExecutionTemplate.VersionBlock.DownloadsBlock._354_3_01301071905. _354_53_09543788 _354_53_09543788;
	public LanguageExecutionTemplate.VersionBlock.DownloadsBlock. Downloads downloads;
	public LanguageExecutionTemplate.VersionBlock. _357_2_11995941279 _357_2_11995941279;
	public LanguageExecutionTemplate.VersionBlock._357_2_11995941279. _358_3_0545022888 _358_3_0545022888;
	public LanguageExecutionTemplate.VersionBlock._357_2_11995941279. _359_3_0227271747 _359_3_0227271747;
	public LanguageExecutionTemplate.VersionBlock. _361_2_11622853563 _361_2_11622853563;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563. _362_3_02123060716 _362_3_02123060716;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563. _363_3_01606449462 _363_3_01606449462;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563. _365_3_01432626862 _365_3_01432626862;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862. _366_4_01674700447 _366_4_01674700447;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862. _367_4_01721010791 _367_4_01721010791;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862._367_4_01721010791. _367_54_0483258430 _367_54_0483258430;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862. _368_4_0500723504 _368_4_0500723504;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862._368_4_0500723504. NameField nameField;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563. _370_3_0926367879 _370_3_0926367879;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. _371_4_11039819967 _371_4_11039819967;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. _372_4_1159382633 _372_4_1159382633;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879._372_4_1159382633. _372_54_01106762286 _372_54_01106762286;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. ExecutionSelector executionSelector;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.ExecutionSelector. NoneOption noneOption;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.ExecutionSelector. RemoteOption remoteOption;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.ExecutionSelector. LocalOption localOption;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. NoneEnvironmentBlock noneEnvironmentBlock;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.NoneEnvironmentBlock. _380_5_01862905066 _380_5_01862905066;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.NoneEnvironmentBlock. _381_5_01757672307 _381_5_01757672307;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. RemoteEnvironmentBlock remoteEnvironmentBlock;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock. _384_5_0534849154 _384_5_0534849154;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock. _385_5_1372059646 _385_5_1372059646;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock. _386_5_0558309155 _386_5_0558309155;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock._386_5_0558309155. _387_6_0498024614 _387_6_0498024614;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock._386_5_0558309155. CopyRemoteExample copyRemoteExample;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock. RemoteField remoteField;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. LocalEnvironmentBlock localEnvironmentBlock;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. _392_5_01192781532 _392_5_01192781532;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. _393_5_0769756298 _393_5_0769756298;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. _394_5_01780576244 _394_5_01780576244;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock._394_5_01780576244. _395_6_11061402165 _395_6_11061402165;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock._394_5_01780576244. ExampleTemplates exampleTemplates;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. LocalField localField;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. _398_5_11681945786 _398_5_11681945786;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock._398_5_11681945786. _399_6_0770136175 _399_6_0770136175;
	public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock._398_5_11681945786. InstallationField installationField;

	public AbstractLanguageExecutionTemplate(B box) {
		super(box);
		id("languageExecutionTemplate");
	}

	@Override
	public void init() {
		super.init();
		if (selectVersionBlock == null) selectVersionBlock = register(new SelectVersionBlock(box()).<SelectVersionBlock>id("a_1015502667").owner(AbstractLanguageExecutionTemplate.this));
		if (selectVersionBlock != null) _325_2_0612822607 = selectVersionBlock._325_2_0612822607;
		if (noVersionsBlock == null) noVersionsBlock = register(new NoVersionsBlock(box()).<NoVersionsBlock>id("a_1619442195").owner(AbstractLanguageExecutionTemplate.this));
		if (noVersionsBlock != null) _328_2_12070105616 = noVersionsBlock._328_2_12070105616;
		if (_328_2_12070105616 != null) _329_3_02095560648 = noVersionsBlock._328_2_12070105616._329_3_02095560648;
		if (_328_2_12070105616 != null) metamodelLink = noVersionsBlock._328_2_12070105616.metamodelLink;
		if (versionNotCreatedBlock == null) versionNotCreatedBlock = register(new VersionNotCreatedBlock(box()).<VersionNotCreatedBlock>id("a1530374660").owner(AbstractLanguageExecutionTemplate.this));
		if (versionNotCreatedBlock != null) _333_2_1751456470 = versionNotCreatedBlock._333_2_1751456470;
		if (_333_2_1751456470 != null) _334_3_1335183260 = versionNotCreatedBlock._333_2_1751456470._334_3_1335183260;
		if (_333_2_1751456470 != null) createVersion = versionNotCreatedBlock._333_2_1751456470.createVersion;
		if (versionBlock == null) versionBlock = register(new VersionBlock(box()).<VersionBlock>id("a_931443559").owner(AbstractLanguageExecutionTemplate.this));
		if (versionBlock != null) dependencyBlock = versionBlock.dependencyBlock;
		if (dependencyBlock != null) _340_3_02117108167 = versionBlock.dependencyBlock._340_3_02117108167;
		if (dependencyBlock != null) _341_3_01597879055 = versionBlock.dependencyBlock._341_3_01597879055;
		if (_341_3_01597879055 != null) _341_53_1697219686 = versionBlock.dependencyBlock._341_3_01597879055._341_53_1697219686;
		if (dependencyBlock != null) dependencies = versionBlock.dependencyBlock.dependencies;
		if (dependencyBlock != null) _344_3_0277848768 = versionBlock.dependencyBlock._344_3_0277848768;
		if (_344_3_0277848768 != null) _345_4_11026182688 = versionBlock.dependencyBlock._344_3_0277848768._345_4_11026182688;
		if (_344_3_0277848768 != null) _346_4_1913867024 = versionBlock.dependencyBlock._344_3_0277848768._346_4_1913867024;
		if (_346_4_1913867024 != null) _347_5_1646958599 = versionBlock.dependencyBlock._344_3_0277848768._346_4_1913867024._347_5_1646958599;
		if (_346_4_1913867024 != null) examplesCodeUsage = versionBlock.dependencyBlock._344_3_0277848768._346_4_1913867024.examplesCodeUsage;
		if (_344_3_0277848768 != null) exampleCodeField = versionBlock.dependencyBlock._344_3_0277848768.exampleCodeField;
		if (_344_3_0277848768 != null) copyExampleCodeUsage = versionBlock.dependencyBlock._344_3_0277848768.copyExampleCodeUsage;
		if (versionBlock != null) downloadsBlock = versionBlock.downloadsBlock;
		if (downloadsBlock != null) _353_3_01947964710 = versionBlock.downloadsBlock._353_3_01947964710;
		if (downloadsBlock != null) _354_3_01301071905 = versionBlock.downloadsBlock._354_3_01301071905;
		if (_354_3_01301071905 != null) _354_53_09543788 = versionBlock.downloadsBlock._354_3_01301071905._354_53_09543788;
		if (downloadsBlock != null) downloads = versionBlock.downloadsBlock.downloads;
		if (versionBlock != null) _357_2_11995941279 = versionBlock._357_2_11995941279;
		if (_357_2_11995941279 != null) _358_3_0545022888 = versionBlock._357_2_11995941279._358_3_0545022888;
		if (_357_2_11995941279 != null) _359_3_0227271747 = versionBlock._357_2_11995941279._359_3_0227271747;
		if (versionBlock != null) _361_2_11622853563 = versionBlock._361_2_11622853563;
		if (_361_2_11622853563 != null) _362_3_02123060716 = versionBlock._361_2_11622853563._362_3_02123060716;
		if (_361_2_11622853563 != null) _363_3_01606449462 = versionBlock._361_2_11622853563._363_3_01606449462;
		if (_361_2_11622853563 != null) _365_3_01432626862 = versionBlock._361_2_11622853563._365_3_01432626862;
		if (_365_3_01432626862 != null) _366_4_01674700447 = versionBlock._361_2_11622853563._365_3_01432626862._366_4_01674700447;
		if (_365_3_01432626862 != null) _367_4_01721010791 = versionBlock._361_2_11622853563._365_3_01432626862._367_4_01721010791;
		if (_367_4_01721010791 != null) _367_54_0483258430 = versionBlock._361_2_11622853563._365_3_01432626862._367_4_01721010791._367_54_0483258430;
		if (_365_3_01432626862 != null) _368_4_0500723504 = versionBlock._361_2_11622853563._365_3_01432626862._368_4_0500723504;
		if (_368_4_0500723504 != null) nameField = versionBlock._361_2_11622853563._365_3_01432626862._368_4_0500723504.nameField;
		if (_361_2_11622853563 != null) _370_3_0926367879 = versionBlock._361_2_11622853563._370_3_0926367879;
		if (_370_3_0926367879 != null) _371_4_11039819967 = versionBlock._361_2_11622853563._370_3_0926367879._371_4_11039819967;
		if (_370_3_0926367879 != null) _372_4_1159382633 = versionBlock._361_2_11622853563._370_3_0926367879._372_4_1159382633;
		if (_372_4_1159382633 != null) _372_54_01106762286 = versionBlock._361_2_11622853563._370_3_0926367879._372_4_1159382633._372_54_01106762286;
		if (_370_3_0926367879 != null) executionSelector = versionBlock._361_2_11622853563._370_3_0926367879.executionSelector;
		if (executionSelector != null) noneOption = versionBlock._361_2_11622853563._370_3_0926367879.executionSelector.noneOption;
		if (executionSelector != null) remoteOption = versionBlock._361_2_11622853563._370_3_0926367879.executionSelector.remoteOption;
		if (executionSelector != null) localOption = versionBlock._361_2_11622853563._370_3_0926367879.executionSelector.localOption;
		if (_370_3_0926367879 != null) noneEnvironmentBlock = versionBlock._361_2_11622853563._370_3_0926367879.noneEnvironmentBlock;
		if (noneEnvironmentBlock != null) _380_5_01862905066 = versionBlock._361_2_11622853563._370_3_0926367879.noneEnvironmentBlock._380_5_01862905066;
		if (noneEnvironmentBlock != null) _381_5_01757672307 = versionBlock._361_2_11622853563._370_3_0926367879.noneEnvironmentBlock._381_5_01757672307;
		if (_370_3_0926367879 != null) remoteEnvironmentBlock = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock;
		if (remoteEnvironmentBlock != null) _384_5_0534849154 = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._384_5_0534849154;
		if (remoteEnvironmentBlock != null) _385_5_1372059646 = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._385_5_1372059646;
		if (remoteEnvironmentBlock != null) _386_5_0558309155 = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._386_5_0558309155;
		if (_386_5_0558309155 != null) _387_6_0498024614 = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._386_5_0558309155._387_6_0498024614;
		if (_386_5_0558309155 != null) copyRemoteExample = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._386_5_0558309155.copyRemoteExample;
		if (remoteEnvironmentBlock != null) remoteField = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock.remoteField;
		if (_370_3_0926367879 != null) localEnvironmentBlock = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock;
		if (localEnvironmentBlock != null) _392_5_01192781532 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._392_5_01192781532;
		if (localEnvironmentBlock != null) _393_5_0769756298 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._393_5_0769756298;
		if (localEnvironmentBlock != null) _394_5_01780576244 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._394_5_01780576244;
		if (_394_5_01780576244 != null) _395_6_11061402165 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._394_5_01780576244._395_6_11061402165;
		if (_394_5_01780576244 != null) exampleTemplates = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._394_5_01780576244.exampleTemplates;
		if (localEnvironmentBlock != null) localField = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock.localField;
		if (localEnvironmentBlock != null) _398_5_11681945786 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._398_5_11681945786;
		if (_398_5_11681945786 != null) _399_6_0770136175 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._398_5_11681945786._399_6_0770136175;
		if (_398_5_11681945786 != null) installationField = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._398_5_11681945786.installationField;



		if (noneEnvironmentBlock != null) noneEnvironmentBlock.bindTo(executionSelector, "noneOption");
		if (remoteEnvironmentBlock != null) remoteEnvironmentBlock.bindTo(executionSelector, "remoteOption");
		if (localEnvironmentBlock != null) localEnvironmentBlock.bindTo(executionSelector, "localOption");
	}

	@Override
	public void remove() {
		super.remove();
		if (selectVersionBlock != null) selectVersionBlock.unregister();
		if (noVersionsBlock != null) noVersionsBlock.unregister();
		if (versionNotCreatedBlock != null) versionNotCreatedBlock.unregister();
		if (versionBlock != null) versionBlock.unregister();
	}

	public class SelectVersionBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public LanguageExecutionTemplate.SelectVersionBlock. _325_2_0612822607 _325_2_0612822607;

		public SelectVersionBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_325_2_0612822607 == null) _325_2_0612822607 = register(new _325_2_0612822607(box()).<_325_2_0612822607>id("a569646615").owner(AbstractLanguageExecutionTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_325_2_0612822607 != null) _325_2_0612822607.unregister();
		}

		public class _325_2_0612822607 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

			public _325_2_0612822607(B box) {
				super(box);
				_value("Select version on right panel to open execution environment");
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
		public LanguageExecutionTemplate.NoVersionsBlock. _328_2_12070105616 _328_2_12070105616;

		public NoVersionsBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_328_2_12070105616 == null) _328_2_12070105616 = register(new _328_2_12070105616(box()).<_328_2_12070105616>id("a1205742317").owner(AbstractLanguageExecutionTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_328_2_12070105616 != null) _328_2_12070105616.unregister();
		}

		public class _328_2_12070105616 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExecutionTemplate.NoVersionsBlock._328_2_12070105616. _329_3_02095560648 _329_3_02095560648;
			public LanguageExecutionTemplate.NoVersionsBlock._328_2_12070105616. MetamodelLink metamodelLink;

			public _328_2_12070105616(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_329_3_02095560648 == null) _329_3_02095560648 = register(new _329_3_02095560648(box()).<_329_3_02095560648>id("a_1656803044").owner(AbstractLanguageExecutionTemplate.this));
				if (metamodelLink == null) metamodelLink = register(new MetamodelLink(box()).<MetamodelLink>id("a_1884088249").owner(AbstractLanguageExecutionTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_329_3_02095560648 != null) _329_3_02095560648.unregister();
				if (metamodelLink != null) metamodelLink.unregister();
			}

			public class _329_3_02095560648 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _329_3_02095560648(B box) {
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
		public LanguageExecutionTemplate.VersionNotCreatedBlock. _333_2_1751456470 _333_2_1751456470;

		public VersionNotCreatedBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_333_2_1751456470 == null) _333_2_1751456470 = register(new _333_2_1751456470(box()).<_333_2_1751456470>id("a_1936857129").owner(AbstractLanguageExecutionTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_333_2_1751456470 != null) _333_2_1751456470.unregister();
		}

		public class _333_2_1751456470 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExecutionTemplate.VersionNotCreatedBlock._333_2_1751456470. _334_3_1335183260 _334_3_1335183260;
			public LanguageExecutionTemplate.VersionNotCreatedBlock._333_2_1751456470. CreateVersion createVersion;

			public _333_2_1751456470(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_334_3_1335183260 == null) _334_3_1335183260 = register(new _334_3_1335183260(box()).<_334_3_1335183260>id("a1835176957").owner(AbstractLanguageExecutionTemplate.this));
				if (createVersion == null) createVersion = register(new CreateVersion(box()).<CreateVersion>id("a894870079").owner(AbstractLanguageExecutionTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_334_3_1335183260 != null) _334_3_1335183260.unregister();
				if (createVersion != null) createVersion.unregister();
			}

			public class _334_3_1335183260 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _334_3_1335183260(B box) {
					super(box);
					_value("This version of the DSL has not been defined yet. To define its execution environments, you must first create the version.");
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
		public LanguageExecutionTemplate.VersionBlock. DependencyBlock dependencyBlock;
		public LanguageExecutionTemplate.VersionBlock. DownloadsBlock downloadsBlock;
		public LanguageExecutionTemplate.VersionBlock. _357_2_11995941279 _357_2_11995941279;
		public LanguageExecutionTemplate.VersionBlock. _361_2_11622853563 _361_2_11622853563;

		public VersionBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (dependencyBlock == null) dependencyBlock = register(new DependencyBlock(box()).<DependencyBlock>id("a867674204").owner(AbstractLanguageExecutionTemplate.this));
			if (downloadsBlock == null) downloadsBlock = register(new DownloadsBlock(box()).<DownloadsBlock>id("a_1562139960").owner(AbstractLanguageExecutionTemplate.this));
			if (_357_2_11995941279 == null) _357_2_11995941279 = register(new _357_2_11995941279(box()).<_357_2_11995941279>id("a175494979").owner(AbstractLanguageExecutionTemplate.this));
			if (_361_2_11622853563 == null) _361_2_11622853563 = register(new _361_2_11622853563(box()).<_361_2_11622853563>id("a_1667944069").owner(AbstractLanguageExecutionTemplate.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (dependencyBlock != null) dependencyBlock.unregister();
			if (downloadsBlock != null) downloadsBlock.unregister();
			if (_357_2_11995941279 != null) _357_2_11995941279.unregister();
			if (_361_2_11622853563 != null) _361_2_11622853563.unregister();
		}

		public class DependencyBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExecutionTemplate.VersionBlock.DependencyBlock. _340_3_02117108167 _340_3_02117108167;
			public LanguageExecutionTemplate.VersionBlock.DependencyBlock. _341_3_01597879055 _341_3_01597879055;
			public LanguageExecutionTemplate.VersionBlock.DependencyBlock. Dependencies dependencies;
			public LanguageExecutionTemplate.VersionBlock.DependencyBlock. _344_3_0277848768 _344_3_0277848768;

			public DependencyBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_340_3_02117108167 == null) _340_3_02117108167 = register(new _340_3_02117108167(box()).<_340_3_02117108167>id("a1733133590").owner(AbstractLanguageExecutionTemplate.this));
				if (_341_3_01597879055 == null) _341_3_01597879055 = register(new _341_3_01597879055(box()).<_341_3_01597879055>id("a1766826641").owner(AbstractLanguageExecutionTemplate.this));
				if (dependencies == null) dependencies = AbstractLanguageExecutionTemplate.this.dependencies = register(new Dependencies((EditorBox)box()).<Dependencies>id("a643052588").owner(AbstractLanguageExecutionTemplate.this));
				if (_344_3_0277848768 == null) _344_3_0277848768 = register(new _344_3_0277848768(box()).<_344_3_0277848768>id("a546650483").owner(AbstractLanguageExecutionTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_340_3_02117108167 != null) _340_3_02117108167.unregister();
				if (_341_3_01597879055 != null) _341_3_01597879055.unregister();
				if (dependencies != null) dependencies.unregister();
				if (_344_3_0277848768 != null) _344_3_0277848768.unregister();
			}

			public class _340_3_02117108167 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _340_3_02117108167(B box) {
					super(box);
					_value("1. Build your execution logic");
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

			public class _341_3_01597879055 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExecutionTemplate.VersionBlock.DependencyBlock._341_3_01597879055. _341_53_1697219686 _341_53_1697219686;

				public _341_3_01597879055(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_341_53_1697219686 == null) _341_53_1697219686 = register(new _341_53_1697219686(box()).<_341_53_1697219686>id("a706458447").owner(AbstractLanguageExecutionTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_341_53_1697219686 != null) _341_53_1697219686.unregister();
				}

				public class _341_53_1697219686 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _341_53_1697219686(B box) {
						super(box);
						_value("Use the provided Maven dependency to read and parse models created with this version of the DSL. Implement the runtime logic needed to execute them. This could involve compiling, transforming, or running them directly.");
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

			public class _344_3_0277848768 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768. _345_4_11026182688 _345_4_11026182688;
				public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768. _346_4_1913867024 _346_4_1913867024;
				public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768. ExampleCodeField exampleCodeField;
				public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768. CopyExampleCodeUsage copyExampleCodeUsage;

				public _344_3_0277848768(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_345_4_11026182688 == null) _345_4_11026182688 = register(new _345_4_11026182688(box()).<_345_4_11026182688>id("a1091133766").owner(AbstractLanguageExecutionTemplate.this));
					if (_346_4_1913867024 == null) _346_4_1913867024 = register(new _346_4_1913867024(box()).<_346_4_1913867024>id("a1062705499").owner(AbstractLanguageExecutionTemplate.this));
					if (exampleCodeField == null) exampleCodeField = register(new ExampleCodeField(box()).<ExampleCodeField>id("a_2098782753").owner(AbstractLanguageExecutionTemplate.this));
					if (copyExampleCodeUsage == null) copyExampleCodeUsage = register(new CopyExampleCodeUsage(box()).<CopyExampleCodeUsage>id("a_1421576677").owner(AbstractLanguageExecutionTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_345_4_11026182688 != null) _345_4_11026182688.unregister();
					if (_346_4_1913867024 != null) _346_4_1913867024.unregister();
					if (exampleCodeField != null) exampleCodeField.unregister();
					if (copyExampleCodeUsage != null) copyExampleCodeUsage.unregister();
				}

				public class _345_4_11026182688 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _345_4_11026182688(B box) {
						super(box);
						_value("Examples of code usage");
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

				public class _346_4_1913867024 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768._346_4_1913867024. _347_5_1646958599 _347_5_1646958599;
					public LanguageExecutionTemplate.VersionBlock.DependencyBlock._344_3_0277848768._346_4_1913867024. ExamplesCodeUsage examplesCodeUsage;

					public _346_4_1913867024(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_347_5_1646958599 == null) _347_5_1646958599 = register(new _347_5_1646958599(box()).<_347_5_1646958599>id("a720603545").owner(AbstractLanguageExecutionTemplate.this));
						if (examplesCodeUsage == null) examplesCodeUsage = AbstractLanguageExecutionTemplate.this.examplesCodeUsage = register(new ExamplesCodeUsage((EditorBox)box()).<ExamplesCodeUsage>id("a_2005641070").owner(AbstractLanguageExecutionTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_347_5_1646958599 != null) _347_5_1646958599.unregister();
						if (examplesCodeUsage != null) examplesCodeUsage.unregister();
					}

					public class _347_5_1646958599 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _347_5_1646958599(B box) {
							super(box);
							_value("Starting from a:");
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

					public class ExamplesCodeUsage extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,LinkTemplate, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,LinkTemplate, java.lang.Void> {

						public ExamplesCodeUsage(EditorBox box) {
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
						public LinkTemplate add(java.lang.Void value) {
							LinkTemplate child = new LinkTemplate(box());
							child.id(java.util.UUID.randomUUID().toString());
							add(child, "examplesCodeUsage");
							notifyAdd(child);
							return child;
						}
						@Override
						public void remove(LinkTemplate child) {
							removeChild(child, "examplesCodeUsage");
						}
						public void clear() {
							super.clear("examplesCodeUsage");
						}
					}
				}

				public class ExampleCodeField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

					public ExampleCodeField(B box) {
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

				public class CopyExampleCodeUsage extends io.intino.alexandria.ui.displays.components.CopyToClipboard<io.intino.alexandria.ui.displays.notifiers.CopyToClipboardNotifier, B>  {

					public CopyExampleCodeUsage(B box) {
						super(box);
						_title("Copy");
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

		public class DownloadsBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExecutionTemplate.VersionBlock.DownloadsBlock. _353_3_01947964710 _353_3_01947964710;
			public LanguageExecutionTemplate.VersionBlock.DownloadsBlock. _354_3_01301071905 _354_3_01301071905;
			public LanguageExecutionTemplate.VersionBlock.DownloadsBlock. Downloads downloads;

			public DownloadsBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_353_3_01947964710 == null) _353_3_01947964710 = register(new _353_3_01947964710(box()).<_353_3_01947964710>id("a1081932728").owner(AbstractLanguageExecutionTemplate.this));
				if (_354_3_01301071905 == null) _354_3_01301071905 = register(new _354_3_01301071905(box()).<_354_3_01301071905>id("a881121574").owner(AbstractLanguageExecutionTemplate.this));
				if (downloads == null) downloads = AbstractLanguageExecutionTemplate.this.downloads = register(new Downloads((EditorBox)box()).<Downloads>id("a_1536422860").owner(AbstractLanguageExecutionTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_353_3_01947964710 != null) _353_3_01947964710.unregister();
				if (_354_3_01301071905 != null) _354_3_01301071905.unregister();
				if (downloads != null) downloads.unregister();
			}

			public class _353_3_01947964710 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _353_3_01947964710(B box) {
					super(box);
					_value("Downloads");
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

			public class _354_3_01301071905 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExecutionTemplate.VersionBlock.DownloadsBlock._354_3_01301071905. _354_53_09543788 _354_53_09543788;

				public _354_3_01301071905(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_354_53_09543788 == null) _354_53_09543788 = register(new _354_53_09543788(box()).<_354_53_09543788>id("a1539721470").owner(AbstractLanguageExecutionTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_354_53_09543788 != null) _354_53_09543788.unregister();
				}

				public class _354_53_09543788 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _354_53_09543788(B box) {
						super(box);
						_value("Access all available resources related to this DSL");
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

			public class Downloads extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,DownloadTemplate, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,DownloadTemplate, java.lang.Void> {

				public Downloads(EditorBox box) {
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
				public DownloadTemplate add(java.lang.Void value) {
					DownloadTemplate child = new DownloadTemplate(box());
					child.id(java.util.UUID.randomUUID().toString());
					add(child, "downloads");
					notifyAdd(child);
					return child;
				}
				@Override
				public void remove(DownloadTemplate child) {
					removeChild(child, "downloads");
				}
				public void clear() {
					super.clear("downloads");
				}
			}
		}

		public class _357_2_11995941279 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExecutionTemplate.VersionBlock._357_2_11995941279. _358_3_0545022888 _358_3_0545022888;
			public LanguageExecutionTemplate.VersionBlock._357_2_11995941279. _359_3_0227271747 _359_3_0227271747;

			public _357_2_11995941279(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_358_3_0545022888 == null) _358_3_0545022888 = register(new _358_3_0545022888(box()).<_358_3_0545022888>id("a_2112442169").owner(AbstractLanguageExecutionTemplate.this));
				if (_359_3_0227271747 == null) _359_3_0227271747 = register(new _359_3_0227271747(box()).<_359_3_0227271747>id("a1155594317").owner(AbstractLanguageExecutionTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_358_3_0545022888 != null) _358_3_0545022888.unregister();
				if (_359_3_0227271747 != null) _359_3_0227271747.unregister();
			}

			public class _358_3_0545022888 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _358_3_0545022888(B box) {
					super(box);
					_value("2. Deploy the execution environment");
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

			public class _359_3_0227271747 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _359_3_0227271747(B box) {
					super(box);
					_value("After building your execution logic, deploy it to the target environment where models will be executed. This can be a local service, a remote server, a Docker container, or a Maven plugin — depending on your setup.");
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

		public class _361_2_11622853563 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public LanguageExecutionTemplate.VersionBlock._361_2_11622853563. _362_3_02123060716 _362_3_02123060716;
			public LanguageExecutionTemplate.VersionBlock._361_2_11622853563. _363_3_01606449462 _363_3_01606449462;
			public LanguageExecutionTemplate.VersionBlock._361_2_11622853563. _365_3_01432626862 _365_3_01432626862;
			public LanguageExecutionTemplate.VersionBlock._361_2_11622853563. _370_3_0926367879 _370_3_0926367879;

			public _361_2_11622853563(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_362_3_02123060716 == null) _362_3_02123060716 = register(new _362_3_02123060716(box()).<_362_3_02123060716>id("a1953272361").owner(AbstractLanguageExecutionTemplate.this));
				if (_363_3_01606449462 == null) _363_3_01606449462 = register(new _363_3_01606449462(box()).<_363_3_01606449462>id("a_1795142022").owner(AbstractLanguageExecutionTemplate.this));
				if (_365_3_01432626862 == null) _365_3_01432626862 = register(new _365_3_01432626862(box()).<_365_3_01432626862>id("a_2021322058").owner(AbstractLanguageExecutionTemplate.this));
				if (_370_3_0926367879 == null) _370_3_0926367879 = register(new _370_3_0926367879(box()).<_370_3_0926367879>id("a492698895").owner(AbstractLanguageExecutionTemplate.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_362_3_02123060716 != null) _362_3_02123060716.unregister();
				if (_363_3_01606449462 != null) _363_3_01606449462.unregister();
				if (_365_3_01432626862 != null) _365_3_01432626862.unregister();
				if (_370_3_0926367879 != null) _370_3_0926367879.unregister();
			}

			public class _362_3_02123060716 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _362_3_02123060716(B box) {
					super(box);
					_value("3. How to execute models");
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

			public class _363_3_01606449462 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _363_3_01606449462(B box) {
					super(box);
					_value("Once the runtime environment has been deployed, users will be able to execute their models via a visible action in the model editor. You must define the label for that action and specify its behavior when triggered.");
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

			public class _365_3_01432626862 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862. _366_4_01674700447 _366_4_01674700447;
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862. _367_4_01721010791 _367_4_01721010791;
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862. _368_4_0500723504 _368_4_0500723504;

				public _365_3_01432626862(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_366_4_01674700447 == null) _366_4_01674700447 = register(new _366_4_01674700447(box()).<_366_4_01674700447>id("a84683897").owner(AbstractLanguageExecutionTemplate.this));
					if (_367_4_01721010791 == null) _367_4_01721010791 = register(new _367_4_01721010791(box()).<_367_4_01721010791>id("a1093642909").owner(AbstractLanguageExecutionTemplate.this));
					if (_368_4_0500723504 == null) _368_4_0500723504 = register(new _368_4_0500723504(box()).<_368_4_0500723504>id("a_2104464771").owner(AbstractLanguageExecutionTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_366_4_01674700447 != null) _366_4_01674700447.unregister();
					if (_367_4_01721010791 != null) _367_4_01721010791.unregister();
					if (_368_4_0500723504 != null) _368_4_0500723504.unregister();
				}

				public class _366_4_01674700447 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _366_4_01674700447(B box) {
						super(box);
						_value("3.1 Name the action users will see");
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

				public class _367_4_01721010791 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862._367_4_01721010791. _367_54_0483258430 _367_54_0483258430;

					public _367_4_01721010791(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_367_54_0483258430 == null) _367_54_0483258430 = register(new _367_54_0483258430(box()).<_367_54_0483258430>id("a1529377547").owner(AbstractLanguageExecutionTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_367_54_0483258430 != null) _367_54_0483258430.unregister();
					}

					public class _367_54_0483258430 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _367_54_0483258430(B box) {
							super(box);
							_value("Choose the label that users will click to execute a model. It could be something like Execute, Run, Deploy, or Build — whatever best describes what your DSL does.");
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

				public class _368_4_0500723504 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._365_3_01432626862._368_4_0500723504. NameField nameField;

					public _368_4_0500723504(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (nameField == null) nameField = register(new NameField(box()).<NameField>id("a1103221654").owner(AbstractLanguageExecutionTemplate.this));
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
			}

			public class _370_3_0926367879 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. _371_4_11039819967 _371_4_11039819967;
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. _372_4_1159382633 _372_4_1159382633;
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. ExecutionSelector executionSelector;
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. NoneEnvironmentBlock noneEnvironmentBlock;
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. RemoteEnvironmentBlock remoteEnvironmentBlock;
				public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879. LocalEnvironmentBlock localEnvironmentBlock;

				public _370_3_0926367879(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_371_4_11039819967 == null) _371_4_11039819967 = register(new _371_4_11039819967(box()).<_371_4_11039819967>id("a1425380151").owner(AbstractLanguageExecutionTemplate.this));
					if (_372_4_1159382633 == null) _372_4_1159382633 = register(new _372_4_1159382633(box()).<_372_4_1159382633>id("a1492676389").owner(AbstractLanguageExecutionTemplate.this));
					if (executionSelector == null) executionSelector = register(new ExecutionSelector(box()).<ExecutionSelector>id("a_861741228").owner(AbstractLanguageExecutionTemplate.this));
					if (noneEnvironmentBlock == null) noneEnvironmentBlock = register(new NoneEnvironmentBlock(box()).<NoneEnvironmentBlock>id("a_2104844235").owner(AbstractLanguageExecutionTemplate.this));
					if (remoteEnvironmentBlock == null) remoteEnvironmentBlock = register(new RemoteEnvironmentBlock(box()).<RemoteEnvironmentBlock>id("a_460656509").owner(AbstractLanguageExecutionTemplate.this));
					if (localEnvironmentBlock == null) localEnvironmentBlock = register(new LocalEnvironmentBlock(box()).<LocalEnvironmentBlock>id("a_295267966").owner(AbstractLanguageExecutionTemplate.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_371_4_11039819967 != null) _371_4_11039819967.unregister();
					if (_372_4_1159382633 != null) _372_4_1159382633.unregister();
					if (executionSelector != null) executionSelector.unregister();
					if (noneEnvironmentBlock != null) noneEnvironmentBlock.unregister();
					if (remoteEnvironmentBlock != null) remoteEnvironmentBlock.unregister();
					if (localEnvironmentBlock != null) localEnvironmentBlock.unregister();
				}

				public class _371_4_11039819967 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _371_4_11039819967(B box) {
						super(box);
						_value("3.2 Choose how the action will be triggered");
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

				public class _372_4_1159382633 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879._372_4_1159382633. _372_54_01106762286 _372_54_01106762286;

					public _372_4_1159382633(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_372_54_01106762286 == null) _372_54_01106762286 = register(new _372_54_01106762286(box()).<_372_54_01106762286>id("a809937027").owner(AbstractLanguageExecutionTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_372_54_01106762286 != null) _372_54_01106762286.unregister();
					}

					public class _372_54_01106762286 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _372_54_01106762286(B box) {
							super(box);
							_value("Define what should be executed when the action is triggered. This connects it to your runtime logic.");
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

				public class ExecutionSelector extends io.intino.alexandria.ui.displays.components.SelectorRadioBox<io.intino.alexandria.ui.displays.notifiers.SelectorRadioBoxNotifier, B>  {
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.ExecutionSelector. NoneOption noneOption;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.ExecutionSelector. RemoteOption remoteOption;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.ExecutionSelector. LocalOption localOption;

					public ExecutionSelector(B box) {
						super(box);
						_multipleSelection(false);
					}

					@Override
					public void init() {
						super.init();
						if (noneOption == null) noneOption = register(new NoneOption(box()).<NoneOption>id("a810890136").owner(AbstractLanguageExecutionTemplate.this));
						if (remoteOption == null) remoteOption = register(new RemoteOption(box()).<RemoteOption>id("a318354278").owner(AbstractLanguageExecutionTemplate.this));
						if (localOption == null) localOption = register(new LocalOption(box()).<LocalOption>id("a2007218005").owner(AbstractLanguageExecutionTemplate.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (noneOption != null) noneOption.unregister();
						if (remoteOption != null) remoteOption.unregister();
						if (localOption != null) localOption.unregister();
					}

					public class NoneOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

						public NoneOption(B box) {
							super(box);

							name("noneOption");
							_value("No execution method defined (yet)");
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

					public class RemoteOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

						public RemoteOption(B box) {
							super(box);

							name("remoteOption");
							_value("Invoke via URL");
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

					public class LocalOption extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {

						public LocalOption(B box) {
							super(box);

							name("localOption");
							_value("Manual script execution");
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

				public class NoneEnvironmentBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.NoneEnvironmentBlock. _380_5_01862905066 _380_5_01862905066;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.NoneEnvironmentBlock. _381_5_01757672307 _381_5_01757672307;

					public NoneEnvironmentBlock(B box) {
						super(box);
					}

					@Override
					public void initConditional() {
						super.init();
						if (_380_5_01862905066 == null) _380_5_01862905066 = register(new _380_5_01862905066(box()).<_380_5_01862905066>id("a984554802").owner(AbstractLanguageExecutionTemplate.this));
						if (_381_5_01757672307 == null) _381_5_01757672307 = register(new _381_5_01757672307(box()).<_381_5_01757672307>id("a_1675174929").owner(AbstractLanguageExecutionTemplate.this));
						if (AbstractLanguageExecutionTemplate.this._380_5_01862905066 == null) AbstractLanguageExecutionTemplate.this._380_5_01862905066 = versionBlock._361_2_11622853563._370_3_0926367879.noneEnvironmentBlock._380_5_01862905066;
						if (AbstractLanguageExecutionTemplate.this._381_5_01757672307 == null) AbstractLanguageExecutionTemplate.this._381_5_01757672307 = versionBlock._361_2_11622853563._370_3_0926367879.noneEnvironmentBlock._381_5_01757672307;
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_380_5_01862905066 != null) _380_5_01862905066.unregister();
						if (_381_5_01757672307 != null) _381_5_01757672307.unregister();
					}

					public class _380_5_01862905066 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _380_5_01862905066(B box) {
							super(box);
							_value("If your runtime environment is not ready, you can keep this option.");
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

					public class _381_5_01757672307 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _381_5_01757672307(B box) {
							super(box);
							_value("The model will be available, but users won’t be able to run it until a method is provided.");
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

				public class RemoteEnvironmentBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock. _384_5_0534849154 _384_5_0534849154;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock. _385_5_1372059646 _385_5_1372059646;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock. _386_5_0558309155 _386_5_0558309155;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock. RemoteField remoteField;

					public RemoteEnvironmentBlock(B box) {
						super(box);
					}

					@Override
					public void initConditional() {
						super.init();
						if (_384_5_0534849154 == null) _384_5_0534849154 = register(new _384_5_0534849154(box()).<_384_5_0534849154>id("a_1736270058").owner(AbstractLanguageExecutionTemplate.this));
						if (_385_5_1372059646 == null) _385_5_1372059646 = register(new _385_5_1372059646(box()).<_385_5_1372059646>id("a1849728509").owner(AbstractLanguageExecutionTemplate.this));
						if (_386_5_0558309155 == null) _386_5_0558309155 = register(new _386_5_0558309155(box()).<_386_5_0558309155>id("a_153559048").owner(AbstractLanguageExecutionTemplate.this));
						if (remoteField == null) remoteField = register(new RemoteField(box()).<RemoteField>id("a_1494575464").owner(AbstractLanguageExecutionTemplate.this));
						if (AbstractLanguageExecutionTemplate.this._384_5_0534849154 == null) AbstractLanguageExecutionTemplate.this._384_5_0534849154 = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._384_5_0534849154;
						if (AbstractLanguageExecutionTemplate.this._385_5_1372059646 == null) AbstractLanguageExecutionTemplate.this._385_5_1372059646 = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._385_5_1372059646;
						if (AbstractLanguageExecutionTemplate.this._387_6_0498024614 == null) AbstractLanguageExecutionTemplate.this._387_6_0498024614 = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._386_5_0558309155._387_6_0498024614;
						if (AbstractLanguageExecutionTemplate.this.copyRemoteExample == null) AbstractLanguageExecutionTemplate.this.copyRemoteExample = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock._386_5_0558309155.copyRemoteExample;
						if (AbstractLanguageExecutionTemplate.this.remoteField == null) AbstractLanguageExecutionTemplate.this.remoteField = versionBlock._361_2_11622853563._370_3_0926367879.remoteEnvironmentBlock.remoteField;
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_384_5_0534849154 != null) _384_5_0534849154.unregister();
						if (_385_5_1372059646 != null) _385_5_1372059646.unregister();
						if (_386_5_0558309155 != null) _386_5_0558309155.unregister();
						if (remoteField != null) remoteField.unregister();
					}

					public class _384_5_0534849154 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _384_5_0534849154(B box) {
							super(box);
							_value("If your runtime is accessible through an API or web service, specify the URL that will be called to execute the model.");
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

					public class _385_5_1372059646 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _385_5_1372059646(B box) {
							super(box);
							_value("Use the placeholder [commit] to reference the model version. It will be automatically replaced at runtime. Ensure the endpoint is reachable and accepts requests in the expected format. You can update this configuration at any time if the endpoint or parameters change.");
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

					public class _386_5_0558309155 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock._386_5_0558309155. _387_6_0498024614 _387_6_0498024614;
						public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.RemoteEnvironmentBlock._386_5_0558309155. CopyRemoteExample copyRemoteExample;

						public _386_5_0558309155(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_387_6_0498024614 == null) _387_6_0498024614 = register(new _387_6_0498024614(box()).<_387_6_0498024614>id("a_961775325").owner(AbstractLanguageExecutionTemplate.this));
							if (copyRemoteExample == null) copyRemoteExample = register(new CopyRemoteExample(box()).<CopyRemoteExample>id("a1934250035").owner(AbstractLanguageExecutionTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_387_6_0498024614 != null) _387_6_0498024614.unregister();
							if (copyRemoteExample != null) copyRemoteExample.unregister();
						}

						public class _387_6_0498024614 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _387_6_0498024614(B box) {
								super(box);
								_value("Example:");
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

						public class CopyRemoteExample extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

							public CopyRemoteExample(B box) {
								super(box);
								_title("https://your-application.com/run?model=[commit]");
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

					public class RemoteField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

						public RemoteField(B box) {
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

				public class LocalEnvironmentBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. _392_5_01192781532 _392_5_01192781532;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. _393_5_0769756298 _393_5_0769756298;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. _394_5_01780576244 _394_5_01780576244;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. LocalField localField;
					public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock. _398_5_11681945786 _398_5_11681945786;

					public LocalEnvironmentBlock(B box) {
						super(box);
					}

					@Override
					public void initConditional() {
						super.init();
						if (_392_5_01192781532 == null) _392_5_01192781532 = register(new _392_5_01192781532(box()).<_392_5_01192781532>id("a360940142").owner(AbstractLanguageExecutionTemplate.this));
						if (_393_5_0769756298 == null) _393_5_0769756298 = register(new _393_5_0769756298(box()).<_393_5_0769756298>id("a980333025").owner(AbstractLanguageExecutionTemplate.this));
						if (_394_5_01780576244 == null) _394_5_01780576244 = register(new _394_5_01780576244(box()).<_394_5_01780576244>id("a1840365455").owner(AbstractLanguageExecutionTemplate.this));
						if (localField == null) localField = register(new LocalField(box()).<LocalField>id("a1239997228").owner(AbstractLanguageExecutionTemplate.this));
						if (_398_5_11681945786 == null) _398_5_11681945786 = register(new _398_5_11681945786(box()).<_398_5_11681945786>id("a290366065").owner(AbstractLanguageExecutionTemplate.this));
						if (AbstractLanguageExecutionTemplate.this._392_5_01192781532 == null) AbstractLanguageExecutionTemplate.this._392_5_01192781532 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._392_5_01192781532;
						if (AbstractLanguageExecutionTemplate.this._393_5_0769756298 == null) AbstractLanguageExecutionTemplate.this._393_5_0769756298 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._393_5_0769756298;
						if (AbstractLanguageExecutionTemplate.this._395_6_11061402165 == null) AbstractLanguageExecutionTemplate.this._395_6_11061402165 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._394_5_01780576244._395_6_11061402165;
						if (AbstractLanguageExecutionTemplate.this.exampleTemplates == null) AbstractLanguageExecutionTemplate.this.exampleTemplates = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._394_5_01780576244.exampleTemplates;
						if (AbstractLanguageExecutionTemplate.this.localField == null) AbstractLanguageExecutionTemplate.this.localField = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock.localField;
						if (AbstractLanguageExecutionTemplate.this._399_6_0770136175 == null) AbstractLanguageExecutionTemplate.this._399_6_0770136175 = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._398_5_11681945786._399_6_0770136175;
						if (AbstractLanguageExecutionTemplate.this.installationField == null) AbstractLanguageExecutionTemplate.this.installationField = versionBlock._361_2_11622853563._370_3_0926367879.localEnvironmentBlock._398_5_11681945786.installationField;
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_392_5_01192781532 != null) _392_5_01192781532.unregister();
						if (_393_5_0769756298 != null) _393_5_0769756298.unregister();
						if (_394_5_01780576244 != null) _394_5_01780576244.unregister();
						if (localField != null) localField.unregister();
						if (_398_5_11681945786 != null) _398_5_11681945786.unregister();
					}

					public class _392_5_01192781532 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _392_5_01192781532(B box) {
							super(box);
							_value("If the model must be executed manually specify the command users should copy and run.");
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

					public class _393_5_0769756298 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

						public _393_5_0769756298(B box) {
							super(box);
							_value("Include the placeholder [commit] or [commit-url] where the model version should be inserted. These values will be resolved automatically at runtime. You can use a predefined template or customize the command to match your environment (e.g., Maven, Docker, shell script). This configuration can be updated at any time.");
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

					public class _394_5_01780576244 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock._394_5_01780576244. _395_6_11061402165 _395_6_11061402165;
						public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock._394_5_01780576244. ExampleTemplates exampleTemplates;

						public _394_5_01780576244(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_395_6_11061402165 == null) _395_6_11061402165 = register(new _395_6_11061402165(box()).<_395_6_11061402165>id("a1675080876").owner(AbstractLanguageExecutionTemplate.this));
							if (exampleTemplates == null) exampleTemplates = AbstractLanguageExecutionTemplate.this.exampleTemplates = register(new ExampleTemplates((EditorBox)box()).<ExampleTemplates>id("a95994318").owner(AbstractLanguageExecutionTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_395_6_11061402165 != null) _395_6_11061402165.unregister();
							if (exampleTemplates != null) exampleTemplates.unregister();
						}

						public class _395_6_11061402165 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _395_6_11061402165(B box) {
								super(box);
								_value("Example templates:");
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

						public class ExampleTemplates extends io.intino.alexandria.ui.displays.components.Multiple<EditorBox,LinkTemplate, java.lang.Void> implements io.intino.alexandria.ui.displays.components.multiple.NonCollapsable<EditorBox,LinkTemplate, java.lang.Void> {

							public ExampleTemplates(EditorBox box) {
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
							public LinkTemplate add(java.lang.Void value) {
								LinkTemplate child = new LinkTemplate(box());
								child.id(java.util.UUID.randomUUID().toString());
								add(child, "exampleTemplates");
								notifyAdd(child);
								return child;
							}
							@Override
							public void remove(LinkTemplate child) {
								removeChild(child, "exampleTemplates");
							}
							public void clear() {
								super.clear("exampleTemplates");
							}
						}
					}

					public class LocalField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

						public LocalField(B box) {
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

					public class _398_5_11681945786 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock._398_5_11681945786. _399_6_0770136175 _399_6_0770136175;
						public LanguageExecutionTemplate.VersionBlock._361_2_11622853563._370_3_0926367879.LocalEnvironmentBlock._398_5_11681945786. InstallationField installationField;

						public _398_5_11681945786(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_399_6_0770136175 == null) _399_6_0770136175 = register(new _399_6_0770136175(box()).<_399_6_0770136175>id("a_879231916").owner(AbstractLanguageExecutionTemplate.this));
							if (installationField == null) installationField = register(new InstallationField(box()).<InstallationField>id("a855908325").owner(AbstractLanguageExecutionTemplate.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_399_6_0770136175 != null) _399_6_0770136175.unregister();
							if (installationField != null) installationField.unregister();
						}

						public class _399_6_0770136175 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public _399_6_0770136175(B box) {
								super(box);
								_value("If your execution environment requires any setup or dependencies, include a URL where users can find the installation steps");
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

						public class InstallationField extends io.intino.alexandria.ui.displays.components.TextEditable<io.intino.alexandria.ui.displays.notifiers.TextEditableNotifier, B>  {

							public InstallationField(B box) {
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
		}
	}
}