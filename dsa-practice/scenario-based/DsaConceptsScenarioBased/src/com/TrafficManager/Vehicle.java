package com.TrafficManager;

public class Vehicle {
	
	//vehicles keeps moving in circle , no fixed start or end
	/* each vehicle is a node, waiting line is a queue
	 * circular movement : circular linkedlist
	 * add/remove vehicles : linkedlist 
	 * waiting queue : queue
	 * overflow/underflow : queue 
	 * 
	 *
	 * 
	 * */
	
	String vehiclenumber ;
	Vehicle next ;
	
	//created a vehicle constructor
	Vehicle(String vehiclenumber){
		this.vehiclenumber = vehiclenumber ;
		this.next = null ;
	}

}
