package sb.studentbudget.logic;

import sb.studentbudget.budget.Budget;

public class BudgetPrinter {

    private Budget budget;
    private Calc calc;

    public BudgetPrinter(Budget budget) {
        this.budget = budget;
        this.calc = new Calc(budget);
    }

    public String printDetailedMonthlyBudget() {
        
        String review = "";

        review +="Income:\n";
        for (int i = 0; i < this.budget.getIncome().size(); i++) {
            review += this.budget.getIncome().get(i).getName() + "\t";
            review += this.budget.getIncome().get(i).getAmount() + " €\n";
        }

        review += "\nExpenses:\n";
        for (int i = 0; i < this.budget.getExpense().size(); i++) {
            review += this.budget.getExpense().get(i).getName() + "\t";
            review += this.budget.getExpense().get(i).getAmount() + " €\n";
        }

        review += "\n";
        review += "Budget review:\n";
        review += "Total monthly income: " + this.calc.countIncome() + " €\n";
        review += "Total monthly expenses: " + this.calc.countExpenses() + " €\n";

        if (this.calc.countBalance() > 0) {
            review += "Excess cash: " + String.format("%.2f", this.calc.countBalance()) + " €\n";
            review += "Weekly budget: " + String.format("%.2f", this.calc.countWeeklyBudget()) + " €\n";
            review += "Daily budget: " + String.format("%.2f", this.calc.countDailyBudget()) + " €\n";
        } else {
            review += "Budget deficit: " + this.calc.countBalance() + " €";
        }
        
        return review;
    }

}
