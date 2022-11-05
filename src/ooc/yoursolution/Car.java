/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author deece
 */
public class Car implements CarInterface {

    ArrayList<Make> makes;
    private double rate;
    private int availability;
    private int Id;
    Map<Month, boolean[]> createAvailability;
    
    public Car(){
        makes = new ArrayList<>();
    }

    @Override
    public Map<Month, boolean[]> createAvailability() {
        
        return createAvailability();
    }

    @Override
    public Make getMake() {
        
        ArrayList<String> titles = new ArrayList<>();
        
        for (Make mk : makes) {
            titles.addAll(titles);
            return mk;
        }
        return null;
        
    }

    @Override
    public void setMake(Make cars) {
        this.makes.add(cars);
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        return null;
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        return false;
    }

    @Override
    public boolean book(Month month, int day) {
        return false;
    }
       
}
