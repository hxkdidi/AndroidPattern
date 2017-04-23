package com.didi.demo.builderpattern;

/**
 * Created by map on 2017/3/26.
 */

public class User {
    public String userId;
    public String userName;

    private User() {
    }

    public static class Builder {
        private String userId;
        private String userName;

        public Builder setId(String id) {
            userId = id;
            return this;
        }

        public Builder setUserName(String name) {
            userName = name;
            return this;
        }

        void applyUser(User user) {
            user.userId = this.userId;
            user.userName = this.userName;
        }

        public User create() {
            User user = new User();
            applyUser(user);
            return user;
        }

    }
}
