package Com.encapsulation.bankingsystem;

class savingsaccount extends bankaccount implements loanable {
    public savingsaccount(String acc, String name, double balance) {
        super(acc, name, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan applied");
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}