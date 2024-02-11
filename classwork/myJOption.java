/*
 * Cason Love
 * CSCE 708
 * 
 */

import javax.swing.JOptionPane;

public class myJOption {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the simple calculator");

        String input1 = JOptionPane.showInputDialog(null, "Enter the first number");
        String input2 = JOptionPane.showInputDialog(null, "Enter the second number");

        double number1 = Double.parseDouble(input1);
        double number2 = Double.parseDouble(input2);

        double product = number1 * number2;
        String message = String.format("The product of %.2f an %.2f is %.2f", number1, number2, product);
        JOptionPane.showMessageDialog(null, message);
    }
}
