package sb.studentbudget.main;

import java.io.IOException;
import sb.studentbudget.budget.*;
import sb.studentbudget.logic.*;
import sb.studentbudget.ui.*;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import sb.studentbudget.ui.GraphicUserInterface;

/**
 *
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class Main {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        GraphicUserInterface ui = new GraphicUserInterface();
        SwingUtilities.invokeLater(ui);

    }

}
