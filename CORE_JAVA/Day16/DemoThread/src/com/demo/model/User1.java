package com.demo.model;

public class User1 extends Thread {
	
	BankAccount ba;

	public User1(BankAccount ba) {
		// TODO Auto-generated constructor stub
		this.ba = ba;
	}
	
	@Override
	public void run() {
		
		ba.withdraw(150);
	}

}
