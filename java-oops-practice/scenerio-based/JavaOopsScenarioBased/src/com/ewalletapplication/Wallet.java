package com.ewalletapplication;

import java.util.ArrayList;

public abstract class Wallet implements Transferrable {
    private double balance; // encapsulated
    protected ArrayList<Transaction> transactions;

    // Constructor without referral
    public Wallet() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    // Constructor with referral bonus
    public Wallet(double referralBonus) {
        this();
        this.balance += referralBonus;
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    protected boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void loadMoney(double amount) {
        credit(amount);
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}

