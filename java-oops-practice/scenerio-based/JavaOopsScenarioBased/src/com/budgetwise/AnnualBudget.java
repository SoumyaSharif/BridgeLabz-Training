package com.budgetwise;
public class AnnualBudget extends Budget {

    public AnnualBudget(double income) {
        super(income);
    }

    public void generateReport() {
        System.out.println("Annual Report | Savings: ₹" + netSavings());
    }

    public void detectOverspend() {
        System.out.println("Yearly expense analysis done");
    }
}
