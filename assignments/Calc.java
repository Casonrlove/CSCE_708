/*
 * Cason Love
 * CSCE 708
 * 3/24
 */

import java.util.Scanner;

// /**
//  * Adds two string together
//  *
//  * @param num1 First number in string format
//  * @param num2 Second Number in string format
//  * @return The sum
//  */

public class Calc
{
    private String num1 = "";
    private String num2 = "";

    String num1_reversed = "";
    String num2_reversed = "";

    String final_sum = "";
    // String reversed_final_sum = "";

    int max_length;


    /******************** CLASS FUNCTIONS *********************/
    /**********************************************************/

    /********** CONSTRUCTOR **********/
    /**
     * <p>
     *      Here is the constructor
     * </p>
     * @param num1
     * @param num2
     */
    public Calc(String num1, String num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    /********** GETTERS **********/
    /**
     * <p>
     *      returns private values
     * </p>
     * @return
     */
    public String getNum1()
    {
        return num1;
    }
    public String getNum2()
    {
        return num2;
    }

    /********** SETTERS **********/
    /**
     * <p>
     *      sets the private values
     * </p>
     * @param num1
     */
    public void setNum1(String num1)
    {
        this.num1 = num1;
    }
    public void setNum2(String num2)
    {
        this.num2 = num2;
    }

    /**********PROMPT USER AGAIN **********/
    /**
     * <p>
     *      Prompts the user again for wrong input
     * </p>
     * @param wrong_num
     */
    public void request(String wrong_num)
    {
        Scanner scan2 = new Scanner(System.in);
        System.out.printf("Please reinput number %s: ", wrong_num);
        String number_one = scan2.nextLine();

        if (wrong_num.equals("num1") )
        {
            this.num1 = number_one;
        }
        else
        {
            this.num2 = number_one;
        }
    }

    /***************** END CLASS FUNCTIONS ********************/
    /**********************************************************/


    /******************* WORKING FUNCTIONS ********************/
    /**********************************************************/

    /********** VALIDATE STRING **********/
    /**
     * <p>
     *  pads the shorter string
     * </p>
     */
    public void padString() //String num1, String num2
    {
        /**
         * replace negatives at front
         * find abs of length descrepancy
         * pad smaller number with the descrepancy
         */
        // num1 = num1.replaceFirst("^0+(?!$)", "");
        // num2 = num2.replaceFirst("^0+(?!$)", "");

        this.max_length = Math.max(num1.length(), num2.length());
        int num1_padding = max_length - num1.length();
        int num2_padding = max_length - num2.length();

        num1 = "0".repeat(num1_padding) + num1;
        num2 = "0".repeat(num2_padding) + num2;
    }

    /********** VALIDATE STRING **********/
    /**
     * <p>
     * Validates the string numbers
     * </p>
     */
    public void validString()
    {
        if (num1.matches("\\d+") && num2.matches("\\d+"))
        {
            
        }
        else
        {
            System.out.println("NAN");
            
            //request new string
            if (!num1.matches("\\d+"))
            {
                request("1");
            }
            else
            {
                request("2");
            }
        }
    }
    
    /********** REVERSE STRING **********/
    /**
     * <p>
     * This function reverses the strings
     * </p>
     */
    public void reverse()
    {
        num1_reversed = "";
        num2_reversed = "";
        //num1
        for (int i = (num1.length() -1); i >= 0; i--)
        {
            num1_reversed += num1.charAt(i);
        }
        //num2
        for (int i = (num2.length() -1); i >= 0; i--)
        {
            num2_reversed += num2.charAt(i);
        }
    }

    /********** REVERSE REMAINDER **********/
    /**
     * <p>
     * This function reverses any number but I used it to reverse the final number
     * </p>
     * @param sum
     */
    public void reverseRemainder(String sum)
    {
        //num1
        for (int i = (num1.length() -1); i >= 0; i--)
        {
            this.final_sum += sum.charAt(i);
        }
    }

    /********** CHECK FOR CARRY **********/
    /**
     * <p>
     * This function implements the logic for carry in string addition
     * </p>
     * @param sum
     * @return
     */
    public int carry(int sum)
    {
        return sum / 10;
    }

    /********** CALC REMAINDER **********/
    /**
     * <p>
     * This function implements the logic for remainder in string addition
     * </p>
     * @param sum
     * @return
     */
    public int remainder(int sum)
    {
        return (sum % 10);
    }

    /********** ADD STRINGS **********/
    /**
     * <p>
     * This is the high level function that does the string addition
     * </p>
     * @return
     */
    public String addString()
    {
        /********** VALIDATE **********/
        validString();

        /********** PAD **********/
        padString();

        /********** REVERSE **********/
        reverse();

        int int1;
        int int2;
        int carry = 0;
        int sum = 0;
        String reversed_final_sum = "";

        for (int i = 0; i < this.max_length; i++)
        {
            
            char temp1 = this.num1_reversed.charAt(i);
            char temp2 = this.num2_reversed.charAt(i);

            int1 = (int) temp1 - '0';
            int2 = (int) temp2 - '0';
            sum = int1 + int2;
            
            reversed_final_sum += String.valueOf(remainder(sum + carry));
            carry = carry(sum);

        }
        if (carry == 1)
        {
            reversed_final_sum += remainder(sum + carry);
        }

        reverseRemainder(reversed_final_sum);

        return reversed_final_sum;
    }

    /***************** END WORKING FUNCTIONS ******************/
    /**********************************************************/
}
