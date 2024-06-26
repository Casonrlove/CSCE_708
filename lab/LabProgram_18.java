/*
 * Lab 12.2 (Try/Catch Blocks)
 * Directions:
 *    Given an array of 10 names, complete the main method that outputs the name specified by the array index 
 *    entered by the user. Use a try block to output the name and a catch block to catch any ArrayOutOfBoundsException. 
 *    Output the message from the exception object if an ArrayIndexOutOfBoundsException is caught. 
 *    Output the first element in the array if the index is negative or the last element if the index is 
 *    greater than the size of the array. 
 * 
 * Hint: Format the exception outputs using the getMessage() method from the exception object. 
 * Do not hard code the exception messages.
 * 
 * Ex: If the input of the program is:
 *    5
 * The program outputs:
 *    Name: Jane
 * 
 * Ex: If the inputs of the program is:
 *    12
 * The program outputs:
 *    Exception Index 12 out of bounds for length 10
 *    The closest name is: Johnny
 * 
 * Ex: If the input of the program is:
 *    -2
 * The program outputs:
 *    Exception! Index -2 out of bounds for length 10
 *    The closest name is: Ryley
 */

import java.util.Scanner;

public class LabProgram_18 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

		index = scnr.nextInt();
      try{
         System.out.println("Name: " + names[index]);
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Exception! " + e.getMessage());
         if(index < 0)
         {
            System.out.println("The closest name is: " + names[0]);
         }
         else
         {
            System.out.println("The closest name is: " + names[9]);
         }
      }
   }
}
