package com.tz.spring.dao;

import com.tz.spring.entity.User;

/**
 * User Dao 接口类
 */
public interface UserDao extends BaseDao<User> {

    /**
     * 用户登录
     * 失败返回 Null
     * 成功返回 User 实例
     * @param name name
     * @param password 密码
     * @return User实例
     */
    User login(String name , String password);

}
