/*
 * 4.(Loop): After vowel
 * Directions: 
 *    Given a string of unknown length (greater than 2), return a list of the 
 *    characters that follow each vowel in the string if there is a character after. 
 * 
 * Ex: If the input is:
 *    cheese
 * The output is:
 *    e s
 * 
 * Ex: If the input is:
 *    penguin
 * The output is:
 *    n i n
 * 
 * Ex: If the input is:
 *    who
 * The output is:
 *    no more vowels
 */

import java.util.Scanner;

public class LabProgram2_4 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String word = scnr.nextLine();
      String output_string = "";

      for (int i = 0; i < word.length(); i++) 
      {
         if(((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i')
         || (word.charAt(i) == 'o') || (word.charAt(i) == 'u')    || (word.charAt(i) == 'y')) & (i != word.length() -1) )
         {
            output_string += word.charAt(i+1);
            output_string += " ";
         } 
      }
      if(output_string == "")
      {
         System.out.println("no more vowels");
      }
      else
      {
         System.out.println(output_string);         
      }

   }
}
