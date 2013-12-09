package com.mycompany.spring.controller;

/**
 * Created with IntelliJ IDEA.
 * Date: 13-12-6
 * Time: 上午10:45
 */
public class User {

    private String name;
    private String password;
    private Pet pet;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", pet=" + pet +
                '}';
    }
}
