package com.demo.test;

public class Test {
	
	public void calculation(int i , int j) throws Exception {
		//runtime exception 
		
		
		
	}

	public static void main(String[] args) {
		
		String s = null; // value nothing 
		
		System.out.println(s.length());/// runtime / unchecked 
		
		Test t = new Test();
		try {
			t.calculation( 10 , 20);
		}catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
