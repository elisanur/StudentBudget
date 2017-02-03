package sb.studentbudget.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class ActionChooser implements ActionListener {
    
    private JRadioButton income;
    private JRadioButton expense;

    public ActionChooser(JRadioButton income, JRadioButton expense) {
        this.expense=expense;
        this.income = income;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Message received!");
    }
}
