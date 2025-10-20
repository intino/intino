package io.intino.tara.language.semantics.constraints;

import io.intino.tara.language.semantics.Constraint;
import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.Element;
import io.intino.tara.model.ElementContainer;
import io.intino.tara.model.Mogram;

import java.util.Arrays;
import java.util.List;

import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.ERROR;
import static java.util.Collections.singletonList;

public class FacetInstantiationConstraint implements Constraint.FacetInstantiation {
	private final List<String> types;

	FacetInstantiationConstraint(String... types) {
		this.types = Arrays.asList(types);
	}

	@Override
	public List<String> types() {
		return types;
	}

	@Override
	public void check(Element element) throws SemanticException {
		Mogram mogram = (Mogram) element;
		List<Mogram> facetMograms = mogram.mograms().stream().filter(m -> m.types().stream().anyMatch(types::contains)).toList();
		for (Mogram facetMogram : facetMograms) {
			List<String> targetTypes = facetMogram.metaMograms().stream().map(m -> m.facetPrescription().get().qualifiedName()).toList();//todo check
			for (String type : types)
				if (!facetMogram.types().contains(type))
					throw new SemanticException(new SemanticIssue(ERROR, "reject.incompatible.facet.prescription.in.context", facetMogram, singletonList(String.join(", ", types))));
			if (facetMogram.facetPrescription() == null) {
				ElementContainer container = facetMogram.container();
				if (container instanceof Mogram cm) {
					if (((Mogram) container).types().stream().anyMatch(targetTypes::contains)) {
						facetMogram.facetPrescription(cm);
						cm.addApplicableFacet(facetMogram);
					}
				} else
					throw new SemanticException(new SemanticIssue(ERROR, "reject.mogram.without.required.facet.target", facetMogram, singletonList(String.join(", ", types))));
			}
		}
	}

	@Override
	public String toString() {
		return "Facet Instantiation " + String.join(",", types);
	}
}
