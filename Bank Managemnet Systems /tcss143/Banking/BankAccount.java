/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA2 : Library Management System (LMS) Banking Software
 * @version 1.0
 */

/**
 * BankAccount class is a implement abstract class with
 * user account information
 */

package tcss143.Banking;
public abstract class BankAccount {
    //Private field for accountID
    private String accountID;
    //Private field for account type
    private String accountType;
    //Private field for amount
    private double amount;

    /**
     * Constructor for general bank account
     * @param theAccountID
     * @param theAccountType
     * @param theAmount
     */
    public BankAccount(String theAccountID, String theAccountType, double theAmount) {
        this.accountID = theAccountID;
        this.accountType = theAccountType;
        this.amount = theAmount;
    }
    /**
     * Getter for account ID
     * @return account ID
     */
    public String getAccountID() {
        return accountID;
    }
    /**
     * Getter for account type
     * @return account type
     */
    public String getAccountType() {
        return accountType;
    }
    /**
     * Getter for amount
     * @return amount
     */
    public double getAmount() {
        return amount;
    }
    /**
     * Setter for account ID
     * @param accountID
     */
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    /**
     * Setter for account type
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    /**
     * Setter for amount
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    /**
     * @return Return a string represent of account
     */
    public String toString() {
        return accountType + ": $" + amount;
    }
    /**
     * Abstract Withdraw method
     * @param amount
     */
    public abstract void withdraw(double amount);
    /**
     * Abstract deposit method
     * @param amount
     */
    public abstract void deposit(double amount);
}
