package sb.studentbudget.logic;

import sb.studentbudget.budget.Budget;

/**
 * This class creates a budget review string.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class BudgetPrinter {

    private Budget budget;
    private Calc calc;

    /**
     *
     * @param budget
     */
    public BudgetPrinter(Budget budget) {
        this.budget = budget;
        this.calc = new Calc(budget);
    }

    /**
     * Creates a string of the whole budget review. Review includes income
     * items, expense items and monthly balance. If the balance amount exceeds
     * budget, review tells the total amount of monthly excess cash and weekly
     * and daily budget calculated from that. If the total amount falls short of
     * budget, review states the amount of budget deficit.
     *
     * @return review string of calculated monthly, weekly and daily budget.
     */
    public String printDetailedMonthlyBudget() {

        String review = "";
        
        review += "Budget review:\n\n";
        review += "Income:\n";
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
