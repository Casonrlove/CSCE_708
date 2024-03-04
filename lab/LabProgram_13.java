/*
* Lab 8.1 (Arrays/Loops/If)
* Directions:
* Given a sorted list of integers, output the middle integer. A negative number
indicates the end of the input
* (the negative number is not a part of the sorted list). Assume the number of
integers is always odd.
* The maximum number of list values for any test case should not exceed 10. If
exceeded, output “Too many numbers”
*
* Ex: If the Input is:
* 2 3 4 8 11 -1
* The output is:
* Middle item: 4
*
* Hint: First read data into an array. Then, based on the array’s size, find the
middle item.
*/

import java.util.Scanner;

public class LabProgram_13 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] user_values = new int[10]; // Set of data specified by the user
      int num_values = 0;
      int input_value = scnr.nextInt(); //taking the input

      while(input_value >= 0)
      {
         if(num_values >= 10)
         {
            System.out.println("Too many numbers");
            return;
         }
         user_values[num_values] = input_value;
         num_values++;
         input_value = scnr.nextInt();

      }

      int middle_num = user_values[num_values/2];
      System.out.println("Middle item: " + middle_num + "\n");

   }
}