package com.budgetwise;
import java.util.ArrayList;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected ArrayList<Transaction> expenses;

    public Budget(double income) {
        this.income = income;
        expenses = new ArrayList<>();
    }

    protected void addExpense(Transaction t) {
        expenses.add(t);
    }

    protected double totalExpenses() {
        double sum = 0;
        for (Transaction t : expenses)
            sum += t.amount;
        return sum;
    }

    protected double netSavings() {
        return income - totalExpenses(); // operator usage
    }
}
