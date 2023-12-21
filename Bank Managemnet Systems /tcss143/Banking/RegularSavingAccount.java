package tcss143.Banking;
/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA2 : Library Management System (LMS) Banking Software
 * @version 1.0
 */
public class RegularSavingAccount extends SavingsAccount{
    /**
     * Constructor for regular savings account
     * @param accountID
     * @param amount
     */
    public RegularSavingAccount(String accountID, double amount) {
        super(accountID, amount, 0.01);
    }
    /**
     * Apply savings rate to deposits
     */
    public void deposit(double amount) {
        setAmount(getAmount() + amount + amount * getSavingsRate());
    }
}
