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

public class driverSentinelLog {
    
    public static void main(String[] args) {
        // initialize scanner & variables.
        Scanner input = new Scanner(System.in);
        double kilometers = 0;
        double kmCheck = -1;
        double litreCheck = -1;
        double litres = 0;
        double mileage;
        int i = 1;
        boolean sentinel = true;
        
        System.out.println("Fuel Log");
        // Display instruction to the user
        System.out.println("\nEnter '0' when you're finished.");
        
        // Run the loop so long as the sentinel value (0) hasn't been entered. 
        while (sentinel) {
            // track entry number
            System.out.printf("\nEntry %d\n", i);
            
            // prompt and store km value
            System.out.println("Please enter kilometers driven:");
            kmCheck = Double.parseDouble(input.nextLine());
            
            // prompt for the litre value and store it.
            System.out.println("\nPlease enter litres used:");
            litreCheck = Double.parseDouble(input.nextLine());
            
            // Add kmCheck & litreCheck to their respective values
            kilometers += kmCheck;
            litres += litreCheck;
            
            // update sentinel if the user wants to exit
            if (kmCheck == 0 || litreCheck == 0) {
                sentinel = false;
            }
            
            // track iteration #
            i++;
        }
        // Calculate Mileage & display the information to the user.
        mileage = kilometers / litres;
        System.out.printf("\nDistance traveled: %.1f kilometers", kilometers);
        System.out.printf("\nAmount of fuel used: %.1f litres", litres);
        System.out.printf("\nYour mileage: %.1f Km/litre", mileage);
    }
    
    
}
