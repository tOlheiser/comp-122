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
public class TestParallelArrays {
    public static void main(String[] args){
        // initialize arrays
        String[] product = {"CD", "DVD", "tape", "LP33", "USB", "floppy"};
        double[] price = {0.25, 1.89, 8.50, 138.75, 57.33, 1.22};
        int[] quantity = new int[6];
        double[] total = new double[6];
        
        // populate the array
        quantity = MyMethods.populateArray(quantity, 100);
        
        // calculate the totals
        total = MyMethods.calculateTotal(price, quantity, total);
        
        // Output Table
        System.out.println("Product\t\tPrice\t\tQuantity\tTotal\n"); // table header
        
        // loop over the length of the array, outputting each row.
        for (int i = 0; i < product.length; i++) {
            System.out.printf("%s\t\t%.2f\t\t%d\t\t%.2f\n", product[i], price[i], quantity[i], total[i]);
        }
    }
}
