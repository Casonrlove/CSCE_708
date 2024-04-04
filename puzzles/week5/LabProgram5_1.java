/*
 * 1.(String): Start Middle End
 * Directions: 
 *    Given 3 strings with at least 2 characters each, print out a string that takes the first letter of the first string, 
 *    takes the last and second to last character of the second string, and the last character of the last string, 
 *    and concatenate them together.
 * 
 * Ex: If the input is:
 *    bumble bee buzz
 * The output is:
 *    beez
 * 
 * Ex: If the input is:
 *    apple juice box
 * The output is:
 *    acex
 * 
 * Ex: If the input is:
 *    texas a&m university
 * The output is:
 *    t&my
 */

import java.util.Scanner;

public class LabProgram5_1 {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      String input = scnr.nextLine();
      String[] words = input.split("\\s+");

      String output_string = "";

      output_string += words[0].charAt(0);
      output_string += words[1].charAt(words[1].length() - 2);
      output_string += words[1].charAt(words[1].length() - 1);
      output_string += words[2].charAt(words[2].length() - 1);

      System.out.println(output_string);
   }
}
