package com.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(int termInMonths) {
        super("Auto Loan", termInMonths, 9.5);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        approved = applicant.getCreditScore() >= 650 &&
                   applicant.getIncome() >= 30000;
        return approved;
    }
}
