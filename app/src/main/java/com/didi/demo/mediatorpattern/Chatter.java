package com.didi.demo.mediatorpattern;

/**
 * Created by map on 2017/4/4.
 */

public class Chatter {
    private String name;

    public Chatter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.sendMessage(this, message);
    }

}
