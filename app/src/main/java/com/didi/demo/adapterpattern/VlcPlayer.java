package com.didi.demo.adapterpattern;

/**
 * Created by map on 2017/3/26.
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.print("playing vlc fileName " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
