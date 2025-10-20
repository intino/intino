package io.intino.tara.language.semantics;

import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.model.*;

import java.util.List;

public interface Constraint {

	void check(Element element) throws SemanticException;


	interface Name extends Constraint {
	}

	interface Component extends Constraint {

		String type();

		List<Rule<?>> rules();

		default <T> T rule(Class<T> aClass) {
			return (T) rules().stream().filter(aClass::isInstance).findFirst().orElse(null);
		}

		List<Annotation> annotations();
	}

	interface OneOf extends Component {
		List<Component> components();
	}

	interface Facet extends Constraint {
		String type();

		String[] with();

		boolean isRequired();

		String[] withOut();

		Facet has(Constraint... require);

		List<Constraint> constraints();
	}

	interface FacetInstantiation extends Constraint {
		List<String> types();
	}

	interface Property extends Constraint {

		String name();

		Primitive type();

		String facet();

		List<Rule> rules();

		default <T> T rule(Class<T> aClass) {
			return (T) rules().stream().filter(aClass::isInstance).findFirst().orElse(null);
		}

		int position();

		Level level();

		List<Annotation> annotations();

	}

	interface RejectOtherComponents extends Constraint {


	}

	interface RejectOtherParameters extends Constraint {


	}

	interface RejectOtherFacets extends Constraint {


	}
}
