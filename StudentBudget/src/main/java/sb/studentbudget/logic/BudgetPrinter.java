package sb.studentbudget.logic;

import sb.studentbudget.budget.Budget;

/**
 * This class creates a budget review string.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class BudgetPrinter {

    private final Budget budget;
    private final Calc calc;
    private final TextWriter writer;

    /**
     * Constructor that creates new BudgetPrinter object. Initialises budget
     * attribute to specify which budget is used for printing. Creates a new
     * Calc object for calculating relevant calculations.
     *
     * @param budget Budget object used for calculating the budget review
     */
    public BudgetPrinter(Budget budget) {
        this.budget = budget;
        this.calc = new Calc(budget);
        this.writer = new TextWriter();

    }

    public TextWriter getWriter() {
        return this.writer;
    }

    public Calc getCalc() {
        return this.calc;
    }

    /**
     * Creates a string of the whole budget review. Review includes income
     * items, expense items and monthly balance. If the balance amount exceeds
     * budget, review tells the total amount of monthly excess cash and weekly
     * and daily budget calculated from that. If the total amount falls short of
     * budget, review states the amount of budget deficit.
     *
     * @return review string of calculated monthly, weekly and daily budget.
     *
     * @see sb.studentbudget.logic.Calc#countIncome()
     * @see sb.studentbudget.logic.Calc#countExpenses()
     * @see sb.studentbudget.logic.Calc#countBalance()
     * @see sb.studentbudget.logic.Calc#countWeeklyBudget()
     * @see sb.studentbudget.logic.Calc#countDailyBudget()
     * @see sb.studentbudget.budget.Budget#getIncome()
     * @see sb.studentbudget.budget.Budget#getExpense()
     */
    public String budgetReview() {

        String review = "";

        review += "Budget review:\n\n";
        review += "Income:\n";
        for (int i = 0; i < this.budget.getIncome().size(); i++) {
            review += this.budget.getIncome().get(i).getTitle() + "\t";
            review += this.budget.getIncome().get(i).getAmount() + " €\n";
        }

        review += "\nExpenses:\n";
        for (int i = 0; i < this.budget.getExpense().size(); i++) {
            review += this.budget.getExpense().get(i).getTitle() + "\t";
            review += this.budget.getExpense().get(i).getAmount() + " €\n";
        }

        review += "\n";
        review += "Total monthly income: " + this.calc.countIncome() + " €\n";
        review += "Total monthly expenses: " + this.calc.countExpenses() + " €\n";

        if (this.calc.countBalance() > 0) {
            review += "Balance: " + String.format("%.2f", this.calc.countBalance()) + " €\n";
            review += "Weekly budget: " + String.format("%.2f", this.calc.countWeeklyBudget()) + " €\n";
            review += "Daily budget: " + String.format("%.2f", this.calc.countDailyBudget()) + " €\n";
        } else {
            review += "Balance: " + String.format("%.2f", this.calc.countBalance()) + " €";
        }

        return review;
    }

}
