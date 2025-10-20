package io.intino.builderservice.konos;

import io.intino.alexandria.http.AlexandriaHttpServer;
import io.intino.builderservice.konos.rest.resources.*;
import io.intino.alexandria.core.Box;

public class BuilderServiceService {

	public static AlexandriaHttpServer setup(AlexandriaHttpServer server, BuilderServiceBox box) {
		if (!io.intino.alexandria.http.AlexandriaHttpServerBuilder.isUI()) server.route("/_alexandria/push").push(new io.intino.alexandria.http.pushservice.AlexandriaPushService());
		server.route("operation/:ticket/messages").post(manager -> new io.intino.builderservice.konos.rest.notifications.SubscribeOperationNotification(box, manager).execute());
		server.route("api/builders").get(manager -> new GetBuildersResource(box, manager).execute());
		server.route("api/builders").post(manager -> new PostBuildersResource(box, manager).execute());
		server.route("api/builders/info").get(manager -> new GetBuilderInfoResource(box, manager).execute());
		server.route("api/operations/run").post(manager -> new PostRunOperationResource(box, manager).execute());
		server.route("api/operation/:ticket/output").get(manager -> new GetOperationOutputResource(box, manager).execute());
		server.route("api/operation/:ticket/outputs/:output").get(manager -> new GetOutputResourceResource(box, manager).execute());

		return server;
	}
}