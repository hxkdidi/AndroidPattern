package com.didi.demo.strategypattern;

/**
 * Created by map on 2017/4/4.
 */

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
