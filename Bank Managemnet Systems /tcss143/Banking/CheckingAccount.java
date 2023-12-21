/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA2 : Library Management System (LMS) Banking Software
 * @version 1.0
 */

/**
 * CheckingAccount class is inherits the abstract concept of the banking account.
 */

package tcss143.Banking;
public class CheckingAccount extends BankAccount {
    /**
     * Constructor for checking account
     * @param accountID
     * @param amount
     */
    public CheckingAccount(String accountID, double amount) {
        super(accountID, "Checking", amount);
    }
    /**
     * Withdraw given the amount from account
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount > getAmount()) {
            throw new IllegalArgumentException("Insufficient Balance");
        }
        else this.setAmount(this.getAmount() - amount);
    }
    /**
     * Deposit given the amount from account
     * @param amount
     */
    public void deposit(double amount) {
        setAmount(getAmount() + amount);
    }
}
