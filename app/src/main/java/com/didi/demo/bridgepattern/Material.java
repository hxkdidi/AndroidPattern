package com.didi.demo.bridgepattern;

/**
 * Created by map on 2017/4/3.
 */

public abstract class Material {
    protected BridgeAPI bridgeAPI;

    public Material(BridgeAPI bridgeAPI) {
        this.bridgeAPI = bridgeAPI;
    }

    public abstract void build();
}
