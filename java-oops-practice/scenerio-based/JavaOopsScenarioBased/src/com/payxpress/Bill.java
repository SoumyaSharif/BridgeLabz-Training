package com.payxpress;
public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;   // encapsulated

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Operator usage: baseAmount + penalty
    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    protected void markPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
