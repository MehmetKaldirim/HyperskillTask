package amazingNumbers;

import java.util.Scanner;


public class thirdTry {
    static String numberCanavar;
    public static void main(String[] args) {

        int n;
        System.out.println(welcome());
        // We will take user digit as string , we warn it to enter integer and natural number
        String numberString = getUserInput();
        // we take the char digit and assign them into array and then into number

        n = convertStringToNumber(intoArray(numberString));
        while (n != 0) {//loops keep asking if the user does't input 0;
            System.out.println("Properties of " + n);
            System.out.println("even: " + isEven(n));
            System.out.println("odd: " + !isEven(n));
            System.out.println("buzz: " + isBuzz(n));
            System.out.println("duck: " + isDuck(numberString));
            System.out.println("palindromic: " + isPalindromic(numberString));
            numberString = getUserInput();
            n = convertStringToNumber(intoArray(numberString));
        }
        System.out.println("Goodbye!");
    }

    public static String welcome() {
        String welcome = String.format("Welcome to Amazing Numbers!%n" +
                "Supported requests:%n" +
                "- enter a natural number to know its properties;%n" +
                "- enter 0 to exit.");
        return welcome;
    }


    public static boolean isDuck(String number) {
        return number.contains("0");
    }

    public static boolean isBuzz(int n) {
        return n % 10 == 7 || n % 7 == 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


    private static boolean isPalindromic(String number) {
        String reverseNumber = "";

        for (int i = number.length()-1; i >= 0; i--) {
            reverseNumber += ""+ number.charAt(i);

        }

        return reverseNumber.equals(number);
    }


    private static String getStringInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    // We will take user digit as string , we warn it to enter integer and natural numbers.
    private static String getUserInput() {

        System.out.println("Enter a request:");
        numberCanavar = getStringInput();



        if (numberCanavar.charAt(0) == '-') {
            System.out.println("The first parameter should be a natural number or zero.");

            getUserInput();
        } else {
            int i = numberCanavar.length() - 1;
            // we will check user input is digit or not
            while (i > 0) {
                if (numberCanavar.charAt(i) < '0' || numberCanavar.charAt(i) > '9') {
                    System.out.println("You should enter numbers!");
                    getUserInput();
                } else i--;
            }



        }

        return numberCanavar;

    }
    // we will split user string digit and  assign them into array
    private static int[] intoArray(String number) {


        int length = number.length();
        int numbers[] = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = number.charAt(i) - 48;
        }
        return numbers;
    }

    //we will teke the digit from array and assign them an integer variable
    private static int convertStringToNumber(int[] numbers) {
        int i = numbers.length - 1;
        int j = 0;
        int number = 0;
        while (i >= 0) {
            number += (int) numbers[i] * Math.pow(10, j);

            i--;
            j++;
        }
        return number;

    }
}

