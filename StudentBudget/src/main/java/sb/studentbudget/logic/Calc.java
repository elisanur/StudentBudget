package sb.studentbudget.logic;

import sb.studentbudget.budget.Budget;

/**
 * This class holds all the calculative methods.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class Calc {

    private final Budget budget;

    /**
     * Constructor initialises budget that's being used for all calculations.
     * 
     * @param budget Budget object that specifies which budget is being handled.
     */
    public Calc(Budget budget) {
        this.budget = budget;
    }

    /**
     * Counts total amount of income.
     *
     * @return total income as double
     */
    public double countIncome() {

        double income = 0;
        for (int i = 0; i < budget.getIncome().size(); i++) {
            income += budget.getIncome().get(i).getAmount();
        }

        return income;
    }

    /**
     * Counts total amount of expenses.
     *
     * @return total expenses as double
     */
    public double countExpenses() {

        double expenses = 0;

        for (int i = 0; i < budget.getExpense().size(); i++) {
            expenses += budget.getExpense().get(i).getAmount();
        }

        return expenses;
    }

    /**
     * Counts the balance from total income and total expenses.
     *
     * @return balance as double
     */
    public double countBalance() {
        return countIncome() - countExpenses();
    }

    /**
     * Counts the weekly budget from the excess cash.
     *
     * Divides the monthly excess cash with 4.
     *
     * @return amount of weekly budget as double
     */
    public double countWeeklyBudget() {
        return (countBalance() / 4);
    }

    /**
     * Counts the daily budget from the excess cash.
     *
     * Divides the monthly excess cash with 30.
     *
     * @return amount of daily budget as double.
     */
    public double countDailyBudget() {
        return countBalance() / 30;
    }

}
