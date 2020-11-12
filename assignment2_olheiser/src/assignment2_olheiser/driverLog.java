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
// import the scanner so I can get user input.
import java.util.Scanner;

public class driverLog {
    
    public static void main(String[] args) {
        // initialize scanner & variables
        Scanner input = new Scanner(System.in);
        int numEntries;
        double kilometers = 0;
        double litres = 0;
        double mileage;
        
        System.out.println("Fuel Log");
        // prompt the user for amount of entries & get store that value.
        System.out.println("\nHow many tanks of fuel would you like to enter?");
        numEntries = input.nextInt();
        
        // for loop that runs until i increments to user specified value
        for (int i = 1; i <= numEntries; i++) {
            // Track entry number
            System.out.printf("\nEntry %d\n", i);
            
            // prompt and store km driven value
            System.out.println("Please enter kilometers driven:");
            kilometers += input.nextDouble();
            
            // prompt and store litres used value
            System.out.println("\nPlease enter litres used:");
            litres += input.nextDouble();
        }
        // Calculate Mileage
        mileage = kilometers / litres;
        
        // Display information to the user.
        System.out.printf("\nDistance traveled: %.1f kilometers", kilometers);
        System.out.printf("\nAmount of fuel used: %.1f litres", litres);
        System.out.printf("\nYour mileage: %.1f Km/litre", mileage);
    }
    
    
    
}
