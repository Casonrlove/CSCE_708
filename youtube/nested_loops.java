package youtube;

import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //----------TAKE INPUT----------//
        int exit_var = scnr.nextInt();

        for(int i = 0; i < exit_var; i++)
        {
            for(int j = 0; j < exit_var; j++)
            {
                System.out.println("i is: " + i +" j is: " + j);
            }
        }
    }
}
