package com.didi.demo.decoratorpattern;

/**
 * Created by map on 2017/3/26.
 */

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    public void draw() {
        decoratorShape.draw();
    }
}
