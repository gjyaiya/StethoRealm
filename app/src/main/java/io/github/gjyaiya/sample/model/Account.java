package io.github.gjyaiya.sample.model;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

@RealmClass
public class Account implements RealmModel {
    @PrimaryKey
    private long id;
    private String name;
    private boolean isLogin;
    private long lastLoginTime;
}
