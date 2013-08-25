package com.tz.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-25
 */
public class MyAroundAdvice {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Object around(ProceedingJoinPoint pjp){
        Object obj = null;

        Session session = sessionFactory.openSession();
        MyThreadLocal.set("session", session);
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            obj = pjp.proceed();
            session.getTransaction().commit();
        } catch (Throwable e) {
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
            MyThreadLocal.remove();
        }
        return obj;
    }

}
