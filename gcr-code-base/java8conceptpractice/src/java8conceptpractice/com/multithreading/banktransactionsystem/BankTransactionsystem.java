package com.multithreading.banktransactionsystem;

public class BankTransactionsystem {
	
	public static void main(String[] args) {
	
	BankAccount b1 = new BankAccount("AL123423",50000);
	BankAccount b2 = new BankAccount("AO34762",231000);

	Customer c1 = new Customer("rudra" , b1, "withdraw", 5000);
	Customer c2 = new Customer("rudresh" , b1, "withdraw",4000);
	Customer c3 = new Customer("muskan" , b1,"deposit",76000);
	Customer c4 = new Customer("vivek" , b2,"withdraw",2390);
	Customer c5 = new Customer("rifa" , b2,"deposit",4500);
	
	c1.start();
	c2.start();
	c3.start();
	c4.start();
	c5.start();
	
	System.out.println("Funds left in " + b1.getName() + "is:" + b1.getbalance());
	System.out.println("Funds left in " + b2.getName() + "is:" + b2.getbalance());
	
	}
	
}
