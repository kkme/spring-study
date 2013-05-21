package com.tz.spring.dao;

import com.tz.spring.User;

public class UserDaoImpl2 implements UserDao{

    public UserDaoImpl2() {
        System.out.println("UserDaoImpl 2 空参构造被调用");
    }

    public void save(User user) {
        System.out.println("UserDaoImpl 2 的 save 方法调用开始...");
        System.out.println("user:"+user+"被保存了!");
        System.out.println("UserDaoImpl 2 的 save 方法调用结束...");
    }

}
