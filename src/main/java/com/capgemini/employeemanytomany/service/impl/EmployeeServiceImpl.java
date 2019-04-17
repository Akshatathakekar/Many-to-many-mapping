package com.capgemini.employeemanytomany.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeemanytomany.dao.EmployeeDao;
import com.capgemini.employeemanytomany.entity.Employee;
import com.capgemini.employeemanytomany.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;


	@Override
	public Set<Employee> addEmployee(Set<Employee> employee) {
		
		dao.saveAll(employee);
		return employee;
		
	}


	@Override
	public Employee getEmployee(int id) {
		
		Employee e=dao.findById(id).get();
		return e;
	}

}
