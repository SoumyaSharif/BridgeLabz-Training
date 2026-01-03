package com.mybank;

class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}

