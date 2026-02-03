package com.multithreading.banktransactionsystem;

public class Customer extends Thread{
	
	private BankAccount account;
	private String TransactionType ;
	private double amount;
	
	public Customer(String name ,BankAccount account , String TransactionType , double amount) {
		super(name); //thread name 
		this.account = account ;
		this.amount = amount ;
		this.TransactionType = TransactionType;
	}
	
	public void run() {
		if(TransactionType.equals("deposit")) {
			account.deposit(amount);
		}else if (TransactionType.equals("withdraw")) {
			account.withdraw(amount);
		}
	}
}
