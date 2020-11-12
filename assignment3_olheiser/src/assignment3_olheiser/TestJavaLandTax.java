/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_olheiser;

/**
 *
 * @author Owner
 */
import TannersMethods.MyMethods;
import java.util.Scanner;

public class TestJavaLandTax {
    public static void main(String[] args) {
        // initialize scanner & variables
        Scanner input = new Scanner(System.in);
        double generalIncome, investmentIncome, otherIncome, regularDeductions, otherDeductions;
        double taxableIncome, taxesPaid, incomeTax;
        
        System.out.print("Tax Application\n");
        
        // Prompt the user for input & capture it
        System.out.print("TELL ME YOUR INCOME: ");
        generalIncome = input.nextDouble();
        
        System.out.print("\nTELL ME YOUR INVESTMENT INCOME: ");
        investmentIncome = input.nextDouble();
        
        System.out.print("\nTELL ME YOUR OTHER INCOME: ");
        otherIncome = input.nextDouble();
        
        System.out.print("\nTELL ME YOUR REGULAR DEDUCTIONS: ");
        regularDeductions = input.nextDouble();
        
        System.out.print("\nTELL ME YOUR OTHER DEDUCTIONS: ");
        otherDeductions = input.nextDouble();
        
        System.out.print("\nENTER THE AMOUNT OF INCOME TAX YOU HAVE ALREADY PAID: ");
        taxesPaid = input.nextDouble();
        
        // Determine the value of taxableIncome and store it in a variable.
        taxableIncome = MyMethods.calculateTaxableIncome(generalIncome, investmentIncome, otherIncome, regularDeductions, otherDeductions);
        incomeTax = MyMethods.calculateIncomeTax(taxableIncome) - taxesPaid;
        
        
        // Display the results
        System.out.printf("\nYour taxable income is: $%.2f", taxableIncome);
        
        if (incomeTax > 0) {
            System.out.printf("\nIncome tax due to the Government of Javaland: $%.2f", incomeTax);
        } else {
            System.out.printf("\nYou have a return of: $%.2f", incomeTax); 
        }
    }
}
