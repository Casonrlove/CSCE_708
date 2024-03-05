/*
 * 2.(String): Bye Bye Letters
 * Directions: 
 *    Given a string and value s, return a string of the characters before the sth 
 *    position AND after the sth position from the end. The strings will be at 
 *    least length s.
 * 
 * Ex: If the input is:
 *    penguin 2
 * The output is:
 *    pein
 * 
 * Ex: If the input is:
 *    powerbowl 3
 * The output is:
 *    powowl 
 * 
 * Ex: If the input is:
 *    cat 1
 * The output is:
 *    ct
 */

import java.util.Scanner;

public class LabProgram2_2 {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      String word = scnr.next();
      int number = scnr.nextInt();

      // System.out.println(word);
      // System.out.println(number);

      if (number > word.length())
      {
         return;       
      }
      String output_string = "";

      for (int i = 0; i < word.length(); i++) 
      {
         if(i < number)
         {
            // System.out.println("in here1");
            output_string += word.charAt(i);
         }   
         // if(i >= (word.length() - number))
         // {
         //    System.out.println("in here2");
         //    output_string += word.charAt(i);
         // }
         // System.out.println(output_string);
      }
      for (int i = 0; i < word.length(); i++) 
      {
         if(i >= (word.length() - number))
         {
            // System.out.println("in here1");
            output_string += word.charAt(i);
         } 
         // System.out.println(output_string);
      }
      System.out.println(output_string);
   }
}
