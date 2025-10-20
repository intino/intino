package io.intino.builderservice.konos.rest.notifications;

import java.util.List;
import java.util.ArrayList;
import io.intino.alexandria.exceptions.*;
import io.intino.builderservice.konos.*;
import io.intino.alexandria.core.Box;
import io.intino.alexandria.rest.Resource;
import io.intino.alexandria.http.pushservice.Client;
import io.intino.alexandria.http.pushservice.Session;
import io.intino.alexandria.http.pushservice.MessageCarrier;
import io.intino.alexandria.http.server.AlexandriaHttpManager;
import io.intino.alexandria.http.server.AlexandriaHttpNotifier;
import io.intino.alexandria.http.pushservice.PushService;



public class SubscribeOperationNotification implements Resource {

	private BuilderServiceBox box;
	private AlexandriaHttpManager<?> manager;

	public SubscribeOperationNotification(BuilderServiceBox box, AlexandriaHttpManager manager) {
		this.box = box;
		this.manager = manager;
	}

	public void execute() {
		Session session = manager.currentSession();
		String clientId = java.util.UUID.randomUUID().toString();
		io.intino.builderservice.konos.actions.SubscribeOperationAction action = fill(new io.intino.builderservice.konos.actions.SubscribeOperationAction());
		manager.pushService().onOpen(client -> {
			action.onOpen((Client)client, notifier(session, (Client)client));
			return true;
		});
		manager.pushService().onClose(clientId).execute((java.util.function.Consumer<Client>) action::onClose);
		write(manager.baseUrl().replace("http", "ws") + "/_alexandria/push?id=" + clientId);
	}

	private io.intino.builderservice.konos.actions.SubscribeOperationAction fill(io.intino.builderservice.konos.actions.SubscribeOperationAction action) {
		action.box = this.box;
		action.context = context();
		action.ticket = io.intino.alexandria.rest.RequestAdapter.adapt(manager.fromPath("ticket"), String.class);
		return action;
	}

	private void write(String object) {
		manager.write(io.intino.alexandria.rest.ResponseAdapter.adapt(object), "text/plain");
	}

	private AlexandriaHttpNotifier notifier(Session session, Client client) {
		return new AlexandriaHttpNotifier(new MessageCarrier(manager.pushService(), session, client));
	}

	private io.intino.alexandria.http.server.AlexandriaHttpContext context() {
		io.intino.alexandria.http.server.AlexandriaHttpContext context = new io.intino.alexandria.http.server.AlexandriaHttpContext(manager);
		context.put("ip", manager.ip());
		return context;
	}
}