/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_olheiser;

// import scanner to get user data
import java.util.Scanner;

/**
 *
 * @author Tanner Olheiser
 * Assignment 1
 */
public class CalculateCircle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize my Scanner & variables.
        Scanner input = new Scanner(System.in);
        int radius, diameter;
        double area, circumference;
        double pi = 3.14159;
        
        // Prompt the user for a radius
        System.out.print("Please enter a number: ");
        radius = input.nextInt();
        
        // Evaluate the values
        diameter = radius * 2;
        area = pi * (radius * radius);
        circumference = (pi * radius) * 2;
        
        // Display the values to the user
        System.out.printf("Your radius: %d\n", radius);
        System.out.printf("The diameter of your circle is: %d\n", diameter);
        System.out.printf("The area of your circle is: %f\n", area);
        System.out.printf("The circumference of your circle is: %f\n", circumference);
    }
}
