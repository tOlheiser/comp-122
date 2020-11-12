/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author Owner
 */
// import scanner 
import java.math.*;
import java.util.Scanner;

public class TenIntegers {
    public static void main(String[] args) {
        // TODO code application logic here
        // count how many odd numbers
        Scanner input = new Scanner(System.in);
        int currentInt;
        int highestNumber = 0;
        int lowestNumber = 0;
        int oddCount = 0;
        int average = 0;
        
        for (int i = 1; i <= 10; i++) {
            // prompt for input
            System.out.print("Please enter a number: ");
            currentInt = input.nextInt();
            average += currentInt;
            
            // on first iteration, assign lowest & highest numbers
            if (i == 1) {
                lowestNumber = currentInt;
                highestNumber = currentInt;
            }
            
            // increment odd count
            if (currentInt % 2 != 0) {
                oddCount++;
            }
            
            // check if current int is lowest num
            if (currentInt < lowestNumber) {
                lowestNumber = currentInt;
            }
            
            // check if current int is highest num
            if (currentInt > highestNumber) {
                highestNumber = currentInt;
            }
        }
        
        // Assign the average value when the loop is complete.
        average /= 10;
        
        // Output information
        System.out.println("Here are your numbers:\n");
        System.out.printf("Highest Number: %d\n", highestNumber);
        System.out.printf("Lowest Number: %d\n", lowestNumber);
        System.out.printf("Amount of odd numbers: %d\n", oddCount);
        System.out.printf("Average: %d\n", average);
    }
}
