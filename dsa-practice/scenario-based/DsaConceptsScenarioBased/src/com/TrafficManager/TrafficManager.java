package com.TrafficManager;
import java.util.* ;

public class TrafficManager {
	
	private Vehicle head = null ;
	private Vehicle tail = null ;
	private Queue<String> waitingqueue ;
	private int queuecapacity ;
	
	//creating a constructor to initialize queue named waiting queue
	TrafficManager(int capacity){
		queuecapacity = capacity ;
		waitingqueue = new LinkedList<>();
	}
	
	//creating method to add vehicle 
	public void enqueueVehicle(String vehiclenumber) {
		//if the capacity of queue is full , give overflow!
		if(waitingqueue.size() == queuecapacity) {
			System.out.println("Queue Overflow!" + vehiclenumber + "cannot enter");
			return ;
		}
		// add the value to the queue
		waitingqueue.offer(vehiclenumber);
		System.out.println("Vehicle" + vehiclenumber + "added to waiting queue. ");
	}
	
	//Method to move queue from roundabout
	public void enterroundabout() {
		
		//check if queue is empty and returns true 
		if (waitingqueue.isEmpty()) {
			System.out.println("Queue underflow! no vehicle waiting.");
			return ;
		}
		
		//queue has cars which needs to enter the roundabout
		String vehiclenumber = waitingqueue.poll();
		Vehicle newvehicle = new Vehicle(vehiclenumber);
		
		
		if(head == null ) {
			head = tail = newvehicle ;
			tail.next = head ;
		}else {
			tail.next = newvehicle ;
			tail = newvehicle ;
			tail.next = head ;
		}
		
		System.out.println("Vehicle" + vehiclenumber + "entered roundabout.");
	}
	
	//Method to exit roundabout
	public void exitroundabout() {
		if(head == null) {
			System.out.println("Roundabout empty! No vehicle to exit. ");
			return ;
		}
		
		System.out.println("Vehicle" + head.vehiclenumber + "exited roundabout");
		
		if(head == tail) {
			head = tail = null ;
		}else {
			head = head.next ;
			tail.next = head ;
		}
	}
	
	public void displayroundabout() {
		
		if(head == null ) {
			System.out.println("Roundabout is empty.");
			return ;
		}
		
		System.out.println("Roundabout vehicles :");
		Vehicle temp = head ;
		do {
			System.out.print(temp.vehiclenumber + "->");
			temp = temp.next ;
			
		}while(temp != head) ;
		System.out.println("back to start");
		
	}

}
