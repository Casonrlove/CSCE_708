public class vars {
    public static void main(String[] args) {
        byte b = 125;
        System.out.println("b = " + b);

        b++;
        System.out.println("b = " + b);

        b++;
        System.out.println("b = " + b);

        b++;
        System.out.println("b = " + b);

        int i = 5;
        int j = 5;
        System.out.println("i = " + i + ", j = " + j);
        System.out.println("i*j = " + i*j);
        System.out.println("i/j = " + i/j);
        System.out.println("i%j = " + i%j);

        double a=5, d=2;
        System.out.println("a / d = " + (a/d));

        double pi = 3.14;
        System.out.println("pi = " + pi);

        char c = 'C';
        System.out.println("c = " + c);
        c++;
        System.out.println("c = " + c);
        System.out.println("c = " + (int)c);

        boolean q = true;
        System.out.println("q = " + q);
        q = (c == 'E');
        System.out.println("q = " + q);

        String name = "Cason";
        System.out.println("My name is " + name);
        System.out.println("My name has " + name.length() + " letters.");

        System.out.printf("My name is %s. \nIn all caps it is %S.\n", name, name);

        System.out.printf("I have $%6.4f.%n", pi);

        int k = 4;
        System.out.println("k = " + ++k);
        System.out.println("k = " + k++);

        System.out.println("Pi = " + Math.PI);
        System.out.println("My random number is " + Math.random());
        System.out.println("My number between 1-100 is " + (1+ (int)(Math.random() *100)));
        System.out.println("My dice roll is " + (1+ (int)(Math.random() * 6)));
    }
}
