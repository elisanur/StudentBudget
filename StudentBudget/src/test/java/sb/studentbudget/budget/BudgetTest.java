/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb.studentbudget.budget;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elisanur
 */
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
    public void incomeNameSetCorrectly() {
        Budget budget = new Budget();

        budget.addExpense("rent", 300);

        String answer = budget.getExpense().get(0).getName();

        assertEquals("rent", answer);
    }

}
