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
    private static int numberOfAccounts = 0; // counter for # of instances
    private int id;
    private double balance = 0.00;
    private double annualInterestRate;
    
    // Default constructor
    public Account() { }
    
    // Declaring the Constructor
    public Account(double balance, double annualInterestRate) {
        /* this refers to the instance variables of the class
        assigning the values passed into the constructor to the corresponding
        instance variables in the new instance of the object */
        numberOfAccounts++; // increment counter
        // Use the setter methods to assign values of the instance variables
        setId( getNumberOfAccounts() );
        setBalance(balance); 
        setAnnualInterestRate(annualInterestRate);
        
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
        this.id = id;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    // Declare class methods
    public double getMonthlyInterestRate() {
        return 0;
    }
    
    public void withdraw(double amount) {
        if (amount >= 0 && amount <= getBalance()) {
            balance -= amount;
        }
    }
    
    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        }
    }
    
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
        
    }
    
    public void transfer(double amount, Account otherAccount) {
        // must check if he has sufficient funds to transfer
        // ---> do the check at the time the transfer() is invoked
        // ---> Display appropriate message if check fails
        if (amount < 0 && amount > getBalance()) {
            return;
        }
        withdraw(amount);
        otherAccount.deposit(amount);
        
        
        // NEED TO WITHDRAW
    }
    
} // end of class declaration
