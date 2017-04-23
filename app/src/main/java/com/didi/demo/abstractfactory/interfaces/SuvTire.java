package com.didi.demo.abstractfactory.interfaces;

/**
 * Created by map on 2017/3/26.
 */

public class SuvTire implements ITire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
