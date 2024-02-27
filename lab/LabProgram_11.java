import java.util.Scanner;

/*
 * Lab 7.1 (Integer Arrays)
 * Directions:
 *    Write a program that reads a list of integers and outputs those integers in reverse. 
 *    The input begins with an integer indicating the number of integers that follow. 
 *    For coding simplicity, follow each output integer by a comma, including the last one. 
 *    Assume that the list will always contain fewer than 20 integers.
 * 
 * Ex: If the input is:
 *    5 2 4 6 8 10
 * The output is:
 *    10,8,6,4,2, 
 * 
 * To achieve the above, first read the integers into an array. Then output the array in reverse.
 */

public class LabProgram_11 {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);

        //size of array//
        int num_of_nums = scnr.nextInt();

        int[] array = new int[num_of_nums];

        //place in array//
        for(int i = 0; i < num_of_nums; i++)
        {
            array[i] = scnr.nextInt();
        }

        //reverse into string//
        for(int i = num_of_nums - 1; i >= 0; i--)
        {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
}