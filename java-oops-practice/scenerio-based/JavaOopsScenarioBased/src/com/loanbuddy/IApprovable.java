package com.loanbuddy;

public interface IApprovable {
    boolean approveLoan(Applicant applicant);
    double calculateEMI(double principal, double annualRate, int months);
}
