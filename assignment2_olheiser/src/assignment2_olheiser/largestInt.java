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

public class largestInt {
    
    public static void main(String[] args) {
        // Initialize scanner & variables
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        int userNumber;
        
        System.out.println("Please enter 10 numbers.");

        // for loop to run until i increments to 10. 
        for (int i = 1; i <= 10; i++) {
            // prompt the user for a number
            System.out.printf("\n(%d) Enter a number: ", i); 
            userNumber = input.nextInt();

            // if userNumber is greater than largestNumber, largestNumber has a new value.
            if (userNumber > largestNumber) {
                largestNumber = userNumber;
            }

            // Display largest number to the user after the loop ends.
            System.out.printf("\nAfter iteration %d, the largest number is: %d", i, largestNumber);
        }
    }

}
