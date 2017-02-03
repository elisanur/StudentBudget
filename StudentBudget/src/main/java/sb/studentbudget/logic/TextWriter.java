package sb.studentbudget.logic;

import java.io.*;

public class TextWriter {

    private FileWriter writer;

    public TextWriter() throws IOException {
        File file = new File("budget.txt");
        file.createNewFile();
        this.writer = new FileWriter(file);

    }

    public void writeToFile(BudgetPrinter printer) throws IOException {
        writer.write(printer.printDetailedMonthlyBudget());
        writer.flush();
        writer.close();
    }

}
