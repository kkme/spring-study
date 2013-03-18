package com.tz.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
/**
 * 账户 实体类
 */
@Entity
public class Account implements Serializable{

    private static final long serialVersionUID = 2344955420463822341L;

    private long id;//账户号码 长整数
    private String password;//账户密码
    private String name;//真实姓名
    private double balance;//balance:账户余额
    private String bank;//银行名

    public Account() {
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
	
}
