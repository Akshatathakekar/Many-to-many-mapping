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


//
//	@Override
//	public Set<Employee> getEmployee(int id) {
//
//		Employee employee = dao.findById(id).get();
//
//		return employee;
//	}

	@Override
	public Set<Employee> addEmployee(Set<Employee> employee) {
		
		dao.saveAll(employee);
		return employee;
		
	}

}
