package sb.studentbudget.budgetTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sb.studentbudget.budget.Budget;
import static org.junit.Assert.*;
import sb.studentbudget.logic.Function;

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
    public void setNameTest() {
        Budget budget = new Budget();
        budget.setName("Christmas budget");
        String answer = budget.getName();
        
        assertEquals("Christmas budget", answer);

    }
}
