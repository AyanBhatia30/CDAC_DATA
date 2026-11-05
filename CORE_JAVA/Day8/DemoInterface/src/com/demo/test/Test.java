package com.demo.test;

import com.demo.model.ContractEmployee;
import com.demo.model.Employee;
import com.demo.model.SalariedEmployee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e ;//  abstract 		
		//e = new Employee() ;
		// Dynamic Poly
		e = new SalariedEmployee();
		
		System.out.println(e.calSal());// SalariedEm
		
		e = new ContractEmployee();
		
		System.out.println(e.calSal());// ContractEmpl
		

	}

}






