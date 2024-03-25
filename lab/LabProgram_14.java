/*
 * Lab 10.1 (Arrays/Loops/If)
 * Directions:
 *    When analyzing data sets, such as data for human heights, a common step is to adjust the data. 
 *    This adjustment can be done by normalizing to values between 0 and 1, or throwing away outliers.
 *    For this program, adjust the values by dividing all values by the largest value. 
 *    The input begins with an integer indicating the number of floating-point values that follow. 
 *    Assume that the list will always contain fewer than 20 floating-point values.
 *    Output each floating-point value with 2 digits after the decimal point, which can be achieved as follows:
 *       System.out.printf(“%.2f”, yourValue);
 * 
 * Ex: If the input is:
 *    5 30.0 50.0 10.0 100.0 65.0
 * The output is:
 *    0.30 0.50 0.10 1.00 0.65
 * 
 * The 5 indicates that there are five floating-point values in the list, namely 30.0, 50.0, 10.0, 100.0, and 65.0. 
 * 100.0 is the largest value in the list, so each value is divided by 100.0.
 * 
 * For coding simplicity, follow every output value by a space, including the last one.
 */

import java.util.Scanner; 

public class LabProgram_15 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int size = scnr.nextInt();
      double[] array = new double[size];
      double largest_num = array[0];
      String output_string = "";

      for (int i = 0; i < size; i++) 
      {
         double num = scnr.nextDouble();
         array[i] = num;

         if(num > largest_num)
         {
            largest_num = num;
         }
         // System.out.println(array[i]);
      }
      // System.out.println(largest_num);
      for (int i = 0; i < size; i++) 
      {
         double numm = array[i] / largest_num;
         System.out.printf("%.2f ",numm);
         output_string += " ";

      }
      System.out.println(output_string);
   }
}
