/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA2 : Library Management System (LMS) Banking Software
 * @version 1.0
 */

/**
 * Transaction class is to model the transaction that happens such as
 * transaction type and amount
 */
package tcss143.Banking;

public class Transaction {
    //Private field for accountID
    private String accountID;
    //Private field for amount
    private double amount;
    //Private field for transactionType
    private String transactionType;

    /**
     * Constructor for Transactions
     * @param theAccountID
     * @param theAmount
     * @param theTransactionType
     */
    public Transaction (String theAccountID,double theAmount,String theTransactionType) {
        this.accountID = theAccountID;

        this.amount = theAmount;

        if (theTransactionType == "Credit" || theTransactionType == "Debit") {
            this.transactionType = theTransactionType;
        } 
        else throw new IllegalArgumentException("Different type of transaction is not allow");
        //this.transactionType = theTransactionType;
        
    }
    /**
     * Getter
     * @return account id
     */
    public String getAccountID() {
        return accountID;
    }
    /**
     * Getter 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }
    /**
     * Getter
     * @return transaction
     */
    public String getTransaction() {
        return transactionType;
    }
    /**
     * Setter for account ID
     * @param accountID
     */
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    /**
     * Setter for amount 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    /**
     * Setter for transaction
     * @param transactionType
     */
    public void setTransaction(String transactionType){
        if (transactionType == "Credit" || transactionType == "Debit") {
            this.transactionType = transactionType;
        } 
        else throw new IllegalArgumentException("Different type of transaction is not allow");
    }
    /**
     * To String for Transaction
     * @return String represent of transaction
     */
    public String toString() {
        return "Transaction made by: " + accountID + " of " + "$"+ amount + ". Transaction Type: " + transactionType;
    }
}
