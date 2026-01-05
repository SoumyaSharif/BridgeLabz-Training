package Com.encapsulation.bankingsystem;

class currentaccount extends bankaccount {
    public currentaccount(String acc, String name, double balance) {
        super(acc, name, balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}
