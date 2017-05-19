package com.cn.info.dao;

import com.cn.info.pojo.Login;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by GH on 2017/5/9.
 */
public interface LoginMapper {
    //更具用户名和密码查询哟用户
    @Select("select * from login where username=#{username} and password=#{password}")
    Login findWithLoginnameandpassword(@Param("username") String username, @Param("password") String password);
}
