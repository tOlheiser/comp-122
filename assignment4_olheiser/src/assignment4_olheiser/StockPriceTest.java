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
        
        double[] closingPrice = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        double[] priceSummary = {MyMethods.getMaxValue(closingPrice), MyMethods.getMinValue(closingPrice), MyMethods.getAverage(closingPrice)};

        System.out.printf("Highest Price: %f", priceSummary[0]);
        System.out.printf("Lowest Price: %f", priceSummary[1]);
        System.out.printf("Average Price: %f", priceSummary[2]);
        
        // A) Get the highest value in the array
        // B) Get the smallest value in the array
        // C) Get the average of the values in the array
        /* D) Write a method that calcluates # of values below the average. 
        The value is returns is the # of days */
        // E) Iterate over each element, returning "Day i: array[i]\n"
        // 
    }
}
