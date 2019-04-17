package com.capgemini.employeemanytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeemanytomany.entity.Employee;
import com.capgemini.employeemanytomany.entity.Project;
import com.capgemini.employeemanytomany.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;


	@RequestMapping("/addemp")
	public Set<Employee> addEmployeeDetails() {

		Project p1 = new Project(11111, "AI");
		Project p2 = new Project(22222, "Networking");

		Set<Project> project = new HashSet<Project>();
		project.add(p1);
		project.add(p2);

		Project p3 = new Project(22222, "automation");

		Set<Project> project2 = new HashSet<Project>();
		project2.add(p1);
		project2.add(p3);

		Employee e1 = new Employee(101, "akshata", project);
		Employee e2 = new Employee(102, "mahi", project2);

		Set<Employee> emp = new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);

		service.addEmployee(emp);

		return emp;
	}

//
//	@RequestMapping("/addproj")
//	public Set<Project> addProjectDetails() {
//		
//		
//		Employee e1=new Employee(101,"akshata");
//		Employee e2=new Employee(102,"mahi");
//		Set<Employee> emp=new HashSet<Employee>();
//		
//		emp.add(e1);
//		emp.add(e2);
//	
//		Project p1=new Project(11111, "AI",emp);
//		Project p2=new Project(22222, "Networking",emp);
//
//		Set<Project> prj=new HashSet<Project>();
//		prj.add(p1);
//		prj.add(p2);
//		
//		serv.addProject(prj);
//		
//		return prj;
//	}

//	@RequestMapping("/get")
//	public Employee getEmployeeDetails() {
//		Employee employee = service.getEmployee(101);
//		return employee;
//	}
//

}
