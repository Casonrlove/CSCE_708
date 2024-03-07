/*
 * 5.(Array): twoxthree
 * Directions: 
 *    Create an array of 6 ints, return the product of the second and third elements in the array.
 * 
 * Ex: If the input is:
 *     1 2 3 4 5 6
 * The output is:
 *    6
 * 
 * Ex: If the input is:
 *    8 9 3 4 1 2
 * The output is:
 *    27
 */

import java.util.Scanner;

public class LabProgram3_5 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int[] array = new int[5];
      boolean bool = false;

      for (int i = 0; i < 5; i++) 
      {
         array[i] = scnr.nextInt();
      }

      System.out.println(array[1]*array[2]);
   }
}
