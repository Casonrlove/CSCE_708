/*
 * 1. (String) Swap, No Tail
 * Directions: 
 *    Given 2 strings, return their concatenation, except remove the last character of 
 *    each and swap the order of the inputted words. The strings will be at least length 3.
 * 
 * Ex: If the input is:
 *    bird penguin
 * The output is:
 *    penguibir
 * 
 * Ex: If the input is:
 * 	loving csce
 * The output is:
 * 	csclovin
 */

import java.util.Scanner;

public class LabProgram1_1 {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      //----------TAKE INPUTS----------//
      String in1 = scnr.next();
      String in2 = scnr.next();

      //----------REMOVE LAST CHAR----------//
      in1 = in1.substring(0, in1.length() - 1);
      in2 = in2.substring(0, in2.length() - 1);

      //----------FLIP + PRINT----------//
      String output = in2 + in1;
      System.out.println(output);
      
   }
}
