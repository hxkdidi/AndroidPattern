package com.didi.demo.prototypepattern;

/**
 * Created by map on 2017/3/26.
 */

public class Square extends Shape {
    public Square() {
        type = "square";
    }

    @Override
    public void draw() {
        System.out.print("draw square");
    }
}
