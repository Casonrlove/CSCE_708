
public class Calc {

    /**
     * Adds two strings representing numbers and returns the result as a string.
     * This method handles input validation, leading zeros, and performs digit-wise
     * addition. If either input is not a numeric string, it returns "NAN".
     *
     * @param num1 The first input string.
     * @param num2 The second input string.
     * @return The sum of the input strings.
     * @throws IllegalArgumentException If either input is not a numeric string.
     */
    public static String addString(String num1, String num2) {
        if (!isNumeric(num1) || !isNumeric(num2)) {
            return "NAN";
        }

        // Remove leading zeros
        num1 = num1.replaceFirst("^0+(?!$)", "");
        num2 = num2.replaceFirst("^0+(?!$)", "");

        // Find the maximum length of the two strings
        int maxLength = Math.max(num1.length(), num2.length());

        // Pad the strings with leading zeros
        int num1Padding = maxLength - num1.length();
        int num2Padding = maxLength - num2.length();
        num1 = "0".repeat(num1Padding) + num1;
        num2 = "0".repeat(num2Padding) + num2;

        // Calculate the sum digit-wise
        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int digit1 = num1.charAt(num1.length() - 1 - i) - '0';
            int digit2 = num2.charAt(num2.length() - 1 - i) - '0';

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int remainder = sum % 10;

            result.insert(0, (char) ('0' + remainder));
        }

        // Check for a final carry
        if (carry > 0) {
            result.insert(0, (char) ('0' + carry));
        }

        return result.toString();
    }

    /**
     * Checks if the provided string is numeric, i.e., it consists entirely of
     * digit characters.
     *
     * @param num The input string to be checked for numeric content.
     * @return {@code true} if the entire string is numeric, {@code false}
     *         otherwise.
     */
    public static boolean isNumeric(String num) {
        return num.matches("\\d+");
    }
}
