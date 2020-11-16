/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_olheiser;

import TannersMethods.MyMethods;

/**
 *
 * @author Owner
 */
public class StudentGradeTest {
    public static void main(String[] args) {
        // Declare Arrays
        String[] name = {"Robin", "Jo", "Kelly", "Jaimie"};
        int[] midtermScore = {28, 78, 92, 83};
        int[] finalScore = {58, 75, 96, 79};
        int[] assignmentGrade = {33, 80, 90, 83};
        int[] finalGrade = new int[4];
        
        // Calculate final grade & average
        finalGrade = MyMethods.getFinalGrades(midtermScore, finalScore, assignmentGrade);
        double averageGrade = MyMethods.getAverage(finalGrade);
        
        // Display data & average
        System.out.println("Name:\t\tMidterm:\tFinal:\t\tAssignment:\tFinal Grade:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\n", name[i], midtermScore[i], finalScore[i], assignmentGrade[i], finalGrade[i]);
        }
        
        System.out.printf("\nAverage Grade: %.1f\n\n", averageGrade);
        
        
        // Create arrays to accommodate new students added
        String[] newName = new String[6];
        int[] newMidScore = new int[6];
        int[] newFinScore = new int[6];
        int[] newAssignGrade = new int[6];
        int[] newFinalGrade = new int[6];
        
        // Add the first set of data to the new array
        System.arraycopy(name, 0, newName, 0, 4); 
        System.arraycopy(midtermScore, 0, newMidScore, 0, 4);
        System.arraycopy(finalScore, 0, newFinScore, 0, 4);
        System.arraycopy(assignmentGrade, 0, newAssignGrade, 0, 4);
        System.arraycopy(finalGrade, 0, newFinalGrade, 0, 4);
        
        // Adding the new data to the last 2 elements of each array
        newName[4] = "Terry";   newName[5] = "Kerry";
        newMidScore[4] = 86;    newMidScore[5] = 71;
        newFinScore[4] = 76;    newFinScore[5] = 75;
        newAssignGrade[4] = 91; newAssignGrade[5] = 78;
        
        // Recalculate final grades & average as new students have been added
        newFinalGrade = MyMethods.getFinalGrades(newMidScore, newFinScore, newAssignGrade);
        averageGrade = MyMethods.getAverage(newFinalGrade);
        
        // Determine the Highest & Lowest grade
        int lowestGrade = MyMethods.getMinIndex(newFinalGrade);
        int highestGrade = MyMethods.getMaxIndex(newFinalGrade);
        
        // Display data
        System.out.println("Name:\t\tMidterm:\tFinal:\t\tAssignment:\tFinal Grade:");
        for (int i = 0; i < newFinalGrade.length; i++) {
            System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\n", newName[i], newMidScore[i], newFinScore[i], newAssignGrade[i], newFinalGrade[i]);
        }
        
        // Display the average, lowest & highest grade, and number of students who passed
        System.out.printf("\nAverage Grade: %.1f", averageGrade);
        System.out.printf("\n\nThe lowest grade is: %s", newName[lowestGrade]);
        System.out.printf("\nThe highest grade is: %s", newName[highestGrade]);
        System.out.printf("\nNumber of students who passed: %d\n", MyMethods.findFrequency(newFinalGrade, 60));
        
    }
}
