package io.github.gjyaiya.sample.model;

import io.realm.annotations.PrimaryKey;

public class User {
    @PrimaryKey
    private long id;
    private String name;
    private String nick;
    private String avatar;
}
