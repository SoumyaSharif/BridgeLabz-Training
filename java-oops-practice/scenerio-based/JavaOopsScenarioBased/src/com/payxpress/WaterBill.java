package com.payxpress;
public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Water bill paid: ₹" + amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Please pay water bill before " + dueDate);
    }
}
