/*
 * Lab: 2.2 (Scanner Inputs)
 * Directions:
 *    Write a program that takes a first name as the input, and outputs a welcome message to that name.
 * 
 * Ex: If the input is:
 *    Pat
 * The output is:
 *    Hello Pat, and welcome to CS Online!
 */

import java.util.Scanner;

public class LabProgram_2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      //System.out.print("Please input your name: ");
      String userName;
   
      userName = scnr.next();
      
      System.out.println("Hello " + userName + ", and welcome to CS Online!");
   }
}

