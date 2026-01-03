package com.HospitalPatientManagementSystem;

public class Bill implements Payable {
    private double baseAmount;
    private double taxRate = 0.18;      // 18% GST
    private double discount = 0.10;     // 10% discount

    public Bill(double baseAmount) { 
        this.baseAmount = baseAmount;
    }

    @Override
    public double calculatePayment() {
        double tax = baseAmount * taxRate;
        double discountAmount = baseAmount * discount;
        return baseAmount + tax - discountAmount;
    }
}

