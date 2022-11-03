/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author deece
 */
public class Car implements CarInterface {
    
    private String Make;
    private int Rate;
    private int Availability;
    private int Id;
   

    @Override
    public Map<Month, boolean[]> createAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Make getMake() {
        return 
    }

    @Override
    public void setMake(Make make) {
        this.Make = Make;
    }

    @Override
    public double getRate() {
        return
    }

    @Override
    public void setRate(double rate) {
        this.Rate = Rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        return null;
        
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        this.
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public String toString() {
        return "Port_hire{" + "ID=" + Id + ", Make=" + Make + Rate + ", per day=" + ", there are=" + Availability + ", of them=" + '}' + "\n";
    }

    
 
    
}
