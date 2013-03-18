package com.tz.spring.service;

import com.tz.spring.dao.BaseDao;
import com.tz.spring.util.Pager;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Base Service 实现类
 */
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDao baseDao;
    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void save(T entity) {
        baseDao.save(entity);
    }

    @Override
    public void delete(String id) {
        baseDao.delete(id);
    }

    @Override
    public void update(T entity) {
        baseDao.update(entity);
    }

    @Override
    public T get(String id) {
        return (T) baseDao.get(id);
    }

    @Override
    public T get(String propertyName, Object value) {
        return (T) baseDao.get(propertyName,value);
    }

    @Override
    public List<T> getList(String propertyName, Object value) {
        return baseDao.getList(propertyName,value);
    }

    @Override
    public List<T> getAll() {
        return baseDao.getAll();
    }

    @Override
    public Object getTotalCount() {
        return baseDao.getTotalCount();
    }

    @Override
    public Pager findByPager(Pager pager) {
        return baseDao.findByPager(pager);
    }

    @Override
    public Pager findByPager(Pager pager, DetachedCriteria detachedCriteria) {
        return baseDao.findByPager(pager,detachedCriteria);
    }
}
