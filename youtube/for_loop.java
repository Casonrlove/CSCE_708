package youtube;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //----------TAKE INPUTS----------//
        int num_of_iterations = scnr.nextInt();
        
        for(int i = 0; i <= num_of_iterations; i++)
        {
            System.out.println(i);
        }
       
    }
}
