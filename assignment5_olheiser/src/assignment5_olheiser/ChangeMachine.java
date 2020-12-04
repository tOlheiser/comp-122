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
    private int loonies;
    private int toonies;
    private boolean status;
    
    // Declare Constructor
    public ChangeMachine(int loonies, int toonies) {
        this.loonies = loonies;
        this.toonies = toonies;
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
        if (loonies < 0) {
            System.out.println("You cannot have a negative number of coins!");
        } else {
            this.loonies += loonies;
        }
        
        checkStatus();
        
        this.loonies = loonies;
    }
    
    public void setToonies(int toonies) {
        if (toonies < 0) {
            System.out.println("You cannot have a negative number of coins!");
        } else {
            this.toonies += toonies;
        }
        
        checkStatus();
        
        this.toonies = toonies;
    }
    
    private void setStatus(boolean status) {
        this.status = status;
    } 
    
    // Declare Class Methods
    public void acceptMoney(int amount) {
        
    }
    
    public void checkStatus() {
        if (getToonies() < 10 || getLoonies() < 1) {
            setStatus(true);
        } else {
            setStatus(false);
        }
    }
    
    private void makeChange(int amount) {
        
    }
    
} // End ChangeMachine Class
