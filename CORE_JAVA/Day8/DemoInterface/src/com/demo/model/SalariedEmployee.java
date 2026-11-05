package com.demo.model;

import com.demo.util.Printable;

public class SalariedEmployee  extends Employee implements Printable{

	private double allowances;  
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calSal() {
		// TODO Auto-generated method stub
		return (basicSal + allowances + (basicSal*0.30));
	}
	
	public void print() {
		
		System.out.println("in Salaried Employee print ");
		
		
	}

}
