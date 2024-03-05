/*
 * 5.(Array): compair2
 * Directions:
 *    Creating 2 int arrays, apple and orange, each length 3. Consider the product 
 *    of values in each array. Return the array which has the largest product. In 
 *    the event of a tie, return “tie”.
 * 
 * Ex: If the input is:
 *    1 2 3 4 5 6
 * The output is:
 *    4 5 6
 * 
 * Ex: If the input is:
 *    1 1 1 1 1 1
 * The output is:
 *    tie
 */

import java.util.Scanner;

public class LabProgram2_5 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int[] user_values1 = new int[3]; // Set of data specified by the user
      int[] user_values2 = new int[3]; // Set of data specified by the user

      user_values1[0] = scnr.nextInt();
      user_values1[1] = scnr.nextInt();
      user_values1[2] = scnr.nextInt();

      user_values2[0] = scnr.nextInt();
      user_values2[1] = scnr.nextInt();
      user_values2[2] = scnr.nextInt();

      String output_string = "";
      int product1 = 1;
      int product2 = 1;

      for (int i = 0; i < 3; i++) 
      {
         product1 *= user_values1[i];
      }

      for (int i = 0; i < 3; i++) 
      {
         product2 *= user_values2[i];
      }
      // System.out.println(product1);
      // System.out.println(product2);
      if (product1 > product2)
      {
         for (int i = 0; i < 3; i++) 
         {
            output_string += user_values1[i];
            output_string += " ";
         }
      } 
      else if(product1 < product2)
      {
         for (int i = 0; i < 3; i++) 
         {
            output_string += user_values2[i];
            output_string += " ";
         }
      }
      else
      {
         System.out.println("tie");
      }

      System.out.println(output_string);
   }
}

// if(user_values1[i] > product1)
//          {
//             product1 = user_values1[i];
//          }