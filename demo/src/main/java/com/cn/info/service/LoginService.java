package com.cn.info.service;
import com.cn.info.pojo.Login;

/**
 * Created by GH on 2017/5/9.
 */
public interface LoginService {
    //判断用户登录
    Login login(String username,String password);
}
