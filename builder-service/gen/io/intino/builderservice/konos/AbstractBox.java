package io.intino.builderservice.konos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import io.intino.alexandria.logger.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public abstract class AbstractBox extends io.intino.alexandria.core.Box {
	protected BuilderServiceConfiguration configuration;

	public AbstractBox(String[] args) {
		this(new BuilderServiceConfiguration(args));
	}

	public AbstractBox(BuilderServiceConfiguration configuration) {
		this.configuration = configuration;
		initJavaLogger();
	}

	public BuilderServiceConfiguration configuration() {
		return configuration;
	}

	@Override
	public io.intino.alexandria.core.Box put(Object o) {
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

	private void initRestServices() {
		if(configuration().get("port") == null || configuration().get("port").isEmpty()) return;
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.setup(Integer.parseInt(configuration().get("port")), "www/", Long.parseLong("104857600"));
		BuilderServiceService.setup(io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance(), (BuilderServiceBox) this);
		io.intino.alexandria.http.AlexandriaHttpServerBuilder.instance().start();
		Logger.info("Rest service builder-service: started at port " + configuration().get("port") + "!");
	}

	private void initSoapServices() {

	}

	private void initMessagingServices() {

	}

	private void initJmxServices() {

	}

	private void initSlackBots() {

	}

	private void initUI() {

	}

	protected void initConnector() {
	}

	protected void initTerminal() {
	}

	protected void initSentinels() {
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