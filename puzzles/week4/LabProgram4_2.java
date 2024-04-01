/*
 * 2.(String): Start End Swap
 * Directions: 
 *    Given 3 strings with at least 2 characters each, print out the strings where the first letter of the 
 *    string swaps with the last letter of the last string, and the last character of the first string swaps 
 *    with the first character of the last string, with the middle remaining the same.
 * 
 * Ex: If the input is:
 *    bird has nest
 * The output is:
 *    tirn has desb
 * 
 * Ex: If the input is:
 *    good apple juice
 * The output is:
 *    eooj apple duicg
 * 
 * Ex: If the input is:
 *    texas am university
 * The output is:
 *    yexau am sniversitt
 */

// import java.util.Scanner;

// public class LabProgram4_2 {
   
//    public static void main(String[] args) {
      
//       Scanner scnr = new Scanner(System.in);
//       String user_input = scnr.nextLine();
//       String[] words = user_input.split("\\s+");

//       word1 = 
//    }
// }

import java.util.Scanner;

public class LabProgram4_2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      // Read the input strings
      String[] input = scanner.nextLine().split("\\s+");
      
      String first = input[0];
      String third = input[2];

      // Check if there are exactly 3 input strings
      if ( (input.length == 3)) // && (first.length() > 1) && (third.length() > 1) )
      if (input.length == 3)
      {
         String firstnew = swapFirstLast(first, third);
         String thirdnew = swapFirstLast2(first, third);
         // Print the output strings
         System.out.println(firstnew + " " + input[1] + " " + thirdnew);
      } else
      {
            System.out.println("Invalid input. Please enter exactly 3 strings.");
      }

      scanner.close();
   }
   private static String swapFirstLast(String first, String last)
   {
      String new1 = "";

      // Swap first and last characters
      for (int i = 0; i < first.length(); i++)
      {
         if(i == 0)
         {
            new1 += last.charAt(last.length()-1);
         }
         else if(i == first.length()-1)
         {
            new1 += last.charAt(0);
         }
         else
         {
            new1 += first.charAt(i);
         }
      }

      return first = new1;
   }

   private static String swapFirstLast2(String first, String last)
   {
      String new2 = "";

      for (int i = 0; i < last.length(); i++)
      {
         if(i == 0)
         {
            new2 += first.charAt(last.length()-1);
         }
         else if(i == last.length()-1)
         {
            new2 += first.charAt(0);
         }
         else
         {
            new2 += last.charAt(i);
         }
      }
      return last = new2;
   }
}
   
