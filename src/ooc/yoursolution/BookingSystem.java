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
        
        BookingSystem book = new BookingSystem();
        
        String Makes = in.readLine();
        String 
        
        while(Makes)
        
        
    }

//    @Override
//    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
//        
//        String title = in.readLine();
//        String content = "";
//        
//        BookingSystem book = new BookingSystem();
//        
//        while(title != null){
//            //System.out.println(title);
//            content = in.readLine();
//            //System.out.println(content);
//            
//            RentACar cars = new RentACar(cars);
//            book.addMake(cars);
//            
//            title = in.readLine();
//        }
//
//        
//        return book;
    }
    
}
