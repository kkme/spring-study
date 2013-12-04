package com.mycompany.jpa.dao.impl;

import com.mycompany.jpa.dao.EmployeeDao;
import com.mycompany.jpa.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends BaseDaoImpl<Employee,String> implements EmployeeDao {

}
