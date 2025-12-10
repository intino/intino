package io.quassar.editor.box.jmx;

import io.intino.alexandria.logger.Logger;
import io.intino.alexandria.jmx.Description;
import io.intino.alexandria.jmx.Parameters;

import java.util.*;
import java.time.*;

public interface MaintenanceApiMBean {
	@Description("Rebuild language releases")
	@Parameters({})
	String rebuildLanguages();
}