package com.didi.demo.simplefactory;

/**
 * Created by map on 2017/3/26.
 */

public class FileHandler extends IOHandler {
    @Override
    public void add(String id, String name) {
        System.out.println("文件存储");
    }

    @Override
    public void remove(String id) {
        System.out.println("文件删除");
    }
}
