package com.ewalletapplication;

public class BusinessWallet extends Wallet {

    public BusinessWallet() {
        super();
    }

    public BusinessWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > 50000) {
            System.out.println("Transfer limit exceeded (Business Wallet)");
            return;
        }

        double tax = amount * 0.05; // 5% business tax
        double total = amount + tax;

        if (debit(total)) {
            receiver.getWallet().credit(amount);
            transactions.add(new Transaction("Business", receiver.getName(), amount));
        } else {
            System.out.println("Insufficient balance (Business Wallet)");
        }
    }
}

