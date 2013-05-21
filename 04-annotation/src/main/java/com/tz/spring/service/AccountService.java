package com.tz.spring.service;

import com.tz.spring.entity.Account;

/**
 * Account Service 接口类
 */
public interface AccountService {

    /**
     * 保存账号
     * @param account 账号实例
     */
    void save(Account account);

    /**
     * 转账功能
     * @param from 转出账户
     * @param to 转入账户
     * @param amount 转账金额
     * @return 转账结果
     */
    String transfer(long from, long to,double amount);

}
