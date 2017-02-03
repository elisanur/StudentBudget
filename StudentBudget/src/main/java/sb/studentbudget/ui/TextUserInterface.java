package sb.studentbudget.ui;

import java.util.Scanner;
import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.BudgetPrinter;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.logic.Function;

public class TextUserInterface {

    private Scanner scan;
    private Budget budget;
    private Calc calc;
    private Function function;
    private BudgetPrinter printer;

    public TextUserInterface() {
        this.scan = new Scanner(System.in);
        this.budget = new Budget();
        this.calc = new Calc(budget);
        this.function = new Function(budget);
        this.printer = new BudgetPrinter(budget);

    }

    public void runTextUserInterface() {
        System.out.println("Hello! Welcome to count your budget! \n");

        while (true) {

            System.out.println("Would you like to add an income or an expense? "
                    + "(answer with small letters 'i' for income, 'e' for expense and 'n' quits): ");
            String answer = scan.nextLine();

            if (answer.equals("i")) {
                addIncome();

            } else if (answer.equals("e")) {
                addExpense();

            } else if (answer.equals("n")) {
                break;
            } else {
                System.out.println("Pardon me, let's try again.");
            }

        }
        
        System.out.println(this.printer.printDetailedMonthlyBudget());

    }

    private void addIncome() {

        System.out.println("Name your income: ");
        String nimi = scan.nextLine();

        System.out.println("State the amount: ");
        double amount = requestDouble();

        function.addIncome(nimi, amount);
    }

    private void addExpense() {

        System.out.println("Name your expense: ");
        String nimi = scan.nextLine();

        System.out.println("State the amount: ");
        double amount = requestDouble();
        function.addExpense(nimi, amount);

    }

    private double requestDouble() {
        double amount = 0;

        while (true) {
            try {
                amount = Double.parseDouble(scan.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please submit a number.");
            }
        }

        return amount;
    }

}
