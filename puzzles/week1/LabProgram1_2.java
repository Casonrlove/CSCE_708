/*
 * 2. (String): Rotate 3
 * Directions: 
 *    Given 1 string, return a rotated by 4 version where the first 4 letters are moved to the end. 
 *    The strings will be at least length 3.
 * 
 * Ex: If the input is:
 *    penguin
 * The output is:
 *    uinpeng
 * 
 * Ex: If the input is:
 *    cats
 * The output is:
 *    cats
 */

import java.util.Scanner;

public class LabProgram1_2 {
   
   public static void main(String[] args) {
      
      //----------TAKE INPUTS----------//
      Scanner scnr = new Scanner(System.in);
      String in = scnr.next();

      //----------CHECK < 4----------//
      if(in.length() < 4)
      {
         System.out.println(in);
         System.exit(0);
      }

      //----------MANIPULATION----------//
      String str2 = in.substring(0,4);

      //----------REMOVE FIRST 4----------//
      in = in.substring(4, in.length());

      //----------PRINT OUT----------//
      String output = in + str2;
      System.out.println(output);
   }
}
