package sb.studentbudget.logicTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.logic.Function;

public class BudgetPrinterTest {

    private final Budget budget;
    private final Function function;
    private final Calc calc;

    public BudgetPrinterTest() {
        budget = new Budget();
        function = this.budget.getFunction();
        calc = new Calc(budget);
    }

    @Before
    public void setUp() {
        function.addExpense("vuokra", 300);
        function.addExpense("puhelin", 30);
        function.addExpense("sähkö", 5);
        function.addExpense("bussilippu", 25);
        function.addExpense("ruoka", 150);

        function.addIncome("opintotuki", 400);
        function.addIncome("säästöt", 200);

    }

    @Test
    public void constructorCreatesTextWriter() {
        String answer = "";
        if (this.budget.getPrinter().getWriter() != null) {
            answer = "notNull";
        }
        assertEquals("notNull", answer);
    }

    @Test
    public void constructorCreatesCalc() {
        String answer = "";
        if (this.budget.getPrinter().getCalc() != null) {
            answer = "notNull";
        }
        assertEquals("notNull", answer);
    }

    @Test
    public void TestBudgetPrinter() {

        String answer = this.budget.getPrinter().budgetReview();

        assertEquals("Budget review:\n\n"
                + "Income:\n"
                + "opintotuki\t400.0 €\n"
                + "säästöt\t200.0 €\n\n"
                + "Expenses:\n"
                + "vuokra\t300.0 €\n"
                + "puhelin\t30.0 €\n"
                + "sähkö\t5.0 €\n"
                + "bussilippu\t25.0 €\n"
                + "ruoka\t150.0 €\n\n"
                + "Total monthly income: 600.0 €\n"
                + "Total monthly expenses: 510.0 €\n"
                + "Balance: 90,00 €\n"
                + "Weekly budget: 22,50 €\n"
                + "Daily budget: 3,00 €\n", answer);
    }
}
