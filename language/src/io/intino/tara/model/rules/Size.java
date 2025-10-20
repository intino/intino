package io.intino.tara.model.rules;

import io.intino.tara.model.Rule;
import io.intino.tara.model.Sized;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Size implements Rule<Sized>, Serializable {
	private static final long serialVersionUID = 1L;
	private int min;
	private int max;

	public Size(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public Size(Size rule) {
		this.min = rule.min();
		this.max = rule.max();
	}


	public static Size MULTIPLE() {
		return new Size(0, Integer.MAX_VALUE);
	}

	public static Size SINGLE_REQUIRED() {
		return new Size(1, 1);
	}

	public int min() {
		return min;
	}

	public int max() {
		return max;
	}

	public boolean accept(Sized sized) {
		return sized.size() >= this.min && sized.size() <= max;
	}

	@Override
	public String errorMessage() {
		return min() == 0 && max() == 0 ? "reject.type.not.exists2" : "reject.element.not.in.range";
	}

	@Override
	public List<Object> errorParameters() {
		return Arrays.asList(min + "", max == Integer.MAX_VALUE ? "n" : max + "");
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Size && ((Size) obj).min() == this.min && ((Size) obj).max() == this.max;
	}

	public boolean isRequired() {
		return min > 0;
	}

	public boolean isSingle() {
		return max == 1;
	}

	public Size is() {
		return this;
	}

	public void is(Size rule) {
		this.min = rule.min();
		this.max = rule.max();
	}
}
