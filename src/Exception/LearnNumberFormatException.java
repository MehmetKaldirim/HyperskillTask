package Exception;

import java.util.Scanner;

public class LearnNumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number please: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.matches("\\d+")) { // it checks if the input line contains only digits
            int number = Integer.parseInt(input);// NumberFormatException – if the string does not contain a parsable integer.
            System.out.println(number + 1);
        } else {
            System.out.println("Incorrect number: " + input);
        }
    }
}
