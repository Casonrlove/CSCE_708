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

public class CalculatorGUI extends JFrame implements ActionListener {
    private JLabel introLabel, labelNum1, labelNum2, labelResult;
    private JTextField textField1, textField2, resultField;
    private JButton calculateButton, clearButton;

    // constructor
    public CalculatorGUI() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // intro label
        introLabel = new JLabel("Howdy! Enter two numbers and click 'Calculate'.");
        introLabel.setFont(new Font("Arial", Font.BOLD, 12));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.insets = new Insets(10, 0, 10, 0);
        add(introLabel, c);

        // labels
        labelNum1 = new JLabel("Number 1:");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.insets = new Insets(0, 0, 0, 0);
        add(labelNum1, c);

        labelNum2 = new JLabel("Number 2:");
        c.gridx = 1;
        c.gridy = 1;
        add(labelNum2, c);

        // text fields
        textField1 = new JTextField(10);
        c.gridx = 0;
        c.gridy = 2;
        add(textField1, c);

        textField2 = new JTextField(10);
        c.gridx = 1;
        c.gridy = 2;
        add(textField2, c);

        // buttons
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        c.gridx = 0;
        c.gridy = 3;
        add(calculateButton, c);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        c.gridx = 1;
        c.gridy = 3;
        add(clearButton, c);

        // result label
        labelResult = new JLabel("Result:");
        c.gridx = 0;
        c.gridy = 4;
        add(labelResult, c);

        // result field
        resultField = new JTextField(20);
        resultField.setEditable(false);
        c.gridx = 1;
        c.gridy = 4;
        add(resultField, c);
    }

    // handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            String result = Calc.addString(textField1.getText(), textField2.getText()); // send to calc class
            resultField.setText(result); // set result field
        } else if (e.getSource() == clearButton) {
            // reset fields
            textField1.setText("");
            textField2.setText("");
            resultField.setText("");
        }
    }
}
