package sb.studentbudget.budgetTest;

import org.junit.Before;
import org.junit.Test;
import sb.studentbudget.budget.Money;
import static org.junit.Assert.*;

public class MoneyTest {
    private Money money;

    public MoneyTest() {
    }

    @Before
    public void setUp() {
        double amount = 300;
        String name = "loan";
        money = new Money(name, amount);
    }

    @Test
    public void getNameTest() {
        String answer = money.getTitle();
        assertEquals("loan", answer);
    }

    @Test
    public void getAmountTest() {
        double answer = money.getAmount();
        assertEquals(300, answer, 0.005);
    }

    @Test
    public void constructorSetsName() {
        String answer = money.getTitle();
        assertEquals("loan", answer);
    }

    @Test
    public void constructorSetsAmount() {
        double answer = money.getAmount();
        assertEquals(300, answer, 0.005);
    }

    @Test
    public void compareToSimilar() {
        Money other = new Money("loan", 300);
        int answer = other.compareTo(this.money.getTitle());
        assertEquals(0, answer);
    }

    @Test
    public void compareToDifferent() {
        Money other = new Money("support", 300);
        int answer = other.compareTo(this.money.getTitle());
        assertEquals(-1, answer);
    }
}
