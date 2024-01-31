import java.util.Scanner;

/**
 * Cason Love
 * CSCE 708
 * printing example
 */

public class printing 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello");

        Scanner input = new Scanner(System.in);

        System.out.println("Hi, what is your name? ");
        String name = input.nextLine();

        System.out.println("Howdy " + name +"!");
    }
}