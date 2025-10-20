package io.intino.builderservice.konos.rest.resources;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import io.intino.alexandria.exceptions.*;
import io.intino.builderservice.konos.*;
import io.intino.alexandria.core.Box;
import io.intino.alexandria.rest.*;
import io.intino.alexandria.http.server.AlexandriaHttpManager;
import io.intino.alexandria.http.pushservice.PushService;

import io.intino.builderservice.konos.schemas.*;

public class GetOutputResourceResource implements Resource {
	public enum Output {
		Src, Gen, Res, Out, Build;
	}

	private BuilderServiceBox box;
	private AlexandriaHttpManager<PushService<?,?>> manager;

	public GetOutputResourceResource(BuilderServiceBox box, AlexandriaHttpManager manager) {
		this.box = box;
		this.manager = manager;
	}

	public void execute() throws AlexandriaException {
		write(fill(new io.intino.builderservice.konos.actions.GetOutputResourceAction()).execute());
	}

	private io.intino.builderservice.konos.actions.GetOutputResourceAction fill(io.intino.builderservice.konos.actions.GetOutputResourceAction action) throws AlexandriaException {
		action.box = this.box;
		action.context = context();
		try {
			action.ticket = io.intino.alexandria.rest.RequestAdapter.adapt(manager.fromPath("ticket"), String.class);
			action.output = io.intino.alexandria.rest.RequestAdapter.adapt(manager.fromPath("output"), GetOutputResourceResource.Output.class);
			action.excludeFilePattern = io.intino.alexandria.rest.RequestAdapter.adapt(manager.fromQuery("excludeFilePattern"), String.class);
		} catch (Throwable e) {
			action.onMalformedRequest(e);
		}
		return action;
	}

	private void write(io.intino.alexandria.Resource object) {
		manager.write(object);
	}

	private io.intino.alexandria.http.server.AlexandriaHttpContext context() {
		io.intino.alexandria.http.server.AlexandriaHttpContext context = new io.intino.alexandria.http.server.AlexandriaHttpContext(manager);

		context.put("ip", manager.ip());
		return context;
	}
}