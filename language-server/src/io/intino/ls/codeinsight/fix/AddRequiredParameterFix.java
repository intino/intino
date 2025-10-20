package io.intino.ls.codeinsight.fix;

import io.intino.ls.codeinsight.DiagnosticContextInfo;
import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.model.rules.Size;
import org.eclipse.lsp4j.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.eclipse.lsp4j.CodeActionKind.QuickFix;

public class AddRequiredParameterFix extends CodeAction {

	public AddRequiredParameterFix(DiagnosticContextInfo info) {
		if (info.tokenOnPosition() == null || info.mogramOnPosition() == null) return;
		List<Constraint.Property> constraints = findConstraints(info).stream().
				filter(constraint -> constraint instanceof Constraint.Property && ((Constraint.Property) constraint).rule(Size.class).isRequired()).
				map(constraint -> (Constraint.Property) constraint).toList();
		WorkspaceEdit edit = new WorkspaceEdit();
		edit.setChanges(Map.of(info.uri().toString(), List.of(positionedCursor())));
		setEdit(edit);
		setTitle("Add required parameters");
		setKind(QuickFix);
		Command command = new Command(
				getTitle(),
				"editor.action.insertSnippet",
				List.of(Map.<String, Object>of("snippet", createTemplateFor(constraints)))
		);
		setCommand(command);
	}

	private TextEdit positionedCursor() {
		TextEdit dummyEdit = new TextEdit();
		dummyEdit.setRange(new Range(new Position(10, 4), new Position(10, 4)));
		dummyEdit.setNewText("");
		return dummyEdit;
	}

	private String createTemplateFor(List<Constraint.Property> constraints) {
		return "hola mundo  ${1:name}(${2:param}";
	}

	private List<Constraint> findConstraints(DiagnosticContextInfo info) {
		final io.intino.tara.model.Mogram mogram = (io.intino.tara.model.Mogram) info.mogramOnPosition();
		final List<Constraint> constraintsOf = new ArrayList<>(info.language().constraints(mogram.types().getFirst()));
		List<Constraint> aspectConstraints = new ArrayList<>();
		final List<String> facets = mogram.types();
		for (Constraint c : constraintsOf)
			if (c instanceof Constraint.Facet && facets.contains(((Constraint.Facet) c).type()))
				aspectConstraints.addAll(((Constraint.Facet) c).constraints());
		constraintsOf.addAll(aspectConstraints);
		return constraintsOf;
	}
}