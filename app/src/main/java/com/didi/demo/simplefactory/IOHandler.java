package com.didi.demo.simplefactory;

/**
 * Created by map on 2017/3/26.
 */

public abstract class IOHandler {
    /**
     * 增加的方法
     *
     * @param id
     * @param name
     */
    public abstract void add(String id, String name);

    /**
     * 删除的方法
     *
     * @param id
     */
    public abstract void remove(String id);

}
