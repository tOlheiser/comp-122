/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermmethods;

/**
 *
 * @author Owner
 */
public class MidtermMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int SpeedingTicket(int overLimit) {
        int speedingFine;

        // calculate for the first 20km over
        overLimit -= 20;
        if (overLimit >= 0) {
            speedingFine = 75 + 3 * 20;
        } else {
            return speedingFine = (20 + overLimit) * 3 + 75;
        }
        
        // calculate the next 20km over
        overLimit -= 20;
        if (overLimit >= 0) {
            speedingFine += 6 * 20;
        } else {
            return speedingFine += (20 + overLimit) * 6;
        }
        
       // calculate the next 20km over
        if (overLimit >= 0) {
            return speedingFine += 9 * overLimit;
        }
        
        return speedingFine;
    }
    
}
