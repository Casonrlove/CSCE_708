/*
 * Lab 7.2 (String/Integer Arrays)
 * Directions:
 *    Write a program that reads a list of words. Then, the program outputs those words and their frequencies. 
 *    The input begins with an integer indicating the number of words that follow. 
 *    Assume that the list will always contain fewer than 20 words.
 * 
 * Ex: If the input is:
 *    5 hey hi Mark hi mark
 * The output is:
 *    hey - 1
 *    hi - 2
 *    Mark - 1
 *    hi - 2
 *    mark - 1
 * 
 * Hint: Use two arrays, one array for the strings and one array for the frequencies.
 */

import java.util.Scanner;

public class LabProgram_12 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numItems = scnr.nextInt();
      String words[] = new String[numItems];
      int count = 0;

      for(int i = 0; i < words.length; i++){
         words[i] = scnr.next();
      }

      for(String word : words){
         for(int i = 0; i < words.length; i++){
            if(words[i].equals(word)){
               count += 1;
            }
         }
         System.out.println(word + " - " + count);
         count = 0;
      }

      //for loop for the 
   }
}
