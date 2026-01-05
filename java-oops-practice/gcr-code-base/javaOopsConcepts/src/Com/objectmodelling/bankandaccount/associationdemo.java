package Com.objectmodelling.bankandaccount;

class associationdemo {
    public static void main(String[] args) {

        bank b1 = new bank("State Bank of India");

        customer c1 = new customer("Soumya");
        customer c2 = new customer("Rahul");

        account a1 = new account(101, 5000.0, b1);
        account a2 = new account(102, 12000.0, b1);

        b1.openAccount(c1, a1);
        b1.openAccount(c2, a2);

        c1.viewBalance();
        c2.viewBalance();
    }
}

