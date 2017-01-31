package sb.studentbudget.logicTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.BudgetPrinter;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.logic.Function;

public class BudgetPrinterTest {

    public BudgetPrinterTest() {
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
    public void TestBudgetPrinter() {

        Budget budget = new Budget();
        Function function = new Function(budget);
        BudgetPrinter printer = new BudgetPrinter(budget);
        Calc calc = new Calc(budget);
        
        function.addExpense("vuokra", 300);
        function.addExpense("puhelin", 30);
        function.addExpense("sähkö", 5);
        function.addExpense("bussilippu", 25);
        function.addExpense("ruoka", 150);
        
        function.addIncome("opintotuki", 400);
        function.addIncome("säästöt", 200);
        
        String answer = printer.printDetailedMonthlyBudget();
        
        assertEquals("Income:\n"
                + "opintotuki\t400.0 €\n"
                + "säästöt\t200.0 €\n\n"
                + "Expenses:\n"
                + "vuokra\t300.0 €\n"
                + "puhelin\t30.0 €\n"
                + "sähkö\t5.0 €\n"
                + "bussilippu\t25.0 €\n"
                + "ruoka\t150.0 €\n\n"
                + "Budget review:\n"
                + "Total monthly income: 600.0 €\n"
                + "Total monthly expenses: 510.0 €\n"
                + "Excess cash: 90,00 €\n"
                + "Weekly budget: 22,50 €\n"
                + "Daily budget: 3,00 €\n", answer);

    }
}
