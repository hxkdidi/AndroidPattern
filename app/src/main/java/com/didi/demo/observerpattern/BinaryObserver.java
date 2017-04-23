package com.didi.demo.observerpattern;

/**
 * Created by map on 2017/4/3.
 */

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println(" Binary String =" + Integer.toBinaryString(subject.getState()));

    }
}
