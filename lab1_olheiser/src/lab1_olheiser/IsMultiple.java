/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_olheiser;

// import a scanner so I can get user data.
import java.util.Scanner;

/**
 *
 * @author Tanner Olheiser
 * Assignment 1
 */
public class IsMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize scanner and variables.
        Scanner input = new Scanner(System.in);
        int firstNum, secondNum;
        
        // Prompt the user for a number
        System.out.println("Please enter the first number.");
        firstNum = input.nextInt();
        
        System.out.println("\nPlease enter the second number.");
        secondNum = input.nextInt();
        
        // Display a message according to whether the number is/isn't a multiple.
        if (firstNum % secondNum == 0) {
            System.out.printf("\n%d is a multiple of %d.", firstNum, secondNum);
        } else {
            System.out.printf("\n%d is not a multiple of %d.", firstNum, secondNum);
        }
    }
    
}

