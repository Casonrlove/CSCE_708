

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
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
        calculatorGUI.setTitle("Cason's Calculator");
        calculatorGUI.setSize(600, 300); // Increased width and height
        calculatorGUI.setLocationRelativeTo(null);
        calculatorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorGUI.setVisible(true);
    }
}
