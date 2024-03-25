/*
* Lab 11.1 (Methods/Arrays/Loops/If)
* Directions:
* Define a method named getWordFrequency that takes an array of strings, the
size of the array,
* and a currWord word as parameters. Method getWordFrequency() then returns the
number of occurrences
* of the currWord word in the array parameter (case insensitive).
* Then, write a main program that reads a list of words into an array, calls
method getWordFrequency() repeatedly,
* and outputs the words in the array with their frequencies. The input begins
with an integer indicating
* the number of words that follow. Assume that the list will always contain
less than 20 words.
*
* Ex: If the input is:
* 5 hey Hi Mark hi mark
* The output is:
* hey 1
* Hi 2
* Mark 2
* hi 2
* mark 2
*
* Hint: Use the equalsIgnoreCase() method for comparing strings, ignoring case.
* The program must define and call a method:
* public static int getWordFrequency(String[] wordsList, int listSize, String
currWord)
*/

import java.util.Scanner;

public class LabProgram_15 {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int listSize = scnr.nextInt();
      String[] array_strings = new String[listSize];
      for(int i = 0; i < listSize; i++){
         array_strings[i] = scnr.next();
      }
      for(String word : array_strings){
         int count = getWordFrequency(array_strings, listSize, word);
         System.out.println(word + " " + count);
      }
      

   }

   public static int getWordFrequency(String[] array_strings, int listSize, String currWord){
      int count = 0;
      for(int i = 0; i < listSize; i++){
         if(currWord.equalsIgnoreCase(array_strings[i])){
            count+=1;
         }
      }

      return count;
   }
}
