import javax.swing.JFrame;
import java.awt.Color;

public class HistogramViewer {
    public static void main(String[] args) {

        //new frame
        JFrame appFrame = new JFrame();
        HistrogramComponent histrogramComponent = new HistrogramComponent();

        //set default location
        appFrame.setLocationRelativeTo(null);

        //set default size
        appFrame.setSize(400, 350);

        //set operation on exit
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set operation on exit
        // appFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //set title
        appFrame.setTitle("Histogram Viewer");

        //set background
        appFrame.getContentPane().setBackground(Color.white);

        //add histogram
        appFrame.add(histrogramComponent);

        //pack
        appFrame.pack();

        //make frame visisble
        appFrame.setVisible(true);

    }
}
