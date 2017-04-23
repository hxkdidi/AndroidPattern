package com.didi.demo.abstractfactory;

import com.didi.demo.abstractfactory.interfaces.IBrake;
import com.didi.demo.abstractfactory.interfaces.IEngine;
import com.didi.demo.abstractfactory.interfaces.ITire;

/**
 * Created by map on 2017/3/26.
 */

public abstract class CarFactory {
    /**
     * 生产轮胎
     *
     * @return
     */
    public abstract ITire createTire();

    /**
     * 生产引擎
     *
     * @return
     */
    public abstract IEngine createEngine();

    /**
     * 生产制动系统
     *
     * @return
     */
    public abstract IBrake creteBrake();
}
