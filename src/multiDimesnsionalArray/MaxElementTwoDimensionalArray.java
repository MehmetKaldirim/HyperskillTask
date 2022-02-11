package multiDimesnsionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElementTwoDimensionalArray {
    public static void main(String[] args) {

        int maxRowIndex = 0;
        int maxColumnIndex = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] twoDimArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                twoDimArray[i][j] = sc.nextInt();
                if (i == 0 && j == 0){
                    max = twoDimArray[i][j];
                    continue;
                }

                if(max < twoDimArray[i][j]){
                    max = twoDimArray[i][j];
                    maxRowIndex = i;
                    maxColumnIndex = j;
                }
            }
        }
        sc.close();
        System.out.println(maxRowIndex + " " + maxColumnIndex);
        System.out.println("-----------------------------------------");
        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));

        }

    }
}
/*On the input, the program receives the size of matrix n and m,
and then n lines having m integer numbers in each. n and m do not exceed 100.

Output data format

Output two numbers: the row index and the column index,
in which the greatest item in the two-dimensional array (matrix) is located.
If there are several such elements, output the one, which has the smaller row index;
and if row indexes are the same, output the one having the smaller column index.*/