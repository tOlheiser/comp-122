/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Owner
 */
import TannersMethods.MyMethods;

public class averageArray {
    public static void main(String[] args) {
        // Declare an array of ints called numbers that holds 20 values.
        int[] numbers = new int[20];
        double average = 0;
        int aboveAverage = 0;
        
        // Populate Array
        numbers = MyMethods.populateArray(numbers, 100);
        
        // Get the Average
        average = MyMethods.getAverage(numbers);
        
        // Get the number of values above average
        aboveAverage = MyMethods.getAboveAverage(numbers, average);
        
        // Output the information:
        System.out.println("Array Values:\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Index %d: %d\n", i, numbers[i]);
        }
        System.out.printf("\nAverage: %.1f", average);
        System.out.printf("\nValues above average: %d", aboveAverage);
    }
}
