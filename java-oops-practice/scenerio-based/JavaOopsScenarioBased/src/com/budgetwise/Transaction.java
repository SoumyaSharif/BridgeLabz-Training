package com.budgetwise;
public class Transaction {
    double amount;
    String type;
    String date;
    String category;

    public Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }
}
