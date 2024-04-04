import java.awt.Color;

import javax.swing.JFrame;

public class EmptyFrame {
    public static void main(String[] args) {

        //new frame
        JFrame appFrame = new JFrame();

        //set default location
        appFrame.setLocationRelativeTo(null);

        //set default size
        appFrame.setSize(1600, 800);

        //make frame visisble
        appFrame.setVisible(true);

        //set operation on exit
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set operation on exit
        // appFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //set title
        appFrame.setTitle("Cason's Frame");

        //set background
        appFrame.getContentPane().setBackground(Color.CYAN);

        
    }
}
