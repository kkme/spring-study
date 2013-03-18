package com.tz.spring.service;

import com.tz.spring.dao.UserDao;
import com.tz.spring.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * User Service 实现类
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource
    private UserDao userDao;

    @Resource
    public void setBaseDao(UserDao userDao) {
        super.setBaseDao(userDao);
    }

    @Override
    public User login(String name, String password) {
        return userDao.login(name,password);
    }
}
