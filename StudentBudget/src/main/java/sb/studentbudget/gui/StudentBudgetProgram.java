package sb.studentbudget.gui;

import java.util.Scanner;
import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.Calc;

public class StudentBudgetProgram {

    private Scanner scan;
    private Budget budget;
    private Calc calc;

    public StudentBudgetProgram() {
        this.scan = new Scanner(System.in);
        this.budget = new Budget();
        this.calc = new Calc(budget);

    }

    public void boot() {

        textUserInterface();

    }

    private void textUserInterface() {
        System.out.println("Hello! Welcome to count your budget! \n");

        System.out.println("Would you like to add an income or an expense? "
                + "(answer with small letters please, 'no' quits): ");

        while (true) {

            String answer = scan.nextLine();

            if (answer.equals("income")) {
                addIncome();

            } else if (answer.equals("expense")) {
                addExpense();

            } else if (answer.equals("no")) {
                break;
            } else {
                System.out.println("Pardon me, i didnt quite get that. Could you "
                        + "please write again with small letters 'income' or 'expense'");
            }

        }

    }

    private void addIncome() {

        System.out.println("Name your income: ");
        String nimi = scan.nextLine();

        System.out.println("State the amount (else set as zero): ");
        double amount = scan.nextDouble();
        budget.addIncome(nimi, amount);
    }

    private void addExpense() {

        System.out.println("Name your expense: ");
        String nimi = scan.nextLine();

        System.out.println("State the amount (else set as zero): ");
        double amount = scan.nextDouble();
        budget.addExpense(nimi, amount);

    }

}
