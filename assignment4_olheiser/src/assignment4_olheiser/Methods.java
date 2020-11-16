/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_olheiser;

import java.util.Arrays;

/**
 *
 * @author Owner
 */
public class Methods {
    
    public static int findFrequency(int[] array, int Value) {
        // Declare counter
        int counter = 0;
        
        // loop over array
        for (int i = 0; i < array.length; i++) {
            // if current index > pass value, increment counter
            if (array[i] >= Value) counter++;
        }
        
        return counter;
    }
    
    public static int[] getFinalGrades(int[] mid, int[] fin, int[] ass) {
        // Declare arrays
        int[] finalGrade = new int[mid.length];
        double[] finGrade = new double[mid.length];
        
        // Multiply grade by % then round up, add all together & store in current index
        for (int i = 0; i < mid.length; i++) {
            finGrade[i] = ( Math.round(ass[i] * .15) ) + ( Math.round(mid[i] * .40) ) + ( Math.round(fin[i] * .45) );
        }
        
        // cast double variables into ints then store into the finalGrade array.
        for (int i = 0; i < mid.length; i++) {
            finalGrade[i] = (int)finGrade[i];
        }
        
        return finalGrade;
    }
    
    public static double[] reverseSort(double[] arr) {
        int j = arr.length - 1; // reverse counter
        int i = 0; // regular counter
        // Decare reversed array with same length as array passed in
        double[] reversedArray = new double[arr.length];
        Arrays.sort(arr); // use library to sort in ascending order
        
        //
        while (j >= 0) {
            /* Since oldArray[] has the highest values at the end, we assign the
            first index from end of oldArray[] and increment/decrement according.*/
            reversedArray[i] = arr[j];
            // increment & decrement counters
            j--; 
            i++;
        }
        
        return reversedArray;
    }
    
    public static int getDaysBelowAverage(double[] stockPrices, double average) {
        int daysBelowAverage = 0;
        
        // for each loop - stockPrice of stockPrices
        for (double stockPrice : stockPrices) {
            // if current stockPrice is less than average, increment counter;
            if (stockPrice < average) {
                daysBelowAverage++;
            }
        }
        
        return daysBelowAverage;
    }
    
    public static double getAverage(double[] numberArray) {
        double sum = 0;
        // loop over array using foreach
        for (double number : numberArray) {
            // add each number in the array to the sum
            sum += number;
        }
        
        // Get the average of the array
        return sum / numberArray.length;
    }
    
        public static double getAverage(int[] numberArray) {
        double sum = 0;
        // loop over array using foreach
        for (double number : numberArray) {
            // add each number in the array to the sum
            sum += number;
        }
        
        // Get the average of the array
        return sum / numberArray.length;
    }
    
    public static int getMaxValue(int[] array) {
        int maxValue = 0;
        
        // loop over the array
        for (int i = 0; i < array.length; i++) {
            // on first iteration
            if (i == 0) {
                maxValue = array[i];
            // assign minValue of current index is less than current minValue
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    
    public static double getMaxValue(double[] array) {
        double maxValue = 0;
        
        // loop over the array
        for (int i = 0; i < array.length; i++) {
            // on first iteration
            if (i == 0) {
                maxValue = array[i];
            // assign minValue of current index is less than current minValue
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
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
    
    public static double getMinValue(double[] array) {
        double minValue = 0;
        
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
    
    public static int getMaxIndex(int[] array) {
        int maxValue = getMaxValue(array); // get the minimum value
        int maxIndex = -1;
        
        // loop over the array
        for (int i = 0; i < array.length; i++) {
            // if minValue equals the current index, assign minIndex then break out of loop
            if (maxValue == array[i]) {
                maxIndex = i;
                break;
            }
        }
        
        return maxIndex;
    }
    
    public static int getMinIndex(int[] arr) {
        int minValue = getMinValue(arr);
        int minIndex = -1;
        
        // loop over the array
        for (int i = 0; i < arr.length; i++) {
            // if minValue equals the current index, assign minIndex then break out of loop
            if (minValue == arr[i]) {
                minIndex = i;
                break;
            }
        }
        
        return minIndex;
    }
    
    
}
