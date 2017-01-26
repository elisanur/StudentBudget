package sb.studentbudget.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Budget;

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
        BudgetPrinter printer = new BudgetPrinter(budget);
        Calc calc = new Calc(budget);
        
        budget.addExpense("vuokra", 300);
        budget.addExpense("puhelin", 30);
        budget.addExpense("sähkö", 5);
        budget.addExpense("bussilippu", 25);
        budget.addExpense("ruoka", 150);
        
        budget.addIncome("opintotuki", 400);
        budget.addIncome("säästöt", 200);
        
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
                + "Excess cash: 90.0 €\n"
                + "Weekly budget: 22.5 €\n"
                + "Daily budget: 3.0 €\n", answer);

    }
}
