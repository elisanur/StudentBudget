package sb.studentbudget.logic;

import java.util.ArrayList;
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
     *
     * @param budget
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
            if (this.budget.getIncome().get(i).getName().equals(name)) {
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
            if (this.budget.getExpense().get(i).getName().equals(name)) {
                this.budget.getExpense().remove(i);
            }
        }
    }

    /**
     * Removes Money-type income from ArrayList of incomes using the income
     * index (int).
     *
     * @param id id int of index used for removing
     *
     * @see sb.studentbudget.budget.Budget#getIncome()
     * @see sb.studentbudget.budget.Money#getName()
     */
    public void removeIncomeById(int id) {
        if (!this.budget.getIncome().get(id).getName().isEmpty()) {
            this.budget.getIncome().remove(id);
        }
    }

    /**
     * Removes Money-type expense from ArrayList of expenses using the expense
     * index (int).
     *
     * @param id id int of index used for removing
     *
     * @see sb.studentbudget.budget.Budget#getExpense()
     * @see sb.studentbudget.budget.Money#getName()
     */
    public void removeExpenseById(int id) {
        if (!this.budget.getExpense().get(id).getName().isEmpty()) {
            this.budget.getExpense().remove(id);
        }
    }

    /**
     * Renames the name of Money-type income or expense.
     *
     * @param listName name string that refers to either income or expense
     * @param id id int for finding the right Money object from the referred
     * ArrayList
     * @param newName new name string for renaming
     *
     * @see sb.studentbudget.budget.Budget#getIncome()
     * @see sb.studentbudget.budget.Money#setName(java.lang.String)
     */
    public void renameTitle(String listName, int id, String newName) {
        if (listName.equals("income")) {
            this.budget.getIncome().get(id).setName(newName);

        }
        if (listName.equals("expense")) {
            this.budget.getExpense().get(id).setName(newName);

        }
    }

    /**
     * Updates the amount of Money-type income or expense.
     *
     * @param listName name string that refers to either income or expense
     * @param id id int for finding the right Money object from the referred
     * ArrayList
     * @param newAmount new amount double for updating
     */
    public void updateAmount(String listName, int id, double newAmount) {
        if (listName.equals("income")) {
            this.budget.getIncome().get(id).setAmount(newAmount);

        }
        if (listName.equals("expense")) {
            this.budget.getExpense().get(id).setAmount(newAmount);

        }
    }
}
