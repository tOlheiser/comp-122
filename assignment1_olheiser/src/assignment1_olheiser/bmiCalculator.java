/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_olheiser;

// import scanner so I can get user input.
import java.util.Scanner;

/**
 *
 * @author Tanner Olheiser
 * Assignment 1
 */
public class bmiCalculator {
    public static void main(String[] args) {
        
        // Initialize values
        Scanner input = new Scanner(System.in);
        int weight, height;
        float bmi;
        
        // Display the title of the application
        System.out.println("Body Mass Index Calculator\n");
        
        // Prompt user for their weight
        System.out.println("Please enter your weight in pounds.");
        weight = input.nextInt();
        
        // Prompt user for their height
        System.out.println("\nPlease enter your height in inches.");
        height = input.nextInt();
        
        // Evaluate BMI
        bmi = (weight * 703) / (height * height);
        
        // Heading
        System.out.printf("\nYour Body Mass Index is: %.1f\n", bmi);
        
        // Evaluate which statement to display
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        } 
    }
}
