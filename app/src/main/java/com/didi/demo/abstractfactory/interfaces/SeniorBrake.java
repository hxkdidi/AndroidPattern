package com.didi.demo.abstractfactory.interfaces;

/**
 * Created by map on 2017/3/26.
 */

public class SeniorBrake implements IBrake {

    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
