/*
 * Jackson Benge
 * CSCE 111-504
 * UIN: 329008577
 * November 16th, 2023
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// CalcViewer.java
public class CalcViewer {
    public static void main(String[] args) {
        // Create an instance of CalculatorGUI and set up the frame
        CalculatorGUI calculatorGUI = new CalculatorGUI();
        calculatorGUI.setTitle("Super Special Calculator");
        calculatorGUI.setSize(400, 250); // Increased width and height
        calculatorGUI.setLocationRelativeTo(null);
        calculatorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorGUI.setVisible(true);
    }
}
