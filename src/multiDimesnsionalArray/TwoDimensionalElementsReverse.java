package multiDimesnsionalArray;

import java.util.Arrays;

public class TwoDimensionalElementsReverse {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3,4}, {5, 6,7, 8}, {9,10, 11, 12}};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[][] arr3 = {{110, 120, 130}, {140, 150, 160}, {170, 180, 190}, {200}};

        System.out.println("Array 1= "+ Arrays.deepToString(getReverse2D(arr1)));
        System.out.println("Array 1= "+ Arrays.deepToString(getReverse2D(arr2)));
        System.out.println("Array 1= "+ Arrays.deepToString(getReverse2D(arr3)));

    }

    public static int[][] getReverse2D(int[][] arr1) {
        int [][] reversed = new int[arr1.length][];

        for (int i = 0; i < arr1.length ; i++) {
            int[] row = arr1[i];
            reversed[i] = new int[row.length];
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = arr1[i].length-1, a =0; j >=0 ; j--, a++) {
                reversed[i][a] = arr1[i][j];
            }
        }

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                arr1[i][j] = reversed[i][j];
            }
        }

        return reversed;
    }
}
