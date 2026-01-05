package Com.objectmodelling.bankandaccount;

import java.util.ArrayList;

class bank {
    String bankName;
    ArrayList<account> accounts;

    bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    // Association method
    void openAccount(customer c, account a) {
        accounts.add(a);
        c.addAccount(a);
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
}

