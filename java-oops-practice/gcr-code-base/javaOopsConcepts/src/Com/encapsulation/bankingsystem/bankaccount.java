package Com.encapsulation.bankingsystem;

abstract class bankaccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public bankaccount(String acc, String name, double balance) {
        this.accountNumber = acc;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public abstract double calculateInterest();
}
