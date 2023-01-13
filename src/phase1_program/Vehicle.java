/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase1_program;

import com.sun.javafx.geom.Vec2d;

/**
 *
 * @author baptistad
 */
abstract class Vehicle {
    int speed ;
    long distance;
   

    public Vehicle() {
    }
    

    public Vehicle(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
    }
    
    
     public void fuel(int fuel){
      
         fuel +=fuel;
     }
     
    
     public void fuel(char fuel, String c){
      
         fuel +=fuel;
     }
       
    /**
     *
     * @param fuel
     * @param c
     */
     public void fuel(char fuel, int c){
      
         fuel +=fuel;
     }
     
    abstract void run();
    abstract void stop();
    
    
    
       
      
}

