package com.didi.demo.flyweightpattern;

/**
 * Created by map on 2017/4/3.
 */

public class SexyGirl implements Girl {
    private String name;
    private int weight;
    private int height;
    private int age;

    public SexyGirl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void hook() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SexyGirl{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
