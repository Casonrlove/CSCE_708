/*
 * 3. (Loop): Sum Even
 * Directions: 
 *    Given an integer, return the sum of all the odd numbers starting from 1. 
 *    Assume the input will always be greater than 2.
 * 
 * Ex: If the input is:
 *    20
 * The output is (sum of 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19):
 *    100
 */


import java.util.Scanner;

public class LabProgram1_3 {
   
   public static void main(String[] args) {
      
      //----------TAKE INPUTS----------//
      Scanner scnr = new Scanner(System.in);
      int input_number = scnr.nextInt();

      //----------LOOP TO FIND SUM----------//
      int sum = 0;
      int i = 0;
      for(; i < input_number; i++)
      {
         if((i%2) != 0)
         {
            sum += i;
         }
         
      }
      if((i%2) != 0)
      {
         sum += i;
      }
      System.out.println(sum);
   }
}
