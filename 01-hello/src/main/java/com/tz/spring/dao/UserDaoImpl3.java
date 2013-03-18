package com.tz.spring.dao;

import com.tz.spring.User;

public class UserDaoImpl3 implements UserDao{

    public UserDaoImpl3() {
        System.out.println("UserDaoImpl 3 空参构造被调用");
    }

    public void save(User user) {
        System.out.println("UserDaoImpl 3 的 save 方法调用开始...");
        System.out.println("user:"+user+"被保存了!");
        System.out.println("UserDaoImpl 3 的 save 方法调用结束...");
    }

}
