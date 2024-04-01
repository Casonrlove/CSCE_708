/*
 * 4.(Array): decreasingCheck
 * Directions: 
 *    Create an int array of inputs where the size is the first integer of the input. 
 *    Return true if the array contains, somewhere, two decreasing adjacent numbers like … 7 6 … or 11 10. 
 *    Otherwise, return false.
 * 
 * Ex: If the input is:
 *    2 1 2
 * The output is:
 *    false
 * 
 * Ex: If the input is:
 *    5 1 2 4 3 10
 * The output is:
 *    true
 * Ex: If the input is:
 *    2 10 2
 * The output is:
 *    true
 */

import java.util.Scanner;

public class LabProgram4_4 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int size = scanner.nextInt();
      int[] input = new int[size];
      
      for (int i = 0; i < size; i++)
      {
         input[i] = scanner.nextInt();
      }
      
      System.out.println( decreasingCheck(input)); //"Result: " +
      
      scanner.close();
   }

   public static boolean decreasingCheck(int[] input)
   {
      if (input.length <= 1)
      {
         return false; // cannot have decreasing adjacent numbers if array size is 1 or less
      }
      
      for (int i = 0; i < input.length - 1; i++)
      {
         if (input[i] > input[i + 1])
         {
            return true; // if any adjacent numbers are decreasing, return true
         }
      }
      
      return false; // no decreasing adjacent numbers found
   }
}
