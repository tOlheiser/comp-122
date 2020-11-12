/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_olheiser;

/**
 *
 * @author Tanner Olheiser
 * Comp-122 Assignment 2
 */
// Import Scanner so I can get user inputs.
import java.util.Scanner;

public class changeCalculator {
    
    public static void main(String[] args) {
        // initialize variables
        Scanner input = new Scanner(System.in);
        int menuCheck = -1;
        double chosenItem = -1; 
        double payment = -1;
        
        // menu item variables
        double candyBar = 0.85;
        double mints = 0.65;
        double gum = 0.75;
        double drink = 1.00;
        
        // coin variables
        double toonies = 2.00;
        double loonies = 1.00;
        double quarters = 0.25;
        double dimes = 0.10;
        double nickels = 0.05;
        double pennies = 0.01;
        
        // Write out the menu
        System.out.println("Tanner's Candy Shop");
        System.out.println("\n1 Candy Bar \t$0.85");
        System.out.println("\n2 Mints \t$0.65");
        System.out.println("\n3 Gum Bar \t$0.75");
        System.out.println("\n4 Drink \t$1.00");
        System.out.println("\n5 Exit Program");
        
        while (menuCheck != 5) {
            // Prompt & Retrieve user menu choice
            System.out.print("\nChoose something from the menu: ");
            menuCheck = input.nextInt(); 
            
            // use a switch to determine what the item is.
           switch (menuCheck) {
               case 1: 
                   chosenItem = candyBar;
               case 2:
                   chosenItem = mints;
               case 3:
                   chosenItem = gum;
               case 4: 
                   chosenItem = drink;
           }
           
           // If the user chose not to exit the program, calculate change
           if (menuCheck != 5) {
               // Prompt & Retrieve user payment
               System.out.print("\nPlease enter a payment: ");
               payment = input.nextDouble();
               
               // Check if user entered sufficient funds
               if (payment < chosenItem) {
                System.out.println("You have insufficient funds.");
               } else { 
                
                // Calculate and display change   
                double changeDue = payment - chosenItem;
                // Convert to int and store in a separate variable
                int change = (int)(changeDue * 100);
                
                /* Found decimal numbers a pain to work with (little erros & odd
                quirks abound), so I made them whole numbers to be easier to 
                work with. */
                
                // How many toonies can you fit inside 'change'?
                
                int numToonies = change / 200;
                // What's left of change after you account for number of toonies?
                change = change % 200;
                
                // Repeat the process
                int numLoonies = change / 100;
                change = change % 100;
                
                int numQuarters = change / 25;
                change = change % 25;
                
                int numDimes = change / 10;
                change = change % 10;
                
                int numNickels = change / 5;
                change = change % 5;
                
                // Pennies = what's left.
                int numPennies = change;

                // Display Change information
                System.out.println("\nYour change is: " + changeDue);
                System.out.printf("\nYou get %d toonies", numToonies);
                System.out.printf("\nYou get %d loonies", numLoonies);
                System.out.printf("\nYou get %d quarters", numQuarters);
                System.out.printf("\nYou get %d dimes", numDimes);
                System.out.printf("\nYou get %d nickels", numNickels);
                System.out.printf("\nYou get %d pennies\n", numPennies);
               }
           }
        }
    }
    
    
}
