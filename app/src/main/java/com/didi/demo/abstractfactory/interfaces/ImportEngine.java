package com.didi.demo.abstractfactory.interfaces;

/**
 * Created by map on 2017/3/26.
 */

public class ImportEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
