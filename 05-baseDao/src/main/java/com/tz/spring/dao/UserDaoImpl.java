package com.tz.spring.dao;

import com.tz.spring.entity.User;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * User Dao 实现类
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @Override
    public User login(String name, String password) {
        String hql = "from User u where u.name=:name and u.password=:password";
        Query query = getSession().createQuery(hql)
                    .setParameter("name",name)
                    .setParameter("password",password);
        return (User) query.uniqueResult();
    }

}
