/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA2 : Library Management System (LMS) Banking Software
 * @version 1.0
 */

/**
 * SavingsAccount is a implement and abstract class that inherits the concept
 * of the BankAccount class that maintain the saving rate.
 */

package tcss143.Banking;
public abstract class SavingsAccount extends BankAccount {
    //Private field savingRate
    private double savingsRate;
    /**
     * Constructor for saving account
     * @param accountID
     * @param amount
     * @param savingsRate
     */
    public SavingsAccount(String accountID,double amount,double savingsRate) {
        super(accountID, "Saving", amount);
        this.savingsRate = savingsRate;
    }
    /**
     * Getter for saving rate
     * @return saving rate
     */
    public double getSavingsRate() {
        return savingsRate;
    }
    /**
     * Setter for saving rate
     * @param savingsRate
     */
    public void setSavingsRate(double savingsRate) {
        this.savingsRate = savingsRate;
    }
    /**
     * Withdraw given amount from account
     */
    public void withdraw(double amount) {
        if (amount > getAmount()) {
            throw new IllegalArgumentException("Insufficient Balance");
        }
        setAmount(getAmount() - amount);
    }
}
