/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_olheiser;

/**
 *
 * @author Tanner Olheiser
 */
// Import my methods, scanner, and the random object
import TannersMethods.MyMethods;
import java.util.Scanner;
import java.util.Random; 

public class GuessTheNumber {
    public static void main(String[] args) {
        // create instance of Random class 
        Random rand = new Random(); 
        // initialize my userGuess variable.
        int userGuess = -1;
        
        // Generate a random integer in range 0 to 999 
        int randomInt = rand.nextInt(1000);
        
        System.out.print("Welcome to the Joker's guessing game!\n");
        
        // While loop that prompts the user for guesses until they get it right.
        while (userGuess != randomInt) {
            // Prompt for the number 
            System.out.print("Please guess a number: ");
            
            // Check to see if my method throws an exception
            try {
                userGuess = MyMethods.NumberGuess();
            // if it does, I know that the user didn't enter a number.
            } catch (NumberFormatException e) {
                // display a message accordingly & skip to the next iteration of the loop
                System.out.println("Please enter a valid integer.");
                continue;
            }
            
            /* If MyMethods.NumberGuess() returns -1, it's my error code, 
               indicating the number entered was not in range. */
            if (userGuess == -1) {
                // display a message and skip to the next iteration
                System.out.println("You must enter a value between 1 and 1000.");
                continue;
            }
            
            // Display a message based on the user's guess.
            if (userGuess > randomInt) {
                System.out.println("Too high, guess again.");
            } else if (userGuess < randomInt) {
                System.out.println("Too low, guess again.");
            } else if (userGuess == randomInt) {
                System.out.println("You guessed correctly.");
            }
        }
        
    }
}
