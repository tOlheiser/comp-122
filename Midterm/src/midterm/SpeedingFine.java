/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author Owner
 */
import java.util.Scanner;

public class SpeedingFine {
    
    public static void main(String[] args) {
        // initialize scanner & variables
        Scanner input = new Scanner(System.in);
        int vehicleSpeed;
        int speedingFine = 0;
        int constructionZone;
        int speedLimit;
        int amountOverLimit;
        
        // Prompt for information
        System.out.print("What was the speed of your vehicle? ");
        vehicleSpeed = input.nextInt();
        System.out.print("What was the posted speed limit? ");
        speedLimit = input.nextInt();
        System.out.print("Did the offense take place in a construction zone? Enter 1 for yes, 0 for no: ");
        constructionZone = input.nextInt();
        
        // Get the amount speed over the limit
        amountOverLimit = vehicleSpeed - speedLimit;
        
        // return the current speeding fine
        speedingFine = Methods.CalculateSpeedingTicket(amountOverLimit);
        
        // double the fine if speed limit is 40
        if (speedLimit == 40) {
            speedingFine *= 2;
        }
        
        // double the fine if the offense took place in a construction zone.
        if (constructionZone == 1) {
            speedingFine *= 2;
        }
        
        // Output data
        if (speedingFine > 260) {
            System.out.println("Warning, dangerous driving");
        }
        
        if (amountOverLimit > 30) {
            System.out.println("Criminal offence, the court subpoena is issued");
        }
        
        System.out.printf("Speed: %d\n", vehicleSpeed);
        System.out.printf("Limit: %d\n", speedLimit);
        System.out.printf("Fine: %d\n", speedingFine);
    }
}
