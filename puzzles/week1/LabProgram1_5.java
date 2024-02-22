/*
 * 5. (Array): outside
 * Directions:
 *    Create an array for 5 integers. Return the two outer elements of the array in reverse order.
 * 
 * Ex: If the input is:
 *    1 2 3 4 5
 * The output is:
 *    5 1
 * 
 * Ex: If the input is is:
 *    1 1 1 1 1 1 
 * The output is:
 *    1 1
 */

import java.util.Scanner;

public class LabProgram1_5 {
   public static void main(String[] args) {
      
      //----------TAKE INPUTS----------//
      Scanner scnr = new Scanner(System.in);
      int [] the_array = new int[5];

      for(int i = 0; i < 5; i++)
      {
         the_array[i] = scnr.nextInt();
      }
      System.out.print(the_array[4] + " " + the_array[0]);
   }
}
