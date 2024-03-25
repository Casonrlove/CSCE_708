/*
 * Cason Love
 * CSCE 708
 * 3/24
 */

import java.util.Scanner;

public class CalcDriver
{
    public static void main(String[] args)
    {
        /********** GREETING **********/
        System.out.println("\n\n**********START CALCULATOR**********");

        Scanner scnr = new Scanner(System.in);

        /********** INPUTS **********/
        System.out.print("\nPlease input the first number: ");
        String number_one = scnr.nextLine();
        System.out.print("\nPlease input the first number: ");
        String number_two = scnr.nextLine();

        Calc mainCalc = new Calc(number_one, number_two);

        mainCalc.addString();

        System.out.println("\nThe summation is equal to " + mainCalc.final_sum);

        System.out.println("\n\n*********END OF THE CALCULATOR**********");
    }
}
