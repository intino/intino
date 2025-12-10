package io.quassar.editor.box;

import io.intino.alexandria.jmx.JMXServer;
import io.intino.alexandria.logger.Logger;
import io.intino.alexandria.core.Box;
import java.util.HashMap;
import java.util.Map;

public class JMXMaintenanceApi {

	public JMXServer init(Box box) {
		JMXServer server = new JMXServer(mbClasses(box));
		server.init("intino");
		return server;
	}

	private Map<String, Object[]> mbClasses(Box box) {
		Map<String, Object[]> map = new HashMap<>();
		map.put("io.quassar.editor.box.jmx.MaintenanceApi", new Object[]{box});
		return map;
	}
}