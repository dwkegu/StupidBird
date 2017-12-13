package com.dwkegu.stupidbird.neural;

import com.dwkegu.stupidbird.base.BaseCell;

public class NeuralCell extends BaseCell {

    LinearComposition linearComposition;

    @Override
    protected void dispatchInput() {
        linearComposition.run(input,0,input.length);
    }

    @Override
    public void setInput(double[] input, int start, int length) {

    }

    @Override
    protected void setOutput(double[] output, int start, int length) {

    }

    @Override
    protected void doOutput() {

    }

    @Override
    public void feedback(double[] dis, int start, int length) {

    }
}
