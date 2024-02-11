import java.util.Scanner;

public class output {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        int numLetters = 0;
        
        for (int k = 0; k <= userName.length() - 1; ++k) {
            if (Character.isLetter(userName.charAt(k))) {
                numLetters++;
            }
        }
        
        System.out.print("ThFreya!!ere are " + numLetters + " in your name.");
    }
}