/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_olheiser;

/**
 *
 * @author Owner
 */
import TannersMethods.MyMethods;
import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
            
        // Initialize scanner & variables
        Scanner input = new Scanner(System.in);
        String userNumber = "";
        String reversedNumber = "";
        
        // Prompt the user for a value
        System.out.print("Please enter an integer you'd like reversed: ");
        
        // Capture said value and store in a variable
        userNumber = input.next();
        
        // Store the value of the ReverseInteger method into the reversedNumber variable.
        reversedNumber = MyMethods.ReverseInteger(userNumber);
        
        // Write out the results.
        System.out.printf("\nYour number %s, reversed is: %s\n", userNumber, reversedNumber);
    }
}
