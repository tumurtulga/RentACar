/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author deece
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        
        String cars = in.readLine();
        String[] data;
        
        RentACarInterface rentACar = new RentACar();
        while(cars != null) { //When cars is not equal to 0, so it is equal to something else or 1, it runs 
            data = cars.split(":");
            System.out.println(cars); //print a text of the text file.
            cars = in.readLine(); //reads line by line until it finishes
            
         
            
            
            
        }
        
        return rentACar; //return as a rentACar class
        
    }
            
    }
    
    
