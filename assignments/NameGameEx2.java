package assignments;

import java.util.Scanner;

public class NameGameEx2 
{
    public static void main(String[] args) 
    {
        
        //-----------------------Header-----------------------//
        System.out.println("The name game!\n\n\n");
        System.out.println("Come on now everybody, I said lets play a game.");
        System.out.println("I bet'cha I could make a rhyme");
        System.out.println("Out of anybody's name...\n\n\n");

        //-----------------------Scanner Name In-----------------------//
        System.out.print("What is your name? ");
        Scanner scnr = new Scanner(System.in);
        String user_name = scnr.nextLine();

        //-----------------------Check if my name-----------------------//
        if((user_name == "Cason") || (user_name == "cason"))
        {
            System.out.println("Howdy " + user_name + " thats my name too!");
        }
        else
        {
            System.out.println("Howdy " + user_name); 
        }
        
        //---------------------------Print----------------------------//
        System.out.println("Okay " + user_name + ", here is your rhyme:");

        //-----------------------Set Conditions-----------------------//
        boolean first_letter_vowel      = false;
        boolean first_letter_consanant  = false;
        boolean last_letter_vowel       = false;
        boolean last_letter_consanant   = false;
        boolean is_double_consanant     = false;
        boolean is_double_vowel         = false;

        //----------FIRST LETTER----------//
        if( (user_name.charAt(0) == 'a')    ||      (user_name.charAt(0) == 'e')    ||
            (user_name.charAt(0) == 'i')    ||      (user_name.charAt(0) == 'o')    ||
            (user_name.charAt(0) == 'u')    ||      (user_name.charAt(0) == 'a'))
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
            (user_name.charAt(1) == 'u')    ||      (user_name.charAt(1) == 'a'))
        {
            last_letter_vowel = true;
        }
        else
        {
            last_letter_consanant = true;
        }
        //--------------------Check for Doubles--------------------//
        if()


        //--------------------Condition Statements--------------------//
        //----------Single Consanant----------//
        if(1)
        {
            System.out.println(
                    "Sarah, Sarah, Bo-barah\n" + //
                    "Bo-na-na fana Fo-farah Fee\n" + //
                    "fi Mo-marah, Sarah!");
        }
        //----------Single Vowel----------//
        else if(1)
        {
            System.out.println( 
                    "Anna, Anna, Bo-banna\n" + //
                    "Bo-na-na fana Fo-fana Fee\n" + //
                    "fi Mo-manna, Anna!");
        }
        //----------Double Consanant----------//
        else if(1)
        {
            System.out.println( 
                    "Thomas, Thomas, Bo-bomas\n" + //
                    "Bo-na-na fana Fo-fomas\n" + //
                    "Fee fi Mo-momas, Thomas!");
        }
        //----------Double Vowel----------//
        else if(1)
        {
            System.out.println(
                    "Aaron, Aaron, Bo-baron\n" + //
                    "Bo-na-na fana Fo-faron\n" + //
                    "Fee fi Mo-maron, Aaron!");
        }
        //----------B as first letter----------//
        else if(1)
        {
            System.out.println(
                    "Bob, Bob, Bo-ob Bo-na-\n" + //
                    "na fana Fo-fob Fee fi\n" + //
                    "Mo-mob, Bob!");
        }
        //----------F as first letter----------//
        else if(1)
        {
            System.out.println(
                    "Felix, Felix, Bo-belix\n" + //
                    "Bo-na-na fana Fo-elix Fee\n" + //
                    "fi Mo-melix, Felix!");
        }
        //----------M as first letter----------//
        else
        {
            System.out.println(
                    "Mary, Mary, Bo-bary\n" + //
                    "Bo-na-na fana Fo-fary Fee\n" + //
                    "fi Mo-ary, Mary!");
        }




    }
}
