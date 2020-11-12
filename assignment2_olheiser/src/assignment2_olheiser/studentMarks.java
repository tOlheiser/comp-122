/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_olheiser;

/**
 *
 * @author Tanner Olheiser
 * Comp-122 Assignment 2
 */
// Import Scanner so I can get user inputs.
import java.util.Scanner;

public class studentMarks {
    
    public static void main(String[] args) {
        // Initialize scanner and variables.
        Scanner input = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        double studentMark;
        
        System.out.println("Submit the marks for your 10 students");
        
        // for loop that runs until 10 grades have been entered.
        for (int i = 1; i <= 10; i++) {
            // prompt the user for a mark & get that input
            System.out.printf("Enter the mark for student %d: ", i);
            studentMark = input.nextDouble();
            
            // nested if statement to validate if it's a valid entry.
            if (studentMark >= 0 && studentMark <= 100) {
                // increment pass if true
                if (studentMark >= 50) {
                    pass++;
                // otherwise, increment fail
                } else {
                    fail++;
                }
            } 
        }
        
        // Display the pass/fail results to the user.
        System.out.printf("%d students passed and %d students failed", pass, fail);
    }
}
