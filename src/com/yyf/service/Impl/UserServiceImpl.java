package com.yyf.service.Impl;

import com.yyf.dao.UserDao;
import com.yyf.po.User;
import com.yyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 根据用户名和密码查询用户的方法
     * @param usercode：账号
     * @param password：密码
     * @return用户对象
     */
    @Override
    public User findUser(String usercode, String password) {
        User user = this.userDao.findUser(usercode, password);
        return user;
    }
}
