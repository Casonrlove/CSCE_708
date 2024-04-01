/*
 * 5.(Loop): Square Matrix
 * Directions: 
 *    Given an integer, n, between 2 and 50, print a 2D square array where every value from 1 to n^2 is displayed
 * 
 * Ex: If the input is:
 *    2
 * The output is:
 *    1 2
 *    3 4
 * 
 * Ex: If the input is:
 *    5
 * The output is:
 *    1 2 3 4 5
 *    6 7 8 9 10
 *    11 12 13 14 15
 *    16 17 18 19 20
 *    21 22 23 24 25
 */

import java.util.Scanner;

public class LabProgram4_5 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int n = scanner.nextInt();

      if (n < 2 || n > 50)
      {
         System.out.println("Invalid input. Size must be between 2 and 50.");
      }
      else
      {
         int[][] matrix = SquareMatrix(n);
         printMatrix(matrix);
      }

      scanner.close();
   }

   public static int[][] SquareMatrix(int n)
   {
      int[][] matrix = new int[n][n];
      int num = 1;

      for (int i = 0; i < n; i++)
      {
         for (int j = 0; j < n; j++)
         {
            matrix[i][j] = num++;
         }
      }

      return matrix;
   }

   public static void printMatrix(int[][] matrix)
   {
      for (int i = 0; i < matrix.length; i++)
      {
         for (int j = 0; j < matrix[i].length; j++)
         {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }
}