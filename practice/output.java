public class output {
    public static void main (String[] args) {
        int x;
        int y;
        x = 10;
        y = 20;
        swap(x,y);
        System.out.println(x + ", " + y);
    }
    public static void swap(int val1, int val2) {
        int temp;
        temp = val1;
        val1 = val2;
        val2 = temp;
    }
}