package io.github.gjyaiya.sample.model;


import io.realm.annotations.PrimaryKey;

public class AccountSetting {
    @PrimaryKey
    private long id;
    private boolean isRealName;
    private boolean isNeedPayPass;
}
