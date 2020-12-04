/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5_olheiser;

/**
 *
 * @author Owner
 */
public class TestAccount {
    public static void main(String[] args) {
        // Display the number of accounts created ~start of program~
        System.out.printf("Number of accounts created: %d", Account.getNumberOfAccounts());
        
        // Create instances of the Account object
        Account FrankAccount = new Account(45167, 4.2);
        Account MarvinAccount = new Account(23.20, 12.9);
        
        // Balance before transfer:
        System.out.println("\n\nBalance after transfer:");
        System.out.printf("Beavis: %.2f\n", FrankAccount.getBalance());
        System.out.printf("Butthead: %.2f\n", MarvinAccount.getBalance());
        
        // Transfer:
        FrankAccount.transfer(5167, MarvinAccount);
        System.out.println("\nTransfer sent.");
        
        // Balance after transfer:
        System.out.println("\nBalance after transfer:");
        System.out.printf("Beavis: %.2f\n", FrankAccount.getBalance());
        System.out.printf("Butthead: %.2f\n", MarvinAccount.getBalance());
        
        // Display the number of accounts created ~end of program~
        System.out.printf("\nNumber of accounts created: %d\n", Account.getNumberOfAccounts());
    }
}
