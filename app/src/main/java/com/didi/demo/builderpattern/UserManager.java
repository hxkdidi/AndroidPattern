package com.didi.demo.builderpattern;

/**
 * Created by map on 2017/3/26.
 */

public class UserManager {
    private User user;

    public static UserManager userManager;

    public static UserManager getInstance() {
        if (userManager == null) {
            userManager = new UserManager();
        }
        return userManager;
    }

    public void init(User user) {
        this.user = user;
    }
}
