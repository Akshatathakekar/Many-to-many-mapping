package com.capgemini.employeemanytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Employee> employee; 
	

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String name, Set<Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
	}
	
		
	public Project(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Set<Employee> getEmployee() {
//		return employee;
//	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", employee=" + employee + "]";
	}
	
	
	
	
	
	
}
