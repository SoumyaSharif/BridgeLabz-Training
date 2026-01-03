package com.ewalletapplication;

import java.util.Date;

public class Transaction {
    private String fromUser;
    private String toUser;
    private double amount;
    private Date date;

    public Transaction(String fromUser, String toUser, double amount) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return fromUser + " → " + toUser + " : ₹" + amount + " on " + date;
    }
}

