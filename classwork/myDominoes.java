public class myDominoes {
    public static void main(String[] args) {
        int size = 6;
        for(int i=0; i<=size; i++)
        {
            for (int j = i ; j <= size; j++) {
               System.out.print(i + " | " + j); 

            }
            System.out.println();
        }
    }
}
