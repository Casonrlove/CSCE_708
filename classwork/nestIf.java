import java.util.Scanner;

public class nestIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b){
            System.out.println("We are in the first if");
            if(b>c){
                System.out.println("we are in the second if");
            }
        }
        System.out.println("We are done.");
    }
}
