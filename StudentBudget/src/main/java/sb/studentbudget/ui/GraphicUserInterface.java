package sb.studentbudget.ui;

import sb.studentbudget.budget.Budget;

import java.awt.*;
import java.io.IOException;
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

    /**
     *
     */
    public GraphicUserInterface() throws IOException {
        this.scan = new Scanner(System.in);
        this.budget = new Budget();
    }

    @Override
    public void run() {
        frame = new JFrame("StudentBudget");
        frame.setPreferredSize(new Dimension(500, 750));
        frame.setMaximumSize(new Dimension(500, 750));
//        frame.setLayout(new GridBagLayout());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
//        container.setLayout(new GridBagLayout());
        container.add(createPanel());
    }

    /**
     *
     * @return
     */
    public JFrame getFrame() {
        return frame;
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
//        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.PAGE_START;
        c.gridx = 0;
        c.gridy = 1;
        c.ipady = 10;
        c.weightx = 1.0;
        c.insets = new Insets(0, 5, 0, 5);

        JTextArea budgetReview = new JTextArea();

        JLabel question1 = new JLabel("Would you like to add or delete a title?");

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
        c.weightx = 0.5;
        panel.add(add, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.ipady = 10;
        c.weightx = 0.5;
        panel.add(delete, c);

        JLabel question2 = new JLabel("Choose the list to be modifyed:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.ipady = 10;
        c.weightx = 1.0;
        c.insets = new Insets(10, 5, 0, 5);
        panel.add(question2, c);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        JRadioButton income = new JRadioButton("income");
        JRadioButton expense = new JRadioButton("expense");
        buttonGroup2.add(income);
        buttonGroup2.add(expense);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        c.ipady = 10;
        c.weightx = 0.5;
        c.insets = new Insets(0, 5, 0, 5);
        panel.add(income, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        c.ipady = 10;
        c.weightx = 3;
        panel.add(expense, c);

        JLabel title = new JLabel("Title:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 7;
        c.ipady = 10;
        c.weightx = 1;
        c.insets = new Insets(10, 5, 0, 5);
        panel.add(title, c);

        JTextField titleField = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 8;
        c.ipady = 10;
        c.weightx = 3;
        c.insets = new Insets(0, 5, 0, 5);
        panel.add(titleField, c);

        JLabel amount = new JLabel("Amount:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 9;
        c.ipady = 10;
        c.weightx = 1;
        c.insets = new Insets(10, 5, 0, 5);
        panel.add(amount, c);

        JTextField amountField = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 10;
        c.ipady = 10;
        c.weightx = 3;
        c.insets = new Insets(0, 5, 0, 5);
        panel.add(amountField, c);

        JButton okayButton = new JButton("Okay");
        ActionChooserListener chooser = new ActionChooserListener(budgetReview, income, expense, titleField,
                amountField, add, delete, this.budget);
        okayButton.addActionListener(chooser);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 11;
        c.weightx = 3;
        c.insets = new Insets(15, 5, 0, 5);
        panel.add(okayButton, c);

        c.gridx = 0;
        c.gridy = 12;
        c.weightx = 3;

        JButton exportButton = new JButton("Export budget review");
        ExportListener el = new ExportListener(this.budget);
        exportButton.addActionListener(el);
        panel.add(exportButton, c);

        budgetReview.setText(this.budget.getPrinter().printDetailedMonthlyBudget());
//        budget.setPreferredSize(new Dimension(500, 300));
        budgetReview.setEditable(false);
        JScrollPane scroll = new JScrollPane(budgetReview);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        scroll.setPreferredSize(new Dimension(500, 300));
        c.gridx = 0;
        c.gridy = 13;
        c.ipady = 210;
        panel.add(scroll, c);

        return panel;
    }

}
