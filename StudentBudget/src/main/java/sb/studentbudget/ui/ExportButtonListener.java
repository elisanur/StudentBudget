package sb.studentbudget.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import sb.studentbudget.budget.Budget;

/**
 * This class listens "Export budget review" button in graphic user interface.
 * The method in this class uses TextWriter object that tries to write a file to 
 * selected target file. This class is separated from other functions because it is 
 * left out from pit-tests.
 * 
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class ExportButtonListener implements ActionListener {

    private Budget budget;

/**
 * Constructor that initialises budget attribute. 
 * 
 * @param budget Budget object
 */    
    
    public ExportButtonListener(Budget budget) {
        this.budget = budget;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                this.budget.getPrinter().writeToFile(fileChooser);
            } catch (Exception ex) {
            }
        }
    }

}
