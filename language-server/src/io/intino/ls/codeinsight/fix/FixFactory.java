package io.intino.ls.codeinsight.fix;

import io.intino.ls.codeinsight.DiagnosticContextInfo;
import org.eclipse.lsp4j.CodeAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FixFactory {
	private static final Map<String, Builder[]> fixes = new HashMap<>();

	static {
		fixes.put("reject.type.not.exists", new Builder[]{removeElementFix()});
		fixes.put("required.parameter.in.context", new Builder[]{addRequiredParameterFix()});
		fixes.put("required.type.in.context", new Builder[]{addRequiredElementFix()});
		fixes.put("reject.instance.reference.variable", new Builder[]{removeElementFix()});
		fixes.put("reject.duplicate.variable", new Builder[]{removeElementFix()});
		fixes.put("reject.duplicate.entries", new Builder[]{removeElementFix()});
		fixes.put("reject.duplicated.facet", new Builder[]{removeElementFix()});
		fixes.put("reject.sub.of.instance", new Builder[]{removeElementFix()});
		fixes.put("reject.other.parameter.in.context", new Builder[]{removeElementFix()});
		fixes.put("reject.number.parameter.with.erroneous.metric", new Builder[]{addMetricFix()});
		fixes.put("reject.node.with.required.aspect.not.found", new Builder[]{addRequieredFacetFix()});
//		fixes.put("warning.variable.name.starts.uppercase", new Builder[]{LowerCaseVariableFix.class});
	}

	private static Builder removeElementFix() {
		return new Builder() {
			@Override
			public RemoveElementFix build(DiagnosticContextInfo info) {
				return new RemoveElementFix(info);
			}
		};
	}

	private static Builder addRequieredFacetFix() {
		return new Builder() {
			@Override
			public AddRequiredFacetFix build(DiagnosticContextInfo info) {
				return new AddRequiredFacetFix(info);
			}
		};
	}

	private static Builder addRequiredElementFix() {
		return new Builder() {
			@Override
			public AddRequiredElementFix build(DiagnosticContextInfo info) {
				return new AddRequiredElementFix(info);
			}
		};
	}

	private static Builder addRequiredParameterFix() {
		return new Builder() {
			@Override
			public AddRequiredParameterFix build(DiagnosticContextInfo info) {
				return new AddRequiredParameterFix(info);
			}
		};
	}


	private static Builder addMetricFix() {
		return new Builder() {
			@Override
			public AddMetricFix build(DiagnosticContextInfo info) {
				return new AddMetricFix(info);
			}
		};
	}

	private FixFactory() {
	}

	public static List<CodeAction> get(DiagnosticContextInfo info) {
		var builders = fixes.get(info.code());
		return (builders == null) ? List.of() : instanceFixes(builders, info);
	}

	private static List<CodeAction> instanceFixes(Builder[] builders, DiagnosticContextInfo info) {
		List<CodeAction> actions = new ArrayList<>();
		for (Builder builder : builders) actions.add(builder.build(info));
		return actions;
	}

	private interface Builder<T extends CodeAction> {
		<T extends CodeAction> T build(DiagnosticContextInfo info);
	}
}
