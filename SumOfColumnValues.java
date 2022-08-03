// Take 2D matrix A of size N X M as an input and print M integers denoting the column-wise sum of each of the M columns.
// Print M space-separated integers where each denoting the column-wisw sum of A.
// Input:
//  3 4
//  3 2 1 3
//  1 2 3 4
//  4 3 1 2
//Output:
// 8 7 5 9

import java.util.*;

public class SumOfColumnValues {
    private static int[] printColSum(int[][] matrix){
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] colSum = new int[numCols];
        for(int i = 0; i < numCols; i++) {
            int sum = 0;
            for(int j = 0; j < numRows; j++)
                sum += matrix[j][i];
            colSum[i] = sum;
        }
        return colSum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int[] colSum = printColSum(array);
        for(int i: colSum)
            System.out.print(i + " ");
        sc.close();
    }
}