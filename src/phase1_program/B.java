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
public class B extends A {
    
    private int contactN;
    private String [] arr = new String [6];
    private String address;
    
    public B (){}

    public int getContactN() {
        return contactN;
    }

    public void setContactN(int contactN) {
        this.contactN = contactN;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
