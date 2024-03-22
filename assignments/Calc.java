public class Calc 
{
    private String num1;
    private String num2;

    /********** DEFAULT CONSTRUCTOR **********/
    // public calc(String num1, String num2)
    // {

    // }

    /********** CHECK FOR NUM **********/
    public void check_if_num(String num1, String num2)
    {
        return;
    }

    /********** PAD **********/
    public void pad(String num1, String num2)
    {
        /********** PAD STRING ON LEFT **********/
        String num3;
        int descrepancy = num1.length() - num2.length();

        if(num1.length() > num2.length())
        {
            for (int i = 0; i < num1.length(); i++) 
            {
                num3 = "0";
            }
            for (int i = 0; i < num1.length(); i++) 
            {
                
            }

        }
        else if (num2.length() > num1.length()) 
        {
            
        } 
        else 
        {
            return;
        }
    }

    /********** REVERSE STRING **********/

}
