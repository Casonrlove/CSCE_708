

public class Rectangle
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle()
    {
        this.length = 2;
        this.width = 1;
    }

    /********** METHODS **********/
    public double calculateArea()
    {
        return length * width;
    }

    public double calculatePerimeter()
    {
        return 2 * (length + width);
    }

    /********** SET WIDTH **********/
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }

    /********** MAIN **********/
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(2.5, 4.5);
        Rectangle myRectangle2 = new Rectangle();

        System.out.println("Area of myRectangle: " + myRectangle.calculateArea());
        System.out.println("Area of myRectangle2: " + myRectangle2.calculateArea());

        System.out.println("Perimeter of myRectangle: " + myRectangle.calculatePerimeter());
        System.out.println("Perimeter of myRectangle2: " + myRectangle2.calculatePerimeter());

        System.out.println(myRectangle.getClass());
    }
}