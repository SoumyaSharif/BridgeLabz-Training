package com.VehicleRentalApplication;

public class Bike extends Vehicle implements Rentable {

    public Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; // simple rent
    }
}

