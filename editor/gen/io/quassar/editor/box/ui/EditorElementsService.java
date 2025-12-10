package io.quassar.editor.box.ui;
import io.quassar.editor.box.ui.displays.*;
import io.quassar.editor.box.ui.displays.notifiers.*;
import io.quassar.editor.box.ui.displays.requesters.*;
import io.quassar.editor.box.ui.resources.*;
import io.quassar.editor.box.EditorBox;
import io.quassar.editor.box.EditorConfiguration;

import io.intino.alexandria.ui.AlexandriaUiServer;
import io.intino.alexandria.ui.displays.notifiers.DisplayNotifier;
import io.intino.alexandria.ui.displays.notifiers.DisplayNotifierProvider;
import io.intino.alexandria.ui.displays.DisplayRouteDispatcher;
import io.intino.alexandria.ui.resources.AssetResourceLoader;
import io.intino.alexandria.ui.services.push.PushService;
import io.intino.alexandria.ui.server.resources.AfterDisplayRequest;
import io.intino.alexandria.ui.server.resources.AssetResource;
import io.intino.alexandria.ui.server.resources.AuthenticateCallbackResource;
import io.intino.alexandria.ui.server.resources.BeforeDisplayRequest;

import java.net.MalformedURLException;
import java.net.URL;

public class EditorElementsService extends io.intino.alexandria.ui.UI {

	public static void init(AlexandriaUiServer server, EditorBox box, PushService pushService, DisplayRouteDispatcher routeDispatcher) {
		EditorConfiguration configuration = (EditorConfiguration) box.configuration();
		box.routeManager(routeManager(server, routeDispatcher));
        server.route("/_alexandria/push").register(pushService);
        server.route("/authenticate-callback").get(manager -> new AuthenticateCallbackResource(manager, notifierProvider()).execute());
        server.route("/authenticate-callback/").get(manager -> new AuthenticateCallbackResource(manager, notifierProvider()).execute());
        server.route("/asset/:name").get(manager -> new AssetResource(name -> new AssetResourceLoader(box).load(name), manager, notifierProvider()).execute());
		server.route("/").get(manager -> new HomeResource(box, manager, notifierProvider()).execute());
		server.route("/about").get(manager -> new AboutResource(box, manager, notifierProvider()).execute());
		server.route("/collections/:collection").get(manager -> new CollectionResource(box, manager, notifierProvider()).execute());
		server.route("/models/:language").get(manager -> new LanguageResource(box, manager, notifierProvider()).execute());
		server.route("/models/:language/:action").get(manager -> new LanguageActionResource(box, manager, notifierProvider()).execute());
		server.route("/models/:language/:model/:release").get(manager -> new ModelResource(box, manager, notifierProvider()).execute());
		server.route("/forge/:model/:release").get(manager -> new ForgeResource(box, manager, notifierProvider()).execute());
		server.route("/login").get(manager -> new LoginResource(box, manager, notifierProvider()).execute());
		initExposedResources(box, server, pushService);
		initProxyDisplays(box, server, pushService);
		initDisplays(server, pushService);
	}

	public static void initExposedResources(io.intino.alexandria.ui.AlexandriaUiBox box, AlexandriaUiServer server, PushService pushService) {

	}

	public static void initProxyDisplays(io.intino.alexandria.ui.AlexandriaUiBox box, AlexandriaUiServer server, PushService pushService) {

	}

	public static void initDisplays(AlexandriaUiServer server, PushService pushService) {
		initCollaboratorsTemplate(server, pushService);
		initCollaboratorItemTemplate(server, pushService);
		initAddCollaboratorDialog(server, pushService);
		initModelNameViewer(server, pushService);
		initProjectViewer(server, pushService);
		initProjectModuleLinkViewer(server, pushService);
		initProjectModuleViewer(server, pushService);
		initProjectModuleEntryViewer(server, pushService);
		initModelNameDialog(server, pushService);
		initCommitModelDialog(server, pushService);
		initDownloadModelDialog(server, pushService);
		initModelSettingsEditor(server, pushService);
		initTagEditor(server, pushService);
		initCreateLanguageEditor(server, pushService);
		initLanguageEditor(server, pushService);
		initLanguageLogoDialog(server, pushService);
		initLanguageExecutionLauncher(server, pushService);
		initCreateCollectionDialog(server, pushService);
		initModelsDialog(server, pushService);
		initAddLicenseEditor(server, pushService);
		initLicenseDialog(server, pushService);
		initRenewLicenseDialog(server, pushService);
		initCollectionHeaderTemplate(server, pushService);
		initCollectionTemplate(server, pushService);
		initLicensesTemplate(server, pushService);
		initModelHeaderTemplate(server, pushService);
		initModelLanguageToolbar(server, pushService);
		initModelsTemplate(server, pushService);
		initModelTemplate(server, pushService);
		initModelEditor(server, pushService);
		initModelViewer(server, pushService);
		initModelBrowserTemplate(server, pushService);
		initResourcesBrowserTemplate(server, pushService);
		initBrowserTemplate(server, pushService);
		initIntinoFileBrowser(server, pushService);
		initIntinoDslEditor(server, pushService);
		initConsoleTemplate(server, pushService);
		initConsoleEntryTemplate(server, pushService);
		initEditorHelpDisplay(server, pushService);
		initForgeTemplate(server, pushService);
		initForgeHeaderTemplate(server, pushService);
		initLanguageHeaderTemplate(server, pushService);
		initLanguageToolbar(server, pushService);
		initLanguagesTemplate(server, pushService);
		initLanguagesLandingTemplate(server, pushService);
		initLanguagesCollectionTemplate(server, pushService);
		initLanguageTemplate(server, pushService);
		initLanguageExplorer(server, pushService);
		initLanguageForgeTemplate(server, pushService);
		initReleaseSelectorOption(server, pushService);
		initLanguageInfoTemplate(server, pushService);
		initLanguagePropertiesTemplate(server, pushService);
		initHelpEditor(server, pushService);
		initLanguageKitTemplate(server, pushService);
		initLanguageExecutionTemplate(server, pushService);
		initLinkTemplate(server, pushService);
		initDownloadTemplate(server, pushService);
		initDependencyTemplate(server, pushService);
		initLanguageReleaseHelp(server, pushService);
		initLandingTemplate(server, pushService);
		initHomeTemplate(server, pushService);
		initAboutTemplate(server, pushService);
		initHeaderTemplate(server, pushService);
		initUserHomeTemplate(server, pushService);
		initLicenseItemTemplate(server, pushService);
		initCollectionItemTemplate(server, pushService);
		initLoginTemplate(server, pushService);
		initLoginSelectorOption(server, pushService);
		initLicenseExpiredBanner(server, pushService);
		initGoogleLoginDisplay(server, pushService);
		initModelItem(server, pushService);
		initLanguageItem(server, pushService);
		initLanguageLandingItem(server, pushService);
		initLanguageCollectionItem(server, pushService);
		registerNotifiers();
	}

	private static void registerNotifiers() {
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.CollaboratorsTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.CollaboratorItemTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.AddCollaboratorDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelNameViewer.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ProjectViewer.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ProjectModuleLinkViewer.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ProjectModuleViewer.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ProjectModuleEntryViewer.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelNameDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.CommitModelDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.DownloadModelDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelSettingsEditor.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.TagEditor.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.CreateLanguageEditor.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageEditor.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageLogoDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageExecutionLauncher.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.CreateCollectionDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelsDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.AddLicenseEditor.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LicenseDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.RenewLicenseDialog.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.CollectionHeaderTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.CollectionTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LicensesTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelHeaderTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelLanguageToolbar.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelsTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelEditor.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelViewer.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ModelBrowserTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ResourcesBrowserTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.BrowserTemplate.class);
		register(IntinoFileBrowserNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.IntinoFileBrowser.class);
		register(IntinoDslEditorNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.IntinoDslEditor.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ConsoleTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ConsoleEntryTemplate.class);
		register(EditorHelpDisplayNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.EditorHelpDisplay.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ForgeTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ForgeHeaderTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageHeaderTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageToolbar.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguagesTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguagesLandingTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguagesCollectionTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageExplorer.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageForgeTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.ReleaseSelectorOption.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageInfoTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguagePropertiesTemplate.class);
		register(HelpEditorNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.HelpEditor.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageKitTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageExecutionTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LinkTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.DownloadTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.DependencyTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LanguageReleaseHelp.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LandingTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.HomeTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.AboutTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.HeaderTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.UserHomeTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LicenseItemTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.CollectionItemTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LoginTemplate.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LoginSelectorOption.class);
		register(io.intino.alexandria.ui.displays.notifiers.TemplateNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.templates.LicenseExpiredBanner.class);
		register(GoogleLoginDisplayNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.GoogleLoginDisplay.class);
		register(io.intino.alexandria.ui.displays.notifiers.ItemNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.items.ModelItem.class);
		register(io.intino.alexandria.ui.displays.notifiers.ItemNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.items.LanguageItem.class);
		register(io.intino.alexandria.ui.displays.notifiers.ItemNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.items.LanguageLandingItem.class);
		register(io.intino.alexandria.ui.displays.notifiers.ItemNotifier.class).forDisplay(io.quassar.editor.box.ui.displays.items.LanguageCollectionItem.class);
	}

	private static void initCollaboratorsTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/collaboratorstemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/collaboratorstemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/collaboratorstemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("collaboratorstemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initCollaboratorItemTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/collaboratoritemtemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/collaboratoritemtemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/collaboratoritemtemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("collaboratoritemtemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initAddCollaboratorDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/addcollaboratordialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/addcollaboratordialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/addcollaboratordialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("addcollaboratordialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelNameViewer(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelnameviewer/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelnameviewer/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modelnameviewer/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelnameviewer", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initProjectViewer(AlexandriaUiServer server, PushService pushService) {
		server.route("/projectviewer/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/projectviewer/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/projectviewer/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("projectviewer", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initProjectModuleLinkViewer(AlexandriaUiServer server, PushService pushService) {
		server.route("/projectmodulelinkviewer/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/projectmodulelinkviewer/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/projectmodulelinkviewer/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("projectmodulelinkviewer", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initProjectModuleViewer(AlexandriaUiServer server, PushService pushService) {
		server.route("/projectmoduleviewer/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/projectmoduleviewer/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/projectmoduleviewer/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("projectmoduleviewer", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initProjectModuleEntryViewer(AlexandriaUiServer server, PushService pushService) {
		server.route("/projectmoduleentryviewer/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/projectmoduleentryviewer/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/projectmoduleentryviewer/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("projectmoduleentryviewer", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelNameDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelnamedialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelnamedialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modelnamedialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelnamedialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initCommitModelDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/commitmodeldialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/commitmodeldialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/commitmodeldialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("commitmodeldialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initDownloadModelDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/downloadmodeldialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/downloadmodeldialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/downloadmodeldialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("downloadmodeldialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelSettingsEditor(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelsettingseditor/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelsettingseditor/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modelsettingseditor/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelsettingseditor", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initTagEditor(AlexandriaUiServer server, PushService pushService) {
		server.route("/tageditor/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/tageditor/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/tageditor/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("tageditor", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initCreateLanguageEditor(AlexandriaUiServer server, PushService pushService) {
		server.route("/createlanguageeditor/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/createlanguageeditor/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/createlanguageeditor/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("createlanguageeditor", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageEditor(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageeditor/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageeditor/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languageeditor/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageeditor", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageLogoDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagelogodialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagelogodialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languagelogodialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagelogodialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageExecutionLauncher(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageexecutionlauncher/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageexecutionlauncher/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languageexecutionlauncher/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageexecutionlauncher", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initCreateCollectionDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/createcollectiondialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/createcollectiondialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/createcollectiondialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("createcollectiondialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelsDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelsdialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelsdialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modelsdialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelsdialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initAddLicenseEditor(AlexandriaUiServer server, PushService pushService) {
		server.route("/addlicenseeditor/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/addlicenseeditor/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/addlicenseeditor/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("addlicenseeditor", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLicenseDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/licensedialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/licensedialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/licensedialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("licensedialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initRenewLicenseDialog(AlexandriaUiServer server, PushService pushService) {
		server.route("/renewlicensedialog/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/renewlicensedialog/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/renewlicensedialog/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("renewlicensedialog", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initCollectionHeaderTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/collectionheadertemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/collectionheadertemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/collectionheadertemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("collectionheadertemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initCollectionTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/collectiontemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/collectiontemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/collectiontemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("collectiontemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLicensesTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/licensestemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/licensestemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/licensestemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("licensestemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelHeaderTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelheadertemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelheadertemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modelheadertemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelheadertemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelLanguageToolbar(AlexandriaUiServer server, PushService pushService) {
		server.route("/modellanguagetoolbar/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modellanguagetoolbar/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modellanguagetoolbar/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modellanguagetoolbar", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelsTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelstemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelstemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modelstemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelstemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/modeltemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modeltemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modeltemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modeltemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelEditor(AlexandriaUiServer server, PushService pushService) {
		server.route("/modeleditor/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modeleditor/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modeleditor/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modeleditor", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelViewer(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelviewer/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelviewer/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modelviewer/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelviewer", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initModelBrowserTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelbrowsertemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelbrowsertemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/modelbrowsertemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelbrowsertemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initResourcesBrowserTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/resourcesbrowsertemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/resourcesbrowsertemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/resourcesbrowsertemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("resourcesbrowsertemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initBrowserTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/browsertemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/browsertemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/browsertemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("browsertemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initIntinoFileBrowser(AlexandriaUiServer server, PushService pushService) {
		server.route("/intinofilebrowser/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/intinofilebrowser/:displayId").post(manager -> new IntinoFileBrowserRequester(manager, notifierProvider()).execute());
		server.route("/intinofilebrowser/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("intinofilebrowser", new IntinoFileBrowserPushRequester());

	}
	private static void initIntinoDslEditor(AlexandriaUiServer server, PushService pushService) {
		server.route("/intinodsleditor/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/intinodsleditor/:displayId").post(manager -> new IntinoDslEditorRequester(manager, notifierProvider()).execute());
		server.route("/intinodsleditor/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("intinodsleditor", new IntinoDslEditorPushRequester());

	}
	private static void initConsoleTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/consoletemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/consoletemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/consoletemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("consoletemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initConsoleEntryTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/consoleentrytemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/consoleentrytemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/consoleentrytemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("consoleentrytemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initEditorHelpDisplay(AlexandriaUiServer server, PushService pushService) {
		server.route("/editorhelpdisplay/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/editorhelpdisplay/:displayId").post(manager -> new EditorHelpDisplayRequester(manager, notifierProvider()).execute());
		server.route("/editorhelpdisplay/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("editorhelpdisplay", new EditorHelpDisplayPushRequester());

	}
	private static void initForgeTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/forgetemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/forgetemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/forgetemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("forgetemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initForgeHeaderTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/forgeheadertemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/forgeheadertemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/forgeheadertemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("forgeheadertemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageHeaderTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageheadertemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageheadertemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languageheadertemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageheadertemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageToolbar(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagetoolbar/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagetoolbar/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languagetoolbar/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagetoolbar", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguagesTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagestemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagestemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languagestemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagestemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguagesLandingTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageslandingtemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageslandingtemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languageslandingtemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageslandingtemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguagesCollectionTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagescollectiontemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagescollectiontemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languagescollectiontemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagescollectiontemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagetemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagetemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languagetemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagetemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageExplorer(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageexplorer/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageexplorer/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languageexplorer/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageexplorer", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageForgeTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageforgetemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageforgetemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languageforgetemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageforgetemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initReleaseSelectorOption(AlexandriaUiServer server, PushService pushService) {
		server.route("/releaseselectoroption/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/releaseselectoroption/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/releaseselectoroption/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("releaseselectoroption", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageInfoTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageinfotemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageinfotemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languageinfotemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageinfotemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguagePropertiesTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagepropertiestemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagepropertiestemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languagepropertiestemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagepropertiestemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initHelpEditor(AlexandriaUiServer server, PushService pushService) {
		server.route("/helpeditor/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/helpeditor/:displayId").post(manager -> new HelpEditorRequester(manager, notifierProvider()).execute());
		server.route("/helpeditor/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("helpeditor", new HelpEditorPushRequester());

	}
	private static void initLanguageKitTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagekittemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagekittemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languagekittemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagekittemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageExecutionTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageexecutiontemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageexecutiontemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languageexecutiontemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageexecutiontemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLinkTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/linktemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/linktemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/linktemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("linktemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initDownloadTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/downloadtemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/downloadtemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/downloadtemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("downloadtemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initDependencyTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/dependencytemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/dependencytemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/dependencytemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("dependencytemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLanguageReleaseHelp(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagereleasehelp/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagereleasehelp/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/languagereleasehelp/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagereleasehelp", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLandingTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/landingtemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/landingtemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/landingtemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("landingtemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initHomeTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/hometemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/hometemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/hometemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("hometemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initAboutTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/abouttemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/abouttemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/abouttemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("abouttemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initHeaderTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/headertemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/headertemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/headertemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("headertemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initUserHomeTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/userhometemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/userhometemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/userhometemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("userhometemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLicenseItemTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/licenseitemtemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/licenseitemtemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/licenseitemtemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("licenseitemtemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initCollectionItemTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/collectionitemtemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/collectionitemtemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/collectionitemtemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("collectionitemtemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLoginTemplate(AlexandriaUiServer server, PushService pushService) {
		server.route("/logintemplate/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/logintemplate/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/logintemplate/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("logintemplate", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLoginSelectorOption(AlexandriaUiServer server, PushService pushService) {
		server.route("/loginselectoroption/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/loginselectoroption/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/loginselectoroption/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("loginselectoroption", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initLicenseExpiredBanner(AlexandriaUiServer server, PushService pushService) {
		server.route("/licenseexpiredbanner/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/licenseexpiredbanner/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.TemplateRequester(manager, notifierProvider()).execute());
		server.route("/licenseexpiredbanner/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("licenseexpiredbanner", new io.intino.alexandria.ui.displays.requesters.TemplatePushRequester());

	}
	private static void initGoogleLoginDisplay(AlexandriaUiServer server, PushService pushService) {
		server.route("/googlelogindisplay/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/googlelogindisplay/:displayId").post(manager -> new GoogleLoginDisplayRequester(manager, notifierProvider()).execute());
		server.route("/googlelogindisplay/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("googlelogindisplay", new GoogleLoginDisplayPushRequester());

	}
	private static void initModelItem(AlexandriaUiServer server, PushService pushService) {
		server.route("/modelitem/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/modelitem/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.ItemRequester(manager, notifierProvider()).execute());
		server.route("/modelitem/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("modelitem", new io.intino.alexandria.ui.displays.requesters.ItemPushRequester());

	}
	private static void initLanguageItem(AlexandriaUiServer server, PushService pushService) {
		server.route("/languageitem/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languageitem/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.ItemRequester(manager, notifierProvider()).execute());
		server.route("/languageitem/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languageitem", new io.intino.alexandria.ui.displays.requesters.ItemPushRequester());

	}
	private static void initLanguageLandingItem(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagelandingitem/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagelandingitem/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.ItemRequester(manager, notifierProvider()).execute());
		server.route("/languagelandingitem/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagelandingitem", new io.intino.alexandria.ui.displays.requesters.ItemPushRequester());

	}
	private static void initLanguageCollectionItem(AlexandriaUiServer server, PushService pushService) {
		server.route("/languagecollectionitem/:displayId").before(manager -> new BeforeDisplayRequest(manager).execute());
		server.route("/languagecollectionitem/:displayId").post(manager -> new io.intino.alexandria.ui.displays.requesters.ItemRequester(manager, notifierProvider()).execute());
		server.route("/languagecollectionitem/:displayId").after(manager -> new AfterDisplayRequest(manager).execute());
		pushService.register("languagecollectionitem", new io.intino.alexandria.ui.displays.requesters.ItemPushRequester());

	}
}