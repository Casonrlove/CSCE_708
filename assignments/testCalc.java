/*
 * Cason Love
 * CSCE 708
 * 3/24
 */

/******************** HELPER FUNCTIONS ********************/
/**********************************************************/
public class testCalc
{
    public static void main(String[] args) {
        String test1 = "12378";
        String test2 = "456";

        Calc myCalculator = new Calc(test1, test2);

        /********** TEST PADDING **********/
        myCalculator.padString();

        System.out.println("-"+ myCalculator.getNum1() +"-");
        System.out.println("-"+ myCalculator.getNum2() +"-");

        /********** TEST VALIDATE STRING **********/
        // myCalculator.setNum1("1234567");
        // myCalculator.setNum2("1234");

        // System.out.println("Num1 & Num2 are numbers = " + myCalculator.validString());

        /********** TEST REVERSE STRING **********/
        myCalculator.reverse();

        System.out.println("num1 reversed = " + myCalculator.num1_reversed);
        System.out.println("num2 reversed = " + myCalculator.num2_reversed);

        /********** TEST ADD **********/
        myCalculator.setNum1("");
        myCalculator.setNum2("");

        myCalculator.setNum1("12345678910111213141516");
        myCalculator.setNum2("12345678910111213141516");
        // myCalculator.setNum2("1111");
        myCalculator.padString();
        myCalculator.addString();

        System.out.println("num1 reversed = " + myCalculator.num1_reversed);
        System.out.println("num2 reversed = " + myCalculator.num2_reversed);
        System.out.println("Final Sum = " + myCalculator.final_sum);
        System.out.println("dog");
    }
}
