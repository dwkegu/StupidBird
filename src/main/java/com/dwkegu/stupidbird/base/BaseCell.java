package com.dwkegu.stupidbird.base;

import java.util.List;

/**
 * base class for cell
 */
public abstract class BaseCell {
    /**
    cell type
     */
    protected CellType cellType;
    /**
    input of this cell
     */
    protected double[] input;

    private int[] inputSize;

    private double output;

    private BaseAward award;


    /**
     * connected cell on output port
     */
    private List<BaseCell> outConnectedCell;

    private List<BaseCell> inputConnectedCell;

    /**
     * run the cell
     */
    public void runCell(){
        dispatchInput();
        doOutput();
    }

    /**
     * dispatch input data into different composition.
     */
    protected abstract void dispatchInput();

    /**
     * feed input to this cell
     * @param input input array
     * @param start input start position in all inputs
     * @param length this input length
     */
    public abstract void setInput(double[] input,  int start, int length);

    /**
     * if one composition finish once running , if has output, set its output on the cell output port
     * @param output output array
     * @param start
     * @param length
     */
    protected abstract void setOutput(double[] output, int start, int length);

    /**
     * all the composition consumed the input do output
     */
    protected abstract void doOutput();

    /**
     *
     * @param dis
     * @param start
     * @param length
     */
    public abstract void feedback(double[] dis, int start, int length);

}
