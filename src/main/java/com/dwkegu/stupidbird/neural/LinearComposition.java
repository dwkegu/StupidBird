package com.dwkegu.stupidbird.neural;

import com.dwkegu.stupidbird.base.ICellComposition;

public class LinearComposition implements ICellComposition {
    double[] weight;

    @Override
    public double[] run(double[] input, int start, int length) {
        return new double[0];
    }
}
