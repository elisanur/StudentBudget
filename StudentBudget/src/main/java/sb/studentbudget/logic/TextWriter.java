package sb.studentbudget.logic;

import java.io.*;
import javax.swing.JFileChooser;

/**
 * This class is for saving the budget as a text file.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class TextWriter {

    /**
     * Writes budget review to .txt -file using the BudgetPrinter.
     *
     * @param review Budget review made by the Budget Printer
     * @param fileChooser JFileChooser object
     *
     * @see sb.studentbudget.logic.BudgetPrinter#printDetailedMonthlyBudget()
     */
    public void writeToFile(String review, JFileChooser fileChooser) {

        try {
            FileWriter fw = new FileWriter(fileChooser.getSelectedFile() + ".txt");
            fw.write(review);
            fw.flush();
            fw.close();
        } catch (Exception e) {
        }
    }

}
