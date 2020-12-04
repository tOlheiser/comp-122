/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5_olheiser;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class TestChangeMachine {
    public static void main(String[] args) {
        //initialize scanner, change machine, and variable
        Scanner input = new Scanner(System.in);
        ChangeMachine SmallChangeMachine = new ChangeMachine(10, 20);
        int bill = 0;
        int pin = 0;
        int loonies = 0;
        int toonies = 0;
        
        // Loop that continuously prompts users for bills
        do {
            // Prompt and get user input for bill
            System.out.println("Please enter a bill: $5, $10, $20. To exit, enter 0.");
            bill = input.nextInt();
            
            // Check for the exit command
            if (bill == 0) {
                break;
            }
            
            // Accept the bill
            SmallChangeMachine.acceptMoney(bill);
            
            // update the status
            SmallChangeMachine.checkStatus();
                   
            // Output error message if status == false
            if (!SmallChangeMachine.getStatus()) {
                System.out.println("Out of order! Cannot accept any more bills. "
                        + "\nPlease call the technician to refill the machine.");
                
                // prompt and store pin input
                System.out.print("\nTechnician: Please enter the 3-digit PIN: ");
                pin = input.nextInt();
                
                // check for invalid pin
                if (pin != 333) {
                    System.out.println("Invalid PIN!");
                    break;
                }
                
                // prompt and store loonie input
                System.out.print("\nPlease enter amount of loonies added to the machine: ");
                loonies = input.nextInt();
                
                // prompt and store toonie input
                System.out.print("\nPlease enter amount of toonies added to the machine: ");
                toonies = input.nextInt();
                
                // refill the machine
                SmallChangeMachine.refillChange(loonies, toonies);
            }
        } while (bill != 0);
    }
}
