package com.VehicleRentalApplication;

public class Truck extends Vehicle implements Rentable {

    public Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double loadCharge = 1000;
        return (baseRate * days) + loadCharge;
    }
}

