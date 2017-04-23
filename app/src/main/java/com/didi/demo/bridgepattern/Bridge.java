package com.didi.demo.bridgepattern;

/**
 * Created by map on 2017/4/3.
 */

public class Bridge extends Material {
    private int height,weight,width;

    public Bridge(BridgeAPI bridgeAPI, int height, int weight, int width) {
        super(bridgeAPI);
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    @Override
    public void build() {
        bridgeAPI.bridge(height,weight,width);
    }
}
