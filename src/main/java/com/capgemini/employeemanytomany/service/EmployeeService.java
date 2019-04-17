package com.capgemini.employeemanytomany.service;

import java.util.Set;

import com.capgemini.employeemanytomany.entity.Employee;

public interface EmployeeService {

	public Set<Employee> addEmployee(Set<Employee> employee);
	public Employee getEmployee(int id);
	
}
