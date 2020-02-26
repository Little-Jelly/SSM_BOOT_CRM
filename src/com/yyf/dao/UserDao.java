package com.yyf.dao;

import com.yyf.po.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户DAO层接口
 *
 */
public interface UserDao {

    /**
     * 根据用户名和密码查询用户的方法
     * @param usercode：用户名：由参数"usercode"给出
     * @param password：密码：由参数"password"给出
     * @return 用户对象
     */
    public User findUser(@Param("usercode") String usercode,
                         @Param("password") String password);
}
