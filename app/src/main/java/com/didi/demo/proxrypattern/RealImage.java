package com.didi.demo.proxrypattern;

/**
 * Created by map on 2017/3/26.
 */

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("loading");
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
