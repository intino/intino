package io.intino.tara.language.semantics.constraints.annotations;

import io.intino.tara.language.semantics.errorcollector.SemanticException;
import io.intino.tara.language.semantics.errorcollector.SemanticIssue;
import io.intino.tara.model.Level;
import io.intino.tara.model.Mogram;
import io.intino.tara.model.MogramRoot;
import io.intino.tara.model.rules.Size;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.intino.tara.language.semantics.errorcollector.SemanticIssue.Level.ERROR;
import static io.intino.tara.model.Annotation.*;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class AnnotationCoherenceCheckerFactory {
	private static final Map<String, AnnotationChecker> checkers = new HashMap<>();

	static {
		checkers.put(Private.name().toLowerCase(), new PrivateChecker());
		checkers.put(Feature.name().toLowerCase(), new FeatureChecker());
		checkers.put(Component.name().toLowerCase(), new ComponentChecker());
	}

	private AnnotationCoherenceCheckerFactory() {
	}

	public static AnnotationChecker get(Object key) {
		return checkers.get(key.toString());
	}

	private static class PrivateChecker implements AnnotationChecker {
		@Override
		public void check(Mogram mogram) throws SemanticException {
			if (mogram.annotations().contains(Final)) throw error(mogram, asList(Final.name(), Private.name()));
		}
	}

	private static class FeatureChecker implements AnnotationChecker {
		@Override
		public void check(Mogram mogram) throws SemanticException {
			if (mogram.level() == Level.M3)
				throw error("m3.mogram.cannot.be", mogram, singletonList(Feature.name()));
//			if (mogram.isReference() && !mogram.targetOfReference().is(Feature))TODO
//				throw error("declared.mogram.must.be", mogram, singletonList(Feature.name()));
		}
	}

	private static class ComponentChecker implements AnnotationChecker {
		@Override
		public void check(Mogram mogram) throws SemanticException {
			if (!(mogram.container() instanceof MogramRoot)) throw error("reject.component.annotation", mogram);
//			if (mogram.isReference() && !mogram.targetOfReference().is(Component))
//				throw error("declared.mogram.must.be", mogram, singletonList(Component.name()));TODO
			if (mogram.annotations().contains(Feature)) throw error(mogram, asList(Feature.name(), Component.name()));
			final Size size = mogram.container().sizeOf(mogram);
			if (size == null) return;
			if (size.min() != 0 || size.max() != Integer.MAX_VALUE) throw error("reject.root.component.size", mogram);
		}
	}

	public static SemanticException error(Mogram mogram, List<String> flags) {
		return new SemanticException(new SemanticIssue(ERROR, "reject.flag.combination", mogram, flags));
	}

	public static SemanticException error(String message, Mogram mogram) {
		return new SemanticException(new SemanticIssue(ERROR, message, mogram));
	}

	public static SemanticException error(String message, Mogram mogram, List<String> parameters) {
		return new SemanticException(new SemanticIssue(ERROR, message, mogram, parameters));
	}
}
