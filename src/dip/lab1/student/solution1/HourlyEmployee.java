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
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double ttlHoursForYear;
    
    public HourlyEmployee(double hourlyRate, double ttlHoursForYear) {
        setHourlyRate(hourlyRate);
        setTtlHoursForYear(ttlHoursForYear);
    }
    
    public double getAnnualWages() {
    return hourlyRate * ttlHoursForYear;
}
    

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0 || hourlyRate > 400){
            System.out.println("Invalid amount for hourly rate of pay");
        }
        else {
        this.hourlyRate = hourlyRate;
        }
    }

    public double getTtlHoursForYear() {
        return ttlHoursForYear;
    }

    public void setTtlHoursForYear(double ttlHoursForYear) {
        if (ttlHoursForYear < 0 || ttlHoursForYear > 4500)
            System.out.println("Invalid amount for hours worked.");
        else {
            this.ttlHoursForYear = ttlHoursForYear;
        }
    }
    
    
    
}
