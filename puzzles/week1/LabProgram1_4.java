/*
 * 4. (Array): flip
 * Directions: 
 *    Create an array of ints length 7, return the elements in reverse order without 
 *    the first element, so {1,2,3,4,5,6,7} becomes {7,6,5,4,3,2}
 * 
 * Ex: If input is:
 *    1 2 3 4 5 6 7
 * The output is:
 *    7 5 6 4 3 2
 * 
 * Ex: If input is:
 *    2 4 6 8 10 12 14
 * The output is:
 *    14 12 10 8 6 4
 */

import java.util.Scanner;

public class LabProgram1_4 {
   public static void main(String[] args) {

      //----------TAKE INPUTS----------//
      Scanner scnr = new Scanner(System.in);
      int [] the_array = new int[7];

      for(int i = 0; i < 7; i++)
      {
         the_array[i] = scnr.nextInt();
      }

      //----------REVERSE----------//
      int [] final_array = new int[6];
      int counter = 0;

      for(int i = 6; i > 0; i--)
      {
         final_array[counter] = the_array[i];
         counter++;
      }

      //----------PRINT OUT----------//
      for(int num: final_array)
      {
         System.out.print(num + " ");
      }
   }
}
