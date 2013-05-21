package com.tz.spring.service;

import com.tz.spring.util.Pager;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

/**
 * Base Service 基础接口类
 */
public interface BaseService<T> {

    /**
     * 保存对象
     * @param entity 实体类
     */
    void save(T entity);

    /**
     * 根据ID删除实体对象.
     * @param id 记录ID
     */
    public void delete(String id);

    /**
     * 更新实体对象.
     * @param entity 对象实例
     */
    void update(T entity);

    /**
     * 根据ID获取实体对象.
     * @param id 记录ID
     * @return 实体对象
     */
    T get(String id);

    /**
     * 根据属性名和属性值获取一个实体对象.
     * @param propertyName 属性名称
     * @param value 属性值
     * @return 实体对象
     */
    public T get(String propertyName, Object value);

    /**
     * 根据属性名和属性值获取实体对象集合.
     * @param propertyName 属性名称
     * @param value 属性值
     * @return 实体对象
     */
    public List<T> getList(String propertyName, Object value);

    /**
     * 获取所有实体对象集合.
     * @return 实体对象集合
     */
    public List<T> getAll();

    /**
     * 获取所有实体对象总数.
     *
     * @return 实体对象总数
     */
    public Object getTotalCount();

    /**
     * 根据Pager对象进行查询(提供分页、查找、排序功能).
     * @param pager Pager对象
     * @return Pager对象
     */
    public Pager findByPager(Pager pager);

    /**
     * 根据Pager和DetachedCriteria对象进行查询(提供分页、查找、排序功能).
     * @param pager Pager对象
     * @return Pager对象
     */
    public Pager findByPager(Pager pager, DetachedCriteria detachedCriteria);

}
