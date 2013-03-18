package com.tz.spring.service;

import com.tz.spring.User;
import com.tz.spring.dao.UserDao;

public class UserServiceImpl implements UserService{

    public UserServiceImpl() {
        System.out.println("UserServiceImpl 空参构造被调用");
    }

    private UserDao userDao;
    //提供给Spring调用
    public void setUserDao(UserDao userDao) {
        System.out.println("setUserDao run...");
        this.userDao = userDao;
    }

    public void save(User user) {
        System.out.println("UserServiceImpl 的 save 方法调用开始...");
        //业务逻辑...
        userDao.save(user);
        System.out.println("UserServiceImpl 的 save 方法调用结束...");
    }

}
