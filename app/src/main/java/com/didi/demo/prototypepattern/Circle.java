package com.didi.demo.prototypepattern;

/**
 * Created by map on 2017/3/26.
 */

public class Circle extends Shape {
    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.print("draw circle");
    }
}
