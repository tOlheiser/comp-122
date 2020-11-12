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

public class Grades {
    public static void main(String[] args) {
        //initialize scanner and variables
        Scanner input = new Scanner(System.in);
        String errorString = "You must enter a number between 1 and 30, please re-enter";
        int a = 0, b = 0, c = 0, d = 0, f = 0;
        int currentGrade, totalMarks;
        char grade;
        // get the number of grades to be entered
        int numberOfGrades = Methods.getValidInput(1, 30, errorString);
        
        // run a loop that calculates and returns a letter grade
        for (int i = 0; i < numberOfGrades; i++) {
            
            // validate and grab the grade
            do {
                System.out.print("Enter a grade: ");
                currentGrade = input.nextInt(); 
                
                if (currentGrade < 0 || currentGrade > 100) {
                    System.out.println("Your entered grade should fall between 0 and 100. Try again.");
                }
                
            } while (currentGrade < 0 || currentGrade > 100);
            
            // validate and grab the total marks
            do {
                System.out.print("Total Marks: ");
                totalMarks = input.nextInt();
                
                if (totalMarks < 0 || totalMarks > 100) {
                    System.out.println("Your entered marks should fall between 0 and 100. Try again.");
                }
            } while (totalMarks < 0 || totalMarks > 100);
            
            // Get the letter grade
            grade = Methods.calculateLetterGrade(currentGrade, totalMarks);
            
            // increment the letter grade variables
            if (grade == 'A') {
                a++;
            } else if (grade == 'B') {
                b++;
            } else if (grade == 'C') {
                c++;
            } else if (grade == 'D') {
                d++;
            } else {
                f++;
            }
            
        }
        
        // output the graph to the screen
        System.out.println("Distribution");
        
        Methods.showGradeDistribution(a, b, c, d, f);
    }
}
