package io.intino.tara.model.rules.custom;


import io.intino.tara.model.Rule;

public class Natural implements Rule<Double> {
    private static final long serialVersionUID = 1L;
    @Override
    public boolean accept(Double value) {
        return value > 0;
    }
}
