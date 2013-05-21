package com.tz.spring.dao;

import com.tz.spring.entity.Account;

/**
 * Account Dao 接口类
 */
public interface AccountDao {

    /**
     * 保存账户
     * @param account 账户实例
     */
    void save(Account account);

    /**
     * 根据用户账号查找用户
     * @param id 用户账号
     * @return 账户实例，如果账户不存在,则返回NULL
     */
    Account getById(long id);

    /**
     * 更新账户信息
     * @param account 账户实例
     */
    void update(Account account);

}
