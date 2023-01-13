/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.jav.test;

/**
 *
 * @author baptistad
 */
public class Overloading {
     int a = 0;
     int b = 0;
     float pi =0;
     int cons =2;
    public Overloading(){
    
    };
    
    
    public int calculate(int a, int b){
    
    int c = 0;
     c = a+b;
    
    return c;
    };
    
    public float calculate(float pi, int b){
    
     float c = 0;
     c = pi*(b*b);
    
    return c;
    };
    
     public int calculate(int b, int h, int cons){
    
     int c = 0;
     c = (b*h)/cons;
    
    return c;
    };
}
