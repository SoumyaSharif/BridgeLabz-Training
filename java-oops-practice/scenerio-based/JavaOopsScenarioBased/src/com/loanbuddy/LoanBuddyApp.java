package com.loanbuddy;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Soumya",
                720,
                60000,
                500000
        );

        LoanApplication loan = new HomeLoan(240);

        if (loan.approveLoan(applicant)) {
            double emi = loan.calculateEMI(
                    applicant.getLoanAmount(),
                    loan.interestRate,
                    loan.termInMonths
            );

            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI: ₹" + Math.round(emi));
        } else {
            System.out.println("Loan Rejected!");
        }
    }
}
