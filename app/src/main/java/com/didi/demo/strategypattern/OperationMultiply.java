package com.didi.demo.strategypattern;

/**
 * Created by map on 2017/4/4.
 */

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
