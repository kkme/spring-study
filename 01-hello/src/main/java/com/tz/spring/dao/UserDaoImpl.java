package com.tz.spring.dao;

import com.tz.spring.User;

public class UserDaoImpl implements UserDao{

    public UserDaoImpl() {
        System.out.println("UserDaoImpl 空参构造被调用");
    }

    public void save(User user) {
        System.out.println("UserDaoImpl 的 save 方法调用开始...");
        System.out.println("user:"+user+"被保存了!");
        System.out.println("UserDaoImpl 的 save 方法调用结束...");
    }

}
