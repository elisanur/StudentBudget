package sb.studentbudget.budget;

import java.util.ArrayList;

public class Budget {

    private String name;
    private ArrayList<Money> income;
    private ArrayList<Money> expense;

    public Budget() {
        this.income = new ArrayList<Money>();
        this.expense = new ArrayList<Money>();
        this.name = "Budget";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Money> getIncome() {
        return this.income;
    }

    public ArrayList<Money> getExpense() {
        return this.expense;
    }

    public String toString() {
        return this.name;
    }

}
