/*
 * Lab 6.2 (Creating Methods)
 * Directions:
 *    Write a program that takes in an integer as the number of sides of a dice. 
 *    Then using a method called dice() randomly roll a dice with the number of sides from the input using this equation: 
 *    (1+(int)(Math.random()*number)). Then call the method check in your main only if the number returned from the method roll 
 *    falls within 0 and the inputted number.
 * 
 * Ex: If the input is:
 *    6
 * The output is:
 *    true
 */

import java.util.Scanner;

public class LabProgram_10 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int sides = scnr.nextInt();
      int number = dice(sides);
      boolean bool_check = false;
   
   if((number> 0) && (number <= sides)){
      check(bool_check);
    }//end if 
   }
   
   public static int dice(int number){
      int min = 1;
      int max = number;
      int randomNumber = (int) (Math.random() * (max - min + 1)) + min;

      return randomNumber;
   }
   
   /* create your dice method here*/

   public static void check (boolean check){
      check = true;
      System.out.println(check);
   }//end check method 
}
