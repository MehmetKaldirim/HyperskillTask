package multiDimesnsionalArray;

import java.util.Scanner;

public class SWapTheColumns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n between 1 and 100 ");
        int n = sc.nextInt();
        while (n < 0 || n > 100) {
            System.out.println("Enter n between 1 and 100 ");
            n = sc.nextInt();
        }
        System.out.println("Enter m between 1 and 100 ");
        int m = sc.nextInt();
        while (m < 0 || m > 100) {
            System.out.println("Enter m between 1 and 100 ");
            n = sc.nextInt();
        }
        int[][] twoDimArray = new int[n][m];
        int[][] newTwoDimArray = new int[n][m];
        System.out.printf("enter %d numbers", n * m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDimArray[i][j] = sc.nextInt();
                newTwoDimArray[i][j] = twoDimArray[i][j];

            }

        }
        System.out.println("Enter column num which you wanna swap");
        int a = sc.nextInt();
        int b = sc.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == a) {
                    newTwoDimArray[i][b] = twoDimArray[i][j];
                    continue;
                }
                if (j == b) {
                    newTwoDimArray[i][a] = twoDimArray[i][j];

                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(newTwoDimArray[i][j] + " ");
            }
            System.out.println();

        }

    }
}

/*Given a two-dimensional array (matrix) and the two numbers: i and j.
Swap the columns with indexes i and j within the matrix.

Input contains matrix dimensions n and m, not exceeding 100,
then the elements of the matrix, then the indexes i and j.
Sample Input 1:

3 4
11 12 13 14
21 22 23 24
31 32 33 34
0 1
Sample Output 1:

12 11 13 14
22 21 23 24
32 31 33 34
another sol
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int col = sc.nextInt();
        int loc = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int temp = matrix[i][col];
            matrix[i][col] = matrix[i][loc];
            matrix[i][loc] = temp;
        }

        for (int[] ele : matrix) {
            for (int num : ele) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


*/
