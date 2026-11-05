package com.demo.model;
//incomplete --- can not create an Object 
public abstract class Employee extends Person{
	
	String empId; 
	
	double  basicSal;

	public Employee() {
		// TODO Auto-generated constructor stub
	}		
	
	public Employee(String empId, double basicSal) {
		super();
		this.empId = empId;
		this.basicSal = basicSal;
	}
	
	public void showData() {
		
	}



	public abstract double calSal() ; // Method Declaration -- InComplete
	
	
	

}
