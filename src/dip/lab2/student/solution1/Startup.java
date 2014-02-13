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
        
        TipCalculator one = new BaggageServiceTipCalculator(ServiceQuality.FAIR, 4);
        TipCalculator two = new FoodServiceTipCalculator(ServiceQuality.GOOD, 25.00);
    
        TipCalculator[] tips = {one, two};
        
        ServiceTipCalculator st = new ServiceTipCalculator();
        
        System.out.println("Baggage Tip amount: " + st.getTotalTip(tips[0]));
        System.out.println("Food Service Tip Amount: " + st.getTotalTip(tips[1]));
        
        for(int i=0; i < tips.length; i++) {
            System.out.println("Tip Number " + (i+1) + " tip amount:" +
            st.getTotalTip(tips[i]));
        }
    
    
    }
}
