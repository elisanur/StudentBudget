package sb.studentbudget.logic;

import java.util.ArrayList;
import sb.studentbudget.budget.Money;
import sb.studentbudget.budget.Budget;

public class Function {

    private Budget budget;

    public Function(Budget budget) {
        this.budget = budget;
    }

    public void addIncome(String name, double amount) {
        this.budget.getIncome().add(new Money(name, amount));
    }

    public void addExpense(String name, double amount) {
        this.budget.getExpense().add(new Money(name, amount));
    }

    public void removeIncomeByName(String name) {
        for (int i = 0; i < this.budget.getIncome().size(); i++) {
            if (this.budget.getIncome().get(i).getName().equals(name)) {
                this.budget.getIncome().remove(i);
            }
        }
    }

    public void removeExpenseByName(String name) {
        for (int i = 0; i < this.budget.getExpense().size(); i++) {
            if (this.budget.getExpense().get(i).getName().equals(name)) {
                this.budget.getExpense().remove(i);
            }
        }
    }

    public void removeIncomeById(int id) {
        if (!this.budget.getIncome().get(id).getName().isEmpty()) {
            this.budget.getIncome().remove(id);
        }
    }

    public void removeExpenseById(int id) {
        if (!this.budget.getExpense().get(id).getName().isEmpty()) {
            this.budget.getExpense().remove(id);
        }
    }

    public void renameTitle(String listName, int id, String newName) {
        if (listName.equals("income")) {
            this.budget.getIncome().get(id).setName(newName);

        }
        if (listName.equals("expense")) {
            this.budget.getExpense().get(id).setName(newName);

        }
    }
}
