/*
 * 1.(String): First Last W
 * Directions: 
 *    Given a string, remove all the letters "s". Otherwise return the unchanged string.
 * 
 * Ex: If the input is:
 *    howdyw
 * The output is:
 *    howdyw
 * 
 * Ex: If the input is:
 *    shanle
 * The output is:
 *    hanle
 * 
 * Ex: If the input is:
 *    dresses
 * The output is:
 *    dree
 */

import java.util.Scanner;

public class LabProgram3_1 {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);

      String input = scnr.nextLine();
      String output_string = "";

      for (int i = 0; i < input.length(); i++)
      {
         if(input.charAt(i) != 's')
         {
            output_string += input.charAt(i);
         }
      }
      System.out.println(output_string);
   }
}
