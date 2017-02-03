package sb.studentbudget.ui;

import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.BudgetPrinter;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.logic.Function;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class GraphicUserInterface implements Runnable {

    private JFrame frame;
    private Scanner scan;
    private Budget budget;
    private Calc calc;
    private Function function;
    private BudgetPrinter printer;

    public GraphicUserInterface() {
        this.scan = new Scanner(System.in);
        this.budget = new Budget();
        this.calc = new Calc(budget);
        this.function = new Function(budget);
        this.printer = new BudgetPrinter(budget);
    }

    @Override
    public void run() {
        frame = new JFrame("StudentBudget");
        frame.setPreferredSize(new Dimension(600, 600));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.add(new JTextArea(this.printer.printDetailedMonthlyBudget()));

        container.add(createPanel(), BorderLayout.SOUTH);

    }

    public JFrame getFrame() {
        return frame;
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();

        panel.add(new JLabel("Would you like to add income or expense?"));

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton income = new JRadioButton("income");
        JRadioButton expense = new JRadioButton("expense");

        buttonGroup.add(income);
        buttonGroup.add(expense);
        
        JButton button = new JButton("Okay");
        
        ActionChooser chooser = new ActionChooser(income, expense);
        button.addActionListener(chooser);

        panel.add(income);
        panel.add(expense);
        panel.add(button);

        return panel;
    }
}
