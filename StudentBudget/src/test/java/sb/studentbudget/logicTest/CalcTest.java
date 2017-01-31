package sb.studentbudget.logicTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.logic.Function;

public class CalcTest {

    public CalcTest() {
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
    public void testCountIncome() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addIncome("salary", 3000);
        function.addIncome("bonus", 200);

        Calc calc = new Calc(budget);

        double answer = calc.countIncome();

        assertEquals(3200, answer, 0.005);
    }

    @Test
    public void testCountExpenses() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addExpense("rent", 500);
        function.addExpense("phone", 40);

        Calc calc = new Calc(budget);

        double answer = calc.countExpenses();

        assertEquals(540, answer, 0.005);
    }

    @Test
    public void testCountBalance() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addExpense("rent", 500);
        function.addExpense("phone", 40);
        function.addIncome("salary", 3000);
        function.addIncome("bonus", 200);

        Calc calc = new Calc(budget);

        double answer = calc.countBalance();

        assertEquals(2660, answer, 0.005);
    }

    @Test
    public void testCountWeeklyBudget() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addExpense("rent", 500);
        function.addExpense("phone", 40);
        function.addIncome("salary", 3000);
        function.addIncome("bonus", 200);

        Calc calc = new Calc(budget);

        double answer = calc.countWeeklyBudget();

        assertEquals(665, answer, 0.005);
    }

    @Test
    public void testCountDailyBudget() {
        Budget budget = new Budget();
        Function function = new Function(budget);

        function.addExpense("rent", 500);
        function.addExpense("phone", 40);
        function.addIncome("salary", 3000);
        function.addIncome("bonus", 200);

        Calc calc = new Calc(budget);

        double answer = calc.countDailyBudget();

        assertEquals(88.67, answer, 0.005);
    }
}
