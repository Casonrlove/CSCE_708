/*
 * 3.(Loop): Divisible by 4 & 7
 * Directions: 
 *    Given an integer, return a list of all values that are divisible by 4 or 7, 
 *    but not those divisible by 8. Assume the input will always be greater than 7.
 * 
 * Ex: If the input is:
 *    20 
 * The output is:
 *    4 7 12 14 20
 */

import java.util.Scanner;

public class LabProgram2_3 {
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int num = scnr.nextInt();
      String output_string = "";

      for (int i = 1; i <= num; i++) 
      {
         if ( (((i%4) == 0) || (i%7) == 0) && ((i%8) != 0))
         {
            output_string += i;
            output_string += " ";
         } 
      }
      System.out.println(output_string);
   }
}
