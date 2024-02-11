/*
 * Lab 4.1 (If Statements)
 * Directions:
 *    Write a program whose inputs are three integers, and whose output is the smallest of the three values
 * 
 * Ex: If the input is:
 *    7 15 3
 * The output is: 
 *    3
 */

import java.util.Scanner;

public class LabProgram_5 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int first_num = scnr.nextInt();
      int second_num = scnr.nextInt();
      int last_num = scnr.nextInt();

      if((first_num < second_num) && (first_num < last_num))
      {
         System.out.println(first_num);
      }
      else if((second_num < last_num) && (second_num < first_num))
      {
         System.out.println(second_num);
      }
      else
      {
         System.out.println(last_num);
      }

   }
}
