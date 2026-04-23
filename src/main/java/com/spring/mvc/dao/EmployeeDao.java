package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public void saveEmployee(Employee emp) {
		hibernateTemplate.persist(emp);
	}
}
