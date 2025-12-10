package io.quassar.editor.box;

import io.intino.alexandria.http.AlexandriaHttpServer;
import io.quassar.editor.box.rest.resources.*;
import io.intino.alexandria.core.Box;

public class QuassarApiService {

	public static AlexandriaHttpServer setup(AlexandriaHttpServer server, EditorBox box) {
		server.route("commits/:commit").get(manager -> new GetDownloadModelResource(box, manager).execute());
		server.route("commits/:commit/hash").get(manager -> new GetDownloadModelHashResource(box, manager).execute());
		server.route("commits/:commit/file/:file").get(manager -> new GetDownloadModelFileResource(box, manager).execute());

		return server;
	}
}