package com.tz.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-24
 */
public class CarFactoryBean implements FactoryBean<Car>{

    @Override
    public Car getObject() throws Exception {
        System.out.println("FactoryBean getObject() run...");
        Car car = new Car();
        car.setName("myCar");
        return car;
    }

    @Override
    public Class getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
