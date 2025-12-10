package io.quassar.editor.box.ui.displays.templates;

import io.intino.alexandria.core.Box;
import io.intino.alexandria.exceptions.*;
import io.intino.alexandria.ui.displays.components.*;
import io.quassar.editor.box.ui.*;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.displays.templates.*;






import io.quassar.editor.box.ui.displays.items.*;

import io.intino.alexandria.ui.displays.notifiers.TemplateNotifier;

public abstract class AbstractModelEditor<B extends Box> extends io.intino.alexandria.ui.displays.components.Template<TemplateNotifier, java.lang.Void, B> {
	public ModelHeaderTemplate headerStamp;
	public LanguageNotLoadedBlock languageNotLoadedBlock;
	public ModelEditor.LanguageNotLoadedBlock. _102_2_1967939483 _102_2_1967939483;
	public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483. _103_3_1129787487 _103_3_1129787487;
	public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483._103_3_1129787487. V v;
	public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483._103_3_1129787487. _105_4_0921518501 _105_4_0921518501;
	public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483._103_3_1129787487. _106_4_01675759383 _106_4_01675759383;
	public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483._103_3_1129787487._106_4_01675759383. InfoTrigger infoTrigger;
	public ContentBlock contentBlock;
	public ModelEditor.ContentBlock. CollapsedLeftPanel collapsedLeftPanel;
	public ModelEditor.ContentBlock.CollapsedLeftPanel. _111_3_198885653 _111_3_198885653;
	public ModelEditor.ContentBlock.CollapsedLeftPanel. _112_3_0589281369 _112_3_0589281369;
	public ModelEditor.ContentBlock.CollapsedLeftPanel._112_3_0589281369. _113_4_1928365741 _113_4_1928365741;
	public ModelEditor.ContentBlock.CollapsedLeftPanel._112_3_0589281369._113_4_1928365741. ExpandLeftPanel expandLeftPanel;
	public ModelEditor.ContentBlock.CollapsedLeftPanel. CollapsedTabSelector collapsedTabSelector;
	public ModelEditor.ContentBlock.CollapsedLeftPanel.CollapsedTabSelector. CollapsedModel collapsedModel;
	public ModelEditor.ContentBlock.CollapsedLeftPanel.CollapsedTabSelector.CollapsedModel. _116_63_01577630199 _116_63_01577630199;
	public ModelEditor.ContentBlock.CollapsedLeftPanel.CollapsedTabSelector. CollapsedResources collapsedResources;
	public ModelEditor.ContentBlock.CollapsedLeftPanel.CollapsedTabSelector.CollapsedResources. _117_67_11932558814 _117_67_11932558814;
	public ModelEditor.ContentBlock. ModelEditionBlock modelEditionBlock;
	public ModelEditor.ContentBlock.ModelEditionBlock. _120_3_1193192471 _120_3_1193192471;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471. MainView mainView;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView. _122_5_1364434019 _122_5_1364434019;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView._122_5_1364434019. _123_6_1858428361 _123_6_1858428361;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView._122_5_1364434019._123_6_1858428361. CollapseLeftPanel collapseLeftPanel;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView. TabSelector tabSelector;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView.TabSelector. Model model;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView.TabSelector.Model. _126_56_01577630199 _126_56_01577630199;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView.TabSelector. Resources resources;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView.TabSelector.Resources. _127_60_11932558814 _127_60_11932558814;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471. BrowserBlock browserBlock;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.BrowserBlock. ModelBrowserBlock modelBrowserBlock;
	public ModelBrowserTemplate modelBrowserStamp;
	public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.BrowserBlock. ResourcesBrowserBlock resourcesBrowserBlock;
	public ResourcesBrowserTemplate resourcesBrowserStamp;
	public ModelEditor.ContentBlock.ModelEditionBlock. _132_3_01717901515 _132_3_01717901515;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515. _133_4_12104062820 _133_4_12104062820;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820. _134_5_1118579054 _134_5_1118579054;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054. Filename filename;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054. FileModifiedMessage fileModifiedMessage;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.FileModifiedMessage. _136_84_11697800197 _136_84_11697800197;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054. FileSavedMessage fileSavedMessage;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.FileSavedMessage. _137_81_12004947771 _137_81_12004947771;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820. _138_5_016264630 _138_5_016264630;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._138_5_016264630. _139_6_01753351573 _139_6_01753351573;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515. _140_4_11559512225 _140_4_11559512225;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225. _141_5_036616476 _141_5_036616476;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476. FileNotSelectedBlock fileNotSelectedBlock;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.FileNotSelectedBlock. _143_7_0553478274 _143_7_0553478274;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476. NonEditableFileBlock nonEditableFileBlock;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.NonEditableFileBlock. FileField fileField;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476. EditableFileBlock editableFileBlock;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.EditableFileBlock. IntinoDslEditor intinoDslEditor;
	public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225. ConsoleBlock consoleBlock;
	public ConsoleTemplate console;
	public ModelEditor.ContentBlock.ModelEditionBlock. _150_3_01764794007 _150_3_01764794007;
	public LanguageExplorer languageExplorer;
	public ModelEditor.ContentBlock. CollapsedRightPanel collapsedRightPanel;
	public ModelEditor.ContentBlock.CollapsedRightPanel. _154_3_0836395274 _154_3_0836395274;
	public ModelEditor.ContentBlock.CollapsedRightPanel. _155_3_0687299982 _155_3_0687299982;
	public ModelEditor.ContentBlock.CollapsedRightPanel._155_3_0687299982. _156_4_01805179722 _156_4_01805179722;
	public ModelEditor.ContentBlock.CollapsedRightPanel._155_3_0687299982._156_4_01805179722. ExpandRightPanel expandRightPanel;
	public ModelEditor.ContentBlock.CollapsedRightPanel. _158_3_11534454874 _158_3_11534454874;
	public ModelEditor.ContentBlock.CollapsedRightPanel._158_3_11534454874. _159_4_0628549713 _159_4_0628549713;
	public ModelEditor.ContentBlock.CollapsedRightPanel._158_3_11534454874._159_4_0628549713. ExpandRightPanelFull expandRightPanelFull;
	public FileModifiedDialog fileModifiedDialog;
	public ModelEditor.FileModifiedDialog. _162_8_02103315567 _162_8_02103315567;
	public ModelEditor.FileModifiedDialog._162_8_02103315567. _163_9_01861588655 _163_9_01861588655;
	public ModelEditor.FileModifiedDialog. _164_2_1955995399 _164_2_1955995399;
	public ModelEditor.FileModifiedDialog. _165_2_01485290650 _165_2_01485290650;
	public ModelEditor.FileModifiedDialog._165_2_01485290650. _166_3_1390960104 _166_3_1390960104;
	public ModelEditor.FileModifiedDialog._165_2_01485290650._166_3_1390960104. CancelSavingFile cancelSavingFile;
	public ModelEditor.FileModifiedDialog._165_2_01485290650. _168_3_1979788291 _168_3_1979788291;
	public ModelEditor.FileModifiedDialog._165_2_01485290650._168_3_1979788291. ContinueWithoutSavingFile continueWithoutSavingFile;
	public ModelEditor.FileModifiedDialog._165_2_01485290650._168_3_1979788291. ContinueSavingFile continueSavingFile;
	public HelpDialog helpDialog;
	public ModelEditor.HelpDialog. _173_8_0894345034 _173_8_0894345034;
	public ModelEditor.HelpDialog._173_8_0894345034. HelpStamp helpStamp;
	public ModelEditor.HelpDialog. _175_2_1955995399 _175_2_1955995399;
	public ModelEditor.HelpDialog. _176_2_01484254327 _176_2_01484254327;
	public ModelEditor.HelpDialog._176_2_01484254327. _177_3_11966637681 _177_3_11966637681;
	public EditorHelpDialog editorHelpDialog;
	public ModelEditor.EditorHelpDialog. _180_8_1232048914 _180_8_1232048914;
	public ModelEditor.EditorHelpDialog._180_8_1232048914. EditorHelpStamp editorHelpStamp;
	public ModelEditor.EditorHelpDialog. _182_2_1955995399 _182_2_1955995399;
	public ModelEditor.EditorHelpDialog. _183_2_0402099530 _183_2_0402099530;
	public ModelEditor.EditorHelpDialog._183_2_0402099530. _184_3_0191606434 _184_3_0191606434;
	public SettingsDialog settingsDialog;
	public ModelEditor.SettingsDialog. _187_8_090071333 _187_8_090071333;
	public ModelSettingsEditor modelSettingsEditor;
	public ModelEditor.SettingsDialog. _189_2_1955995399 _189_2_1955995399;
	public ModelEditor.SettingsDialog. _190_2_1917088331 _190_2_1917088331;
	public ModelEditor.SettingsDialog._190_2_1917088331. _191_3_1416153875 _191_3_1416153875;

	public AbstractModelEditor(B box) {
		super(box);
		id("modelEditor");
	}

	@Override
	public void init() {
		super.init();
		if (headerStamp == null) headerStamp = register(new ModelHeaderTemplate((EditorBox)box()).id("a_2106529490"));
		if (languageNotLoadedBlock == null) languageNotLoadedBlock = register(new LanguageNotLoadedBlock(box()).<LanguageNotLoadedBlock>id("a_1383072459").owner(AbstractModelEditor.this));
		if (languageNotLoadedBlock != null) _102_2_1967939483 = languageNotLoadedBlock._102_2_1967939483;
		if (_102_2_1967939483 != null) _103_3_1129787487 = languageNotLoadedBlock._102_2_1967939483._103_3_1129787487;
		if (_103_3_1129787487 != null) v = languageNotLoadedBlock._102_2_1967939483._103_3_1129787487.v;
		if (_103_3_1129787487 != null) _105_4_0921518501 = languageNotLoadedBlock._102_2_1967939483._103_3_1129787487._105_4_0921518501;
		if (_103_3_1129787487 != null) _106_4_01675759383 = languageNotLoadedBlock._102_2_1967939483._103_3_1129787487._106_4_01675759383;
		if (_106_4_01675759383 != null) infoTrigger = languageNotLoadedBlock._102_2_1967939483._103_3_1129787487._106_4_01675759383.infoTrigger;
		if (contentBlock == null) contentBlock = register(new ContentBlock(box()).<ContentBlock>id("a_2078270820").owner(AbstractModelEditor.this));
		if (contentBlock != null) collapsedLeftPanel = contentBlock.collapsedLeftPanel;
		if (collapsedLeftPanel != null) _111_3_198885653 = contentBlock.collapsedLeftPanel._111_3_198885653;
		if (collapsedLeftPanel != null) _112_3_0589281369 = contentBlock.collapsedLeftPanel._112_3_0589281369;
		if (_112_3_0589281369 != null) _113_4_1928365741 = contentBlock.collapsedLeftPanel._112_3_0589281369._113_4_1928365741;
		if (_113_4_1928365741 != null) expandLeftPanel = contentBlock.collapsedLeftPanel._112_3_0589281369._113_4_1928365741.expandLeftPanel;
		if (collapsedLeftPanel != null) collapsedTabSelector = contentBlock.collapsedLeftPanel.collapsedTabSelector;
		if (collapsedTabSelector != null) collapsedModel = contentBlock.collapsedLeftPanel.collapsedTabSelector.collapsedModel;
		if (collapsedModel != null) _116_63_01577630199 = contentBlock.collapsedLeftPanel.collapsedTabSelector.collapsedModel._116_63_01577630199;
		if (collapsedTabSelector != null) collapsedResources = contentBlock.collapsedLeftPanel.collapsedTabSelector.collapsedResources;
		if (collapsedResources != null) _117_67_11932558814 = contentBlock.collapsedLeftPanel.collapsedTabSelector.collapsedResources._117_67_11932558814;
		if (contentBlock != null) modelEditionBlock = contentBlock.modelEditionBlock;
		if (modelEditionBlock != null) _120_3_1193192471 = contentBlock.modelEditionBlock._120_3_1193192471;
		if (_120_3_1193192471 != null) mainView = contentBlock.modelEditionBlock._120_3_1193192471.mainView;
		if (mainView != null) _122_5_1364434019 = contentBlock.modelEditionBlock._120_3_1193192471.mainView._122_5_1364434019;
		if (_122_5_1364434019 != null) _123_6_1858428361 = contentBlock.modelEditionBlock._120_3_1193192471.mainView._122_5_1364434019._123_6_1858428361;
		if (_123_6_1858428361 != null) collapseLeftPanel = contentBlock.modelEditionBlock._120_3_1193192471.mainView._122_5_1364434019._123_6_1858428361.collapseLeftPanel;
		if (mainView != null) tabSelector = contentBlock.modelEditionBlock._120_3_1193192471.mainView.tabSelector;
		if (tabSelector != null) model = contentBlock.modelEditionBlock._120_3_1193192471.mainView.tabSelector.model;
		if (model != null) _126_56_01577630199 = contentBlock.modelEditionBlock._120_3_1193192471.mainView.tabSelector.model._126_56_01577630199;
		if (tabSelector != null) resources = contentBlock.modelEditionBlock._120_3_1193192471.mainView.tabSelector.resources;
		if (resources != null) _127_60_11932558814 = contentBlock.modelEditionBlock._120_3_1193192471.mainView.tabSelector.resources._127_60_11932558814;
		if (_120_3_1193192471 != null) browserBlock = contentBlock.modelEditionBlock._120_3_1193192471.browserBlock;
		if (browserBlock != null) modelBrowserBlock = contentBlock.modelEditionBlock._120_3_1193192471.browserBlock.modelBrowserBlock;
		if (modelBrowserBlock != null) modelBrowserStamp = contentBlock.modelEditionBlock._120_3_1193192471.browserBlock.modelBrowserBlock.modelBrowserStamp;
		if (browserBlock != null) resourcesBrowserBlock = contentBlock.modelEditionBlock._120_3_1193192471.browserBlock.resourcesBrowserBlock;
		if (resourcesBrowserBlock != null) resourcesBrowserStamp = contentBlock.modelEditionBlock._120_3_1193192471.browserBlock.resourcesBrowserBlock.resourcesBrowserStamp;
		if (modelEditionBlock != null) _132_3_01717901515 = contentBlock.modelEditionBlock._132_3_01717901515;
		if (_132_3_01717901515 != null) _133_4_12104062820 = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820;
		if (_133_4_12104062820 != null) _134_5_1118579054 = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054;
		if (_134_5_1118579054 != null) filename = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.filename;
		if (_134_5_1118579054 != null) fileModifiedMessage = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.fileModifiedMessage;
		if (fileModifiedMessage != null) _136_84_11697800197 = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.fileModifiedMessage._136_84_11697800197;
		if (_134_5_1118579054 != null) fileSavedMessage = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.fileSavedMessage;
		if (fileSavedMessage != null) _137_81_12004947771 = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.fileSavedMessage._137_81_12004947771;
		if (_133_4_12104062820 != null) _138_5_016264630 = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820._138_5_016264630;
		if (_138_5_016264630 != null) _139_6_01753351573 = contentBlock.modelEditionBlock._132_3_01717901515._133_4_12104062820._138_5_016264630._139_6_01753351573;
		if (_132_3_01717901515 != null) _140_4_11559512225 = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225;
		if (_140_4_11559512225 != null) _141_5_036616476 = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476;
		if (_141_5_036616476 != null) fileNotSelectedBlock = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.fileNotSelectedBlock;
		if (fileNotSelectedBlock != null) _143_7_0553478274 = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.fileNotSelectedBlock._143_7_0553478274;
		if (_141_5_036616476 != null) nonEditableFileBlock = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.nonEditableFileBlock;
		if (nonEditableFileBlock != null) fileField = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.nonEditableFileBlock.fileField;
		if (_141_5_036616476 != null) editableFileBlock = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.editableFileBlock;
		if (editableFileBlock != null) intinoDslEditor = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.editableFileBlock.intinoDslEditor;
		if (_140_4_11559512225 != null) consoleBlock = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225.consoleBlock;
		if (consoleBlock != null) console = contentBlock.modelEditionBlock._132_3_01717901515._140_4_11559512225.consoleBlock.console;
		if (modelEditionBlock != null) _150_3_01764794007 = contentBlock.modelEditionBlock._150_3_01764794007;
		if (_150_3_01764794007 != null) languageExplorer = contentBlock.modelEditionBlock._150_3_01764794007.languageExplorer;
		if (contentBlock != null) collapsedRightPanel = contentBlock.collapsedRightPanel;
		if (collapsedRightPanel != null) _154_3_0836395274 = contentBlock.collapsedRightPanel._154_3_0836395274;
		if (collapsedRightPanel != null) _155_3_0687299982 = contentBlock.collapsedRightPanel._155_3_0687299982;
		if (_155_3_0687299982 != null) _156_4_01805179722 = contentBlock.collapsedRightPanel._155_3_0687299982._156_4_01805179722;
		if (_156_4_01805179722 != null) expandRightPanel = contentBlock.collapsedRightPanel._155_3_0687299982._156_4_01805179722.expandRightPanel;
		if (collapsedRightPanel != null) _158_3_11534454874 = contentBlock.collapsedRightPanel._158_3_11534454874;
		if (_158_3_11534454874 != null) _159_4_0628549713 = contentBlock.collapsedRightPanel._158_3_11534454874._159_4_0628549713;
		if (_159_4_0628549713 != null) expandRightPanelFull = contentBlock.collapsedRightPanel._158_3_11534454874._159_4_0628549713.expandRightPanelFull;
		if (fileModifiedDialog == null) fileModifiedDialog = register(new FileModifiedDialog(box()).<FileModifiedDialog>id("a_2034001131").owner(AbstractModelEditor.this));
		if (fileModifiedDialog != null) _162_8_02103315567 = fileModifiedDialog._162_8_02103315567;
		if (_162_8_02103315567 != null) _163_9_01861588655 = fileModifiedDialog._162_8_02103315567._163_9_01861588655;
		if (fileModifiedDialog != null) _164_2_1955995399 = fileModifiedDialog._164_2_1955995399;
		if (fileModifiedDialog != null) _165_2_01485290650 = fileModifiedDialog._165_2_01485290650;
		if (_165_2_01485290650 != null) _166_3_1390960104 = fileModifiedDialog._165_2_01485290650._166_3_1390960104;
		if (_166_3_1390960104 != null) cancelSavingFile = fileModifiedDialog._165_2_01485290650._166_3_1390960104.cancelSavingFile;
		if (_165_2_01485290650 != null) _168_3_1979788291 = fileModifiedDialog._165_2_01485290650._168_3_1979788291;
		if (_168_3_1979788291 != null) continueWithoutSavingFile = fileModifiedDialog._165_2_01485290650._168_3_1979788291.continueWithoutSavingFile;
		if (_168_3_1979788291 != null) continueSavingFile = fileModifiedDialog._165_2_01485290650._168_3_1979788291.continueSavingFile;
		if (helpDialog == null) helpDialog = register(new HelpDialog(box()).<HelpDialog>id("a675233009").owner(AbstractModelEditor.this));
		if (helpDialog != null) _173_8_0894345034 = helpDialog._173_8_0894345034;
		if (_173_8_0894345034 != null) helpStamp = helpDialog._173_8_0894345034.helpStamp;
		if (helpDialog != null) _175_2_1955995399 = helpDialog._175_2_1955995399;
		if (helpDialog != null) _176_2_01484254327 = helpDialog._176_2_01484254327;
		if (_176_2_01484254327 != null) _177_3_11966637681 = helpDialog._176_2_01484254327._177_3_11966637681;
		if (editorHelpDialog == null) editorHelpDialog = register(new EditorHelpDialog(box()).<EditorHelpDialog>id("a1372270654").owner(AbstractModelEditor.this));
		if (editorHelpDialog != null) _180_8_1232048914 = editorHelpDialog._180_8_1232048914;
		if (_180_8_1232048914 != null) editorHelpStamp = editorHelpDialog._180_8_1232048914.editorHelpStamp;
		if (editorHelpDialog != null) _182_2_1955995399 = editorHelpDialog._182_2_1955995399;
		if (editorHelpDialog != null) _183_2_0402099530 = editorHelpDialog._183_2_0402099530;
		if (_183_2_0402099530 != null) _184_3_0191606434 = editorHelpDialog._183_2_0402099530._184_3_0191606434;
		if (settingsDialog == null) settingsDialog = register(new SettingsDialog(box()).<SettingsDialog>id("a1570550867").owner(AbstractModelEditor.this));
		if (settingsDialog != null) _187_8_090071333 = settingsDialog._187_8_090071333;
		if (_187_8_090071333 != null) modelSettingsEditor = settingsDialog._187_8_090071333.modelSettingsEditor;
		if (settingsDialog != null) _189_2_1955995399 = settingsDialog._189_2_1955995399;
		if (settingsDialog != null) _190_2_1917088331 = settingsDialog._190_2_1917088331;
		if (_190_2_1917088331 != null) _191_3_1416153875 = settingsDialog._190_2_1917088331._191_3_1416153875;




		if (modelBrowserBlock != null) modelBrowserBlock.bindTo(tabSelector, "model");
		if (resourcesBrowserBlock != null) resourcesBrowserBlock.bindTo(tabSelector, "resources");



		if (_139_6_01753351573 != null) _139_6_01753351573.bindTo(editorHelpDialog);


		if (_177_3_11966637681 != null) _177_3_11966637681.bindTo(helpDialog);


		if (_184_3_0191606434 != null) _184_3_0191606434.bindTo(editorHelpDialog);


		if (_191_3_1416153875 != null) _191_3_1416153875.bindTo(settingsDialog);
	}

	@Override
	public void remove() {
		super.remove();
		if (headerStamp != null) headerStamp.unregister();
		if (languageNotLoadedBlock != null) languageNotLoadedBlock.unregister();
		if (contentBlock != null) contentBlock.unregister();
		if (fileModifiedDialog != null) fileModifiedDialog.unregister();
		if (helpDialog != null) helpDialog.unregister();
		if (editorHelpDialog != null) editorHelpDialog.unregister();
		if (settingsDialog != null) settingsDialog.unregister();
	}

	public class LanguageNotLoadedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelEditor.LanguageNotLoadedBlock. _102_2_1967939483 _102_2_1967939483;

		public LanguageNotLoadedBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_102_2_1967939483 == null) _102_2_1967939483 = register(new _102_2_1967939483(box()).<_102_2_1967939483>id("a_1210235801").owner(AbstractModelEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_102_2_1967939483 != null) _102_2_1967939483.unregister();
		}

		public class _102_2_1967939483 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483. _103_3_1129787487 _103_3_1129787487;

			public _102_2_1967939483(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_103_3_1129787487 == null) _103_3_1129787487 = register(new _103_3_1129787487(box()).<_103_3_1129787487>id("a1152297132").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_103_3_1129787487 != null) _103_3_1129787487.unregister();
			}

			public class _103_3_1129787487 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483._103_3_1129787487. V v;
				public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483._103_3_1129787487. _105_4_0921518501 _105_4_0921518501;
				public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483._103_3_1129787487. _106_4_01675759383 _106_4_01675759383;

				public _103_3_1129787487(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (v == null) v = register(new V(box()).<V>id("a_983404054").owner(AbstractModelEditor.this));
					if (_105_4_0921518501 == null) _105_4_0921518501 = register(new _105_4_0921518501(box()).<_105_4_0921518501>id("a_314865975").owner(AbstractModelEditor.this));
					if (_106_4_01675759383 == null) _106_4_01675759383 = register(new _106_4_01675759383(box()).<_106_4_01675759383>id("a1009952736").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (v != null) v.unregister();
					if (_105_4_0921518501 != null) _105_4_0921518501.unregister();
					if (_106_4_01675759383 != null) _106_4_01675759383.unregister();
				}

				public class V extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public V(B box) {
						super(box);
						_value("Internal error");
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

				public class _105_4_0921518501 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

					public _105_4_0921518501(B box) {
						super(box);
						_value("Could not load model. Click the info button to use a different DSL version");
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

				public class _106_4_01675759383 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelEditor.LanguageNotLoadedBlock._102_2_1967939483._103_3_1129787487._106_4_01675759383. InfoTrigger infoTrigger;

					public _106_4_01675759383(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (infoTrigger == null) infoTrigger = register(new InfoTrigger(box()).<InfoTrigger>id("a_1530003742").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (infoTrigger != null) infoTrigger.unregister();
					}

					public class InfoTrigger extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

						public InfoTrigger(B box) {
							super(box);
							_title("info");
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

	public class ContentBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
		public ModelEditor.ContentBlock. CollapsedLeftPanel collapsedLeftPanel;
		public ModelEditor.ContentBlock. ModelEditionBlock modelEditionBlock;
		public ModelEditor.ContentBlock. CollapsedRightPanel collapsedRightPanel;

		public ContentBlock(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (collapsedLeftPanel == null) collapsedLeftPanel = register(new CollapsedLeftPanel(box()).<CollapsedLeftPanel>id("a757691433").owner(AbstractModelEditor.this));
			if (modelEditionBlock == null) modelEditionBlock = register(new ModelEditionBlock(box()).<ModelEditionBlock>id("a874886229").owner(AbstractModelEditor.this));
			if (collapsedRightPanel == null) collapsedRightPanel = register(new CollapsedRightPanel(box()).<CollapsedRightPanel>id("a_1403062052").owner(AbstractModelEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (collapsedLeftPanel != null) collapsedLeftPanel.unregister();
			if (modelEditionBlock != null) modelEditionBlock.unregister();
			if (collapsedRightPanel != null) collapsedRightPanel.unregister();
		}

		public class CollapsedLeftPanel extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.ContentBlock.CollapsedLeftPanel. _111_3_198885653 _111_3_198885653;
			public ModelEditor.ContentBlock.CollapsedLeftPanel. _112_3_0589281369 _112_3_0589281369;
			public ModelEditor.ContentBlock.CollapsedLeftPanel. CollapsedTabSelector collapsedTabSelector;

			public CollapsedLeftPanel(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_111_3_198885653 == null) _111_3_198885653 = register(new _111_3_198885653(box()).<_111_3_198885653>id("a_1668300820").owner(AbstractModelEditor.this));
				if (_112_3_0589281369 == null) _112_3_0589281369 = register(new _112_3_0589281369(box()).<_112_3_0589281369>id("a_1128531117").owner(AbstractModelEditor.this));
				if (collapsedTabSelector == null) collapsedTabSelector = register(new CollapsedTabSelector(box()).<CollapsedTabSelector>id("a785188371").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_111_3_198885653 != null) _111_3_198885653.unregister();
				if (_112_3_0589281369 != null) _112_3_0589281369.unregister();
				if (collapsedTabSelector != null) collapsedTabSelector.unregister();
			}

			public class _111_3_198885653 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {

				public _111_3_198885653(B box) {
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

			public class _112_3_0589281369 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelEditor.ContentBlock.CollapsedLeftPanel._112_3_0589281369. _113_4_1928365741 _113_4_1928365741;

				public _112_3_0589281369(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_113_4_1928365741 == null) _113_4_1928365741 = register(new _113_4_1928365741(box()).<_113_4_1928365741>id("a1622712824").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_113_4_1928365741 != null) _113_4_1928365741.unregister();
				}

				public class _113_4_1928365741 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelEditor.ContentBlock.CollapsedLeftPanel._112_3_0589281369._113_4_1928365741. ExpandLeftPanel expandLeftPanel;

					public _113_4_1928365741(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (expandLeftPanel == null) expandLeftPanel = register(new ExpandLeftPanel(box()).<ExpandLeftPanel>id("a1477050263").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (expandLeftPanel != null) expandLeftPanel.unregister();
					}

					public class ExpandLeftPanel extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

						public ExpandLeftPanel(B box) {
							super(box);
							_title("open edition");
							_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
							_icon("ChevronRight");
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

			public class CollapsedTabSelector extends io.intino.alexandria.ui.displays.components.SelectorListBox<io.intino.alexandria.ui.displays.notifiers.SelectorListBoxNotifier, B>  {
				public ModelEditor.ContentBlock.CollapsedLeftPanel.CollapsedTabSelector. CollapsedModel collapsedModel;
				public ModelEditor.ContentBlock.CollapsedLeftPanel.CollapsedTabSelector. CollapsedResources collapsedResources;

				public CollapsedTabSelector(B box) {
					super(box);
					_multipleSelection(false);
				}

				@Override
				public void init() {
					super.init();
					if (collapsedModel == null) collapsedModel = register(new CollapsedModel(box()).<CollapsedModel>id("a_1210140994").owner(AbstractModelEditor.this));
					if (collapsedResources == null) collapsedResources = register(new CollapsedResources(box()).<CollapsedResources>id("a_1445615814").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (collapsedModel != null) collapsedModel.unregister();
					if (collapsedResources != null) collapsedResources.unregister();
				}

				public class CollapsedModel extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {
					public ModelEditor.ContentBlock.CollapsedLeftPanel.CollapsedTabSelector.CollapsedModel. _116_63_01577630199 _116_63_01577630199;

					public CollapsedModel(B box) {
						super(box);

						name("collapsedModel");
					}

					@Override
					public void init() {
						super.init();
						if (_116_63_01577630199 == null) _116_63_01577630199 = register(new _116_63_01577630199(box()).<_116_63_01577630199>id("a_358324041").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_116_63_01577630199 != null) _116_63_01577630199.unregister();
					}

					public class _116_63_01577630199 extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

						public _116_63_01577630199(B box) {
							super(box);
							_icon("DescriptionOutlined");
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

				public class CollapsedResources extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {
					public ModelEditor.ContentBlock.CollapsedLeftPanel.CollapsedTabSelector.CollapsedResources. _117_67_11932558814 _117_67_11932558814;

					public CollapsedResources(B box) {
						super(box);

						name("collapsedResources");
					}

					@Override
					public void init() {
						super.init();
						if (_117_67_11932558814 == null) _117_67_11932558814 = register(new _117_67_11932558814(box()).<_117_67_11932558814>id("a_1646927681").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_117_67_11932558814 != null) _117_67_11932558814.unregister();
					}

					public class _117_67_11932558814 extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

						public _117_67_11932558814(B box) {
							super(box);
							_icon("AccountTreeOutlined");
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

		public class ModelEditionBlock extends io.intino.alexandria.ui.displays.components.BlockResizable<io.intino.alexandria.ui.displays.notifiers.BlockResizableNotifier, B>  {
			public ModelEditor.ContentBlock.ModelEditionBlock. _120_3_1193192471 _120_3_1193192471;
			public ModelEditor.ContentBlock.ModelEditionBlock. _132_3_01717901515 _132_3_01717901515;
			public ModelEditor.ContentBlock.ModelEditionBlock. _150_3_01764794007 _150_3_01764794007;

			public ModelEditionBlock(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_120_3_1193192471 == null) _120_3_1193192471 = register(new _120_3_1193192471(box()).<_120_3_1193192471>id("a_794946289").owner(AbstractModelEditor.this));
				if (_132_3_01717901515 == null) _132_3_01717901515 = register(new _132_3_01717901515(box()).<_132_3_01717901515>id("a_2004540213").owner(AbstractModelEditor.this));
				if (_150_3_01764794007 == null) _150_3_01764794007 = register(new _150_3_01764794007(box()).<_150_3_01764794007>id("a_38033627").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_120_3_1193192471 != null) _120_3_1193192471.unregister();
				if (_132_3_01717901515 != null) _132_3_01717901515.unregister();
				if (_150_3_01764794007 != null) _150_3_01764794007.unregister();
			}

			public class _120_3_1193192471 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471. MainView mainView;
				public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471. BrowserBlock browserBlock;

				public _120_3_1193192471(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (mainView == null) mainView = register(new MainView(box()).<MainView>id("a77992175").owner(AbstractModelEditor.this));
					if (browserBlock == null) browserBlock = register(new BrowserBlock(box()).<BrowserBlock>id("a_1286315338").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (mainView != null) mainView.unregister();
					if (browserBlock != null) browserBlock.unregister();
				}

				public class MainView extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView. _122_5_1364434019 _122_5_1364434019;
					public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView. TabSelector tabSelector;

					public MainView(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_122_5_1364434019 == null) _122_5_1364434019 = register(new _122_5_1364434019(box()).<_122_5_1364434019>id("a1920173482").owner(AbstractModelEditor.this));
						if (tabSelector == null) tabSelector = register(new TabSelector(box()).<TabSelector>id("a131412804").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_122_5_1364434019 != null) _122_5_1364434019.unregister();
						if (tabSelector != null) tabSelector.unregister();
					}

					public class _122_5_1364434019 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView._122_5_1364434019. _123_6_1858428361 _123_6_1858428361;

						public _122_5_1364434019(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_123_6_1858428361 == null) _123_6_1858428361 = register(new _123_6_1858428361(box()).<_123_6_1858428361>id("a_1867598426").owner(AbstractModelEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_123_6_1858428361 != null) _123_6_1858428361.unregister();
						}

						public class _123_6_1858428361 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView._122_5_1364434019._123_6_1858428361. CollapseLeftPanel collapseLeftPanel;

							public _123_6_1858428361(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (collapseLeftPanel == null) collapseLeftPanel = register(new CollapseLeftPanel(box()).<CollapseLeftPanel>id("a_789325563").owner(AbstractModelEditor.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (collapseLeftPanel != null) collapseLeftPanel.unregister();
							}

							public class CollapseLeftPanel extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

								public CollapseLeftPanel(B box) {
									super(box);
									_title("close edition");
									_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
									_icon("ChevronLeft");
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

					public class TabSelector extends io.intino.alexandria.ui.displays.components.SelectorListBox<io.intino.alexandria.ui.displays.notifiers.SelectorListBoxNotifier, B> implements io.intino.alexandria.ui.displays.components.addressable.Addressed<TabSelector> {
						public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView.TabSelector. Model model;
						public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView.TabSelector. Resources resources;

						public TabSelector(B box) {
							super(box);
							_multipleSelection(false);
							_path("/models/:language/:model/:release");
						}

						@Override
						public void init() {
							super.init();
							if (model == null) model = register(new Model(box()).<Model>id("a_1487204754").owner(AbstractModelEditor.this));
							if (resources == null) resources = register(new Resources(box()).<Resources>id("a1325311722").owner(AbstractModelEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (model != null) model.unregister();
							if (resources != null) resources.unregister();
						}
						@Override
						public TabSelector address(java.util.function.Function<String, String> addressFromPathResolver) {
							address(addressFromPathResolver.apply(path()));
							return this;
						}
						public class Model extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {
							public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView.TabSelector.Model. _126_56_01577630199 _126_56_01577630199;

							public Model(B box) {
								super(box);

								name("model");
							}

							@Override
							public void init() {
								super.init();
								if (_126_56_01577630199 == null) _126_56_01577630199 = register(new _126_56_01577630199(box()).<_126_56_01577630199>id("a588066892").owner(AbstractModelEditor.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (_126_56_01577630199 != null) _126_56_01577630199.unregister();
							}

							public class _126_56_01577630199 extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

								public _126_56_01577630199(B box) {
									super(box);
									_icon("DescriptionOutlined");
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

						public class Resources extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B> implements io.intino.alexandria.ui.displays.components.selector.SelectorOption {
							public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.MainView.TabSelector.Resources. _127_60_11932558814 _127_60_11932558814;

							public Resources(B box) {
								super(box);

								name("resources");
							}

							@Override
							public void init() {
								super.init();
								if (_127_60_11932558814 == null) _127_60_11932558814 = register(new _127_60_11932558814(box()).<_127_60_11932558814>id("a_272181015").owner(AbstractModelEditor.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (_127_60_11932558814 != null) _127_60_11932558814.unregister();
							}

							public class _127_60_11932558814 extends io.intino.alexandria.ui.displays.components.MaterialIcon<io.intino.alexandria.ui.displays.notifiers.MaterialIconNotifier, B>  {

								public _127_60_11932558814(B box) {
									super(box);
									_icon("AccountTreeOutlined");
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

				public class BrowserBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.BrowserBlock. ModelBrowserBlock modelBrowserBlock;
					public ModelEditor.ContentBlock.ModelEditionBlock._120_3_1193192471.BrowserBlock. ResourcesBrowserBlock resourcesBrowserBlock;

					public BrowserBlock(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (modelBrowserBlock == null) modelBrowserBlock = register(new ModelBrowserBlock(box()).<ModelBrowserBlock>id("a_709261627").owner(AbstractModelEditor.this));
						if (resourcesBrowserBlock == null) resourcesBrowserBlock = register(new ResourcesBrowserBlock(box()).<ResourcesBrowserBlock>id("a_1005093823").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (modelBrowserBlock != null) modelBrowserBlock.unregister();
						if (resourcesBrowserBlock != null) resourcesBrowserBlock.unregister();
					}

					public class ModelBrowserBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
						public ModelBrowserTemplate modelBrowserStamp;

						public ModelBrowserBlock(B box) {
							super(box);
						}

						@Override
						public void initConditional() {
							super.init();
							if (modelBrowserStamp == null) modelBrowserStamp = AbstractModelEditor.this.modelBrowserStamp = register(new ModelBrowserTemplate((EditorBox)box()).id("a210527306"));
							if (AbstractModelEditor.this.modelBrowserStamp == null) AbstractModelEditor.this.modelBrowserStamp = contentBlock.modelEditionBlock._120_3_1193192471.browserBlock.modelBrowserBlock.modelBrowserStamp;
						}

						@Override
						public void unregister() {
							super.unregister();
							if (modelBrowserStamp != null) modelBrowserStamp.unregister();
						}
					}

					public class ResourcesBrowserBlock extends io.intino.alexandria.ui.displays.components.BlockConditional<io.intino.alexandria.ui.displays.notifiers.BlockConditionalNotifier, B>  {
						public ResourcesBrowserTemplate resourcesBrowserStamp;

						public ResourcesBrowserBlock(B box) {
							super(box);
						}

						@Override
						public void initConditional() {
							super.init();
							if (resourcesBrowserStamp == null) resourcesBrowserStamp = AbstractModelEditor.this.resourcesBrowserStamp = register(new ResourcesBrowserTemplate((EditorBox)box()).id("a_1301083454"));
							if (AbstractModelEditor.this.resourcesBrowserStamp == null) AbstractModelEditor.this.resourcesBrowserStamp = contentBlock.modelEditionBlock._120_3_1193192471.browserBlock.resourcesBrowserBlock.resourcesBrowserStamp;
						}

						@Override
						public void unregister() {
							super.unregister();
							if (resourcesBrowserStamp != null) resourcesBrowserStamp.unregister();
						}
					}
				}
			}

			public class _132_3_01717901515 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515. _133_4_12104062820 _133_4_12104062820;
				public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515. _140_4_11559512225 _140_4_11559512225;

				public _132_3_01717901515(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_133_4_12104062820 == null) _133_4_12104062820 = register(new _133_4_12104062820(box()).<_133_4_12104062820>id("a_1220041226").owner(AbstractModelEditor.this));
					if (_140_4_11559512225 == null) _140_4_11559512225 = register(new _140_4_11559512225(box()).<_140_4_11559512225>id("a3557292").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_133_4_12104062820 != null) _133_4_12104062820.unregister();
					if (_140_4_11559512225 != null) _140_4_11559512225.unregister();
				}

				public class _133_4_12104062820 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820. _134_5_1118579054 _134_5_1118579054;
					public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820. _138_5_016264630 _138_5_016264630;

					public _133_4_12104062820(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_134_5_1118579054 == null) _134_5_1118579054 = register(new _134_5_1118579054(box()).<_134_5_1118579054>id("a_557675225").owner(AbstractModelEditor.this));
						if (_138_5_016264630 == null) _138_5_016264630 = register(new _138_5_016264630(box()).<_138_5_016264630>id("a_1490749516").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_134_5_1118579054 != null) _134_5_1118579054.unregister();
						if (_138_5_016264630 != null) _138_5_016264630.unregister();
					}

					public class _134_5_1118579054 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054. Filename filename;
						public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054. FileModifiedMessage fileModifiedMessage;
						public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054. FileSavedMessage fileSavedMessage;

						public _134_5_1118579054(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (filename == null) filename = register(new Filename(box()).<Filename>id("a_818499277").owner(AbstractModelEditor.this));
							if (fileModifiedMessage == null) fileModifiedMessage = register(new FileModifiedMessage(box()).<FileModifiedMessage>id("a_1004545738").owner(AbstractModelEditor.this));
							if (fileSavedMessage == null) fileSavedMessage = register(new FileSavedMessage(box()).<FileSavedMessage>id("a176780872").owner(AbstractModelEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (filename != null) filename.unregister();
							if (fileModifiedMessage != null) fileModifiedMessage.unregister();
							if (fileSavedMessage != null) fileSavedMessage.unregister();
						}

						public class Filename extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

							public Filename(B box) {
								super(box);
								_value("");
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

						public class FileModifiedMessage extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.FileModifiedMessage. _136_84_11697800197 _136_84_11697800197;

							public FileModifiedMessage(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (_136_84_11697800197 == null) _136_84_11697800197 = register(new _136_84_11697800197(box()).<_136_84_11697800197>id("a_730801367").owner(AbstractModelEditor.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (_136_84_11697800197 != null) _136_84_11697800197.unregister();
							}

							public class _136_84_11697800197 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

								public _136_84_11697800197(B box) {
									super(box);
									_value("modified");
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

						public class FileSavedMessage extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._134_5_1118579054.FileSavedMessage. _137_81_12004947771 _137_81_12004947771;

							public FileSavedMessage(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (_137_81_12004947771 == null) _137_81_12004947771 = register(new _137_81_12004947771(box()).<_137_81_12004947771>id("a_894037356").owner(AbstractModelEditor.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (_137_81_12004947771 != null) _137_81_12004947771.unregister();
							}

							public class _137_81_12004947771 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

								public _137_81_12004947771(B box) {
									super(box);
									_value("saved");
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

					public class _138_5_016264630 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._133_4_12104062820._138_5_016264630. _139_6_01753351573 _139_6_01753351573;

						public _138_5_016264630(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (_139_6_01753351573 == null) _139_6_01753351573 = register(new _139_6_01753351573(box()).<_139_6_01753351573>id("a1842629518").owner(AbstractModelEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (_139_6_01753351573 != null) _139_6_01753351573.unregister();
						}

						public class _139_6_01753351573 extends io.intino.alexandria.ui.displays.components.OpenDialog<io.intino.alexandria.ui.displays.notifiers.OpenDialogNotifier, B>  {

							public _139_6_01753351573(B box) {
								super(box);
								_title("shortcuts");
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

				public class _140_4_11559512225 extends io.intino.alexandria.ui.displays.components.BlockResizable<io.intino.alexandria.ui.displays.notifiers.BlockResizableNotifier, B>  {
					public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225. _141_5_036616476 _141_5_036616476;
					public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225. ConsoleBlock consoleBlock;

					public _140_4_11559512225(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (_141_5_036616476 == null) _141_5_036616476 = register(new _141_5_036616476(box()).<_141_5_036616476>id("a795946659").owner(AbstractModelEditor.this));
						if (consoleBlock == null) consoleBlock = register(new ConsoleBlock(box()).<ConsoleBlock>id("a_154782840").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (_141_5_036616476 != null) _141_5_036616476.unregister();
						if (consoleBlock != null) consoleBlock.unregister();
					}

					public class _141_5_036616476 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476. FileNotSelectedBlock fileNotSelectedBlock;
						public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476. NonEditableFileBlock nonEditableFileBlock;
						public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476. EditableFileBlock editableFileBlock;

						public _141_5_036616476(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (fileNotSelectedBlock == null) fileNotSelectedBlock = register(new FileNotSelectedBlock(box()).<FileNotSelectedBlock>id("a_1443717685").owner(AbstractModelEditor.this));
							if (nonEditableFileBlock == null) nonEditableFileBlock = register(new NonEditableFileBlock(box()).<NonEditableFileBlock>id("a_1712024400").owner(AbstractModelEditor.this));
							if (editableFileBlock == null) editableFileBlock = register(new EditableFileBlock(box()).<EditableFileBlock>id("a_1282614563").owner(AbstractModelEditor.this));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (fileNotSelectedBlock != null) fileNotSelectedBlock.unregister();
							if (nonEditableFileBlock != null) nonEditableFileBlock.unregister();
							if (editableFileBlock != null) editableFileBlock.unregister();
						}

						public class FileNotSelectedBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.FileNotSelectedBlock. _143_7_0553478274 _143_7_0553478274;

							public FileNotSelectedBlock(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (_143_7_0553478274 == null) _143_7_0553478274 = register(new _143_7_0553478274(box()).<_143_7_0553478274>id("a88815839").owner(AbstractModelEditor.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (_143_7_0553478274 != null) _143_7_0553478274.unregister();
							}

							public class _143_7_0553478274 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

								public _143_7_0553478274(B box) {
									super(box);
									_value("Select file on left panel to open it");
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

						public class NonEditableFileBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.NonEditableFileBlock. FileField fileField;

							public NonEditableFileBlock(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (fileField == null) fileField = register(new FileField(box()).<FileField>id("a_1527956465").owner(AbstractModelEditor.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (fileField != null) fileField.unregister();
							}

							public class FileField extends io.intino.alexandria.ui.displays.components.File<io.intino.alexandria.ui.displays.notifiers.FileNotifier, B>  {

								public FileField(B box) {
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

						public class EditableFileBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
							public ModelEditor.ContentBlock.ModelEditionBlock._132_3_01717901515._140_4_11559512225._141_5_036616476.EditableFileBlock. IntinoDslEditor intinoDslEditor;

							public EditableFileBlock(B box) {
								super(box);
							}

							@Override
							public void init() {
								super.init();
								if (intinoDslEditor == null) intinoDslEditor = AbstractModelEditor.this.intinoDslEditor = register(new IntinoDslEditor(box()).<IntinoDslEditor>id("a_51814195").owner(AbstractModelEditor.this));
							}

							@Override
							public void unregister() {
								super.unregister();
								if (intinoDslEditor != null) intinoDslEditor.unregister();
							}

							public class IntinoDslEditor extends io.intino.alexandria.ui.displays.components.DisplayStamp<io.intino.alexandria.ui.displays.notifiers.DisplayStampNotifier, B>  {

								public IntinoDslEditor(B box) {
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

					public class ConsoleBlock extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
						public ConsoleTemplate console;

						public ConsoleBlock(B box) {
							super(box);
						}

						@Override
						public void init() {
							super.init();
							if (console == null) console = AbstractModelEditor.this.console = register(new ConsoleTemplate((EditorBox)box()).id("a_58411104"));
						}

						@Override
						public void unregister() {
							super.unregister();
							if (console != null) console.unregister();
						}
					}
				}
			}

			public class _150_3_01764794007 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public LanguageExplorer languageExplorer;

				public _150_3_01764794007(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (languageExplorer == null) languageExplorer = AbstractModelEditor.this.languageExplorer = register(new LanguageExplorer((EditorBox)box()).id("a762624043"));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (languageExplorer != null) languageExplorer.unregister();
				}
			}
		}

		public class CollapsedRightPanel extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.ContentBlock.CollapsedRightPanel. _154_3_0836395274 _154_3_0836395274;
			public ModelEditor.ContentBlock.CollapsedRightPanel. _155_3_0687299982 _155_3_0687299982;
			public ModelEditor.ContentBlock.CollapsedRightPanel. _158_3_11534454874 _158_3_11534454874;

			public CollapsedRightPanel(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_154_3_0836395274 == null) _154_3_0836395274 = register(new _154_3_0836395274(box()).<_154_3_0836395274>id("a_1528983966").owner(AbstractModelEditor.this));
				if (_155_3_0687299982 == null) _155_3_0687299982 = register(new _155_3_0687299982(box()).<_155_3_0687299982>id("a_1731483428").owner(AbstractModelEditor.this));
				if (_158_3_11534454874 == null) _158_3_11534454874 = register(new _158_3_11534454874(box()).<_158_3_11534454874>id("a1651033701").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_154_3_0836395274 != null) _154_3_0836395274.unregister();
				if (_155_3_0687299982 != null) _155_3_0687299982.unregister();
				if (_158_3_11534454874 != null) _158_3_11534454874.unregister();
			}

			public class _154_3_0836395274 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {

				public _154_3_0836395274(B box) {
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

			public class _155_3_0687299982 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelEditor.ContentBlock.CollapsedRightPanel._155_3_0687299982. _156_4_01805179722 _156_4_01805179722;

				public _155_3_0687299982(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_156_4_01805179722 == null) _156_4_01805179722 = register(new _156_4_01805179722(box()).<_156_4_01805179722>id("a1800355384").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_156_4_01805179722 != null) _156_4_01805179722.unregister();
				}

				public class _156_4_01805179722 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelEditor.ContentBlock.CollapsedRightPanel._155_3_0687299982._156_4_01805179722. ExpandRightPanel expandRightPanel;

					public _156_4_01805179722(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (expandRightPanel == null) expandRightPanel = register(new ExpandRightPanel(box()).<ExpandRightPanel>id("a_958843825").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (expandRightPanel != null) expandRightPanel.unregister();
					}

					public class ExpandRightPanel extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

						public ExpandRightPanel(B box) {
							super(box);
							_title("open panel");
							_mode(io.intino.alexandria.ui.displays.components.Actionable.Mode.valueOf("MaterialIconButton"));
							_icon("ChevronLeft");
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

			public class _158_3_11534454874 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelEditor.ContentBlock.CollapsedRightPanel._158_3_11534454874. _159_4_0628549713 _159_4_0628549713;

				public _158_3_11534454874(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (_159_4_0628549713 == null) _159_4_0628549713 = register(new _159_4_0628549713(box()).<_159_4_0628549713>id("a_885111437").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (_159_4_0628549713 != null) _159_4_0628549713.unregister();
				}

				public class _159_4_0628549713 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
					public ModelEditor.ContentBlock.CollapsedRightPanel._158_3_11534454874._159_4_0628549713. ExpandRightPanelFull expandRightPanelFull;

					public _159_4_0628549713(B box) {
						super(box);
					}

					@Override
					public void init() {
						super.init();
						if (expandRightPanelFull == null) expandRightPanelFull = register(new ExpandRightPanelFull(box()).<ExpandRightPanelFull>id("a_2019641317").owner(AbstractModelEditor.this));
					}

					@Override
					public void unregister() {
						super.unregister();
						if (expandRightPanelFull != null) expandRightPanelFull.unregister();
					}

					public class ExpandRightPanelFull extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

						public ExpandRightPanelFull(B box) {
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
				}
			}
		}
	}

	public class FileModifiedDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public ModelEditor.FileModifiedDialog. _162_8_02103315567 _162_8_02103315567;
		public ModelEditor.FileModifiedDialog. _164_2_1955995399 _164_2_1955995399;
		public ModelEditor.FileModifiedDialog. _165_2_01485290650 _165_2_01485290650;

		public FileModifiedDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_162_8_02103315567 == null) _162_8_02103315567 = register(new _162_8_02103315567(box()).<_162_8_02103315567>id("a286167875").owner(AbstractModelEditor.this));
			if (_164_2_1955995399 == null) _164_2_1955995399 = register(new _164_2_1955995399(box()).<_164_2_1955995399>id("a1256083352").owner(AbstractModelEditor.this));
			if (_165_2_01485290650 == null) _165_2_01485290650 = register(new _165_2_01485290650(box()).<_165_2_01485290650>id("a_140376697").owner(AbstractModelEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_162_8_02103315567 != null) _162_8_02103315567.unregister();
			if (_164_2_1955995399 != null) _164_2_1955995399.unregister();
			if (_165_2_01485290650 != null) _165_2_01485290650.unregister();
		}

		public class _162_8_02103315567 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.FileModifiedDialog._162_8_02103315567. _163_9_01861588655 _163_9_01861588655;

			public _162_8_02103315567(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_163_9_01861588655 == null) _163_9_01861588655 = register(new _163_9_01861588655(box()).<_163_9_01861588655>id("a_952714869").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_163_9_01861588655 != null) _163_9_01861588655.unregister();
			}

			public class _163_9_01861588655 extends io.intino.alexandria.ui.displays.components.Text<io.intino.alexandria.ui.displays.notifiers.TextNotifier, B>  {

				public _163_9_01861588655(B box) {
					super(box);
					_value("File have been modified. What do you want to do?");
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

		public class _164_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _164_2_1955995399(B box) {
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

		public class _165_2_01485290650 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.FileModifiedDialog._165_2_01485290650. _166_3_1390960104 _166_3_1390960104;
			public ModelEditor.FileModifiedDialog._165_2_01485290650. _168_3_1979788291 _168_3_1979788291;

			public _165_2_01485290650(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_166_3_1390960104 == null) _166_3_1390960104 = register(new _166_3_1390960104(box()).<_166_3_1390960104>id("a2034044291").owner(AbstractModelEditor.this));
				if (_168_3_1979788291 == null) _168_3_1979788291 = register(new _168_3_1979788291(box()).<_168_3_1979788291>id("a_1080091677").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_166_3_1390960104 != null) _166_3_1390960104.unregister();
				if (_168_3_1979788291 != null) _168_3_1979788291.unregister();
			}

			public class _166_3_1390960104 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelEditor.FileModifiedDialog._165_2_01485290650._166_3_1390960104. CancelSavingFile cancelSavingFile;

				public _166_3_1390960104(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (cancelSavingFile == null) cancelSavingFile = register(new CancelSavingFile(box()).<CancelSavingFile>id("a1215284703").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (cancelSavingFile != null) cancelSavingFile.unregister();
				}

				public class CancelSavingFile extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public CancelSavingFile(B box) {
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
			}

			public class _168_3_1979788291 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
				public ModelEditor.FileModifiedDialog._165_2_01485290650._168_3_1979788291. ContinueWithoutSavingFile continueWithoutSavingFile;
				public ModelEditor.FileModifiedDialog._165_2_01485290650._168_3_1979788291. ContinueSavingFile continueSavingFile;

				public _168_3_1979788291(B box) {
					super(box);
				}

				@Override
				public void init() {
					super.init();
					if (continueWithoutSavingFile == null) continueWithoutSavingFile = register(new ContinueWithoutSavingFile(box()).<ContinueWithoutSavingFile>id("a1208171082").owner(AbstractModelEditor.this));
					if (continueSavingFile == null) continueSavingFile = register(new ContinueSavingFile(box()).<ContinueSavingFile>id("a_69085878").owner(AbstractModelEditor.this));
				}

				@Override
				public void unregister() {
					super.unregister();
					if (continueWithoutSavingFile != null) continueWithoutSavingFile.unregister();
					if (continueSavingFile != null) continueSavingFile.unregister();
				}

				public class ContinueWithoutSavingFile extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public ContinueWithoutSavingFile(B box) {
						super(box);
						_title("Don't save");
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

				public class ContinueSavingFile extends io.intino.alexandria.ui.displays.components.Action<io.intino.alexandria.ui.displays.notifiers.ActionNotifier, B>  {

					public ContinueSavingFile(B box) {
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
	}

	public class HelpDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public ModelEditor.HelpDialog. _173_8_0894345034 _173_8_0894345034;
		public ModelEditor.HelpDialog. _175_2_1955995399 _175_2_1955995399;
		public ModelEditor.HelpDialog. _176_2_01484254327 _176_2_01484254327;

		public HelpDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_173_8_0894345034 == null) _173_8_0894345034 = register(new _173_8_0894345034(box()).<_173_8_0894345034>id("a120862250").owner(AbstractModelEditor.this));
			if (_175_2_1955995399 == null) _175_2_1955995399 = register(new _175_2_1955995399(box()).<_175_2_1955995399>id("a_986126764").owner(AbstractModelEditor.this));
			if (_176_2_01484254327 == null) _176_2_01484254327 = register(new _176_2_01484254327(box()).<_176_2_01484254327>id("a_1820495127").owner(AbstractModelEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_173_8_0894345034 != null) _173_8_0894345034.unregister();
			if (_175_2_1955995399 != null) _175_2_1955995399.unregister();
			if (_176_2_01484254327 != null) _176_2_01484254327.unregister();
		}

		public class _173_8_0894345034 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.HelpDialog._173_8_0894345034. HelpStamp helpStamp;

			public _173_8_0894345034(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (helpStamp == null) helpStamp = register(new HelpStamp(box()).<HelpStamp>id("a160899988").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (helpStamp != null) helpStamp.unregister();
			}

			public class HelpStamp extends io.intino.alexandria.ui.displays.components.HtmlViewer<io.intino.alexandria.ui.displays.notifiers.HtmlViewerNotifier, B>  {

				public HelpStamp(B box) {
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

		public class _175_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _175_2_1955995399(B box) {
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

		public class _176_2_01484254327 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.HelpDialog._176_2_01484254327. _177_3_11966637681 _177_3_11966637681;

			public _176_2_01484254327(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_177_3_11966637681 == null) _177_3_11966637681 = register(new _177_3_11966637681(box()).<_177_3_11966637681>id("a_1565011962").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_177_3_11966637681 != null) _177_3_11966637681.unregister();
			}

			public class _177_3_11966637681 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _177_3_11966637681(B box) {
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

	public class EditorHelpDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public ModelEditor.EditorHelpDialog. _180_8_1232048914 _180_8_1232048914;
		public ModelEditor.EditorHelpDialog. _182_2_1955995399 _182_2_1955995399;
		public ModelEditor.EditorHelpDialog. _183_2_0402099530 _183_2_0402099530;

		public EditorHelpDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_180_8_1232048914 == null) _180_8_1232048914 = register(new _180_8_1232048914(box()).<_180_8_1232048914>id("a_339139133").owner(AbstractModelEditor.this));
			if (_182_2_1955995399 == null) _182_2_1955995399 = register(new _182_2_1955995399(box()).<_182_2_1955995399>id("a223317445").owner(AbstractModelEditor.this));
			if (_183_2_0402099530 == null) _183_2_0402099530 = register(new _183_2_0402099530(box()).<_183_2_0402099530>id("a1612407750").owner(AbstractModelEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_180_8_1232048914 != null) _180_8_1232048914.unregister();
			if (_182_2_1955995399 != null) _182_2_1955995399.unregister();
			if (_183_2_0402099530 != null) _183_2_0402099530.unregister();
		}

		public class _180_8_1232048914 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.EditorHelpDialog._180_8_1232048914. EditorHelpStamp editorHelpStamp;

			public _180_8_1232048914(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (editorHelpStamp == null) editorHelpStamp = AbstractModelEditor.this.editorHelpStamp = register(new EditorHelpStamp(box()).<EditorHelpStamp>id("a_989763517").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (editorHelpStamp != null) editorHelpStamp.unregister();
			}

			public class EditorHelpStamp extends io.intino.alexandria.ui.displays.components.DisplayStamp<io.intino.alexandria.ui.displays.notifiers.DisplayStampNotifier, B>  {

				public EditorHelpStamp(B box) {
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

		public class _182_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _182_2_1955995399(B box) {
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

		public class _183_2_0402099530 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.EditorHelpDialog._183_2_0402099530. _184_3_0191606434 _184_3_0191606434;

			public _183_2_0402099530(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_184_3_0191606434 == null) _184_3_0191606434 = register(new _184_3_0191606434(box()).<_184_3_0191606434>id("a1874162714").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_184_3_0191606434 != null) _184_3_0191606434.unregister();
			}

			public class _184_3_0191606434 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _184_3_0191606434(B box) {
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

	public class SettingsDialog extends io.intino.alexandria.ui.displays.components.Dialog<io.intino.alexandria.ui.displays.notifiers.DialogNotifier, B>  {
		public ModelEditor.SettingsDialog. _187_8_090071333 _187_8_090071333;
		public ModelEditor.SettingsDialog. _189_2_1955995399 _189_2_1955995399;
		public ModelEditor.SettingsDialog. _190_2_1917088331 _190_2_1917088331;

		public SettingsDialog(B box) {
			super(box);
		}

		@Override
		public void init() {
			super.init();
			if (_187_8_090071333 == null) _187_8_090071333 = register(new _187_8_090071333(box()).<_187_8_090071333>id("a476102311").owner(AbstractModelEditor.this));
			if (_189_2_1955995399 == null) _189_2_1955995399 = register(new _189_2_1955995399(box()).<_189_2_1955995399>id("a223517171").owner(AbstractModelEditor.this));
			if (_190_2_1917088331 == null) _190_2_1917088331 = register(new _190_2_1917088331(box()).<_190_2_1917088331>id("a826365926").owner(AbstractModelEditor.this));
		}

		@Override
		public void unregister() {
			super.unregister();
			if (_187_8_090071333 != null) _187_8_090071333.unregister();
			if (_189_2_1955995399 != null) _189_2_1955995399.unregister();
			if (_190_2_1917088331 != null) _190_2_1917088331.unregister();
		}

		public class _187_8_090071333 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelSettingsEditor modelSettingsEditor;

			public _187_8_090071333(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (modelSettingsEditor == null) modelSettingsEditor = AbstractModelEditor.this.modelSettingsEditor = register(new ModelSettingsEditor((EditorBox)box()).id("a268997358"));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (modelSettingsEditor != null) modelSettingsEditor.unregister();
			}
		}

		public class _189_2_1955995399 extends io.intino.alexandria.ui.displays.components.Divider<io.intino.alexandria.ui.displays.notifiers.DividerNotifier, B>  {

			public _189_2_1955995399(B box) {
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

		public class _190_2_1917088331 extends io.intino.alexandria.ui.displays.components.Block<io.intino.alexandria.ui.displays.notifiers.BlockNotifier, B>  {
			public ModelEditor.SettingsDialog._190_2_1917088331. _191_3_1416153875 _191_3_1416153875;

			public _190_2_1917088331(B box) {
				super(box);
			}

			@Override
			public void init() {
				super.init();
				if (_191_3_1416153875 == null) _191_3_1416153875 = register(new _191_3_1416153875(box()).<_191_3_1416153875>id("a_151271465").owner(AbstractModelEditor.this));
			}

			@Override
			public void unregister() {
				super.unregister();
				if (_191_3_1416153875 != null) _191_3_1416153875.unregister();
			}

			public class _191_3_1416153875 extends io.intino.alexandria.ui.displays.components.CloseDialog<io.intino.alexandria.ui.displays.notifiers.CloseDialogNotifier, B>  {

				public _191_3_1416153875(B box) {
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