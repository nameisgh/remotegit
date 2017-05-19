package com.cn.info.service.imp;

import com.cn.info.dao.LoginMapper;
import com.cn.info.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cn.info.pojo.Login;
/**
 * Created by GH on 2017/5/9.
 */
@Service("LoginService")
public class LoginServiceImp implements LoginService{
    @Autowired
    private LoginMapper loginmapper;
    @Override
    public Login login(String username,String password){
       return loginmapper.findWithLoginnameandpassword(username,password);
    }
}
