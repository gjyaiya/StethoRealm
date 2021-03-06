package io.github.gjyaiya.sample.model;


import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

@RealmClass
public class AccountSetting implements RealmModel {
    @PrimaryKey
    private long id;
    private boolean isRealName;
    private boolean isNeedPayPass;
}
