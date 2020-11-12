/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olhmethods;

/**
 *
 * @author Owner
 */
public class OlhMethods {

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
    
}
