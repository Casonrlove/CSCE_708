/*
 * 3.(Array): createArray
 * Directions: 
 *    Create an int array the size of the user’s input. Enter n values in the array as follows: 0, 2, 4, 6, 8, ... 
 *    (n) being the user’s input. If the user inputs 0, print “empty”, otherwise print the newly created array.
 * 
 * Ex: If the input is:
 *    2
 * The output is:
 *    0 2
 * 
 * Ex: If the input is:
 *    0
 * The output is:
 *    empty
 * 
 * Ex: If the input is:
 *    9
 * The output is:
 *    0 2 4 6 8 10 12 14 16
 */

import java.util.Scanner;

public class LabProgram4_3 {
   
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        String output = "";
        if(num == 0)
        {
            output = "empty";
        }

        int counter = 0;
        for (int i = 0; i < num; i++)
        {
            output += 
        }
        System.out.println(output);
    }
}
