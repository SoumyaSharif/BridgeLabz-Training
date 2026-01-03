package com.CabbyGo;

public class customer {
	
	String name ;
	int numberOfPeople ; 
	
	public customer(String name , int numberOfPeople) {
		this.name = name ;
		this.numberOfPeople = numberOfPeople ;
		
	}
	
	public void displaycustomer() {
		System.out.println("Customer name : " + name + "\nnumber of people : " + numberOfPeople);
	}

}
