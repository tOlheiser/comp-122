/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_olheiser;
// import scanner to get user variables
import java.util.Scanner;

/**
 *
 * @author Tanner Olheiser
 * Assignment 1
 */
public class IsEven {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize input variable of the 'Scanner' type.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for a number
        System.out.println("Please enter a number.");
        
        // Capture the input and store it in number
        int number = input.nextInt();
        
        // Use an if statement and modulus operator to evalute if odd/even.
        if (number % 2 == 0) {
            System.out.printf("%d is an even number.", number);
        } else {
            System.out.printf("%d is an odd number.", number);
        }
    }
}
