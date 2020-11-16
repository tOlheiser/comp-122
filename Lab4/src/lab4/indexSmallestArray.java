/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import TannersMethods.MyMethods;
/**
 *
 * @author Owner
 */
public class indexSmallestArray {
    public static void main(String[] args) {
        // initialize variables
        int[] numbers = new int[20];
        int minValueIndex = -1;
        int minValue = -1;
       
        MyMethods.populateArray(numbers, 100); // Populate Array
        minValue = MyMethods.getMinValue(numbers); // Get the smallest value
        minValueIndex = MyMethods.getMinIndex(numbers); // get the index of the smallest value
        
        // Output
        System.out.printf("The index of %d is: %d\n", minValue, minValueIndex);
        
        System.out.println("\nArray Contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Index %d: %d\n", i, numbers[i]);
        }
        
        
        
    }
}
