package com.CabbyGo;

public class Ride implements IRideServices {
	private Driver driver ;
	private Vehicle vehicle;
	private double fare;      
	private boolean isActive;
	
	private static final double base_fare =50 ;
	
	public Ride(Driver driver , Vehicle vehicle , boolean isActive) {
		this.driver = driver ;
		this.vehicle = vehicle ;
	}
	
	@Override
	public void bookRide(double distance) {
		fare = base_fare + distance * vehicle.getRate();
		isActive = true ;
		
		System.out.println("Ride Book!");
		System.out.println("Driver : " + driver.getName());
		System.out.println("Vehicle Type :" + vehicle.gettype());
		System.out.println("Estimated Fare : " + fare);
	}
	
	@Override
	public void endRide() {
		if(isActive) {
			isActive = false ;
			System.out.println("Ride ended , fare : " + fare);
		}else {
			System.out.println("no active ride.");
		}
	}
	

}
