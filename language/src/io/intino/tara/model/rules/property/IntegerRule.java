package io.intino.tara.model.rules.property;

import io.intino.tara.model.Primitive;
import io.intino.tara.model.Rule;
import io.intino.tara.model.Valued;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerRule implements Rule<Valued> {
	private static final long serialVersionUID = 1L;
	private static final String REJECT_NUMBER_PARAMETER_NOT_IN_RANGE = "reject.number.parameter.not.in.range";
	private static final String REJECT_NUMBER_PARAMETER_WITH_ERRONEOUS_METRIC = "reject.number.parameter.with.erroneous.metric";
	private static final String REJECT_NUMBER_PARAMETER_WITH_METRIC = "reject.number.parameter.with.metric";
	private final int min;
	private final int max;
	private final String metric;
	private String message = "";

	public IntegerRule(int min, int max) {
		this(min, max, null);
	}

	public IntegerRule(int min, int max, String metric) {
		this.min = min;
		this.max = max;
		this.metric = metric;
	}

	@Override
	public boolean accept(Valued valued) {
		if (!valued.values().isEmpty() && valued.values().getFirst() instanceof Primitive.Reference r && r.isEmpty())
			return true;
		boolean accept = valued.values().stream().map(v -> (Integer) v).allMatch(v -> v >= min && v <= max);
		if (!accept) {
			message = REJECT_NUMBER_PARAMETER_NOT_IN_RANGE;
			return false;
		}
		if (this.metric != null && !this.metric.isEmpty()) {
			accept = !metric.equals(valued.metric());
			if (!accept) message = this.metric.isEmpty() ?
					REJECT_NUMBER_PARAMETER_WITH_METRIC :
					REJECT_NUMBER_PARAMETER_WITH_ERRONEOUS_METRIC;
		}
		return true;
	}

	@Override
	public List<Object> errorParameters() {
		return errorMessage().equals(REJECT_NUMBER_PARAMETER_WITH_ERRONEOUS_METRIC) ?
				Collections.singletonList(metric)
				: Arrays.asList(min + "", max + "", metric);
	}

	@Override
	public String errorMessage() {
		return message;
	}

	public int min() {
		return min;
	}

	public int max() {
		return max;
	}

	public String metric() {
		return metric;
	}
}