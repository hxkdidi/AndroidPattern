package com.didi.demo.observerpattern;

/**
 * Created by map on 2017/4/3.
 */

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
