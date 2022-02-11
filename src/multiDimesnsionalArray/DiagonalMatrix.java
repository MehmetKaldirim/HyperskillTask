package multiDimesnsionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n between 1 and 100 ");
        int n = sc.nextInt();
        while (n < 0 || n > 100) {
            System.out.println("Enter n between 1 and 100 ");
            n = sc.nextInt();
        }
        int[][] twoDimArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    twoDimArray[i][j] = 0;
                } else if (j > i) {
                    twoDimArray[i][j] = j - i;
                } else {
                    twoDimArray[i][j] = i - j;
                }
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*Given the number n, not greater than 100, create a matrix of size n×n and fill it using the following rule. Numbers 0 should be stored on the primary (main) diagonal. The two diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals should contain numbers 2; etc.

Note: the primary diagonal runs from the top left corner to the bottom right corner.
        Solution of others
        public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] intArr = new int[size][size];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = Math.abs(j - i);
            }
        }
        for (int[] a : intArr) {
            for (int b : a) {
                System.out.format("%d ", b);
            }
            System.out.println();
        }
    }
}

*/
