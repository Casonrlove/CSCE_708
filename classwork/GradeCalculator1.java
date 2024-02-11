import java.util.Scanner;

public class GradeCalculator1 {
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

        String letterGrade = "F";
        if (courseGrade >= 190) {
            letterGrade = "A";
        }
        if (courseGrade > 80 && courseGrade < 89){
            letterGrade = "B";
        }
        if(courseGrade > 70 && courseGrade < 79){
             letterGrade = "C";
        }
        if(courseGrade > 60 && courseGrade < 69){
            letterGrade = "D";
        }
        letterGrade = "D";
        System.out.println("Your course letter grade is " + letterGrade);
    }
}
