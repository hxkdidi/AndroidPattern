package com.didi.demo.abstractfactory.interfaces;

/**
 * Created by map on 2017/3/26.
 */

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
