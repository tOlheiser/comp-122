/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TannersMethods;
import java.math.*;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Owner
 */
public class MyMethods {

    /* ------------- Assignment 4 Methods */
    
    
    public static int getRandomInts(int highBound) {
        // create an instance of the random object
        Random rand = new Random();
        // return a random integer between 0 and the highBound
        return rand.nextInt(highBound);
    }
    
    public static double getRandomDoubles() {
        Random rand = new Random();
        return rand.nextDouble()*100; 
        // nextDouble returns number between 0 and 1, then multiply that by 100.
    }
    
    
    public static double getAverage(int[] numberArray) {
        int sum = 0;
        // loop over array using foreach
        for (int number : numberArray) {
            // add each number in the array to the sum
            sum += number;
        }
        
        // Get the average of the array
        return sum / numberArray.length;
    }
    
    public static double getAverage(double[] numberArray) {
        int sum = 0;
        // loop over array using foreach
        for (double number : numberArray) {
            // add each number in the array to the sum
            sum += number;
        }
        
        // Get the average of the array
        return sum / numberArray.length;
    }
    
    public static int[] populateArray(int[] numberArray, int highBound) {
        // loop over the array, storing a random number at each index
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = getRandomInts(highBound);
        }
        
        return numberArray;
    }
    
    public static double[] populateArray(double[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = getRandomDoubles();
        }
        
        return numberArray;
    }
    
    public static int getAboveAverage(int[] numberArray, double average) {
        int counter = 0; // initialize counter
        // loop over the array 
        for (int i = 0; i < numberArray.length; i++) {
            
            // On each iteration, check if the number is above average
            if (numberArray[i] > average) {
                // increment counter if true
                counter++;
            }
        }
        return counter;
    }
    
    
    public static int getMinValue(int[] array) {
        int minValue = 0;
        
        // loop over the array
        for (int i = 0; i < array.length; i++) {
            // on first iteration
            if (i == 0) {
                minValue = array[i];
            // assign minValue of current index is less than current minValue
            } else if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    
    public static int getMinIndex(int[] array) {
        int minValue = getMinValue(array); // get the minimum value
        int minIndex = -1;
        
        // loop over the array
        for (int i = 0; i < array.length; i++) {
            // if minValue equals the current index, assign minIndex then break out of loop
            if (minValue == array[i]) {
                minIndex = i;
                break;
            }
        }
        
        return minIndex;
    }
    
    public static double[] calculateTotal(double[] price, int[] quantity, double[] total) {
        for (int i = 0; i < total.length; i++) {
            total[i] = price[i] * quantity[i];
        }
        
        return total;
    }
    
    public static double getPercent(int value, int totalValue) {
        // Convert to double, operate on it, then return.
        return Double.valueOf(value) / totalValue * 100;
    }
    
    
    
    /* ------------- METHODS FOR PREVIOUS ASSIGNMENTS */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static double roundTwoDecimals(double num) {
        double roundedNum = Math.round(num * 100.0)/100.0;
        return roundedNum;
    }
    
    public static int rdmThousand() {
        int rdmNum = (int)(1+Math.random()*1000);
        return rdmNum;
    }
    
    public static void sayHi() {
        System.out.println("Hey there");
    }
    
    public static double Fahrenheit(double celsius) {
        // store the calculation in fahrenheit then return it.
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    }
    
    public static double Celsius(double fahrenheit) {
        // store the calculation in celsius then return it.
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    }
    
    public static String ReverseInteger(String userNumber) {
        // find how many digits are in the integer.
        int digitLength = userNumber.length();
        // initialize my string
        String reversedNumber = "";
        
        // loop backwards over the digit length, adding each digit to my string
        while (digitLength > 0) {
            reversedNumber += userNumber.charAt(digitLength - 1);
            // decrement
            digitLength--;
        }
        // return the value
        return reversedNumber;
    }
    
    public static double Flip() {
        // return the random value.
        return Math.round( Math.random() );
    }
    
    public static int NumberGuess() {
        // initialize scanner & userGuess variable
        Scanner input = new Scanner(System.in);
        int userGuess = 1;
        
        // Capture the user input
        userGuess = Integer.parseInt(input.nextLine());
        
        // Check to see if the guess was in range.
        if (userGuess < 1) {
            return -1;
        } else if (userGuess > 1000) {
            return -1;
        } 
        
        // return the guess
        return userGuess;
    }
    
    // round to two decimal places
    public static double calculateTaxableIncome(double generalIncome, double investmentIncome, 
            double otherIncome, double regularDeductions, double otherDeductions) {
        // determine the income and deductions, and return income - deductions
        double income = generalIncome + investmentIncome + otherIncome;
        double deductions = regularDeductions + (otherDeductions * .5);
        return income - deductions; 
    }
    
    public static double calculateIncomeTax(double taxableIncome) {
        // Initialize variables.
        double tenPercent, twelvePercent, fifteenPercent, twentyPercent, totalTaxes;
        
        // Operate on the first 20,000
        taxableIncome -= 20000;
        // If taxableIncome is >= 0 after subtracting 20,000, do a simple calculation.
        if (taxableIncome >= 0) {
            tenPercent = 20000 * .10;
            totalTaxes = tenPercent;
        // Otherwise, find the percent of the remaining income.
        } else {
            // find the tax amount of the available income
            tenPercent = (20000 + taxableIncome) * .10;
            // return out of the function since we've dealt with the remaining income.
            return tenPercent;
        }
        
        taxableIncome -= 20000;
        if (taxableIncome >= 0) {
            twelvePercent = 20000 * .12;
            totalTaxes += twelvePercent;
        } else {
            twelvePercent = (20000 + taxableIncome) * .12;
            totalTaxes += twelvePercent;
            return totalTaxes;
        }
        
        taxableIncome -= 20000;
        if (taxableIncome >= 0) {
            fifteenPercent = 20000 * .15; 
            totalTaxes += fifteenPercent;
        } else {
            fifteenPercent = (20000 + taxableIncome) * .15;
            totalTaxes += fifteenPercent;
            return totalTaxes;
        }
        
        // Remainder of the taxable income is taxed 20%
        twentyPercent = taxableIncome * .20;
        // Add twentyPercent to the totalTaxes for the final amount.
        totalTaxes += twentyPercent;
        
        // return the final value
        return totalTaxes;
    }
    
}
