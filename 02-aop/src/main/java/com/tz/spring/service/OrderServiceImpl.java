package com.tz.spring.service;

import com.tz.spring.entity.Order;

public class OrderServiceImpl implements OrderService {

	@Override
	public void save(Order order){
        System.out.println("保存了 order..");
//		throw new RuntimeException("随机异常！");
//		return "OK";
	}

}
