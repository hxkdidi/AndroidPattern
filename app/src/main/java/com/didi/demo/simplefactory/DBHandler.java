package com.didi.demo.simplefactory;

/**
 * Created by map on 2017/3/26.
 */

public class DBHandler extends IOHandler {
    @Override
    public void add(String id, String name) {
        System.out.print("数据库存储");
    }

    @Override
    public void remove(String id) {

    }
}
