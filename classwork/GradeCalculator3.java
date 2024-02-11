import java.util.Scanner;

public class GradeCalculator3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System. in);
        System.out.println("Please enter your 4 test grades: ");
        double test1 = input. nextDouble();
        double test2 = input.nextDouble();
        double test3 = input.nextDouble();
        double test4 = input. nextDouble();

        double average = (test1 + test2 + test3 + test4) / 4;
        System.out.println("Your test average is " + average);

        System.out.println("Please enter you final test grade");
        double finalExam = input.nextDouble();
        double courseGrade = average * .75 + finalExam *.25;
        System.out.println("Your course grade it " + courseGrade);

        String letterGrade = "";
        int grade = (int) courseGrade / 10;
        switch (grade){
            case 10:
                
            case 9:
                letterGrade = "A";
                break;
            case 8:
                letterGrade = "B";
                break;
            case 7:
                letterGrade = "C";
                break;
            case 6:
                letterGrade = "D";
                break;
            default:
                letterGrade = "F";
                break;
        }
        System.out.println("Your course letter grade is " + letterGrade);
    }
}
