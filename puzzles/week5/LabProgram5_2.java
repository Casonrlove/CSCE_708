/*
 * 2.(String): First Second Second First
 * Directions: 
 *    Given 2 strings of even lengths, take the combination of the first half of the second string 
 *    and the second half of the first string, and the first half of the first string 
 *    and the second half of the second string.
 * 
 * Ex: If the input is:
 *    bumble buzz
 * The output is:
 *    buble bumzz
 * 
 * Ex: If the input is: 
 *    orange strawberry
 * The output is:
 *    strawnge oraberry
 * 
 * Ex: If the input is:
 *    waffle stroop
 * The output is:
 *    strfle wafoop
 */

import java.util.Scanner;

public class LabProgram5_2 {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      String input = scnr.nextLine();
      String[] words = input.split("\\s+");
      int length = words[0].length();

      String output_string = "";

      for (int i = 0; i < words[0].length(); i++)
      {
         if( i < (words[1].length()/2))
         {
            output_string += words[1].charAt(i);
         }
         else
         {
            output_string += words[0].charAt(i);
         }
      }
      output_string += " ";
      for (int i = 0; i < length; i++)
      {
         if( i < (length/2))
         {
            output_string += words[0].charAt(i);
         }
         else
         {
            output_string += words[1].charAt(i);
         }
      }
      System.out.println(output_string);
   }
}
