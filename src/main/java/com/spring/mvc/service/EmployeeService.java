package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.EmployeeDao;
import com.spring.mvc.model.Employee;

@Service
public class EmployeeService {

    private final HibernateTemplate hibernateTemplate;

	@Autowired
	EmployeeDao employeeDao;

    EmployeeService(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

	public void saveEmployee(Employee emp) {
		employeeDao.saveEmployee(emp);
		System.out.println("EmployeeService.saveEmployee()");
	}
}
