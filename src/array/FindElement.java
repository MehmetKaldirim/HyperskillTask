package array;

import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        System.out.println("Enter " + length + " digits, iot assign into array");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("enter digit you search in array");
        int num = scanner.nextInt();
        boolean contains = false;

        for (int i = 0; i < length; i++) {
            if (num == numbers[i]) {
                contains = true;

                break;
            }


        }

        System.out.println("Is element in the array ?\n" + contains);
    }

}