package com.demo.test;

import com.demo.model.Account;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account(1000);
		
		try {
			a.withdraw(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		////  try  catch finally 
		//try catch
		// try finally 
		// finally 
		
		// only try and only catch not valid 
		
		
		
		

	}

}
