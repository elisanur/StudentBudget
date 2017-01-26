package sb.studentbudget.budget;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BudgetTest {

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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void expenseNameSetCorrectly() {
        Budget budget = new Budget();

        budget.addExpense("rent", 300);

        String answer = budget.getExpense().get(0).getName();

        assertEquals("rent", answer);
    }

    @Test
    public void expenseAmountSetCorrectly() {
        Budget budget = new Budget();

        budget.addExpense("rent", 300);

        double answer = budget.getExpense().get(0).getAmount();

        assertEquals(300, answer, 0.0005);
    }

    @Test
    public void incomeNameSetCorrectly() {
        Budget budget = new Budget();

        budget.addIncome("student support", 400);

        String answer = budget.getIncome().get(0).getName();

        assertEquals("student support", answer);
    }

    @Test
    public void incomeAmountSetCorrectly() {
        Budget budget = new Budget();

        budget.addIncome("student loan", 300);

        double answer = budget.getIncome().get(0).getAmount();

        assertEquals(300, answer, 0.0005);
    }
}
