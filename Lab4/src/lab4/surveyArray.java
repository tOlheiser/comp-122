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
public class surveyArray {
    public static void main(String[] args) {
        // Initialize variables
        int awful = 0, ok = 0, delicious = 0;
        String percent = "%";
        
        //initialize arrays
        int[] sample1 = {1, 2, 2, 1, 1, 3, 3, 2, 2, 1};
        int[] sample2 = {3, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 3, 3, 2, 2, 2, 3};
        int[] sample3 = {1, 1, 1, 2, 2, 1, 3, 2, 1, 1, 1, 2};
        int[] results = new int[40];
        
        System.arraycopy(sample1, 0, results, 0, 10);
        System.arraycopy(sample2, 0, results, 10, 18);
        System.arraycopy(sample3, 0, results, 27, 12);
        
        // loop throught the array
        for (int i = 0; i < results.length; i++) {
            // check for match at each index. If match, increment corresponding counter
            if (results[i] == 1) {
                awful++;
            } else if (results[i] == 2) {
                ok++;
            } else {
                delicious++;
            }
        }
        
        // Output Data
        System.out.println("Survey Results: ");
        System.out.printf("Awful: %d\nOk: %d\nDelicious: %d\n", awful, ok, delicious );
        System.out.printf("\nPercentage of Awful: %.1f%s", MyMethods.getPercent(awful, 40), percent);
        System.out.printf("\nPercentage of Ok: %.1f%s", MyMethods.getPercent(ok, 40), percent);
        System.out.printf("\nPercentage of Delicious: %.1f%s", MyMethods.getPercent(delicious, 40), percent);
        
    }
}
