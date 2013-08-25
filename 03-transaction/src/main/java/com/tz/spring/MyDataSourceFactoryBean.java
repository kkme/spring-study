package com.tz.spring;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.FactoryBean;

import javax.sql.DataSource;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-25
 */
public class MyDataSourceFactoryBean implements FactoryBean<DataSource> {

    @Override
    public DataSource getObject() throws Exception {
        System.out.println("MyDataSourceFactoryBean getObject() run...");
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306/spring");
        bds.setUsername("root");
        bds.setPassword("root");
        return bds;
    }

    @Override
    public Class getObjectType() {
        return DataSource.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
