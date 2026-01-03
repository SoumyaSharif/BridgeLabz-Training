package com.VehicleRentalApplication;

public class Car extends Vehicle implements Rentable {

    public Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double insurance = 500;
        return (baseRate * days) + insurance;
    }
}

