package sb.studentbudget.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import sb.studentbudget.logic.BudgetPrinter;
import sb.studentbudget.logic.TextWriter;

/**
 *
 * @author elisanur
 */
public class ExportListener implements ActionListener {

    private BudgetPrinter printer;

    public ExportListener(BudgetPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter fw = new FileWriter(fileChooser.getSelectedFile() + ".txt");
                fw.write(printer.printDetailedMonthlyBudget());
                fw.flush();
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

}
