/*
* Lab 5.2 (Nested Loops)
* Directions:
* Write a program that takes in a line of text as input, and
outputs that line of text in reverse.
* The program repeats, ending when the user enters , , or for
the line of text.
*
* Ex: If the input is:
* Hello there
* Hey
* done
* The output is:
* ereht olleH
* yeH
*/

 import java.util.Scanner;

 public class LabProgram_8 {
    public static void main(String[] args) 
    {
       Scanner scnr = new Scanner(System.in);
       String input = scnr.nextLine();
 
       while((!input.equals("Done")) && (!input.equals("done")) && (!input.equals("d")))
       {
          for(int i = input.length()-1; i >= 0;i--)
          {
             System.out.print(input.charAt(i));
          }
          System.out.println();
          input = scnr.nextLine();
       }
    }
 }