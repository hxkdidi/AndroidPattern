package com.didi.demo.decoratorpattern;

/**
 * Created by map on 2017/3/26.
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.print("rectangle");
    }
}
