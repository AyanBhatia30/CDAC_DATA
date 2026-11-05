package com.demo.model;

public class BankAccount{

    // Shared resource (bank balance)
    private int balance = 1000;

    // method for deposit operation
    
    //lock    wait method  /// 100 
    // block --- Banking  
    public synchronized void deposit(int amount){
        System.out.println("Deposit : " + Thread.currentThread().getName());
        balance += amount;
        System.out.println("Deposited: " + amount
                           + ", Balance: " + balance);
    }

    //  method for withdrawal operation
    public synchronized void withdraw(int amount){
        
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount
                               + ", Balance: " + balance);
        }
        else {
            System.out.println(
                "Insufficient balance to withdraw: "
                + amount);
        }
    }

    public int getBalance() { return balance; }
}
