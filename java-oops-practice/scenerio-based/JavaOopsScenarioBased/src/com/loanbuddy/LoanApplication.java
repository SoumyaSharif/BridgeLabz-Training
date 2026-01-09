package com.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int termInMonths;
    protected double interestRate;
    protected boolean approved; // internal access only

    public LoanApplication(String loanType, int termInMonths, double interestRate) {
        this.loanType = loanType;
        this.termInMonths = termInMonths;
        this.interestRate = interestRate;
    }

    // EMI formula
    @Override
    public double calculateEMI(double principal, double annualRate, int months) {
        double r = annualRate / (12 * 100);
        return (principal * r * Math.pow(1 + r, months)) /
               (Math.pow(1 + r, months) - 1);
    }

    public boolean isApproved() {
        return approved;
    }
}
