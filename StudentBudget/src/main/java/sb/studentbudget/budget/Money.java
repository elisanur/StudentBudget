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
     *
     * @param name
     * @param amount
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
