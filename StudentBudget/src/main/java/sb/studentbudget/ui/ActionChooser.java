package sb.studentbudget.ui;

import sb.studentbudget.logic.Function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import sb.studentbudget.logic.BudgetPrinter;

/**
 * This class manages gui's functions for adding items to income and expense
 * ArrayLists and updating budget review textArea.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class ActionChooser implements ActionListener {

    private JRadioButton income;
    private JRadioButton expense;
    private JButton button;
    private JTextField setName;
    private JTextField setAmount;
    private Function function;
    private JTextArea budget;
    private BudgetPrinter printer;
    private JRadioButton add;
    private JRadioButton delete;

    /**
     *
     * @param budget
     * @param income
     * @param expense
     * @param setName
     * @param setAmount
     * @param function
     * @param printer
     * @param button
     */
    public ActionChooser(JTextArea budget, JRadioButton income, JRadioButton expense, JTextField setName, JTextField setAmount, Function function,
            BudgetPrinter printer, JButton button, JRadioButton add, JRadioButton delete) {
        this.expense = expense;
        this.income = income;
        this.setAmount = setAmount;
        this.setName = setName;
        this.function = function;
        this.budget = budget;
        this.printer = printer;
        this.button = button;
        this.add = add;
        this.delete = delete;
    }

    /**
     * Adds Money-type income or expense to referred ArrayList.
     *
     * @param ae ActionEvent that listen "okay" button in gui
     *
     * @see sb.studentbudget.logic.Function#addIncome(java.lang.String, double)
     * @see sb.studentbudget.logic.Function#addExpense(java.lang.String, double)
     * @see sb.studentbudget.budget.Budget#super
     */
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (this.add.isSelected()) {
            if (this.income.isSelected()) {
                this.function.addIncome(this.setName.getText(), Double.parseDouble(this.setAmount.getText()));
            } else if (this.expense.isSelected()) {
                this.function.addExpense(this.setName.getText(), Double.parseDouble(this.setAmount.getText()));
            }

        } else if (this.delete.isSelected()) {
            if (this.income.isSelected()) {
                this.function.removeIncomeByName(this.setName.getText());
            } else if (this.expense.isSelected()) {
                this.function.removeExpenseByName(this.setName.getText());
            }
        }

        this.budget.setText(this.printer.printDetailedMonthlyBudget());
        this.setAmount.setText("");
        this.setName.setText("");

    }
}
