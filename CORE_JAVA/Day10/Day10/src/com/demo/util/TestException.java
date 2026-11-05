package com.demo.util;

public class TestException {

	public static void main(String[] args) {
		System.out.println("Main Start");
		String s = "10";
		try {
				// Connection con getconnection db
				int i  = Integer.parseInt(s);//runtime error
				System.out.println( i);
				System.out.println( i / 0);// divide
				//con.close()
		}  
		
		catch (NumberFormatException e) 
		{
			System.out.println("enter number not a character");
			//con.close()
		}	
		catch (ArithmeticException e) 
		{// error info  -  type  , message ,  line 
			System.out.println(e);
			e.printStackTrace();
			System.out.println("Divison by zero not possible ");
			//con.close()
		}	
		catch (Exception e) {
			System.out.println("Exception Occured ");
			//con.close()
		}
		// exception occured or not 
		finally {
			System.out.println("Main End");
			//con.close()
		}

	}

}
