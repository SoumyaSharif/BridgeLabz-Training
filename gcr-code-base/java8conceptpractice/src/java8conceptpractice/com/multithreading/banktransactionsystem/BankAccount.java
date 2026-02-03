package com.multithreading.banktransactionsystem;

public class BankAccount extends Thread{
	
	private String customerID;
	private double balance;
	
	public BankAccount(String customerID, int balance) {
		super(customerID);
	}
	
	public synchronized double withdraw(double amount) {
		System.out.println(Thread.currentThread().getName() + " is withdrawing amount of:" + amount);
		if(balance >= amount) {
			balance = balance-amount;
			System.out.println(Thread.currentThread().getName() + " withdrawing amount of:" + amount);
		}else {
			System.out.println(Thread.currentThread().getName() + " has insufficient amount:" + balance);
		}
		return balance ;
		
	}
	
	public synchronized double deposit(double amount) {
		System.out.println(Thread.currentThread().getName() + " is depositing amount:" + amount);
		balance = balance + amount ;
		return balance ;
	}
	
	public synchronized double getbalance() {
		return balance ;
	}
	
	public String getcustomerID() {
		return customerID;
	}
	
}
