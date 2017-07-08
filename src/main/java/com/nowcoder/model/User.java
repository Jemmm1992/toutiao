package com.nowcoder.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by xu_zj on 2017/5/26.
 */
@Setter
@Getter
@ToString
public class User {
    private int id;
    private String name;
    private String password;
    private String salt;
    private String headUrl;

    public User() {

    }
    public User(String name) {
        this.name = name;
        this.password = "";
        this.salt = "";
        this.headUrl = "";
    }
}
