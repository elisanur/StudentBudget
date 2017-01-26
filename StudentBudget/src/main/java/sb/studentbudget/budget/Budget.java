
package sb.studentbudget.budget;

import java.util.ArrayList;


public class Budget {
    
    private ArrayList<Money> income;
    private ArrayList<Money> expense;

    public Budget() {
        this.income = new ArrayList<Money>();
        this.expense = new ArrayList<Money>();
    }

    public ArrayList<Money> getIncome() {
        return this.income;
    }

    public void addIncome(String name, double amount) {
        this.income.add(new Money(name, amount));
    }

    public ArrayList<Money> getExpense() {
        return this.expense;
    }

    public void addExpense(String name, double amount) {
        this.expense.add(new Money(name, amount));
    }
    
    public String toString(){
        return "";
    }
    
}
