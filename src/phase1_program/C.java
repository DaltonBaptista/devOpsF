/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase1_program;

/**
 *
 * @author baptistad
 */
public class C extends B {
    
    
    
    public void display(){
     A zz = new A("Dalton", 1, 10);
     
        System.out.println(zz.getAge() +" "+zz.getName() +" "+zz.getSSID());
    
    }
    
    public String details (){
        setAddress("Matola");
        setContactN(849903515);
    String c =""+getAddress()+" "+getContactN();
    
    
    return c;
    }
}
