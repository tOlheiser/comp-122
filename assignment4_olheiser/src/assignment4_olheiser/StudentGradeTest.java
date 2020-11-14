/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_olheiser;

/**
 *
 * @author Owner
 */
public class StudentGradeTest {
    public static void main(String[] args) {
        String[] name = {"Robin", "Jo", "Kelly", "Jaimie"};
        int[] midtermScore = {28, 78, 92, 83};
        int[] finalScore = {58, 75, 96, 79};
        int[] assignmentGrade = {33, 80, 90, 83};
        int[] finalGrade = new int[4];
        
        System.out.println("Name:\t\tMidterm:\tFinal:\t\tAssignment:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s\t\t%d\t\t%d\t\t%d\n", name[i], midtermScore[i], finalScore[i], assignmentGrade[i]);
        }
        
    }
}
