package com.demo.model;

public class Account {
	// balance limit  1000
	int balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(int amt ) throws Exception
	{// 2000     3000
		
		if(balance - amt  > 1000) {
			this.balance = balance - amt ;
		}  else { 
			System.out.println("min ");
			throw new Exception();// terminate 
			// terminate   Exception 
		
		}
		
	}
	
	

}






