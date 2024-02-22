package youtube;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //----------TAKE INPUT----------//
        int exit_var = scnr.nextInt();
        
        while(exit_var != 0)
        {
            System.out.println("Your number is: " + exit_var);
            exit_var = scnr.nextInt();
        }
    }
}
