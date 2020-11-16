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
public class StockPriceTest {
    public static void main(String[] args) {
        // initialize variable
        int daysBelowAverage;
        
        // Declare arrays
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        double[] priceSummary = {
            MyMethods.getMaxValue(closingPrice), 
            MyMethods.getMinValue(closingPrice), 
            MyMethods.getAverage(closingPrice)
        };
        
        // reverse sort the closingPrice array from highest to lowest
        closingPrice = MyMethods.reverseSort(closingPrice); 

        // determine the days below average and store in a variable
        daysBelowAverage = MyMethods.getDaysBelowAverage(closingPrice, priceSummary[2]);
        
        // Display the price sumary
        System.out.println("Price Summary:");
        System.out.printf("Highest Price: %.2f\n", priceSummary[0]);
        System.out.printf("Lowest Price: %.2f\n", priceSummary[1]);
        System.out.printf("Average Price: %.2f\n", priceSummary[2]);
        System.out.printf("Days the closing price was below the average price: %d\n", daysBelowAverage);
        
        // Loop through and display the prices
        System.out.println("\nClosing Prices:");
        for (int i = 0; i < closingPrice.length; i++) {
            System.out.println(closingPrice[i]);
        }
    }
}
