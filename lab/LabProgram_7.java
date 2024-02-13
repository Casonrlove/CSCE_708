/*
 * Lab 5.1 (Loops)
 * Directions:
 *    Write a program that removes all non alpha characters from the given input.
 * 
 * Ex: If the input is:
 *    -Hello, 1 world$!
 * The output is:
 *    Helloworld
 */

import java.util.Scanner;

public class LabProgram_7 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input = scnr.nextLine();
      String second_string = "";

      for(int i = 0; i < input.length(); i++)
      {
         if(Character.isLetter(input.charAt(i)) == true)
         {
            second_string += input.charAt(i);
         }
      }
      System.out.println(second_string);
   }
}
