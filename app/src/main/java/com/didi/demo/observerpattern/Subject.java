package com.didi.demo.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by map on 2017/4/3.
 */

public class Subject {
    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer :
                observerList) {
            observer.update();
        }
    }
}
