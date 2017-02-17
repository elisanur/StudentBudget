package sb.studentbudget.budget;

/**
 * This class holds name and amount of one income or expense.
 *
 * @author Elisa Nurmi, Github profile: elisanur, elisa.nurmi@me.com
 */
public class Money {

    private double amount;
    private String name;

    /**
     * Constructor initialises attributes from given String name and double amount.
     * 
     * @param name name String from user's input 
     * @param amount amount Double from user's input
     */
    public Money(String name, double amount) {
        this.amount = amount;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
