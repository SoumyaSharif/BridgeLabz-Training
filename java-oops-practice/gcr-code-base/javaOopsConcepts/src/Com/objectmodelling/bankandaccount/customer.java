package Com.objectmodelling.bankandaccount;

import java.util.ArrayList;

class customer {
    String name;
    ArrayList<account> accounts;

    customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    void addAccount(account a) {
        accounts.add(a);
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (account a : accounts) {
            System.out.println("Account No: " + a.accountNumber +
                               ", Balance: " + a.balance +
                               ", Bank: " + a.bank.bankName);
        }
        System.out.println();
    }
}

