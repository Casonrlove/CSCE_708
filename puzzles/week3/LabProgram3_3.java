/*
 * 3.(Loop): Sandwich Loop
 * Directions: 
 *    Given an integer greater than 1, print the odd numbers in decreasing order (till 0) 
 *    and then even in increasing order (starting from zero).
 * 
 * Ex: If the input is:
 *    7
 * The output is:
 *    7 5 3 1 0 2 4 6
 * 
 * Ex: If the input is:
 *    2
 * The output is:
 *    1 0 2
 */

import java.util.Scanner;

public class LabProgram3_3 {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);

      int num = scnr.nextInt();
      String output_string = "";

      for (int i = num; i > 0; i--)
      {
         if((i%2) != 0)
         {
            output_string += i;
            output_string += " ";
         }
      }
      for (int i = 0; i <= num; i++)
      {
         if((i%2) == 0)
         {
            output_string += i;
            output_string += " ";
         }
      }
      System.out.println(output_string);
   }
}
