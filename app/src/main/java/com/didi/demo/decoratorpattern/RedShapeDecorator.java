package com.didi.demo.decoratorpattern;

/**
 * Created by map on 2017/3/26.
 */

public class RedShapeDecorator extends ShapeDecorator {
    private Shape redBorder;

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    public void setRedBorder(Shape decoratorShape) {
        System.out.println("border color red");
    }
}
