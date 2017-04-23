package com.didi.demo.flyweightpattern;

import android.support.v4.util.SimpleArrayMap;

/**
 * Created by map on 2017/4/3.
 */

public class GirlFactory {
    private static final SimpleArrayMap<String, Girl> girlMap = new SimpleArrayMap<>();

    public static Girl getSexyGirl(String name) {
        SexyGirl sexyGirl = (SexyGirl) girlMap.get(name);
        if (sexyGirl == null) {
            sexyGirl = new SexyGirl(name);
            girlMap.put(name, sexyGirl);
            System.out.println(" creating sexy girl of name = " + name);
        }
        return sexyGirl;
    }

}
