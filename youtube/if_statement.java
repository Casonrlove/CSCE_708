package youtube;

import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //----------TAKE INPUTS----------//
        int menu_choice = scnr.nextInt();
        int discount = 0;

        
        if(menu_choice == 1)
        {
            discount = 10;
        }
        else if(menu_choice == 2)
        {
            discount = 20;
        }
        else if(menu_choice == 3)
        {
            discount = 30;
        }
    }
}
