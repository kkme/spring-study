package com.tz.spring;

import com.tz.spring.dao.UserDaoImpl;

/**
 * User Java Bean
 */
public class User {

    private String name;
    private int age;

    //显示的声明一个空参是良好的编程习惯
    public User() {
        System.out.println("User 的空参构造被调用...");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
//		System.out.println("setName run...");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}