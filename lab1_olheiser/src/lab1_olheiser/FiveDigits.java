/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_olheiser;
// Import scanner to get user input
import java.util.Scanner;

/**
 *
 * @author Tanner Olheiser
 * Assignment 1
 */
public class FiveDigits {
    public static void main(String[] args) {
        // initialize scanner & variables
        Scanner input = new Scanner(System.in);
        int number, index0, index1, index2, index3, index4;
        int tenThousands, thousands, hundreds, tens;
        
        // Prompt the user for the five digit number & store that value
        System.out.println("Please enter 5-digit whole number.");
        number = input.nextInt();
        
        // Grab the value of the digits, one digit at a time.
        index0 = number / 10000;
        tenThousands = number - (index0 * 10000);
        
        index1 = tenThousands / 1000;
        thousands = tenThousands - (index1 * 1000);
        
        index2 = thousands / 100;
        hundreds = thousands - (index2 * 100);
        
        index3 = hundreds / 10;
        tens = hundreds - (index3 * 10);
                
        index4 = tens;
        
        // Write out their number
        System.out.printf("Your number: %d   %d   %d   %d   %d\n", 
                index0, index1, index2, index3, index4);
    }
}
