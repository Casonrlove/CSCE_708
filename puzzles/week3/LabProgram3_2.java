/*
 * 2.(Loop): Remove x, y, and z
 * Directions:  
 *    Given a string of unknown length (greater than 2), return the string reversed and without the letters "x", "y", or "z"
 * 
 * Ex: If the input is:
 *    cheese
 * The output is:
 *    eseehc
 * 
 * Ex: If the input is:
 *    zebra
 * The output is:
 *    arbe
 * 
 * Ex: If the input is:
 *    yes
 * The output is:
 *    se
 */

import java.util.Scanner;

public class LabProgram3_2 {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);

      String input = scnr.nextLine();
      String output_string = "";

      for (int i = input.length() - 1; i >= 0 ; i--)
      {
         if((input.charAt(i) != 'x') && (input.charAt(i) != 'y') && (input.charAt(i) != 'z'))
         {
            output_string += input.charAt(i);
         }
      }
      System.out.println(output_string);

   }
}
