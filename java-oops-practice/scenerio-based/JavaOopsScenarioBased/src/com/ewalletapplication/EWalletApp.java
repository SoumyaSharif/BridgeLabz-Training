package com.ewalletapplication;

public class EWalletApp {
    public static void main(String[] args) {

        User arsh = new User("soumya", new PersonalWallet(100)); // referral bonus
        User shop = new User("Shop", new BusinessWallet());

        arsh.getWallet().loadMoney(1000);
        arsh.getWallet().transferTo(shop, 500);

        System.out.println("soumya Balance: ₹" + arsh.getWallet().getBalance());
        System.out.println("Shop Balance: ₹" + shop.getWallet().getBalance());

        System.out.println("\nTransaction History:");
        arsh.getWallet().showTransactions();
    }
}

