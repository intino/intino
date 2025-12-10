package io.quassar.editor.box.util;

import io.intino.alexandria.ui.services.push.UISession;
import io.quassar.editor.box.ui.datasources.ModelsDatasource;
import io.quassar.editor.box.ui.types.*;

public class SessionHelper {

	public static void registerModelsSorting(UISession session, ModelsDatasource.Sorting sorting) {
		session.add("models-sorting", sorting.name());
	}

	public static ModelsDatasource.Sorting modelsSorting(UISession session) {
		String value = session.preference("models-sorting");
		return value != null ? ModelsDatasource.Sorting.valueOf(value) : ModelsDatasource.Sorting.MostRecent;
	}

	public static boolean isModelsSortingByMostRecent(UISession session) {
		return modelsSorting(session) == ModelsDatasource.Sorting.MostRecent;
	}

	public static void registerLeftPanelExpanded(UISession session) {
		registerLeftPanelState(session, true);
	}

	public static void registerLeftPanelSize(UISession session, double size) {
		session.add("left-panel-size", String.valueOf(size));
	}

	public static void registerLeftPanelCollapsed(UISession session) {
		registerLeftPanelState(session, false);
	}

	public static void registerRightPanelSize(UISession session, double size) {
		session.add("right-panel-size", String.valueOf(size));
	}

	public static void registerRightPanelExpanded(UISession session) {
		registerRightPanelState(session, true);
	}

	public static void registerRightPanelCollapsed(UISession session) {
		registerRightPanelState(session, false);
	}

	public static boolean isRightPanelCollapsed(UISession session) {
		return !isRightPanelExpanded(session);
	}

	public static boolean isLeftPanelExpanded(UISession session) {
		String preference = session.preference("left-panel-state");
		return preference == null || preference.equalsIgnoreCase("expanded");
	}

	public static Double leftPanelSize(UISession session) {
		String preference = session.preference("left-panel-size");
		return preference != null ? Double.parseDouble(preference) : DisplayHelper.DefaultLeftPanelSize;
	}

	public static boolean isRightPanelExpanded(UISession session) {
		String preference = session.preference("right-panel-state");
		return preference == null || preference.equalsIgnoreCase("expanded");
	}

	public static Double rightPanelSize(UISession session) {
		String preference = session.preference("right-panel-size");
		return preference != null ? Double.parseDouble(preference) : DisplayHelper.DefaultRightPanelSize;
	}

	public static void register(UISession session, LanguagesTab tab) {
		if (tab == null) return;
		session.add("languages-tab", tab.name());
	}

	public static LanguagesTab languagesTab(UISession session) {
		String result = session.preference("languages-tab");
		return result != null && !result.isEmpty() ? LanguagesTab.from(result) : LanguagesTab.PublicLanguages;
	}

	public static void register(UISession session, LanguageTab tab) {
		if (tab == null) return;
		session.add("language-tab", tab.name());
	}

	public static LanguageTab languageTab(UISession session) {
		String result = session.preference("language-tab");
		return result != null && !result.isEmpty() ? LanguageTab.from(result) : LanguageTab.About;
	}

	public static void register(UISession session, ModelView view) {
		if (view == null) return;
		session.add("model-view", view.name());
	}

	public static ModelView modelView(UISession session) {
		String result = session.preference("model-view");
		return result != null && !result.isEmpty() ? ModelView.from(result) : ModelView.Model;
	}

	public static void register(UISession session, ForgeView view) {
		if (view == null) return;
		session.add("forge-view", view.name());
	}

	public static ForgeView forgeView(UISession session) {
		String result = session.preference("forge-view");
		return result != null && !result.isEmpty() ? ForgeView.from(result) : ForgeView.Kit;
	}

	private static void registerLeftPanelState(UISession session, boolean expanded) {
		session.add("left-panel-state", expanded ? "expanded" : "collapsed");
	}

	private static void registerRightPanelState(UISession session, boolean expanded) {
		session.add("right-panel-state", expanded ? "expanded" : "collapsed");
	}

}