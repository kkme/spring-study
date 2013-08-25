package com.tz.spring.dao;

import com.tz.spring.MyThreadLocal;
import com.tz.spring.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AccountDaoImpl implements AccountDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getSession(){
//		return sessionFactory.getCurrentSession();
        return (Session)MyThreadLocal.get("session");
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
