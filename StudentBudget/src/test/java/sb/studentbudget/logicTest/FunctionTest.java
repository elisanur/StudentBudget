package sb.studentbudget.logicTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.Function;

public class FunctionTest {

    public FunctionTest() {
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
        Function function = new Function(budget);

        function.addExpense("rent", 300);

        String answer = budget.getExpense().get(0).getName();

        assertEquals("rent", answer);
    }

    @Test
    public void expenseAmountSetCorrectly() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addExpense("rent", 300);

        double answer = budget.getExpense().get(0).getAmount();

        assertEquals(300, answer, 0.0005);
    }

    @Test
    public void incomeNameSetCorrectly() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addIncome("student support", 400);

        String answer = budget.getIncome().get(0).getName();

        assertEquals("student support", answer);
    }

    @Test
    public void incomeAmountSetCorrectly() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addIncome("student loan", 300);

        double answer = budget.getIncome().get(0).getAmount();

        assertEquals(300, answer, 0.0005);
    }

    @Test
    public void removeIncomeByNameTest() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addIncome("student loan", 300);

        function.removeIncomeByName("student loan");

        String answer = "";

        if (budget.getIncome().isEmpty()) {
            answer = "empty";
        }

        assertEquals("empty", answer);
    }

    @Test
    public void removeExpenseByNameTest() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addExpense("rent", 300);

        function.removeExpenseByName("rent");

        String answer = "";

        if (budget.getExpense().isEmpty()) {
            answer = "empty";
        }

        assertEquals("empty", answer);
    }

    @Test
    public void removeExpenseByIdTest() {

        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addExpense("rent", 300);

        function.removeExpenseById(0);

        String answer = "";

        if (budget.getExpense().isEmpty()) {
            answer = "empty";
        }

        assertEquals("empty", answer);

    }

    @Test
    public void removeIncomeByIdTest() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addIncome("student loan", 300);
        function.removeIncomeById(0);

        String answer = "";

        if (budget.getIncome().isEmpty()) {
            answer = "empty";
        }

        assertEquals("empty", answer);

    }

}
