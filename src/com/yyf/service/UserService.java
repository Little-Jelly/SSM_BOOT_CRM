package com.yyf.service;

import com.yyf.po.User;

/**
 * 用户Service接口
 */
public interface UserService {
    /**
     *  通过账号和密码查询用户
     * @param usercode：账号
     * @param password：密码
     * @return：用户对象
     */
    public User findUser(String usercode, String password);
}
