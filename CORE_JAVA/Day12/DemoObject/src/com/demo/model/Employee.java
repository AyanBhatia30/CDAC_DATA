package com.demo.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int id ;
	private String name ;
	private float sal;	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
