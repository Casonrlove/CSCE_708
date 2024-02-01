

/**
 * Cason Love
 * CSCE 708
 * names example
 */

public class names {
    public static void main(String[] args) {
        String first_name = "Cason";
        String last_name = "Love";
        System.out.println("My name is " + first_name + " " + last_name + ".");
        System.out.printf("My name is %s %s.\n", first_name, last_name);

        boolean same;
        same = (first_name == last_name);
        System.out.println("Are the names the same? " + same);
        last_name = first_name;
        same = (first_name == last_name);
        System.out.println("Are the names the same? " + same);

        last_name = "Rob";
        last_name += "ert";
        System.out.println("The new Iname is " +last_name );
        same = (first_name == last_name);
        System.out.println("Are the names the same with =? " + same);
        System.out.println("Are the names the same with .equals? " + first_name.equals(last_name));
    }
}
