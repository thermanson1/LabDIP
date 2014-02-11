/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;



/**
 *
 * @author Teraesa
 */
public class Startup {
    public static void main(String[]args){
        
        TipCalculator one = new BaggageServiceTipCalculator(FAIR, 4);
        TipCalculator two = new FoodServiceTipCalculator(GOOD, 25.00);
    }
}
