package com.mycompany.order;

import com.mycompany.jpa.service.EmployeeService;
import com.mycompany.jpa.entity.Employee;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.Set;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestEmployee extends AbstractTransactionalJUnit4SpringContextTests {

    private static final String TEST_NAME = "testName";

    @Resource
    private EmployeeService employeeService;

    @Test
    public void simple(){
    }

    @Test
    public void test1SaveAndGet(){
        createAndSaveEmployee(TEST_NAME, 10);

        Employee employee = employeeService.get("name" , TEST_NAME);
        Assert.assertEquals(TEST_NAME , employee.getName());
        Assert.assertEquals(10 , employee.getAge());
    }

    private void createAndSaveEmployee(String name, int age) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAge(age);
        employeeService.save(employee);
    }

    @Test
    public void test2Update(){
        createAndSaveEmployee(TEST_NAME , 10);

        Employee employee = employeeService.get("name" , TEST_NAME);
        Assert.assertEquals(TEST_NAME , employee.getName());
        Assert.assertEquals(10 , employee.getAge());

        employee.setAge(20);
        employeeService.update(employee);

        Employee employeeTo2 = employeeService.get("name" , TEST_NAME);
        Assert.assertEquals(TEST_NAME , employeeTo2.getName());
        Assert.assertEquals(20 , employeeTo2.getAge());
    }

    @Test
    public void test3Delete(){
        createAndSaveEmployee(TEST_NAME , 10);

        Employee employeeTo = employeeService.get("name" , TEST_NAME);
        employeeService.delete(employeeTo);

        Set set = employeeService.getList("name" , TEST_NAME);
        Assert.assertEquals(0 , set.size());
    }

}
