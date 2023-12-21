/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA2 : Library Management System (LMS) Banking Software
 * @version 1.0
 */

/**
 * BankCustomer class is where all the method such as open account,
 * transaction, close account, deposit, withdraw , print bank statement, and etc..
 */

package tcss143.Banking;

import java.util.ArrayList;

public class BankCustomer implements AccountActions{
    //Private field for Name
    private String customerName;
    //Private field for list of Accounts
    private ArrayList<BankAccount> accountList;
    //Private field for list of Transactions
    private ArrayList<Transaction> transactionList;

    /**
     * Constructor for Bank Customer
     * @param customerName
     */
    public BankCustomer(String customerName) {
        this.customerName = customerName;
        accountList = new ArrayList<>();
        transactionList = new ArrayList<>();
    }
    /**
     * @return Get cusomter name
     */
    public String getCustomerName() {
        return customerName;
    }
    /**
     * @return account list
     */
    public ArrayList<BankAccount> getAccountList() {
        return accountList;
    }
    /**
     * @return transaction list
     */
    public ArrayList<Transaction> getTransactionsList() {
        return transactionList;
    }
    /**
     * Open the given type of account
     * @param accountID
     * @param amount
     * @param typeOfAccount
     */
    public void openAccount(String accountID, double amount, String typeOfAccount) {
        if (typeOfAccount.contains("Checking")) {
            accountList.add(new CheckingAccount(accountID, amount));
        } else if (typeOfAccount.contains("Savings")) {
            accountList.add(new RegularSavingAccount(accountID, amount));       
        } 
        else throw new IllegalArgumentException("That type of account is not declarable");
    }
    /**
     * Close account with given accountID
     * @param accountID
     */
    public void closeAccount(String accountID) {
        int sizeORG = accountList.size();
        for (int i = 0; i < accountList.size(); i++) {
            BankAccount account = accountList.get(i);
            if (account.getAccountID().equals(accountID)) {
                accountList.remove(i);
            }
        }
        if (accountList.size() == sizeORG) {
            throw new IllegalArgumentException("Account does not exist!");
        }
    }
    /**
     * Make a new transaction
     * @param accountID
     * @param amount
     * @param typeOfTransaction
     */
    public void makeTransaction(String accountID, double amount, String typeOfTransaction) {
        Transaction transaction = new Transaction(accountID, amount, typeOfTransaction);
        transactionList.add(transaction);
        if (typeOfTransaction == "Credit") {
            for (int i = 0; i < accountList.size(); i++) {
                if (accountList.get(i).getAccountID() == accountID) {
                    accountList.get(i).deposit(amount);
                }
            }
        } else if (typeOfTransaction == "Debit") {
            for (int i = 0; i < accountList.size(); i++) {
                if (accountList.get(i).getAccountID() == accountID) {
                    accountList.get(i).withdraw(amount);
                }
            }
        } 
        else {
            throw new IllegalArgumentException("Cannot Make Transaction");
        }
    }
    /**
     * Print transaction from a given account
     * @param accountID
     */
    public void printTransactionReport(String accountID) {
        for (int i = 0; i < transactionList.size(); i++) {
            if (transactionList.get(i).getAccountID().equals(accountID)) {
                System.out.println(transactionList.get(i).toString());
            }
        }
        System.out.println();
    }
    /**
     * Print all transaction for this customer
     */
    public void printTransactionReport() {
        String print = "";
        for (int i = 0; i < transactionList.size(); i++) {
            print += transactionList.get(i).toString() + "\n";
        }
        System.out.println(print);
    }
    /**
     * Print all account amounts
     */
    public void printAllAcounts() {
        for (int i = 0; i< accountList.size(); i++) {
            System.out.print(accountList.get(i).toString()+ " ");
        }
        System.out.println();
    }
 
}
