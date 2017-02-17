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
     *
     * @throws IOException
     */
    public TextWriter() throws IOException {
    }

    /**
     * Writes budget review to .txt -file using the BudgetPrinter.
     *
     * @param printer BudgetPrinter-type printer
     * @param fileChooser
     * @throws IOException
     *
     * @see sb.studentbudget.logic.BudgetPrinter#printDetailedMonthlyBudget()
     */
    public void writeToFile(BudgetPrinter printer, JFileChooser fileChooser) throws IOException {

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
