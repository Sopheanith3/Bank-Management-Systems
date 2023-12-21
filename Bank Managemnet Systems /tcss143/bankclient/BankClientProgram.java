/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA2 : Library Management System (LMS) Banking Software
 * @version 1.0
 */
package tcss143.bankclient;

import java.util.Scanner;
import tcss143.Banking.BankCustomer;

public class BankClientProgram {
    public static void main(String[] args) {
        
        BankCustomer alice = new BankCustomer("Alice");
        alice.openAccount("Alice456A", 100.00, "Checking");
        alice.openAccount("Alice456B", 50.00, "Savings");
        alice.closeAccount("Alice456A");
        alice.closeAccount("Alice456B");

        BankCustomer bob = new BankCustomer("Bob");
        bob.openAccount("Bob123A", 200.00, "Checking");
        bob.openAccount("Bob123B", 150.00, "Savings");
        bob.closeAccount("Bob123A");
        bob.closeAccount("Bob123B");

        BankCustomer charlie = new BankCustomer("Charlie");
        charlie.openAccount("1", 50.00, "Checking");
        charlie.openAccount("2" , 100.00, "Savings");
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("Select: ");
                System.out.println("1. Make Transaction");
                System.out.println("2. Print Transactions for Account");
                System.out.println("3. Print all Transactions");
                System.out.println("4. Print all Accounts");
                System.out.println("5. Exit");
                System.out.println();
                System.out.print("Please Select: ");
                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        System.out.println();
                        System.out.print("Give Account Number: ");
                        String account = scanner.nextLine();
                        
                        System.out.print("Press 1 for Withdraw or Press 0 for Deposit: ");
                        String accType = scanner.nextLine();

                        String transaction;
                        if (accType.equals("1")) {
                            transaction = "Credit";
                        } else if (accType.equals("0")) {
                            transaction = "Debit";
                        } else {
                            System.out.println("Incorrect Transaction Type");
                            continue;
                        }
                        System.out.print("Enter amount: ");
                        String amount = scanner.nextLine();

                        double value;
                        try {
                            value = Double.parseDouble(amount);
                            charlie.makeTransaction(account, value, transaction);
                            System.out.println("Transaction successful!");
                        } catch (RuntimeException runtimeException) {
                            System.out.println(runtimeException.getMessage());
                            continue;
                        }
                        break;
                        
                    case "2":
                        System.out.println();
                        System.out.print("Give Account Number: ");
                        String accID = scanner.nextLine();

                        charlie.printTransactionReport(accID);
                        break;

                    case "3":
                        System.out.println();
                        charlie.printTransactionReport();
                        break;
                    
                    case "4":
                        System.out.println();
                        charlie.printAllAcounts();
                        break;

                    case "5":
                        System.out.println();
                        System.out.println("Thank you!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println();
                        System.out.println("Please Enter a Valid Choice");
                        break;
                }
            } catch (Exception e) {
                System.out.println("System threw error: " + e.getMessage());
                scanner.close();
            } 
            
        }
    }
}
