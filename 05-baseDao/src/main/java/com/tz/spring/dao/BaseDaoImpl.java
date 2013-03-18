package com.tz.spring.dao;

import com.tz.spring.util.Pager;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Base Dao 实现类
 */
public class BaseDaoImpl<T> implements BaseDao<T>{

    private Class entityClass;

    @Resource
    private SessionFactory sessionFactory;

    public BaseDaoImpl() {
        //获得父类的类型
        Type type = getClass().getGenericSuperclass();
        if(type instanceof ParameterizedType){
            //获得泛型声明参数数组
            Type[] types = ((ParameterizedType) type).getActualTypeArguments();
            //获得实际实体类的类型
            this.entityClass = (Class) types[0];
        }
    }

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(T entity) {
        getSession().save(entity);
    }

    @Override
    public void delete(String id) {
        getSession().delete(get(id));
    }

    @Override
    public void update(T entity) {
        getSession().update(entity);
    }

    @Override
    public T get(String id) {
        return (T) getSession().get(entityClass, id);
    }

    @Override
    public T get(String propertyName, Object value) {
        String hql = "from " + entityClass.getName() + " as model where model." + propertyName + " = :value";
        Query query = getSession().createQuery(hql).setParameter("value",value);
        return (T) query.uniqueResult();
    }

    @Override
    public List<T> getList(String propertyName, Object value) {
        String hql = "from " + entityClass.getName() + " as model where model." + propertyName + " = :value";
        Query query = getSession().createQuery(hql).setParameter("value",value);
        return query.list();
    }

    @Override
    public List<T> getAll() {
        String hql = "from " + entityClass.getName();
        Query query = getSession().createQuery(hql);
        return query.list();
    }

    @Override
    public Long getTotalCount() {
        String hql = "select count(*) from " + entityClass.getName();
        Query query = getSession().createQuery(hql);
        return (Long) query.uniqueResult();
    }

    @Override
    public Pager findByPager(Pager pager) {
        if (pager == null) {
            pager = new Pager();
        }
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(entityClass);
        return findByPager(pager, detachedCriteria);
    }

    @Override
    public Pager findByPager(Pager pager, DetachedCriteria detachedCriteria) {
        if (pager == null) {
            pager = new Pager();
        }
        Integer pageNumber = pager.getPageNumber();
        Integer pageSize = pager.getPageSize();

        Criteria criteria = detachedCriteria.getExecutableCriteria(getSession());

        //1.获得记录总数，用于分页计算
        Integer totalCount = (Integer) criteria.setProjection(Projections.rowCount()).uniqueResult();
        pager.setTotalCount(totalCount);

        //2.获得分页数据
        criteria.setProjection(null);//撤销 Projections.rowCount()
//        criteria.setResultTransformer(CriteriaSpecification.ROOT_ENTITY); //查询总数

        criteria.setFirstResult((pageNumber - 1) * pageSize);
        criteria.setMaxResults(pageSize);
        pager.setList(criteria.list());

        return pager;
    }
}
