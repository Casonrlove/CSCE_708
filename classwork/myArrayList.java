import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList<String> myCars = new ArrayList<>();

        System.out.println("I have had " + myCars.size() + " cars before.");

        myCars.add("Olds 88");

        System.out.println("I have had " + myCars.size() + " cars before.");

        myCars.add("VW fastback");
        myCars.add("Dodge Colt");
        myCars.add("Datsun 240Z");
        myCars.add("Alfa Romeo");
        myCars.add("Thunderbird");
        myCars.add("Ford Ranger");
        myCars.add("Dodge Ram");
        myCars.add("F250");
        System.out.println("I have had " + myCars.size() + " cars before.");


        String [] ourCars = new String[]{"Flex", "F150", "F150", "F150", "Bronco", "BMW vert", "subaru"};

        String[] yourCars = ourCars;

        
        System.out.println(ourCars);
        System.out.println(myCars);
        System.out.println(myCars.get(2));

        myCars.remove(2);
        System.out.println(myCars);

    }
}