package sb.studentbudget.ui;

import sb.studentbudget.budget.Budget;
import sb.studentbudget.logic.BudgetPrinter;
import sb.studentbudget.logic.Calc;
import sb.studentbudget.logic.Function;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

/**
 * This class set's up the graphic user interface.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class GraphicUserInterface implements Runnable {

    private JFrame frame;
    private Scanner scan;
    private Budget budget;
    private Calc calc;
    private Function function;
    private BudgetPrinter printer;

    /**
     *
     */
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
        frame.setPreferredSize(new Dimension(1200, 700));
//        frame.setLayout(new GridBagLayout());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.add(createPanel(), BorderLayout.PAGE_START);

    }

    /**
     *
     * @return
     */
    public JFrame getFrame() {
        return frame;
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        GridBagConstraints c = new GridBagConstraints();

        JTextArea budget = new JTextArea("");
        budget.setText(this.printer.printDetailedMonthlyBudget());
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 40;
        c.anchor = GridBagConstraints.NORTH;
        c.gridwidth = 1;
        c.weightx = 2;
        panel.add(budget, c);

        JLabel question1 = new JLabel("Would you like to add or delete a title?");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.ipady = 10;
        c.weightx = 4;
        panel.add(question1, c);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        JRadioButton add = new JRadioButton("add");
        JRadioButton delete = new JRadioButton("delete");
        buttonGroup1.add(add);
        buttonGroup1.add(delete);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.ipady = 10;
        c.weightx = 3;
        panel.add(add, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.ipady = 10;
        c.weightx = 3;
        panel.add(delete, c);

        JLabel question2 = new JLabel("Choose the list to be modifyed:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.ipady = 10;
        c.weightx = 4;
        panel.add(question2, c);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        JRadioButton income = new JRadioButton("income");
        JRadioButton expense = new JRadioButton("expense");
        buttonGroup2.add(income);
        buttonGroup2.add(expense);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.ipady = 10;
        c.weightx = 3;
        panel.add(income, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        c.ipady = 10;
        c.weightx = 3;
        panel.add(expense, c);

        JLabel title = new JLabel("Title:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        c.ipady = 10;
        c.weightx = 1;
        panel.add(title, c);

        JTextField setName = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        c.ipady = 10;
        c.weightx = 3;
        panel.add(setName, c);

        JLabel amount = new JLabel("Amount:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 5;
        c.ipady = 10;
        c.weightx = 1;
        panel.add(amount, c);

        JTextField setAmount = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 6;
        c.ipady = 10;
        c.weightx = 3;
        panel.add(setAmount, c);

        JButton button = new JButton("Okay");
        ActionChooser chooser = new ActionChooser(budget, income, expense, setName,
                setAmount, this.function, this.printer, button, add, delete);
        button.addActionListener(chooser);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridx = 1;
        c.gridy = 7;
        c.weightx = 3;
        panel.add(button, c);

        return panel;
    }

}
