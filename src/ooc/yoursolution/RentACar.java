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
    
    ArrayList<RentACar> cars;
    
    public RentACar(){
        cars = new ArrayList<>();
    }
    
    public void addCars(RentACar car) {
        this.cars.add(car);
    }
    
    public Collection<String> listCars() {
        
        ArrayList<String> Makes = new ArrayList<>();
        
        for (RentACar item : cars){
            Makes.add(item.getMake());
        }
        
        return Makes;
    }

    public RentACar getCars(String Makes) {
        for(RentACar item : cars){
            if(item.getMake().equalsIgnoreCase(Makes)){
                return item;
            }
        }
        return null;
    }

    @Override
    public List<CarInterface> getCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
