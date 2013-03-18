package com.tz.spring.service;

import com.tz.spring.entity.User;
import java.util.List;

public interface UserService {

	List<Object> save(User user);

    /**
     * 模拟：根据id查询用户名
     * @param id 主键
     * @return 用户名
     */
	String getUserName(int id);
	
}
