package sb.studentbudget.logic;

import sb.studentbudget.budget.Money;
import sb.studentbudget.budget.Budget;

/**
 * This class holds all methods used for modifying the income and expense
 * ArrayLists.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class Function {

    private Budget budget;

    /**
     * Constructor that creates a new Function object.
     *
     * @param budget Budget object specifies which budget is being handled
     */
    public Function(Budget budget) {
        this.budget = budget;
    }

    /**
     * Adds new Money-type income to ArrayList of income.
     *
     * @param name name string given by user, used as title
     * @param amount amount double given by user
     *
     * @see sb.studentbudget.budget.Budget#getIncome()
     */
    public void addIncome(String name, double amount) {
        this.budget.getIncome().add(new Money(name, amount));
    }

    /**
     * Adds new Money-type expense to ArrayList of expenses.
     *
     * @param name name string given by user, used as title
     * @param amount amount double given by user
     *
     * @see sb.studentbudget.budget.Budget#getExpense()
     */
    public void addExpense(String name, double amount) {
        this.budget.getExpense().add(new Money(name, amount));
    }

    /**
     * Removes Money-type income from ArrayList of incomes using the income name
     * (String).
     *
     * @param name name string given by user, used to find the Money-type
     * income.
     *
     * @see sb.studentbudget.budget.Budget#getIncome()
     * @see sb.studentbudget.budget.Money#getName()
     */
    public void removeIncomeByName(String name) {
        for (int i = 0; i < this.budget.getIncome().size(); i++) {
            if (this.budget.getIncome().get(i).compareTo(name) == 0) {
                this.budget.getIncome().remove(i);
            }
        }
    }

    /**
     * Removes Money-type expense from ArrayList of expenses using the expense
     * name (String).
     *
     * @param name name string given by user, used to find the Money-type
     * expense.
     *
     * @see sb.studentbudget.budget.Budget#getExpense()
     * @see sb.studentbudget.budget.Money#getName()
     */
    public void removeExpenseByName(String name) {
        for (int i = 0; i < this.budget.getExpense().size(); i++) {
            if (this.budget.getExpense().get(i).compareTo(name) == 0) {
                this.budget.getExpense().remove(i);
            }
        }
    }
}
