import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Graphics;
import javax.swing.JComponent;

public class HistrogramComponent extends JComponent{
    
    //paint histogram bins
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D graphicsObject = (Graphics2D) g;
        
        //Draw bin 1 as an olive green rectangle at 10, 10
        //with a widt of 200 and height of 50
        Rectangle binRectangle1 = new Rectangle(10, 10, 200, 50);
        Color binColor1 = new Color(128, 128, 0);
        graphicsObject.setColor(binColor1);
        graphicsObject.fill(binRectangle1);


        //Draw bin 2 as an maroon rectangle at 10, 75
        //with a widt of 200 and height of 50
        Rectangle binRectangle2 = new Rectangle(10, 75, 350, 50);
        Color binColor2 = new Color(88, 0, 0);
        graphicsObject.setColor(binColor2);
        graphicsObject.fill(binRectangle2);

        //Draw bin 3 as an olive green rectangle at 10, 140
        //with a widt of 150 and height of 50
        Rectangle binRectangle3 = new Rectangle(10, 140, 150, 50);
        Color binColor3 = new Color(20, 28, 220);
        graphicsObject.setColor(binColor3);
        graphicsObject.fill(binRectangle3);
    }
}
