package com.demo.model;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public void division(int i , int j ) {	
		
		try {
			System.out.println("Division " + (i/j));
		} catch (ArithmeticException e) {
			System.out.println("Division by zero not possible ");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void division1(int i , int j )  throws ArithmeticException
	{		
	
			System.out.println("Division 1" + (i/j));
	
		
	}

}
