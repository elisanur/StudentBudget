package sb.studentbudget.logic;

import java.io.*;

/**
 * This class is for saving the budget as a text file.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class TextWriter {

    private FileWriter writer;

    /**
     *
     * @throws IOException
     */
    public TextWriter() throws IOException {
        File file = new File("budget.txt");
        file.createNewFile();
        this.writer = new FileWriter(file);

    }

    /**
     * Writes budget review to "budget.txt" -file using the BudgetPrinter.
     *
     * @param printer BudgetPrinter-type printer
     * @throws IOException
     *
     * @see sb.studentbudget.logic.BudgetPrinter#printDetailedMonthlyBudget()
     */
    public void writeToFile(BudgetPrinter printer) throws IOException {
        writer.write(printer.printDetailedMonthlyBudget());
        writer.flush();
        writer.close();
    }

}
