/*
 * Lab 6.1 (Calling Methods)
 * Directions:
 *    Write a program that takes the given input to create a packing list for a trip. 
 *    Call the various methods to complete the message. 
 *    Your intro will read "You have an upcoming trip! Here are the things you will need:", 
 *    you will print "You will need your wallet and phone." for every trip, 
 *    you will only print "You will need a jacket." when the trip will be cold, 
 *    and will only print "You will need a passport." when the trip is international.
 * 
 * Ex: If the input is
 *    cold
 *    international
 * The output is:
 *    You have an upcoming trip!
 *    Here are the things you will need:
 * 
 *    You will need your wallet and phone.
 *    You will need a jacket.
 *    You will need a passport.
 */

import java.util.Scanner;

public class LabProgram_9 {
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String weather = input.nextLine();
      String location = input.nextLine();
      
      introduction();
      essentials();
      //call cloths method//
      if(weather.toLowerCase().equals("cold")){
         clothes();
      }
      //call passport method//
      if(location.toLowerCase().equals("international")){
         passport();
      }

   }//end main
   
   public static void essentials(){
      System.out.println("You will need your wallet and phone.");
   }//end passport essentials
   
   public static void clothes(){
      System.out.println("You will need a jacket.");
   }//end clothes method
   
   public static void passport(){
      System.out.println("You will need a passport.");
   }//end passport method
   
   public static void introduction(){
    System.out.println("You have an upcoming trip!\nHere are the things you will need:\n");
   }//end intro method
   
}
