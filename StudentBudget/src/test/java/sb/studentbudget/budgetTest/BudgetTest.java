package sb.studentbudget.budgetTest;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sb.studentbudget.budget.Budget;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Money;
import sb.studentbudget.logic.Function;

public class BudgetTest {

    Budget budget;
    ArrayList<Money> income;
    ArrayList<Money> expense;

    public BudgetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        budget = new Budget();
        this.income = new ArrayList<>();
        this.expense = new ArrayList<>();
    }

    @After
    public void tearDown() {
    }

//    @Test
//    public void constructorSetsNameTest() {
//        String answer = budget.getName();
//        assertEquals("Budget", answer);
//
//    }

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

//    @Test
//    public void getNameTest() {
//        String answer = budget.getName();
//        assertEquals("Budget", answer);
//
//    }

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
//
//    @Test
//    public void toStringTest() {
//        String answer = this.budget.getName();
//        assertEquals("Budget", answer);
//    }

//    @Test
//    public void setNameTest() {
//        budget.setName("Christmas budget");
//        String answer = budget.getName();
//
//        assertEquals("Christmas budget", answer);
//
//    }
}
