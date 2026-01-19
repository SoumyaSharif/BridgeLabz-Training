package com.sortingalgorithms.fleetmanager;

public class Vehicle {
	
	private int mileage ;
	private String VehicleId ; 
	
	public Vehicle(String VehicleId, int mileage) {
		this.VehicleId = VehicleId ;
		this.mileage = mileage ;
	}
	
	public int getmileage() {
		return mileage ; 
	}
	
	public String GetVehicleId() {
		return VehicleId ;
	}
	
	@Override
	public String toString() {
		return VehicleId + "(" + mileage + "km)" ;
	}

}
 