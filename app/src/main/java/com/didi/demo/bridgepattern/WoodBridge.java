package com.didi.demo.bridgepattern;

/**
 * Created by map on 2017/4/3.
 */

public class WoodBridge implements BridgeAPI {
    @Override
    public void bridge(int length, int height, int width) {
        System.out.println("drawing wood bridge" + length + ":" + height + ":" + width + ":");
    }
}
