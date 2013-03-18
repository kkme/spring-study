package com.tz.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User  实体类
 */
@Entity
@Table(name = "tbl_user")
public class User extends BaseEntity {

	private String name;
	private String password;
	private int age;
	
	public User() {
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
