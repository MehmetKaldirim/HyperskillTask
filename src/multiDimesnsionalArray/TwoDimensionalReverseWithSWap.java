package multiDimesnsionalArray;

import java.util.Arrays;

public class TwoDimensionalReverseWithSWap {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[][] arr3 = {{110, 120, 130}, {140, 150, 160}, {170, 180, 190}, {200}};

        System.out.println("Array 1= "+ Arrays.deepToString(reverseElements(arr1)));
        System.out.println("Array 1= "+ Arrays.deepToString(reverseElements(arr2)));
        System.out.println("Array 1= "+ Arrays.deepToString(reverseElements(arr3)));
    }


    public static int[][] reverseElements(int[][] twoDimArray) {
        // write your code here

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length / 2; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length - 1 - j];
                twoDimArray[i][twoDimArray[i].length - 1 - j] = temp;
            }
        }
        return twoDimArray;
    }

}

