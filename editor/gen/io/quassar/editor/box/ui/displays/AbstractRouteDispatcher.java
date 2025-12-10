package io.quassar.editor.box.ui.displays;

import io.intino.alexandria.ui.Soul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractRouteDispatcher implements io.intino.alexandria.ui.displays.DisplayRouteDispatcher {
	private static java.util.Map<String, String> patterns = new HashMap<>();

	public AbstractRouteDispatcher() {
		registerPatterns();
	}

	@Override
	public void dispatch(Soul soul, String address) {
		address = address.replaceFirst(soul.session().browser().basePath(), "");
		List<String> params = paramsOf(address);
		address = addressWithoutQueryString(address);
		if (address.length() <= 1) { dispatchHome(soul, params.size() > 0 ? params.get(0) : null); return; }
		if (address.matches(patterns.get("home"))) { dispatchHome(soul, params.size() > 0 ? params.get(0) : null); return; }
		if (address.matches(patterns.get("about"))) { dispatchAbout(soul); return; }
		if (address.matches(patterns.get("collection"))) { dispatchCollection(soul, params.get(0)); return; }
		if (address.matches(patterns.get("language"))) { dispatchLanguage(soul, params.get(0), params.size() > 1 ? params.get(1) : null); return; }
		if (address.matches(patterns.get("languageAction"))) { dispatchLanguageAction(soul, params.get(0), params.get(1), params.size() > 2 ? params.get(2) : null); return; }
		if (address.matches(patterns.get("model"))) { dispatchModel(soul, params.get(0), params.get(1), params.get(2), params.size() > 3 ? params.get(3) : null, params.size() > 4 ? params.get(4) : null, params.size() > 5 ? params.get(5) : null, params.size() > 6 ? params.get(6) : null); return; }
		if (address.matches(patterns.get("forge"))) { dispatchForge(soul, params.get(0), params.get(1), params.size() > 2 ? params.get(2) : null); return; }
		if (address.matches(patterns.get("login"))) { dispatchLogin(soul); return; }
	}

	public abstract void dispatchHome(Soul soul, String dialog);
	public abstract void dispatchAbout(Soul soul);
	public abstract void dispatchCollection(Soul soul, String collection);
	public abstract void dispatchLanguage(Soul soul, String language, String tab);
	public abstract void dispatchLanguageAction(Soul soul, String language, String action, String version);
	public abstract void dispatchModel(Soul soul, String language, String model, String release, String tab, String view, String file, String pos);
	public abstract void dispatchForge(Soul soul, String model, String release, String view);
	public abstract void dispatchLogin(Soul soul);

	private void registerPatterns() {
		if (patterns.size() > 0) return;
		patterns.put("home", "");
		patterns.put("about", "\\/about");
		patterns.put("collection", "\\/collections\\/([^\\/]*)");
		patterns.put("language", "\\/models\\/([^\\/]*)");
		patterns.put("languageAction", "\\/models\\/([^\\/]*)\\/([^\\/]*)");
		patterns.put("model", "\\/models\\/([^\\/]*)\\/([^\\/]*)\\/([^\\/]*)");
		patterns.put("forge", "\\/forge\\/([^\\/]*)\\/([^\\/]*)");
		patterns.put("login", "\\/login");
	}

	private String patternOf(String address) {
		String addressPart = addressWithoutQueryString(address);
		if (addressPart.equals("/") || addressPart.matches(patterns.get("home"))) return patterns.get("home");
		else if (addressPart.matches(patterns.get("home"))) return patterns.get("home");
		else if (addressPart.matches(patterns.get("about"))) return patterns.get("about");
		else if (addressPart.matches(patterns.get("collection"))) return patterns.get("collection");
		else if (addressPart.matches(patterns.get("language"))) return patterns.get("language");
		else if (addressPart.matches(patterns.get("languageAction"))) return patterns.get("languageAction");
		else if (addressPart.matches(patterns.get("model"))) return patterns.get("model");
		else if (addressPart.matches(patterns.get("forge"))) return patterns.get("forge");
		else if (addressPart.matches(patterns.get("login"))) return patterns.get("login");
		return null;
	}

	private List<String> paramsOf(String address) {
		return paramsOf(address, patternOf(address));
	}

	private List<String> paramsOf(String address, String pattern) {
		if (pattern == null) return java.util.Collections.emptyList();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(address);
		if (!m.find()) return Collections.emptyList();
		List<String> result = new ArrayList<>();
		for (int i=1; i<=m.groupCount(); i++) result.add(m.group(i).split("\\?")[0]);
		return addQueryStringParams(address, result);
	}

	private List<String> addQueryStringParams(String address, List<String> result) {
        if (address.indexOf("?") == -1) return result;
        String[] parameters = address.split("\\?")[1].split("&");
        for (int i = 0; i < parameters.length; i++) {
            String[] split = parameters[i].split("=");
            result.add(split.length > 1 ? split[1] : "");
        }
        return result;
	}

    private String addressWithoutQueryString(String address) {
        return address.indexOf("?") != -1 ? address.substring(0, address.indexOf("?")) : address;
    }

}