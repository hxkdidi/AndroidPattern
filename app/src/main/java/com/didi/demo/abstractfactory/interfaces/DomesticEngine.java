package com.didi.demo.abstractfactory.interfaces;

/**
 * Created by map on 2017/3/26.
 */

public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
