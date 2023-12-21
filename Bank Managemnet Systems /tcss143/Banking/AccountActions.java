/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA2 : Library Management System (LMS) Banking Software
 * @version 1.0
 */

/**
 Interface to define actions taken in regard to accounts
 */
package tcss143.Banking;
public interface AccountActions {
    public abstract void openAccount(String accountID, double amount, String typeOfAccount);
    public abstract void closeAccount(String accountID);
    public abstract void makeTransaction(String accountID, double amount, String typeOfTransaction);
    public abstract void printTransactionReport(String accountID);
    public abstract void printTransactionReport();
    public abstract void printAllAcounts();
}
