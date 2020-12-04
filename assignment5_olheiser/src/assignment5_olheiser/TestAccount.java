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
        Account BeavisAccount = new Account(45167, 4.2);
        Account ButtheadAccount = new Account(23.20, 12.9);
        
        // Balance before transfer:
        System.out.println("\n\nBalance after transfer:");
        System.out.printf("Beavis: %.2f\n", BeavisAccount.getBalance());
        System.out.printf("Butthead: %.2f\n", ButtheadAccount.getBalance());
        
        // Transfer:
        BeavisAccount.transfer(5167, ButtheadAccount);
        System.out.println("\nTransfer sent.");
        
        // Balance after transfer:
        System.out.println("\nBalance after transfer:");
        System.out.printf("Beavis: %.2f\n", BeavisAccount.getBalance());
        System.out.printf("Butthead: %.2f\n", ButtheadAccount.getBalance());
        
        // Display the number of accounts created ~end of program~
        System.out.printf("\nNumber of accounts created: %d\n", Account.getNumberOfAccounts());
    }
}
