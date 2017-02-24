package sb.studentbudget.logicTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.logic.Function;

public class CalcTest {

    private Budget budget;
    private Function function;
    private Calc calc;

    public CalcTest() {
    }

    @Before
    public void setUp() {
        budget = new Budget();
        function = new Function(budget);
        calc = new Calc(budget);
        
        function.addExpense("rent", 500);
        function.addExpense("phone", 40);
        function.addIncome("salary", 3000);
        function.addIncome("bonus", 200);
    }

    @Test
    public void testCountIncome() {
        double answer = calc.countIncome();
        assertEquals(3200, answer, 0.005);
    }

    @Test
    public void testCountExpenses() {
        double answer = calc.countExpenses();
        assertEquals(540, answer, 0.005);
    }

    @Test
    public void testCountBalance() {
        double answer = calc.countBalance();
        assertEquals(2660, answer, 0.005);
    }

    @Test
    public void testCountWeeklyBudget() {
        double answer = calc.countWeeklyBudget();
        assertEquals(665, answer, 0.005);
    }

    @Test
    public void testCountDailyBudget() {
        double answer = calc.countDailyBudget();
        assertEquals(88.67, answer, 0.005);
    }
}
