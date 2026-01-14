package com.payxpress;
public class PayXpressDemo {

    public static void main(String[] args) {

        Bill b1 = new ElectricityBill(1200, "10-Feb");
        Bill b2 = new WaterBill(400, "12-Feb");
        Bill b3 = new InternetBill(999, "15-Feb");

        b1.sendReminder();
        b2.sendReminder();
        b3.sendReminder();

        b1.pay();
        b3.pay();
    }
}
