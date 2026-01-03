package com.ewalletapplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02; // 2% tax
        double totalDeduction = amount + tax;

        if (debit(totalDeduction)) {
            receiver.getWallet().credit(amount);
            transactions.add(new Transaction("Personal", receiver.getName(), amount));
        } else {
            System.out.println("Insufficient balance (Personal Wallet)");
        }
    }
}
