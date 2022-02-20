package amazingNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class ThirdStep {
    static String numberString;
    static BigInteger n;

    public static void main(String[] args) {


        System.out.println(welcome());
        String numberString = getUserInput();
        n = intoBig(numberString);
        BigInteger zero =  BigInteger.ZERO;

         while (!n.equals(zero)) {//loops keep asking if the user does't input 0;

            int lastDigit = lastDigit(numberString);
            System.out.println("Properties of " + n);
            System.out.println("even: " + isEven(lastDigit));
            System.out.println("odd: " + !isEven(lastDigit));
            System.out.println("buzz: " + isBuzz(n, lastDigit));
            System.out.println("duck: " + isDuck(numberString));
            System.out.println("palindromic: " + isPalindromic(numberString));
            numberString = getUserInput();// getting new number ap to zero and exit
            n = intoBig(numberString);
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

    public static boolean isBuzz(BigInteger n, int lastDigit) {
       boolean result;
        BigInteger zero = BigInteger.valueOf(0);
        BigInteger seven = BigInteger.valueOf(7);
        BigInteger remainder = n.remainder(seven);
        result = remainder.equals(zero);
        System.out.println("Big Int result"+ remainder);
        return result || lastDigit ==7;
    }


    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Reversing to number and we are checking equality of reverse, return boolean
    private static boolean isPalindromic(String numberString) {
        String reverseNumber = "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            reverseNumber += "" + numberString.charAt(i);
        }
        return reverseNumber.equals(numberString);
    }


    private static String getStringInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    // getting user digits as string , checking number are digits and natural.
    private static String getUserInput() {

        System.out.println("Enter a request:");
        numberString = getStringInput();
        if (numberString.charAt(0) == '-') {
            System.out.println("The first parameter should be a natural number or zero.");
            getUserInput();
        } else {
            int i = numberString.length() - 1;
            // checking user input is digits or not
            while (i > 0) {
                if (numberString.charAt(i) < '0' || numberString.charAt(i) > '9') {
                    System.out.println("You should enter numbers!");
                    getUserInput();
                } else i--;
            }
        }
        return numberString;
    }

    // we re assign the string Digit to BigInteger Variable
    private static BigInteger intoBig(String number) {
        BigInteger BigNumber = BigInteger.valueOf(0);
        BigNumber = BigNumber.add(new BigInteger(number));
        System.out.println("intoBig = " + BigNumber );
        return BigNumber;

    }

    // getting last digit string and return it as int
    private static int lastDigit(String number) {
        return number.charAt(number.length() - 1) - 48;
    }
}
/*3240830673470506574(remainder 3) - 9223372036854775807(Remainder 0) -5734059856468814027(remainder 3)
package amazingNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static String numberCanavar;
    static BigInteger n;

    public static void main(String[] args) {


        System.out.println(welcome());
        // We will take user digit as string , we warn it to enter integer and natural number
        String numberString = getUserInput();
        // we take the char digit and assign them into array and then into number

        n = intoBig(numberString);
        BigInteger zero = BigInteger.valueOf(0);


        while (!n.equals(zero)) {//loops keep asking if the user does't input 0;


            int lastDigit = lastDigit(numberString);
            System.out.println("Properties of " + n);
            System.out.println("even: " + isEven(lastDigit));
            System.out.println("odd: " + !isEven(lastDigit));

            System.out.println("buzz: " + isBuzz(n, lastDigit));
            System.out.println("duck: " + isDuck(numberString));
            System.out.println("palindromic: " + isPalindromic(numberString));

            numberString = getUserInput();
            n = intoBig(numberString);

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

    public static boolean isBuzz(BigInteger n, int lastDigit) {
       boolean result;
        BigInteger zero = BigInteger.valueOf(0);
        BigInteger seven = BigInteger.valueOf(7);
        BigInteger remainder = n.remainder(seven);
        result = remainder.equals(zero);
        System.out.println("Big Int result"+ remainder);
        return result || lastDigit ==7;
    }


    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Reversing to number and we are cheicking reverse and normal is equal or not, return boolean
    private static boolean isPalindromic(String numberString) {
        String reverseNumber = "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            reverseNumber += "" + numberString.charAt(i);
        }
        return reverseNumber.equals(numberString);
    }


    private static String getStringInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    // We will take user digit as string , checking number are digits and natural.
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
            //System.out.println("First String Number"+ numberCanavar);


        }

        return numberCanavar;

    }

    // we re assign the string Digit to BigInteger Variable
    private static BigInteger intoBig(String number) {
        BigInteger BigNumber = BigInteger.valueOf(0);
        BigNumber = BigNumber.add(new BigInteger(number));
        System.out.println("intoBig = " + BigNumber );
        return BigNumber;

    }


    private static int lastDigit(String number) {
        return number.charAt(number.length() - 1) - 48;
    }


}
//3240830673470506574(remainder 3) - 9223372036854775807(Remainder 0) -5734059856468814027(remainder 3)
 */