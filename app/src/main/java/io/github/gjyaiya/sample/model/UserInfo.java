package io.github.gjyaiya.sample.model;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

@RealmClass
public class UserInfo implements RealmModel {
    @PrimaryKey
    private long id;
    private String avatar;
    private String phone;
    private String address;
}
