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
// import my methods & the scanner object
import TannersMethods.MyMethods;
import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        // initialize variables & scanner to take inputs
        Scanner input = new Scanner(System.in);
        int menuInput = -1;
        int heads = 0;
        int tails = 0;
        
        // Greet user & provide instructions.
        System.out.println("Coin Toss\n");
        System.out.println("Toss a coin \t1");
        System.out.println("Quit \t\t0");
    
        // Execute this loop so long as the user doesn't exit the program.
        while (menuInput != 0) {
           // Prompt for an input & catch the value
           System.out.print("Choose something from the menu: ");
           menuInput = input.nextInt();
           
           // If the input is 1, flip a coin.
           if (menuInput == 1) {
               // Increment heads or tails based on what Flip() returns.
               if (MyMethods.Flip() == 1) {
                   heads++;
               } else {
                   tails++;
               }
           // Exit the program if the user chose not to toss a coin.
           } else {
               System.out.println("You have exit the program.");
               break;
           }
        }
        // Display Results:
        System.out.println("\nCoin Toss Results:");
        System.out.printf("Heads: %d\nTails: %d\n", heads, tails);
    }
}
