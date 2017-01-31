package sb.studentbudget.budgetTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sb.studentbudget.budget.Money;
import static org.junit.Assert.*;

public class MoneyTest {

    public MoneyTest() {
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
    public void constructorSetsName() {
        Money money = new Money("loan", 300);

        String answer = money.getName();

        assertEquals("loan", answer);

    }

    @Test
    public void constructorSetsAmount() {
        Money money = new Money("loan", 300);

        double answer = money.getAmount();

        assertEquals(300, answer, 0.005);

    }
}
