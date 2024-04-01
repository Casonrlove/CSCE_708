/*
 * 1.(String): Single Double Vowel Consonant
 * Directions: 
 *    Print whether the first 2 letters are vowels, first 2 letters are consonants, only the first letter 
 *    (out of the first 2 letters) is a vowel, OR only the first letter (out of the first letters) is a consonant. 
 *    (Note: "a", "e", "i", "o", "u", "y" are considered vowels).
 * 
 * Ex: If the input is:
 *    Howdy
 * The output is:
 *    consonant
 * 
 * Ex: If the input is:
 *    elephant
 * The output is:
 *    vowel
 * 
 * Ex: If the input is:
 *    brochure
 * The output is:
 *    consonants
 * 
 * Ex: If the input is:
 *    AUSTIN
 * The output is:
 *    vowels
 */

import java.util.Scanner;

public class LabProgram4_1 {
   
   public static void main(String[] args) {
      
      /* TAKE INPUT */
      Scanner scnr = new Scanner(System.in);
      String word = scnr.nextLine();

      /* OUTPUT */
      if (  (isvowel(word.charAt(0)) && isvowel(word.charAt(1))) ||
            (isvowel(word.charAt(0)) && isvowel(word.charAt(2))) ||
            (isvowel(word.charAt(1)) && isvowel(word.charAt(2))) ) {
<<<<<<< HEAD
               System.out.println("vowels");
=======
               System.out.println("vowel");
>>>>>>> 319acab94a257e986ac78da203669d462b67bd7e
         
      } else {
         System.out.println("consonant");
      }
   }

   public static boolean isvowel(char c)
   {
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' ||
         c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y')
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
