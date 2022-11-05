/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author deece
 */
public class RentACar implements RentACarInterface {

    private Make make;
    private List<CarInterface> cars;
    private String name;
    private int NumberOfCars;
    private int Id;
    
    @Override
    public List<CarInterface> getCars() {
        return cars;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        
        this.cars = cars;
    }

    @Override
    public String getName() {
        for(Make make : Make.values()){
            
            
        }
        
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        
        return false;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        return Id;
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        return false;
    }

    @Override
    public int getNumberOfCars() {
        return NumberOfCars;
    }
    
    
    
}

