package io.quassar.editor.box;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import java.util.HashMap;
import java.util.Map;

import io.intino.alexandria.logger.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import io.intino.alexandria.ui.services.libraries.AlexandriaLibraryArchetype;
import io.intino.alexandria.ui.services.libraries.AlexandriaLibraryInstaller;
import io.intino.alexandria.ui.services.libraries.AlexandriaLibraryLoader;
import io.intino.alexandria.ui.services.libraries.AlexandriaLibraryUiInitializer;
import io.intino.alexandria.ui.services.push.PushService;
import io.intino.alexandria.ui.Soul;

public abstract class AbstractBox extends io.intino.alexandria.ui.AlexandriaUiBox {
	protected EditorConfiguration configuration;
	protected io.intino.alexandria.jmx.JMXServer maintenanceApi;
	private io.intino.alexandria.scheduler.AlexandriaScheduler scheduler = new io.intino.alexandria.scheduler.AlexandriaScheduler();
	protected Map<String, Soul> uiSouls = new java.util.HashMap<>();
	protected java.util.List<AlexandriaLibraryLoader> libraryLoaders = new java.util.ArrayList<>();;
	private java.util.List<io.intino.alexandria.ui.AlexandriaUiBox.SoulsClosed> soulsClosedListeners = new java.util.ArrayList<>();
	private io.intino.alexandria.ui.services.AuthService authService;

	public AbstractBox(String[] args) {
		this(new EditorConfiguration(args));
	}

	public AbstractBox(EditorConfiguration configuration) {
		this.configuration = configuration;
		initJavaLogger();
	}

	public EditorConfiguration configuration() {
		return configuration;
	}

	@Override
	public io.intino.alexandria.core.Box put(Object o) {
		super.put(o);
		return this;
	}

	public abstract void beforeStart();

	public io.intino.alexandria.core.Box start() {
		initConnector();
		if (owner != null) owner.beforeStart();
		beforeStart();
		if (owner != null) owner.startServices();
		startServices();
		if (owner != null) owner.afterStart();
		afterStart();
		return this;
	}

	public abstract void afterStart();

	public abstract void beforeStop();

	public void stop() {
		if (owner != null) owner.beforeStop();
		beforeStop();
		if (owner != null) owner.stopServices();
		stopServices();
		if (owner != null) owner.afterStop();
		afterStop();
	}

	@Override
	public void stopServices() {
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance().stop();
	}

	public abstract void afterStop();

	@Override
	public void startServices() {
		initUI();
		initAgenda();
		initRestServices();
		initSoapServices();
		initJmxServices();
		initTerminal();
		initMessagingServices();
		initSentinels();
		initSlackBots();
		initWorkflow();
		initCli();
	}

	public java.util.List<Soul> souls() {
		return new java.util.ArrayList<>(uiSouls.values());
	}

	public java.util.Optional<Soul> soul(String clientId) {
		return java.util.Optional.ofNullable(uiSouls.get(clientId));
	}

	public void registerSoul(String clientId, Soul soul) {
		uiSouls.put(clientId, soul);
	}

	public void unRegisterSoul(String clientId) {
		uiSouls.remove(clientId);
		if (uiSouls.size() <= 0) notifySoulsClosed();
	}

	public void onSoulsClosed(io.intino.alexandria.ui.AlexandriaUiBox.SoulsClosed listener) {
		this.soulsClosedListeners.add(listener);
	}

	private void notifySoulsClosed() {
		soulsClosedListeners.forEach(l -> l.accept());
	}

	public boolean existsLibraryTemplate(String name) {
		return libraryLoaders.stream().anyMatch(l -> l.libraryTemplateEntryPointClass(name) != null);
	}

	protected abstract io.intino.alexandria.ui.services.AuthService authService(java.net.URL authServiceUrl);

	public io.intino.alexandria.scheduler.AlexandriaScheduler scheduler() {
		return this.scheduler;
	}

	protected void beforeSetupEditorElementsUi(io.intino.alexandria.ui.AlexandriaUiServer server) {}
	public void setupEditorElementsUi() {
		if(configuration().get("port") == null || configuration().get("port").isEmpty()) return;
		this.authService = this.authService(url(configuration().get("federation-url")));
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.setup(Integer.parseInt(configuration().get("port")), "www/", Long.parseLong("104857600"));
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.setUI(true);
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.addParameters(this.authService);
		this.pushService = owner != null && owner instanceof io.intino.alexandria.ui.AlexandriaUiBox ? ((io.intino.alexandria.ui.AlexandriaUiBox)owner).pushService() : new io.intino.alexandria.ui.services.push.PushService();
		io.intino.alexandria.ui.AlexandriaUiServer server = (io.intino.alexandria.ui.AlexandriaUiServer) io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance();
		beforeSetupEditorElementsUi(server);
		io.quassar.editor.box.ui.EditorElementsService.init(server, (EditorBox) this, pushService, new io.quassar.editor.box.ui.displays.RouteDispatcher());


		io.intino.alexandria.ui.UiElementsService.initDisplays(server, pushService);
	}

	private void initRestServices() {
		if(configuration().get("port") == null || configuration().get("port").isEmpty()) return;
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.setup(Integer.parseInt(configuration().get("port")), "www/", Long.parseLong("104857600"));
		QuassarArtifactoryApiService.setup(io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance(), (EditorBox) this);
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance().start();
		Logger.info("Rest service quassar-artifactory-api: started at port " + configuration().get("port") + "!");
		if(configuration().get("port") == null || configuration().get("port").isEmpty()) return;
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.setup(Integer.parseInt(configuration().get("port")), "www/", Long.parseLong("104857600"));
		QuassarApiService.setup(io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance(), (EditorBox) this);
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance().start();
		Logger.info("Rest service quassar-api: started at port " + configuration().get("port") + "!");
	}

	private void initSoapServices() {

	}

	private void initMessagingServices() {

	}

	private void initJmxServices() {
		this.maintenanceApi = new JMXMaintenanceApi().init(((EditorBox) this));
		Logger.info("Jmx service maintenanceApi: started!");
	}

	private void initSlackBots() {

	}

	private void initUI() {
		this.initTranslatorService();
		setupEditorElementsUi();
		io.intino.alexandria.ui.AlexandriaUiServer serverEditorElementsInstance = (io.intino.alexandria.ui.AlexandriaUiServer) io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance();
		serverEditorElementsInstance.start();
		Logger.info("UI EditorElements: started at port " + configuration().get("port") + "!");
	}

	private void initTranslatorService() {
		translatorService = new io.intino.alexandria.ui.services.TranslatorService();

		translatorService.addAll(io.quassar.editor.box.I18n.dictionaries());
		translatorService.addAll(io.intino.alexandria.I18n.dictionaries());
	}

	protected void initConnector() {
	}

	protected void initTerminal() {
	}

	protected void initSentinels() {
		Sentinels.init(this.scheduler, this.configuration.home(), (EditorBox) this);
	}

	protected void initWorkflow() {
	}

	protected void initAgenda() {

	}

	protected void initCli() {

	}

	protected void initJavaLogger() {
		final java.util.logging.Logger Logger = java.util.logging.Logger.getGlobal();
		final ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.INFO);
		handler.setFormatter(new io.intino.alexandria.logger.Formatter());
		Logger.setUseParentHandlers(false);
		Logger.addHandler(handler);
		io.intino.alexandria.logger4j.Logger.init();
	}

	public static java.net.URL url(String url) {
        try {
            return new java.net.URI(url).toURL();
        } catch (java.net.MalformedURLException | java.net.URISyntaxException | IllegalArgumentException e) {
            return null;
        }
    }
}