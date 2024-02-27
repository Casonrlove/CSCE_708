

public class my2DArray {
    public static void main(String[] args) {
        String [] myTAs = new String[]{"TA", "Hannah", "Nikki", "Haley", "Xingyu", "Nikki"};
        String[] myTAMajors = new String[]{"Major", "Math", "Math", "CS", "Stat", "CS"};

        String[] myTable1 = new String[]{"Table 1", "Roz", "Gabby", "Sophia"};
        String[] myTable2 = new String[]{"Table 2", "Sam", "Cason", " Savanah"};
        String[] myTable3 = new String[]{"Table 3", "Bryan", "Bryce"};

        String[][] myClass = new String[][]{myTAs, myTAMajors, myTable1, myTable2, myTable3};

        for (String[] tables : myClass) 
        {
            for (String student : tables) 
            {
                System.out.print(student + "\t");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        // normal for loop//
        for(int i = 0; i < myClass.length; i++)
        {
            for(int j = 0; j < myClass[i].length; j++)
            {
                System.out.print(myClass[i][j] + '\t');
            }
            System.out.println();
        }
    }
}
