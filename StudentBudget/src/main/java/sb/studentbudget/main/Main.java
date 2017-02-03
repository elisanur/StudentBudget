package sb.studentbudget.main;

import java.io.IOException;
import sb.studentbudget.budget.*;
import sb.studentbudget.logic.*;
import sb.studentbudget.ui.*;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import sb.studentbudget.ui.GraphicUserInterface;


public class Main {

    public static void main(String[] args) throws IOException {
        
/*  Hello!
        This is a budget program for students and other users.
        You can see below section for graphic user interface and section for 
        text user interface.
        In the final version, the program will work with the gui.
        There's also a TextWriter class which now creates a budget.txt file 
        from the budget review.
        I'm planning that later it's gonna create a .xls or .pdf file. 
        
        
*/  

//  TEXT USER INTERFACE:
//        TextUserInterface studentBudget = new TextUserInterface();
//        studentBudget.runTextUserInterface();


//  GRAPHIC USER INTERFACE:
//        GraphicUserInterface ui = new GraphicUserInterface();
//        SwingUtilities.invokeLater(ui);


//  CODE FOR TESTING:

        Budget budget = new Budget();
        BudgetPrinter printer = new BudgetPrinter(budget);
        Calc calc = new Calc(budget);
        Function function = new Function(budget);
        TextWriter writer = new TextWriter();

        function.addExpense("vuokra", 300);
        function.addExpense("puhelin", 30);
        function.addExpense("sähkö", 5);
        function.addExpense("bussilippu", 27.4);
        function.addExpense("ruoka", 150);

        function.addIncome("opintotuki", 436);
        function.addIncome("säästöt", 200);
//
//        function.addExpense("vuokra", 300);
//        function.addExpense("puhelin", 30);
//        function.addExpense("sähkö", 5);
//        function.addExpense("bussilippu", 25);
//        function.addExpense("ruoka", 150);
//
//        function.addIncome("opintotuki", 400);
//        function.addIncome("säästöt", 200);
//
//        System.out.println(printer.printDetailedMonthlyBudget());
//
        writer.writeToFile(printer);
    }

}
