package com.tz.spring.controller;

import com.tz.spring.User;
import com.tz.spring.service.UserService;

public class UserController {

    public UserController() {
        System.out.println("UserController 空参构造被调用");
    }

    //依赖UserService
    private UserService userService;
    public void setUserService(UserService userService) {
        System.out.println("setUserService run...");
        this.userService = userService;
    }

    public void save(User user){
        System.out.println("UserController 的 save 方法调用开始...");
        userService.save(user);
        System.out.println("UserController 的 save 方法调用结束...");
    }

}
