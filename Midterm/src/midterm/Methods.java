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
import java.util.Scanner;

public class Methods {
    public static int CalculateSpeedingTicket(int overLimit) {
        int speedingFine;

        // calculate for the first 20km over
        overLimit -= 20;
        if (overLimit >= 0) {
            speedingFine = 75 + (3 * 20);
        } else {
            return speedingFine = (20 + overLimit) * 3 + 75;
        }
        
        // calculate the next 20km over
        overLimit -= 20;
        if (overLimit >= 0) {
            speedingFine += 6 * 20;
        } else {
            return speedingFine += (20 + overLimit) * 6;
        }
        
        // calculate the next 20km over
        return speedingFine += 9 * overLimit;
    }
    
    public static int getValidInput(int low, int high, String message) {
        // initialize scanner and variable
        Scanner input = new Scanner(System.in);
        int userInput;
        
        if (high < low) {
            return -1;
        }
        
        // validate and get user input
        do {
            System.out.print("How many grades: ");
            userInput = input.nextInt();
            
            if (userInput < low || userInput > high) {
                System.out.println(message);
            }
        } while (userInput < low || userInput > high);
        
        return userInput;
    }
    
   
    public static char calculateLetterGrade(int grade, int totalMarks) {
        /* I tried running gradeCheck = grade / totalMarks * 100, but it would
        always return 0.0 So the quick fix for me was declare new double variables 
        https://www.tutorialkart.com/java/java-int-to-double/ */
        
        // initialize variables
        char letterGrade;
        double gradeCheck;
        double userGrade = grade;
        double userMarks = totalMarks;
        
        // calculate the grade to check
        gradeCheck = (userGrade / userMarks) * 100;
        
        // assign the letter grade based on the grade check
        if (gradeCheck >= 81) {
            letterGrade = 'A';
        } else if (gradeCheck >= 71) {
            letterGrade = 'B';
        } else if (gradeCheck >= 61) {
            letterGrade = 'C';
        } else if (gradeCheck >= 51) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        
        // return the letter grade
        return letterGrade;
    }
    
    public static void showGradeDistribution(int a, int b, int c, int d, int f) {
        // initialize graph string
        String graphString = "";
        
        // build the graph value according to the number inside a
        for (int i = 0; i < a; i++) {
            graphString += "*";
        }
        // write the row to the screen
        System.out.println("A:  " + graphString);
        
        graphString = ""; // reset graph value
        // calculate the graph value
        for (int i = 0; i < b; i++) {
            graphString += "*";
        }
        System.out.println("B:  " + graphString);
        
        graphString = ""; // reset graph value
        for (int i = 0; i < c; i++) {
            graphString += "*";
        }
        System.out.println("C:  " + graphString);
        
        graphString = ""; // reset graph value
        for (int i = 0; i < d; i++) {
            graphString += "*";
        }
        System.out.println("D:  " + graphString);
        
        graphString = ""; // reset graph value
        for (int i = 0; i < f; i++) {
            graphString += "*";
        }
        System.out.println("F:  " + graphString);
        
        // check to see if it's a strong class
        if (a + b >= c + d + f) {
            System.out.println("\nStrong class!");
        }
    }
}
