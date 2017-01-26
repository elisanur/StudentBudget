package sb.studentbudget.main;

import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.gui.StudentBudgetProgram;
import java.util.Scanner;
import sb.studentbudget.logic.BudgetPrinter;

public class Main {

    public static void main(String[] args) {

//        StudentBudgetProgram  studentBudget = new StudentBudgetProgram();
//        studentBudget.boot();

        Budget budget = new Budget();
        BudgetPrinter printer = new BudgetPrinter(budget);
        Calc calc = new Calc(budget);
        
        budget.addExpense("vuokra", 300);
        budget.addExpense("puhelin", 30);
        budget.addExpense("sähkö", 5);
        budget.addExpense("bussilippu", 27.4);
        budget.addExpense("ruoka", 150);
        
        budget.addIncome("opintotuki", 436);
        budget.addIncome("säästöt", 200);
        
        System.out.println(printer.printDetailedMonthlyBudget());
        

    }

}
