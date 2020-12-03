/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5_olheiser;

/**
 *
 * @author Owner
 */
public class Account {
    // initialize instance variables
    private static int numberOfAccounts;
    private int id;
    private double balance;
    private double annualInterestRate;
    
    // Default constructor
    public Account() { }
    
    // Declaring the Constructor
    public Account(double balance, double annualInterestRate) {
        /* this refers to the instance variables of the class
        assigning the values passed into the constructor to the corresponding
        instance variables in the new instance of the object */
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    
    // Declaring the Getter methods
    public int getId() {
        return this.id;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    } 
    
    // Declare the Setter methods
    public void setId(int id) {
        
    }
    
    public void setBalance(double balance) {
        
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        
    }
    
    // Declare class methods
    public double getMonthlyInterestRate() {
        return 0;
    }
    
    public void withdraw(double amount) {
        
    }
    
    public void deposit(double amount) {
        
    }
    
    public static int getNumberOfAccounts() {
        return 0;
    }
    
    public void transfer(double amount, Account otherAccount) {
        
    }
    
} // end of class declaration
