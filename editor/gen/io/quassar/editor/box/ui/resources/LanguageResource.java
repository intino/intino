package io.quassar.editor.box.ui.resources;

import io.quassar.editor.box.EditorBox;

import io.quassar.editor.box.ui.pages.LanguagePage;
import io.intino.alexandria.exceptions.AlexandriaException;
import io.intino.alexandria.ui.displays.notifiers.DisplayNotifierProvider;
import io.intino.alexandria.ui.server.pages.UiPage;
import io.intino.alexandria.ui.services.push.UIClient;

import java.util.Base64;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

public class LanguageResource extends io.intino.alexandria.ui.server.resources.Resource {
	private final EditorBox box;

	public LanguageResource(EditorBox box, io.intino.alexandria.ui.server.AlexandriaUiManager manager, DisplayNotifierProvider notifierProvider) {
		super(manager, notifierProvider);
		this.box = box;
	}

	@Override
	public void execute() throws AlexandriaException {
		super.execute();
		fillDeviceParameter();
		render();
	}

	private void render() {
		String clientId = UUID.randomUUID().toString();
		UiPage page = new LanguagePage();
		page.session = manager.currentSession();
		page.session.browser().onRedirect(location -> manager.redirect(location));
		page.session.browser().requestUrl(manager.requestUrl());
		page.session.whenLogin(new Function<String, String>() {
			@Override
			public String apply(String baseUrl) {
				return LanguageResource.this.authenticate(page.session, baseUrl);
			}
		});
		page.session.whenLogout(b -> logout(page.session));
        ((LanguagePage)page).box = box;
		page.clientId = clientId;
		page.webDirectories = manager.webDirectories();
		page.device = parameterValue("device");
		page.token = parameterValue("token");
		((LanguagePage)page).language = parameterValue("language");
		((LanguagePage)page).tab = parameterValue("tab");
		if (!page.hasPermissions()) {
			manager.redirect(page.redirectUrl());
			return;
		}

		manager.pushService().onOpen(client -> {
			if (!client.id().equals(page.clientId))
				return false;

			if (client.soul() != null && box.routeManager().routeDispatcher() instanceof io.quassar.editor.box.ui.displays.RouteDispatcher) {
				((io.quassar.editor.box.ui.displays.RouteDispatcher)box.routeManager().routeDispatcher()).dispatchLanguage(client.soul(), ((LanguagePage)page).language, ((LanguagePage)page).tab);
				return false;
			}

			io.intino.alexandria.ui.Soul soul = page.prepareSoul(client);
			soul.onRedirect((location) -> manager.redirect(location));
			soul.addRegisterDisplayListener(display -> {
				display.inject(notifier(page.session, client, display));
				display.inject(page.session);
				display.inject(soul);
				display.inject(() -> soul);
			});
			((UIClient)client).soul(soul);
			client.cookies(manager.cookies());

			box.registerSoul(clientId, soul);
			soul.register(new io.intino.alexandria.ui.displays.DisplayRouter(box).id("__router__"));
			if (box.routeManager().routeDispatcher() instanceof io.quassar.editor.box.ui.displays.RouteDispatcher)
			    ((io.quassar.editor.box.ui.displays.RouteDispatcher)box.routeManager().routeDispatcher()).dispatchLanguage(soul, ((LanguagePage)page).language, ((LanguagePage)page).tab);

			return true;
		});

		manager.pushService().onClose(clientId).execute(new Consumer<io.intino.alexandria.ui.services.push.UIClient>() {
			@Override
			public void accept(io.intino.alexandria.ui.services.push.UIClient client) {
				box.soul(client.id()).ifPresent(s -> s.destroy());
				box.unRegisterSoul(client.id());
				manager.unRegister(client);
			}
		});

		manager.write(page.execute());
	}

}