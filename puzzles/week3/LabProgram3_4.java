/*
 * 4.(Array): Invalid 6
 * Directions: 
 *    Create an array of 5 integers. We’ll say that a 6 immediately followed by another 6 is an “invalid” 6. 
 *    Return false if the given array does not contain an invalid 6.
 * 
 * Ex: If the input is:
 *    2 3 4 5 6
 * The output is:
 *    false
 * 
 * Ex: If the input is:
 *    2 6 6 7 2
 * The output is:
 *    true
 */

import java.util.Scanner;

public class LabProgram3_4 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int[] array = new int[5];
      boolean bool = false;

      for (int i = 0; i < 5; i++) 
      {
         array[i] = scnr.nextInt();
      }

      for (int i = 0; i < 5; i++)
      {
         if(i!= 0)
         {
            if((array[i-1] == 6) && (array[i] == 6))
            {
               bool = true;
            }
         }
      }
      System.out.println(bool);
   }
}
