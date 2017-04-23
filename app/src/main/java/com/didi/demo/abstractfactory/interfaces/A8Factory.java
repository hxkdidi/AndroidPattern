package com.didi.demo.abstractfactory.interfaces;

import com.didi.demo.abstractfactory.CarFactory;

/**
 * Created by map on 2017/3/26.
 */

public class A8Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SuvTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake creteBrake() {
        return new SeniorBrake();
    }
}
