package com.budgetwise;
public class BudgetWiseDemo {

    public static void main(String[] args) {

        Budget b = new MonthlyBudget(50000);
        b.addExpense(new Transaction(12000, "Expense", "10-Jan", "Rent"));
        b.addExpense(new Transaction(8000, "Expense", "15-Jan", "Food"));

        b.generateReport();
    }
}
