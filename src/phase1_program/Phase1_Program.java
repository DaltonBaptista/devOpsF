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
public class Phase1_Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String h = "Welcome to core java phase ";
        
        System.out.println("Before the StringBuilder: "+h);
        StringBuilder sb = new StringBuilder(h);
        
        sb.replace(16, 20, "python");
        sb.append("day 2 class");
       // sb.reverse();
        
        System.out.println(sb);
        
        
    }
    
}
