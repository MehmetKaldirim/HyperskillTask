package multiDimesnsionalArray;

import java.util.Scanner;

public class TheStarFigur {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n between 1 and 100 ");
        int n = sc.nextInt();
        while (n < 0 || n > 15 || n % 2 == 0) {
            //System.out.println("Enter n between 1 and 100 ");
            n = sc.nextInt();
        }
        String[][] twoDimArray = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDimArray[i][j] = ".";
                if (j == i || j == n / 2 || i == n / 2 || i + j == n - 1) {
                    twoDimArray[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*Your task is to draw a star on the n×n field using the symbols . and *. n is odd and doesn't exceed 15.

To do this, you can follow the instructions:

Firstly, you need to create a two-dimensional array (matrix) from n×n elements by filling it with the . symbols. Each element of the matrix is a string containing a single symbol.
Secondly, fill the middle row of the matrix, the middle column, and the diagonals with the * symbols. As a result, all *'s in the array must form the star figure.
Thirdly, output this matrix; elements of the array should be space-separated.

Sample Output 1:

* . . . * . . . *
. * . . * . . * .
. . * . * . * . .
. . . * * * . . .
* * * * * * * * *
. . . * * * . . .
. . * . * . * . .
. * . . * . . * .
* . . . * . . . **/