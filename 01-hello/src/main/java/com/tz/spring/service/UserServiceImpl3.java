package com.tz.spring.service;

import com.tz.spring.User;
import com.tz.spring.dao.UserDao;

public class UserServiceImpl3 implements UserService{

    private UserDao userDao;
    //提供给Spring调用
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        System.out.println("UserServiceImpl 3 的 save 方法调用开始...");
        //业务逻辑...
        userDao.save(user);
        System.out.println("UserServiceImpl 3 的 save 方法调用结束...");
    }

}
