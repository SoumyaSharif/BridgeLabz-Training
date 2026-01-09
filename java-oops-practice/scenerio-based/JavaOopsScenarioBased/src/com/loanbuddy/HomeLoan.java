package com.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(int termInMonths) {
        super("Home Loan", termInMonths, 8.5);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        approved = applicant.getCreditScore() >= 700 &&
                   applicant.getIncome() >= 50000;
        return approved;
    }
}
