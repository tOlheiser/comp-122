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
// Import Scanner & my methods
import TannersMethods.MyMethods;
import java.util.Scanner;

public class temperatureConverter {
    
    public static void main(String[] args) {
        
        // initialize scanner to take inputs
        Scanner input = new Scanner(System.in);
        
        // Greet user & provide instructions.
        System.out.println("Temperature Converter\n");
        System.out.println("Convert to Celsius \t1");
        System.out.println("Convert to Fahrenheit \t2");
        System.out.println("Quit \t\t\t0");
        
        // initialize values 
        int sentinel = -1;
        double fahrenheit = 0;
        double celsius = 0;
        
        // Create a loop that runs so long as the user chooses not to quit.
        while (sentinel != 0) {
            
            // Prompt the user for a menu value
            System.out.print("\nChoose something from the menu: ");
            // Capture the menu input
            sentinel = input.nextInt(); 
            
            // Convert from Fahrenheit to Celsius
            if (sentinel == 1) {
                // Prompt for and capture the value
                System.out.print("Please enter a temperature in Fahrenheit: ");
                fahrenheit = input.nextDouble();
                
                // Convert the value
                celsius = MyMethods.Celsius(fahrenheit);
                
                // Display the conversion to the user
                System.out.printf("%.1f degrees fahrenheit into celsius is %.1f\n", fahrenheit, celsius);
                
            // Convert from Celsius to Fahrenheit
            } else if (sentinel == 2) {
                System.out.print("Please enter a temperature in Celsius: ");
                celsius = input.nextDouble();
                
                // Convert the value
                fahrenheit = MyMethods.Fahrenheit(celsius);
                
                // Display the conversion to the user
                System.out.printf("%.1f degrees celius into fahrenheit is %.1f\n", celsius, fahrenheit);
                
            // Either the user entered 0 or an incorrect value, break out of loop
            } else {
                System.out.println("You have exit the program.");
                break;
            }
        }
        
    }
}
