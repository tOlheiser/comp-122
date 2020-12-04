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
public class ChangeMachine {
    // declare instance variables
    private int loonies = 0;
    private int toonies = 0;
    private boolean status;
    
    // Declare Constructor
    public ChangeMachine(int loonies, int toonies) {
        setLoonies(loonies);
        setToonies(toonies);
        checkStatus();
    }
    
    // Declare Getter methods
    public int getLoonies() {
        return this.loonies;
    }
    
    public int getToonies() {
        return this.toonies;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    // Declare Setter Methods
    public void setLoonies(int loonies) {
        // check for a negative value
        if (loonies < 0) {
            System.out.println("\nYou cannot have a negative number of coins!");
        // add & assign
        } else {
            this.loonies += loonies;
        }
        
        // update the status
        checkStatus();
    }
    
    public void setToonies(int toonies) {
        // check for a negative value
        if (toonies < 0) {
            System.out.println("\nYou cannot have a negative number of coins!");
        // add & assign
        } else {
            this.toonies += toonies;
        }
        
        // update the status
        checkStatus();
    }
    
    private void setStatus(boolean status) {
        this.status = status;
    } 
    
    // Declare Class Methods
    public void acceptMoney(int amount) {
        // ensure you have the most current status
        checkStatus();
        
        // if the machine is working & a valid bill is entered, make change
        if ( getStatus() && (amount == 5 || amount == 10 || amount == 20) ) {
            makeChange(amount);
        // output error messages accordingly.
        } else if ( !getStatus() ) {
            System.out.println("\nOut of Order! Here is your bill back.");
        } else {
            System.out.println("\nYou must insert a $5 or $10 or $20 bill. Try again.");
        }
        
        // update status
        checkStatus();
    }
    
    public void checkStatus() {
        // if we have enough change, set to true, otherwise false.
        if (getToonies() >= 10 && getLoonies() >= 1) {
            setStatus(true);
        } else {
            setStatus(false);
        }
    }
    
    private void makeChange(int amount) {
        // subtract & assign corresponding to the amount entered.
        if (amount == 5) {
            System.out.println("\nYour change: Two toonies and one loonie.");
            loonies -= 1;
            toonies -= 2;
        } else if (amount == 10) {
            System.out.println("\nYour change: Five toonies.");
            toonies -= 5;
        } else if (amount == 20) {
            System.out.println("\nYour change: Ten toonies.");
            toonies -= 10;
        }
    }
    
    public void refillChange(int loonies, int toonies) {
        // Add change
        this.loonies += loonies;
        this.toonies += toonies;
        
        // update status
        checkStatus();
    }
    
} // End ChangeMachine Class
