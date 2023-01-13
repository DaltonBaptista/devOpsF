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
public class A {
    
    private String name ;
    private int age;
    private int SSID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSSID() {
        return SSID;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    public A(String name, int age, int SSID) {
        this.name = name;
        this.age = age;
        this.SSID = SSID;
    }
    
    
    public A() {
        
    }
    
    
}
