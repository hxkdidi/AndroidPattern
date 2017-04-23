package com.didi.demo.prototypepattern;

/**
 * Created by map on 2017/3/26.
 */

public class Rectangle extends Shape {

    public Rectangle() {
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.print("draw rectangle");
    }
}
