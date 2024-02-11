/*
 * Lab 4.2 (Nested If Statements)
 * Directions:
 *    A year in the modern Gregorian Calendar consists of 365 days. In reality, the earth takes longer to rotate around the sun. 
 *    To account for the difference in time, every 4 years, a leap year takes place. A leap year is when a year has 366 days: An extra day, February 29th. 
 *    The requirements for a given leap year are:
 *       1) The year must be divisible by 4
 *       2) If the year is a century year (1700, 1800, etc.), the year must be evenly divisible by 400
 *    Some example leap years are 1600, 1712, 2016.
 *    Write a program that takes in a year and determines whether that year is a leap year.
 * 
 * Ex: If the input:
 *    1712
 * The output is:
 *    1712 - leap year
 * 
 * Ex: If the input is: 
 *    1913
 * The output is: 
 *    1913 - not a leap year
 */

import java.util.Scanner;

public class LabProgram_6 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      boolean isLeapYear;
      
      isLeapYear = false;
      inputYear = scnr.nextInt();

      // -------------------------------------------------- //
      //---------- CHECK STATEMENTS ----------//
      if(((inputYear % 4) == 0 && (inputYear % 100 !=0)) || (inputYear % 400 == 0)) //either its div by 4 and not a century year or its div by 400 for century year
      {
         isLeapYear = true; //change bool to true
      }
      //dont need else since leapyear was initialized to false //

      // -------------------------------------------------- //
      //---------- PRINT STATEMENTS ----------//
      if(isLeapYear)
      {
         System.out.println(inputYear + " - leap year");
      }
      else
      {
         System.out.println(inputYear + " - not a leap year");
      }
      
      
   }
}
