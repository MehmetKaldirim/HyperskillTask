package array;

import java.util.Arrays;

public class IntroToArray {
    public static void main(String[] args) {


        int size = 10;
        char[] characters = new char[size];

        // It takes an array, start index, end index (exclusive) and the value for filling the array
        Arrays.fill(characters, 0, size / 2, 'A');
        Arrays.fill(characters, size / 2, size, 'B');

        System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]

    }
}