/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase1_program;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import static javax.management.Query.gt;

/**
 *
 * @author baptistad
 */
public class ArraysAdd {
    
    
    public static void main (String []args){
    
    int arr [] =   {1,2,3,4,5};
     
      
     
        String[] array = { "G", "e", "e", "k", "s" };
  
        // Iterate over the Stream with indices
        IntStream
  
            // Get the Stream from the array
            .range(0, array.length)
  
            // Map each elements of the stream
            // with an index associated with it
            .mapToObj(index -> String.format("%d -> %s", 
                                       index, array[index]))
  
            // Print the elements with indices
            .forEach(System.out::println);
        
    }
    
}

