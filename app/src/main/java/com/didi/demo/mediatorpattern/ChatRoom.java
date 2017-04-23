package com.didi.demo.mediatorpattern;

import java.util.Date;

/**
 * Created by map on 2017/4/4.
 */

public class ChatRoom {
    public static void sendMessage(Chatter user, String message) {
        System.out.println(new Date().toString() + user.getName() + message);
    }
}
