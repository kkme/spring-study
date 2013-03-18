package com.tz.spring.dao;

import com.tz.spring.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository//当前类作为数据访问层的 Bean
public class AccountDaoImpl implements AccountDao {

    @Resource
	private SessionFactory sessionFactory;

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Account getById(long id) {
		return (Account)getSession().get(Account.class,id);
	}

	@Override
	public void save(Account account) {
		getSession().save(account);
	}

	@Override
	public void update(Account account) {
		getSession().update(account);
	}

}
