package com.cn.info.pojo;

import java.io.Serializable;

/**
 * Created by gh on 2017/4/27.
 */
public class Login  {
    private String username;
    private Long password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }
}
