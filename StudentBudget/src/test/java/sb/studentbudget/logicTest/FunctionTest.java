package sb.studentbudget.logicTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.Function;

public class FunctionTest {

    private Budget budget;
    private Function function;

    @Before
    public void setUp() {
        budget = new Budget();
        function = new Function(budget);

        function.addIncome("student support", 400);
        function.addExpense("rent", 300);
    }

    @Test
    public void expenseNameSetCorrectly() {
        String answer = budget.getExpense().get(0).getTitle();
        assertEquals("rent", answer);
    }

    @Test
    public void expenseAmountSetCorrectly() {
        double answer = budget.getExpense().get(0).getAmount();
        assertEquals(300, answer, 0.0005);
    }

    @Test
    public void incomeNameSetCorrectly() {
        String answer = budget.getIncome().get(0).getTitle();
        assertEquals("student support", answer);
    }

    @Test
    public void incomeAmountSetCorrectly() {
        double answer = budget.getIncome().get(0).getAmount();
        assertEquals(400, answer, 0.0005);
    }

    @Test
    public void removeIncomeByTitleTest() {
        function.removeIncomeByName("student support");
        String answer = "";

        if (budget.getIncome().isEmpty()) {
            answer = "empty";
        }

        assertEquals("empty", answer);
    }

    @Test
    public void removeExpenseByTitleTest() {
        function.removeExpenseByName("rent");
        String answer = "";

        if (budget.getExpense().isEmpty()) {
            answer = "empty";
        }

        assertEquals("empty", answer);
    }
}
