package io.github.gjyaiya.sample.model;

import io.realm.annotations.PrimaryKey;

public class Account {
    @PrimaryKey
    private long id;
    private String name;
    private boolean isLogin;
    private long lastLoginTime;
}
