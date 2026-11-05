package com.demo.model;

public class ContractEmployee extends Employee {

	int hrs;
	double rate;
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calSal() {
		// TODO Auto-generated method stub
		return basicSal + (hrs*rate);
	}
	
	public void print() {
		
		System.out.println("in Contract  Employee print ");
		
		
	}

}
