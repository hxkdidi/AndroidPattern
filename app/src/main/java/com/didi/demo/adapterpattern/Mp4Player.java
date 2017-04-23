package com.didi.demo.adapterpattern;

/**
 * Created by map on 2017/3/26.
 */

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.print("playing fileName " + fileName);
    }
}
