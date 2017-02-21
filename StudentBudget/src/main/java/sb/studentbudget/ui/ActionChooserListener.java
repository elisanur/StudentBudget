package sb.studentbudget.ui;

import sb.studentbudget.logic.Function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import sb.studentbudget.logic.BudgetPrinter;

/**
 * This class manages graphic user interface functions for adding items to
 * income and expense ArrayLists and updating budget review textArea. This class
 * is a listener for the "Okay" button in graphic user interface.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class ActionChooserListener implements ActionListener {

    private JRadioButton income;
    private JRadioButton expense;
    private JButton okayButton;
    private JTextField title;
    private JTextField amount;
    private Function function;
    private JTextArea budget;
    private BudgetPrinter printer;
    private JRadioButton add;
    private JRadioButton delete;

    /**
     * Constructor that initialises attributes for ActionChooserListener object.
     *
     * @param budget Budget object
     * @param income JRadioButton. If selected, sets income list to be handled
     * in Budget object.
     * @param expense JRadioButton. If selected, sets expenses list to be
     * handled in Budget object.
     * @param title JTextField. Reads the input from user.
     * @param amount JTextField. Reads the input from user.
     * @param function Function object that has all functions for handling
     * Budget object.
     * @param printer BudgetPrinter object that is used for printing budget
     * review.
     * @param add JRadioButton that listens if add is selected
     * @param delete JRadioButton that listens if delete is selected
     */
    public ActionChooserListener(JTextArea budget, JRadioButton income, JRadioButton expense, JTextField title, JTextField amount, Function function,
            BudgetPrinter printer, JRadioButton add, JRadioButton delete) {
        this.expense = expense;
        this.income = income;
        this.amount = amount;
        this.title = title;
        this.function = function;
        this.budget = budget;
        this.printer = printer;
        this.add = add;
        this.delete = delete;
    }

    /**
     * Adds Money-type income or expense to referred ArrayList.
     *
     * @param ae ActionEvent that listen "okay" button in graphic user interface
     *
     * @see sb.studentbudget.logic.Function#addIncome(java.lang.String, double)
     * @see sb.studentbudget.logic.Function#addExpense(java.lang.String, double)
     * @see sb.studentbudget.budget.Budget#super
     */
    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            
            

            if (this.add.isSelected()) {
                double a = Double.parseDouble(this.amount.getText());
                
                if (this.income.isSelected()) {
                    this.function.addIncome(this.title.getText(), a);
                } else if (this.expense.isSelected()) {
                    this.function.addExpense(this.title.getText(), a);
                }

                this.amount.setText("");
                this.title.setText("");
                this.budget.setText(this.printer.printDetailedMonthlyBudget());

            } else if (this.delete.isSelected()) {
                if (this.income.isSelected()) {
                    this.function.removeIncomeByName(this.title.getText());
                } else if (this.expense.isSelected()) {
                    this.function.removeExpenseByName(this.title.getText());
                }

                this.amount.setText("");
                this.title.setText("");
                this.budget.setText(this.printer.printDetailedMonthlyBudget());
            }

        } catch (Exception e) {
        }

    }
}
