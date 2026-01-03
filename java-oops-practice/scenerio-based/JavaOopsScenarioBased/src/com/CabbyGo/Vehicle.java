package com.CabbyGo;

public class Vehicle {
	/* vehicle number 
	 * capacity
	 * type 
	 * 
	 *
	 *
	 */
	String vehicleNumber ;
	int capacity ;
	String type ;
	double Rate ;
	
	public Vehicle(String vehicleNumber , int capacity , String type, double Rate) {
		this.vehicleNumber = vehicleNumber ;
		this.capacity = capacity ;
		this.type = type ;
		this.Rate = Rate ;
	}
	
	public double getRate() {
		return Rate ;
	}
	
	public String gettype() {
		return type;
	}
}
