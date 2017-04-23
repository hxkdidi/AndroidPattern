package com.didi.demo.facadepttern;

/**
 * Created by map on 2017/4/4.
 */

public class SuperTool implements Tool {
    @Override
    public void tool() {
        System.out.println("Super tool:");
    }
}
