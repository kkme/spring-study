package com.mycompany.jpa.service.impl;

import com.mycompany.jpa.dao.EmployeeDao;
import com.mycompany.jpa.service.EmployeeService;
import com.mycompany.jpa.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeServiceImpl extends BaseServiceImpl<Employee,String> implements EmployeeService{

    @Resource
	public void setBaseDao(EmployeeDao employeeDao) {
		super.setBaseDao(employeeDao);
	}

}
