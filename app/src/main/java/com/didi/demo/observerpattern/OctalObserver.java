package com.didi.demo.observerpattern;

/**
 * Created by map on 2017/4/3.
 */

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String=" + Integer.toOctalString(subject.getState()));

    }
}
