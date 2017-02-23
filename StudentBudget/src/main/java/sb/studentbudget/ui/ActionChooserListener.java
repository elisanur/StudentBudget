package sb.studentbudget.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import sb.studentbudget.budget.Budget;

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
    private JTextArea budgetReview;
    private JRadioButton add;
    private JRadioButton delete;
    private Budget budget;

    /**
     * Constructor that initialises attributes for ActionChooserListener object.
     *
     * @param budgetReview JTextArea for budget review
     * @param budget Budget object
     * @param income JRadioButton. If selected, sets income list to be handled
     * in Budget object.
     * @param expense JRadioButton. If selected, sets expenses list to be
     * handled in Budget object.
     * @param title JTextField. Reads the input from user.
     * @param amount JTextField. Reads the input from user.
     * @param add JRadioButton that listens if add is selected
     * @param delete JRadioButton that listens if delete is selected
     */
    public ActionChooserListener(JTextArea budgetReview, JRadioButton income,
            JRadioButton expense, JTextField title, JTextField amount,
            JRadioButton add, JRadioButton delete, Budget budget) {
        this.expense = expense;
        this.income = income;
        this.amount = amount;
        this.title = title;
        this.budgetReview = budgetReview;
        this.add = add;
        this.delete = delete;
        this.budget = budget;
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
                    this.budget.getFunction().addIncome(this.title.getText(), a);
                } else if (this.expense.isSelected()) {
                    this.budget.getFunction().addExpense(this.title.getText(), a);
                }

                this.amount.setText("");
                this.title.setText("");
                this.budgetReview.setText(this.budget.getPrinter().printDetailedMonthlyBudget());

            } else if (this.delete.isSelected()) {
                if (this.income.isSelected()) {
                    this.budget.getFunction().removeIncomeByName(this.title.getText());
                } else if (this.expense.isSelected()) {
                    this.budget.getFunction().removeExpenseByName(this.title.getText());
                }

                this.amount.setText("");
                this.title.setText("");
                this.budgetReview.setText(this.budget.getPrinter().printDetailedMonthlyBudget());
            }

        } catch (Exception e) {
        }

    }
}
