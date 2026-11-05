package com.demo.test;

import com.demo.model.Employee;
import com.demo.model.SalariedEmployee;

public class TestOverride {
	
	//public void add (int a , int b)   {  } 
	//public int  add (int a , int b) { return 0; } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalariedEmployee  se  =  new SalariedEmployee (); 
		Employee e =   new SalariedEmployee (); 

		// SalariedEmployee   s =  new Employee (); 

		SalariedEmployee  se1 = (SalariedEmployee) se.getObject();   // compile time error 

	}

}
