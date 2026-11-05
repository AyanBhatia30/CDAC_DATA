package com.demo.test;

public class TestMultiCatch {
	
	public void calculation(int i , int j)  {
		//runtime exception 	
	}

	public static void main(String[] args) {
		
		String s = null; // value nothing 
		
		System.out.println(s.length());/// runtime / unchecked 
		// java 7 
		
		//  try with resource 
		TestMultiCatch t = new TestMultiCatch();
		try {
			t.calculation( 10 , 20);
}catch (ArithmeticException | NumberFormatException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
