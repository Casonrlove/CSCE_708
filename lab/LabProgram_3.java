/*
 * Lab 3.1 (Calculating with Inputs)
 * Directions:
 *    Write a program using integers userNum and divNum as input, and output userNum divided by divNum three times. 
 *    Note: End with a newline.
 * 
 * Ex: If the input is
 *    2000 2
 * The output is:
 *    1000 500 250
 * 
 * Note: In Java, integer division discards fractions. Ex: 6 / 4 is 1 (the 0.5 is discarded).
 */

import java.util.Scanner;

public class LabProgram_3 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      //System.out.print("Please input your name: ");
      int userNum = scnr.nextInt();
      int divNum = scnr.nextInt();

      
      System.out.println((userNum / divNum) + " " + (userNum / (divNum*divNum)) + " " + (userNum / (divNum*divNum*divNum)));
   }
}
