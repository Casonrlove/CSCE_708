/*
 * CL
 * Class examples
 * useClass
 */

public class useClass {
    public static void main(String[] args)
    {
        Control.clear();
        Car myCar = new Car("ford", "F150", 2015);
        

        Control.sleep(5);
        Control.beeping();
        myCar.displayInfo();
        Rectangle myRectangle = new Rectangle(44.25,55.9);
        myRectangle.setWidth(2.0);
        System.out.println("The area of the rectangle is: " + myRectangle.calculateArea());
    }
}