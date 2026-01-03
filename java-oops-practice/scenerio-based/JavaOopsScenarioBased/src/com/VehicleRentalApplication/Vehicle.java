package com.VehicleRentalApplication;

public class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double baseRate;

    public Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Encapsulation using getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void displayInfo() {
        System.out.println("Vehicle No: " + vehicleNumber +
                ", Brand: " + brand +
                ", Base Rate: ₹" + baseRate);
    }
}
