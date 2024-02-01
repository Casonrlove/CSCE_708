package assignments;

import java.util.Scanner;

public class NameGameEx2
{
    public static void main(String[] args)
    {
        
        //-----------------------HEADER-----------------------//
        System.out.println("The name game!\n\n\n");
        System.out.println("Come on now everybody, I said lets play a game.");
        System.out.println("I bet'cha I could make a rhyme");
        System.out.println("Out of anybody's name...\n\n\n");


        //-----------------------TAKE NAME AS INPUT-----------------------//
        System.out.print("What is your name? ");
        Scanner scnr = new Scanner(System.in);
        String user_name = scnr.next();

        //-----------------------Check for inappropriate names-----------------------//
        
        
        System.out.println("The user name: " + user_name);
        //-----------------------CHECK IF MY NAME-----------------------//
        if((user_name.equals("Cason")) || (user_name.equals("cason")))
        {
            System.out.println("\nHowdy " + user_name + " thats my name too!");
        }
        else
        {
            System.out.println("\nHowdy " + user_name); 
        }
        

        //---------------------------PRINT----------------------------//
        System.out.println("\n\n\nOkay " + user_name + ", here is your rhyme:\n");


        //-----------------------SET CONDITIONS-----------------------//
        boolean first_letter_vowel      = false;
        boolean first_letter_consanant  = false;
        boolean last_letter_vowel       = false;
        boolean last_letter_consanant   = false;
        boolean is_double_consanant     = false;
        boolean is_double_vowel         = false;


        //----------FIRST LETTER----------//
        if( (user_name.charAt(0) == 'a')    ||      (user_name.charAt(0) == 'e')    ||
            (user_name.charAt(0) == 'i')    ||      (user_name.charAt(0) == 'o')    ||
            (user_name.charAt(0) == 'u')    ||      (user_name.charAt(0) == 'a')    ||
            (user_name.charAt(0) == 'A')    ||      (user_name.charAt(0) == 'E')    ||
            (user_name.charAt(0) == 'I')    ||      (user_name.charAt(0) == 'O')    ||
            (user_name.charAt(0) == 'U'))
        {
            first_letter_vowel = true;
        }
        else
        {
            first_letter_consanant = true;
        }

        //----------SECOND LETTER----------//
        if( (user_name.charAt(1) == 'a')    ||      (user_name.charAt(1) == 'e')    ||
            (user_name.charAt(1) == 'i')    ||      (user_name.charAt(1) == 'o')    ||
            (user_name.charAt(1) == 'u')    ||      (user_name.charAt(1) == 'a')    ||
            (user_name.charAt(1) == 'A')    ||      (user_name.charAt(1) == 'E')    ||
            (user_name.charAt(1) == 'I')    ||      (user_name.charAt(1) == 'O')    ||
            (user_name.charAt(1) == 'U'))
        {
            last_letter_vowel = true;
        }
        else
        {
            last_letter_consanant = true;
        }

        //--------------------CHECK FOR DOUBLES--------------------//
        if(first_letter_vowel && last_letter_vowel)
        {
            is_double_vowel = true;
        }
        else if (first_letter_consanant && last_letter_consanant)
        {
            is_double_consanant = true;
        }

        //--------------------DEBUG--------------------//
        // System.out.println("Double Vowel = " + is_double_vowel);
        // System.out.println("Double Cons = " + is_double_consanant);
        

        //--------------------CONDITION STATEMENTS--------------------//
        //----------DOUBLE CONSANTS----------//
        if(is_double_consanant)
        {
            String second_string = user_name.substring(2);
            System.out.printf(
                    "%s, %s, Bo-b%s\nBo-na-na fana Fo-f%s\nFee fi Mo-m%s, %s!\n",
                    user_name, user_name, second_string, second_string, second_string, user_name);
        }
        //----------DOUBLE VOWELS----------//
        else if(is_double_vowel)
        {
            String second_string = user_name.substring(1);
            System.out.printf(
                    "%s, %s, Bo-b%s\n" + //
                    "Bo-na-na fana Fo-f%s\n" + //
                    "Fee fi Mo-m%s, %s!",
                    user_name, user_name, second_string, second_string, second_string, user_name);
        }
        //----------B AS FIRST LETTER----------//
        else if((user_name.charAt(0) == 'B') ||(user_name.charAt(0) == 'b'))
        {
            String second_string = user_name.substring(1);
            System.out.printf(
                    "%s, %s, Bo-%s Bo-na-\n" + //
                    "na fana Fo-f%s Fee fi\n" + //
                    "Mo-m%s, %s!",
                    user_name, user_name, second_string, second_string, second_string, user_name);
        }
        //----------F AS FIRST LETTER----------//
        else if((user_name.charAt(0) == 'F') ||(user_name.charAt(0) == 'f'))
        {
            String second_string = user_name.substring(1);
            System.out.printf(
                    "%s, %s, Bo-b%s\n" + //
                    "Bo-na-na fana Fo-%s Fee\n" + //
                    "fi Mo-m%s, %s!",
                    user_name, user_name, second_string, second_string, second_string, user_name);
        }
        //----------M AS FIRST LETTER----------//
        else if((user_name.charAt(0) == 'M') ||(user_name.charAt(0) == 'm'))
        {
            String second_string = user_name.substring(1);
            System.out.printf(
                    "%s, %s, Bo-b%s\n" + //
                    "Bo-na-na fana Fo-f%s Fee\n" + //
                    "fi Mo-%s, %s!",
                    user_name, user_name, second_string, second_string, second_string, user_name);
        }
        //----------SINGLE CONSANT----------//
        else if(first_letter_consanant)
        {
            String second_string = user_name.substring(1);
            System.out.printf(
                    "%s, %s, Bo-b%s\n" + //
                    "Bo-na-na fana Fo-f%s Fee\n" + //
                    "fi Mo-m%s, %s!",
                    user_name, user_name, second_string, second_string, second_string, user_name);
        }
        //----------SINGLE VOWEL----------//
        else if(first_letter_vowel)
        {
            String second_string = user_name.toLowerCase();
            System.out.printf(
                    "%s, %s, Bo-b%s\n" + //
                    "Bo-na-na fana Fo-fana Fee\n" + //
                    "fi Mo-m%s, %s!",
                    user_name, user_name, second_string, second_string, user_name);
        }
        else
        {
            System.out.println("Something went wrong");
        }

        System.out.println("\n\n\n");
        System.out.println("Thank you for playing, " + user_name);
    }
}
