package sb.studentbudget.budget;

import java.util.ArrayList;
import sb.studentbudget.logic.BudgetPrinter;
import sb.studentbudget.logic.Function;

/**
 * This class holds ArrayLists of income and expenses.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class Budget {

    private ArrayList<Money> income;
    private ArrayList<Money> expense;
    private Function function;
    private BudgetPrinter printer;

    /**
     * Constructor that initialises attributes for Budget object.
     * Creates ArrayList "income", ArrayList "expense", new Function and new BudgetPrinter.
     */
    public Budget() {
        this.income = new ArrayList<Money>();
        this.expense = new ArrayList<Money>();
        this.function = new Function(this);
        this.printer = new BudgetPrinter(this);

    }

    public ArrayList<Money> getIncome() {
        return this.income;
    }

    public ArrayList<Money> getExpense() {
        return this.expense;
    }
    
    public Function getFunction(){
        return this.function;
    }
    
    public BudgetPrinter getPrinter(){
        return this.printer;
    }

}
