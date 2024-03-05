/*
 * 1.(String): Mid 5
 * Directions: 
 *    Given a string that has an odd length, return the middle three letters. 
 *    The strings will be at least length 5.
 * 
 * Ex: If the input is:
 *    penguin
 * The output is:
 *    ngu
 * 
 * Ex: If the input is:
 *    debugging
 * The output is: 
 *    ugg
 * 
 * Ex: If the input is:
 *    dog 
 * The output is:
 *    dog
 */

import java.util.Scanner;

public class LabProgram2_1 {
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String user_string = scnr.nextLine();

      int middle = user_string.length()  / 2;
      // System.out.println(user_string.charAt(0));
      // System.out.println("middle is " + middle);

      System.out.print(user_string.charAt(middle-1));
      System.out.print(user_string.charAt(middle));
      System.out.print(user_string.charAt(middle+1));

      System.out.println();

      // System.out.println(user_string.charAt(middle-1) + user_string.charAt(middle) + user_string.charAt(middle+1));
   }
}
