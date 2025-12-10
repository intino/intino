package io.quassar.editor.box.jmx;

import io.intino.alexandria.logger.Logger;
import javax.management.*;
import io.quassar.editor.box.EditorBox;
import java.util.*;
import java.time.*;

import static javax.management.MBeanOperationInfo.ACTION;

public class MaintenanceApi extends StandardMBean implements MaintenanceApiMBean {
	private final EditorBox box;

	public MaintenanceApi(EditorBox box) throws NotCompliantMBeanException {
		super(MaintenanceApiMBean.class);
		this.box = box;
	}

	@Override
	public MBeanInfo getMBeanInfo() {
		return new MBeanInfo(this.getClass().getName(), "maintenanceApi", null, null, new MBeanOperationInfo[]{rebuildLanguagesInfo()}, null);
	}

	public MBeanOperationInfo rebuildLanguagesInfo() {
		MBeanParameterInfo[] params = new MBeanParameterInfo[] {
		};
		return new MBeanOperationInfo("rebuildLanguages", "Rebuild language releases", params, "", ACTION);
	}
	public String rebuildLanguages() {
		try {
		io.quassar.editor.box.actions.RebuildLanguagesAction action = new io.quassar.editor.box.actions.RebuildLanguagesAction();
		action.box = box;
		return action.execute();
		} catch (Throwable e) {
			Logger.error(e);
			throw e;
		}
	}
}