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
public class reverseArray {
    public static void main(String[] args) {
        // Declare an array of ints called numbers that holds 10 values.
        int[] numbers = new int[10];
        
        // Populate Array
        numbers = MyMethods.populateArray(numbers, 100);
        
        // Output the information:
        System.out.println("Array Values, Reversed:\n");
        for (int i = 9; i != -1; i--) {
            System.out.printf("Index %d: %d\n", i, numbers[i]);
        }
        
    }
}
