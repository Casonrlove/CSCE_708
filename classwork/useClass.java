/*
 * CL
 * Class examples
 * useClass
 */

public class useClass {
    public static void main(String[] args) 
    {
        Car myCar = new Car("ford", "F150", 2015);
        myCar.displayInfo();

        Rectangle myRectangle = new Rectangle(44.25,55.9);
        myRectangle.setWidth(2.0);
        System.out.println("The area of the rectangle is: " + myRectangle.calculateArea());
    }
}