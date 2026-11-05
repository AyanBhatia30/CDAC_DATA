package com.demo.model;

public class User2 extends Thread {
	
	BankAccount ba;

	public User2(BankAccount ba) {
		// TODO Auto-generated constructor stub
		this.ba = ba;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ba.deposit(500);
	}

}
