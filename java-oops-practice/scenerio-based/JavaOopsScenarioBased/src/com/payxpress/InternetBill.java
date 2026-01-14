package com.payxpress;
public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Internet bill paid: ₹" + amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Alert: Internet service may stop after " + dueDate);
    }
}
