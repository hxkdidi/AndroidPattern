package com.didi.demo.abstractfactory.interfaces;

import com.didi.demo.abstractfactory.CarFactory;

/**
 * Created by map on 2017/3/26.
 */

public class BMWFactory extends CarFactory {

    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake creteBrake() {
        return new NormalBrake();
    }
}
