package Com.objectmodelling.bankandaccount;

class account {
    int accountNumber;
    double balance;
    bank bank;   // associated bank

    account(int accountNumber, double balance, bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }
}

