package com.mybank;

class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.5;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}

