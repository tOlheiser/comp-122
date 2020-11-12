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
public class smallestArray {
    public static void main(String[] args) {
        // Initialize array 
        int[] numberArray = {30,4,33,56,6,9,90,2,21};
        // grab the smallest value
        int smallestValue = MyMethods.getMinValue(numberArray);
        
        // Output
        System.out.printf("The smallest value is: %d", smallestValue);
    }
}
