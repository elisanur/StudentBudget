package sb.studentbudget.main;

import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.gui.StudentBudgetProgram;
import java.util.Scanner;
import sb.studentbudget.logic.BudgetPrinter;
import sb.studentbudget.logic.Function;

public class Main {

    public static void main(String[] args) {

//        StudentBudgetProgram  studentBudget = new StudentBudgetProgram();
//        studentBudget.boot();
//        Budget budget = new Budget();
//        BudgetPrinter printer = new BudgetPrinter(budget);
//        Calc calc = new Calc(budget
//        Function function = new Function(budget);
//        
//        function.addExpense("vuokra", 300);
//        function.addExpense("puhelin", 30);
//        function.addExpense("sähkö", 5);
//        function.addExpense("bussilippu", 27.4);
//        function.addExpense("ruoka", 150);
//        
//        function.addIncome("opintotuki", 436);
//        function.addIncome("säästöt", 200);


        Budget budget = new Budget();
        BudgetPrinter printer = new BudgetPrinter(budget);
        Calc calc = new Calc(budget);
        Function function = new Function(budget);

        function.addExpense("vuokra", 300);
        function.addExpense("puhelin", 30);
        function.addExpense("sähkö", 5);
        function.addExpense("bussilippu", 25);
        function.addExpense("ruoka", 150);

        function.addIncome("opintotuki", 400);
        function.addIncome("säästöt", 200);

        System.out.println(printer.printDetailedMonthlyBudget());

    }

}
