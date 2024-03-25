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
        // System.out.println("\n\n**********START CALCULATOR**********");
        System.out.println("Welcome to the String Calculator");
        

        Scanner scnr = new Scanner(System.in);

        /********** INPUTS **********/
        System.out.println("Enter Your First Number: ");
        String number_one = scnr.nextLine();
        System.out.println("Enter Your Second Number: ");
        String number_two = scnr.nextLine();

        Calc mainCalc = new Calc(number_one, number_two);
        // Calc calc2 = new Calc(number_one, number_two);

        mainCalc.addString();

        System.out.println("Sum: " + mainCalc.final_sum);

        // System.out.println("\n\n*********END OF THE CALCULATOR**********");
    }
}
