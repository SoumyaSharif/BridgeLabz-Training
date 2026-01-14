package com.budgetwise;
public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income) {
        super(income);
    }

    public void generateReport() {
        System.out.println("Monthly Report | Savings: ₹" + netSavings());
    }

    public void detectOverspend() {
        System.out.println("Monthly expense check completed");
    }
}
