

public class Car
{
    String make;
    String model;
    int year;
    static int count = 0;

    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        count++;
    }

    public void displayInfo()
    {
        System.out.println("Make:  " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year:  " + this.year);
        System.out.println("Count:  " + this.count);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Chevrolet", "Duramax", 2023);

        myCar.displayInfo();

    }
}