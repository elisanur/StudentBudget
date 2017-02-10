package sb.studentbudget.budgetTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sb.studentbudget.budget.Money;
import static org.junit.Assert.*;

public class MoneyTest {

    Money money;

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
        double amount = 300;
        String name = "loan";
        money = new Money(name, amount);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getNameTest() {
        String answer = money.getName();
        assertEquals("loan", answer);

    }
    
    @Test
    public void getAmountTest() {
        double answer = money.getAmount();
        assertEquals(300, answer, 0.005);

    }

    @Test
    public void constructorSetsName() {
        money.setName("support");
        String answer = money.getName();
        assertEquals("support", answer);

    }

    @Test
    public void constructorSetsAmount() {
        money.setAmount(400);
        double answer = money.getAmount();
        assertEquals(400, answer, 0.005);

    }
}
