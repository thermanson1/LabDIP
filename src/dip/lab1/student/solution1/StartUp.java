/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab1.student.solution1;

/**
 *
 * @author Teraesa
 */
public class StartUp {
    public static void main(String[]args){
        
    
     Employee one = new HourlyEmployee(15.75, 3000);
     Employee two = new SalariedEmployee(50000, 12000);
     
     Employee[] employees = {one, two};
     
     HRService hr = new HRService();
     
     for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" +
            hr.getAnnualCompensationForEmployee(employees[i]));
        }
     
     
    }
}
