package com.mycompany.spring.controller;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-9
 */
public class UserListTo {

    private List<User> users;

    public UserListTo() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
