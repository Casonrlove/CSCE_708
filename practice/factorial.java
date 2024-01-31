import java.util.Scanner;

public class factorial 
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please input for factorial: ");
        int var = scnr.nextInt();

        int mult = 1;
        for(int i= var; i>0; i--)
        {
            mult *= i;
        }

        System.out.println("The factorial of " + var + " equals " + mult);
    }
}
