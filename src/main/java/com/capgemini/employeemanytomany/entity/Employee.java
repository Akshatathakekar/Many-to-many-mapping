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
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name="eid")
	private int id;
	
	@Column(name="ename")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name="EMPLOYEE_project", 
     joinColumns={@JoinColumn(name="eid")}, 
     inverseJoinColumns={@JoinColumn(name="id")})
	private Set<Project> project;

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

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", project=" + project + "]";
	}

	public Employee(int id, String name, Set<Project> project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
	}

	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

}
