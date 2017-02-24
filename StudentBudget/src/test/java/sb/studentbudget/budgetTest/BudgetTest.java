package sb.studentbudget.budgetTest;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import sb.studentbudget.budget.Budget;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Money;

public class BudgetTest {

    private final Budget budget;
    private final ArrayList<Money> income;
    private final ArrayList<Money> expense;

    public BudgetTest() {
        this.budget = new Budget();
        this.income = new ArrayList<>();
        this.expense = new ArrayList<>();
    }

    @Before
    public void setUp() {
    }

    @Test
    public void constructorCreatesIncomeArrayListTest() {
        ArrayList<Money> answer = this.budget.getIncome();
        assertEquals(this.income, answer);
    }

    @Test
    public void constructorCreatesExpenseArrayListTest() {
        ArrayList<Money> answer = this.budget.getExpense();
        assertEquals(this.income, answer);

    }

    @Test
    public void getIncomeTest() {
        ArrayList<Money> answer = this.budget.getIncome();
        assertEquals(this.income, answer);
    }

    @Test
    public void getExpenseTest() {
        ArrayList<Money> answer = this.budget.getExpense();
        assertEquals(this.expense, answer);
    }

    @Test
    public void getPrinterTest() {
        String answer = "";
        if (this.budget.getPrinter() != null) {
            answer = "notNull";
        }
        assertEquals("notNull", answer);
    }

    @Test
    public void getFunctionTest() {
        String answer = "";
        if (this.budget.getFunction() != null) {
            answer = "notNull";
        }
        assertEquals("notNull", answer);
    }
}
