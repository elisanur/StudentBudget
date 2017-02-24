package sb.studentbudget.budget;

/**
 * This class holds name and amount of one income or expense.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class Money {

    private final double amount;
    private final String title;

    /**
     * Constructor initialises attributes from given String name and double
     * amount.
     *
     * @param title name String from user's input
     * @param amount amount Double from user's input
     */
    public Money(String title, double amount) {
        this.amount = amount;
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public String getTitle() {
        return title;
    }

    
    /**
     * Method compares to Money objects by their name
     *
     * @param title title String from user's input
     * @return returns 0 is the title is the same and -1 if not
     */

    public int compareTo(String title) {
        if (title.equals(this.title)) {
            return 0;
        }
        return -1;
    }

}
