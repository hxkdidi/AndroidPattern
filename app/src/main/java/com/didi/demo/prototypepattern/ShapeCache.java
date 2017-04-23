package com.didi.demo.prototypepattern;

import java.util.Hashtable;

/**
 * Created by map on 2017/3/26.
 */

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape shapeCache = shapeMap.get(shapeId);
        return (Shape) shapeCache.clone();
    }

    public static void loadCache() {

        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Circle circle = new Circle();
        circle.setId("3");
        shapeMap.put(circle.getId(), circle);
    }
}
